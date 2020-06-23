package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutBoundFillBillTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutBoundFillBillTaskExample() {
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

        public Criteria andFillBillIdIsNull() {
            addCriterion("FILL_BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFillBillIdIsNotNull() {
            addCriterion("FILL_BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFillBillIdEqualTo(String value) {
            addCriterion("FILL_BILL_ID =", value, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdNotEqualTo(String value) {
            addCriterion("FILL_BILL_ID <>", value, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdGreaterThan(String value) {
            addCriterion("FILL_BILL_ID >", value, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("FILL_BILL_ID >=", value, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdLessThan(String value) {
            addCriterion("FILL_BILL_ID <", value, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdLessThanOrEqualTo(String value) {
            addCriterion("FILL_BILL_ID <=", value, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdLike(String value) {
            addCriterion("FILL_BILL_ID like", value, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdNotLike(String value) {
            addCriterion("FILL_BILL_ID not like", value, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdIn(List<String> values) {
            addCriterion("FILL_BILL_ID in", values, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdNotIn(List<String> values) {
            addCriterion("FILL_BILL_ID not in", values, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdBetween(String value1, String value2) {
            addCriterion("FILL_BILL_ID between", value1, value2, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andFillBillIdNotBetween(String value1, String value2) {
            addCriterion("FILL_BILL_ID not between", value1, value2, "fillBillId");
            return (Criteria) this;
        }

        public Criteria andWorkLineIsNull() {
            addCriterion("WORK_LINE is null");
            return (Criteria) this;
        }

        public Criteria andWorkLineIsNotNull() {
            addCriterion("WORK_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLineEqualTo(String value) {
            addCriterion("WORK_LINE =", value, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineNotEqualTo(String value) {
            addCriterion("WORK_LINE <>", value, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineGreaterThan(String value) {
            addCriterion("WORK_LINE >", value, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_LINE >=", value, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineLessThan(String value) {
            addCriterion("WORK_LINE <", value, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineLessThanOrEqualTo(String value) {
            addCriterion("WORK_LINE <=", value, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineLike(String value) {
            addCriterion("WORK_LINE like", value, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineNotLike(String value) {
            addCriterion("WORK_LINE not like", value, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineIn(List<String> values) {
            addCriterion("WORK_LINE in", values, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineNotIn(List<String> values) {
            addCriterion("WORK_LINE not in", values, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineBetween(String value1, String value2) {
            addCriterion("WORK_LINE between", value1, value2, "workLine");
            return (Criteria) this;
        }

        public Criteria andWorkLineNotBetween(String value1, String value2) {
            addCriterion("WORK_LINE not between", value1, value2, "workLine");
            return (Criteria) this;
        }

        public Criteria andMatterNoIsNull() {
            addCriterion("MATTER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMatterNoIsNotNull() {
            addCriterion("MATTER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNoEqualTo(String value) {
            addCriterion("MATTER_NO =", value, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoNotEqualTo(String value) {
            addCriterion("MATTER_NO <>", value, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoGreaterThan(String value) {
            addCriterion("MATTER_NO >", value, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_NO >=", value, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoLessThan(String value) {
            addCriterion("MATTER_NO <", value, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoLessThanOrEqualTo(String value) {
            addCriterion("MATTER_NO <=", value, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoLike(String value) {
            addCriterion("MATTER_NO like", value, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoNotLike(String value) {
            addCriterion("MATTER_NO not like", value, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoIn(List<String> values) {
            addCriterion("MATTER_NO in", values, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoNotIn(List<String> values) {
            addCriterion("MATTER_NO not in", values, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoBetween(String value1, String value2) {
            addCriterion("MATTER_NO between", value1, value2, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNoNotBetween(String value1, String value2) {
            addCriterion("MATTER_NO not between", value1, value2, "matterNo");
            return (Criteria) this;
        }

        public Criteria andMatterNumberIsNull() {
            addCriterion("MATTER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMatterNumberIsNotNull() {
            addCriterion("MATTER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNumberEqualTo(Long value) {
            addCriterion("MATTER_NUMBER =", value, "matterNumber");
            return (Criteria) this;
        }

        public Criteria andMatterNumberNotEqualTo(Long value) {
            addCriterion("MATTER_NUMBER <>", value, "matterNumber");
            return (Criteria) this;
        }

        public Criteria andMatterNumberGreaterThan(Long value) {
            addCriterion("MATTER_NUMBER >", value, "matterNumber");
            return (Criteria) this;
        }

        public Criteria andMatterNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("MATTER_NUMBER >=", value, "matterNumber");
            return (Criteria) this;
        }

        public Criteria andMatterNumberLessThan(Long value) {
            addCriterion("MATTER_NUMBER <", value, "matterNumber");
            return (Criteria) this;
        }

        public Criteria andMatterNumberLessThanOrEqualTo(Long value) {
            addCriterion("MATTER_NUMBER <=", value, "matterNumber");
            return (Criteria) this;
        }

        public Criteria andMatterNumberIn(List<Long> values) {
            addCriterion("MATTER_NUMBER in", values, "matterNumber");
            return (Criteria) this;
        }

        public Criteria andMatterNumberNotIn(List<Long> values) {
            addCriterion("MATTER_NUMBER not in", values, "matterNumber");
            return (Criteria) this;
        }

        public Criteria andMatterNumberBetween(Long value1, Long value2) {
            addCriterion("MATTER_NUMBER between", value1, value2, "matterNumber");
            return (Criteria) this;
        }

        public Criteria andMatterNumberNotBetween(Long value1, Long value2) {
            addCriterion("MATTER_NUMBER not between", value1, value2, "matterNumber");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdIsNull() {
            addCriterion("TASK_LEADER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdIsNotNull() {
            addCriterion("TASK_LEADER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdEqualTo(String value) {
            addCriterion("TASK_LEADER_ID =", value, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdNotEqualTo(String value) {
            addCriterion("TASK_LEADER_ID <>", value, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdGreaterThan(String value) {
            addCriterion("TASK_LEADER_ID >", value, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_LEADER_ID >=", value, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdLessThan(String value) {
            addCriterion("TASK_LEADER_ID <", value, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_LEADER_ID <=", value, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdLike(String value) {
            addCriterion("TASK_LEADER_ID like", value, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdNotLike(String value) {
            addCriterion("TASK_LEADER_ID not like", value, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdIn(List<String> values) {
            addCriterion("TASK_LEADER_ID in", values, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdNotIn(List<String> values) {
            addCriterion("TASK_LEADER_ID not in", values, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdBetween(String value1, String value2) {
            addCriterion("TASK_LEADER_ID between", value1, value2, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskLeaderIdNotBetween(String value1, String value2) {
            addCriterion("TASK_LEADER_ID not between", value1, value2, "taskLeaderId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("TASK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("TASK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(String value) {
            addCriterion("TASK_STATUS =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(String value) {
            addCriterion("TASK_STATUS <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(String value) {
            addCriterion("TASK_STATUS >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(String value) {
            addCriterion("TASK_STATUS <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLike(String value) {
            addCriterion("TASK_STATUS like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotLike(String value) {
            addCriterion("TASK_STATUS not like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<String> values) {
            addCriterion("TASK_STATUS in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<String> values) {
            addCriterion("TASK_STATUS not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(String value1, String value2) {
            addCriterion("TASK_STATUS between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(String value1, String value2) {
            addCriterion("TASK_STATUS not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andMatterSpecIsNull() {
            addCriterion("MATTER_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andMatterSpecIsNotNull() {
            addCriterion("MATTER_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andMatterSpecEqualTo(String value) {
            addCriterion("MATTER_SPEC =", value, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecNotEqualTo(String value) {
            addCriterion("MATTER_SPEC <>", value, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecGreaterThan(String value) {
            addCriterion("MATTER_SPEC >", value, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_SPEC >=", value, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecLessThan(String value) {
            addCriterion("MATTER_SPEC <", value, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecLessThanOrEqualTo(String value) {
            addCriterion("MATTER_SPEC <=", value, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecLike(String value) {
            addCriterion("MATTER_SPEC like", value, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecNotLike(String value) {
            addCriterion("MATTER_SPEC not like", value, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecIn(List<String> values) {
            addCriterion("MATTER_SPEC in", values, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecNotIn(List<String> values) {
            addCriterion("MATTER_SPEC not in", values, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecBetween(String value1, String value2) {
            addCriterion("MATTER_SPEC between", value1, value2, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterSpecNotBetween(String value1, String value2) {
            addCriterion("MATTER_SPEC not between", value1, value2, "matterSpec");
            return (Criteria) this;
        }

        public Criteria andMatterNameIsNull() {
            addCriterion("MATTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMatterNameIsNotNull() {
            addCriterion("MATTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNameEqualTo(String value) {
            addCriterion("MATTER_NAME =", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotEqualTo(String value) {
            addCriterion("MATTER_NAME <>", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThan(String value) {
            addCriterion("MATTER_NAME >", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_NAME >=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThan(String value) {
            addCriterion("MATTER_NAME <", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThanOrEqualTo(String value) {
            addCriterion("MATTER_NAME <=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLike(String value) {
            addCriterion("MATTER_NAME like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotLike(String value) {
            addCriterion("MATTER_NAME not like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameIn(List<String> values) {
            addCriterion("MATTER_NAME in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotIn(List<String> values) {
            addCriterion("MATTER_NAME not in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameBetween(String value1, String value2) {
            addCriterion("MATTER_NAME between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotBetween(String value1, String value2) {
            addCriterion("MATTER_NAME not between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNull() {
            addCriterion("BILL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNotNull() {
            addCriterion("BILL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBillDateEqualTo(Date value) {
            addCriterion("BILL_DATE =", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotEqualTo(Date value) {
            addCriterion("BILL_DATE <>", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThan(Date value) {
            addCriterion("BILL_DATE >", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BILL_DATE >=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThan(Date value) {
            addCriterion("BILL_DATE <", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThanOrEqualTo(Date value) {
            addCriterion("BILL_DATE <=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIn(List<Date> values) {
            addCriterion("BILL_DATE in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotIn(List<Date> values) {
            addCriterion("BILL_DATE not in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateBetween(Date value1, Date value2) {
            addCriterion("BILL_DATE between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotBetween(Date value1, Date value2) {
            addCriterion("BILL_DATE not between", value1, value2, "billDate");
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

        public Criteria andOutStatusIsNull() {
            addCriterion("OUT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOutStatusIsNotNull() {
            addCriterion("OUT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOutStatusEqualTo(String value) {
            addCriterion("OUT_STATUS =", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotEqualTo(String value) {
            addCriterion("OUT_STATUS <>", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThan(String value) {
            addCriterion("OUT_STATUS >", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_STATUS >=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThan(String value) {
            addCriterion("OUT_STATUS <", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThanOrEqualTo(String value) {
            addCriterion("OUT_STATUS <=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLike(String value) {
            addCriterion("OUT_STATUS like", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotLike(String value) {
            addCriterion("OUT_STATUS not like", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusIn(List<String> values) {
            addCriterion("OUT_STATUS in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotIn(List<String> values) {
            addCriterion("OUT_STATUS not in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusBetween(String value1, String value2) {
            addCriterion("OUT_STATUS between", value1, value2, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotBetween(String value1, String value2) {
            addCriterion("OUT_STATUS not between", value1, value2, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNull() {
            addCriterion("OUT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNotNull() {
            addCriterion("OUT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumberEqualTo(Long value) {
            addCriterion("OUT_NUMBER =", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotEqualTo(Long value) {
            addCriterion("OUT_NUMBER <>", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThan(Long value) {
            addCriterion("OUT_NUMBER >", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("OUT_NUMBER >=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThan(Long value) {
            addCriterion("OUT_NUMBER <", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThanOrEqualTo(Long value) {
            addCriterion("OUT_NUMBER <=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberIn(List<Long> values) {
            addCriterion("OUT_NUMBER in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotIn(List<Long> values) {
            addCriterion("OUT_NUMBER not in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberBetween(Long value1, Long value2) {
            addCriterion("OUT_NUMBER between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotBetween(Long value1, Long value2) {
            addCriterion("OUT_NUMBER not between", value1, value2, "outNumber");
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

        public Criteria andAddUseNumberIsNull() {
            addCriterion("ADD_USE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberIsNotNull() {
            addCriterion("ADD_USE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberEqualTo(Long value) {
            addCriterion("ADD_USE_NUMBER =", value, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberNotEqualTo(Long value) {
            addCriterion("ADD_USE_NUMBER <>", value, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberGreaterThan(Long value) {
            addCriterion("ADD_USE_NUMBER >", value, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ADD_USE_NUMBER >=", value, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberLessThan(Long value) {
            addCriterion("ADD_USE_NUMBER <", value, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberLessThanOrEqualTo(Long value) {
            addCriterion("ADD_USE_NUMBER <=", value, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberIn(List<Long> values) {
            addCriterion("ADD_USE_NUMBER in", values, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberNotIn(List<Long> values) {
            addCriterion("ADD_USE_NUMBER not in", values, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberBetween(Long value1, Long value2) {
            addCriterion("ADD_USE_NUMBER between", value1, value2, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andAddUseNumberNotBetween(Long value1, Long value2) {
            addCriterion("ADD_USE_NUMBER not between", value1, value2, "addUseNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberIsNull() {
            addCriterion("ONE_AREA_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberIsNotNull() {
            addCriterion("ONE_AREA_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberEqualTo(Long value) {
            addCriterion("ONE_AREA_NUMBER =", value, "oneAreaNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberNotEqualTo(Long value) {
            addCriterion("ONE_AREA_NUMBER <>", value, "oneAreaNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberGreaterThan(Long value) {
            addCriterion("ONE_AREA_NUMBER >", value, "oneAreaNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ONE_AREA_NUMBER >=", value, "oneAreaNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberLessThan(Long value) {
            addCriterion("ONE_AREA_NUMBER <", value, "oneAreaNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberLessThanOrEqualTo(Long value) {
            addCriterion("ONE_AREA_NUMBER <=", value, "oneAreaNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberIn(List<Long> values) {
            addCriterion("ONE_AREA_NUMBER in", values, "oneAreaNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberNotIn(List<Long> values) {
            addCriterion("ONE_AREA_NUMBER not in", values, "oneAreaNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberBetween(Long value1, Long value2) {
            addCriterion("ONE_AREA_NUMBER between", value1, value2, "oneAreaNumber");
            return (Criteria) this;
        }

        public Criteria andOneAreaNumberNotBetween(Long value1, Long value2) {
            addCriterion("ONE_AREA_NUMBER not between", value1, value2, "oneAreaNumber");
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