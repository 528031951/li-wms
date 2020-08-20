package com.bpm.gd.wms.outbound.server.gddomain;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @Author Super Young
 * @Date 2020/7/27 9:55
 */
@Data
@ApiModel(description = "发料/退料单回传头")
public class GDMaterialOrderHead {

    /**企业编号 */
    private Integer sfdaent;

    /**营业据点 */
    private String sfdasite;

    /**单据日期 */
    private String sfdadocdt;

    //发退料类别 11.成套发料,12.超领,13.欠料补料,14.倒扣领料,15.委外发料,16.重复性生产发料,21.成套退料,22.超领退料,23.一般退料,24.倒扣退料
    private String sfda002;

    /**生产部门 */
    private String sfda003;

    /**申请人 */
    private String sfda004;

    /**来源单号 WMS单号 */
    private String sfda014;

    /**来源类型 09 */
    private String sfda015;

    /**单据拥有者 */
    private String sfdaownid;

    /**单据拥有部门 */
    private String sfdaowndp;

    /**单据创建者 */
    private String sfdacrtid;

    /**单据创建部门 */
    private String sfdacrtdp;

    /**单据创建日期 */
    private String sfdacrtdt;

    /**单据修改者 */
    private String sfdamodid;

    /**单据修改日 */
    private String sfdamoddt;

    /**默认0 */
    private String sfdaud001;

    /**工单单号 */
    private String sfdb001;

    /**runid 0 */
    private String sfdb002;

    /**正负 发料-1 退料1	 */
    private String sfdb008;

    /**班别 */
    private String sfdbud001;

    /**成本中心 =产线	 */
    private String sfdbud002;

    /**备注 */
    private String sfdbud003;

    /**生产批号 */
    private String sfdbud004;

    /**料废否 Y/N */
    private String materialwaste;

}
