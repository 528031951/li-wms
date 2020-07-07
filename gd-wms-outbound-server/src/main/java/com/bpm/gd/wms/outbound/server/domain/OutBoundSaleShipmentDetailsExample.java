package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutBoundSaleShipmentDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutBoundSaleShipmentDetailsExample() {
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

        public Criteria andShipmentNoIsNull() {
            addCriterion("SHIPMENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andShipmentNoIsNotNull() {
            addCriterion("SHIPMENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentNoEqualTo(String value) {
            addCriterion("SHIPMENT_NO =", value, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoNotEqualTo(String value) {
            addCriterion("SHIPMENT_NO <>", value, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoGreaterThan(String value) {
            addCriterion("SHIPMENT_NO >", value, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_NO >=", value, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoLessThan(String value) {
            addCriterion("SHIPMENT_NO <", value, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_NO <=", value, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoLike(String value) {
            addCriterion("SHIPMENT_NO like", value, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoNotLike(String value) {
            addCriterion("SHIPMENT_NO not like", value, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoIn(List<String> values) {
            addCriterion("SHIPMENT_NO in", values, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoNotIn(List<String> values) {
            addCriterion("SHIPMENT_NO not in", values, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoBetween(String value1, String value2) {
            addCriterion("SHIPMENT_NO between", value1, value2, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andShipmentNoNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_NO not between", value1, value2, "shipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberIsNull() {
            addCriterion("SHIPMENT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberIsNotNull() {
            addCriterion("SHIPMENT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberEqualTo(Long value) {
            addCriterion("SHIPMENT_NUMBER =", value, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberNotEqualTo(Long value) {
            addCriterion("SHIPMENT_NUMBER <>", value, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberGreaterThan(Long value) {
            addCriterion("SHIPMENT_NUMBER >", value, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("SHIPMENT_NUMBER >=", value, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberLessThan(Long value) {
            addCriterion("SHIPMENT_NUMBER <", value, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberLessThanOrEqualTo(Long value) {
            addCriterion("SHIPMENT_NUMBER <=", value, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberIn(List<Long> values) {
            addCriterion("SHIPMENT_NUMBER in", values, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberNotIn(List<Long> values) {
            addCriterion("SHIPMENT_NUMBER not in", values, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberBetween(Long value1, Long value2) {
            addCriterion("SHIPMENT_NUMBER between", value1, value2, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentNumberNotBetween(Long value1, Long value2) {
            addCriterion("SHIPMENT_NUMBER not between", value1, value2, "shipmentNumber");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNull() {
            addCriterion("PRODUCT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNotNull() {
            addCriterion("PRODUCT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitEqualTo(String value) {
            addCriterion("PRODUCT_UNIT =", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotEqualTo(String value) {
            addCriterion("PRODUCT_UNIT <>", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThan(String value) {
            addCriterion("PRODUCT_UNIT >", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_UNIT >=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThan(String value) {
            addCriterion("PRODUCT_UNIT <", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_UNIT <=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLike(String value) {
            addCriterion("PRODUCT_UNIT like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotLike(String value) {
            addCriterion("PRODUCT_UNIT not like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitIn(List<String> values) {
            addCriterion("PRODUCT_UNIT in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotIn(List<String> values) {
            addCriterion("PRODUCT_UNIT not in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitBetween(String value1, String value2) {
            addCriterion("PRODUCT_UNIT between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_UNIT not between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameIsNull() {
            addCriterion("STORAGE_LOCATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameIsNotNull() {
            addCriterion("STORAGE_LOCATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NAME =", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameNotEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NAME <>", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameGreaterThan(String value) {
            addCriterion("STORAGE_LOCATION_NAME >", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NAME >=", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameLessThan(String value) {
            addCriterion("STORAGE_LOCATION_NAME <", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NAME <=", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameLike(String value) {
            addCriterion("STORAGE_LOCATION_NAME like", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameNotLike(String value) {
            addCriterion("STORAGE_LOCATION_NAME not like", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_NAME in", values, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameNotIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_NAME not in", values, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_NAME between", value1, value2, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameNotBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_NAME not between", value1, value2, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodIsNull() {
            addCriterion("STORAGE_LOCATION_COD is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodIsNotNull() {
            addCriterion("STORAGE_LOCATION_COD is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_COD =", value, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodNotEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_COD <>", value, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodGreaterThan(String value) {
            addCriterion("STORAGE_LOCATION_COD >", value, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_COD >=", value, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodLessThan(String value) {
            addCriterion("STORAGE_LOCATION_COD <", value, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_COD <=", value, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodLike(String value) {
            addCriterion("STORAGE_LOCATION_COD like", value, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodNotLike(String value) {
            addCriterion("STORAGE_LOCATION_COD not like", value, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_COD in", values, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodNotIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_COD not in", values, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_COD between", value1, value2, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andStorageLocationCodNotBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_COD not between", value1, value2, "storageLocationCod");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberIsNull() {
            addCriterion("ALREADY_SHIPMENT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberIsNotNull() {
            addCriterion("ALREADY_SHIPMENT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberEqualTo(Long value) {
            addCriterion("ALREADY_SHIPMENT_NUMBER =", value, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberNotEqualTo(Long value) {
            addCriterion("ALREADY_SHIPMENT_NUMBER <>", value, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberGreaterThan(Long value) {
            addCriterion("ALREADY_SHIPMENT_NUMBER >", value, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ALREADY_SHIPMENT_NUMBER >=", value, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberLessThan(Long value) {
            addCriterion("ALREADY_SHIPMENT_NUMBER <", value, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberLessThanOrEqualTo(Long value) {
            addCriterion("ALREADY_SHIPMENT_NUMBER <=", value, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberIn(List<Long> values) {
            addCriterion("ALREADY_SHIPMENT_NUMBER in", values, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberNotIn(List<Long> values) {
            addCriterion("ALREADY_SHIPMENT_NUMBER not in", values, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberBetween(Long value1, Long value2) {
            addCriterion("ALREADY_SHIPMENT_NUMBER between", value1, value2, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyShipmentNumberNotBetween(Long value1, Long value2) {
            addCriterion("ALREADY_SHIPMENT_NUMBER not between", value1, value2, "alreadyShipmentNumber");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusIsNull() {
            addCriterion("SHIPMENT_DETAILS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusIsNotNull() {
            addCriterion("SHIPMENT_DETAILS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusEqualTo(String value) {
            addCriterion("SHIPMENT_DETAILS_STATUS =", value, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusNotEqualTo(String value) {
            addCriterion("SHIPMENT_DETAILS_STATUS <>", value, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusGreaterThan(String value) {
            addCriterion("SHIPMENT_DETAILS_STATUS >", value, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_DETAILS_STATUS >=", value, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusLessThan(String value) {
            addCriterion("SHIPMENT_DETAILS_STATUS <", value, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_DETAILS_STATUS <=", value, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusLike(String value) {
            addCriterion("SHIPMENT_DETAILS_STATUS like", value, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusNotLike(String value) {
            addCriterion("SHIPMENT_DETAILS_STATUS not like", value, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusIn(List<String> values) {
            addCriterion("SHIPMENT_DETAILS_STATUS in", values, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusNotIn(List<String> values) {
            addCriterion("SHIPMENT_DETAILS_STATUS not in", values, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusBetween(String value1, String value2) {
            addCriterion("SHIPMENT_DETAILS_STATUS between", value1, value2, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentDetailsStatusNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_DETAILS_STATUS not between", value1, value2, "shipmentDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNull() {
            addCriterion("UPDATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("UPDATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(Long value) {
            addCriterion("UPDATER_ID =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(Long value) {
            addCriterion("UPDATER_ID <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(Long value) {
            addCriterion("UPDATER_ID >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATER_ID >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(Long value) {
            addCriterion("UPDATER_ID <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(Long value) {
            addCriterion("UPDATER_ID <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<Long> values) {
            addCriterion("UPDATER_ID in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<Long> values) {
            addCriterion("UPDATER_ID not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(Long value1, Long value2) {
            addCriterion("UPDATER_ID between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(Long value1, Long value2) {
            addCriterion("UPDATER_ID not between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsIsNull() {
            addCriterion("PRODUCT_SPECIFICATIONS is null");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsIsNotNull() {
            addCriterion("PRODUCT_SPECIFICATIONS is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsEqualTo(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS =", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotEqualTo(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS <>", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsGreaterThan(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS >", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS >=", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsLessThan(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS <", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS <=", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsLike(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS like", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotLike(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS not like", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsIn(List<String> values) {
            addCriterion("PRODUCT_SPECIFICATIONS in", values, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotIn(List<String> values) {
            addCriterion("PRODUCT_SPECIFICATIONS not in", values, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsBetween(String value1, String value2) {
            addCriterion("PRODUCT_SPECIFICATIONS between", value1, value2, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SPECIFICATIONS not between", value1, value2, "productSpecifications");
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