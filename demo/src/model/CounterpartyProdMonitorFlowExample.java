package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CounterpartyProdMonitorFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CounterpartyProdMonitorFlowExample() {
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

        public Criteria andDocumentIdIsNull() {
            addCriterion("DOCUMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIsNotNull() {
            addCriterion("DOCUMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdEqualTo(String value) {
            addCriterion("DOCUMENT_ID =", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotEqualTo(String value) {
            addCriterion("DOCUMENT_ID <>", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThan(String value) {
            addCriterion("DOCUMENT_ID >", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_ID >=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThan(String value) {
            addCriterion("DOCUMENT_ID <", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_ID <=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLike(String value) {
            addCriterion("DOCUMENT_ID like", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotLike(String value) {
            addCriterion("DOCUMENT_ID not like", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIn(List<String> values) {
            addCriterion("DOCUMENT_ID in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotIn(List<String> values) {
            addCriterion("DOCUMENT_ID not in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdBetween(String value1, String value2) {
            addCriterion("DOCUMENT_ID between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_ID not between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("CLIENT_ID =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("CLIENT_ID <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("CLIENT_ID >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_ID >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("CLIENT_ID <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_ID <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("CLIENT_ID like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("CLIENT_ID not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("CLIENT_ID in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("CLIENT_ID not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("CLIENT_ID between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("CLIENT_ID not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIsNull() {
            addCriterion("CORPORATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIsNotNull() {
            addCriterion("CORPORATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameEqualTo(String value) {
            addCriterion("CORPORATE_NAME =", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotEqualTo(String value) {
            addCriterion("CORPORATE_NAME <>", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThan(String value) {
            addCriterion("CORPORATE_NAME >", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CORPORATE_NAME >=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThan(String value) {
            addCriterion("CORPORATE_NAME <", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThanOrEqualTo(String value) {
            addCriterion("CORPORATE_NAME <=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLike(String value) {
            addCriterion("CORPORATE_NAME like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotLike(String value) {
            addCriterion("CORPORATE_NAME not like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIn(List<String> values) {
            addCriterion("CORPORATE_NAME in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotIn(List<String> values) {
            addCriterion("CORPORATE_NAME not in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameBetween(String value1, String value2) {
            addCriterion("CORPORATE_NAME between", value1, value2, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotBetween(String value1, String value2) {
            addCriterion("CORPORATE_NAME not between", value1, value2, "corporateName");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeIsNull() {
            addCriterion("UNIFIEDSOCIAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeIsNotNull() {
            addCriterion("UNIFIEDSOCIAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeEqualTo(String value) {
            addCriterion("UNIFIEDSOCIAL_CODE =", value, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeNotEqualTo(String value) {
            addCriterion("UNIFIEDSOCIAL_CODE <>", value, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeGreaterThan(String value) {
            addCriterion("UNIFIEDSOCIAL_CODE >", value, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNIFIEDSOCIAL_CODE >=", value, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeLessThan(String value) {
            addCriterion("UNIFIEDSOCIAL_CODE <", value, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeLessThanOrEqualTo(String value) {
            addCriterion("UNIFIEDSOCIAL_CODE <=", value, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeLike(String value) {
            addCriterion("UNIFIEDSOCIAL_CODE like", value, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeNotLike(String value) {
            addCriterion("UNIFIEDSOCIAL_CODE not like", value, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeIn(List<String> values) {
            addCriterion("UNIFIEDSOCIAL_CODE in", values, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeNotIn(List<String> values) {
            addCriterion("UNIFIEDSOCIAL_CODE not in", values, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeBetween(String value1, String value2) {
            addCriterion("UNIFIEDSOCIAL_CODE between", value1, value2, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedsocialCodeNotBetween(String value1, String value2) {
            addCriterion("UNIFIEDSOCIAL_CODE not between", value1, value2, "unifiedsocialCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNull() {
            addCriterion("REVIEW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNotNull() {
            addCriterion("REVIEW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewDateEqualTo(Date value) {
            addCriterion("REVIEW_DATE =", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotEqualTo(Date value) {
            addCriterion("REVIEW_DATE <>", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThan(Date value) {
            addCriterion("REVIEW_DATE >", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REVIEW_DATE >=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThan(Date value) {
            addCriterion("REVIEW_DATE <", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThanOrEqualTo(Date value) {
            addCriterion("REVIEW_DATE <=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateIn(List<Date> values) {
            addCriterion("REVIEW_DATE in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotIn(List<Date> values) {
            addCriterion("REVIEW_DATE not in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateBetween(Date value1, Date value2) {
            addCriterion("REVIEW_DATE between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotBetween(Date value1, Date value2) {
            addCriterion("REVIEW_DATE not between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNull() {
            addCriterion("CURRENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("CURRENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(String value) {
            addCriterion("CURRENT_STATUS =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(String value) {
            addCriterion("CURRENT_STATUS <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(String value) {
            addCriterion("CURRENT_STATUS >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_STATUS >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(String value) {
            addCriterion("CURRENT_STATUS <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_STATUS <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLike(String value) {
            addCriterion("CURRENT_STATUS like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotLike(String value) {
            addCriterion("CURRENT_STATUS not like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<String> values) {
            addCriterion("CURRENT_STATUS in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<String> values) {
            addCriterion("CURRENT_STATUS not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(String value1, String value2) {
            addCriterion("CURRENT_STATUS between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(String value1, String value2) {
            addCriterion("CURRENT_STATUS not between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIsNull() {
            addCriterion("CURRENT_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIsNotNull() {
            addCriterion("CURRENT_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorEqualTo(String value) {
            addCriterion("CURRENT_OPERATOR =", value, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNotEqualTo(String value) {
            addCriterion("CURRENT_OPERATOR <>", value, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorGreaterThan(String value) {
            addCriterion("CURRENT_OPERATOR >", value, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_OPERATOR >=", value, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorLessThan(String value) {
            addCriterion("CURRENT_OPERATOR <", value, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_OPERATOR <=", value, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorLike(String value) {
            addCriterion("CURRENT_OPERATOR like", value, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNotLike(String value) {
            addCriterion("CURRENT_OPERATOR not like", value, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIn(List<String> values) {
            addCriterion("CURRENT_OPERATOR in", values, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNotIn(List<String> values) {
            addCriterion("CURRENT_OPERATOR not in", values, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorBetween(String value1, String value2) {
            addCriterion("CURRENT_OPERATOR between", value1, value2, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNotBetween(String value1, String value2) {
            addCriterion("CURRENT_OPERATOR not between", value1, value2, "currentOperator");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameIsNull() {
            addCriterion("CURRENT_ACTIVITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameIsNotNull() {
            addCriterion("CURRENT_ACTIVITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameEqualTo(String value) {
            addCriterion("CURRENT_ACTIVITY_NAME =", value, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameNotEqualTo(String value) {
            addCriterion("CURRENT_ACTIVITY_NAME <>", value, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameGreaterThan(String value) {
            addCriterion("CURRENT_ACTIVITY_NAME >", value, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_ACTIVITY_NAME >=", value, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameLessThan(String value) {
            addCriterion("CURRENT_ACTIVITY_NAME <", value, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_ACTIVITY_NAME <=", value, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameLike(String value) {
            addCriterion("CURRENT_ACTIVITY_NAME like", value, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameNotLike(String value) {
            addCriterion("CURRENT_ACTIVITY_NAME not like", value, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameIn(List<String> values) {
            addCriterion("CURRENT_ACTIVITY_NAME in", values, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameNotIn(List<String> values) {
            addCriterion("CURRENT_ACTIVITY_NAME not in", values, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameBetween(String value1, String value2) {
            addCriterion("CURRENT_ACTIVITY_NAME between", value1, value2, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCurrentActivityNameNotBetween(String value1, String value2) {
            addCriterion("CURRENT_ACTIVITY_NAME not between", value1, value2, "currentActivityName");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIsNull() {
            addCriterion("CREATED_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIsNotNull() {
            addCriterion("CREATED_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeEqualTo(Date value) {
            addCriterion("CREATED_DATETIME =", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotEqualTo(Date value) {
            addCriterion("CREATED_DATETIME <>", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeGreaterThan(Date value) {
            addCriterion("CREATED_DATETIME >", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATETIME >=", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeLessThan(Date value) {
            addCriterion("CREATED_DATETIME <", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATETIME <=", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIn(List<Date> values) {
            addCriterion("CREATED_DATETIME in", values, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotIn(List<Date> values) {
            addCriterion("CREATED_DATETIME not in", values, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATETIME between", value1, value2, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATETIME not between", value1, value2, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIsNull() {
            addCriterion("WORK_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIsNotNull() {
            addCriterion("WORK_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneEqualTo(String value) {
            addCriterion("WORK_PHONE =", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotEqualTo(String value) {
            addCriterion("WORK_PHONE <>", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneGreaterThan(String value) {
            addCriterion("WORK_PHONE >", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PHONE >=", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLessThan(String value) {
            addCriterion("WORK_PHONE <", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLessThanOrEqualTo(String value) {
            addCriterion("WORK_PHONE <=", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLike(String value) {
            addCriterion("WORK_PHONE like", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotLike(String value) {
            addCriterion("WORK_PHONE not like", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIn(List<String> values) {
            addCriterion("WORK_PHONE in", values, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotIn(List<String> values) {
            addCriterion("WORK_PHONE not in", values, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneBetween(String value1, String value2) {
            addCriterion("WORK_PHONE between", value1, value2, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotBetween(String value1, String value2) {
            addCriterion("WORK_PHONE not between", value1, value2, "workPhone");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelIsNull() {
            addCriterion("SECURITY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelIsNotNull() {
            addCriterion("SECURITY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelEqualTo(String value) {
            addCriterion("SECURITY_LEVEL =", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotEqualTo(String value) {
            addCriterion("SECURITY_LEVEL <>", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelGreaterThan(String value) {
            addCriterion("SECURITY_LEVEL >", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITY_LEVEL >=", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelLessThan(String value) {
            addCriterion("SECURITY_LEVEL <", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelLessThanOrEqualTo(String value) {
            addCriterion("SECURITY_LEVEL <=", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelLike(String value) {
            addCriterion("SECURITY_LEVEL like", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotLike(String value) {
            addCriterion("SECURITY_LEVEL not like", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelIn(List<String> values) {
            addCriterion("SECURITY_LEVEL in", values, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotIn(List<String> values) {
            addCriterion("SECURITY_LEVEL not in", values, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelBetween(String value1, String value2) {
            addCriterion("SECURITY_LEVEL between", value1, value2, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotBetween(String value1, String value2) {
            addCriterion("SECURITY_LEVEL not between", value1, value2, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailIsNull() {
            addCriterion("SECURITY_LEVEL_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailIsNotNull() {
            addCriterion("SECURITY_LEVEL_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailEqualTo(String value) {
            addCriterion("SECURITY_LEVEL_DETAIL =", value, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailNotEqualTo(String value) {
            addCriterion("SECURITY_LEVEL_DETAIL <>", value, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailGreaterThan(String value) {
            addCriterion("SECURITY_LEVEL_DETAIL >", value, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITY_LEVEL_DETAIL >=", value, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailLessThan(String value) {
            addCriterion("SECURITY_LEVEL_DETAIL <", value, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailLessThanOrEqualTo(String value) {
            addCriterion("SECURITY_LEVEL_DETAIL <=", value, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailLike(String value) {
            addCriterion("SECURITY_LEVEL_DETAIL like", value, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailNotLike(String value) {
            addCriterion("SECURITY_LEVEL_DETAIL not like", value, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailIn(List<String> values) {
            addCriterion("SECURITY_LEVEL_DETAIL in", values, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailNotIn(List<String> values) {
            addCriterion("SECURITY_LEVEL_DETAIL not in", values, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailBetween(String value1, String value2) {
            addCriterion("SECURITY_LEVEL_DETAIL between", value1, value2, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelDetailNotBetween(String value1, String value2) {
            addCriterion("SECURITY_LEVEL_DETAIL not between", value1, value2, "securityLevelDetail");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelIsNull() {
            addCriterion("URGENCY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelIsNotNull() {
            addCriterion("URGENCY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelEqualTo(String value) {
            addCriterion("URGENCY_LEVEL =", value, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelNotEqualTo(String value) {
            addCriterion("URGENCY_LEVEL <>", value, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelGreaterThan(String value) {
            addCriterion("URGENCY_LEVEL >", value, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("URGENCY_LEVEL >=", value, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelLessThan(String value) {
            addCriterion("URGENCY_LEVEL <", value, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelLessThanOrEqualTo(String value) {
            addCriterion("URGENCY_LEVEL <=", value, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelLike(String value) {
            addCriterion("URGENCY_LEVEL like", value, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelNotLike(String value) {
            addCriterion("URGENCY_LEVEL not like", value, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelIn(List<String> values) {
            addCriterion("URGENCY_LEVEL in", values, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelNotIn(List<String> values) {
            addCriterion("URGENCY_LEVEL not in", values, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelBetween(String value1, String value2) {
            addCriterion("URGENCY_LEVEL between", value1, value2, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelNotBetween(String value1, String value2) {
            addCriterion("URGENCY_LEVEL not between", value1, value2, "urgencyLevel");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonIsNull() {
            addCriterion("URGENCY_LEVEL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonIsNotNull() {
            addCriterion("URGENCY_LEVEL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonEqualTo(String value) {
            addCriterion("URGENCY_LEVEL_REASON =", value, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonNotEqualTo(String value) {
            addCriterion("URGENCY_LEVEL_REASON <>", value, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonGreaterThan(String value) {
            addCriterion("URGENCY_LEVEL_REASON >", value, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("URGENCY_LEVEL_REASON >=", value, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonLessThan(String value) {
            addCriterion("URGENCY_LEVEL_REASON <", value, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonLessThanOrEqualTo(String value) {
            addCriterion("URGENCY_LEVEL_REASON <=", value, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonLike(String value) {
            addCriterion("URGENCY_LEVEL_REASON like", value, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonNotLike(String value) {
            addCriterion("URGENCY_LEVEL_REASON not like", value, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonIn(List<String> values) {
            addCriterion("URGENCY_LEVEL_REASON in", values, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonNotIn(List<String> values) {
            addCriterion("URGENCY_LEVEL_REASON not in", values, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonBetween(String value1, String value2) {
            addCriterion("URGENCY_LEVEL_REASON between", value1, value2, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andUrgencyLevelReasonNotBetween(String value1, String value2) {
            addCriterion("URGENCY_LEVEL_REASON not between", value1, value2, "urgencyLevelReason");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoIsNull() {
            addCriterion("BPM_DOC_NO is null");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoIsNotNull() {
            addCriterion("BPM_DOC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoEqualTo(String value) {
            addCriterion("BPM_DOC_NO =", value, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoNotEqualTo(String value) {
            addCriterion("BPM_DOC_NO <>", value, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoGreaterThan(String value) {
            addCriterion("BPM_DOC_NO >", value, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_DOC_NO >=", value, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoLessThan(String value) {
            addCriterion("BPM_DOC_NO <", value, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoLessThanOrEqualTo(String value) {
            addCriterion("BPM_DOC_NO <=", value, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoLike(String value) {
            addCriterion("BPM_DOC_NO like", value, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoNotLike(String value) {
            addCriterion("BPM_DOC_NO not like", value, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoIn(List<String> values) {
            addCriterion("BPM_DOC_NO in", values, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoNotIn(List<String> values) {
            addCriterion("BPM_DOC_NO not in", values, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoBetween(String value1, String value2) {
            addCriterion("BPM_DOC_NO between", value1, value2, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andBpmDocNoNotBetween(String value1, String value2) {
            addCriterion("BPM_DOC_NO not between", value1, value2, "bpmDocNo");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
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