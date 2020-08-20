package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehousingFrozenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehousingFrozenExample() {
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

        public Criteria andSupplierCodeIsNull() {
            addCriterion("SUPPLIER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNotNull() {
            addCriterion("SUPPLIER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeEqualTo(String value) {
            addCriterion("SUPPLIER_CODE =", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotEqualTo(String value) {
            addCriterion("SUPPLIER_CODE <>", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThan(String value) {
            addCriterion("SUPPLIER_CODE >", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CODE >=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThan(String value) {
            addCriterion("SUPPLIER_CODE <", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CODE <=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLike(String value) {
            addCriterion("SUPPLIER_CODE like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotLike(String value) {
            addCriterion("SUPPLIER_CODE not like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIn(List<String> values) {
            addCriterion("SUPPLIER_CODE in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotIn(List<String> values) {
            addCriterion("SUPPLIER_CODE not in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CODE between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CODE not between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberIsNull() {
            addCriterion("MATERIAL_BATCH_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberIsNotNull() {
            addCriterion("MATERIAL_BATCH_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberEqualTo(String value) {
            addCriterion("MATERIAL_BATCH_NUMBER =", value, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberNotEqualTo(String value) {
            addCriterion("MATERIAL_BATCH_NUMBER <>", value, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberGreaterThan(String value) {
            addCriterion("MATERIAL_BATCH_NUMBER >", value, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_BATCH_NUMBER >=", value, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberLessThan(String value) {
            addCriterion("MATERIAL_BATCH_NUMBER <", value, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_BATCH_NUMBER <=", value, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberLike(String value) {
            addCriterion("MATERIAL_BATCH_NUMBER like", value, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberNotLike(String value) {
            addCriterion("MATERIAL_BATCH_NUMBER not like", value, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberIn(List<String> values) {
            addCriterion("MATERIAL_BATCH_NUMBER in", values, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberNotIn(List<String> values) {
            addCriterion("MATERIAL_BATCH_NUMBER not in", values, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberBetween(String value1, String value2) {
            addCriterion("MATERIAL_BATCH_NUMBER between", value1, value2, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchNumberNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_BATCH_NUMBER not between", value1, value2, "materialBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDepotIdIsNull() {
            addCriterion("DEPOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepotIdIsNotNull() {
            addCriterion("DEPOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepotIdEqualTo(String value) {
            addCriterion("DEPOT_ID =", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotEqualTo(String value) {
            addCriterion("DEPOT_ID <>", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThan(String value) {
            addCriterion("DEPOT_ID >", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPOT_ID >=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThan(String value) {
            addCriterion("DEPOT_ID <", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThanOrEqualTo(String value) {
            addCriterion("DEPOT_ID <=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLike(String value) {
            addCriterion("DEPOT_ID like", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotLike(String value) {
            addCriterion("DEPOT_ID not like", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdIn(List<String> values) {
            addCriterion("DEPOT_ID in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotIn(List<String> values) {
            addCriterion("DEPOT_ID not in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdBetween(String value1, String value2) {
            addCriterion("DEPOT_ID between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotBetween(String value1, String value2) {
            addCriterion("DEPOT_ID not between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIsNull() {
            addCriterion("BASE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIsNotNull() {
            addCriterion("BASE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseUnitEqualTo(String value) {
            addCriterion("BASE_UNIT =", value, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitNotEqualTo(String value) {
            addCriterion("BASE_UNIT <>", value, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitGreaterThan(String value) {
            addCriterion("BASE_UNIT >", value, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitGreaterThanOrEqualTo(String value) {
            addCriterion("BASE_UNIT >=", value, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitLessThan(String value) {
            addCriterion("BASE_UNIT <", value, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitLessThanOrEqualTo(String value) {
            addCriterion("BASE_UNIT <=", value, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitLike(String value) {
            addCriterion("BASE_UNIT like", value, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitNotLike(String value) {
            addCriterion("BASE_UNIT not like", value, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIn(List<String> values) {
            addCriterion("BASE_UNIT in", values, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitNotIn(List<String> values) {
            addCriterion("BASE_UNIT not in", values, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitBetween(String value1, String value2) {
            addCriterion("BASE_UNIT between", value1, value2, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseUnitNotBetween(String value1, String value2) {
            addCriterion("BASE_UNIT not between", value1, value2, "baseUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberIsNull() {
            addCriterion("MATERIAL_RECORD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberIsNotNull() {
            addCriterion("MATERIAL_RECORD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberEqualTo(Long value) {
            addCriterion("MATERIAL_RECORD_NUMBER =", value, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberNotEqualTo(Long value) {
            addCriterion("MATERIAL_RECORD_NUMBER <>", value, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberGreaterThan(Long value) {
            addCriterion("MATERIAL_RECORD_NUMBER >", value, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_RECORD_NUMBER >=", value, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberLessThan(Long value) {
            addCriterion("MATERIAL_RECORD_NUMBER <", value, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberLessThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_RECORD_NUMBER <=", value, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberIn(List<Long> values) {
            addCriterion("MATERIAL_RECORD_NUMBER in", values, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberNotIn(List<Long> values) {
            addCriterion("MATERIAL_RECORD_NUMBER not in", values, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_RECORD_NUMBER between", value1, value2, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRecordNumberNotBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_RECORD_NUMBER not between", value1, value2, "materialRecordNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberIsNull() {
            addCriterion("MATERIAL_REAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberIsNotNull() {
            addCriterion("MATERIAL_REAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberEqualTo(Long value) {
            addCriterion("MATERIAL_REAL_NUMBER =", value, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberNotEqualTo(Long value) {
            addCriterion("MATERIAL_REAL_NUMBER <>", value, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberGreaterThan(Long value) {
            addCriterion("MATERIAL_REAL_NUMBER >", value, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_REAL_NUMBER >=", value, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberLessThan(Long value) {
            addCriterion("MATERIAL_REAL_NUMBER <", value, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberLessThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_REAL_NUMBER <=", value, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberIn(List<Long> values) {
            addCriterion("MATERIAL_REAL_NUMBER in", values, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberNotIn(List<Long> values) {
            addCriterion("MATERIAL_REAL_NUMBER not in", values, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_REAL_NUMBER between", value1, value2, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialRealNumberNotBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_REAL_NUMBER not between", value1, value2, "materialRealNumber");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeIsNull() {
            addCriterion("FROZEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeIsNotNull() {
            addCriterion("FROZEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeEqualTo(Long value) {
            addCriterion("FROZEN_TYPE =", value, "frozenType");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeNotEqualTo(Long value) {
            addCriterion("FROZEN_TYPE <>", value, "frozenType");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeGreaterThan(Long value) {
            addCriterion("FROZEN_TYPE >", value, "frozenType");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("FROZEN_TYPE >=", value, "frozenType");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeLessThan(Long value) {
            addCriterion("FROZEN_TYPE <", value, "frozenType");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeLessThanOrEqualTo(Long value) {
            addCriterion("FROZEN_TYPE <=", value, "frozenType");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeIn(List<Long> values) {
            addCriterion("FROZEN_TYPE in", values, "frozenType");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeNotIn(List<Long> values) {
            addCriterion("FROZEN_TYPE not in", values, "frozenType");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeBetween(Long value1, Long value2) {
            addCriterion("FROZEN_TYPE between", value1, value2, "frozenType");
            return (Criteria) this;
        }

        public Criteria andFrozenTypeNotBetween(Long value1, Long value2) {
            addCriterion("FROZEN_TYPE not between", value1, value2, "frozenType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andIsFrozenIsNull() {
            addCriterion("IS_FROZEN is null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIsNotNull() {
            addCriterion("IS_FROZEN is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenEqualTo(Long value) {
            addCriterion("IS_FROZEN =", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotEqualTo(Long value) {
            addCriterion("IS_FROZEN <>", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThan(Long value) {
            addCriterion("IS_FROZEN >", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_FROZEN >=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThan(Long value) {
            addCriterion("IS_FROZEN <", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThanOrEqualTo(Long value) {
            addCriterion("IS_FROZEN <=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIn(List<Long> values) {
            addCriterion("IS_FROZEN in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotIn(List<Long> values) {
            addCriterion("IS_FROZEN not in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenBetween(Long value1, Long value2) {
            addCriterion("IS_FROZEN between", value1, value2, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotBetween(Long value1, Long value2) {
            addCriterion("IS_FROZEN not between", value1, value2, "isFrozen");
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