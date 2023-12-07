package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientReviewRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientReviewRecordExample() {
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

        public Criteria andDocIdIsNull() {
            addCriterion("DOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNotNull() {
            addCriterion("DOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDocIdEqualTo(String value) {
            addCriterion("DOC_ID =", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotEqualTo(String value) {
            addCriterion("DOC_ID <>", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThan(String value) {
            addCriterion("DOC_ID >", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_ID >=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThan(String value) {
            addCriterion("DOC_ID <", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThanOrEqualTo(String value) {
            addCriterion("DOC_ID <=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLike(String value) {
            addCriterion("DOC_ID like", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotLike(String value) {
            addCriterion("DOC_ID not like", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdIn(List<String> values) {
            addCriterion("DOC_ID in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotIn(List<String> values) {
            addCriterion("DOC_ID not in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdBetween(String value1, String value2) {
            addCriterion("DOC_ID between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotBetween(String value1, String value2) {
            addCriterion("DOC_ID not between", value1, value2, "docId");
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

        public Criteria andClientNameIsNull() {
            addCriterion("CLIENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("CLIENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("CLIENT_NAME =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("CLIENT_NAME <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("CLIENT_NAME >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_NAME >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("CLIENT_NAME <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_NAME <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("CLIENT_NAME like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("CLIENT_NAME not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("CLIENT_NAME in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("CLIENT_NAME not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("CLIENT_NAME between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("CLIENT_NAME not between", value1, value2, "clientName");
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

        public Criteria andReviewUserIsNull() {
            addCriterion("REVIEW_USER is null");
            return (Criteria) this;
        }

        public Criteria andReviewUserIsNotNull() {
            addCriterion("REVIEW_USER is not null");
            return (Criteria) this;
        }

        public Criteria andReviewUserEqualTo(String value) {
            addCriterion("REVIEW_USER =", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserNotEqualTo(String value) {
            addCriterion("REVIEW_USER <>", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserGreaterThan(String value) {
            addCriterion("REVIEW_USER >", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_USER >=", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserLessThan(String value) {
            addCriterion("REVIEW_USER <", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_USER <=", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserLike(String value) {
            addCriterion("REVIEW_USER like", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserNotLike(String value) {
            addCriterion("REVIEW_USER not like", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserIn(List<String> values) {
            addCriterion("REVIEW_USER in", values, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserNotIn(List<String> values) {
            addCriterion("REVIEW_USER not in", values, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserBetween(String value1, String value2) {
            addCriterion("REVIEW_USER between", value1, value2, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserNotBetween(String value1, String value2) {
            addCriterion("REVIEW_USER not between", value1, value2, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewNameIsNull() {
            addCriterion("REVIEW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReviewNameIsNotNull() {
            addCriterion("REVIEW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReviewNameEqualTo(String value) {
            addCriterion("REVIEW_NAME =", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameNotEqualTo(String value) {
            addCriterion("REVIEW_NAME <>", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameGreaterThan(String value) {
            addCriterion("REVIEW_NAME >", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_NAME >=", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameLessThan(String value) {
            addCriterion("REVIEW_NAME <", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_NAME <=", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameLike(String value) {
            addCriterion("REVIEW_NAME like", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameNotLike(String value) {
            addCriterion("REVIEW_NAME not like", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameIn(List<String> values) {
            addCriterion("REVIEW_NAME in", values, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameNotIn(List<String> values) {
            addCriterion("REVIEW_NAME not in", values, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameBetween(String value1, String value2) {
            addCriterion("REVIEW_NAME between", value1, value2, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameNotBetween(String value1, String value2) {
            addCriterion("REVIEW_NAME not between", value1, value2, "reviewName");
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

        public Criteria andRecordIdIsNull() {
            addCriterion("RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("RECORD_ID =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("RECORD_ID <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("RECORD_ID >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_ID >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("RECORD_ID <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("RECORD_ID <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("RECORD_ID like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("RECORD_ID not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("RECORD_ID in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("RECORD_ID not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("RECORD_ID between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("RECORD_ID not between", value1, value2, "recordId");
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

        public Criteria andSalePersonIsNull() {
            addCriterion("SALE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andSalePersonIsNotNull() {
            addCriterion("SALE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andSalePersonEqualTo(String value) {
            addCriterion("SALE_PERSON =", value, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonNotEqualTo(String value) {
            addCriterion("SALE_PERSON <>", value, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonGreaterThan(String value) {
            addCriterion("SALE_PERSON >", value, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_PERSON >=", value, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonLessThan(String value) {
            addCriterion("SALE_PERSON <", value, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonLessThanOrEqualTo(String value) {
            addCriterion("SALE_PERSON <=", value, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonLike(String value) {
            addCriterion("SALE_PERSON like", value, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonNotLike(String value) {
            addCriterion("SALE_PERSON not like", value, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonIn(List<String> values) {
            addCriterion("SALE_PERSON in", values, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonNotIn(List<String> values) {
            addCriterion("SALE_PERSON not in", values, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonBetween(String value1, String value2) {
            addCriterion("SALE_PERSON between", value1, value2, "salePerson");
            return (Criteria) this;
        }

        public Criteria andSalePersonNotBetween(String value1, String value2) {
            addCriterion("SALE_PERSON not between", value1, value2, "salePerson");
            return (Criteria) this;
        }

        public Criteria andReviewTermIsNull() {
            addCriterion("REVIEW_TERM is null");
            return (Criteria) this;
        }

        public Criteria andReviewTermIsNotNull() {
            addCriterion("REVIEW_TERM is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTermEqualTo(Date value) {
            addCriterion("REVIEW_TERM =", value, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewTermNotEqualTo(Date value) {
            addCriterion("REVIEW_TERM <>", value, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewTermGreaterThan(Date value) {
            addCriterion("REVIEW_TERM >", value, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewTermGreaterThanOrEqualTo(Date value) {
            addCriterion("REVIEW_TERM >=", value, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewTermLessThan(Date value) {
            addCriterion("REVIEW_TERM <", value, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewTermLessThanOrEqualTo(Date value) {
            addCriterion("REVIEW_TERM <=", value, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewTermIn(List<Date> values) {
            addCriterion("REVIEW_TERM in", values, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewTermNotIn(List<Date> values) {
            addCriterion("REVIEW_TERM not in", values, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewTermBetween(Date value1, Date value2) {
            addCriterion("REVIEW_TERM between", value1, value2, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewTermNotBetween(Date value1, Date value2) {
            addCriterion("REVIEW_TERM not between", value1, value2, "reviewTerm");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeIsNull() {
            addCriterion("REVIEW_PROCESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeIsNotNull() {
            addCriterion("REVIEW_PROCESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeEqualTo(String value) {
            addCriterion("REVIEW_PROCESS_TYPE =", value, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeNotEqualTo(String value) {
            addCriterion("REVIEW_PROCESS_TYPE <>", value, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeGreaterThan(String value) {
            addCriterion("REVIEW_PROCESS_TYPE >", value, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_PROCESS_TYPE >=", value, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeLessThan(String value) {
            addCriterion("REVIEW_PROCESS_TYPE <", value, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_PROCESS_TYPE <=", value, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeLike(String value) {
            addCriterion("REVIEW_PROCESS_TYPE like", value, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeNotLike(String value) {
            addCriterion("REVIEW_PROCESS_TYPE not like", value, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeIn(List<String> values) {
            addCriterion("REVIEW_PROCESS_TYPE in", values, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeNotIn(List<String> values) {
            addCriterion("REVIEW_PROCESS_TYPE not in", values, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeBetween(String value1, String value2) {
            addCriterion("REVIEW_PROCESS_TYPE between", value1, value2, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andReviewProcessTypeNotBetween(String value1, String value2) {
            addCriterion("REVIEW_PROCESS_TYPE not between", value1, value2, "reviewProcessType");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerIsNull() {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerIsNotNull() {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerEqualTo(String value) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER =", value, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerNotEqualTo(String value) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER <>", value, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerGreaterThan(String value) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER >", value, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER >=", value, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerLessThan(String value) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER <", value, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerLessThanOrEqualTo(String value) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER <=", value, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerLike(String value) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER like", value, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerNotLike(String value) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER not like", value, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerIn(List<String> values) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER in", values, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerNotIn(List<String> values) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER not in", values, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerBetween(String value1, String value2) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER between", value1, value2, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andSpecialMentionedCustomerNotBetween(String value1, String value2) {
            addCriterion("SPECIAL_MENTIONED_CUSTOMER not between", value1, value2, "specialMentionedCustomer");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewIsNull() {
            addCriterion("NO_MORE_REVIEW is null");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewIsNotNull() {
            addCriterion("NO_MORE_REVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewEqualTo(String value) {
            addCriterion("NO_MORE_REVIEW =", value, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewNotEqualTo(String value) {
            addCriterion("NO_MORE_REVIEW <>", value, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewGreaterThan(String value) {
            addCriterion("NO_MORE_REVIEW >", value, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewGreaterThanOrEqualTo(String value) {
            addCriterion("NO_MORE_REVIEW >=", value, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewLessThan(String value) {
            addCriterion("NO_MORE_REVIEW <", value, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewLessThanOrEqualTo(String value) {
            addCriterion("NO_MORE_REVIEW <=", value, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewLike(String value) {
            addCriterion("NO_MORE_REVIEW like", value, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewNotLike(String value) {
            addCriterion("NO_MORE_REVIEW not like", value, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewIn(List<String> values) {
            addCriterion("NO_MORE_REVIEW in", values, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewNotIn(List<String> values) {
            addCriterion("NO_MORE_REVIEW not in", values, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewBetween(String value1, String value2) {
            addCriterion("NO_MORE_REVIEW between", value1, value2, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andNoMoreReviewNotBetween(String value1, String value2) {
            addCriterion("NO_MORE_REVIEW not between", value1, value2, "noMoreReview");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameIsNull() {
            addCriterion("ACCOUNTING_FIRM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameIsNotNull() {
            addCriterion("ACCOUNTING_FIRM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameEqualTo(String value) {
            addCriterion("ACCOUNTING_FIRM_NAME =", value, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameNotEqualTo(String value) {
            addCriterion("ACCOUNTING_FIRM_NAME <>", value, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameGreaterThan(String value) {
            addCriterion("ACCOUNTING_FIRM_NAME >", value, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTING_FIRM_NAME >=", value, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameLessThan(String value) {
            addCriterion("ACCOUNTING_FIRM_NAME <", value, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTING_FIRM_NAME <=", value, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameLike(String value) {
            addCriterion("ACCOUNTING_FIRM_NAME like", value, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameNotLike(String value) {
            addCriterion("ACCOUNTING_FIRM_NAME not like", value, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameIn(List<String> values) {
            addCriterion("ACCOUNTING_FIRM_NAME in", values, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameNotIn(List<String> values) {
            addCriterion("ACCOUNTING_FIRM_NAME not in", values, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameBetween(String value1, String value2) {
            addCriterion("ACCOUNTING_FIRM_NAME between", value1, value2, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andAccountingFirmNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTING_FIRM_NAME not between", value1, value2, "accountingFirmName");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeIsNull() {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeIsNotNull() {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeEqualTo(Date value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME =", value, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeNotEqualTo(Date value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME <>", value, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeGreaterThan(Date value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME >", value, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME >=", value, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeLessThan(Date value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME <", value, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeLessThanOrEqualTo(Date value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME <=", value, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeIn(List<Date> values) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME in", values, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeNotIn(List<Date> values) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME not in", values, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeBetween(Date value1, Date value2) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME between", value1, value2, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsTimeNotBetween(Date value1, Date value2) {
            addCriterion("SUPPLEMENTARY_MATERIALS_TIME not between", value1, value2, "supplementaryMaterialsTime");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsIsNull() {
            addCriterion("SUPPLEMENTARY_MATERIALS is null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsIsNotNull() {
            addCriterion("SUPPLEMENTARY_MATERIALS is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsEqualTo(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS =", value, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNotEqualTo(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS <>", value, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsGreaterThan(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS >", value, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS >=", value, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsLessThan(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS <", value, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsLessThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS <=", value, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsLike(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS like", value, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNotLike(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS not like", value, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsIn(List<String> values) {
            addCriterion("SUPPLEMENTARY_MATERIALS in", values, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNotIn(List<String> values) {
            addCriterion("SUPPLEMENTARY_MATERIALS not in", values, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsBetween(String value1, String value2) {
            addCriterion("SUPPLEMENTARY_MATERIALS between", value1, value2, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNotBetween(String value1, String value2) {
            addCriterion("SUPPLEMENTARY_MATERIALS not between", value1, value2, "supplementaryMaterials");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeIsNull() {
            addCriterion("REACH_TO_03_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeIsNotNull() {
            addCriterion("REACH_TO_03_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeEqualTo(Date value) {
            addCriterion("REACH_TO_03_DATETIME =", value, "reachTo03Datetime");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeNotEqualTo(Date value) {
            addCriterion("REACH_TO_03_DATETIME <>", value, "reachTo03Datetime");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeGreaterThan(Date value) {
            addCriterion("REACH_TO_03_DATETIME >", value, "reachTo03Datetime");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REACH_TO_03_DATETIME >=", value, "reachTo03Datetime");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeLessThan(Date value) {
            addCriterion("REACH_TO_03_DATETIME <", value, "reachTo03Datetime");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeLessThanOrEqualTo(Date value) {
            addCriterion("REACH_TO_03_DATETIME <=", value, "reachTo03Datetime");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeIn(List<Date> values) {
            addCriterion("REACH_TO_03_DATETIME in", values, "reachTo03Datetime");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeNotIn(List<Date> values) {
            addCriterion("REACH_TO_03_DATETIME not in", values, "reachTo03Datetime");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeBetween(Date value1, Date value2) {
            addCriterion("REACH_TO_03_DATETIME between", value1, value2, "reachTo03Datetime");
            return (Criteria) this;
        }

        public Criteria andReachTo03DatetimeNotBetween(Date value1, Date value2) {
            addCriterion("REACH_TO_03_DATETIME not between", value1, value2, "reachTo03Datetime");
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

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("SERIAL_NUMBER =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("SERIAL_NUMBER <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("SERIAL_NUMBER >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_NUMBER >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("SERIAL_NUMBER <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_NUMBER <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("SERIAL_NUMBER like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("SERIAL_NUMBER not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("SERIAL_NUMBER in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("SERIAL_NUMBER not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("SERIAL_NUMBER between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("SERIAL_NUMBER not between", value1, value2, "serialNumber");
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