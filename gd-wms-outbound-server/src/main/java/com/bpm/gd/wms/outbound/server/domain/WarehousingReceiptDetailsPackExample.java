package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehousingReceiptDetailsPackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehousingReceiptDetailsPackExample() {
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

        public Criteria andPackNoIsNull() {
            addCriterion("PACK_NO is null");
            return (Criteria) this;
        }

        public Criteria andPackNoIsNotNull() {
            addCriterion("PACK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPackNoEqualTo(String value) {
            addCriterion("PACK_NO =", value, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoNotEqualTo(String value) {
            addCriterion("PACK_NO <>", value, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoGreaterThan(String value) {
            addCriterion("PACK_NO >", value, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoGreaterThanOrEqualTo(String value) {
            addCriterion("PACK_NO >=", value, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoLessThan(String value) {
            addCriterion("PACK_NO <", value, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoLessThanOrEqualTo(String value) {
            addCriterion("PACK_NO <=", value, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoLike(String value) {
            addCriterion("PACK_NO like", value, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoNotLike(String value) {
            addCriterion("PACK_NO not like", value, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoIn(List<String> values) {
            addCriterion("PACK_NO in", values, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoNotIn(List<String> values) {
            addCriterion("PACK_NO not in", values, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoBetween(String value1, String value2) {
            addCriterion("PACK_NO between", value1, value2, "packNo");
            return (Criteria) this;
        }

        public Criteria andPackNoNotBetween(String value1, String value2) {
            addCriterion("PACK_NO not between", value1, value2, "packNo");
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

        public Criteria andMaterialNumberQuaIsNull() {
            addCriterion("MATERIAL_NUMBER_QUA is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaIsNotNull() {
            addCriterion("MATERIAL_NUMBER_QUA is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER_QUA =", value, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaNotEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER_QUA <>", value, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaGreaterThan(Long value) {
            addCriterion("MATERIAL_NUMBER_QUA >", value, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaGreaterThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER_QUA >=", value, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaLessThan(Long value) {
            addCriterion("MATERIAL_NUMBER_QUA <", value, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaLessThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER_QUA <=", value, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaIn(List<Long> values) {
            addCriterion("MATERIAL_NUMBER_QUA in", values, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaNotIn(List<Long> values) {
            addCriterion("MATERIAL_NUMBER_QUA not in", values, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_NUMBER_QUA between", value1, value2, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberQuaNotBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_NUMBER_QUA not between", value1, value2, "materialNumberQua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaIsNull() {
            addCriterion("MATERIAL_NUMBER_NOTQUA is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaIsNotNull() {
            addCriterion("MATERIAL_NUMBER_NOTQUA is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER_NOTQUA =", value, "materialNumberNotqua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaNotEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER_NOTQUA <>", value, "materialNumberNotqua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaGreaterThan(Long value) {
            addCriterion("MATERIAL_NUMBER_NOTQUA >", value, "materialNumberNotqua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaGreaterThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER_NOTQUA >=", value, "materialNumberNotqua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaLessThan(Long value) {
            addCriterion("MATERIAL_NUMBER_NOTQUA <", value, "materialNumberNotqua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaLessThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_NUMBER_NOTQUA <=", value, "materialNumberNotqua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaIn(List<Long> values) {
            addCriterion("MATERIAL_NUMBER_NOTQUA in", values, "materialNumberNotqua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaNotIn(List<Long> values) {
            addCriterion("MATERIAL_NUMBER_NOTQUA not in", values, "materialNumberNotqua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_NUMBER_NOTQUA between", value1, value2, "materialNumberNotqua");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotquaNotBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_NUMBER_NOTQUA not between", value1, value2, "materialNumberNotqua");
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

        public Criteria andIsBoundIsNull() {
            addCriterion("IS_BOUND is null");
            return (Criteria) this;
        }

        public Criteria andIsBoundIsNotNull() {
            addCriterion("IS_BOUND is not null");
            return (Criteria) this;
        }

        public Criteria andIsBoundEqualTo(Long value) {
            addCriterion("IS_BOUND =", value, "isBound");
            return (Criteria) this;
        }

        public Criteria andIsBoundNotEqualTo(Long value) {
            addCriterion("IS_BOUND <>", value, "isBound");
            return (Criteria) this;
        }

        public Criteria andIsBoundGreaterThan(Long value) {
            addCriterion("IS_BOUND >", value, "isBound");
            return (Criteria) this;
        }

        public Criteria andIsBoundGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_BOUND >=", value, "isBound");
            return (Criteria) this;
        }

        public Criteria andIsBoundLessThan(Long value) {
            addCriterion("IS_BOUND <", value, "isBound");
            return (Criteria) this;
        }

        public Criteria andIsBoundLessThanOrEqualTo(Long value) {
            addCriterion("IS_BOUND <=", value, "isBound");
            return (Criteria) this;
        }

        public Criteria andIsBoundIn(List<Long> values) {
            addCriterion("IS_BOUND in", values, "isBound");
            return (Criteria) this;
        }

        public Criteria andIsBoundNotIn(List<Long> values) {
            addCriterion("IS_BOUND not in", values, "isBound");
            return (Criteria) this;
        }

        public Criteria andIsBoundBetween(Long value1, Long value2) {
            addCriterion("IS_BOUND between", value1, value2, "isBound");
            return (Criteria) this;
        }

        public Criteria andIsBoundNotBetween(Long value1, Long value2) {
            addCriterion("IS_BOUND not between", value1, value2, "isBound");
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