package com.bpm.gd.wms.outbound.server.util;

import cn.hutool.core.util.ReflectUtil;
import com.bpm.log.client.LogClient;
import com.bpm.log.common.dto.LogDTO;
import com.bpm.log.common.enums.LogTypeEnum;
import io.swagger.annotations.ApiModel;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


@Aspect
@Component
@ApiModel(description = "日志Aop工具类")
public class LogAopUtil {

    @Autowired
    private LogClient logClient;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Value("${rule.service-name:服务名未配置}")
    private String logModular;
    @Value("${rule.log.enable:true}")
    private boolean enable;

    //规避多线程访问出现线程不安全
    private static final ThreadLocal<LogDTO> THREAD_LOCAL = new ThreadLocal();

    @Pointcut("execution(* com.bpm.*.server.controller..*(..))")//切入点描述 这个是controller包的切入点
    public void controllerMethodPointcut() {}//签名，可以理解成这个切入点的一个名称

    /**
     * 方法执行前
     * @param point
     */
    @Before("controllerMethodPointcut()")
    public void before(JoinPoint point) {
        if(this.enable){
            this.addLog(point);
        }
    }

    private void addLog(JoinPoint point) {
        LogDTO logEntity = new LogDTO();
        THREAD_LOCAL.set(logEntity);
//        MethodSignature signature = (MethodSignature)point.getSignature();
        logEntity.setLogModular(this.logModular);
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes)ra;
        HttpServletRequest httpServletRequest = sra.getRequest();
        String token = httpServletRequest.getHeader("token");
        if (token != null) {
            String userIdStr = (String)this.stringRedisTemplate.opsForValue().get(String.format("auth_%s", token));
            logEntity.setLogUserName(userIdStr);
        }
        Method m = ((MethodSignature)point.getSignature()).getMethod();
        if (point.getThis().getClass() != point.getTarget().getClass()) {
            m = ReflectUtil.getMethod(point.getTarget().getClass(), m.getName(), m.getParameterTypes());
        }
        LocalVariableTableParameterNameDiscoverer paramNames = new LocalVariableTableParameterNameDiscoverer();
        String[] parameterNames = paramNames.getParameterNames(m);
        Object[] args = point.getArgs();
        Map<String, Object> params = new HashMap();
        assert parameterNames != null;
        for(int i = 0; i < parameterNames.length; ++i) {
            params.put(parameterNames[i], args[i]);
        }
        logEntity.setLogParameter(params.toString());
        logEntity.setLogAddress(httpServletRequest.getRequestURI());
    }

    @AfterReturning(
            value = "controllerMethodPointcut()",
            returning = "rtv"
    )
    public void after(JoinPoint point, Object rtv) {
        if (this.enable) {
            LogDTO log = (LogDTO)THREAD_LOCAL.get();
            log.setLogType(LogTypeEnum.SUCCESS.getCode());

            try {
                this.logClient.logRecord(log);
            } catch (Exception var5) {
                var5.printStackTrace();
            }

            THREAD_LOCAL.remove();
        }
    }


    @AfterThrowing(
            value = "controllerMethodPointcut()",
            throwing = "throwing"
    )
    public void error(Throwable throwing) {
        if (this.enable) {
            LogDTO log = (LogDTO)THREAD_LOCAL.get();

            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Throwable var4 = null;

                try {
                    throwing.printStackTrace(new PrintStream(byteArrayOutputStream));
                    log.setExceptionMessage(byteArrayOutputStream.toString());
                } catch (Throwable var16) {
                    var4 = var16;
                    throw var16;
                } finally {
                    if (byteArrayOutputStream != null) {
                        if (var4 != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable var15) {
                                var4.addSuppressed(var15);
                            }
                        } else {
                            byteArrayOutputStream.close();
                        }
                    }

                }
            } catch (IOException var18) {
                var18.printStackTrace();
            }

            log.setLogType(LogTypeEnum.ERROR.getCode());

            try {
                this.logClient.logRecord(log);
            } catch (Exception var14) {
                var14.printStackTrace();
            }

            THREAD_LOCAL.remove();
        }
    }
}
