package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseSupplierInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseSupplierInformationExample() {
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

        public Criteria andEnterpriseNumberIsNull() {
            addCriterion("ENTERPRISE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberIsNotNull() {
            addCriterion("ENTERPRISE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberEqualTo(Long value) {
            addCriterion("ENTERPRISE_NUMBER =", value, "enterpriseNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberNotEqualTo(Long value) {
            addCriterion("ENTERPRISE_NUMBER <>", value, "enterpriseNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberGreaterThan(Long value) {
            addCriterion("ENTERPRISE_NUMBER >", value, "enterpriseNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ENTERPRISE_NUMBER >=", value, "enterpriseNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberLessThan(Long value) {
            addCriterion("ENTERPRISE_NUMBER <", value, "enterpriseNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberLessThanOrEqualTo(Long value) {
            addCriterion("ENTERPRISE_NUMBER <=", value, "enterpriseNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberIn(List<Long> values) {
            addCriterion("ENTERPRISE_NUMBER in", values, "enterpriseNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberNotIn(List<Long> values) {
            addCriterion("ENTERPRISE_NUMBER not in", values, "enterpriseNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberBetween(Long value1, Long value2) {
            addCriterion("ENTERPRISE_NUMBER between", value1, value2, "enterpriseNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumberNotBetween(Long value1, Long value2) {
            addCriterion("ENTERPRISE_NUMBER not between", value1, value2, "enterpriseNumber");
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

        public Criteria andSupplierNameIsNull() {
            addCriterion("SUPPLIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("SUPPLIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("SUPPLIER_NAME =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("SUPPLIER_NAME >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("SUPPLIER_NAME <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("SUPPLIER_NAME like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("SUPPLIER_NAME not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("SUPPLIER_NAME in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_NAME not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationIsNull() {
            addCriterion("SUPPLIER_ABBREVIATION is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationIsNotNull() {
            addCriterion("SUPPLIER_ABBREVIATION is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationEqualTo(String value) {
            addCriterion("SUPPLIER_ABBREVIATION =", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationNotEqualTo(String value) {
            addCriterion("SUPPLIER_ABBREVIATION <>", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationGreaterThan(String value) {
            addCriterion("SUPPLIER_ABBREVIATION >", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ABBREVIATION >=", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationLessThan(String value) {
            addCriterion("SUPPLIER_ABBREVIATION <", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ABBREVIATION <=", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationLike(String value) {
            addCriterion("SUPPLIER_ABBREVIATION like", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationNotLike(String value) {
            addCriterion("SUPPLIER_ABBREVIATION not like", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationIn(List<String> values) {
            addCriterion("SUPPLIER_ABBREVIATION in", values, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationNotIn(List<String> values) {
            addCriterion("SUPPLIER_ABBREVIATION not in", values, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ABBREVIATION between", value1, value2, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ABBREVIATION not between", value1, value2, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("BUYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("BUYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(String value) {
            addCriterion("BUYER_ID =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(String value) {
            addCriterion("BUYER_ID <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(String value) {
            addCriterion("BUYER_ID >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_ID >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(String value) {
            addCriterion("BUYER_ID <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(String value) {
            addCriterion("BUYER_ID <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLike(String value) {
            addCriterion("BUYER_ID like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotLike(String value) {
            addCriterion("BUYER_ID not like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<String> values) {
            addCriterion("BUYER_ID in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<String> values) {
            addCriterion("BUYER_ID not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(String value1, String value2) {
            addCriterion("BUYER_ID between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(String value1, String value2) {
            addCriterion("BUYER_ID not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("PAYMENT_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("PAYMENT_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(String value) {
            addCriterion("PAYMENT_METHOD =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(String value) {
            addCriterion("PAYMENT_METHOD <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(String value) {
            addCriterion("PAYMENT_METHOD >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(String value) {
            addCriterion("PAYMENT_METHOD <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLike(String value) {
            addCriterion("PAYMENT_METHOD like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotLike(String value) {
            addCriterion("PAYMENT_METHOD not like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<String> values) {
            addCriterion("PAYMENT_METHOD in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<String> values) {
            addCriterion("PAYMENT_METHOD not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeIsNull() {
            addCriterion("SUPPLIER_OPERATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeIsNotNull() {
            addCriterion("SUPPLIER_OPERATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeEqualTo(String value) {
            addCriterion("SUPPLIER_OPERATION_TYPE =", value, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeNotEqualTo(String value) {
            addCriterion("SUPPLIER_OPERATION_TYPE <>", value, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeGreaterThan(String value) {
            addCriterion("SUPPLIER_OPERATION_TYPE >", value, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_OPERATION_TYPE >=", value, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeLessThan(String value) {
            addCriterion("SUPPLIER_OPERATION_TYPE <", value, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_OPERATION_TYPE <=", value, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeLike(String value) {
            addCriterion("SUPPLIER_OPERATION_TYPE like", value, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeNotLike(String value) {
            addCriterion("SUPPLIER_OPERATION_TYPE not like", value, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeIn(List<String> values) {
            addCriterion("SUPPLIER_OPERATION_TYPE in", values, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeNotIn(List<String> values) {
            addCriterion("SUPPLIER_OPERATION_TYPE not in", values, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeBetween(String value1, String value2) {
            addCriterion("SUPPLIER_OPERATION_TYPE between", value1, value2, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andSupplierOperationTypeNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_OPERATION_TYPE not between", value1, value2, "supplierOperationType");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIsNull() {
            addCriterion("OPENING_BANK is null");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIsNotNull() {
            addCriterion("OPENING_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningBankEqualTo(String value) {
            addCriterion("OPENING_BANK =", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotEqualTo(String value) {
            addCriterion("OPENING_BANK <>", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankGreaterThan(String value) {
            addCriterion("OPENING_BANK >", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankGreaterThanOrEqualTo(String value) {
            addCriterion("OPENING_BANK >=", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLessThan(String value) {
            addCriterion("OPENING_BANK <", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLessThanOrEqualTo(String value) {
            addCriterion("OPENING_BANK <=", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLike(String value) {
            addCriterion("OPENING_BANK like", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotLike(String value) {
            addCriterion("OPENING_BANK not like", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIn(List<String> values) {
            addCriterion("OPENING_BANK in", values, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotIn(List<String> values) {
            addCriterion("OPENING_BANK not in", values, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankBetween(String value1, String value2) {
            addCriterion("OPENING_BANK between", value1, value2, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotBetween(String value1, String value2) {
            addCriterion("OPENING_BANK not between", value1, value2, "openingBank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andInviteStatusIsNull() {
            addCriterion("INVITE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInviteStatusIsNotNull() {
            addCriterion("INVITE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInviteStatusEqualTo(Long value) {
            addCriterion("INVITE_STATUS =", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusNotEqualTo(Long value) {
            addCriterion("INVITE_STATUS <>", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusGreaterThan(Long value) {
            addCriterion("INVITE_STATUS >", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("INVITE_STATUS >=", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusLessThan(Long value) {
            addCriterion("INVITE_STATUS <", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusLessThanOrEqualTo(Long value) {
            addCriterion("INVITE_STATUS <=", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusIn(List<Long> values) {
            addCriterion("INVITE_STATUS in", values, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusNotIn(List<Long> values) {
            addCriterion("INVITE_STATUS not in", values, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusBetween(Long value1, Long value2) {
            addCriterion("INVITE_STATUS between", value1, value2, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusNotBetween(Long value1, Long value2) {
            addCriterion("INVITE_STATUS not between", value1, value2, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Long value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Long value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Long value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Long value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Long value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Long> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Long> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Long value1, Long value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Long value1, Long value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNull() {
            addCriterion("JOIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNotNull() {
            addCriterion("JOIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andJoinDateEqualTo(String value) {
            addCriterion("JOIN_DATE =", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotEqualTo(String value) {
            addCriterion("JOIN_DATE <>", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThan(String value) {
            addCriterion("JOIN_DATE >", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThanOrEqualTo(String value) {
            addCriterion("JOIN_DATE >=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThan(String value) {
            addCriterion("JOIN_DATE <", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThanOrEqualTo(String value) {
            addCriterion("JOIN_DATE <=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLike(String value) {
            addCriterion("JOIN_DATE like", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotLike(String value) {
            addCriterion("JOIN_DATE not like", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateIn(List<String> values) {
            addCriterion("JOIN_DATE in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotIn(List<String> values) {
            addCriterion("JOIN_DATE not in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateBetween(String value1, String value2) {
            addCriterion("JOIN_DATE between", value1, value2, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotBetween(String value1, String value2) {
            addCriterion("JOIN_DATE not between", value1, value2, "joinDate");
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

        public Criteria andDutyParagraphIsNull() {
            addCriterion("DUTY_PARAGRAPH is null");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphIsNotNull() {
            addCriterion("DUTY_PARAGRAPH is not null");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphEqualTo(String value) {
            addCriterion("DUTY_PARAGRAPH =", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphNotEqualTo(String value) {
            addCriterion("DUTY_PARAGRAPH <>", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphGreaterThan(String value) {
            addCriterion("DUTY_PARAGRAPH >", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY_PARAGRAPH >=", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphLessThan(String value) {
            addCriterion("DUTY_PARAGRAPH <", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphLessThanOrEqualTo(String value) {
            addCriterion("DUTY_PARAGRAPH <=", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphLike(String value) {
            addCriterion("DUTY_PARAGRAPH like", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphNotLike(String value) {
            addCriterion("DUTY_PARAGRAPH not like", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphIn(List<String> values) {
            addCriterion("DUTY_PARAGRAPH in", values, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphNotIn(List<String> values) {
            addCriterion("DUTY_PARAGRAPH not in", values, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphBetween(String value1, String value2) {
            addCriterion("DUTY_PARAGRAPH between", value1, value2, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphNotBetween(String value1, String value2) {
            addCriterion("DUTY_PARAGRAPH not between", value1, value2, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("CONTACT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("CONTACT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("CONTACT_PHONE =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("CONTACT_PHONE <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("CONTACT_PHONE >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("CONTACT_PHONE <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("CONTACT_PHONE like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("CONTACT_PHONE not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("CONTACT_PHONE in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("CONTACT_PHONE not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("CONTACT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("CONTACT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("CONTACT_ADDRESS >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("CONTACT_ADDRESS <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("CONTACT_ADDRESS like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("CONTACT_ADDRESS not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNull() {
            addCriterion("SUPPLIER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNotNull() {
            addCriterion("SUPPLIER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeEqualTo(String value) {
            addCriterion("SUPPLIER_TYPE =", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotEqualTo(String value) {
            addCriterion("SUPPLIER_TYPE <>", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThan(String value) {
            addCriterion("SUPPLIER_TYPE >", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_TYPE >=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThan(String value) {
            addCriterion("SUPPLIER_TYPE <", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_TYPE <=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLike(String value) {
            addCriterion("SUPPLIER_TYPE like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotLike(String value) {
            addCriterion("SUPPLIER_TYPE not like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIn(List<String> values) {
            addCriterion("SUPPLIER_TYPE in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotIn(List<String> values) {
            addCriterion("SUPPLIER_TYPE not in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeBetween(String value1, String value2) {
            addCriterion("SUPPLIER_TYPE between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_TYPE not between", value1, value2, "supplierType");
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