package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.*;
import com.bpm.gd.wms.outbound.server.dto.QueryProductDTO;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface BaseDepotToMatterExtMapper {

    long countByExample(BaseDepotToMatterExample example);

    int deleteByExample(BaseDepotToMatterExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseDepotToMatter record);

    int insertSelective(BaseDepotToMatter record);

    List<BaseDepotToMatter> selectByExample(BaseDepotToMatterExample example);

    BaseDepotToMatter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseDepotToMatter record, @Param("example") BaseDepotToMatterExample example);

    int updateByExample(@Param("record") BaseDepotToMatter record, @Param("example") BaseDepotToMatterExample example);

    int updateByPrimaryKeySelective(BaseDepotToMatter record);

    int updateByPrimaryKey(BaseDepotToMatter record);

    List<BaseDepotToMatter> findPositionByBill(@Param("matterNo") String matterNo);

    List<BaseDepotToMatter> findMatterByPosition(@Param("depotId") String depotId);

    int updateUseNumber(List<OutBoundWorkOrder> result);

    int updateUseNumberFB(List<OutBoundFillBill> result);

    int updateAllNumber(List<OutBoundFillBillTask> list);


    List<BoxInfo> scanBoxOrPackage(@Param("boxID") String boxID);

    int updateMatterInfo(OutBoundFillBillTask outBoundFillBillTask);

    int updateCaseInfo(OutBoundFillBillTask outBoundFillBillTask);


    List<BoxInfoProduct> scanBoxOrPackageProduct(@Param("boxID") String boxID);

    int updateProductInfo(OutBoundFillBillTask outBoundFillBillTask);

    int updateMatterInfoSL(OutBoundFillBillTask outBoundFillBillTask);

    Object updateCaseInfoSL(OutBoundFillBillTask outBoundFillBillTask);

    void updateCount(@Param("trayQuantity") BigDecimal trayQuantity, @Param("productCode") String productCode);

    List<String> selectDepotIdBySupplierCodeAndMatterId(@Param("supplierCode")String supplierCode,@Param("matterId")String matterId);

    BaseDepotToMatter selectByDepotId(@Param("depotId") String depotId,@Param("materialNo") String materialNo);}