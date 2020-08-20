package com.bpm.gd.wms.outbound.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseHighLevelRackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseHighLevelRackExample() {
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

        public Criteria andStorageLocationLongIsNull() {
            addCriterion("STORAGE_LOCATION_LONG is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongIsNotNull() {
            addCriterion("STORAGE_LOCATION_LONG is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_LONG =", value, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongNotEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_LONG <>", value, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongGreaterThan(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_LONG >", value, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_LONG >=", value, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongLessThan(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_LONG <", value, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_LONG <=", value, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongIn(List<BigDecimal> values) {
            addCriterion("STORAGE_LOCATION_LONG in", values, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongNotIn(List<BigDecimal> values) {
            addCriterion("STORAGE_LOCATION_LONG not in", values, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORAGE_LOCATION_LONG between", value1, value2, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORAGE_LOCATION_LONG not between", value1, value2, "storageLocationLong");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideIsNull() {
            addCriterion("STORAGE_LOCATION_WIDE is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideIsNotNull() {
            addCriterion("STORAGE_LOCATION_WIDE is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_WIDE =", value, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideNotEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_WIDE <>", value, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideGreaterThan(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_WIDE >", value, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_WIDE >=", value, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideLessThan(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_WIDE <", value, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_WIDE <=", value, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideIn(List<BigDecimal> values) {
            addCriterion("STORAGE_LOCATION_WIDE in", values, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideNotIn(List<BigDecimal> values) {
            addCriterion("STORAGE_LOCATION_WIDE not in", values, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORAGE_LOCATION_WIDE between", value1, value2, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationWideNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORAGE_LOCATION_WIDE not between", value1, value2, "storageLocationWide");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighIsNull() {
            addCriterion("STORAGE_LOCATION_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighIsNotNull() {
            addCriterion("STORAGE_LOCATION_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_HIGH =", value, "storageLocationHigh");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighNotEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_HIGH <>", value, "storageLocationHigh");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighGreaterThan(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_HIGH >", value, "storageLocationHigh");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_HIGH >=", value, "storageLocationHigh");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighLessThan(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_HIGH <", value, "storageLocationHigh");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STORAGE_LOCATION_HIGH <=", value, "storageLocationHigh");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighIn(List<BigDecimal> values) {
            addCriterion("STORAGE_LOCATION_HIGH in", values, "storageLocationHigh");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighNotIn(List<BigDecimal> values) {
            addCriterion("STORAGE_LOCATION_HIGH not in", values, "storageLocationHigh");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORAGE_LOCATION_HIGH between", value1, value2, "storageLocationHigh");
            return (Criteria) this;
        }

        public Criteria andStorageLocationHighNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORAGE_LOCATION_HIGH not between", value1, value2, "storageLocationHigh");
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

        public Criteria andPeakLoadIsNull() {
            addCriterion("PEAK_LOAD is null");
            return (Criteria) this;
        }

        public Criteria andPeakLoadIsNotNull() {
            addCriterion("PEAK_LOAD is not null");
            return (Criteria) this;
        }

        public Criteria andPeakLoadEqualTo(BigDecimal value) {
            addCriterion("PEAK_LOAD =", value, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPeakLoadNotEqualTo(BigDecimal value) {
            addCriterion("PEAK_LOAD <>", value, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPeakLoadGreaterThan(BigDecimal value) {
            addCriterion("PEAK_LOAD >", value, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPeakLoadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_LOAD >=", value, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPeakLoadLessThan(BigDecimal value) {
            addCriterion("PEAK_LOAD <", value, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPeakLoadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_LOAD <=", value, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPeakLoadIn(List<BigDecimal> values) {
            addCriterion("PEAK_LOAD in", values, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPeakLoadNotIn(List<BigDecimal> values) {
            addCriterion("PEAK_LOAD not in", values, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPeakLoadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_LOAD between", value1, value2, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPeakLoadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_LOAD not between", value1, value2, "peakLoad");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeIsNull() {
            addCriterion("PURCHASE_ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeIsNotNull() {
            addCriterion("PURCHASE_ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeEqualTo(Long value) {
            addCriterion("PURCHASE_ORDER_TYPE =", value, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeNotEqualTo(Long value) {
            addCriterion("PURCHASE_ORDER_TYPE <>", value, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeGreaterThan(Long value) {
            addCriterion("PURCHASE_ORDER_TYPE >", value, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_ORDER_TYPE >=", value, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeLessThan(Long value) {
            addCriterion("PURCHASE_ORDER_TYPE <", value, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_ORDER_TYPE <=", value, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeIn(List<Long> values) {
            addCriterion("PURCHASE_ORDER_TYPE in", values, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeNotIn(List<Long> values) {
            addCriterion("PURCHASE_ORDER_TYPE not in", values, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_ORDER_TYPE between", value1, value2, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderTypeNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_ORDER_TYPE not between", value1, value2, "purchaseOrderType");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryIsNull() {
            addCriterion("THE_HIGHEST_INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryIsNotNull() {
            addCriterion("THE_HIGHEST_INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryEqualTo(BigDecimal value) {
            addCriterion("THE_HIGHEST_INVENTORY =", value, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryNotEqualTo(BigDecimal value) {
            addCriterion("THE_HIGHEST_INVENTORY <>", value, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryGreaterThan(BigDecimal value) {
            addCriterion("THE_HIGHEST_INVENTORY >", value, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THE_HIGHEST_INVENTORY >=", value, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryLessThan(BigDecimal value) {
            addCriterion("THE_HIGHEST_INVENTORY <", value, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THE_HIGHEST_INVENTORY <=", value, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryIn(List<BigDecimal> values) {
            addCriterion("THE_HIGHEST_INVENTORY in", values, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryNotIn(List<BigDecimal> values) {
            addCriterion("THE_HIGHEST_INVENTORY not in", values, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THE_HIGHEST_INVENTORY between", value1, value2, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andTheHighestInventoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THE_HIGHEST_INVENTORY not between", value1, value2, "theHighestInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityIsNull() {
            addCriterion("MINIMUM_STOCK_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityIsNotNull() {
            addCriterion("MINIMUM_STOCK_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_STOCK_QUANTITY =", value, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityNotEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_STOCK_QUANTITY <>", value, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityGreaterThan(BigDecimal value) {
            addCriterion("MINIMUM_STOCK_QUANTITY >", value, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_STOCK_QUANTITY >=", value, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityLessThan(BigDecimal value) {
            addCriterion("MINIMUM_STOCK_QUANTITY <", value, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_STOCK_QUANTITY <=", value, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_STOCK_QUANTITY in", values, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityNotIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_STOCK_QUANTITY not in", values, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_STOCK_QUANTITY between", value1, value2, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumStockQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_STOCK_QUANTITY not between", value1, value2, "minimumStockQuantity");
            return (Criteria) this;
        }

        public Criteria andSafetyStockIsNull() {
            addCriterion("SAFETY_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andSafetyStockIsNotNull() {
            addCriterion("SAFETY_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyStockEqualTo(BigDecimal value) {
            addCriterion("SAFETY_STOCK =", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockNotEqualTo(BigDecimal value) {
            addCriterion("SAFETY_STOCK <>", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockGreaterThan(BigDecimal value) {
            addCriterion("SAFETY_STOCK >", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SAFETY_STOCK >=", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockLessThan(BigDecimal value) {
            addCriterion("SAFETY_STOCK <", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SAFETY_STOCK <=", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockIn(List<BigDecimal> values) {
            addCriterion("SAFETY_STOCK in", values, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockNotIn(List<BigDecimal> values) {
            addCriterion("SAFETY_STOCK not in", values, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAFETY_STOCK between", value1, value2, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAFETY_STOCK not between", value1, value2, "safetyStock");
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

        public Criteria andCongruentRelationshipIsNull() {
            addCriterion("CONGRUENT_RELATIONSHIP is null");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipIsNotNull() {
            addCriterion("CONGRUENT_RELATIONSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipEqualTo(Long value) {
            addCriterion("CONGRUENT_RELATIONSHIP =", value, "congruentRelationship");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipNotEqualTo(Long value) {
            addCriterion("CONGRUENT_RELATIONSHIP <>", value, "congruentRelationship");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipGreaterThan(Long value) {
            addCriterion("CONGRUENT_RELATIONSHIP >", value, "congruentRelationship");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipGreaterThanOrEqualTo(Long value) {
            addCriterion("CONGRUENT_RELATIONSHIP >=", value, "congruentRelationship");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipLessThan(Long value) {
            addCriterion("CONGRUENT_RELATIONSHIP <", value, "congruentRelationship");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipLessThanOrEqualTo(Long value) {
            addCriterion("CONGRUENT_RELATIONSHIP <=", value, "congruentRelationship");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipIn(List<Long> values) {
            addCriterion("CONGRUENT_RELATIONSHIP in", values, "congruentRelationship");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipNotIn(List<Long> values) {
            addCriterion("CONGRUENT_RELATIONSHIP not in", values, "congruentRelationship");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipBetween(Long value1, Long value2) {
            addCriterion("CONGRUENT_RELATIONSHIP between", value1, value2, "congruentRelationship");
            return (Criteria) this;
        }

        public Criteria andCongruentRelationshipNotBetween(Long value1, Long value2) {
            addCriterion("CONGRUENT_RELATIONSHIP not between", value1, value2, "congruentRelationship");
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

        public Criteria andTreeIdIsNull() {
            addCriterion("TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTreeIdIsNotNull() {
            addCriterion("TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTreeIdEqualTo(Long value) {
            addCriterion("TREE_ID =", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotEqualTo(Long value) {
            addCriterion("TREE_ID <>", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThan(Long value) {
            addCriterion("TREE_ID >", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TREE_ID >=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThan(Long value) {
            addCriterion("TREE_ID <", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThanOrEqualTo(Long value) {
            addCriterion("TREE_ID <=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdIn(List<Long> values) {
            addCriterion("TREE_ID in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotIn(List<Long> values) {
            addCriterion("TREE_ID not in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdBetween(Long value1, Long value2) {
            addCriterion("TREE_ID between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotBetween(Long value1, Long value2) {
            addCriterion("TREE_ID not between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoIsNull() {
            addCriterion("STORAGE_LOCATION_NO is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoIsNotNull() {
            addCriterion("STORAGE_LOCATION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NO =", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoNotEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NO <>", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoGreaterThan(String value) {
            addCriterion("STORAGE_LOCATION_NO >", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NO >=", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoLessThan(String value) {
            addCriterion("STORAGE_LOCATION_NO <", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NO <=", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoLike(String value) {
            addCriterion("STORAGE_LOCATION_NO like", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoNotLike(String value) {
            addCriterion("STORAGE_LOCATION_NO not like", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_NO in", values, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoNotIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_NO not in", values, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_NO between", value1, value2, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoNotBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_NO not between", value1, value2, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeIsNull() {
            addCriterion("SHELVES_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeIsNotNull() {
            addCriterion("SHELVES_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeEqualTo(String value) {
            addCriterion("SHELVES_TYPE =", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeNotEqualTo(String value) {
            addCriterion("SHELVES_TYPE <>", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeGreaterThan(String value) {
            addCriterion("SHELVES_TYPE >", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHELVES_TYPE >=", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeLessThan(String value) {
            addCriterion("SHELVES_TYPE <", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeLessThanOrEqualTo(String value) {
            addCriterion("SHELVES_TYPE <=", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeLike(String value) {
            addCriterion("SHELVES_TYPE like", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeNotLike(String value) {
            addCriterion("SHELVES_TYPE not like", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeIn(List<String> values) {
            addCriterion("SHELVES_TYPE in", values, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeNotIn(List<String> values) {
            addCriterion("SHELVES_TYPE not in", values, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeBetween(String value1, String value2) {
            addCriterion("SHELVES_TYPE between", value1, value2, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeNotBetween(String value1, String value2) {
            addCriterion("SHELVES_TYPE not between", value1, value2, "shelvesType");
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