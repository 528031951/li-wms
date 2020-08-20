package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CougnyTransferOrderProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CougnyTransferOrderProductExample() {
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

        public Criteria andCaseNoIsNull() {
            addCriterion("CASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("CASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(String value) {
            addCriterion("CASE_NO =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(String value) {
            addCriterion("CASE_NO <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(String value) {
            addCriterion("CASE_NO >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NO >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(String value) {
            addCriterion("CASE_NO <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(String value) {
            addCriterion("CASE_NO <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLike(String value) {
            addCriterion("CASE_NO like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotLike(String value) {
            addCriterion("CASE_NO not like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<String> values) {
            addCriterion("CASE_NO in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<String> values) {
            addCriterion("CASE_NO not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(String value1, String value2) {
            addCriterion("CASE_NO between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(String value1, String value2) {
            addCriterion("CASE_NO not between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNumIsNull() {
            addCriterion("CASE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCaseNumIsNotNull() {
            addCriterion("CASE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNumEqualTo(Long value) {
            addCriterion("CASE_NUM =", value, "caseNum");
            return (Criteria) this;
        }

        public Criteria andCaseNumNotEqualTo(Long value) {
            addCriterion("CASE_NUM <>", value, "caseNum");
            return (Criteria) this;
        }

        public Criteria andCaseNumGreaterThan(Long value) {
            addCriterion("CASE_NUM >", value, "caseNum");
            return (Criteria) this;
        }

        public Criteria andCaseNumGreaterThanOrEqualTo(Long value) {
            addCriterion("CASE_NUM >=", value, "caseNum");
            return (Criteria) this;
        }

        public Criteria andCaseNumLessThan(Long value) {
            addCriterion("CASE_NUM <", value, "caseNum");
            return (Criteria) this;
        }

        public Criteria andCaseNumLessThanOrEqualTo(Long value) {
            addCriterion("CASE_NUM <=", value, "caseNum");
            return (Criteria) this;
        }

        public Criteria andCaseNumIn(List<Long> values) {
            addCriterion("CASE_NUM in", values, "caseNum");
            return (Criteria) this;
        }

        public Criteria andCaseNumNotIn(List<Long> values) {
            addCriterion("CASE_NUM not in", values, "caseNum");
            return (Criteria) this;
        }

        public Criteria andCaseNumBetween(Long value1, Long value2) {
            addCriterion("CASE_NUM between", value1, value2, "caseNum");
            return (Criteria) this;
        }

        public Criteria andCaseNumNotBetween(Long value1, Long value2) {
            addCriterion("CASE_NUM not between", value1, value2, "caseNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNull() {
            addCriterion("MATERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNotNull() {
            addCriterion("MATERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoEqualTo(String value) {
            addCriterion("MATERIAL_NO =", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotEqualTo(String value) {
            addCriterion("MATERIAL_NO <>", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThan(String value) {
            addCriterion("MATERIAL_NO >", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NO >=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThan(String value) {
            addCriterion("MATERIAL_NO <", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NO <=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLike(String value) {
            addCriterion("MATERIAL_NO like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotLike(String value) {
            addCriterion("MATERIAL_NO not like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIn(List<String> values) {
            addCriterion("MATERIAL_NO in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotIn(List<String> values) {
            addCriterion("MATERIAL_NO not in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoBetween(String value1, String value2) {
            addCriterion("MATERIAL_NO between", value1, value2, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_NO not between", value1, value2, "materialNo");
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

        public Criteria andInWarehouseCodIsNull() {
            addCriterion("IN_WAREHOUSE_COD is null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodIsNotNull() {
            addCriterion("IN_WAREHOUSE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodEqualTo(String value) {
            addCriterion("IN_WAREHOUSE_COD =", value, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodNotEqualTo(String value) {
            addCriterion("IN_WAREHOUSE_COD <>", value, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodGreaterThan(String value) {
            addCriterion("IN_WAREHOUSE_COD >", value, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodGreaterThanOrEqualTo(String value) {
            addCriterion("IN_WAREHOUSE_COD >=", value, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodLessThan(String value) {
            addCriterion("IN_WAREHOUSE_COD <", value, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodLessThanOrEqualTo(String value) {
            addCriterion("IN_WAREHOUSE_COD <=", value, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodLike(String value) {
            addCriterion("IN_WAREHOUSE_COD like", value, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodNotLike(String value) {
            addCriterion("IN_WAREHOUSE_COD not like", value, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodIn(List<String> values) {
            addCriterion("IN_WAREHOUSE_COD in", values, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodNotIn(List<String> values) {
            addCriterion("IN_WAREHOUSE_COD not in", values, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodBetween(String value1, String value2) {
            addCriterion("IN_WAREHOUSE_COD between", value1, value2, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseCodNotBetween(String value1, String value2) {
            addCriterion("IN_WAREHOUSE_COD not between", value1, value2, "inWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameIsNull() {
            addCriterion("IN_WAREHOUSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameIsNotNull() {
            addCriterion("IN_WAREHOUSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameEqualTo(String value) {
            addCriterion("IN_WAREHOUSE_NAME =", value, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameNotEqualTo(String value) {
            addCriterion("IN_WAREHOUSE_NAME <>", value, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameGreaterThan(String value) {
            addCriterion("IN_WAREHOUSE_NAME >", value, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("IN_WAREHOUSE_NAME >=", value, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameLessThan(String value) {
            addCriterion("IN_WAREHOUSE_NAME <", value, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameLessThanOrEqualTo(String value) {
            addCriterion("IN_WAREHOUSE_NAME <=", value, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameLike(String value) {
            addCriterion("IN_WAREHOUSE_NAME like", value, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameNotLike(String value) {
            addCriterion("IN_WAREHOUSE_NAME not like", value, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameIn(List<String> values) {
            addCriterion("IN_WAREHOUSE_NAME in", values, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameNotIn(List<String> values) {
            addCriterion("IN_WAREHOUSE_NAME not in", values, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameBetween(String value1, String value2) {
            addCriterion("IN_WAREHOUSE_NAME between", value1, value2, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNameNotBetween(String value1, String value2) {
            addCriterion("IN_WAREHOUSE_NAME not between", value1, value2, "inWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodIsNull() {
            addCriterion("OUT_WAREHOUSE_COD is null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodIsNotNull() {
            addCriterion("OUT_WAREHOUSE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodEqualTo(String value) {
            addCriterion("OUT_WAREHOUSE_COD =", value, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodNotEqualTo(String value) {
            addCriterion("OUT_WAREHOUSE_COD <>", value, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodGreaterThan(String value) {
            addCriterion("OUT_WAREHOUSE_COD >", value, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_WAREHOUSE_COD >=", value, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodLessThan(String value) {
            addCriterion("OUT_WAREHOUSE_COD <", value, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodLessThanOrEqualTo(String value) {
            addCriterion("OUT_WAREHOUSE_COD <=", value, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodLike(String value) {
            addCriterion("OUT_WAREHOUSE_COD like", value, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodNotLike(String value) {
            addCriterion("OUT_WAREHOUSE_COD not like", value, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodIn(List<String> values) {
            addCriterion("OUT_WAREHOUSE_COD in", values, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodNotIn(List<String> values) {
            addCriterion("OUT_WAREHOUSE_COD not in", values, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodBetween(String value1, String value2) {
            addCriterion("OUT_WAREHOUSE_COD between", value1, value2, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseCodNotBetween(String value1, String value2) {
            addCriterion("OUT_WAREHOUSE_COD not between", value1, value2, "outWarehouseCod");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameIsNull() {
            addCriterion("OUT_WAREHOUSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameIsNotNull() {
            addCriterion("OUT_WAREHOUSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameEqualTo(String value) {
            addCriterion("OUT_WAREHOUSE_NAME =", value, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameNotEqualTo(String value) {
            addCriterion("OUT_WAREHOUSE_NAME <>", value, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameGreaterThan(String value) {
            addCriterion("OUT_WAREHOUSE_NAME >", value, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_WAREHOUSE_NAME >=", value, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameLessThan(String value) {
            addCriterion("OUT_WAREHOUSE_NAME <", value, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameLessThanOrEqualTo(String value) {
            addCriterion("OUT_WAREHOUSE_NAME <=", value, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameLike(String value) {
            addCriterion("OUT_WAREHOUSE_NAME like", value, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameNotLike(String value) {
            addCriterion("OUT_WAREHOUSE_NAME not like", value, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameIn(List<String> values) {
            addCriterion("OUT_WAREHOUSE_NAME in", values, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameNotIn(List<String> values) {
            addCriterion("OUT_WAREHOUSE_NAME not in", values, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameBetween(String value1, String value2) {
            addCriterion("OUT_WAREHOUSE_NAME between", value1, value2, "outWarehouseName");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNameNotBetween(String value1, String value2) {
            addCriterion("OUT_WAREHOUSE_NAME not between", value1, value2, "outWarehouseName");
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

        public Criteria andShipmentRemarksIsNull() {
            addCriterion("SHIPMENT_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksIsNotNull() {
            addCriterion("SHIPMENT_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksEqualTo(String value) {
            addCriterion("SHIPMENT_REMARKS =", value, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksNotEqualTo(String value) {
            addCriterion("SHIPMENT_REMARKS <>", value, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksGreaterThan(String value) {
            addCriterion("SHIPMENT_REMARKS >", value, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_REMARKS >=", value, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksLessThan(String value) {
            addCriterion("SHIPMENT_REMARKS <", value, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_REMARKS <=", value, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksLike(String value) {
            addCriterion("SHIPMENT_REMARKS like", value, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksNotLike(String value) {
            addCriterion("SHIPMENT_REMARKS not like", value, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksIn(List<String> values) {
            addCriterion("SHIPMENT_REMARKS in", values, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksNotIn(List<String> values) {
            addCriterion("SHIPMENT_REMARKS not in", values, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksBetween(String value1, String value2) {
            addCriterion("SHIPMENT_REMARKS between", value1, value2, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andShipmentRemarksNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_REMARKS not between", value1, value2, "shipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberIsNull() {
            addCriterion("CUSTOMER_MATERIAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberIsNotNull() {
            addCriterion("CUSTOMER_MATERIAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER =", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberNotEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER <>", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberGreaterThan(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER >", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER >=", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberLessThan(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER <", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER <=", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberLike(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER like", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberNotLike(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER not like", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberIn(List<String> values) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER in", values, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberNotIn(List<String> values) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER not in", values, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberBetween(String value1, String value2) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER between", value1, value2, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER not between", value1, value2, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNull() {
            addCriterion("CUSTOMER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("CUSTOMER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("CUSTOMER_NO =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("CUSTOMER_NO <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("CUSTOMER_NO >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("CUSTOMER_NO <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("CUSTOMER_NO like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("CUSTOMER_NO not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("CUSTOMER_NO in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("CUSTOMER_NO not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeIsNull() {
            addCriterion("SHIPMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeIsNotNull() {
            addCriterion("SHIPMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeEqualTo(String value) {
            addCriterion("SHIPMENT_TYPE =", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeNotEqualTo(String value) {
            addCriterion("SHIPMENT_TYPE <>", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeGreaterThan(String value) {
            addCriterion("SHIPMENT_TYPE >", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_TYPE >=", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeLessThan(String value) {
            addCriterion("SHIPMENT_TYPE <", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_TYPE <=", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeLike(String value) {
            addCriterion("SHIPMENT_TYPE like", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeNotLike(String value) {
            addCriterion("SHIPMENT_TYPE not like", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeIn(List<String> values) {
            addCriterion("SHIPMENT_TYPE in", values, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeNotIn(List<String> values) {
            addCriterion("SHIPMENT_TYPE not in", values, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeBetween(String value1, String value2) {
            addCriterion("SHIPMENT_TYPE between", value1, value2, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_TYPE not between", value1, value2, "shipmentType");
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

        public Criteria andCougnyTimeIsNull() {
            addCriterion("COUGNY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeIsNotNull() {
            addCriterion("COUGNY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeEqualTo(Date value) {
            addCriterion("COUGNY_TIME =", value, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeNotEqualTo(Date value) {
            addCriterion("COUGNY_TIME <>", value, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeGreaterThan(Date value) {
            addCriterion("COUGNY_TIME >", value, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COUGNY_TIME >=", value, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeLessThan(Date value) {
            addCriterion("COUGNY_TIME <", value, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeLessThanOrEqualTo(Date value) {
            addCriterion("COUGNY_TIME <=", value, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeIn(List<Date> values) {
            addCriterion("COUGNY_TIME in", values, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeNotIn(List<Date> values) {
            addCriterion("COUGNY_TIME not in", values, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeBetween(Date value1, Date value2) {
            addCriterion("COUGNY_TIME between", value1, value2, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCougnyTimeNotBetween(Date value1, Date value2) {
            addCriterion("COUGNY_TIME not between", value1, value2, "cougnyTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("CREATE_ID =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("CREATE_ID <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("CREATE_ID >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_ID >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("CREATE_ID <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_ID <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("CREATE_ID in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("CREATE_ID not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_ID between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_ID not between", value1, value2, "createId");
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

        public Criteria andTrayNoIsNull() {
            addCriterion("TRAY_NO is null");
            return (Criteria) this;
        }

        public Criteria andTrayNoIsNotNull() {
            addCriterion("TRAY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTrayNoEqualTo(String value) {
            addCriterion("TRAY_NO =", value, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoNotEqualTo(String value) {
            addCriterion("TRAY_NO <>", value, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoGreaterThan(String value) {
            addCriterion("TRAY_NO >", value, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRAY_NO >=", value, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoLessThan(String value) {
            addCriterion("TRAY_NO <", value, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoLessThanOrEqualTo(String value) {
            addCriterion("TRAY_NO <=", value, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoLike(String value) {
            addCriterion("TRAY_NO like", value, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoNotLike(String value) {
            addCriterion("TRAY_NO not like", value, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoIn(List<String> values) {
            addCriterion("TRAY_NO in", values, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoNotIn(List<String> values) {
            addCriterion("TRAY_NO not in", values, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoBetween(String value1, String value2) {
            addCriterion("TRAY_NO between", value1, value2, "trayNo");
            return (Criteria) this;
        }

        public Criteria andTrayNoNotBetween(String value1, String value2) {
            addCriterion("TRAY_NO not between", value1, value2, "trayNo");
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