package com.bpm.gd.wms.outbound.server.service;


import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.QueryWorkOderWebDTO;

import java.math.BigDecimal;

/**
 * 产品工单备料Service
 */
public interface ProductionPreparationService {

    /**
     * 根据用户ID查询工单信息
     * @param userId
     * @return
     */
    ResultVO selectWorkOrderListByUserId(Integer userId);

    /**
     * 根据工单ID和用户ID查询物料信息以及推荐流利架储位
     * @param workOrderId
     * @return
     */
    ResultVO selectOrderMaterialListByWorkOrderId(Integer workOrderId, Integer userId);

    /**
     * 提交扫描的物料
     * @param workOrderId 工单ID
     * @param boxCode 扫描的序列号
     * @param type 序列号类型（0：外包装，1：内包装，2：余料）
     * @param strorageCode 储位编号
     * @param userId 用户ID
     * @param accurateQuantity 精准拣货数量
     * @return
     */
    ResultVO submitOutBoundMaterial(Integer workOrderId, String boxCode, Integer type, String strorageCode, Integer userId, BigDecimal accurateQuantity);


    /**
     * 扫描小包装或箱子上的序列号
     * @param boxCode
     * @param workOrderId
     * @return
     */
    ResultVO scanBoxCode(String boxCode, Integer workOrderId);


    /**
     * 向T100提交出库
     * @param workOrderId
     * @param userId
     * @return
     */
    ResultVO submitOutBound(Integer workOrderId, Integer userId);

    /**
     * 查询工单列表信息（WEB端）
     * @param workOrderCode
     * @param state
     * @param lineCode
     * @return
     */
    ResultVO selectWorkOrderList(String workOrderCode, Integer state, String lineCode);


    /**
     * 条件查询所有工单信息
     * @param queryWorkOderWebDTO

     * @return
     */
    ResultVO selectWorkOrderListAll(QueryWorkOderWebDTO queryWorkOderWebDTO);

    /**
     * 根据工单号查询工单物料信息
     * @param queryWorkOderWebDTO
     * @return
     */
    ResultVO selectWorkBomByWorkOrderId(QueryWorkOderWebDTO queryWorkOderWebDTO);
}
