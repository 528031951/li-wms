package com.bpm.gd.wms.outbound.server.service;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.MaterialWasteDTO;
import com.bpm.gd.wms.outbound.server.dto.QueryWorkOderWebDTO;

import java.math.BigDecimal;
import java.util.List;

public interface MaterialSupplementService {

    /**
     * 从MES系统中接收工单的料废信息
     * @param list
     */
    ResultVO receiveMaterialWasteList(List<MaterialWasteDTO> list);

    /**
     * 根据用户ID查询工单信息
     * @param userId
     * @return
     */
    ResultVO selectWorkOrderListByUserId(Integer userId);

    /**
     * 根据补料单号查询物料信息以及推荐流利架储位
     * @param supplementCode
     * @return
     */
    ResultVO selectMaterialListBySupplementCode(String supplementCode);

    /**
     * 扫描小包装或箱子上的序列号
     * @param boxCode
     * @param supplementCode
     * @return
     */
    ResultVO scanBoxCode(String boxCode, String supplementCode);

    /**
     * 提交扫描的物料
     * @param supplementCode 补料单号
     * @param boxCode 扫描的序列号
     * @param type 序列号类型（0：外包装，1：内包装，2：余料）
     * @param storageCode 储位编号
     * @param userId 用户ID
     * @param accurateQuantity 精准拣料数量
     * @return
     */
    ResultVO submitSupplementMaterial(String supplementCode, String boxCode, Integer type, String storageCode, Integer userId, BigDecimal accurateQuantity);

    /**
     * 根据扫描的批次号，查询物料信息
     * @param workOrderCode
     * @param scanValue
     * @return
     */
    BigDecimal selectMaterialInfoByScanvalue(String workOrderCode, String scanValue);

    /**
     * 条件查询所有补料工单信息
     * @param queryWorkOderWebDTO
     * @return
     */
    ResultVO selectWorkOrderMaterialSupplementAll(QueryWorkOderWebDTO queryWorkOderWebDTO);

    /**
     * 根据补料工单号查询补料工单物料信息
     * @param queryWorkOderWebDTO
     * @return
     */
    ResultVO selectWorkOrderMaterialSupplementByWorkOrderId(QueryWorkOderWebDTO queryWorkOderWebDTO);

    /**
     * 向T100提交出库
     * @param workOrderId  补料工单id
     * @param userId  用户id
     * @return
     */
    ResultVO submitOutBound(Integer workOrderId, Integer userId);

//    /**
//     * 向T100提交补料出库
//     * @param supplementCode
//     * @param userId
//     * @return
//     */
//    ResultVO submitSupplement(String supplementCode, Integer userId);


}
