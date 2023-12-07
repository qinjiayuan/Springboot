package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientReviewBufferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientReviewBufferExample() {
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

        public Criteria andReviewStartDateIsNull() {
            addCriterion("REVIEW_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateIsNotNull() {
            addCriterion("REVIEW_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateEqualTo(Date value) {
            addCriterion("REVIEW_START_DATE =", value, "reviewStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateNotEqualTo(Date value) {
            addCriterion("REVIEW_START_DATE <>", value, "reviewStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateGreaterThan(Date value) {
            addCriterion("REVIEW_START_DATE >", value, "reviewStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REVIEW_START_DATE >=", value, "reviewStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateLessThan(Date value) {
            addCriterion("REVIEW_START_DATE <", value, "reviewStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateLessThanOrEqualTo(Date value) {
            addCriterion("REVIEW_START_DATE <=", value, "reviewStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateIn(List<Date> values) {
            addCriterion("REVIEW_START_DATE in", values, "reviewStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateNotIn(List<Date> values) {
            addCriterion("REVIEW_START_DATE not in", values, "reviewStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateBetween(Date value1, Date value2) {
            addCriterion("REVIEW_START_DATE between", value1, value2, "reviewStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewStartDateNotBetween(Date value1, Date value2) {
            addCriterion("REVIEW_START_DATE not between", value1, value2, "reviewStartDate");
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

        public Criteria andReviewBufferEndIsNull() {
            addCriterion("REVIEW_BUFFER_END is null");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndIsNotNull() {
            addCriterion("REVIEW_BUFFER_END is not null");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndEqualTo(Date value) {
            addCriterion("REVIEW_BUFFER_END =", value, "reviewBufferEnd");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndNotEqualTo(Date value) {
            addCriterion("REVIEW_BUFFER_END <>", value, "reviewBufferEnd");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndGreaterThan(Date value) {
            addCriterion("REVIEW_BUFFER_END >", value, "reviewBufferEnd");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndGreaterThanOrEqualTo(Date value) {
            addCriterion("REVIEW_BUFFER_END >=", value, "reviewBufferEnd");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndLessThan(Date value) {
            addCriterion("REVIEW_BUFFER_END <", value, "reviewBufferEnd");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndLessThanOrEqualTo(Date value) {
            addCriterion("REVIEW_BUFFER_END <=", value, "reviewBufferEnd");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndIn(List<Date> values) {
            addCriterion("REVIEW_BUFFER_END in", values, "reviewBufferEnd");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndNotIn(List<Date> values) {
            addCriterion("REVIEW_BUFFER_END not in", values, "reviewBufferEnd");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndBetween(Date value1, Date value2) {
            addCriterion("REVIEW_BUFFER_END between", value1, value2, "reviewBufferEnd");
            return (Criteria) this;
        }

        public Criteria andReviewBufferEndNotBetween(Date value1, Date value2) {
            addCriterion("REVIEW_BUFFER_END not between", value1, value2, "reviewBufferEnd");
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