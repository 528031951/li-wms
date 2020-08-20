package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.WorkOrderMaterialSupplement;
import com.bpm.gd.wms.outbound.server.vo.WorkOrderMaterialSupplementDetailsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkOrderMaterialSupplementExtMapper {

    /**
     * 条件查询所有补料工单信息
     * @param workOrderCodeId  补料工单编码
     * @param workOrderState   工单状态
     * @param areaCode  产线编码
     * @return
     */
    List<WorkOrderMaterialSupplement> selectWorkOrderMaterialSupplementAll(@Param("workOrderCodeId") String workOrderCodeId, @Param("workOrderState") String workOrderState, @Param("areaCode") String areaCode);

    /**
     * 根据补料工单号查询物料信息
     * @param supplementCode
     * @return
     */
    List<WorkOrderMaterialSupplementDetailsVO> selectListByWorkOrderCodeId(@Param("supplementCode") String supplementCode);
}
