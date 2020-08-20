package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.List;

public class WarehousingByTrayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehousingByTrayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("BARCODE is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("BARCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("BARCODE =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("BARCODE <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("BARCODE >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BARCODE >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("BARCODE <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("BARCODE <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("BARCODE like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("BARCODE not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("BARCODE in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("BARCODE not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("BARCODE between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("BARCODE not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberIsNull() {
            addCriterion("TRAY_BATCH_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberIsNotNull() {
            addCriterion("TRAY_BATCH_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberEqualTo(String value) {
            addCriterion("TRAY_BATCH_NUMBER =", value, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberNotEqualTo(String value) {
            addCriterion("TRAY_BATCH_NUMBER <>", value, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberGreaterThan(String value) {
            addCriterion("TRAY_BATCH_NUMBER >", value, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("TRAY_BATCH_NUMBER >=", value, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberLessThan(String value) {
            addCriterion("TRAY_BATCH_NUMBER <", value, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("TRAY_BATCH_NUMBER <=", value, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberLike(String value) {
            addCriterion("TRAY_BATCH_NUMBER like", value, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberNotLike(String value) {
            addCriterion("TRAY_BATCH_NUMBER not like", value, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberIn(List<String> values) {
            addCriterion("TRAY_BATCH_NUMBER in", values, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberNotIn(List<String> values) {
            addCriterion("TRAY_BATCH_NUMBER not in", values, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberBetween(String value1, String value2) {
            addCriterion("TRAY_BATCH_NUMBER between", value1, value2, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBatchNumberNotBetween(String value1, String value2) {
            addCriterion("TRAY_BATCH_NUMBER not between", value1, value2, "trayBatchNumber");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityIsNull() {
            addCriterion("TRAY_BOX_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityIsNotNull() {
            addCriterion("TRAY_BOX_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityEqualTo(Long value) {
            addCriterion("TRAY_BOX_QUANTITY =", value, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityNotEqualTo(Long value) {
            addCriterion("TRAY_BOX_QUANTITY <>", value, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityGreaterThan(Long value) {
            addCriterion("TRAY_BOX_QUANTITY >", value, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("TRAY_BOX_QUANTITY >=", value, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityLessThan(Long value) {
            addCriterion("TRAY_BOX_QUANTITY <", value, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityLessThanOrEqualTo(Long value) {
            addCriterion("TRAY_BOX_QUANTITY <=", value, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityIn(List<Long> values) {
            addCriterion("TRAY_BOX_QUANTITY in", values, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityNotIn(List<Long> values) {
            addCriterion("TRAY_BOX_QUANTITY not in", values, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityBetween(Long value1, Long value2) {
            addCriterion("TRAY_BOX_QUANTITY between", value1, value2, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayBoxQuantityNotBetween(Long value1, Long value2) {
            addCriterion("TRAY_BOX_QUANTITY not between", value1, value2, "trayBoxQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityIsNull() {
            addCriterion("TRAY_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityIsNotNull() {
            addCriterion("TRAY_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityEqualTo(Long value) {
            addCriterion("TRAY_QUANTITY =", value, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityNotEqualTo(Long value) {
            addCriterion("TRAY_QUANTITY <>", value, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityGreaterThan(Long value) {
            addCriterion("TRAY_QUANTITY >", value, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("TRAY_QUANTITY >=", value, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityLessThan(Long value) {
            addCriterion("TRAY_QUANTITY <", value, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityLessThanOrEqualTo(Long value) {
            addCriterion("TRAY_QUANTITY <=", value, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityIn(List<Long> values) {
            addCriterion("TRAY_QUANTITY in", values, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityNotIn(List<Long> values) {
            addCriterion("TRAY_QUANTITY not in", values, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityBetween(Long value1, Long value2) {
            addCriterion("TRAY_QUANTITY between", value1, value2, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andTrayQuantityNotBetween(Long value1, Long value2) {
            addCriterion("TRAY_QUANTITY not between", value1, value2, "trayQuantity");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("PRODUCT_CODE =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_CODE <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("PRODUCT_CODE >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("PRODUCT_CODE <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("PRODUCT_CODE like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("PRODUCT_CODE not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("PRODUCT_CODE in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_CODE not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("MATERIAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("MATERIAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("MATERIAL_NAME =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("MATERIAL_NAME <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("MATERIAL_NAME >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NAME >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("MATERIAL_NAME <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NAME <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("MATERIAL_NAME like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("MATERIAL_NAME not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("MATERIAL_NAME in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("MATERIAL_NAME not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("MATERIAL_NAME between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_NAME not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeIsNull() {
            addCriterion("SIGNATURE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeIsNotNull() {
            addCriterion("SIGNATURE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeEqualTo(String value) {
            addCriterion("SIGNATURE_CODE =", value, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeNotEqualTo(String value) {
            addCriterion("SIGNATURE_CODE <>", value, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeGreaterThan(String value) {
            addCriterion("SIGNATURE_CODE >", value, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_CODE >=", value, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeLessThan(String value) {
            addCriterion("SIGNATURE_CODE <", value, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeLessThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_CODE <=", value, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeLike(String value) {
            addCriterion("SIGNATURE_CODE like", value, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeNotLike(String value) {
            addCriterion("SIGNATURE_CODE not like", value, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeIn(List<String> values) {
            addCriterion("SIGNATURE_CODE in", values, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeNotIn(List<String> values) {
            addCriterion("SIGNATURE_CODE not in", values, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeBetween(String value1, String value2) {
            addCriterion("SIGNATURE_CODE between", value1, value2, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSignatureCodeNotBetween(String value1, String value2) {
            addCriterion("SIGNATURE_CODE not between", value1, value2, "signatureCode");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("SUPPLIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("SUPPLIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("SUPPLIER_NAME =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("SUPPLIER_NAME >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("SUPPLIER_NAME <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("SUPPLIER_NAME like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("SUPPLIER_NAME not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("SUPPLIER_NAME in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_NAME not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeIsNull() {
            addCriterion("WORK_ORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeIsNotNull() {
            addCriterion("WORK_ORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeEqualTo(String value) {
            addCriterion("WORK_ORDER_CODE =", value, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeNotEqualTo(String value) {
            addCriterion("WORK_ORDER_CODE <>", value, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeGreaterThan(String value) {
            addCriterion("WORK_ORDER_CODE >", value, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ORDER_CODE >=", value, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeLessThan(String value) {
            addCriterion("WORK_ORDER_CODE <", value, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("WORK_ORDER_CODE <=", value, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeLike(String value) {
            addCriterion("WORK_ORDER_CODE like", value, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeNotLike(String value) {
            addCriterion("WORK_ORDER_CODE not like", value, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeIn(List<String> values) {
            addCriterion("WORK_ORDER_CODE in", values, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeNotIn(List<String> values) {
            addCriterion("WORK_ORDER_CODE not in", values, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeBetween(String value1, String value2) {
            addCriterion("WORK_ORDER_CODE between", value1, value2, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andWorkOrderCodeNotBetween(String value1, String value2) {
            addCriterion("WORK_ORDER_CODE not between", value1, value2, "workOrderCode");
            return (Criteria) this;
        }

        public Criteria andStorageNoIsNull() {
            addCriterion("STORAGE_NO is null");
            return (Criteria) this;
        }

        public Criteria andStorageNoIsNotNull() {
            addCriterion("STORAGE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStorageNoEqualTo(String value) {
            addCriterion("STORAGE_NO =", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotEqualTo(String value) {
            addCriterion("STORAGE_NO <>", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoGreaterThan(String value) {
            addCriterion("STORAGE_NO >", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_NO >=", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLessThan(String value) {
            addCriterion("STORAGE_NO <", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_NO <=", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLike(String value) {
            addCriterion("STORAGE_NO like", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotLike(String value) {
            addCriterion("STORAGE_NO not like", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoIn(List<String> values) {
            addCriterion("STORAGE_NO in", values, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotIn(List<String> values) {
            addCriterion("STORAGE_NO not in", values, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoBetween(String value1, String value2) {
            addCriterion("STORAGE_NO between", value1, value2, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotBetween(String value1, String value2) {
            addCriterion("STORAGE_NO not between", value1, value2, "storageNo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}