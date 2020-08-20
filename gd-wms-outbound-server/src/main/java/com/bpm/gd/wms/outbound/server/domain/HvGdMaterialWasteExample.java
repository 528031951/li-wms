package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.List;

public class HvGdMaterialWasteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HvGdMaterialWasteExample() {
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

        public Criteria andWorkOrderIdIsNull() {
            addCriterion("WORK_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIsNotNull() {
            addCriterion("WORK_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdEqualTo(Long value) {
            addCriterion("WORK_ORDER_ID =", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotEqualTo(Long value) {
            addCriterion("WORK_ORDER_ID <>", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThan(Long value) {
            addCriterion("WORK_ORDER_ID >", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WORK_ORDER_ID >=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThan(Long value) {
            addCriterion("WORK_ORDER_ID <", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("WORK_ORDER_ID <=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIn(List<Long> values) {
            addCriterion("WORK_ORDER_ID in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotIn(List<Long> values) {
            addCriterion("WORK_ORDER_ID not in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdBetween(Long value1, Long value2) {
            addCriterion("WORK_ORDER_ID between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("WORK_ORDER_ID not between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeIsNull() {
            addCriterion("MATERIEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeIsNotNull() {
            addCriterion("MATERIEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeEqualTo(String value) {
            addCriterion("MATERIEL_CODE =", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeNotEqualTo(String value) {
            addCriterion("MATERIEL_CODE <>", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeGreaterThan(String value) {
            addCriterion("MATERIEL_CODE >", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIEL_CODE >=", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeLessThan(String value) {
            addCriterion("MATERIEL_CODE <", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeLessThanOrEqualTo(String value) {
            addCriterion("MATERIEL_CODE <=", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeLike(String value) {
            addCriterion("MATERIEL_CODE like", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeNotLike(String value) {
            addCriterion("MATERIEL_CODE not like", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeIn(List<String> values) {
            addCriterion("MATERIEL_CODE in", values, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeNotIn(List<String> values) {
            addCriterion("MATERIEL_CODE not in", values, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeBetween(String value1, String value2) {
            addCriterion("MATERIEL_CODE between", value1, value2, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeNotBetween(String value1, String value2) {
            addCriterion("MATERIEL_CODE not between", value1, value2, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeIsNull() {
            addCriterion("MATERIEL_BATCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeIsNotNull() {
            addCriterion("MATERIEL_BATCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeEqualTo(String value) {
            addCriterion("MATERIEL_BATCH_CODE =", value, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeNotEqualTo(String value) {
            addCriterion("MATERIEL_BATCH_CODE <>", value, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeGreaterThan(String value) {
            addCriterion("MATERIEL_BATCH_CODE >", value, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIEL_BATCH_CODE >=", value, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeLessThan(String value) {
            addCriterion("MATERIEL_BATCH_CODE <", value, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("MATERIEL_BATCH_CODE <=", value, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeLike(String value) {
            addCriterion("MATERIEL_BATCH_CODE like", value, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeNotLike(String value) {
            addCriterion("MATERIEL_BATCH_CODE not like", value, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeIn(List<String> values) {
            addCriterion("MATERIEL_BATCH_CODE in", values, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeNotIn(List<String> values) {
            addCriterion("MATERIEL_BATCH_CODE not in", values, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeBetween(String value1, String value2) {
            addCriterion("MATERIEL_BATCH_CODE between", value1, value2, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterielBatchCodeNotBetween(String value1, String value2) {
            addCriterion("MATERIEL_BATCH_CODE not between", value1, value2, "materielBatchCode");
            return (Criteria) this;
        }

        public Criteria andWasteNumberIsNull() {
            addCriterion("WASTE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andWasteNumberIsNotNull() {
            addCriterion("WASTE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andWasteNumberEqualTo(Long value) {
            addCriterion("WASTE_NUMBER =", value, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andWasteNumberNotEqualTo(Long value) {
            addCriterion("WASTE_NUMBER <>", value, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andWasteNumberGreaterThan(Long value) {
            addCriterion("WASTE_NUMBER >", value, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andWasteNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("WASTE_NUMBER >=", value, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andWasteNumberLessThan(Long value) {
            addCriterion("WASTE_NUMBER <", value, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andWasteNumberLessThanOrEqualTo(Long value) {
            addCriterion("WASTE_NUMBER <=", value, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andWasteNumberIn(List<Long> values) {
            addCriterion("WASTE_NUMBER in", values, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andWasteNumberNotIn(List<Long> values) {
            addCriterion("WASTE_NUMBER not in", values, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andWasteNumberBetween(Long value1, Long value2) {
            addCriterion("WASTE_NUMBER between", value1, value2, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andWasteNumberNotBetween(Long value1, Long value2) {
            addCriterion("WASTE_NUMBER not between", value1, value2, "wasteNumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andWasteTypeIsNull() {
            addCriterion("WASTE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWasteTypeIsNotNull() {
            addCriterion("WASTE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWasteTypeEqualTo(Integer value) {
            addCriterion("WASTE_TYPE =", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeNotEqualTo(Integer value) {
            addCriterion("WASTE_TYPE <>", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeGreaterThan(Integer value) {
            addCriterion("WASTE_TYPE >", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WASTE_TYPE >=", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeLessThan(Integer value) {
            addCriterion("WASTE_TYPE <", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeLessThanOrEqualTo(Integer value) {
            addCriterion("WASTE_TYPE <=", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeIn(List<Integer> values) {
            addCriterion("WASTE_TYPE in", values, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeNotIn(List<Integer> values) {
            addCriterion("WASTE_TYPE not in", values, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeBetween(Integer value1, Integer value2) {
            addCriterion("WASTE_TYPE between", value1, value2, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("WASTE_TYPE not between", value1, value2, "wasteType");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitIsNull() {
            addCriterion("MATERIEL_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitIsNotNull() {
            addCriterion("MATERIEL_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitEqualTo(String value) {
            addCriterion("MATERIEL_UNIT =", value, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitNotEqualTo(String value) {
            addCriterion("MATERIEL_UNIT <>", value, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitGreaterThan(String value) {
            addCriterion("MATERIEL_UNIT >", value, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIEL_UNIT >=", value, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitLessThan(String value) {
            addCriterion("MATERIEL_UNIT <", value, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitLessThanOrEqualTo(String value) {
            addCriterion("MATERIEL_UNIT <=", value, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitLike(String value) {
            addCriterion("MATERIEL_UNIT like", value, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitNotLike(String value) {
            addCriterion("MATERIEL_UNIT not like", value, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitIn(List<String> values) {
            addCriterion("MATERIEL_UNIT in", values, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitNotIn(List<String> values) {
            addCriterion("MATERIEL_UNIT not in", values, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitBetween(String value1, String value2) {
            addCriterion("MATERIEL_UNIT between", value1, value2, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andMaterielUnitNotBetween(String value1, String value2) {
            addCriterion("MATERIEL_UNIT not between", value1, value2, "materielUnit");
            return (Criteria) this;
        }

        public Criteria andEigenvalueIsNull() {
            addCriterion("EIGENVALUE is null");
            return (Criteria) this;
        }

        public Criteria andEigenvalueIsNotNull() {
            addCriterion("EIGENVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andEigenvalueEqualTo(String value) {
            addCriterion("EIGENVALUE =", value, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueNotEqualTo(String value) {
            addCriterion("EIGENVALUE <>", value, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueGreaterThan(String value) {
            addCriterion("EIGENVALUE >", value, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueGreaterThanOrEqualTo(String value) {
            addCriterion("EIGENVALUE >=", value, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueLessThan(String value) {
            addCriterion("EIGENVALUE <", value, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueLessThanOrEqualTo(String value) {
            addCriterion("EIGENVALUE <=", value, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueLike(String value) {
            addCriterion("EIGENVALUE like", value, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueNotLike(String value) {
            addCriterion("EIGENVALUE not like", value, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueIn(List<String> values) {
            addCriterion("EIGENVALUE in", values, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueNotIn(List<String> values) {
            addCriterion("EIGENVALUE not in", values, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueBetween(String value1, String value2) {
            addCriterion("EIGENVALUE between", value1, value2, "eigenvalue");
            return (Criteria) this;
        }

        public Criteria andEigenvalueNotBetween(String value1, String value2) {
            addCriterion("EIGENVALUE not between", value1, value2, "eigenvalue");
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