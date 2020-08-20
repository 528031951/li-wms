package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehousingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehousingRecordExample() {
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

        public Criteria andSupplierNoIsNull() {
            addCriterion("SUPPLIER_NO is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNoIsNotNull() {
            addCriterion("SUPPLIER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNoEqualTo(String value) {
            addCriterion("SUPPLIER_NO =", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotEqualTo(String value) {
            addCriterion("SUPPLIER_NO <>", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoGreaterThan(String value) {
            addCriterion("SUPPLIER_NO >", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NO >=", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoLessThan(String value) {
            addCriterion("SUPPLIER_NO <", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NO <=", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoLike(String value) {
            addCriterion("SUPPLIER_NO like", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotLike(String value) {
            addCriterion("SUPPLIER_NO not like", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoIn(List<String> values) {
            addCriterion("SUPPLIER_NO in", values, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotIn(List<String> values) {
            addCriterion("SUPPLIER_NO not in", values, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NO between", value1, value2, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NO not between", value1, value2, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeIsNull() {
            addCriterion("WAREHOUSING_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeIsNotNull() {
            addCriterion("WAREHOUSING_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeEqualTo(String value) {
            addCriterion("WAREHOUSING_TYPE =", value, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeNotEqualTo(String value) {
            addCriterion("WAREHOUSING_TYPE <>", value, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeGreaterThan(String value) {
            addCriterion("WAREHOUSING_TYPE >", value, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WAREHOUSING_TYPE >=", value, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeLessThan(String value) {
            addCriterion("WAREHOUSING_TYPE <", value, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeLessThanOrEqualTo(String value) {
            addCriterion("WAREHOUSING_TYPE <=", value, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeLike(String value) {
            addCriterion("WAREHOUSING_TYPE like", value, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeNotLike(String value) {
            addCriterion("WAREHOUSING_TYPE not like", value, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeIn(List<String> values) {
            addCriterion("WAREHOUSING_TYPE in", values, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeNotIn(List<String> values) {
            addCriterion("WAREHOUSING_TYPE not in", values, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeBetween(String value1, String value2) {
            addCriterion("WAREHOUSING_TYPE between", value1, value2, "warehousingType");
            return (Criteria) this;
        }

        public Criteria andWarehousingTypeNotBetween(String value1, String value2) {
            addCriterion("WAREHOUSING_TYPE not between", value1, value2, "warehousingType");
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

        public Criteria andWarehousingTimeIsNull() {
            addCriterion("WAREHOUSING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeIsNotNull() {
            addCriterion("WAREHOUSING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeEqualTo(Date value) {
            addCriterion("WAREHOUSING_TIME =", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeNotEqualTo(Date value) {
            addCriterion("WAREHOUSING_TIME <>", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeGreaterThan(Date value) {
            addCriterion("WAREHOUSING_TIME >", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WAREHOUSING_TIME >=", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeLessThan(Date value) {
            addCriterion("WAREHOUSING_TIME <", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeLessThanOrEqualTo(Date value) {
            addCriterion("WAREHOUSING_TIME <=", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeIn(List<Date> values) {
            addCriterion("WAREHOUSING_TIME in", values, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeNotIn(List<Date> values) {
            addCriterion("WAREHOUSING_TIME not in", values, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeBetween(Date value1, Date value2) {
            addCriterion("WAREHOUSING_TIME between", value1, value2, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeNotBetween(Date value1, Date value2) {
            addCriterion("WAREHOUSING_TIME not between", value1, value2, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andBoxNoIsNull() {
            addCriterion("BOX_NO is null");
            return (Criteria) this;
        }

        public Criteria andBoxNoIsNotNull() {
            addCriterion("BOX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNoEqualTo(String value) {
            addCriterion("BOX_NO =", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotEqualTo(String value) {
            addCriterion("BOX_NO <>", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoGreaterThan(String value) {
            addCriterion("BOX_NO >", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoGreaterThanOrEqualTo(String value) {
            addCriterion("BOX_NO >=", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoLessThan(String value) {
            addCriterion("BOX_NO <", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoLessThanOrEqualTo(String value) {
            addCriterion("BOX_NO <=", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoLike(String value) {
            addCriterion("BOX_NO like", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotLike(String value) {
            addCriterion("BOX_NO not like", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoIn(List<String> values) {
            addCriterion("BOX_NO in", values, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotIn(List<String> values) {
            addCriterion("BOX_NO not in", values, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoBetween(String value1, String value2) {
            addCriterion("BOX_NO between", value1, value2, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotBetween(String value1, String value2) {
            addCriterion("BOX_NO not between", value1, value2, "boxNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberIsNull() {
            addCriterion("MATERIAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberIsNotNull() {
            addCriterion("MATERIAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER =", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER <>", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberGreaterThan(Long value) {
            addCriterion("MATERIAL_NUMBER >", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER >=", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberLessThan(Long value) {
            addCriterion("MATERIAL_NUMBER <", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberLessThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER <=", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberIn(List<Long> values) {
            addCriterion("MATERIAL_NUMBER in", values, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotIn(List<Long> values) {
            addCriterion("MATERIAL_NUMBER not in", values, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_NUMBER between", value1, value2, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_NUMBER not between", value1, value2, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("OPERATOR_ID like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("OPERATOR_ID not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andPalletNoIsNull() {
            addCriterion("PALLET_NO is null");
            return (Criteria) this;
        }

        public Criteria andPalletNoIsNotNull() {
            addCriterion("PALLET_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPalletNoEqualTo(String value) {
            addCriterion("PALLET_NO =", value, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoNotEqualTo(String value) {
            addCriterion("PALLET_NO <>", value, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoGreaterThan(String value) {
            addCriterion("PALLET_NO >", value, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoGreaterThanOrEqualTo(String value) {
            addCriterion("PALLET_NO >=", value, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoLessThan(String value) {
            addCriterion("PALLET_NO <", value, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoLessThanOrEqualTo(String value) {
            addCriterion("PALLET_NO <=", value, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoLike(String value) {
            addCriterion("PALLET_NO like", value, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoNotLike(String value) {
            addCriterion("PALLET_NO not like", value, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoIn(List<String> values) {
            addCriterion("PALLET_NO in", values, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoNotIn(List<String> values) {
            addCriterion("PALLET_NO not in", values, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoBetween(String value1, String value2) {
            addCriterion("PALLET_NO between", value1, value2, "palletNo");
            return (Criteria) this;
        }

        public Criteria andPalletNoNotBetween(String value1, String value2) {
            addCriterion("PALLET_NO not between", value1, value2, "palletNo");
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