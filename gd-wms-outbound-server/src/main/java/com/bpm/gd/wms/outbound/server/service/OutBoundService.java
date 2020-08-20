package com.bpm.gd.wms.outbound.server.service;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.domain.OutBoundFillBillTask;
import com.bpm.gd.wms.outbound.server.domain.SendOrder;
import com.bpm.gd.wms.outbound.server.dto.*;

import java.text.ParseException;
import java.util.List;

public interface OutBoundService {

    /**
     * 查找工单信息
     * @param queryWorkOrderDTO
     * @return
     */
    ResultVO findWorkOrder(QueryWorkOrderDTO queryWorkOrderDTO);


    ResultVO findFillBill(QueryFillBillDTO queryFillBillDTO);

    ResultVO dispatchWorkOrder(IdsDTO idsDTO);

    ResultVO dispatchFillBill(IdsDTO idsDTO);

    ResultVO findTaskByUser(String chenyiwen);

    ResultVO findMatterByWorkOrder(String workOrderId, String name);

    ResultVO findBillTaskByUser(String name);

    ResultVO findMatterByBill(String fillBillId, String name);

    ResultVO findPositionByBill(String fillBillId, String name);

    ResultVO findWorkOrderMatter(String workOrderId);

    ResultVO findFillBillMatter(String fillBillId);

    ResultVO findMatterByPosition(String depotId);

    ResultVO outBoundMatterWO(OutBoundFillBillTask outBoundFillBillTask);


    ResultVO outBoundMatterFB(OutBoundFillBillTask outBoundFillBillTask);

    ResultVO findPositionByWorkOrder(String workOrderId, String name);

    ResultVO sendOrderInBound(List<SendOrder> list);

    ResultVO scanBoxOrPackage(String id);

    ResultVO findProduct(QueryProductDTO queryProductDTO);

    ResultVO outProduct(List<QueryProductDTO> list);

    ResultVO findProductById(IdsDTO idsDTO);

    ResultVO findSaleInfo(QueryBillDTO queryBillDTO);

    ResultVO findSaleMatter(String saleId);

    ResultVO dispatchSale(IdsDTO idsDTO);

    ResultVO findSaleTaskByUser(String name);

    ResultVO findPositionBySale(String saleId, String name);

    ResultVO scanBoxOrPackageProduct(String id);

    ResultVO outBoundMatterSL(OutBoundFillBillTask outBoundFillBillTask) throws ParseException;

    ResultVO findTransferOrder(QueryBillDTO queryBillDTO);

    ResultVO findTransferInfo(String transferId);

    ResultVO findShipmentAllPageList(OutBoundSaleShipmentDTO outBoundSaleShipmentDTO);

    ResultVO findShipmentDetailsByShipmentNo(String shipmentNo,String shipmentDetailsStatus);

    ResultVO findWarehousingProductReceiptByProductCode(String productCode);

    String addTransferOrder(CougnyTransferOrdersDTO cougnyTransferOrdersDTO);

    ResultVO findTransferOrder2(CougnyTransferOrderDTOS cougnyTransferOrderDTOS);

    ResultVO dockingAddInfo();

    ResultVO dockingAddDetailsInfo();

    ResultVO findShipment();

    ResultVO findShipmentByOrderCode(String shipmentOrderCode);
}
