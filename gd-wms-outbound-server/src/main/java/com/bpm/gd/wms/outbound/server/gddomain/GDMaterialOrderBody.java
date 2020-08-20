package com.bpm.gd.wms.outbound.server.gddomain;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @Author Super Young
 * @Date 2020/7/11 15:56
 */
@Data
@ApiModel(description = "发料/退料单回传身")
public class GDMaterialOrderBody {

    /**项次 */
    private String sfdcseq;

    /**工单号 */
    private String sfdc001;

    /**工单项次 */
    private String sfdc002;

    /**工单项序 */
    private String sfdc003;

    /**需求料号 */
    private String sfdc004;

    /**产品特征 */
    private String sfdc005;

    /**单位 */
    private String sfdc006;

    /**申请数量 */
    private String sfdc007;

    /**实际数量 */
    private String sfdc008;

    /**参考单位 */
    private String sfdc009;

    /**参考单位需求数量 */
    private String sfdc010;

    /**参考单位实际数量 */
    private String sfdc011;

    /**指定库位 */
    private String sfdc012;

    /**指定储位 */
    private String sfdc013;

    /**指定批号 */
    private String sfdc014;

    /**理由码
     *D0001 物料工废 D0002 物料料废 D0005 料废（连带报废） 退料回传理由码 发料不传
     */
    private String sfdc015;

    /**库存管理特征（就是他的供应商编码）
    */
    private String sfdc016;

    /** 正负 退料1 发料-1*/
    private String sfdc017;

    /**客供料否 Y/N	*/
    private String sfde009;

}
