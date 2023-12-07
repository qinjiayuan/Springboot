package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcessExpiredRemindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessExpiredRemindExample() {
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

        public Criteria andProcessNameIsNull() {
            addCriterion("PROCESS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNotNull() {
            addCriterion("PROCESS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("PROCESS_NAME =", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("PROCESS_NAME <>", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("PROCESS_NAME >", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_NAME >=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThan(String value) {
            addCriterion("PROCESS_NAME <", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_NAME <=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLike(String value) {
            addCriterion("PROCESS_NAME like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotLike(String value) {
            addCriterion("PROCESS_NAME not like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameIn(List<String> values) {
            addCriterion("PROCESS_NAME in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotIn(List<String> values) {
            addCriterion("PROCESS_NAME not in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("PROCESS_NAME between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("PROCESS_NAME not between", value1, value2, "processName");
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

        public Criteria andSignedProductNameIsNull() {
            addCriterion("SIGNED_PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameIsNotNull() {
            addCriterion("SIGNED_PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameEqualTo(String value) {
            addCriterion("SIGNED_PRODUCT_NAME =", value, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameNotEqualTo(String value) {
            addCriterion("SIGNED_PRODUCT_NAME <>", value, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameGreaterThan(String value) {
            addCriterion("SIGNED_PRODUCT_NAME >", value, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNED_PRODUCT_NAME >=", value, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameLessThan(String value) {
            addCriterion("SIGNED_PRODUCT_NAME <", value, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameLessThanOrEqualTo(String value) {
            addCriterion("SIGNED_PRODUCT_NAME <=", value, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameLike(String value) {
            addCriterion("SIGNED_PRODUCT_NAME like", value, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameNotLike(String value) {
            addCriterion("SIGNED_PRODUCT_NAME not like", value, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameIn(List<String> values) {
            addCriterion("SIGNED_PRODUCT_NAME in", values, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameNotIn(List<String> values) {
            addCriterion("SIGNED_PRODUCT_NAME not in", values, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameBetween(String value1, String value2) {
            addCriterion("SIGNED_PRODUCT_NAME between", value1, value2, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andSignedProductNameNotBetween(String value1, String value2) {
            addCriterion("SIGNED_PRODUCT_NAME not between", value1, value2, "signedProductName");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewIsNull() {
            addCriterion("CLIENT_QUALIFY_REVIEW is null");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewIsNotNull() {
            addCriterion("CLIENT_QUALIFY_REVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW =", value, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewNotEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW <>", value, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewGreaterThan(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW >", value, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW >=", value, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewLessThan(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW <", value, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW <=", value, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewLike(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW like", value, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewNotLike(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW not like", value, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewIn(List<String> values) {
            addCriterion("CLIENT_QUALIFY_REVIEW in", values, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewNotIn(List<String> values) {
            addCriterion("CLIENT_QUALIFY_REVIEW not in", values, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewBetween(String value1, String value2) {
            addCriterion("CLIENT_QUALIFY_REVIEW between", value1, value2, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewNotBetween(String value1, String value2) {
            addCriterion("CLIENT_QUALIFY_REVIEW not between", value1, value2, "clientQualifyReview");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateIsNull() {
            addCriterion("PROCESS_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateIsNotNull() {
            addCriterion("PROCESS_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateEqualTo(Date value) {
            addCriterion("PROCESS_CREATE_DATE =", value, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateNotEqualTo(Date value) {
            addCriterion("PROCESS_CREATE_DATE <>", value, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateGreaterThan(Date value) {
            addCriterion("PROCESS_CREATE_DATE >", value, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PROCESS_CREATE_DATE >=", value, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateLessThan(Date value) {
            addCriterion("PROCESS_CREATE_DATE <", value, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("PROCESS_CREATE_DATE <=", value, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateIn(List<Date> values) {
            addCriterion("PROCESS_CREATE_DATE in", values, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateNotIn(List<Date> values) {
            addCriterion("PROCESS_CREATE_DATE not in", values, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateBetween(Date value1, Date value2) {
            addCriterion("PROCESS_CREATE_DATE between", value1, value2, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("PROCESS_CREATE_DATE not between", value1, value2, "processCreateDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateIsNull() {
            addCriterion("PROCESS_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateIsNotNull() {
            addCriterion("PROCESS_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateEqualTo(Date value) {
            addCriterion("PROCESS_END_DATE =", value, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateNotEqualTo(Date value) {
            addCriterion("PROCESS_END_DATE <>", value, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateGreaterThan(Date value) {
            addCriterion("PROCESS_END_DATE >", value, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PROCESS_END_DATE >=", value, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateLessThan(Date value) {
            addCriterion("PROCESS_END_DATE <", value, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateLessThanOrEqualTo(Date value) {
            addCriterion("PROCESS_END_DATE <=", value, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateIn(List<Date> values) {
            addCriterion("PROCESS_END_DATE in", values, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateNotIn(List<Date> values) {
            addCriterion("PROCESS_END_DATE not in", values, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateBetween(Date value1, Date value2) {
            addCriterion("PROCESS_END_DATE between", value1, value2, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessEndDateNotBetween(Date value1, Date value2) {
            addCriterion("PROCESS_END_DATE not between", value1, value2, "processEndDate");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNull() {
            addCriterion("PROCESS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNotNull() {
            addCriterion("PROCESS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusEqualTo(String value) {
            addCriterion("PROCESS_STATUS =", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotEqualTo(String value) {
            addCriterion("PROCESS_STATUS <>", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThan(String value) {
            addCriterion("PROCESS_STATUS >", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_STATUS >=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThan(String value) {
            addCriterion("PROCESS_STATUS <", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_STATUS <=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLike(String value) {
            addCriterion("PROCESS_STATUS like", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotLike(String value) {
            addCriterion("PROCESS_STATUS not like", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIn(List<String> values) {
            addCriterion("PROCESS_STATUS in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotIn(List<String> values) {
            addCriterion("PROCESS_STATUS not in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusBetween(String value1, String value2) {
            addCriterion("PROCESS_STATUS between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotBetween(String value1, String value2) {
            addCriterion("PROCESS_STATUS not between", value1, value2, "processStatus");
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

        public Criteria andMasterAgreementDateIsNull() {
            addCriterion("MASTER_AGREEMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateIsNotNull() {
            addCriterion("MASTER_AGREEMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateEqualTo(Date value) {
            addCriterion("MASTER_AGREEMENT_DATE =", value, "masterAgreementDate");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateNotEqualTo(Date value) {
            addCriterion("MASTER_AGREEMENT_DATE <>", value, "masterAgreementDate");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateGreaterThan(Date value) {
            addCriterion("MASTER_AGREEMENT_DATE >", value, "masterAgreementDate");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MASTER_AGREEMENT_DATE >=", value, "masterAgreementDate");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateLessThan(Date value) {
            addCriterion("MASTER_AGREEMENT_DATE <", value, "masterAgreementDate");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateLessThanOrEqualTo(Date value) {
            addCriterion("MASTER_AGREEMENT_DATE <=", value, "masterAgreementDate");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateIn(List<Date> values) {
            addCriterion("MASTER_AGREEMENT_DATE in", values, "masterAgreementDate");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateNotIn(List<Date> values) {
            addCriterion("MASTER_AGREEMENT_DATE not in", values, "masterAgreementDate");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateBetween(Date value1, Date value2) {
            addCriterion("MASTER_AGREEMENT_DATE between", value1, value2, "masterAgreementDate");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementDateNotBetween(Date value1, Date value2) {
            addCriterion("MASTER_AGREEMENT_DATE not between", value1, value2, "masterAgreementDate");
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

        public Criteria andReviewDateEqualTo(String value) {
            addCriterion("REVIEW_DATE =", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotEqualTo(String value) {
            addCriterion("REVIEW_DATE <>", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThan(String value) {
            addCriterion("REVIEW_DATE >", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_DATE >=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThan(String value) {
            addCriterion("REVIEW_DATE <", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_DATE <=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLike(String value) {
            addCriterion("REVIEW_DATE like", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotLike(String value) {
            addCriterion("REVIEW_DATE not like", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateIn(List<String> values) {
            addCriterion("REVIEW_DATE in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotIn(List<String> values) {
            addCriterion("REVIEW_DATE not in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateBetween(String value1, String value2) {
            addCriterion("REVIEW_DATE between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotBetween(String value1, String value2) {
            addCriterion("REVIEW_DATE not between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andProcessLinkIsNull() {
            addCriterion("PROCESS_LINK is null");
            return (Criteria) this;
        }

        public Criteria andProcessLinkIsNotNull() {
            addCriterion("PROCESS_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andProcessLinkEqualTo(String value) {
            addCriterion("PROCESS_LINK =", value, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkNotEqualTo(String value) {
            addCriterion("PROCESS_LINK <>", value, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkGreaterThan(String value) {
            addCriterion("PROCESS_LINK >", value, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_LINK >=", value, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkLessThan(String value) {
            addCriterion("PROCESS_LINK <", value, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_LINK <=", value, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkLike(String value) {
            addCriterion("PROCESS_LINK like", value, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkNotLike(String value) {
            addCriterion("PROCESS_LINK not like", value, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkIn(List<String> values) {
            addCriterion("PROCESS_LINK in", values, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkNotIn(List<String> values) {
            addCriterion("PROCESS_LINK not in", values, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkBetween(String value1, String value2) {
            addCriterion("PROCESS_LINK between", value1, value2, "processLink");
            return (Criteria) this;
        }

        public Criteria andProcessLinkNotBetween(String value1, String value2) {
            addCriterion("PROCESS_LINK not between", value1, value2, "processLink");
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

        public Criteria andUpdatedDatetimeIsNull() {
            addCriterion("UPDATED_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeIsNotNull() {
            addCriterion("UPDATED_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeEqualTo(Date value) {
            addCriterion("UPDATED_DATETIME =", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeNotEqualTo(Date value) {
            addCriterion("UPDATED_DATETIME <>", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeGreaterThan(Date value) {
            addCriterion("UPDATED_DATETIME >", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_DATETIME >=", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeLessThan(Date value) {
            addCriterion("UPDATED_DATETIME <", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_DATETIME <=", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeIn(List<Date> values) {
            addCriterion("UPDATED_DATETIME in", values, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeNotIn(List<Date> values) {
            addCriterion("UPDATED_DATETIME not in", values, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_DATETIME between", value1, value2, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_DATETIME not between", value1, value2, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeIsNull() {
            addCriterion("EXPIRED_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeIsNotNull() {
            addCriterion("EXPIRED_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeEqualTo(String value) {
            addCriterion("EXPIRED_TYPE =", value, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeNotEqualTo(String value) {
            addCriterion("EXPIRED_TYPE <>", value, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeGreaterThan(String value) {
            addCriterion("EXPIRED_TYPE >", value, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIRED_TYPE >=", value, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeLessThan(String value) {
            addCriterion("EXPIRED_TYPE <", value, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeLessThanOrEqualTo(String value) {
            addCriterion("EXPIRED_TYPE <=", value, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeLike(String value) {
            addCriterion("EXPIRED_TYPE like", value, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeNotLike(String value) {
            addCriterion("EXPIRED_TYPE not like", value, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeIn(List<String> values) {
            addCriterion("EXPIRED_TYPE in", values, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeNotIn(List<String> values) {
            addCriterion("EXPIRED_TYPE not in", values, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeBetween(String value1, String value2) {
            addCriterion("EXPIRED_TYPE between", value1, value2, "expiredType");
            return (Criteria) this;
        }

        public Criteria andExpiredTypeNotBetween(String value1, String value2) {
            addCriterion("EXPIRED_TYPE not between", value1, value2, "expiredType");
            return (Criteria) this;
        }

        public Criteria andActualOperatorIsNull() {
            addCriterion("ACTUAL_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andActualOperatorIsNotNull() {
            addCriterion("ACTUAL_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andActualOperatorEqualTo(String value) {
            addCriterion("ACTUAL_OPERATOR =", value, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorNotEqualTo(String value) {
            addCriterion("ACTUAL_OPERATOR <>", value, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorGreaterThan(String value) {
            addCriterion("ACTUAL_OPERATOR >", value, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUAL_OPERATOR >=", value, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorLessThan(String value) {
            addCriterion("ACTUAL_OPERATOR <", value, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorLessThanOrEqualTo(String value) {
            addCriterion("ACTUAL_OPERATOR <=", value, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorLike(String value) {
            addCriterion("ACTUAL_OPERATOR like", value, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorNotLike(String value) {
            addCriterion("ACTUAL_OPERATOR not like", value, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorIn(List<String> values) {
            addCriterion("ACTUAL_OPERATOR in", values, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorNotIn(List<String> values) {
            addCriterion("ACTUAL_OPERATOR not in", values, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorBetween(String value1, String value2) {
            addCriterion("ACTUAL_OPERATOR between", value1, value2, "actualOperator");
            return (Criteria) this;
        }

        public Criteria andActualOperatorNotBetween(String value1, String value2) {
            addCriterion("ACTUAL_OPERATOR not between", value1, value2, "actualOperator");
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

        public Criteria andAbbreviationIsNull() {
            addCriterion("ABBREVIATION is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("ABBREVIATION is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("ABBREVIATION =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("ABBREVIATION <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("ABBREVIATION >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("ABBREVIATION >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("ABBREVIATION <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("ABBREVIATION <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("ABBREVIATION like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("ABBREVIATION not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("ABBREVIATION in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("ABBREVIATION not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("ABBREVIATION between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("ABBREVIATION not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andBigClientIsNull() {
            addCriterion("BIG_CLIENT is null");
            return (Criteria) this;
        }

        public Criteria andBigClientIsNotNull() {
            addCriterion("BIG_CLIENT is not null");
            return (Criteria) this;
        }

        public Criteria andBigClientEqualTo(String value) {
            addCriterion("BIG_CLIENT =", value, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientNotEqualTo(String value) {
            addCriterion("BIG_CLIENT <>", value, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientGreaterThan(String value) {
            addCriterion("BIG_CLIENT >", value, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientGreaterThanOrEqualTo(String value) {
            addCriterion("BIG_CLIENT >=", value, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientLessThan(String value) {
            addCriterion("BIG_CLIENT <", value, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientLessThanOrEqualTo(String value) {
            addCriterion("BIG_CLIENT <=", value, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientLike(String value) {
            addCriterion("BIG_CLIENT like", value, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientNotLike(String value) {
            addCriterion("BIG_CLIENT not like", value, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientIn(List<String> values) {
            addCriterion("BIG_CLIENT in", values, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientNotIn(List<String> values) {
            addCriterion("BIG_CLIENT not in", values, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientBetween(String value1, String value2) {
            addCriterion("BIG_CLIENT between", value1, value2, "bigClient");
            return (Criteria) this;
        }

        public Criteria andBigClientNotBetween(String value1, String value2) {
            addCriterion("BIG_CLIENT not between", value1, value2, "bigClient");
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