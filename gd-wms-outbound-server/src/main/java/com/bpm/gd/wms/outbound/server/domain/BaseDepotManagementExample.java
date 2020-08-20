package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseDepotManagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseDepotManagementExample() {
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

        public Criteria andStorageLocationNameIsNull() {
            addCriterion("STORAGE_LOCATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameIsNotNull() {
            addCriterion("STORAGE_LOCATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NAME =", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameNotEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NAME <>", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameGreaterThan(String value) {
            addCriterion("STORAGE_LOCATION_NAME >", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NAME >=", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameLessThan(String value) {
            addCriterion("STORAGE_LOCATION_NAME <", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_NAME <=", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameLike(String value) {
            addCriterion("STORAGE_LOCATION_NAME like", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameNotLike(String value) {
            addCriterion("STORAGE_LOCATION_NAME not like", value, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_NAME in", values, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameNotIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_NAME not in", values, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_NAME between", value1, value2, "storageLocationName");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNameNotBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_NAME not between", value1, value2, "storageLocationName");
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
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

        public Criteria andBoxNumberIsNull() {
            addCriterion("BOX_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBoxNumberIsNotNull() {
            addCriterion("BOX_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNumberEqualTo(Long value) {
            addCriterion("BOX_NUMBER =", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotEqualTo(Long value) {
            addCriterion("BOX_NUMBER <>", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberGreaterThan(Long value) {
            addCriterion("BOX_NUMBER >", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("BOX_NUMBER >=", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberLessThan(Long value) {
            addCriterion("BOX_NUMBER <", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberLessThanOrEqualTo(Long value) {
            addCriterion("BOX_NUMBER <=", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberIn(List<Long> values) {
            addCriterion("BOX_NUMBER in", values, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotIn(List<Long> values) {
            addCriterion("BOX_NUMBER not in", values, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberBetween(Long value1, Long value2) {
            addCriterion("BOX_NUMBER between", value1, value2, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotBetween(Long value1, Long value2) {
            addCriterion("BOX_NUMBER not between", value1, value2, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andDepotTypeIsNull() {
            addCriterion("DEPOT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDepotTypeIsNotNull() {
            addCriterion("DEPOT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDepotTypeEqualTo(String value) {
            addCriterion("DEPOT_TYPE =", value, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeNotEqualTo(String value) {
            addCriterion("DEPOT_TYPE <>", value, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeGreaterThan(String value) {
            addCriterion("DEPOT_TYPE >", value, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPOT_TYPE >=", value, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeLessThan(String value) {
            addCriterion("DEPOT_TYPE <", value, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeLessThanOrEqualTo(String value) {
            addCriterion("DEPOT_TYPE <=", value, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeLike(String value) {
            addCriterion("DEPOT_TYPE like", value, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeNotLike(String value) {
            addCriterion("DEPOT_TYPE not like", value, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeIn(List<String> values) {
            addCriterion("DEPOT_TYPE in", values, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeNotIn(List<String> values) {
            addCriterion("DEPOT_TYPE not in", values, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeBetween(String value1, String value2) {
            addCriterion("DEPOT_TYPE between", value1, value2, "depotType");
            return (Criteria) this;
        }

        public Criteria andDepotTypeNotBetween(String value1, String value2) {
            addCriterion("DEPOT_TYPE not between", value1, value2, "depotType");
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