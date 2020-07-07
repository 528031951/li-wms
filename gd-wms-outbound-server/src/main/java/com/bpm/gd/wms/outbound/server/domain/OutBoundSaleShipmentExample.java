package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutBoundSaleShipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutBoundSaleShipmentExample() {
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

        public Criteria andShipmentStatusIsNull() {
            addCriterion("SHIPMENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusIsNotNull() {
            addCriterion("SHIPMENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusEqualTo(String value) {
            addCriterion("SHIPMENT_STATUS =", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusNotEqualTo(String value) {
            addCriterion("SHIPMENT_STATUS <>", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusGreaterThan(String value) {
            addCriterion("SHIPMENT_STATUS >", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_STATUS >=", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusLessThan(String value) {
            addCriterion("SHIPMENT_STATUS <", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_STATUS <=", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusLike(String value) {
            addCriterion("SHIPMENT_STATUS like", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusNotLike(String value) {
            addCriterion("SHIPMENT_STATUS not like", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusIn(List<String> values) {
            addCriterion("SHIPMENT_STATUS in", values, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusNotIn(List<String> values) {
            addCriterion("SHIPMENT_STATUS not in", values, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusBetween(String value1, String value2) {
            addCriterion("SHIPMENT_STATUS between", value1, value2, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_STATUS not between", value1, value2, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("CUSTOMER_ID like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("CUSTOMER_ID not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
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

        public Criteria andEstablishDateIsNull() {
            addCriterion("ESTABLISH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNotNull() {
            addCriterion("ESTABLISH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateEqualTo(Date value) {
            addCriterion("ESTABLISH_DATE =", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotEqualTo(Date value) {
            addCriterion("ESTABLISH_DATE <>", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThan(Date value) {
            addCriterion("ESTABLISH_DATE >", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ESTABLISH_DATE >=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThan(Date value) {
            addCriterion("ESTABLISH_DATE <", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThanOrEqualTo(Date value) {
            addCriterion("ESTABLISH_DATE <=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIn(List<Date> values) {
            addCriterion("ESTABLISH_DATE in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotIn(List<Date> values) {
            addCriterion("ESTABLISH_DATE not in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateBetween(Date value1, Date value2) {
            addCriterion("ESTABLISH_DATE between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotBetween(Date value1, Date value2) {
            addCriterion("ESTABLISH_DATE not between", value1, value2, "establishDate");
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