package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HvGdWorkBomExtMapper {

    /**
     * 查询工单的未完成的物料清单
     * @param workOrderId
     * @return
     */
    List<HvGdWorkBom> selectByWorkOrderId(@Param("workOrderId") Integer workOrderId);

//    /**
//     * 根据工单ID查询还未拣货完毕的物料清单
//     * @param workOrderId
//     * @return
//     */
//    List<HvGdWorkBom> selectNotOutByWorkOrderId(@Param("workOrderId")Integer workOrderId);

    /**
     * 根据工单ID和物料编号查询物料清单信息
     * @param workOrderId
     * @param materialCode
     * @return
     */
    HvGdWorkBom selectByWorkOrderIdAndMaterialCode(@Param("workOrderId") Integer workOrderId, @Param("materialCode") String materialCode);

    /**
     * 根据物料、供应商、区域编号，查询出储位物料信息
     * @param materialCode
     * @param eigenvalue
     * @param areaCode
     * @return
     */
    List<BaseDepotToCase> selectByMaterialCodeAndEigenvalueAndAreaCode(@Param("materialCode") String materialCode,
                                                                       @Param("eigenvalue") String eigenvalue,
                                                                       @Param("areaCode") String areaCode);




    /**
     * 根据箱子编号查询储位信息
     * @param caseNo
     * @return
     */
    List<BaseDepotToCase> selectByCaseNo(@Param("caseNo") String caseNo);

    /**
     * 根据内包装编号查询储位信息
     * @param packNo
     * @return
     */
    List<BaseDepotToCase> selectDepotByPackNo(@Param("packNo") String packNo);

    /**
     * 根据小包装序号查询小包装的信息
     * @param packNo
     * @return
     */
    WarehousingReceiptDetailsPack selectPackByPackNo(@Param("packNo") String packNo);

    /**
     * 根据箱号查询未出库的小包装
     * @param boxNo
     * @return
     */
    List<WarehousingReceiptDetailsPack> selectPackByBoxNo(@Param("boxNo") String boxNo);

    /**
     * 根据扫描序号查询余料信息
     * @param boxCode
     * @return
     */
    List<StorageRemainMaterial> selectRemainMaterialByBoxCode(@Param("boxCode") String boxCode);

    /**
     * 根据储位编号查询是否有余料
     * @param storageCode
     * @return
     */
    List<StorageRemainMaterial> selectRemainMaterialByStorageCode(@Param("storageCode") String storageCode);


    /**
     * 根据箱子编号删除储位上的箱子信息
     * @param boxNo
     */
    void deleteDepotByBoxNo(@Param("boxNo") String boxNo);

    /**
     * 根据工单ID和用户ID查询未提交的出库记录
     * @param workOrderId
     * @param userId
     * @return
     */
    List<WarehousingOutRecord> selectOutRecordByWorkOrderIdAndUserId(@Param("workOrderId") Integer workOrderId, @Param("userId") Integer userId);

    /**
     * 据工单ID和用户ID修改出库记录的状态为已提交
     * @param workOrderId
     * @param userId
     */
    void updateOutRecordStatusByWorkOrderIdAndUserId(@Param("workOrderId") Integer workOrderId, @Param("userId") Integer userId);


    /**
     * 根据工单id查询所有物料清单
     * @param workOrderCodeId 工单编码
     * @return
     */
    List<HvGdWorkBom> selectListByWorkOrderId(@Param("workOrderCodeId") String workOrderCodeId);

    /**
     * 根据箱子序列号查询储位上箱子信息
     * @param boxCode 箱子序列号
     * @return
     */
    List<BaseDepotToCase> findBaseDepotToCase(@Param("boxCode") String boxCode);

    /**
     * 根据工单编码查询工单信息
     * @param workOrderCode
     * @return
     */
    HvPmWorkOrder selectByWorkOrderCode(String workOrderCode);

    /**
     * 根据供应商编码查询供应商编码
     * @param supplierCode 供应商编码
     * @return
     */
    BaseSupplierInformation selectBySupplierCode(@Param("supplierCode") String supplierCode);

    /**
     * 根据箱子编号与箱内包装号查询未出库小包装
     * @param boxNo  箱子编号
     * @param boxNo  箱内包装号
     * @return
     */
    List<WarehousingReceiptDetailsPack> selectPackByBoxNoAndCaseNo(@Param("boxNo") String boxNo, @Param("packNo") String packNo);

    /**
     * 根据物料编号、供应商编号查询物料是否被冻结
     * @param materialNo  物料编号
     * @param eigenvalue 供应商编号
     * @return
     */
   WarehousingFrozen selectWarehousingFrozens(@Param("materialNo") String materialNo, @Param("eigenvalue") String eigenvalue);
}
