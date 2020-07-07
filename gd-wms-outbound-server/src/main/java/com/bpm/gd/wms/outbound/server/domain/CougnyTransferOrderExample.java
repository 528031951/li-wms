package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CougnyTransferOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CougnyTransferOrderExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameIsNull() {
            addCriterion("LOW_LOCATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameIsNotNull() {
            addCriterion("LOW_LOCATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameEqualTo(String value) {
            addCriterion("LOW_LOCATION_NAME =", value, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameNotEqualTo(String value) {
            addCriterion("LOW_LOCATION_NAME <>", value, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameGreaterThan(String value) {
            addCriterion("LOW_LOCATION_NAME >", value, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOW_LOCATION_NAME >=", value, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameLessThan(String value) {
            addCriterion("LOW_LOCATION_NAME <", value, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameLessThanOrEqualTo(String value) {
            addCriterion("LOW_LOCATION_NAME <=", value, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameLike(String value) {
            addCriterion("LOW_LOCATION_NAME like", value, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameNotLike(String value) {
            addCriterion("LOW_LOCATION_NAME not like", value, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameIn(List<String> values) {
            addCriterion("LOW_LOCATION_NAME in", values, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameNotIn(List<String> values) {
            addCriterion("LOW_LOCATION_NAME not in", values, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameBetween(String value1, String value2) {
            addCriterion("LOW_LOCATION_NAME between", value1, value2, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationNameNotBetween(String value1, String value2) {
            addCriterion("LOW_LOCATION_NAME not between", value1, value2, "lowLocationName");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodIsNull() {
            addCriterion("LOW_LOCATION_COD is null");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodIsNotNull() {
            addCriterion("LOW_LOCATION_COD is not null");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodEqualTo(String value) {
            addCriterion("LOW_LOCATION_COD =", value, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodNotEqualTo(String value) {
            addCriterion("LOW_LOCATION_COD <>", value, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodGreaterThan(String value) {
            addCriterion("LOW_LOCATION_COD >", value, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodGreaterThanOrEqualTo(String value) {
            addCriterion("LOW_LOCATION_COD >=", value, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodLessThan(String value) {
            addCriterion("LOW_LOCATION_COD <", value, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodLessThanOrEqualTo(String value) {
            addCriterion("LOW_LOCATION_COD <=", value, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodLike(String value) {
            addCriterion("LOW_LOCATION_COD like", value, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodNotLike(String value) {
            addCriterion("LOW_LOCATION_COD not like", value, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodIn(List<String> values) {
            addCriterion("LOW_LOCATION_COD in", values, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodNotIn(List<String> values) {
            addCriterion("LOW_LOCATION_COD not in", values, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodBetween(String value1, String value2) {
            addCriterion("LOW_LOCATION_COD between", value1, value2, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andLowLocationCodNotBetween(String value1, String value2) {
            addCriterion("LOW_LOCATION_COD not between", value1, value2, "lowLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodIsNull() {
            addCriterion("HIGH_LOCATION_COD is null");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodIsNotNull() {
            addCriterion("HIGH_LOCATION_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodEqualTo(String value) {
            addCriterion("HIGH_LOCATION_COD =", value, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodNotEqualTo(String value) {
            addCriterion("HIGH_LOCATION_COD <>", value, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodGreaterThan(String value) {
            addCriterion("HIGH_LOCATION_COD >", value, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodGreaterThanOrEqualTo(String value) {
            addCriterion("HIGH_LOCATION_COD >=", value, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodLessThan(String value) {
            addCriterion("HIGH_LOCATION_COD <", value, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodLessThanOrEqualTo(String value) {
            addCriterion("HIGH_LOCATION_COD <=", value, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodLike(String value) {
            addCriterion("HIGH_LOCATION_COD like", value, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodNotLike(String value) {
            addCriterion("HIGH_LOCATION_COD not like", value, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodIn(List<String> values) {
            addCriterion("HIGH_LOCATION_COD in", values, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodNotIn(List<String> values) {
            addCriterion("HIGH_LOCATION_COD not in", values, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodBetween(String value1, String value2) {
            addCriterion("HIGH_LOCATION_COD between", value1, value2, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationCodNotBetween(String value1, String value2) {
            addCriterion("HIGH_LOCATION_COD not between", value1, value2, "highLocationCod");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameIsNull() {
            addCriterion("HIGH_LOCATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameIsNotNull() {
            addCriterion("HIGH_LOCATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameEqualTo(String value) {
            addCriterion("HIGH_LOCATION_NAME =", value, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameNotEqualTo(String value) {
            addCriterion("HIGH_LOCATION_NAME <>", value, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameGreaterThan(String value) {
            addCriterion("HIGH_LOCATION_NAME >", value, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("HIGH_LOCATION_NAME >=", value, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameLessThan(String value) {
            addCriterion("HIGH_LOCATION_NAME <", value, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameLessThanOrEqualTo(String value) {
            addCriterion("HIGH_LOCATION_NAME <=", value, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameLike(String value) {
            addCriterion("HIGH_LOCATION_NAME like", value, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameNotLike(String value) {
            addCriterion("HIGH_LOCATION_NAME not like", value, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameIn(List<String> values) {
            addCriterion("HIGH_LOCATION_NAME in", values, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameNotIn(List<String> values) {
            addCriterion("HIGH_LOCATION_NAME not in", values, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameBetween(String value1, String value2) {
            addCriterion("HIGH_LOCATION_NAME between", value1, value2, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andHighLocationNameNotBetween(String value1, String value2) {
            addCriterion("HIGH_LOCATION_NAME not between", value1, value2, "highLocationName");
            return (Criteria) this;
        }

        public Criteria andDbNumberIsNull() {
            addCriterion("DB_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDbNumberIsNotNull() {
            addCriterion("DB_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDbNumberEqualTo(Long value) {
            addCriterion("DB_NUMBER =", value, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andDbNumberNotEqualTo(Long value) {
            addCriterion("DB_NUMBER <>", value, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andDbNumberGreaterThan(Long value) {
            addCriterion("DB_NUMBER >", value, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andDbNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("DB_NUMBER >=", value, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andDbNumberLessThan(Long value) {
            addCriterion("DB_NUMBER <", value, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andDbNumberLessThanOrEqualTo(Long value) {
            addCriterion("DB_NUMBER <=", value, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andDbNumberIn(List<Long> values) {
            addCriterion("DB_NUMBER in", values, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andDbNumberNotIn(List<Long> values) {
            addCriterion("DB_NUMBER not in", values, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andDbNumberBetween(Long value1, Long value2) {
            addCriterion("DB_NUMBER between", value1, value2, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andDbNumberNotBetween(Long value1, Long value2) {
            addCriterion("DB_NUMBER not between", value1, value2, "dbNumber");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseIsNull() {
            addCriterion("TAKE_OUT_WAREHOUSE is null");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseIsNotNull() {
            addCriterion("TAKE_OUT_WAREHOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseEqualTo(String value) {
            addCriterion("TAKE_OUT_WAREHOUSE =", value, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseNotEqualTo(String value) {
            addCriterion("TAKE_OUT_WAREHOUSE <>", value, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseGreaterThan(String value) {
            addCriterion("TAKE_OUT_WAREHOUSE >", value, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("TAKE_OUT_WAREHOUSE >=", value, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseLessThan(String value) {
            addCriterion("TAKE_OUT_WAREHOUSE <", value, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseLessThanOrEqualTo(String value) {
            addCriterion("TAKE_OUT_WAREHOUSE <=", value, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseLike(String value) {
            addCriterion("TAKE_OUT_WAREHOUSE like", value, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseNotLike(String value) {
            addCriterion("TAKE_OUT_WAREHOUSE not like", value, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseIn(List<String> values) {
            addCriterion("TAKE_OUT_WAREHOUSE in", values, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseNotIn(List<String> values) {
            addCriterion("TAKE_OUT_WAREHOUSE not in", values, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseBetween(String value1, String value2) {
            addCriterion("TAKE_OUT_WAREHOUSE between", value1, value2, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andTakeOutWarehouseNotBetween(String value1, String value2) {
            addCriterion("TAKE_OUT_WAREHOUSE not between", value1, value2, "takeOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseIsNull() {
            addCriterion("PUT_IN_WAREHOUSE is null");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseIsNotNull() {
            addCriterion("PUT_IN_WAREHOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseEqualTo(String value) {
            addCriterion("PUT_IN_WAREHOUSE =", value, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseNotEqualTo(String value) {
            addCriterion("PUT_IN_WAREHOUSE <>", value, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseGreaterThan(String value) {
            addCriterion("PUT_IN_WAREHOUSE >", value, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("PUT_IN_WAREHOUSE >=", value, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseLessThan(String value) {
            addCriterion("PUT_IN_WAREHOUSE <", value, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseLessThanOrEqualTo(String value) {
            addCriterion("PUT_IN_WAREHOUSE <=", value, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseLike(String value) {
            addCriterion("PUT_IN_WAREHOUSE like", value, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseNotLike(String value) {
            addCriterion("PUT_IN_WAREHOUSE not like", value, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseIn(List<String> values) {
            addCriterion("PUT_IN_WAREHOUSE in", values, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseNotIn(List<String> values) {
            addCriterion("PUT_IN_WAREHOUSE not in", values, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseBetween(String value1, String value2) {
            addCriterion("PUT_IN_WAREHOUSE between", value1, value2, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andPutInWarehouseNotBetween(String value1, String value2) {
            addCriterion("PUT_IN_WAREHOUSE not between", value1, value2, "putInWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsIsNull() {
            addCriterion("PRODUCT_SPECIFICATIONS is null");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsIsNotNull() {
            addCriterion("PRODUCT_SPECIFICATIONS is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsEqualTo(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS =", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotEqualTo(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS <>", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsGreaterThan(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS >", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS >=", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsLessThan(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS <", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS <=", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsLike(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS like", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotLike(String value) {
            addCriterion("PRODUCT_SPECIFICATIONS not like", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsIn(List<String> values) {
            addCriterion("PRODUCT_SPECIFICATIONS in", values, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotIn(List<String> values) {
            addCriterion("PRODUCT_SPECIFICATIONS not in", values, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsBetween(String value1, String value2) {
            addCriterion("PRODUCT_SPECIFICATIONS between", value1, value2, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SPECIFICATIONS not between", value1, value2, "productSpecifications");
            return (Criteria) this;
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

        public Criteria andCustomerMaterialNumberIsNull() {
            addCriterion("CUSTOMER_MATERIAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberIsNotNull() {
            addCriterion("CUSTOMER_MATERIAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER =", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberNotEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER <>", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberGreaterThan(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER >", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER >=", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberLessThan(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER <", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER <=", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberLike(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER like", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberNotLike(String value) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER not like", value, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberIn(List<String> values) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER in", values, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberNotIn(List<String> values) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER not in", values, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberBetween(String value1, String value2) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER between", value1, value2, "customerMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerMaterialNumberNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_MATERIAL_NUMBER not between", value1, value2, "customerMaterialNumber");
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

        public Criteria andProductUnitIsNull() {
            addCriterion("PRODUCT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNotNull() {
            addCriterion("PRODUCT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitEqualTo(String value) {
            addCriterion("PRODUCT_UNIT =", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotEqualTo(String value) {
            addCriterion("PRODUCT_UNIT <>", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThan(String value) {
            addCriterion("PRODUCT_UNIT >", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_UNIT >=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThan(String value) {
            addCriterion("PRODUCT_UNIT <", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_UNIT <=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLike(String value) {
            addCriterion("PRODUCT_UNIT like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotLike(String value) {
            addCriterion("PRODUCT_UNIT not like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitIn(List<String> values) {
            addCriterion("PRODUCT_UNIT in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotIn(List<String> values) {
            addCriterion("PRODUCT_UNIT not in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitBetween(String value1, String value2) {
            addCriterion("PRODUCT_UNIT between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_UNIT not between", value1, value2, "productUnit");
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