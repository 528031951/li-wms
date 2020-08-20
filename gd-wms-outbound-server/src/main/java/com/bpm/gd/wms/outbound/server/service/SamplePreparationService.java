package com.bpm.gd.wms.outbound.server.service;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.SamplePreparationDTO;

public interface SamplePreparationService {

    /**
     * 根据用户id查询未提交的样件
     * @param userId
     * @return
     */
    ResultVO findUserSamplePreparation(Integer userId);

    /**
     * 根据工单号查询工单是否存在
     * @param workCode 工单号
     * @return
     */
    ResultVO findHvPmWorkOrderByOrderCode(String workCode);

    /**
     * 根据样件编号查询物料信息
     * @param matterCode  样件编号(物料编码)
     * @return
     */
    ResultVO findDepotToCaseByMatterCode(String matterCode);

    /**
     * 保存样件数量信息
     * @param samplePreparationDTO
     * @return
     */
    ResultVO addDepotToCaseByMatter(SamplePreparationDTO samplePreparationDTO);

    /**
     * 向T100提交出库
     * @param userId 用户id
     * @return
     */
    ResultVO submitOutBound(Integer userId);

    /**
     * 查询所有样件备料出库信息
     * @param pageNum  当前页
     * @param pageSize  结束页
     * @return
     */
    ResultVO findSampleAll(Integer pageNum, Integer pageSize);

}
