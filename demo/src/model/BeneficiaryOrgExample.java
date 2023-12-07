package model;

import java.util.ArrayList;
import java.util.List;

public class BeneficiaryOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BeneficiaryOrgExample() {
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

        public Criteria andEntityTypeIsNull() {
            addCriterion("ENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("ENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(String value) {
            addCriterion("ENTITY_TYPE =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(String value) {
            addCriterion("ENTITY_TYPE <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(String value) {
            addCriterion("ENTITY_TYPE >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_TYPE >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(String value) {
            addCriterion("ENTITY_TYPE <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_TYPE <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLike(String value) {
            addCriterion("ENTITY_TYPE like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotLike(String value) {
            addCriterion("ENTITY_TYPE not like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<String> values) {
            addCriterion("ENTITY_TYPE in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<String> values) {
            addCriterion("ENTITY_TYPE not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(String value1, String value2) {
            addCriterion("ENTITY_TYPE between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(String value1, String value2) {
            addCriterion("ENTITY_TYPE not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("CATEGORY like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("CATEGORY not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdKindIsNull() {
            addCriterion("ID_KIND is null");
            return (Criteria) this;
        }

        public Criteria andIdKindIsNotNull() {
            addCriterion("ID_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andIdKindEqualTo(String value) {
            addCriterion("ID_KIND =", value, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindNotEqualTo(String value) {
            addCriterion("ID_KIND <>", value, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindGreaterThan(String value) {
            addCriterion("ID_KIND >", value, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindGreaterThanOrEqualTo(String value) {
            addCriterion("ID_KIND >=", value, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindLessThan(String value) {
            addCriterion("ID_KIND <", value, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindLessThanOrEqualTo(String value) {
            addCriterion("ID_KIND <=", value, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindLike(String value) {
            addCriterion("ID_KIND like", value, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindNotLike(String value) {
            addCriterion("ID_KIND not like", value, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindIn(List<String> values) {
            addCriterion("ID_KIND in", values, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindNotIn(List<String> values) {
            addCriterion("ID_KIND not in", values, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindBetween(String value1, String value2) {
            addCriterion("ID_KIND between", value1, value2, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdKindNotBetween(String value1, String value2) {
            addCriterion("ID_KIND not between", value1, value2, "idKind");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(String value) {
            addCriterion("BIRTH =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(String value) {
            addCriterion("BIRTH <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(String value) {
            addCriterion("BIRTH >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTH >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(String value) {
            addCriterion("BIRTH <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(String value) {
            addCriterion("BIRTH <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLike(String value) {
            addCriterion("BIRTH like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotLike(String value) {
            addCriterion("BIRTH not like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<String> values) {
            addCriterion("BIRTH in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<String> values) {
            addCriterion("BIRTH not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(String value1, String value2) {
            addCriterion("BIRTH between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(String value1, String value2) {
            addCriterion("BIRTH not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartIsNull() {
            addCriterion("ID_VALIDDATE_START is null");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartIsNotNull() {
            addCriterion("ID_VALIDDATE_START is not null");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartEqualTo(String value) {
            addCriterion("ID_VALIDDATE_START =", value, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartNotEqualTo(String value) {
            addCriterion("ID_VALIDDATE_START <>", value, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartGreaterThan(String value) {
            addCriterion("ID_VALIDDATE_START >", value, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartGreaterThanOrEqualTo(String value) {
            addCriterion("ID_VALIDDATE_START >=", value, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartLessThan(String value) {
            addCriterion("ID_VALIDDATE_START <", value, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartLessThanOrEqualTo(String value) {
            addCriterion("ID_VALIDDATE_START <=", value, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartLike(String value) {
            addCriterion("ID_VALIDDATE_START like", value, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartNotLike(String value) {
            addCriterion("ID_VALIDDATE_START not like", value, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartIn(List<String> values) {
            addCriterion("ID_VALIDDATE_START in", values, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartNotIn(List<String> values) {
            addCriterion("ID_VALIDDATE_START not in", values, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartBetween(String value1, String value2) {
            addCriterion("ID_VALIDDATE_START between", value1, value2, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateStartNotBetween(String value1, String value2) {
            addCriterion("ID_VALIDDATE_START not between", value1, value2, "idValiddateStart");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndIsNull() {
            addCriterion("ID_VALIDDATE_END is null");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndIsNotNull() {
            addCriterion("ID_VALIDDATE_END is not null");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndEqualTo(String value) {
            addCriterion("ID_VALIDDATE_END =", value, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndNotEqualTo(String value) {
            addCriterion("ID_VALIDDATE_END <>", value, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndGreaterThan(String value) {
            addCriterion("ID_VALIDDATE_END >", value, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndGreaterThanOrEqualTo(String value) {
            addCriterion("ID_VALIDDATE_END >=", value, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndLessThan(String value) {
            addCriterion("ID_VALIDDATE_END <", value, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndLessThanOrEqualTo(String value) {
            addCriterion("ID_VALIDDATE_END <=", value, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndLike(String value) {
            addCriterion("ID_VALIDDATE_END like", value, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndNotLike(String value) {
            addCriterion("ID_VALIDDATE_END not like", value, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndIn(List<String> values) {
            addCriterion("ID_VALIDDATE_END in", values, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndNotIn(List<String> values) {
            addCriterion("ID_VALIDDATE_END not in", values, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndBetween(String value1, String value2) {
            addCriterion("ID_VALIDDATE_END between", value1, value2, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andIdValiddateEndNotBetween(String value1, String value2) {
            addCriterion("ID_VALIDDATE_END not between", value1, value2, "idValiddateEnd");
            return (Criteria) this;
        }

        public Criteria andHoldRateIsNull() {
            addCriterion("HOLD_RATE is null");
            return (Criteria) this;
        }

        public Criteria andHoldRateIsNotNull() {
            addCriterion("HOLD_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andHoldRateEqualTo(String value) {
            addCriterion("HOLD_RATE =", value, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateNotEqualTo(String value) {
            addCriterion("HOLD_RATE <>", value, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateGreaterThan(String value) {
            addCriterion("HOLD_RATE >", value, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateGreaterThanOrEqualTo(String value) {
            addCriterion("HOLD_RATE >=", value, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateLessThan(String value) {
            addCriterion("HOLD_RATE <", value, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateLessThanOrEqualTo(String value) {
            addCriterion("HOLD_RATE <=", value, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateLike(String value) {
            addCriterion("HOLD_RATE like", value, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateNotLike(String value) {
            addCriterion("HOLD_RATE not like", value, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateIn(List<String> values) {
            addCriterion("HOLD_RATE in", values, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateNotIn(List<String> values) {
            addCriterion("HOLD_RATE not in", values, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateBetween(String value1, String value2) {
            addCriterion("HOLD_RATE between", value1, value2, "holdRate");
            return (Criteria) this;
        }

        public Criteria andHoldRateNotBetween(String value1, String value2) {
            addCriterion("HOLD_RATE not between", value1, value2, "holdRate");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andHoldTypeIsNull() {
            addCriterion("HOLD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHoldTypeIsNotNull() {
            addCriterion("HOLD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHoldTypeEqualTo(String value) {
            addCriterion("HOLD_TYPE =", value, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeNotEqualTo(String value) {
            addCriterion("HOLD_TYPE <>", value, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeGreaterThan(String value) {
            addCriterion("HOLD_TYPE >", value, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HOLD_TYPE >=", value, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeLessThan(String value) {
            addCriterion("HOLD_TYPE <", value, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeLessThanOrEqualTo(String value) {
            addCriterion("HOLD_TYPE <=", value, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeLike(String value) {
            addCriterion("HOLD_TYPE like", value, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeNotLike(String value) {
            addCriterion("HOLD_TYPE not like", value, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeIn(List<String> values) {
            addCriterion("HOLD_TYPE in", values, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeNotIn(List<String> values) {
            addCriterion("HOLD_TYPE not in", values, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeBetween(String value1, String value2) {
            addCriterion("HOLD_TYPE between", value1, value2, "holdType");
            return (Criteria) this;
        }

        public Criteria andHoldTypeNotBetween(String value1, String value2) {
            addCriterion("HOLD_TYPE not between", value1, value2, "holdType");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdIsNull() {
            addCriterion("COUNTERPARTY_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdIsNotNull() {
            addCriterion("COUNTERPARTY_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdEqualTo(String value) {
            addCriterion("COUNTERPARTY_ORG_ID =", value, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdNotEqualTo(String value) {
            addCriterion("COUNTERPARTY_ORG_ID <>", value, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdGreaterThan(String value) {
            addCriterion("COUNTERPARTY_ORG_ID >", value, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTERPARTY_ORG_ID >=", value, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdLessThan(String value) {
            addCriterion("COUNTERPARTY_ORG_ID <", value, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdLessThanOrEqualTo(String value) {
            addCriterion("COUNTERPARTY_ORG_ID <=", value, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdLike(String value) {
            addCriterion("COUNTERPARTY_ORG_ID like", value, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdNotLike(String value) {
            addCriterion("COUNTERPARTY_ORG_ID not like", value, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdIn(List<String> values) {
            addCriterion("COUNTERPARTY_ORG_ID in", values, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdNotIn(List<String> values) {
            addCriterion("COUNTERPARTY_ORG_ID not in", values, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdBetween(String value1, String value2) {
            addCriterion("COUNTERPARTY_ORG_ID between", value1, value2, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andCounterpartyOrgIdNotBetween(String value1, String value2) {
            addCriterion("COUNTERPARTY_ORG_ID not between", value1, value2, "counterpartyOrgId");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("LOCKED is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("LOCKED is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(String value) {
            addCriterion("LOCKED =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(String value) {
            addCriterion("LOCKED <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(String value) {
            addCriterion("LOCKED >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(String value) {
            addCriterion("LOCKED >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(String value) {
            addCriterion("LOCKED <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(String value) {
            addCriterion("LOCKED <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLike(String value) {
            addCriterion("LOCKED like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotLike(String value) {
            addCriterion("LOCKED not like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<String> values) {
            addCriterion("LOCKED in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<String> values) {
            addCriterion("LOCKED not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(String value1, String value2) {
            addCriterion("LOCKED between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(String value1, String value2) {
            addCriterion("LOCKED not between", value1, value2, "locked");
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