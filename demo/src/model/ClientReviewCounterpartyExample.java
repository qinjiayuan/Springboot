package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientReviewCounterpartyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientReviewCounterpartyExample() {
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

        public Criteria andIgnoreIsNull() {
            addCriterion("IGNORE is null");
            return (Criteria) this;
        }

        public Criteria andIgnoreIsNotNull() {
            addCriterion("IGNORE is not null");
            return (Criteria) this;
        }

        public Criteria andIgnoreEqualTo(String value) {
            addCriterion("IGNORE =", value, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreNotEqualTo(String value) {
            addCriterion("IGNORE <>", value, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreGreaterThan(String value) {
            addCriterion("IGNORE >", value, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreGreaterThanOrEqualTo(String value) {
            addCriterion("IGNORE >=", value, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreLessThan(String value) {
            addCriterion("IGNORE <", value, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreLessThanOrEqualTo(String value) {
            addCriterion("IGNORE <=", value, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreLike(String value) {
            addCriterion("IGNORE like", value, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreNotLike(String value) {
            addCriterion("IGNORE not like", value, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreIn(List<String> values) {
            addCriterion("IGNORE in", values, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreNotIn(List<String> values) {
            addCriterion("IGNORE not in", values, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreBetween(String value1, String value2) {
            addCriterion("IGNORE between", value1, value2, "ignore");
            return (Criteria) this;
        }

        public Criteria andIgnoreNotBetween(String value1, String value2) {
            addCriterion("IGNORE not between", value1, value2, "ignore");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagIsNull() {
            addCriterion("BENEFIT_OVER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagIsNotNull() {
            addCriterion("BENEFIT_OVER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagEqualTo(String value) {
            addCriterion("BENEFIT_OVER_FLAG =", value, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagNotEqualTo(String value) {
            addCriterion("BENEFIT_OVER_FLAG <>", value, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagGreaterThan(String value) {
            addCriterion("BENEFIT_OVER_FLAG >", value, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagGreaterThanOrEqualTo(String value) {
            addCriterion("BENEFIT_OVER_FLAG >=", value, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagLessThan(String value) {
            addCriterion("BENEFIT_OVER_FLAG <", value, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagLessThanOrEqualTo(String value) {
            addCriterion("BENEFIT_OVER_FLAG <=", value, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagLike(String value) {
            addCriterion("BENEFIT_OVER_FLAG like", value, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagNotLike(String value) {
            addCriterion("BENEFIT_OVER_FLAG not like", value, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagIn(List<String> values) {
            addCriterion("BENEFIT_OVER_FLAG in", values, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagNotIn(List<String> values) {
            addCriterion("BENEFIT_OVER_FLAG not in", values, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagBetween(String value1, String value2) {
            addCriterion("BENEFIT_OVER_FLAG between", value1, value2, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andBenefitOverFlagNotBetween(String value1, String value2) {
            addCriterion("BENEFIT_OVER_FLAG not between", value1, value2, "benefitOverFlag");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoIsNull() {
            addCriterion("AGREE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoIsNotNull() {
            addCriterion("AGREE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoEqualTo(String value) {
            addCriterion("AGREE_INFO =", value, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoNotEqualTo(String value) {
            addCriterion("AGREE_INFO <>", value, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoGreaterThan(String value) {
            addCriterion("AGREE_INFO >", value, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("AGREE_INFO >=", value, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoLessThan(String value) {
            addCriterion("AGREE_INFO <", value, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoLessThanOrEqualTo(String value) {
            addCriterion("AGREE_INFO <=", value, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoLike(String value) {
            addCriterion("AGREE_INFO like", value, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoNotLike(String value) {
            addCriterion("AGREE_INFO not like", value, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoIn(List<String> values) {
            addCriterion("AGREE_INFO in", values, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoNotIn(List<String> values) {
            addCriterion("AGREE_INFO not in", values, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoBetween(String value1, String value2) {
            addCriterion("AGREE_INFO between", value1, value2, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAgreeInfoNotBetween(String value1, String value2) {
            addCriterion("AGREE_INFO not between", value1, value2, "agreeInfo");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeIsNull() {
            addCriterion("ALLOW_BUSI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeIsNotNull() {
            addCriterion("ALLOW_BUSI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeEqualTo(String value) {
            addCriterion("ALLOW_BUSI_TYPE =", value, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeNotEqualTo(String value) {
            addCriterion("ALLOW_BUSI_TYPE <>", value, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeGreaterThan(String value) {
            addCriterion("ALLOW_BUSI_TYPE >", value, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_BUSI_TYPE >=", value, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeLessThan(String value) {
            addCriterion("ALLOW_BUSI_TYPE <", value, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_BUSI_TYPE <=", value, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeLike(String value) {
            addCriterion("ALLOW_BUSI_TYPE like", value, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeNotLike(String value) {
            addCriterion("ALLOW_BUSI_TYPE not like", value, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeIn(List<String> values) {
            addCriterion("ALLOW_BUSI_TYPE in", values, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeNotIn(List<String> values) {
            addCriterion("ALLOW_BUSI_TYPE not in", values, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeBetween(String value1, String value2) {
            addCriterion("ALLOW_BUSI_TYPE between", value1, value2, "allowBusiType");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeNotBetween(String value1, String value2) {
            addCriterion("ALLOW_BUSI_TYPE not between", value1, value2, "allowBusiType");
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

        public Criteria andSeqIsNull() {
            addCriterion("SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Short value) {
            addCriterion("SEQ =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Short value) {
            addCriterion("SEQ <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Short value) {
            addCriterion("SEQ >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Short value) {
            addCriterion("SEQ >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Short value) {
            addCriterion("SEQ <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Short value) {
            addCriterion("SEQ <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Short> values) {
            addCriterion("SEQ in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Short> values) {
            addCriterion("SEQ not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Short value1, Short value2) {
            addCriterion("SEQ between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Short value1, Short value2) {
            addCriterion("SEQ not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartIsNull() {
            addCriterion("REVIEW_BUFFER_START is null");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartIsNotNull() {
            addCriterion("REVIEW_BUFFER_START is not null");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartEqualTo(Date value) {
            addCriterion("REVIEW_BUFFER_START =", value, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartNotEqualTo(Date value) {
            addCriterion("REVIEW_BUFFER_START <>", value, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartGreaterThan(Date value) {
            addCriterion("REVIEW_BUFFER_START >", value, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartGreaterThanOrEqualTo(Date value) {
            addCriterion("REVIEW_BUFFER_START >=", value, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartLessThan(Date value) {
            addCriterion("REVIEW_BUFFER_START <", value, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartLessThanOrEqualTo(Date value) {
            addCriterion("REVIEW_BUFFER_START <=", value, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartIn(List<Date> values) {
            addCriterion("REVIEW_BUFFER_START in", values, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartNotIn(List<Date> values) {
            addCriterion("REVIEW_BUFFER_START not in", values, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartBetween(Date value1, Date value2) {
            addCriterion("REVIEW_BUFFER_START between", value1, value2, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andReviewBufferStartNotBetween(Date value1, Date value2) {
            addCriterion("REVIEW_BUFFER_START not between", value1, value2, "reviewBufferStart");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteIsNull() {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteIsNotNull() {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteEqualTo(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE =", value, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteNotEqualTo(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE <>", value, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteGreaterThan(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE >", value, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE >=", value, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteLessThan(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE <", value, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteLessThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE <=", value, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteLike(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE like", value, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteNotLike(String value) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE not like", value, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteIn(List<String> values) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE in", values, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteNotIn(List<String> values) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE not in", values, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteBetween(String value1, String value2) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE between", value1, value2, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andSupplementaryMaterialsNoteNotBetween(String value1, String value2) {
            addCriterion("SUPPLEMENTARY_MATERIALS_NOTE not between", value1, value2, "supplementaryMaterialsNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteIsNull() {
            addCriterion("SHOW_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andShowNoteIsNotNull() {
            addCriterion("SHOW_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andShowNoteEqualTo(String value) {
            addCriterion("SHOW_NOTE =", value, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteNotEqualTo(String value) {
            addCriterion("SHOW_NOTE <>", value, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteGreaterThan(String value) {
            addCriterion("SHOW_NOTE >", value, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_NOTE >=", value, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteLessThan(String value) {
            addCriterion("SHOW_NOTE <", value, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteLessThanOrEqualTo(String value) {
            addCriterion("SHOW_NOTE <=", value, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteLike(String value) {
            addCriterion("SHOW_NOTE like", value, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteNotLike(String value) {
            addCriterion("SHOW_NOTE not like", value, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteIn(List<String> values) {
            addCriterion("SHOW_NOTE in", values, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteNotIn(List<String> values) {
            addCriterion("SHOW_NOTE not in", values, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteBetween(String value1, String value2) {
            addCriterion("SHOW_NOTE between", value1, value2, "showNote");
            return (Criteria) this;
        }

        public Criteria andShowNoteNotBetween(String value1, String value2) {
            addCriterion("SHOW_NOTE not between", value1, value2, "showNote");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisIsNull() {
            addCriterion("ALLOW_BUSI_TYPE_HIS is null");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisIsNotNull() {
            addCriterion("ALLOW_BUSI_TYPE_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisEqualTo(String value) {
            addCriterion("ALLOW_BUSI_TYPE_HIS =", value, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisNotEqualTo(String value) {
            addCriterion("ALLOW_BUSI_TYPE_HIS <>", value, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisGreaterThan(String value) {
            addCriterion("ALLOW_BUSI_TYPE_HIS >", value, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_BUSI_TYPE_HIS >=", value, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisLessThan(String value) {
            addCriterion("ALLOW_BUSI_TYPE_HIS <", value, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_BUSI_TYPE_HIS <=", value, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisLike(String value) {
            addCriterion("ALLOW_BUSI_TYPE_HIS like", value, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisNotLike(String value) {
            addCriterion("ALLOW_BUSI_TYPE_HIS not like", value, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisIn(List<String> values) {
            addCriterion("ALLOW_BUSI_TYPE_HIS in", values, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisNotIn(List<String> values) {
            addCriterion("ALLOW_BUSI_TYPE_HIS not in", values, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisBetween(String value1, String value2) {
            addCriterion("ALLOW_BUSI_TYPE_HIS between", value1, value2, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andAllowBusiTypeHisNotBetween(String value1, String value2) {
            addCriterion("ALLOW_BUSI_TYPE_HIS not between", value1, value2, "allowBusiTypeHis");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeIsNull() {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeIsNotNull() {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeEqualTo(String value) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE =", value, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeNotEqualTo(String value) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE <>", value, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeGreaterThan(String value) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE >", value, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE >=", value, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeLessThan(String value) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE <", value, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE <=", value, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeLike(String value) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE like", value, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeNotLike(String value) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE not like", value, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeIn(List<String> values) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE in", values, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeNotIn(List<String> values) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE not in", values, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeBetween(String value1, String value2) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE between", value1, value2, "manualDelAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andManualDelAllowBusiTypeNotBetween(String value1, String value2) {
            addCriterion("MANUAL_DEL_ALLOW_BUSI_TYPE not between", value1, value2, "manualDelAllowBusiType");
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