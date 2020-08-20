package com.bpm.gd.wms.outbound.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HvPmWorkOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HvPmWorkOrderExample() {
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

        public Criteria andSiteNumIsNull() {
            addCriterion("SITE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSiteNumIsNotNull() {
            addCriterion("SITE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNumEqualTo(String value) {
            addCriterion("SITE_NUM =", value, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumNotEqualTo(String value) {
            addCriterion("SITE_NUM <>", value, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumGreaterThan(String value) {
            addCriterion("SITE_NUM >", value, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_NUM >=", value, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumLessThan(String value) {
            addCriterion("SITE_NUM <", value, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumLessThanOrEqualTo(String value) {
            addCriterion("SITE_NUM <=", value, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumLike(String value) {
            addCriterion("SITE_NUM like", value, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumNotLike(String value) {
            addCriterion("SITE_NUM not like", value, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumIn(List<String> values) {
            addCriterion("SITE_NUM in", values, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumNotIn(List<String> values) {
            addCriterion("SITE_NUM not in", values, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumBetween(String value1, String value2) {
            addCriterion("SITE_NUM between", value1, value2, "siteNum");
            return (Criteria) this;
        }

        public Criteria andSiteNumNotBetween(String value1, String value2) {
            addCriterion("SITE_NUM not between", value1, value2, "siteNum");
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

        public Criteria andActualCountIsNull() {
            addCriterion("ACTUAL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andActualCountIsNotNull() {
            addCriterion("ACTUAL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andActualCountEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COUNT =", value, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualCountNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COUNT <>", value, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualCountGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COUNT >", value, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COUNT >=", value, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualCountLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COUNT <", value, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COUNT <=", value, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualCountIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COUNT in", values, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualCountNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COUNT not in", values, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COUNT between", value1, value2, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COUNT not between", value1, value2, "actualCount");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeIsNull() {
            addCriterion("ACTUAL_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeIsNotNull() {
            addCriterion("ACTUAL_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeEqualTo(Date value) {
            addCriterion("ACTUAL_END_TIME =", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotEqualTo(Date value) {
            addCriterion("ACTUAL_END_TIME <>", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeGreaterThan(Date value) {
            addCriterion("ACTUAL_END_TIME >", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_END_TIME >=", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeLessThan(Date value) {
            addCriterion("ACTUAL_END_TIME <", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_END_TIME <=", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeIn(List<Date> values) {
            addCriterion("ACTUAL_END_TIME in", values, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotIn(List<Date> values) {
            addCriterion("ACTUAL_END_TIME not in", values, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_END_TIME between", value1, value2, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_END_TIME not between", value1, value2, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeIsNull() {
            addCriterion("ACTUAL_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeIsNotNull() {
            addCriterion("ACTUAL_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeEqualTo(Date value) {
            addCriterion("ACTUAL_START_TIME =", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeNotEqualTo(Date value) {
            addCriterion("ACTUAL_START_TIME <>", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeGreaterThan(Date value) {
            addCriterion("ACTUAL_START_TIME >", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_START_TIME >=", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeLessThan(Date value) {
            addCriterion("ACTUAL_START_TIME <", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_START_TIME <=", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeIn(List<Date> values) {
            addCriterion("ACTUAL_START_TIME in", values, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeNotIn(List<Date> values) {
            addCriterion("ACTUAL_START_TIME not in", values, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_START_TIME between", value1, value2, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_START_TIME not between", value1, value2, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andBomIdIsNull() {
            addCriterion("BOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andBomIdIsNotNull() {
            addCriterion("BOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBomIdEqualTo(Long value) {
            addCriterion("BOM_ID =", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotEqualTo(Long value) {
            addCriterion("BOM_ID <>", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdGreaterThan(Long value) {
            addCriterion("BOM_ID >", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BOM_ID >=", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdLessThan(Long value) {
            addCriterion("BOM_ID <", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdLessThanOrEqualTo(Long value) {
            addCriterion("BOM_ID <=", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdIn(List<Long> values) {
            addCriterion("BOM_ID in", values, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotIn(List<Long> values) {
            addCriterion("BOM_ID not in", values, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdBetween(Long value1, Long value2) {
            addCriterion("BOM_ID between", value1, value2, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotBetween(Long value1, Long value2) {
            addCriterion("BOM_ID not between", value1, value2, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomVersionIsNull() {
            addCriterion("BOM_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andBomVersionIsNotNull() {
            addCriterion("BOM_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andBomVersionEqualTo(String value) {
            addCriterion("BOM_VERSION =", value, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionNotEqualTo(String value) {
            addCriterion("BOM_VERSION <>", value, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionGreaterThan(String value) {
            addCriterion("BOM_VERSION >", value, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionGreaterThanOrEqualTo(String value) {
            addCriterion("BOM_VERSION >=", value, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionLessThan(String value) {
            addCriterion("BOM_VERSION <", value, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionLessThanOrEqualTo(String value) {
            addCriterion("BOM_VERSION <=", value, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionLike(String value) {
            addCriterion("BOM_VERSION like", value, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionNotLike(String value) {
            addCriterion("BOM_VERSION not like", value, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionIn(List<String> values) {
            addCriterion("BOM_VERSION in", values, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionNotIn(List<String> values) {
            addCriterion("BOM_VERSION not in", values, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionBetween(String value1, String value2) {
            addCriterion("BOM_VERSION between", value1, value2, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andBomVersionNotBetween(String value1, String value2) {
            addCriterion("BOM_VERSION not between", value1, value2, "bomVersion");
            return (Criteria) this;
        }

        public Criteria andCellIdIsNull() {
            addCriterion("CELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCellIdIsNotNull() {
            addCriterion("CELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCellIdEqualTo(Long value) {
            addCriterion("CELL_ID =", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotEqualTo(Long value) {
            addCriterion("CELL_ID <>", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdGreaterThan(Long value) {
            addCriterion("CELL_ID >", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CELL_ID >=", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLessThan(Long value) {
            addCriterion("CELL_ID <", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLessThanOrEqualTo(Long value) {
            addCriterion("CELL_ID <=", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdIn(List<Long> values) {
            addCriterion("CELL_ID in", values, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotIn(List<Long> values) {
            addCriterion("CELL_ID not in", values, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdBetween(Long value1, Long value2) {
            addCriterion("CELL_ID between", value1, value2, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotBetween(Long value1, Long value2) {
            addCriterion("CELL_ID not between", value1, value2, "cellId");
            return (Criteria) this;
        }

        public Criteria andCrewIdIsNull() {
            addCriterion("CREW_ID is null");
            return (Criteria) this;
        }

        public Criteria andCrewIdIsNotNull() {
            addCriterion("CREW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCrewIdEqualTo(Long value) {
            addCriterion("CREW_ID =", value, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewIdNotEqualTo(Long value) {
            addCriterion("CREW_ID <>", value, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewIdGreaterThan(Long value) {
            addCriterion("CREW_ID >", value, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREW_ID >=", value, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewIdLessThan(Long value) {
            addCriterion("CREW_ID <", value, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewIdLessThanOrEqualTo(Long value) {
            addCriterion("CREW_ID <=", value, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewIdIn(List<Long> values) {
            addCriterion("CREW_ID in", values, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewIdNotIn(List<Long> values) {
            addCriterion("CREW_ID not in", values, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewIdBetween(Long value1, Long value2) {
            addCriterion("CREW_ID between", value1, value2, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewIdNotBetween(Long value1, Long value2) {
            addCriterion("CREW_ID not between", value1, value2, "crewId");
            return (Criteria) this;
        }

        public Criteria andCrewNameIsNull() {
            addCriterion("CREW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCrewNameIsNotNull() {
            addCriterion("CREW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrewNameEqualTo(String value) {
            addCriterion("CREW_NAME =", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameNotEqualTo(String value) {
            addCriterion("CREW_NAME <>", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameGreaterThan(String value) {
            addCriterion("CREW_NAME >", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREW_NAME >=", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameLessThan(String value) {
            addCriterion("CREW_NAME <", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameLessThanOrEqualTo(String value) {
            addCriterion("CREW_NAME <=", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameLike(String value) {
            addCriterion("CREW_NAME like", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameNotLike(String value) {
            addCriterion("CREW_NAME not like", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameIn(List<String> values) {
            addCriterion("CREW_NAME in", values, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameNotIn(List<String> values) {
            addCriterion("CREW_NAME not in", values, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameBetween(String value1, String value2) {
            addCriterion("CREW_NAME between", value1, value2, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameNotBetween(String value1, String value2) {
            addCriterion("CREW_NAME not between", value1, value2, "crewName");
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

        public Criteria andIssuedTimeIsNull() {
            addCriterion("ISSUED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeIsNotNull() {
            addCriterion("ISSUED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeEqualTo(Date value) {
            addCriterion("ISSUED_TIME =", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeNotEqualTo(Date value) {
            addCriterion("ISSUED_TIME <>", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeGreaterThan(Date value) {
            addCriterion("ISSUED_TIME >", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ISSUED_TIME >=", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeLessThan(Date value) {
            addCriterion("ISSUED_TIME <", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeLessThanOrEqualTo(Date value) {
            addCriterion("ISSUED_TIME <=", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeIn(List<Date> values) {
            addCriterion("ISSUED_TIME in", values, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeNotIn(List<Date> values) {
            addCriterion("ISSUED_TIME not in", values, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeBetween(Date value1, Date value2) {
            addCriterion("ISSUED_TIME between", value1, value2, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeNotBetween(Date value1, Date value2) {
            addCriterion("ISSUED_TIME not between", value1, value2, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNull() {
            addCriterion("MATERIAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("MATERIAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("MATERIAL_CODE =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("MATERIAL_CODE <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("MATERIAL_CODE >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_CODE >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("MATERIAL_CODE <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_CODE <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("MATERIAL_CODE like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("MATERIAL_CODE not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("MATERIAL_CODE in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("MATERIAL_CODE not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("MATERIAL_CODE between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_CODE not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNull() {
            addCriterion("MATERIAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNotNull() {
            addCriterion("MATERIAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdEqualTo(Long value) {
            addCriterion("MATERIAL_ID =", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotEqualTo(Long value) {
            addCriterion("MATERIAL_ID <>", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThan(Long value) {
            addCriterion("MATERIAL_ID >", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_ID >=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThan(Long value) {
            addCriterion("MATERIAL_ID <", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThanOrEqualTo(Long value) {
            addCriterion("MATERIAL_ID <=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIn(List<Long> values) {
            addCriterion("MATERIAL_ID in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotIn(List<Long> values) {
            addCriterion("MATERIAL_ID not in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_ID between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotBetween(Long value1, Long value2) {
            addCriterion("MATERIAL_ID not between", value1, value2, "materialId");
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

        public Criteria andPlanCodeIsNull() {
            addCriterion("PLAN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNotNull() {
            addCriterion("PLAN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeEqualTo(String value) {
            addCriterion("PLAN_CODE =", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotEqualTo(String value) {
            addCriterion("PLAN_CODE <>", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThan(String value) {
            addCriterion("PLAN_CODE >", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_CODE >=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThan(String value) {
            addCriterion("PLAN_CODE <", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_CODE <=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLike(String value) {
            addCriterion("PLAN_CODE like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotLike(String value) {
            addCriterion("PLAN_CODE not like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIn(List<String> values) {
            addCriterion("PLAN_CODE in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotIn(List<String> values) {
            addCriterion("PLAN_CODE not in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeBetween(String value1, String value2) {
            addCriterion("PLAN_CODE between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotBetween(String value1, String value2) {
            addCriterion("PLAN_CODE not between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIsNull() {
            addCriterion("PLAN_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIsNotNull() {
            addCriterion("PLAN_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeEqualTo(Date value) {
            addCriterion("PLAN_END_TIME =", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotEqualTo(Date value) {
            addCriterion("PLAN_END_TIME <>", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeGreaterThan(Date value) {
            addCriterion("PLAN_END_TIME >", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_END_TIME >=", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeLessThan(Date value) {
            addCriterion("PLAN_END_TIME <", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_END_TIME <=", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIn(List<Date> values) {
            addCriterion("PLAN_END_TIME in", values, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotIn(List<Date> values) {
            addCriterion("PLAN_END_TIME not in", values, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeBetween(Date value1, Date value2) {
            addCriterion("PLAN_END_TIME between", value1, value2, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_END_TIME not between", value1, value2, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNull() {
            addCriterion("PLAN_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNotNull() {
            addCriterion("PLAN_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeEqualTo(Date value) {
            addCriterion("PLAN_START_TIME =", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotEqualTo(Date value) {
            addCriterion("PLAN_START_TIME <>", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThan(Date value) {
            addCriterion("PLAN_START_TIME >", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_START_TIME >=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThan(Date value) {
            addCriterion("PLAN_START_TIME <", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_START_TIME <=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIn(List<Date> values) {
            addCriterion("PLAN_START_TIME in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotIn(List<Date> values) {
            addCriterion("PLAN_START_TIME not in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeBetween(Date value1, Date value2) {
            addCriterion("PLAN_START_TIME between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_START_TIME not between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andRouteCodeIsNull() {
            addCriterion("ROUTE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRouteCodeIsNotNull() {
            addCriterion("ROUTE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRouteCodeEqualTo(String value) {
            addCriterion("ROUTE_CODE =", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeNotEqualTo(String value) {
            addCriterion("ROUTE_CODE <>", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeGreaterThan(String value) {
            addCriterion("ROUTE_CODE >", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_CODE >=", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeLessThan(String value) {
            addCriterion("ROUTE_CODE <", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_CODE <=", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeLike(String value) {
            addCriterion("ROUTE_CODE like", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeNotLike(String value) {
            addCriterion("ROUTE_CODE not like", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeIn(List<String> values) {
            addCriterion("ROUTE_CODE in", values, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeNotIn(List<String> values) {
            addCriterion("ROUTE_CODE not in", values, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeBetween(String value1, String value2) {
            addCriterion("ROUTE_CODE between", value1, value2, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeNotBetween(String value1, String value2) {
            addCriterion("ROUTE_CODE not between", value1, value2, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("ROUTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("ROUTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Long value) {
            addCriterion("ROUTE_ID =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Long value) {
            addCriterion("ROUTE_ID <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Long value) {
            addCriterion("ROUTE_ID >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROUTE_ID >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Long value) {
            addCriterion("ROUTE_ID <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Long value) {
            addCriterion("ROUTE_ID <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Long> values) {
            addCriterion("ROUTE_ID in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Long> values) {
            addCriterion("ROUTE_ID not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Long value1, Long value2) {
            addCriterion("ROUTE_ID between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Long value1, Long value2) {
            addCriterion("ROUTE_ID not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNull() {
            addCriterion("ROUTE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNotNull() {
            addCriterion("ROUTE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNameEqualTo(String value) {
            addCriterion("ROUTE_NAME =", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotEqualTo(String value) {
            addCriterion("ROUTE_NAME <>", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThan(String value) {
            addCriterion("ROUTE_NAME >", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_NAME >=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThan(String value) {
            addCriterion("ROUTE_NAME <", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_NAME <=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLike(String value) {
            addCriterion("ROUTE_NAME like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotLike(String value) {
            addCriterion("ROUTE_NAME not like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameIn(List<String> values) {
            addCriterion("ROUTE_NAME in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotIn(List<String> values) {
            addCriterion("ROUTE_NAME not in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameBetween(String value1, String value2) {
            addCriterion("ROUTE_NAME between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotBetween(String value1, String value2) {
            addCriterion("ROUTE_NAME not between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteVersionIsNull() {
            addCriterion("ROUTE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andRouteVersionIsNotNull() {
            addCriterion("ROUTE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRouteVersionEqualTo(String value) {
            addCriterion("ROUTE_VERSION =", value, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionNotEqualTo(String value) {
            addCriterion("ROUTE_VERSION <>", value, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionGreaterThan(String value) {
            addCriterion("ROUTE_VERSION >", value, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_VERSION >=", value, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionLessThan(String value) {
            addCriterion("ROUTE_VERSION <", value, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_VERSION <=", value, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionLike(String value) {
            addCriterion("ROUTE_VERSION like", value, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionNotLike(String value) {
            addCriterion("ROUTE_VERSION not like", value, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionIn(List<String> values) {
            addCriterion("ROUTE_VERSION in", values, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionNotIn(List<String> values) {
            addCriterion("ROUTE_VERSION not in", values, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionBetween(String value1, String value2) {
            addCriterion("ROUTE_VERSION between", value1, value2, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andRouteVersionNotBetween(String value1, String value2) {
            addCriterion("ROUTE_VERSION not between", value1, value2, "routeVersion");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("SERIAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("SERIAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(Long value) {
            addCriterion("SERIAL_NUMBER =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(Long value) {
            addCriterion("SERIAL_NUMBER <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(Long value) {
            addCriterion("SERIAL_NUMBER >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("SERIAL_NUMBER >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(Long value) {
            addCriterion("SERIAL_NUMBER <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(Long value) {
            addCriterion("SERIAL_NUMBER <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<Long> values) {
            addCriterion("SERIAL_NUMBER in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<Long> values) {
            addCriterion("SERIAL_NUMBER not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(Long value1, Long value2) {
            addCriterion("SERIAL_NUMBER between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(Long value1, Long value2) {
            addCriterion("SERIAL_NUMBER not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andShiftIdIsNull() {
            addCriterion("SHIFT_ID is null");
            return (Criteria) this;
        }

        public Criteria andShiftIdIsNotNull() {
            addCriterion("SHIFT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShiftIdEqualTo(Long value) {
            addCriterion("SHIFT_ID =", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotEqualTo(Long value) {
            addCriterion("SHIFT_ID <>", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdGreaterThan(Long value) {
            addCriterion("SHIFT_ID >", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHIFT_ID >=", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLessThan(Long value) {
            addCriterion("SHIFT_ID <", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLessThanOrEqualTo(Long value) {
            addCriterion("SHIFT_ID <=", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdIn(List<Long> values) {
            addCriterion("SHIFT_ID in", values, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotIn(List<Long> values) {
            addCriterion("SHIFT_ID not in", values, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdBetween(Long value1, Long value2) {
            addCriterion("SHIFT_ID between", value1, value2, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotBetween(Long value1, Long value2) {
            addCriterion("SHIFT_ID not between", value1, value2, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftNameIsNull() {
            addCriterion("SHIFT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShiftNameIsNotNull() {
            addCriterion("SHIFT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShiftNameEqualTo(String value) {
            addCriterion("SHIFT_NAME =", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameNotEqualTo(String value) {
            addCriterion("SHIFT_NAME <>", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameGreaterThan(String value) {
            addCriterion("SHIFT_NAME >", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFT_NAME >=", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameLessThan(String value) {
            addCriterion("SHIFT_NAME <", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameLessThanOrEqualTo(String value) {
            addCriterion("SHIFT_NAME <=", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameLike(String value) {
            addCriterion("SHIFT_NAME like", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameNotLike(String value) {
            addCriterion("SHIFT_NAME not like", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameIn(List<String> values) {
            addCriterion("SHIFT_NAME in", values, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameNotIn(List<String> values) {
            addCriterion("SHIFT_NAME not in", values, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameBetween(String value1, String value2) {
            addCriterion("SHIFT_NAME between", value1, value2, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameNotBetween(String value1, String value2) {
            addCriterion("SHIFT_NAME not between", value1, value2, "shiftName");
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

        public Criteria andWorkOrderStateIsNull() {
            addCriterion("WORK_ORDER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateIsNotNull() {
            addCriterion("WORK_ORDER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateEqualTo(Long value) {
            addCriterion("WORK_ORDER_STATE =", value, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateNotEqualTo(Long value) {
            addCriterion("WORK_ORDER_STATE <>", value, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateGreaterThan(Long value) {
            addCriterion("WORK_ORDER_STATE >", value, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateGreaterThanOrEqualTo(Long value) {
            addCriterion("WORK_ORDER_STATE >=", value, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateLessThan(Long value) {
            addCriterion("WORK_ORDER_STATE <", value, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateLessThanOrEqualTo(Long value) {
            addCriterion("WORK_ORDER_STATE <=", value, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateIn(List<Long> values) {
            addCriterion("WORK_ORDER_STATE in", values, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateNotIn(List<Long> values) {
            addCriterion("WORK_ORDER_STATE not in", values, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateBetween(Long value1, Long value2) {
            addCriterion("WORK_ORDER_STATE between", value1, value2, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andWorkOrderStateNotBetween(Long value1, Long value2) {
            addCriterion("WORK_ORDER_STATE not between", value1, value2, "workOrderState");
            return (Criteria) this;
        }

        public Criteria andBomIsNull() {
            addCriterion("BOM is null");
            return (Criteria) this;
        }

        public Criteria andBomIsNotNull() {
            addCriterion("BOM is not null");
            return (Criteria) this;
        }

        public Criteria andBomEqualTo(String value) {
            addCriterion("BOM =", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotEqualTo(String value) {
            addCriterion("BOM <>", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomGreaterThan(String value) {
            addCriterion("BOM >", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomGreaterThanOrEqualTo(String value) {
            addCriterion("BOM >=", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLessThan(String value) {
            addCriterion("BOM <", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLessThanOrEqualTo(String value) {
            addCriterion("BOM <=", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLike(String value) {
            addCriterion("BOM like", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotLike(String value) {
            addCriterion("BOM not like", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomIn(List<String> values) {
            addCriterion("BOM in", values, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotIn(List<String> values) {
            addCriterion("BOM not in", values, "bom");
            return (Criteria) this;
        }

        public Criteria andBomBetween(String value1, String value2) {
            addCriterion("BOM between", value1, value2, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotBetween(String value1, String value2) {
            addCriterion("BOM not between", value1, value2, "bom");
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

        public Criteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIsNull() {
            addCriterion("WORK_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIsNotNull() {
            addCriterion("WORK_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitEqualTo(String value) {
            addCriterion("WORK_UNIT =", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotEqualTo(String value) {
            addCriterion("WORK_UNIT <>", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitGreaterThan(String value) {
            addCriterion("WORK_UNIT >", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_UNIT >=", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLessThan(String value) {
            addCriterion("WORK_UNIT <", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLessThanOrEqualTo(String value) {
            addCriterion("WORK_UNIT <=", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLike(String value) {
            addCriterion("WORK_UNIT like", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotLike(String value) {
            addCriterion("WORK_UNIT not like", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIn(List<String> values) {
            addCriterion("WORK_UNIT in", values, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotIn(List<String> values) {
            addCriterion("WORK_UNIT not in", values, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitBetween(String value1, String value2) {
            addCriterion("WORK_UNIT between", value1, value2, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotBetween(String value1, String value2) {
            addCriterion("WORK_UNIT not between", value1, value2, "workUnit");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andManagementUserIsNull() {
            addCriterion("MANAGEMENT_USER is null");
            return (Criteria) this;
        }

        public Criteria andManagementUserIsNotNull() {
            addCriterion("MANAGEMENT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andManagementUserEqualTo(String value) {
            addCriterion("MANAGEMENT_USER =", value, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserNotEqualTo(String value) {
            addCriterion("MANAGEMENT_USER <>", value, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserGreaterThan(String value) {
            addCriterion("MANAGEMENT_USER >", value, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGEMENT_USER >=", value, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserLessThan(String value) {
            addCriterion("MANAGEMENT_USER <", value, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserLessThanOrEqualTo(String value) {
            addCriterion("MANAGEMENT_USER <=", value, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserLike(String value) {
            addCriterion("MANAGEMENT_USER like", value, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserNotLike(String value) {
            addCriterion("MANAGEMENT_USER not like", value, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserIn(List<String> values) {
            addCriterion("MANAGEMENT_USER in", values, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserNotIn(List<String> values) {
            addCriterion("MANAGEMENT_USER not in", values, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserBetween(String value1, String value2) {
            addCriterion("MANAGEMENT_USER between", value1, value2, "managementUser");
            return (Criteria) this;
        }

        public Criteria andManagementUserNotBetween(String value1, String value2) {
            addCriterion("MANAGEMENT_USER not between", value1, value2, "managementUser");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeIsNull() {
            addCriterion("WORK_ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeIsNotNull() {
            addCriterion("WORK_ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeEqualTo(String value) {
            addCriterion("WORK_ORDER_TYPE =", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeNotEqualTo(String value) {
            addCriterion("WORK_ORDER_TYPE <>", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeGreaterThan(String value) {
            addCriterion("WORK_ORDER_TYPE >", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ORDER_TYPE >=", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeLessThan(String value) {
            addCriterion("WORK_ORDER_TYPE <", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("WORK_ORDER_TYPE <=", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeLike(String value) {
            addCriterion("WORK_ORDER_TYPE like", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeNotLike(String value) {
            addCriterion("WORK_ORDER_TYPE not like", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeIn(List<String> values) {
            addCriterion("WORK_ORDER_TYPE in", values, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeNotIn(List<String> values) {
            addCriterion("WORK_ORDER_TYPE not in", values, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeBetween(String value1, String value2) {
            addCriterion("WORK_ORDER_TYPE between", value1, value2, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeNotBetween(String value1, String value2) {
            addCriterion("WORK_ORDER_TYPE not between", value1, value2, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andProductionBatchIsNull() {
            addCriterion("PRODUCTION_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andProductionBatchIsNotNull() {
            addCriterion("PRODUCTION_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andProductionBatchEqualTo(String value) {
            addCriterion("PRODUCTION_BATCH =", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotEqualTo(String value) {
            addCriterion("PRODUCTION_BATCH <>", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchGreaterThan(String value) {
            addCriterion("PRODUCTION_BATCH >", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTION_BATCH >=", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchLessThan(String value) {
            addCriterion("PRODUCTION_BATCH <", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTION_BATCH <=", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchLike(String value) {
            addCriterion("PRODUCTION_BATCH like", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotLike(String value) {
            addCriterion("PRODUCTION_BATCH not like", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchIn(List<String> values) {
            addCriterion("PRODUCTION_BATCH in", values, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotIn(List<String> values) {
            addCriterion("PRODUCTION_BATCH not in", values, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchBetween(String value1, String value2) {
            addCriterion("PRODUCTION_BATCH between", value1, value2, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotBetween(String value1, String value2) {
            addCriterion("PRODUCTION_BATCH not between", value1, value2, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeIsNull() {
            addCriterion("CUSTOMER_MATERIAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeIsNotNull() {
            addCriterion("CUSTOMER_MATERIAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_CODE =", value, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeNotEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_CODE <>", value, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeGreaterThan(String value) {
            addCriterion("CUSTOMER_MATERIAL_CODE >", value, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_CODE >=", value, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeLessThan(String value) {
            addCriterion("CUSTOMER_MATERIAL_CODE <", value, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_CODE <=", value, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeLike(String value) {
            addCriterion("CUSTOMER_MATERIAL_CODE like", value, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeNotLike(String value) {
            addCriterion("CUSTOMER_MATERIAL_CODE not like", value, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeIn(List<String> values) {
            addCriterion("CUSTOMER_MATERIAL_CODE in", values, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeNotIn(List<String> values) {
            addCriterion("CUSTOMER_MATERIAL_CODE not in", values, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_MATERIAL_CODE between", value1, value2, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_MATERIAL_CODE not between", value1, value2, "customerMaterialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecIsNull() {
            addCriterion("MATERIAL_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecIsNotNull() {
            addCriterion("MATERIAL_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecEqualTo(String value) {
            addCriterion("MATERIAL_SPEC =", value, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecNotEqualTo(String value) {
            addCriterion("MATERIAL_SPEC <>", value, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecGreaterThan(String value) {
            addCriterion("MATERIAL_SPEC >", value, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_SPEC >=", value, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecLessThan(String value) {
            addCriterion("MATERIAL_SPEC <", value, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_SPEC <=", value, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecLike(String value) {
            addCriterion("MATERIAL_SPEC like", value, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecNotLike(String value) {
            addCriterion("MATERIAL_SPEC not like", value, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecIn(List<String> values) {
            addCriterion("MATERIAL_SPEC in", values, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecNotIn(List<String> values) {
            addCriterion("MATERIAL_SPEC not in", values, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecBetween(String value1, String value2) {
            addCriterion("MATERIAL_SPEC between", value1, value2, "materialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialSpecNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_SPEC not between", value1, value2, "materialSpec");
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