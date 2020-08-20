package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseDepotToCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseDepotToCaseExample() {
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

        public Criteria andCaseNoIsNull() {
            addCriterion("CASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("CASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(String value) {
            addCriterion("CASE_NO =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(String value) {
            addCriterion("CASE_NO <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(String value) {
            addCriterion("CASE_NO >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NO >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(String value) {
            addCriterion("CASE_NO <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(String value) {
            addCriterion("CASE_NO <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLike(String value) {
            addCriterion("CASE_NO like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotLike(String value) {
            addCriterion("CASE_NO not like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<String> values) {
            addCriterion("CASE_NO in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<String> values) {
            addCriterion("CASE_NO not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(String value1, String value2) {
            addCriterion("CASE_NO between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(String value1, String value2) {
            addCriterion("CASE_NO not between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNull() {
            addCriterion("MAX_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNotNull() {
            addCriterion("MAX_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberEqualTo(Long value) {
            addCriterion("MAX_NUMBER =", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotEqualTo(Long value) {
            addCriterion("MAX_NUMBER <>", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThan(Long value) {
            addCriterion("MAX_NUMBER >", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_NUMBER >=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThan(Long value) {
            addCriterion("MAX_NUMBER <", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThanOrEqualTo(Long value) {
            addCriterion("MAX_NUMBER <=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIn(List<Long> values) {
            addCriterion("MAX_NUMBER in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotIn(List<Long> values) {
            addCriterion("MAX_NUMBER not in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberBetween(Long value1, Long value2) {
            addCriterion("MAX_NUMBER between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotBetween(Long value1, Long value2) {
            addCriterion("MAX_NUMBER not between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberIsNull() {
            addCriterion("REAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRealNumberIsNotNull() {
            addCriterion("REAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRealNumberEqualTo(Long value) {
            addCriterion("REAL_NUMBER =", value, "realNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberNotEqualTo(Long value) {
            addCriterion("REAL_NUMBER <>", value, "realNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberGreaterThan(Long value) {
            addCriterion("REAL_NUMBER >", value, "realNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("REAL_NUMBER >=", value, "realNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberLessThan(Long value) {
            addCriterion("REAL_NUMBER <", value, "realNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberLessThanOrEqualTo(Long value) {
            addCriterion("REAL_NUMBER <=", value, "realNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberIn(List<Long> values) {
            addCriterion("REAL_NUMBER in", values, "realNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberNotIn(List<Long> values) {
            addCriterion("REAL_NUMBER not in", values, "realNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberBetween(Long value1, Long value2) {
            addCriterion("REAL_NUMBER between", value1, value2, "realNumber");
            return (Criteria) this;
        }

        public Criteria andRealNumberNotBetween(Long value1, Long value2) {
            addCriterion("REAL_NUMBER not between", value1, value2, "realNumber");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIsNull() {
            addCriterion("PRINT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIsNotNull() {
            addCriterion("PRINT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeEqualTo(Date value) {
            addCriterion("PRINT_TIME =", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotEqualTo(Date value) {
            addCriterion("PRINT_TIME <>", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThan(Date value) {
            addCriterion("PRINT_TIME >", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PRINT_TIME >=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThan(Date value) {
            addCriterion("PRINT_TIME <", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThanOrEqualTo(Date value) {
            addCriterion("PRINT_TIME <=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIn(List<Date> values) {
            addCriterion("PRINT_TIME in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotIn(List<Date> values) {
            addCriterion("PRINT_TIME not in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeBetween(Date value1, Date value2) {
            addCriterion("PRINT_TIME between", value1, value2, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotBetween(Date value1, Date value2) {
            addCriterion("PRINT_TIME not between", value1, value2, "printTime");
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

        public Criteria andFreeNumberIsNull() {
            addCriterion("FREE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFreeNumberIsNotNull() {
            addCriterion("FREE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFreeNumberEqualTo(Long value) {
            addCriterion("FREE_NUMBER =", value, "freeNumber");
            return (Criteria) this;
        }

        public Criteria andFreeNumberNotEqualTo(Long value) {
            addCriterion("FREE_NUMBER <>", value, "freeNumber");
            return (Criteria) this;
        }

        public Criteria andFreeNumberGreaterThan(Long value) {
            addCriterion("FREE_NUMBER >", value, "freeNumber");
            return (Criteria) this;
        }

        public Criteria andFreeNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("FREE_NUMBER >=", value, "freeNumber");
            return (Criteria) this;
        }

        public Criteria andFreeNumberLessThan(Long value) {
            addCriterion("FREE_NUMBER <", value, "freeNumber");
            return (Criteria) this;
        }

        public Criteria andFreeNumberLessThanOrEqualTo(Long value) {
            addCriterion("FREE_NUMBER <=", value, "freeNumber");
            return (Criteria) this;
        }

        public Criteria andFreeNumberIn(List<Long> values) {
            addCriterion("FREE_NUMBER in", values, "freeNumber");
            return (Criteria) this;
        }

        public Criteria andFreeNumberNotIn(List<Long> values) {
            addCriterion("FREE_NUMBER not in", values, "freeNumber");
            return (Criteria) this;
        }

        public Criteria andFreeNumberBetween(Long value1, Long value2) {
            addCriterion("FREE_NUMBER between", value1, value2, "freeNumber");
            return (Criteria) this;
        }

        public Criteria andFreeNumberNotBetween(Long value1, Long value2) {
            addCriterion("FREE_NUMBER not between", value1, value2, "freeNumber");
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

        public Criteria andMinPackageNumberIsNull() {
            addCriterion("MIN_PACKAGE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberIsNotNull() {
            addCriterion("MIN_PACKAGE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberEqualTo(Long value) {
            addCriterion("MIN_PACKAGE_NUMBER =", value, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberNotEqualTo(Long value) {
            addCriterion("MIN_PACKAGE_NUMBER <>", value, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberGreaterThan(Long value) {
            addCriterion("MIN_PACKAGE_NUMBER >", value, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_PACKAGE_NUMBER >=", value, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberLessThan(Long value) {
            addCriterion("MIN_PACKAGE_NUMBER <", value, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberLessThanOrEqualTo(Long value) {
            addCriterion("MIN_PACKAGE_NUMBER <=", value, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberIn(List<Long> values) {
            addCriterion("MIN_PACKAGE_NUMBER in", values, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberNotIn(List<Long> values) {
            addCriterion("MIN_PACKAGE_NUMBER not in", values, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberBetween(Long value1, Long value2) {
            addCriterion("MIN_PACKAGE_NUMBER between", value1, value2, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andMinPackageNumberNotBetween(Long value1, Long value2) {
            addCriterion("MIN_PACKAGE_NUMBER not between", value1, value2, "minPackageNumber");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(Long value) {
            addCriterion("PRODUCT =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(Long value) {
            addCriterion("PRODUCT <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(Long value) {
            addCriterion("PRODUCT >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(Long value) {
            addCriterion("PRODUCT <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCT <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<Long> values) {
            addCriterion("PRODUCT in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<Long> values) {
            addCriterion("PRODUCT not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(Long value1, Long value2) {
            addCriterion("PRODUCT between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT not between", value1, value2, "product");
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