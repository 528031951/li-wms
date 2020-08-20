package com.bpm.gd.wms.outbound.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HvGdWorkBomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HvGdWorkBomExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBomItemNoIsNull() {
            addCriterion("BOM_ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andBomItemNoIsNotNull() {
            addCriterion("BOM_ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBomItemNoEqualTo(String value) {
            addCriterion("BOM_ITEM_NO =", value, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoNotEqualTo(String value) {
            addCriterion("BOM_ITEM_NO <>", value, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoGreaterThan(String value) {
            addCriterion("BOM_ITEM_NO >", value, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("BOM_ITEM_NO >=", value, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoLessThan(String value) {
            addCriterion("BOM_ITEM_NO <", value, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoLessThanOrEqualTo(String value) {
            addCriterion("BOM_ITEM_NO <=", value, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoLike(String value) {
            addCriterion("BOM_ITEM_NO like", value, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoNotLike(String value) {
            addCriterion("BOM_ITEM_NO not like", value, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoIn(List<String> values) {
            addCriterion("BOM_ITEM_NO in", values, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoNotIn(List<String> values) {
            addCriterion("BOM_ITEM_NO not in", values, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoBetween(String value1, String value2) {
            addCriterion("BOM_ITEM_NO between", value1, value2, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andBomItemNoNotBetween(String value1, String value2) {
            addCriterion("BOM_ITEM_NO not between", value1, value2, "bomItemNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoIsNull() {
            addCriterion("MAIN_MATERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoIsNotNull() {
            addCriterion("MAIN_MATERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoEqualTo(String value) {
            addCriterion("MAIN_MATERIAL_NO =", value, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoNotEqualTo(String value) {
            addCriterion("MAIN_MATERIAL_NO <>", value, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoGreaterThan(String value) {
            addCriterion("MAIN_MATERIAL_NO >", value, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_MATERIAL_NO >=", value, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoLessThan(String value) {
            addCriterion("MAIN_MATERIAL_NO <", value, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoLessThanOrEqualTo(String value) {
            addCriterion("MAIN_MATERIAL_NO <=", value, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoLike(String value) {
            addCriterion("MAIN_MATERIAL_NO like", value, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoNotLike(String value) {
            addCriterion("MAIN_MATERIAL_NO not like", value, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoIn(List<String> values) {
            addCriterion("MAIN_MATERIAL_NO in", values, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoNotIn(List<String> values) {
            addCriterion("MAIN_MATERIAL_NO not in", values, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoBetween(String value1, String value2) {
            addCriterion("MAIN_MATERIAL_NO between", value1, value2, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNoNotBetween(String value1, String value2) {
            addCriterion("MAIN_MATERIAL_NO not between", value1, value2, "mainMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecIsNull() {
            addCriterion("MAIN_MATERIAL_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecIsNotNull() {
            addCriterion("MAIN_MATERIAL_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecEqualTo(String value) {
            addCriterion("MAIN_MATERIAL_SPEC =", value, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecNotEqualTo(String value) {
            addCriterion("MAIN_MATERIAL_SPEC <>", value, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecGreaterThan(String value) {
            addCriterion("MAIN_MATERIAL_SPEC >", value, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_MATERIAL_SPEC >=", value, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecLessThan(String value) {
            addCriterion("MAIN_MATERIAL_SPEC <", value, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecLessThanOrEqualTo(String value) {
            addCriterion("MAIN_MATERIAL_SPEC <=", value, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecLike(String value) {
            addCriterion("MAIN_MATERIAL_SPEC like", value, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecNotLike(String value) {
            addCriterion("MAIN_MATERIAL_SPEC not like", value, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecIn(List<String> values) {
            addCriterion("MAIN_MATERIAL_SPEC in", values, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecNotIn(List<String> values) {
            addCriterion("MAIN_MATERIAL_SPEC not in", values, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecBetween(String value1, String value2) {
            addCriterion("MAIN_MATERIAL_SPEC between", value1, value2, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMainMaterialSpecNotBetween(String value1, String value2) {
            addCriterion("MAIN_MATERIAL_SPEC not between", value1, value2, "mainMaterialSpec");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoIsNull() {
            addCriterion("MATERIAL_ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoIsNotNull() {
            addCriterion("MATERIAL_ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoEqualTo(String value) {
            addCriterion("MATERIAL_ITEM_NO =", value, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoNotEqualTo(String value) {
            addCriterion("MATERIAL_ITEM_NO <>", value, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoGreaterThan(String value) {
            addCriterion("MATERIAL_ITEM_NO >", value, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_ITEM_NO >=", value, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoLessThan(String value) {
            addCriterion("MATERIAL_ITEM_NO <", value, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_ITEM_NO <=", value, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoLike(String value) {
            addCriterion("MATERIAL_ITEM_NO like", value, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoNotLike(String value) {
            addCriterion("MATERIAL_ITEM_NO not like", value, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoIn(List<String> values) {
            addCriterion("MATERIAL_ITEM_NO in", values, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoNotIn(List<String> values) {
            addCriterion("MATERIAL_ITEM_NO not in", values, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoBetween(String value1, String value2) {
            addCriterion("MATERIAL_ITEM_NO between", value1, value2, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialItemNoNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_ITEM_NO not between", value1, value2, "materialItemNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNull() {
            addCriterion("MATERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNotNull() {
            addCriterion("MATERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoEqualTo(String value) {
            addCriterion("MATERIAL_NO =", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotEqualTo(String value) {
            addCriterion("MATERIAL_NO <>", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThan(String value) {
            addCriterion("MATERIAL_NO >", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NO >=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThan(String value) {
            addCriterion("MATERIAL_NO <", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NO <=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLike(String value) {
            addCriterion("MATERIAL_NO like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotLike(String value) {
            addCriterion("MATERIAL_NO not like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIn(List<String> values) {
            addCriterion("MATERIAL_NO in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotIn(List<String> values) {
            addCriterion("MATERIAL_NO not in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoBetween(String value1, String value2) {
            addCriterion("MATERIAL_NO between", value1, value2, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_NO not between", value1, value2, "materialNo");
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

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityIsNull() {
            addCriterion("ISSUED_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityIsNotNull() {
            addCriterion("ISSUED_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityEqualTo(BigDecimal value) {
            addCriterion("ISSUED_QUANTITY =", value, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityNotEqualTo(BigDecimal value) {
            addCriterion("ISSUED_QUANTITY <>", value, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityGreaterThan(BigDecimal value) {
            addCriterion("ISSUED_QUANTITY >", value, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSUED_QUANTITY >=", value, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityLessThan(BigDecimal value) {
            addCriterion("ISSUED_QUANTITY <", value, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSUED_QUANTITY <=", value, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityIn(List<BigDecimal> values) {
            addCriterion("ISSUED_QUANTITY in", values, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityNotIn(List<BigDecimal> values) {
            addCriterion("ISSUED_QUANTITY not in", values, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSUED_QUANTITY between", value1, value2, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andIssuedQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSUED_QUANTITY not between", value1, value2, "issuedQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityIsNull() {
            addCriterion("SEND_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andSendQuantityIsNotNull() {
            addCriterion("SEND_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andSendQuantityEqualTo(BigDecimal value) {
            addCriterion("SEND_QUANTITY =", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityNotEqualTo(BigDecimal value) {
            addCriterion("SEND_QUANTITY <>", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityGreaterThan(BigDecimal value) {
            addCriterion("SEND_QUANTITY >", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEND_QUANTITY >=", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityLessThan(BigDecimal value) {
            addCriterion("SEND_QUANTITY <", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEND_QUANTITY <=", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityIn(List<BigDecimal> values) {
            addCriterion("SEND_QUANTITY in", values, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityNotIn(List<BigDecimal> values) {
            addCriterion("SEND_QUANTITY not in", values, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEND_QUANTITY between", value1, value2, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEND_QUANTITY not between", value1, value2, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityIsNull() {
            addCriterion("RECEIVE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityIsNotNull() {
            addCriterion("RECEIVE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_QUANTITY =", value, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_QUANTITY <>", value, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityGreaterThan(BigDecimal value) {
            addCriterion("RECEIVE_QUANTITY >", value, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_QUANTITY >=", value, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityLessThan(BigDecimal value) {
            addCriterion("RECEIVE_QUANTITY <", value, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_QUANTITY <=", value, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_QUANTITY in", values, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_QUANTITY not in", values, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_QUANTITY between", value1, value2, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_QUANTITY not between", value1, value2, "receiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceiveStateIsNull() {
            addCriterion("RECEIVE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveStateIsNotNull() {
            addCriterion("RECEIVE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveStateEqualTo(Integer value) {
            addCriterion("RECEIVE_STATE =", value, "receiveState");
            return (Criteria) this;
        }

        public Criteria andReceiveStateNotEqualTo(Integer value) {
            addCriterion("RECEIVE_STATE <>", value, "receiveState");
            return (Criteria) this;
        }

        public Criteria andReceiveStateGreaterThan(Integer value) {
            addCriterion("RECEIVE_STATE >", value, "receiveState");
            return (Criteria) this;
        }

        public Criteria andReceiveStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECEIVE_STATE >=", value, "receiveState");
            return (Criteria) this;
        }

        public Criteria andReceiveStateLessThan(Integer value) {
            addCriterion("RECEIVE_STATE <", value, "receiveState");
            return (Criteria) this;
        }

        public Criteria andReceiveStateLessThanOrEqualTo(Integer value) {
            addCriterion("RECEIVE_STATE <=", value, "receiveState");
            return (Criteria) this;
        }

        public Criteria andReceiveStateIn(List<Integer> values) {
            addCriterion("RECEIVE_STATE in", values, "receiveState");
            return (Criteria) this;
        }

        public Criteria andReceiveStateNotIn(List<Integer> values) {
            addCriterion("RECEIVE_STATE not in", values, "receiveState");
            return (Criteria) this;
        }

        public Criteria andReceiveStateBetween(Integer value1, Integer value2) {
            addCriterion("RECEIVE_STATE between", value1, value2, "receiveState");
            return (Criteria) this;
        }

        public Criteria andReceiveStateNotBetween(Integer value1, Integer value2) {
            addCriterion("RECEIVE_STATE not between", value1, value2, "receiveState");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("CONFIRM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("CONFIRM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("CONFIRM_TIME =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("CONFIRM_TIME >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("CONFIRM_TIME <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("CONFIRM_TIME in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("CONFIRM_TIME not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
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