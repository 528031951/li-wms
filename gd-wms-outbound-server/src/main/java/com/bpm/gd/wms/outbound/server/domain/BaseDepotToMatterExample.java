package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.List;

public class BaseDepotToMatterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseDepotToMatterExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andMatterIdIsNull() {
            addCriterion("MATTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNotNull() {
            addCriterion("MATTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatterIdEqualTo(String value) {
            addCriterion("MATTER_ID =", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotEqualTo(String value) {
            addCriterion("MATTER_ID <>", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThan(String value) {
            addCriterion("MATTER_ID >", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_ID >=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThan(String value) {
            addCriterion("MATTER_ID <", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThanOrEqualTo(String value) {
            addCriterion("MATTER_ID <=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLike(String value) {
            addCriterion("MATTER_ID like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotLike(String value) {
            addCriterion("MATTER_ID not like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdIn(List<String> values) {
            addCriterion("MATTER_ID in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotIn(List<String> values) {
            addCriterion("MATTER_ID not in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdBetween(String value1, String value2) {
            addCriterion("MATTER_ID between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotBetween(String value1, String value2) {
            addCriterion("MATTER_ID not between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andAllNumberIsNull() {
            addCriterion("ALL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAllNumberIsNotNull() {
            addCriterion("ALL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAllNumberEqualTo(Long value) {
            addCriterion("ALL_NUMBER =", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberNotEqualTo(Long value) {
            addCriterion("ALL_NUMBER <>", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberGreaterThan(Long value) {
            addCriterion("ALL_NUMBER >", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ALL_NUMBER >=", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberLessThan(Long value) {
            addCriterion("ALL_NUMBER <", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberLessThanOrEqualTo(Long value) {
            addCriterion("ALL_NUMBER <=", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberIn(List<Long> values) {
            addCriterion("ALL_NUMBER in", values, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberNotIn(List<Long> values) {
            addCriterion("ALL_NUMBER not in", values, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberBetween(Long value1, Long value2) {
            addCriterion("ALL_NUMBER between", value1, value2, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberNotBetween(Long value1, Long value2) {
            addCriterion("ALL_NUMBER not between", value1, value2, "allNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberIsNull() {
            addCriterion("IN_USE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andInUseNumberIsNotNull() {
            addCriterion("IN_USE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andInUseNumberEqualTo(Long value) {
            addCriterion("IN_USE_NUMBER =", value, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberNotEqualTo(Long value) {
            addCriterion("IN_USE_NUMBER <>", value, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberGreaterThan(Long value) {
            addCriterion("IN_USE_NUMBER >", value, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("IN_USE_NUMBER >=", value, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberLessThan(Long value) {
            addCriterion("IN_USE_NUMBER <", value, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberLessThanOrEqualTo(Long value) {
            addCriterion("IN_USE_NUMBER <=", value, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberIn(List<Long> values) {
            addCriterion("IN_USE_NUMBER in", values, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberNotIn(List<Long> values) {
            addCriterion("IN_USE_NUMBER not in", values, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberBetween(Long value1, Long value2) {
            addCriterion("IN_USE_NUMBER between", value1, value2, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andInUseNumberNotBetween(Long value1, Long value2) {
            addCriterion("IN_USE_NUMBER not between", value1, value2, "inUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberIsNull() {
            addCriterion("OUT_USE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberIsNotNull() {
            addCriterion("OUT_USE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberEqualTo(Long value) {
            addCriterion("OUT_USE_NUMBER =", value, "outUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberNotEqualTo(Long value) {
            addCriterion("OUT_USE_NUMBER <>", value, "outUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberGreaterThan(Long value) {
            addCriterion("OUT_USE_NUMBER >", value, "outUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("OUT_USE_NUMBER >=", value, "outUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberLessThan(Long value) {
            addCriterion("OUT_USE_NUMBER <", value, "outUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberLessThanOrEqualTo(Long value) {
            addCriterion("OUT_USE_NUMBER <=", value, "outUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberIn(List<Long> values) {
            addCriterion("OUT_USE_NUMBER in", values, "outUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberNotIn(List<Long> values) {
            addCriterion("OUT_USE_NUMBER not in", values, "outUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberBetween(Long value1, Long value2) {
            addCriterion("OUT_USE_NUMBER between", value1, value2, "outUseNumber");
            return (Criteria) this;
        }

        public Criteria andOutUseNumberNotBetween(Long value1, Long value2) {
            addCriterion("OUT_USE_NUMBER not between", value1, value2, "outUseNumber");
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