package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientReviewFileRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientReviewFileRecordExample() {
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

        public Criteria andS3FileIdIsNull() {
            addCriterion("S3_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andS3FileIdIsNotNull() {
            addCriterion("S3_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andS3FileIdEqualTo(String value) {
            addCriterion("S3_FILE_ID =", value, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdNotEqualTo(String value) {
            addCriterion("S3_FILE_ID <>", value, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdGreaterThan(String value) {
            addCriterion("S3_FILE_ID >", value, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdGreaterThanOrEqualTo(String value) {
            addCriterion("S3_FILE_ID >=", value, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdLessThan(String value) {
            addCriterion("S3_FILE_ID <", value, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdLessThanOrEqualTo(String value) {
            addCriterion("S3_FILE_ID <=", value, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdLike(String value) {
            addCriterion("S3_FILE_ID like", value, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdNotLike(String value) {
            addCriterion("S3_FILE_ID not like", value, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdIn(List<String> values) {
            addCriterion("S3_FILE_ID in", values, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdNotIn(List<String> values) {
            addCriterion("S3_FILE_ID not in", values, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdBetween(String value1, String value2) {
            addCriterion("S3_FILE_ID between", value1, value2, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andS3FileIdNotBetween(String value1, String value2) {
            addCriterion("S3_FILE_ID not between", value1, value2, "s3FileId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdIsNull() {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdIsNotNull() {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdEqualTo(String value) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID =", value, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdNotEqualTo(String value) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID <>", value, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdGreaterThan(String value) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID >", value, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID >=", value, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdLessThan(String value) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID <", value, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdLessThanOrEqualTo(String value) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID <=", value, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdLike(String value) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID like", value, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdNotLike(String value) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID not like", value, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdIn(List<String> values) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID in", values, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdNotIn(List<String> values) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID not in", values, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdBetween(String value1, String value2) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID between", value1, value2, "otcDerivativeCounterpartyId");
            return (Criteria) this;
        }

        public Criteria andOtcDerivativeCounterpartyIdNotBetween(String value1, String value2) {
            addCriterion("OTC_DERIVATIVE_COUNTERPARTY_ID not between", value1, value2, "otcDerivativeCounterpartyId");
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

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("FILE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("FILE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Short value) {
            addCriterion("FILE_SIZE =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Short value) {
            addCriterion("FILE_SIZE <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Short value) {
            addCriterion("FILE_SIZE >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Short value) {
            addCriterion("FILE_SIZE >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Short value) {
            addCriterion("FILE_SIZE <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Short value) {
            addCriterion("FILE_SIZE <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Short> values) {
            addCriterion("FILE_SIZE in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Short> values) {
            addCriterion("FILE_SIZE not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Short value1, Short value2) {
            addCriterion("FILE_SIZE between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Short value1, Short value2) {
            addCriterion("FILE_SIZE not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileBelongIsNull() {
            addCriterion("FILE_BELONG is null");
            return (Criteria) this;
        }

        public Criteria andFileBelongIsNotNull() {
            addCriterion("FILE_BELONG is not null");
            return (Criteria) this;
        }

        public Criteria andFileBelongEqualTo(String value) {
            addCriterion("FILE_BELONG =", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongNotEqualTo(String value) {
            addCriterion("FILE_BELONG <>", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongGreaterThan(String value) {
            addCriterion("FILE_BELONG >", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_BELONG >=", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongLessThan(String value) {
            addCriterion("FILE_BELONG <", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongLessThanOrEqualTo(String value) {
            addCriterion("FILE_BELONG <=", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongLike(String value) {
            addCriterion("FILE_BELONG like", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongNotLike(String value) {
            addCriterion("FILE_BELONG not like", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongIn(List<String> values) {
            addCriterion("FILE_BELONG in", values, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongNotIn(List<String> values) {
            addCriterion("FILE_BELONG not in", values, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongBetween(String value1, String value2) {
            addCriterion("FILE_BELONG between", value1, value2, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongNotBetween(String value1, String value2) {
            addCriterion("FILE_BELONG not between", value1, value2, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andUploadActivityIsNull() {
            addCriterion("UPLOAD_ACTIVITY is null");
            return (Criteria) this;
        }

        public Criteria andUploadActivityIsNotNull() {
            addCriterion("UPLOAD_ACTIVITY is not null");
            return (Criteria) this;
        }

        public Criteria andUploadActivityEqualTo(String value) {
            addCriterion("UPLOAD_ACTIVITY =", value, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityNotEqualTo(String value) {
            addCriterion("UPLOAD_ACTIVITY <>", value, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityGreaterThan(String value) {
            addCriterion("UPLOAD_ACTIVITY >", value, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_ACTIVITY >=", value, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityLessThan(String value) {
            addCriterion("UPLOAD_ACTIVITY <", value, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_ACTIVITY <=", value, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityLike(String value) {
            addCriterion("UPLOAD_ACTIVITY like", value, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityNotLike(String value) {
            addCriterion("UPLOAD_ACTIVITY not like", value, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityIn(List<String> values) {
            addCriterion("UPLOAD_ACTIVITY in", values, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityNotIn(List<String> values) {
            addCriterion("UPLOAD_ACTIVITY not in", values, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityBetween(String value1, String value2) {
            addCriterion("UPLOAD_ACTIVITY between", value1, value2, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andUploadActivityNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_ACTIVITY not between", value1, value2, "uploadActivity");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(String value) {
            addCriterion("CREATED_USER =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(String value) {
            addCriterion("CREATED_USER <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(String value) {
            addCriterion("CREATED_USER >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(String value) {
            addCriterion("CREATED_USER <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLike(String value) {
            addCriterion("CREATED_USER like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotLike(String value) {
            addCriterion("CREATED_USER not like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<String> values) {
            addCriterion("CREATED_USER in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<String> values) {
            addCriterion("CREATED_USER not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(String value1, String value2) {
            addCriterion("CREATED_USER between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER not between", value1, value2, "createdUser");
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