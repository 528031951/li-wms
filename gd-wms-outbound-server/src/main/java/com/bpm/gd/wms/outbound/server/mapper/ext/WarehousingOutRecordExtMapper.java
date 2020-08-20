package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.WarehousingOutRecord;
import com.bpm.gd.wms.outbound.server.domain.WarehousingRecord;
import com.bpm.gd.wms.outbound.server.vo.SamplePreparationVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehousingOutRecordExtMapper {

    /**
     * 根据用户id查询未提交的样件
     * @param userId  用户id
     * @return
     */
    List<WarehousingOutRecord> selectUserIdSample(@Param("userId") Integer userId);

    /**
     * 根据样件编号查询物料信息
     * @param matterCode  样件编号(物料编码)
     * @return
     */
    SamplePreparationVo selectDepotToCaseByMatterCode(@Param("matterCode") String matterCode);

    /**
     * 根据物料编码查询物料信息
     * @param materialNo 物料编号
     * @return
     */
    List<WarehousingRecord> selectWarehousingRecord(@Param("materialNo") String materialNo);

    /**
     * 根据用户id查询未出库物料信息返回单个工单物料信息
     * @param userId  用户id
     * @return
     */
    List<WarehousingOutRecord> selectWarehousingOutRecordByUserId(@Param("userId") Integer userId);

    /**
     * 根据工单与用户id查询出库信息
     * @param workOrderCode  工单号
     * @param userId  用户id
     * @return
     */
    List<WarehousingOutRecord> selectUserIdAndCode(@Param("workOrderCode") String workOrderCode, @Param("userId") Integer userId);

    /**
     * 根据用户id修改出库状态为已提交
     * @param userId 用户id
     */
    void updateWarehousingOutRecordByUserId(@Param("userId") Integer userId);

    /**
     * 查询所有样件备料出库信息
     * @return
     */
    List<WarehousingOutRecord> selectAll();

}
