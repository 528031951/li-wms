package com.bpm.gd.wms.outbound.server.gddomain;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Super Young
 * @Date 2020/7/27 10:29
 */
@Data
public class GDMaterialStdData {

    private GDMaterialOrderHead parameter;

    //private HashMap<String, List<GDMaterialOrderBody>> param;
    private HashMap<String,List<GDMaterialOrderBody>> param;
}
