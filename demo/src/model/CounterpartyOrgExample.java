package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CounterpartyOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CounterpartyOrgExample() {
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

        public Criteria andSecondrayTraderClientIsNull() {
            addCriterion("SECONDRAY_TRADER_CLIENT is null");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientIsNotNull() {
            addCriterion("SECONDRAY_TRADER_CLIENT is not null");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientEqualTo(String value) {
            addCriterion("SECONDRAY_TRADER_CLIENT =", value, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientNotEqualTo(String value) {
            addCriterion("SECONDRAY_TRADER_CLIENT <>", value, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientGreaterThan(String value) {
            addCriterion("SECONDRAY_TRADER_CLIENT >", value, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientGreaterThanOrEqualTo(String value) {
            addCriterion("SECONDRAY_TRADER_CLIENT >=", value, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientLessThan(String value) {
            addCriterion("SECONDRAY_TRADER_CLIENT <", value, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientLessThanOrEqualTo(String value) {
            addCriterion("SECONDRAY_TRADER_CLIENT <=", value, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientLike(String value) {
            addCriterion("SECONDRAY_TRADER_CLIENT like", value, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientNotLike(String value) {
            addCriterion("SECONDRAY_TRADER_CLIENT not like", value, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientIn(List<String> values) {
            addCriterion("SECONDRAY_TRADER_CLIENT in", values, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientNotIn(List<String> values) {
            addCriterion("SECONDRAY_TRADER_CLIENT not in", values, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientBetween(String value1, String value2) {
            addCriterion("SECONDRAY_TRADER_CLIENT between", value1, value2, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderClientNotBetween(String value1, String value2) {
            addCriterion("SECONDRAY_TRADER_CLIENT not between", value1, value2, "secondrayTraderClient");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderIsNull() {
            addCriterion("SECONDRAY_TRADER is null");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderIsNotNull() {
            addCriterion("SECONDRAY_TRADER is not null");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderEqualTo(String value) {
            addCriterion("SECONDRAY_TRADER =", value, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderNotEqualTo(String value) {
            addCriterion("SECONDRAY_TRADER <>", value, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderGreaterThan(String value) {
            addCriterion("SECONDRAY_TRADER >", value, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderGreaterThanOrEqualTo(String value) {
            addCriterion("SECONDRAY_TRADER >=", value, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderLessThan(String value) {
            addCriterion("SECONDRAY_TRADER <", value, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderLessThanOrEqualTo(String value) {
            addCriterion("SECONDRAY_TRADER <=", value, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderLike(String value) {
            addCriterion("SECONDRAY_TRADER like", value, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderNotLike(String value) {
            addCriterion("SECONDRAY_TRADER not like", value, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderIn(List<String> values) {
            addCriterion("SECONDRAY_TRADER in", values, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderNotIn(List<String> values) {
            addCriterion("SECONDRAY_TRADER not in", values, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderBetween(String value1, String value2) {
            addCriterion("SECONDRAY_TRADER between", value1, value2, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andSecondrayTraderNotBetween(String value1, String value2) {
            addCriterion("SECONDRAY_TRADER not between", value1, value2, "secondrayTrader");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("INDUSTRY =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("INDUSTRY <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("INDUSTRY >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("INDUSTRY <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("INDUSTRY like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("INDUSTRY not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("INDUSTRY in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("INDUSTRY not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("INDUSTRY between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessIsNull() {
            addCriterion("SCOPE_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessIsNotNull() {
            addCriterion("SCOPE_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessEqualTo(String value) {
            addCriterion("SCOPE_BUSINESS =", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessNotEqualTo(String value) {
            addCriterion("SCOPE_BUSINESS <>", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessGreaterThan(String value) {
            addCriterion("SCOPE_BUSINESS >", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("SCOPE_BUSINESS >=", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessLessThan(String value) {
            addCriterion("SCOPE_BUSINESS <", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessLessThanOrEqualTo(String value) {
            addCriterion("SCOPE_BUSINESS <=", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessLike(String value) {
            addCriterion("SCOPE_BUSINESS like", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessNotLike(String value) {
            addCriterion("SCOPE_BUSINESS not like", value, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessIn(List<String> values) {
            addCriterion("SCOPE_BUSINESS in", values, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessNotIn(List<String> values) {
            addCriterion("SCOPE_BUSINESS not in", values, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessBetween(String value1, String value2) {
            addCriterion("SCOPE_BUSINESS between", value1, value2, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeBusinessNotBetween(String value1, String value2) {
            addCriterion("SCOPE_BUSINESS not between", value1, value2, "scopeBusiness");
            return (Criteria) this;
        }

        public Criteria andListAttributeIsNull() {
            addCriterion("LIST_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andListAttributeIsNotNull() {
            addCriterion("LIST_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andListAttributeEqualTo(String value) {
            addCriterion("LIST_ATTRIBUTE =", value, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeNotEqualTo(String value) {
            addCriterion("LIST_ATTRIBUTE <>", value, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeGreaterThan(String value) {
            addCriterion("LIST_ATTRIBUTE >", value, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("LIST_ATTRIBUTE >=", value, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeLessThan(String value) {
            addCriterion("LIST_ATTRIBUTE <", value, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeLessThanOrEqualTo(String value) {
            addCriterion("LIST_ATTRIBUTE <=", value, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeLike(String value) {
            addCriterion("LIST_ATTRIBUTE like", value, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeNotLike(String value) {
            addCriterion("LIST_ATTRIBUTE not like", value, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeIn(List<String> values) {
            addCriterion("LIST_ATTRIBUTE in", values, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeNotIn(List<String> values) {
            addCriterion("LIST_ATTRIBUTE not in", values, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeBetween(String value1, String value2) {
            addCriterion("LIST_ATTRIBUTE between", value1, value2, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andListAttributeNotBetween(String value1, String value2) {
            addCriterion("LIST_ATTRIBUTE not between", value1, value2, "listAttribute");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
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

        public Criteria andCapitalAttributeIsNull() {
            addCriterion("CAPITAL_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeIsNotNull() {
            addCriterion("CAPITAL_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeEqualTo(String value) {
            addCriterion("CAPITAL_ATTRIBUTE =", value, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeNotEqualTo(String value) {
            addCriterion("CAPITAL_ATTRIBUTE <>", value, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeGreaterThan(String value) {
            addCriterion("CAPITAL_ATTRIBUTE >", value, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("CAPITAL_ATTRIBUTE >=", value, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeLessThan(String value) {
            addCriterion("CAPITAL_ATTRIBUTE <", value, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeLessThanOrEqualTo(String value) {
            addCriterion("CAPITAL_ATTRIBUTE <=", value, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeLike(String value) {
            addCriterion("CAPITAL_ATTRIBUTE like", value, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeNotLike(String value) {
            addCriterion("CAPITAL_ATTRIBUTE not like", value, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeIn(List<String> values) {
            addCriterion("CAPITAL_ATTRIBUTE in", values, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeNotIn(List<String> values) {
            addCriterion("CAPITAL_ATTRIBUTE not in", values, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeBetween(String value1, String value2) {
            addCriterion("CAPITAL_ATTRIBUTE between", value1, value2, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andCapitalAttributeNotBetween(String value1, String value2) {
            addCriterion("CAPITAL_ATTRIBUTE not between", value1, value2, "capitalAttribute");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("NATURE is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("NATURE =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("NATURE <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("NATURE >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("NATURE >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("NATURE <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("NATURE <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("NATURE like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("NATURE not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("NATURE in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("NATURE not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("NATURE between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("NATURE not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andAptitudeIsNull() {
            addCriterion("APTITUDE is null");
            return (Criteria) this;
        }

        public Criteria andAptitudeIsNotNull() {
            addCriterion("APTITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andAptitudeEqualTo(String value) {
            addCriterion("APTITUDE =", value, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeNotEqualTo(String value) {
            addCriterion("APTITUDE <>", value, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeGreaterThan(String value) {
            addCriterion("APTITUDE >", value, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeGreaterThanOrEqualTo(String value) {
            addCriterion("APTITUDE >=", value, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeLessThan(String value) {
            addCriterion("APTITUDE <", value, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeLessThanOrEqualTo(String value) {
            addCriterion("APTITUDE <=", value, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeLike(String value) {
            addCriterion("APTITUDE like", value, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeNotLike(String value) {
            addCriterion("APTITUDE not like", value, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeIn(List<String> values) {
            addCriterion("APTITUDE in", values, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeNotIn(List<String> values) {
            addCriterion("APTITUDE not in", values, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeBetween(String value1, String value2) {
            addCriterion("APTITUDE between", value1, value2, "aptitude");
            return (Criteria) this;
        }

        public Criteria andAptitudeNotBetween(String value1, String value2) {
            addCriterion("APTITUDE not between", value1, value2, "aptitude");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentIsNull() {
            addCriterion("NONTAXRESIDENT is null");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentIsNotNull() {
            addCriterion("NONTAXRESIDENT is not null");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentEqualTo(String value) {
            addCriterion("NONTAXRESIDENT =", value, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentNotEqualTo(String value) {
            addCriterion("NONTAXRESIDENT <>", value, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentGreaterThan(String value) {
            addCriterion("NONTAXRESIDENT >", value, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentGreaterThanOrEqualTo(String value) {
            addCriterion("NONTAXRESIDENT >=", value, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentLessThan(String value) {
            addCriterion("NONTAXRESIDENT <", value, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentLessThanOrEqualTo(String value) {
            addCriterion("NONTAXRESIDENT <=", value, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentLike(String value) {
            addCriterion("NONTAXRESIDENT like", value, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentNotLike(String value) {
            addCriterion("NONTAXRESIDENT not like", value, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentIn(List<String> values) {
            addCriterion("NONTAXRESIDENT in", values, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentNotIn(List<String> values) {
            addCriterion("NONTAXRESIDENT not in", values, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentBetween(String value1, String value2) {
            addCriterion("NONTAXRESIDENT between", value1, value2, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andNontaxresidentNotBetween(String value1, String value2) {
            addCriterion("NONTAXRESIDENT not between", value1, value2, "nontaxresident");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryIsNull() {
            addCriterion("REGISTER_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryIsNotNull() {
            addCriterion("REGISTER_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryEqualTo(String value) {
            addCriterion("REGISTER_COUNTRY =", value, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryNotEqualTo(String value) {
            addCriterion("REGISTER_COUNTRY <>", value, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryGreaterThan(String value) {
            addCriterion("REGISTER_COUNTRY >", value, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_COUNTRY >=", value, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryLessThan(String value) {
            addCriterion("REGISTER_COUNTRY <", value, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_COUNTRY <=", value, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryLike(String value) {
            addCriterion("REGISTER_COUNTRY like", value, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryNotLike(String value) {
            addCriterion("REGISTER_COUNTRY not like", value, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryIn(List<String> values) {
            addCriterion("REGISTER_COUNTRY in", values, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryNotIn(List<String> values) {
            addCriterion("REGISTER_COUNTRY not in", values, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryBetween(String value1, String value2) {
            addCriterion("REGISTER_COUNTRY between", value1, value2, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterCountryNotBetween(String value1, String value2) {
            addCriterion("REGISTER_COUNTRY not between", value1, value2, "registerCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("REGISTERED_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("REGISTERED_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("REGISTERED_ADDRESS =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("REGISTERED_ADDRESS <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("REGISTERED_ADDRESS >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERED_ADDRESS >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("REGISTERED_ADDRESS <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("REGISTERED_ADDRESS <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("REGISTERED_ADDRESS like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("REGISTERED_ADDRESS not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("REGISTERED_ADDRESS in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("REGISTERED_ADDRESS not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("REGISTERED_ADDRESS between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("REGISTERED_ADDRESS not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIsNull() {
            addCriterion("OFFICE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIsNotNull() {
            addCriterion("OFFICE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS =", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS <>", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressGreaterThan(String value) {
            addCriterion("OFFICE_ADDRESS >", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS >=", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressLessThan(String value) {
            addCriterion("OFFICE_ADDRESS <", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS <=", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressLike(String value) {
            addCriterion("OFFICE_ADDRESS like", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotLike(String value) {
            addCriterion("OFFICE_ADDRESS not like", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIn(List<String> values) {
            addCriterion("OFFICE_ADDRESS in", values, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotIn(List<String> values) {
            addCriterion("OFFICE_ADDRESS not in", values, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressBetween(String value1, String value2) {
            addCriterion("OFFICE_ADDRESS between", value1, value2, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotBetween(String value1, String value2) {
            addCriterion("OFFICE_ADDRESS not between", value1, value2, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andSetupDateIsNull() {
            addCriterion("SETUP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSetupDateIsNotNull() {
            addCriterion("SETUP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSetupDateEqualTo(Date value) {
            addCriterion("SETUP_DATE =", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotEqualTo(Date value) {
            addCriterion("SETUP_DATE <>", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThan(Date value) {
            addCriterion("SETUP_DATE >", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SETUP_DATE >=", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThan(Date value) {
            addCriterion("SETUP_DATE <", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThanOrEqualTo(Date value) {
            addCriterion("SETUP_DATE <=", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateIn(List<Date> values) {
            addCriterion("SETUP_DATE in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotIn(List<Date> values) {
            addCriterion("SETUP_DATE not in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateBetween(Date value1, Date value2) {
            addCriterion("SETUP_DATE between", value1, value2, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotBetween(Date value1, Date value2) {
            addCriterion("SETUP_DATE not between", value1, value2, "setupDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("REGISTERED_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("REGISTERED_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(Short value) {
            addCriterion("REGISTERED_CAPITAL =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(Short value) {
            addCriterion("REGISTERED_CAPITAL <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(Short value) {
            addCriterion("REGISTERED_CAPITAL >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(Short value) {
            addCriterion("REGISTERED_CAPITAL >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(Short value) {
            addCriterion("REGISTERED_CAPITAL <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(Short value) {
            addCriterion("REGISTERED_CAPITAL <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<Short> values) {
            addCriterion("REGISTERED_CAPITAL in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<Short> values) {
            addCriterion("REGISTERED_CAPITAL not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(Short value1, Short value2) {
            addCriterion("REGISTERED_CAPITAL between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(Short value1, Short value2) {
            addCriterion("REGISTERED_CAPITAL not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("CLIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("CLIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("CLIENT_TYPE =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("CLIENT_TYPE <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("CLIENT_TYPE >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_TYPE >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("CLIENT_TYPE <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_TYPE <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("CLIENT_TYPE like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("CLIENT_TYPE not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("CLIENT_TYPE in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("CLIENT_TYPE not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("CLIENT_TYPE between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("CLIENT_TYPE not between", value1, value2, "clientType");
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

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
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

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("AUDIT_STATUS like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("AUDIT_STATUS not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andOrganTypeIsNull() {
            addCriterion("ORGAN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrganTypeIsNotNull() {
            addCriterion("ORGAN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganTypeEqualTo(String value) {
            addCriterion("ORGAN_TYPE =", value, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeNotEqualTo(String value) {
            addCriterion("ORGAN_TYPE <>", value, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeGreaterThan(String value) {
            addCriterion("ORGAN_TYPE >", value, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGAN_TYPE >=", value, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeLessThan(String value) {
            addCriterion("ORGAN_TYPE <", value, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeLessThanOrEqualTo(String value) {
            addCriterion("ORGAN_TYPE <=", value, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeLike(String value) {
            addCriterion("ORGAN_TYPE like", value, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeNotLike(String value) {
            addCriterion("ORGAN_TYPE not like", value, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeIn(List<String> values) {
            addCriterion("ORGAN_TYPE in", values, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeNotIn(List<String> values) {
            addCriterion("ORGAN_TYPE not in", values, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeBetween(String value1, String value2) {
            addCriterion("ORGAN_TYPE between", value1, value2, "organType");
            return (Criteria) this;
        }

        public Criteria andOrganTypeNotBetween(String value1, String value2) {
            addCriterion("ORGAN_TYPE not between", value1, value2, "organType");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentIsNull() {
            addCriterion("INTRODUCTION_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentIsNotNull() {
            addCriterion("INTRODUCTION_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentEqualTo(String value) {
            addCriterion("INTRODUCTION_DEPARTMENT =", value, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentNotEqualTo(String value) {
            addCriterion("INTRODUCTION_DEPARTMENT <>", value, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentGreaterThan(String value) {
            addCriterion("INTRODUCTION_DEPARTMENT >", value, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION_DEPARTMENT >=", value, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentLessThan(String value) {
            addCriterion("INTRODUCTION_DEPARTMENT <", value, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION_DEPARTMENT <=", value, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentLike(String value) {
            addCriterion("INTRODUCTION_DEPARTMENT like", value, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentNotLike(String value) {
            addCriterion("INTRODUCTION_DEPARTMENT not like", value, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentIn(List<String> values) {
            addCriterion("INTRODUCTION_DEPARTMENT in", values, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentNotIn(List<String> values) {
            addCriterion("INTRODUCTION_DEPARTMENT not in", values, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentBetween(String value1, String value2) {
            addCriterion("INTRODUCTION_DEPARTMENT between", value1, value2, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andIntroductionDepartmentNotBetween(String value1, String value2) {
            addCriterion("INTRODUCTION_DEPARTMENT not between", value1, value2, "introductionDepartment");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIsNull() {
            addCriterion("CUSTOMER_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIsNotNull() {
            addCriterion("CUSTOMER_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerEqualTo(String value) {
            addCriterion("CUSTOMER_MANAGER =", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotEqualTo(String value) {
            addCriterion("CUSTOMER_MANAGER <>", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerGreaterThan(String value) {
            addCriterion("CUSTOMER_MANAGER >", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_MANAGER >=", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLessThan(String value) {
            addCriterion("CUSTOMER_MANAGER <", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_MANAGER <=", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLike(String value) {
            addCriterion("CUSTOMER_MANAGER like", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotLike(String value) {
            addCriterion("CUSTOMER_MANAGER not like", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIn(List<String> values) {
            addCriterion("CUSTOMER_MANAGER in", values, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotIn(List<String> values) {
            addCriterion("CUSTOMER_MANAGER not in", values, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerBetween(String value1, String value2) {
            addCriterion("CUSTOMER_MANAGER between", value1, value2, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_MANAGER not between", value1, value2, "customerManager");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagIsNull() {
            addCriterion("AML_MONITOR_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagIsNotNull() {
            addCriterion("AML_MONITOR_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagEqualTo(String value) {
            addCriterion("AML_MONITOR_FLAG =", value, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagNotEqualTo(String value) {
            addCriterion("AML_MONITOR_FLAG <>", value, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagGreaterThan(String value) {
            addCriterion("AML_MONITOR_FLAG >", value, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AML_MONITOR_FLAG >=", value, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagLessThan(String value) {
            addCriterion("AML_MONITOR_FLAG <", value, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagLessThanOrEqualTo(String value) {
            addCriterion("AML_MONITOR_FLAG <=", value, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagLike(String value) {
            addCriterion("AML_MONITOR_FLAG like", value, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagNotLike(String value) {
            addCriterion("AML_MONITOR_FLAG not like", value, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagIn(List<String> values) {
            addCriterion("AML_MONITOR_FLAG in", values, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagNotIn(List<String> values) {
            addCriterion("AML_MONITOR_FLAG not in", values, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagBetween(String value1, String value2) {
            addCriterion("AML_MONITOR_FLAG between", value1, value2, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andAmlMonitorFlagNotBetween(String value1, String value2) {
            addCriterion("AML_MONITOR_FLAG not between", value1, value2, "amlMonitorFlag");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdIsNull() {
            addCriterion("LASTEST_CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdIsNotNull() {
            addCriterion("LASTEST_CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdEqualTo(String value) {
            addCriterion("LASTEST_CLIENT_ID =", value, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdNotEqualTo(String value) {
            addCriterion("LASTEST_CLIENT_ID <>", value, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdGreaterThan(String value) {
            addCriterion("LASTEST_CLIENT_ID >", value, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("LASTEST_CLIENT_ID >=", value, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdLessThan(String value) {
            addCriterion("LASTEST_CLIENT_ID <", value, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdLessThanOrEqualTo(String value) {
            addCriterion("LASTEST_CLIENT_ID <=", value, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdLike(String value) {
            addCriterion("LASTEST_CLIENT_ID like", value, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdNotLike(String value) {
            addCriterion("LASTEST_CLIENT_ID not like", value, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdIn(List<String> values) {
            addCriterion("LASTEST_CLIENT_ID in", values, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdNotIn(List<String> values) {
            addCriterion("LASTEST_CLIENT_ID not in", values, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdBetween(String value1, String value2) {
            addCriterion("LASTEST_CLIENT_ID between", value1, value2, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andLastestClientIdNotBetween(String value1, String value2) {
            addCriterion("LASTEST_CLIENT_ID not between", value1, value2, "lastestClientId");
            return (Criteria) this;
        }

        public Criteria andConcernFlagIsNull() {
            addCriterion("CONCERN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andConcernFlagIsNotNull() {
            addCriterion("CONCERN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andConcernFlagEqualTo(String value) {
            addCriterion("CONCERN_FLAG =", value, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagNotEqualTo(String value) {
            addCriterion("CONCERN_FLAG <>", value, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagGreaterThan(String value) {
            addCriterion("CONCERN_FLAG >", value, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CONCERN_FLAG >=", value, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagLessThan(String value) {
            addCriterion("CONCERN_FLAG <", value, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagLessThanOrEqualTo(String value) {
            addCriterion("CONCERN_FLAG <=", value, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagLike(String value) {
            addCriterion("CONCERN_FLAG like", value, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagNotLike(String value) {
            addCriterion("CONCERN_FLAG not like", value, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagIn(List<String> values) {
            addCriterion("CONCERN_FLAG in", values, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagNotIn(List<String> values) {
            addCriterion("CONCERN_FLAG not in", values, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagBetween(String value1, String value2) {
            addCriterion("CONCERN_FLAG between", value1, value2, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andConcernFlagNotBetween(String value1, String value2) {
            addCriterion("CONCERN_FLAG not between", value1, value2, "concernFlag");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceIsNull() {
            addCriterion("REGISTER_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceIsNotNull() {
            addCriterion("REGISTER_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceEqualTo(String value) {
            addCriterion("REGISTER_PROVINCE =", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotEqualTo(String value) {
            addCriterion("REGISTER_PROVINCE <>", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceGreaterThan(String value) {
            addCriterion("REGISTER_PROVINCE >", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_PROVINCE >=", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceLessThan(String value) {
            addCriterion("REGISTER_PROVINCE <", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_PROVINCE <=", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceLike(String value) {
            addCriterion("REGISTER_PROVINCE like", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotLike(String value) {
            addCriterion("REGISTER_PROVINCE not like", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceIn(List<String> values) {
            addCriterion("REGISTER_PROVINCE in", values, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotIn(List<String> values) {
            addCriterion("REGISTER_PROVINCE not in", values, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceBetween(String value1, String value2) {
            addCriterion("REGISTER_PROVINCE between", value1, value2, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotBetween(String value1, String value2) {
            addCriterion("REGISTER_PROVINCE not between", value1, value2, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterCityIsNull() {
            addCriterion("REGISTER_CITY is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCityIsNotNull() {
            addCriterion("REGISTER_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCityEqualTo(String value) {
            addCriterion("REGISTER_CITY =", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotEqualTo(String value) {
            addCriterion("REGISTER_CITY <>", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityGreaterThan(String value) {
            addCriterion("REGISTER_CITY >", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_CITY >=", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityLessThan(String value) {
            addCriterion("REGISTER_CITY <", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_CITY <=", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityLike(String value) {
            addCriterion("REGISTER_CITY like", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotLike(String value) {
            addCriterion("REGISTER_CITY not like", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityIn(List<String> values) {
            addCriterion("REGISTER_CITY in", values, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotIn(List<String> values) {
            addCriterion("REGISTER_CITY not in", values, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityBetween(String value1, String value2) {
            addCriterion("REGISTER_CITY between", value1, value2, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotBetween(String value1, String value2) {
            addCriterion("REGISTER_CITY not between", value1, value2, "registerCity");
            return (Criteria) this;
        }

        public Criteria andIssuingDateIsNull() {
            addCriterion("ISSUING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIssuingDateIsNotNull() {
            addCriterion("ISSUING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIssuingDateEqualTo(Date value) {
            addCriterion("ISSUING_DATE =", value, "issuingDate");
            return (Criteria) this;
        }

        public Criteria andIssuingDateNotEqualTo(Date value) {
            addCriterion("ISSUING_DATE <>", value, "issuingDate");
            return (Criteria) this;
        }

        public Criteria andIssuingDateGreaterThan(Date value) {
            addCriterion("ISSUING_DATE >", value, "issuingDate");
            return (Criteria) this;
        }

        public Criteria andIssuingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ISSUING_DATE >=", value, "issuingDate");
            return (Criteria) this;
        }

        public Criteria andIssuingDateLessThan(Date value) {
            addCriterion("ISSUING_DATE <", value, "issuingDate");
            return (Criteria) this;
        }

        public Criteria andIssuingDateLessThanOrEqualTo(Date value) {
            addCriterion("ISSUING_DATE <=", value, "issuingDate");
            return (Criteria) this;
        }

        public Criteria andIssuingDateIn(List<Date> values) {
            addCriterion("ISSUING_DATE in", values, "issuingDate");
            return (Criteria) this;
        }

        public Criteria andIssuingDateNotIn(List<Date> values) {
            addCriterion("ISSUING_DATE not in", values, "issuingDate");
            return (Criteria) this;
        }

        public Criteria andIssuingDateBetween(Date value1, Date value2) {
            addCriterion("ISSUING_DATE between", value1, value2, "issuingDate");
            return (Criteria) this;
        }

        public Criteria andIssuingDateNotBetween(Date value1, Date value2) {
            addCriterion("ISSUING_DATE not between", value1, value2, "issuingDate");
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