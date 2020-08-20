package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.WorkOrderMaterialSupplementDetails;
import com.bpm.gd.wms.outbound.server.domain.WorkOrderMaterialSupplementDetailsExample;
import com.bpm.gd.wms.outbound.server.vo.WorkOrderMaterialSupplementDetailsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkOrderMaterialSupplementDetailsMapper {
    long countByExample(WorkOrderMaterialSupplementDetailsExample example);

    int deleteByExample(WorkOrderMaterialSupplementDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkOrderMaterialSupplementDetails record);

    int insertSelective(WorkOrderMaterialSupplementDetails record);

    List<WorkOrderMaterialSupplementDetails> selectByExample(WorkOrderMaterialSupplementDetailsExample example);

    WorkOrderMaterialSupplementDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkOrderMaterialSupplementDetails record, @Param("example") WorkOrderMaterialSupplementDetailsExample example);

    int updateByExample(@Param("record") WorkOrderMaterialSupplementDetails record, @Param("example") WorkOrderMaterialSupplementDetailsExample example);

    int updateByPrimaryKeySelective(WorkOrderMaterialSupplementDetails record);

    int updateByPrimaryKey(WorkOrderMaterialSupplementDetails record);

    /**
     * 根据补料单号查询未捡料完毕的物料信息
     * @param supplementCode
     * @return
     */
    List<WorkOrderMaterialSupplementDetailsVO> selectBySupplementCode(@Param("supplementCode") String supplementCode);

    /**
     *根 据补料单号查询捡料完毕的物料信息
     * @param supplementCode
     * @return
     */
    List<WorkOrderMaterialSupplementDetailsVO> selectFinishedBySupplementCode(@Param("supplementCode") String supplementCode);

    /**
     * 根据补料单号和物料编号查询的物料信息
     * @param supplementCode
     * @param materialCode
     * @return
     */
    WorkOrderMaterialSupplementDetailsVO selectBySupplementCodeAndMaterialCode(@Param("supplementCode") String supplementCode, @Param("materailCode") String materialCode);


    /**
     * 根据工单编号查询未补料完成数量
     * @param workOrderCode
     * @return
     */
    int selectNotFinishedCountByWorkOrderCode(@Param("workOrderCode") String workOrderCode);

    /**
     * 根据补料编码、物料编码查询补料物料清单
     * @param supplementCode  补料单号编码
     * @param materialNo  物料编号
     * @return
     */
    WorkOrderMaterialSupplementDetails selectByWorkOrderCode(@Param("supplementCode") String supplementCode, @Param("materialNo") String materialNo);

    /**
     * 根据补料工单编码查询物料信息
     * @param supplementCode
     * @return
     */
    List<WorkOrderMaterialSupplementDetails> selectWorkOrderCode(@Param("supplementCode") String supplementCode);
}