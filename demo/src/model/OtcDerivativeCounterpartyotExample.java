package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OtcDerivativeCounterpartyotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OtcDerivativeCounterpartyotExample() {
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

        public Criteria andNameAbbreviationIsNull() {
            addCriterion("NAME_ABBREVIATION is null");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationIsNotNull() {
            addCriterion("NAME_ABBREVIATION is not null");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationEqualTo(String value) {
            addCriterion("NAME_ABBREVIATION =", value, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationNotEqualTo(String value) {
            addCriterion("NAME_ABBREVIATION <>", value, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationGreaterThan(String value) {
            addCriterion("NAME_ABBREVIATION >", value, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_ABBREVIATION >=", value, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationLessThan(String value) {
            addCriterion("NAME_ABBREVIATION <", value, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("NAME_ABBREVIATION <=", value, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationLike(String value) {
            addCriterion("NAME_ABBREVIATION like", value, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationNotLike(String value) {
            addCriterion("NAME_ABBREVIATION not like", value, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationIn(List<String> values) {
            addCriterion("NAME_ABBREVIATION in", values, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationNotIn(List<String> values) {
            addCriterion("NAME_ABBREVIATION not in", values, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationBetween(String value1, String value2) {
            addCriterion("NAME_ABBREVIATION between", value1, value2, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNameAbbreviationNotBetween(String value1, String value2) {
            addCriterion("NAME_ABBREVIATION not between", value1, value2, "nameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("ORGANIZATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("ORGANIZATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("ORGANIZATION_CODE >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("ORGANIZATION_CODE <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("ORGANIZATION_CODE like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("ORGANIZATION_CODE not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("ORGANIZATION_CODE in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("ORGANIZATION_CODE not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_CODE between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_CODE not between", value1, value2, "organizationCode");
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

        public Criteria andLimitedDateIsNull() {
            addCriterion("LIMITED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLimitedDateIsNotNull() {
            addCriterion("LIMITED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedDateEqualTo(Date value) {
            addCriterion("LIMITED_DATE =", value, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andLimitedDateNotEqualTo(Date value) {
            addCriterion("LIMITED_DATE <>", value, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andLimitedDateGreaterThan(Date value) {
            addCriterion("LIMITED_DATE >", value, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andLimitedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LIMITED_DATE >=", value, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andLimitedDateLessThan(Date value) {
            addCriterion("LIMITED_DATE <", value, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andLimitedDateLessThanOrEqualTo(Date value) {
            addCriterion("LIMITED_DATE <=", value, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andLimitedDateIn(List<Date> values) {
            addCriterion("LIMITED_DATE in", values, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andLimitedDateNotIn(List<Date> values) {
            addCriterion("LIMITED_DATE not in", values, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andLimitedDateBetween(Date value1, Date value2) {
            addCriterion("LIMITED_DATE between", value1, value2, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andLimitedDateNotBetween(Date value1, Date value2) {
            addCriterion("LIMITED_DATE not between", value1, value2, "limitedDate");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismIsNull() {
            addCriterion("MAJOR_MECHANISM is null");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismIsNotNull() {
            addCriterion("MAJOR_MECHANISM is not null");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismEqualTo(String value) {
            addCriterion("MAJOR_MECHANISM =", value, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismNotEqualTo(String value) {
            addCriterion("MAJOR_MECHANISM <>", value, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismGreaterThan(String value) {
            addCriterion("MAJOR_MECHANISM >", value, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR_MECHANISM >=", value, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismLessThan(String value) {
            addCriterion("MAJOR_MECHANISM <", value, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismLessThanOrEqualTo(String value) {
            addCriterion("MAJOR_MECHANISM <=", value, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismLike(String value) {
            addCriterion("MAJOR_MECHANISM like", value, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismNotLike(String value) {
            addCriterion("MAJOR_MECHANISM not like", value, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismIn(List<String> values) {
            addCriterion("MAJOR_MECHANISM in", values, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismNotIn(List<String> values) {
            addCriterion("MAJOR_MECHANISM not in", values, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismBetween(String value1, String value2) {
            addCriterion("MAJOR_MECHANISM between", value1, value2, "majorMechanism");
            return (Criteria) this;
        }

        public Criteria andMajorMechanismNotBetween(String value1, String value2) {
            addCriterion("MAJOR_MECHANISM not between", value1, value2, "majorMechanism");
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

        public Criteria andInvestmentVarietiesIsNull() {
            addCriterion("INVESTMENT_VARIETIES is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesIsNotNull() {
            addCriterion("INVESTMENT_VARIETIES is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesEqualTo(String value) {
            addCriterion("INVESTMENT_VARIETIES =", value, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesNotEqualTo(String value) {
            addCriterion("INVESTMENT_VARIETIES <>", value, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesGreaterThan(String value) {
            addCriterion("INVESTMENT_VARIETIES >", value, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTMENT_VARIETIES >=", value, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesLessThan(String value) {
            addCriterion("INVESTMENT_VARIETIES <", value, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesLessThanOrEqualTo(String value) {
            addCriterion("INVESTMENT_VARIETIES <=", value, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesLike(String value) {
            addCriterion("INVESTMENT_VARIETIES like", value, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesNotLike(String value) {
            addCriterion("INVESTMENT_VARIETIES not like", value, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesIn(List<String> values) {
            addCriterion("INVESTMENT_VARIETIES in", values, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesNotIn(List<String> values) {
            addCriterion("INVESTMENT_VARIETIES not in", values, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesBetween(String value1, String value2) {
            addCriterion("INVESTMENT_VARIETIES between", value1, value2, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andInvestmentVarietiesNotBetween(String value1, String value2) {
            addCriterion("INVESTMENT_VARIETIES not between", value1, value2, "investmentVarieties");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanIsNull() {
            addCriterion("PARTY_CONTACTMAN is null");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanIsNotNull() {
            addCriterion("PARTY_CONTACTMAN is not null");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanEqualTo(String value) {
            addCriterion("PARTY_CONTACTMAN =", value, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanNotEqualTo(String value) {
            addCriterion("PARTY_CONTACTMAN <>", value, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanGreaterThan(String value) {
            addCriterion("PARTY_CONTACTMAN >", value, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanGreaterThanOrEqualTo(String value) {
            addCriterion("PARTY_CONTACTMAN >=", value, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanLessThan(String value) {
            addCriterion("PARTY_CONTACTMAN <", value, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanLessThanOrEqualTo(String value) {
            addCriterion("PARTY_CONTACTMAN <=", value, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanLike(String value) {
            addCriterion("PARTY_CONTACTMAN like", value, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanNotLike(String value) {
            addCriterion("PARTY_CONTACTMAN not like", value, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanIn(List<String> values) {
            addCriterion("PARTY_CONTACTMAN in", values, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanNotIn(List<String> values) {
            addCriterion("PARTY_CONTACTMAN not in", values, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanBetween(String value1, String value2) {
            addCriterion("PARTY_CONTACTMAN between", value1, value2, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andPartyContactmanNotBetween(String value1, String value2) {
            addCriterion("PARTY_CONTACTMAN not between", value1, value2, "partyContactman");
            return (Criteria) this;
        }

        public Criteria andActualControllerIsNull() {
            addCriterion("ACTUAL_CONTROLLER is null");
            return (Criteria) this;
        }

        public Criteria andActualControllerIsNotNull() {
            addCriterion("ACTUAL_CONTROLLER is not null");
            return (Criteria) this;
        }

        public Criteria andActualControllerEqualTo(String value) {
            addCriterion("ACTUAL_CONTROLLER =", value, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerNotEqualTo(String value) {
            addCriterion("ACTUAL_CONTROLLER <>", value, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerGreaterThan(String value) {
            addCriterion("ACTUAL_CONTROLLER >", value, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUAL_CONTROLLER >=", value, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerLessThan(String value) {
            addCriterion("ACTUAL_CONTROLLER <", value, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerLessThanOrEqualTo(String value) {
            addCriterion("ACTUAL_CONTROLLER <=", value, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerLike(String value) {
            addCriterion("ACTUAL_CONTROLLER like", value, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerNotLike(String value) {
            addCriterion("ACTUAL_CONTROLLER not like", value, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerIn(List<String> values) {
            addCriterion("ACTUAL_CONTROLLER in", values, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerNotIn(List<String> values) {
            addCriterion("ACTUAL_CONTROLLER not in", values, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerBetween(String value1, String value2) {
            addCriterion("ACTUAL_CONTROLLER between", value1, value2, "actualController");
            return (Criteria) this;
        }

        public Criteria andActualControllerNotBetween(String value1, String value2) {
            addCriterion("ACTUAL_CONTROLLER not between", value1, value2, "actualController");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("LEGAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("LEGAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("LEGAL_PERSON =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("LEGAL_PERSON >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("LEGAL_PERSON <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("LEGAL_PERSON like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("LEGAL_PERSON not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("LEGAL_PERSON in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsIsNull() {
            addCriterion("PROFESSIONAL_INVESTORS is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsIsNotNull() {
            addCriterion("PROFESSIONAL_INVESTORS is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsEqualTo(String value) {
            addCriterion("PROFESSIONAL_INVESTORS =", value, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsNotEqualTo(String value) {
            addCriterion("PROFESSIONAL_INVESTORS <>", value, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsGreaterThan(String value) {
            addCriterion("PROFESSIONAL_INVESTORS >", value, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL_INVESTORS >=", value, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsLessThan(String value) {
            addCriterion("PROFESSIONAL_INVESTORS <", value, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL_INVESTORS <=", value, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsLike(String value) {
            addCriterion("PROFESSIONAL_INVESTORS like", value, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsNotLike(String value) {
            addCriterion("PROFESSIONAL_INVESTORS not like", value, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsIn(List<String> values) {
            addCriterion("PROFESSIONAL_INVESTORS in", values, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsNotIn(List<String> values) {
            addCriterion("PROFESSIONAL_INVESTORS not in", values, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL_INVESTORS between", value1, value2, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorsNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL_INVESTORS not between", value1, value2, "professionalInvestors");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MOBILE_PHONE like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
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

        public Criteria andSignatureNameIsNull() {
            addCriterion("SIGNATURE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSignatureNameIsNotNull() {
            addCriterion("SIGNATURE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureNameEqualTo(String value) {
            addCriterion("SIGNATURE_NAME =", value, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameNotEqualTo(String value) {
            addCriterion("SIGNATURE_NAME <>", value, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameGreaterThan(String value) {
            addCriterion("SIGNATURE_NAME >", value, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_NAME >=", value, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameLessThan(String value) {
            addCriterion("SIGNATURE_NAME <", value, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameLessThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_NAME <=", value, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameLike(String value) {
            addCriterion("SIGNATURE_NAME like", value, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameNotLike(String value) {
            addCriterion("SIGNATURE_NAME not like", value, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameIn(List<String> values) {
            addCriterion("SIGNATURE_NAME in", values, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameNotIn(List<String> values) {
            addCriterion("SIGNATURE_NAME not in", values, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameBetween(String value1, String value2) {
            addCriterion("SIGNATURE_NAME between", value1, value2, "signatureName");
            return (Criteria) this;
        }

        public Criteria andSignatureNameNotBetween(String value1, String value2) {
            addCriterion("SIGNATURE_NAME not between", value1, value2, "signatureName");
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

        public Criteria andAgreementSigningDateIsNull() {
            addCriterion("AGREEMENT_SIGNING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateIsNotNull() {
            addCriterion("AGREEMENT_SIGNING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateEqualTo(Date value) {
            addCriterion("AGREEMENT_SIGNING_DATE =", value, "agreementSigningDate");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateNotEqualTo(Date value) {
            addCriterion("AGREEMENT_SIGNING_DATE <>", value, "agreementSigningDate");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateGreaterThan(Date value) {
            addCriterion("AGREEMENT_SIGNING_DATE >", value, "agreementSigningDate");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AGREEMENT_SIGNING_DATE >=", value, "agreementSigningDate");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateLessThan(Date value) {
            addCriterion("AGREEMENT_SIGNING_DATE <", value, "agreementSigningDate");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateLessThanOrEqualTo(Date value) {
            addCriterion("AGREEMENT_SIGNING_DATE <=", value, "agreementSigningDate");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateIn(List<Date> values) {
            addCriterion("AGREEMENT_SIGNING_DATE in", values, "agreementSigningDate");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateNotIn(List<Date> values) {
            addCriterion("AGREEMENT_SIGNING_DATE not in", values, "agreementSigningDate");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateBetween(Date value1, Date value2) {
            addCriterion("AGREEMENT_SIGNING_DATE between", value1, value2, "agreementSigningDate");
            return (Criteria) this;
        }

        public Criteria andAgreementSigningDateNotBetween(Date value1, Date value2) {
            addCriterion("AGREEMENT_SIGNING_DATE not between", value1, value2, "agreementSigningDate");
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

        public Criteria andPartyBContactIsNull() {
            addCriterion("PARTY_B_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andPartyBContactIsNotNull() {
            addCriterion("PARTY_B_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBContactEqualTo(String value) {
            addCriterion("PARTY_B_CONTACT =", value, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactNotEqualTo(String value) {
            addCriterion("PARTY_B_CONTACT <>", value, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactGreaterThan(String value) {
            addCriterion("PARTY_B_CONTACT >", value, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactGreaterThanOrEqualTo(String value) {
            addCriterion("PARTY_B_CONTACT >=", value, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactLessThan(String value) {
            addCriterion("PARTY_B_CONTACT <", value, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactLessThanOrEqualTo(String value) {
            addCriterion("PARTY_B_CONTACT <=", value, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactLike(String value) {
            addCriterion("PARTY_B_CONTACT like", value, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactNotLike(String value) {
            addCriterion("PARTY_B_CONTACT not like", value, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactIn(List<String> values) {
            addCriterion("PARTY_B_CONTACT in", values, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactNotIn(List<String> values) {
            addCriterion("PARTY_B_CONTACT not in", values, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactBetween(String value1, String value2) {
            addCriterion("PARTY_B_CONTACT between", value1, value2, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andPartyBContactNotBetween(String value1, String value2) {
            addCriterion("PARTY_B_CONTACT not between", value1, value2, "partyBContact");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideIsNull() {
            addCriterion("OUR_CONTRACTUAL_SIDE is null");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideIsNotNull() {
            addCriterion("OUR_CONTRACTUAL_SIDE is not null");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideEqualTo(String value) {
            addCriterion("OUR_CONTRACTUAL_SIDE =", value, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideNotEqualTo(String value) {
            addCriterion("OUR_CONTRACTUAL_SIDE <>", value, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideGreaterThan(String value) {
            addCriterion("OUR_CONTRACTUAL_SIDE >", value, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideGreaterThanOrEqualTo(String value) {
            addCriterion("OUR_CONTRACTUAL_SIDE >=", value, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideLessThan(String value) {
            addCriterion("OUR_CONTRACTUAL_SIDE <", value, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideLessThanOrEqualTo(String value) {
            addCriterion("OUR_CONTRACTUAL_SIDE <=", value, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideLike(String value) {
            addCriterion("OUR_CONTRACTUAL_SIDE like", value, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideNotLike(String value) {
            addCriterion("OUR_CONTRACTUAL_SIDE not like", value, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideIn(List<String> values) {
            addCriterion("OUR_CONTRACTUAL_SIDE in", values, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideNotIn(List<String> values) {
            addCriterion("OUR_CONTRACTUAL_SIDE not in", values, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideBetween(String value1, String value2) {
            addCriterion("OUR_CONTRACTUAL_SIDE between", value1, value2, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andOurContractualSideNotBetween(String value1, String value2) {
            addCriterion("OUR_CONTRACTUAL_SIDE not between", value1, value2, "ourContractualSide");
            return (Criteria) this;
        }

        public Criteria andCreditRatingIsNull() {
            addCriterion("CREDIT_RATING is null");
            return (Criteria) this;
        }

        public Criteria andCreditRatingIsNotNull() {
            addCriterion("CREDIT_RATING is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRatingEqualTo(String value) {
            addCriterion("CREDIT_RATING =", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingNotEqualTo(String value) {
            addCriterion("CREDIT_RATING <>", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingGreaterThan(String value) {
            addCriterion("CREDIT_RATING >", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_RATING >=", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingLessThan(String value) {
            addCriterion("CREDIT_RATING <", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_RATING <=", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingLike(String value) {
            addCriterion("CREDIT_RATING like", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingNotLike(String value) {
            addCriterion("CREDIT_RATING not like", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingIn(List<String> values) {
            addCriterion("CREDIT_RATING in", values, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingNotIn(List<String> values) {
            addCriterion("CREDIT_RATING not in", values, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingBetween(String value1, String value2) {
            addCriterion("CREDIT_RATING between", value1, value2, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingNotBetween(String value1, String value2) {
            addCriterion("CREDIT_RATING not between", value1, value2, "creditRating");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeIsNull() {
            addCriterion("PROTOCOL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeIsNotNull() {
            addCriterion("PROTOCOL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeEqualTo(String value) {
            addCriterion("PROTOCOL_TYPE =", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotEqualTo(String value) {
            addCriterion("PROTOCOL_TYPE <>", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeGreaterThan(String value) {
            addCriterion("PROTOCOL_TYPE >", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_TYPE >=", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeLessThan(String value) {
            addCriterion("PROTOCOL_TYPE <", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_TYPE <=", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeLike(String value) {
            addCriterion("PROTOCOL_TYPE like", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotLike(String value) {
            addCriterion("PROTOCOL_TYPE not like", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeIn(List<String> values) {
            addCriterion("PROTOCOL_TYPE in", values, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotIn(List<String> values) {
            addCriterion("PROTOCOL_TYPE not in", values, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeBetween(String value1, String value2) {
            addCriterion("PROTOCOL_TYPE between", value1, value2, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotBetween(String value1, String value2) {
            addCriterion("PROTOCOL_TYPE not between", value1, value2, "protocolType");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
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

        public Criteria andRiskLevelIsNull() {
            addCriterion("RISK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("RISK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(String value) {
            addCriterion("RISK_LEVEL =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(String value) {
            addCriterion("RISK_LEVEL <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(String value) {
            addCriterion("RISK_LEVEL >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_LEVEL >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(String value) {
            addCriterion("RISK_LEVEL <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(String value) {
            addCriterion("RISK_LEVEL <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLike(String value) {
            addCriterion("RISK_LEVEL like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotLike(String value) {
            addCriterion("RISK_LEVEL not like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<String> values) {
            addCriterion("RISK_LEVEL in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<String> values) {
            addCriterion("RISK_LEVEL not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(String value1, String value2) {
            addCriterion("RISK_LEVEL between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(String value1, String value2) {
            addCriterion("RISK_LEVEL not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentIsNull() {
            addCriterion("TERMOF_INVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentIsNotNull() {
            addCriterion("TERMOF_INVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentEqualTo(String value) {
            addCriterion("TERMOF_INVESTMENT =", value, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentNotEqualTo(String value) {
            addCriterion("TERMOF_INVESTMENT <>", value, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentGreaterThan(String value) {
            addCriterion("TERMOF_INVESTMENT >", value, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentGreaterThanOrEqualTo(String value) {
            addCriterion("TERMOF_INVESTMENT >=", value, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentLessThan(String value) {
            addCriterion("TERMOF_INVESTMENT <", value, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentLessThanOrEqualTo(String value) {
            addCriterion("TERMOF_INVESTMENT <=", value, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentLike(String value) {
            addCriterion("TERMOF_INVESTMENT like", value, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentNotLike(String value) {
            addCriterion("TERMOF_INVESTMENT not like", value, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentIn(List<String> values) {
            addCriterion("TERMOF_INVESTMENT in", values, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentNotIn(List<String> values) {
            addCriterion("TERMOF_INVESTMENT not in", values, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentBetween(String value1, String value2) {
            addCriterion("TERMOF_INVESTMENT between", value1, value2, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andTermofInvestmentNotBetween(String value1, String value2) {
            addCriterion("TERMOF_INVESTMENT not between", value1, value2, "termofInvestment");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeIsNull() {
            addCriterion("EXPECTED_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeIsNotNull() {
            addCriterion("EXPECTED_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeEqualTo(Object value) {
            addCriterion("EXPECTED_INCOME =", value, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeNotEqualTo(Object value) {
            addCriterion("EXPECTED_INCOME <>", value, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeGreaterThan(Object value) {
            addCriterion("EXPECTED_INCOME >", value, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeGreaterThanOrEqualTo(Object value) {
            addCriterion("EXPECTED_INCOME >=", value, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeLessThan(Object value) {
            addCriterion("EXPECTED_INCOME <", value, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeLessThanOrEqualTo(Object value) {
            addCriterion("EXPECTED_INCOME <=", value, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeIn(List<Object> values) {
            addCriterion("EXPECTED_INCOME in", values, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeNotIn(List<Object> values) {
            addCriterion("EXPECTED_INCOME not in", values, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeBetween(Object value1, Object value2) {
            addCriterion("EXPECTED_INCOME between", value1, value2, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andExpectedIncomeNotBetween(Object value1, Object value2) {
            addCriterion("EXPECTED_INCOME not between", value1, value2, "expectedIncome");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNull() {
            addCriterion("REPORT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("REPORT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(String value) {
            addCriterion("REPORT_STATUS =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(String value) {
            addCriterion("REPORT_STATUS <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(String value) {
            addCriterion("REPORT_STATUS >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_STATUS >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(String value) {
            addCriterion("REPORT_STATUS <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(String value) {
            addCriterion("REPORT_STATUS <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLike(String value) {
            addCriterion("REPORT_STATUS like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotLike(String value) {
            addCriterion("REPORT_STATUS not like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<String> values) {
            addCriterion("REPORT_STATUS in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<String> values) {
            addCriterion("REPORT_STATUS not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(String value1, String value2) {
            addCriterion("REPORT_STATUS between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(String value1, String value2) {
            addCriterion("REPORT_STATUS not between", value1, value2, "reportStatus");
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

        public Criteria andNetTradingIsNull() {
            addCriterion("NET_TRADING is null");
            return (Criteria) this;
        }

        public Criteria andNetTradingIsNotNull() {
            addCriterion("NET_TRADING is not null");
            return (Criteria) this;
        }

        public Criteria andNetTradingEqualTo(String value) {
            addCriterion("NET_TRADING =", value, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingNotEqualTo(String value) {
            addCriterion("NET_TRADING <>", value, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingGreaterThan(String value) {
            addCriterion("NET_TRADING >", value, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingGreaterThanOrEqualTo(String value) {
            addCriterion("NET_TRADING >=", value, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingLessThan(String value) {
            addCriterion("NET_TRADING <", value, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingLessThanOrEqualTo(String value) {
            addCriterion("NET_TRADING <=", value, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingLike(String value) {
            addCriterion("NET_TRADING like", value, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingNotLike(String value) {
            addCriterion("NET_TRADING not like", value, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingIn(List<String> values) {
            addCriterion("NET_TRADING in", values, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingNotIn(List<String> values) {
            addCriterion("NET_TRADING not in", values, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingBetween(String value1, String value2) {
            addCriterion("NET_TRADING between", value1, value2, "netTrading");
            return (Criteria) this;
        }

        public Criteria andNetTradingNotBetween(String value1, String value2) {
            addCriterion("NET_TRADING not between", value1, value2, "netTrading");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateIsNull() {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateIsNotNull() {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateEqualTo(String value) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE =", value, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateNotEqualTo(String value) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE <>", value, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateGreaterThan(String value) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE >", value, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateGreaterThanOrEqualTo(String value) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE >=", value, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateLessThan(String value) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE <", value, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateLessThanOrEqualTo(String value) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE <=", value, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateLike(String value) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE like", value, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateNotLike(String value) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE not like", value, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateIn(List<String> values) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE in", values, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateNotIn(List<String> values) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE not in", values, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateBetween(String value1, String value2) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE between", value1, value2, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andPerformanceProtocolSignDateNotBetween(String value1, String value2) {
            addCriterion("PERFORMANCE_PROTOCOL_SIGN_DATE not between", value1, value2, "performanceProtocolSignDate");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingIsNull() {
            addCriterion("CLASSIFICATION_RATING is null");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingIsNotNull() {
            addCriterion("CLASSIFICATION_RATING is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingEqualTo(String value) {
            addCriterion("CLASSIFICATION_RATING =", value, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingNotEqualTo(String value) {
            addCriterion("CLASSIFICATION_RATING <>", value, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingGreaterThan(String value) {
            addCriterion("CLASSIFICATION_RATING >", value, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSIFICATION_RATING >=", value, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingLessThan(String value) {
            addCriterion("CLASSIFICATION_RATING <", value, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingLessThanOrEqualTo(String value) {
            addCriterion("CLASSIFICATION_RATING <=", value, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingLike(String value) {
            addCriterion("CLASSIFICATION_RATING like", value, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingNotLike(String value) {
            addCriterion("CLASSIFICATION_RATING not like", value, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingIn(List<String> values) {
            addCriterion("CLASSIFICATION_RATING in", values, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingNotIn(List<String> values) {
            addCriterion("CLASSIFICATION_RATING not in", values, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingBetween(String value1, String value2) {
            addCriterion("CLASSIFICATION_RATING between", value1, value2, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andClassificationRatingNotBetween(String value1, String value2) {
            addCriterion("CLASSIFICATION_RATING not between", value1, value2, "classificationRating");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoIsNull() {
            addCriterion("SHAREHOLDER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoIsNotNull() {
            addCriterion("SHAREHOLDER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoEqualTo(String value) {
            addCriterion("SHAREHOLDER_INFO =", value, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoNotEqualTo(String value) {
            addCriterion("SHAREHOLDER_INFO <>", value, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoGreaterThan(String value) {
            addCriterion("SHAREHOLDER_INFO >", value, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoGreaterThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDER_INFO >=", value, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoLessThan(String value) {
            addCriterion("SHAREHOLDER_INFO <", value, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoLessThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDER_INFO <=", value, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoLike(String value) {
            addCriterion("SHAREHOLDER_INFO like", value, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoNotLike(String value) {
            addCriterion("SHAREHOLDER_INFO not like", value, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoIn(List<String> values) {
            addCriterion("SHAREHOLDER_INFO in", values, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoNotIn(List<String> values) {
            addCriterion("SHAREHOLDER_INFO not in", values, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoBetween(String value1, String value2) {
            addCriterion("SHAREHOLDER_INFO between", value1, value2, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andShareholderInfoNotBetween(String value1, String value2) {
            addCriterion("SHAREHOLDER_INFO not between", value1, value2, "shareholderInfo");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentIsNull() {
            addCriterion("HOST_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentIsNotNull() {
            addCriterion("HOST_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentEqualTo(String value) {
            addCriterion("HOST_DEPARTMENT =", value, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentNotEqualTo(String value) {
            addCriterion("HOST_DEPARTMENT <>", value, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentGreaterThan(String value) {
            addCriterion("HOST_DEPARTMENT >", value, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_DEPARTMENT >=", value, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentLessThan(String value) {
            addCriterion("HOST_DEPARTMENT <", value, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentLessThanOrEqualTo(String value) {
            addCriterion("HOST_DEPARTMENT <=", value, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentLike(String value) {
            addCriterion("HOST_DEPARTMENT like", value, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentNotLike(String value) {
            addCriterion("HOST_DEPARTMENT not like", value, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentIn(List<String> values) {
            addCriterion("HOST_DEPARTMENT in", values, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentNotIn(List<String> values) {
            addCriterion("HOST_DEPARTMENT not in", values, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentBetween(String value1, String value2) {
            addCriterion("HOST_DEPARTMENT between", value1, value2, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andHostDepartmentNotBetween(String value1, String value2) {
            addCriterion("HOST_DEPARTMENT not between", value1, value2, "hostDepartment");
            return (Criteria) this;
        }

        public Criteria andFaxTelIsNull() {
            addCriterion("FAX_TEL is null");
            return (Criteria) this;
        }

        public Criteria andFaxTelIsNotNull() {
            addCriterion("FAX_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andFaxTelEqualTo(String value) {
            addCriterion("FAX_TEL =", value, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelNotEqualTo(String value) {
            addCriterion("FAX_TEL <>", value, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelGreaterThan(String value) {
            addCriterion("FAX_TEL >", value, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelGreaterThanOrEqualTo(String value) {
            addCriterion("FAX_TEL >=", value, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelLessThan(String value) {
            addCriterion("FAX_TEL <", value, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelLessThanOrEqualTo(String value) {
            addCriterion("FAX_TEL <=", value, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelLike(String value) {
            addCriterion("FAX_TEL like", value, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelNotLike(String value) {
            addCriterion("FAX_TEL not like", value, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelIn(List<String> values) {
            addCriterion("FAX_TEL in", values, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelNotIn(List<String> values) {
            addCriterion("FAX_TEL not in", values, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelBetween(String value1, String value2) {
            addCriterion("FAX_TEL between", value1, value2, "faxTel");
            return (Criteria) this;
        }

        public Criteria andFaxTelNotBetween(String value1, String value2) {
            addCriterion("FAX_TEL not between", value1, value2, "faxTel");
            return (Criteria) this;
        }

        public Criteria andIsCreditedIsNull() {
            addCriterion("IS_CREDITED is null");
            return (Criteria) this;
        }

        public Criteria andIsCreditedIsNotNull() {
            addCriterion("IS_CREDITED is not null");
            return (Criteria) this;
        }

        public Criteria andIsCreditedEqualTo(String value) {
            addCriterion("IS_CREDITED =", value, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedNotEqualTo(String value) {
            addCriterion("IS_CREDITED <>", value, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedGreaterThan(String value) {
            addCriterion("IS_CREDITED >", value, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CREDITED >=", value, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedLessThan(String value) {
            addCriterion("IS_CREDITED <", value, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedLessThanOrEqualTo(String value) {
            addCriterion("IS_CREDITED <=", value, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedLike(String value) {
            addCriterion("IS_CREDITED like", value, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedNotLike(String value) {
            addCriterion("IS_CREDITED not like", value, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedIn(List<String> values) {
            addCriterion("IS_CREDITED in", values, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedNotIn(List<String> values) {
            addCriterion("IS_CREDITED not in", values, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedBetween(String value1, String value2) {
            addCriterion("IS_CREDITED between", value1, value2, "isCredited");
            return (Criteria) this;
        }

        public Criteria andIsCreditedNotBetween(String value1, String value2) {
            addCriterion("IS_CREDITED not between", value1, value2, "isCredited");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("UPDATER is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("UPDATER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("UPDATER =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("UPDATER <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("UPDATER >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("UPDATER <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("UPDATER <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("UPDATER like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("UPDATER not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("UPDATER in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("UPDATER not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("UPDATER between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("UPDATER not between", value1, value2, "updater");
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

        public Criteria andAmlRiskLevelIsNull() {
            addCriterion("AML_RISK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelIsNotNull() {
            addCriterion("AML_RISK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelEqualTo(String value) {
            addCriterion("AML_RISK_LEVEL =", value, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelNotEqualTo(String value) {
            addCriterion("AML_RISK_LEVEL <>", value, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelGreaterThan(String value) {
            addCriterion("AML_RISK_LEVEL >", value, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelGreaterThanOrEqualTo(String value) {
            addCriterion("AML_RISK_LEVEL >=", value, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelLessThan(String value) {
            addCriterion("AML_RISK_LEVEL <", value, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelLessThanOrEqualTo(String value) {
            addCriterion("AML_RISK_LEVEL <=", value, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelLike(String value) {
            addCriterion("AML_RISK_LEVEL like", value, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelNotLike(String value) {
            addCriterion("AML_RISK_LEVEL not like", value, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelIn(List<String> values) {
            addCriterion("AML_RISK_LEVEL in", values, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelNotIn(List<String> values) {
            addCriterion("AML_RISK_LEVEL not in", values, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelBetween(String value1, String value2) {
            addCriterion("AML_RISK_LEVEL between", value1, value2, "amlRiskLevel");
            return (Criteria) this;
        }

        public Criteria andAmlRiskLevelNotBetween(String value1, String value2) {
            addCriterion("AML_RISK_LEVEL not between", value1, value2, "amlRiskLevel");
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

        public Criteria andIsProdHolderIsNull() {
            addCriterion("IS_PROD_HOLDER is null");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderIsNotNull() {
            addCriterion("IS_PROD_HOLDER is not null");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderEqualTo(String value) {
            addCriterion("IS_PROD_HOLDER =", value, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderNotEqualTo(String value) {
            addCriterion("IS_PROD_HOLDER <>", value, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderGreaterThan(String value) {
            addCriterion("IS_PROD_HOLDER >", value, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PROD_HOLDER >=", value, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderLessThan(String value) {
            addCriterion("IS_PROD_HOLDER <", value, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderLessThanOrEqualTo(String value) {
            addCriterion("IS_PROD_HOLDER <=", value, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderLike(String value) {
            addCriterion("IS_PROD_HOLDER like", value, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderNotLike(String value) {
            addCriterion("IS_PROD_HOLDER not like", value, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderIn(List<String> values) {
            addCriterion("IS_PROD_HOLDER in", values, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderNotIn(List<String> values) {
            addCriterion("IS_PROD_HOLDER not in", values, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderBetween(String value1, String value2) {
            addCriterion("IS_PROD_HOLDER between", value1, value2, "isProdHolder");
            return (Criteria) this;
        }

        public Criteria andIsProdHolderNotBetween(String value1, String value2) {
            addCriterion("IS_PROD_HOLDER not between", value1, value2, "isProdHolder");
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

        public Criteria andClientQualifyReviewDesIsNull() {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES is null");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesIsNotNull() {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES is not null");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES =", value, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesNotEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES <>", value, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesGreaterThan(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES >", value, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES >=", value, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesLessThan(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES <", value, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES <=", value, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesLike(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES like", value, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesNotLike(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES not like", value, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesIn(List<String> values) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES in", values, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesNotIn(List<String> values) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES not in", values, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesBetween(String value1, String value2) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES between", value1, value2, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewDesNotBetween(String value1, String value2) {
            addCriterion("CLIENT_QUALIFY_REVIEW_DES not between", value1, value2, "clientQualifyReviewDes");
            return (Criteria) this;
        }

        public Criteria andClientLevelIsNull() {
            addCriterion("CLIENT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andClientLevelIsNotNull() {
            addCriterion("CLIENT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andClientLevelEqualTo(String value) {
            addCriterion("CLIENT_LEVEL =", value, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelNotEqualTo(String value) {
            addCriterion("CLIENT_LEVEL <>", value, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelGreaterThan(String value) {
            addCriterion("CLIENT_LEVEL >", value, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_LEVEL >=", value, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelLessThan(String value) {
            addCriterion("CLIENT_LEVEL <", value, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_LEVEL <=", value, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelLike(String value) {
            addCriterion("CLIENT_LEVEL like", value, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelNotLike(String value) {
            addCriterion("CLIENT_LEVEL not like", value, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelIn(List<String> values) {
            addCriterion("CLIENT_LEVEL in", values, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelNotIn(List<String> values) {
            addCriterion("CLIENT_LEVEL not in", values, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelBetween(String value1, String value2) {
            addCriterion("CLIENT_LEVEL between", value1, value2, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andClientLevelNotBetween(String value1, String value2) {
            addCriterion("CLIENT_LEVEL not between", value1, value2, "clientLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelIsNull() {
            addCriterion("ALLOW_OPTION_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelIsNotNull() {
            addCriterion("ALLOW_OPTION_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelEqualTo(String value) {
            addCriterion("ALLOW_OPTION_LEVEL =", value, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelNotEqualTo(String value) {
            addCriterion("ALLOW_OPTION_LEVEL <>", value, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelGreaterThan(String value) {
            addCriterion("ALLOW_OPTION_LEVEL >", value, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_OPTION_LEVEL >=", value, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelLessThan(String value) {
            addCriterion("ALLOW_OPTION_LEVEL <", value, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_OPTION_LEVEL <=", value, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelLike(String value) {
            addCriterion("ALLOW_OPTION_LEVEL like", value, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelNotLike(String value) {
            addCriterion("ALLOW_OPTION_LEVEL not like", value, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelIn(List<String> values) {
            addCriterion("ALLOW_OPTION_LEVEL in", values, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelNotIn(List<String> values) {
            addCriterion("ALLOW_OPTION_LEVEL not in", values, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelBetween(String value1, String value2) {
            addCriterion("ALLOW_OPTION_LEVEL between", value1, value2, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andAllowOptionLevelNotBetween(String value1, String value2) {
            addCriterion("ALLOW_OPTION_LEVEL not between", value1, value2, "allowOptionLevel");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("DELETE_FLAG like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("DELETE_FLAG not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdIsNull() {
            addCriterion("MASTER_AGREEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdIsNotNull() {
            addCriterion("MASTER_AGREEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_ID =", value, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdNotEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_ID <>", value, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdGreaterThan(String value) {
            addCriterion("MASTER_AGREEMENT_ID >", value, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdGreaterThanOrEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_ID >=", value, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdLessThan(String value) {
            addCriterion("MASTER_AGREEMENT_ID <", value, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdLessThanOrEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_ID <=", value, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdLike(String value) {
            addCriterion("MASTER_AGREEMENT_ID like", value, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdNotLike(String value) {
            addCriterion("MASTER_AGREEMENT_ID not like", value, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdIn(List<String> values) {
            addCriterion("MASTER_AGREEMENT_ID in", values, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdNotIn(List<String> values) {
            addCriterion("MASTER_AGREEMENT_ID not in", values, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBetween(String value1, String value2) {
            addCriterion("MASTER_AGREEMENT_ID between", value1, value2, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdNotBetween(String value1, String value2) {
            addCriterion("MASTER_AGREEMENT_ID not between", value1, value2, "masterAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdIsNull() {
            addCriterion("SUPPLEMENT_AGREEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdIsNotNull() {
            addCriterion("SUPPLEMENT_AGREEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID =", value, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdNotEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID <>", value, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdGreaterThan(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID >", value, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID >=", value, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdLessThan(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID <", value, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID <=", value, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdLike(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID like", value, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdNotLike(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID not like", value, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdIn(List<String> values) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID in", values, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdNotIn(List<String> values) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID not in", values, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBetween(String value1, String value2) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID between", value1, value2, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID not between", value1, value2, "supplementAgreementId");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNull() {
            addCriterion("VALID_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNotNull() {
            addCriterion("VALID_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValidFlagEqualTo(String value) {
            addCriterion("VALID_FLAG =", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotEqualTo(String value) {
            addCriterion("VALID_FLAG <>", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThan(String value) {
            addCriterion("VALID_FLAG >", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_FLAG >=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThan(String value) {
            addCriterion("VALID_FLAG <", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThanOrEqualTo(String value) {
            addCriterion("VALID_FLAG <=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLike(String value) {
            addCriterion("VALID_FLAG like", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotLike(String value) {
            addCriterion("VALID_FLAG not like", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagIn(List<String> values) {
            addCriterion("VALID_FLAG in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotIn(List<String> values) {
            addCriterion("VALID_FLAG not in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagBetween(String value1, String value2) {
            addCriterion("VALID_FLAG between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotBetween(String value1, String value2) {
            addCriterion("VALID_FLAG not between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNull() {
            addCriterion("INVALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNotNull() {
            addCriterion("INVALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateEqualTo(Date value) {
            addCriterion("INVALID_DATE =", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotEqualTo(Date value) {
            addCriterion("INVALID_DATE <>", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThan(Date value) {
            addCriterion("INVALID_DATE >", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVALID_DATE >=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThan(Date value) {
            addCriterion("INVALID_DATE <", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThanOrEqualTo(Date value) {
            addCriterion("INVALID_DATE <=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIn(List<Date> values) {
            addCriterion("INVALID_DATE in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotIn(List<Date> values) {
            addCriterion("INVALID_DATE not in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateBetween(Date value1, Date value2) {
            addCriterion("INVALID_DATE between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotBetween(Date value1, Date value2) {
            addCriterion("INVALID_DATE not between", value1, value2, "invalidDate");
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

        public Criteria andProdCodeIsNull() {
            addCriterion("PROD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProdCodeIsNotNull() {
            addCriterion("PROD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodeEqualTo(String value) {
            addCriterion("PROD_CODE =", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotEqualTo(String value) {
            addCriterion("PROD_CODE <>", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThan(String value) {
            addCriterion("PROD_CODE >", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_CODE >=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThan(String value) {
            addCriterion("PROD_CODE <", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThanOrEqualTo(String value) {
            addCriterion("PROD_CODE <=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLike(String value) {
            addCriterion("PROD_CODE like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotLike(String value) {
            addCriterion("PROD_CODE not like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeIn(List<String> values) {
            addCriterion("PROD_CODE in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotIn(List<String> values) {
            addCriterion("PROD_CODE not in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeBetween(String value1, String value2) {
            addCriterion("PROD_CODE between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotBetween(String value1, String value2) {
            addCriterion("PROD_CODE not between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameIsNull() {
            addCriterion("ADVISOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameIsNotNull() {
            addCriterion("ADVISOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameEqualTo(String value) {
            addCriterion("ADVISOR_NAME =", value, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameNotEqualTo(String value) {
            addCriterion("ADVISOR_NAME <>", value, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameGreaterThan(String value) {
            addCriterion("ADVISOR_NAME >", value, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISOR_NAME >=", value, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameLessThan(String value) {
            addCriterion("ADVISOR_NAME <", value, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameLessThanOrEqualTo(String value) {
            addCriterion("ADVISOR_NAME <=", value, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameLike(String value) {
            addCriterion("ADVISOR_NAME like", value, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameNotLike(String value) {
            addCriterion("ADVISOR_NAME not like", value, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameIn(List<String> values) {
            addCriterion("ADVISOR_NAME in", values, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameNotIn(List<String> values) {
            addCriterion("ADVISOR_NAME not in", values, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameBetween(String value1, String value2) {
            addCriterion("ADVISOR_NAME between", value1, value2, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorNameNotBetween(String value1, String value2) {
            addCriterion("ADVISOR_NAME not between", value1, value2, "advisorName");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeIsNull() {
            addCriterion("ADVISOR_CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeIsNotNull() {
            addCriterion("ADVISOR_CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeEqualTo(String value) {
            addCriterion("ADVISOR_CERT_TYPE =", value, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeNotEqualTo(String value) {
            addCriterion("ADVISOR_CERT_TYPE <>", value, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeGreaterThan(String value) {
            addCriterion("ADVISOR_CERT_TYPE >", value, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISOR_CERT_TYPE >=", value, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeLessThan(String value) {
            addCriterion("ADVISOR_CERT_TYPE <", value, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeLessThanOrEqualTo(String value) {
            addCriterion("ADVISOR_CERT_TYPE <=", value, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeLike(String value) {
            addCriterion("ADVISOR_CERT_TYPE like", value, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeNotLike(String value) {
            addCriterion("ADVISOR_CERT_TYPE not like", value, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeIn(List<String> values) {
            addCriterion("ADVISOR_CERT_TYPE in", values, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeNotIn(List<String> values) {
            addCriterion("ADVISOR_CERT_TYPE not in", values, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeBetween(String value1, String value2) {
            addCriterion("ADVISOR_CERT_TYPE between", value1, value2, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertTypeNotBetween(String value1, String value2) {
            addCriterion("ADVISOR_CERT_TYPE not between", value1, value2, "advisorCertType");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoIsNull() {
            addCriterion("ADVISOR_CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoIsNotNull() {
            addCriterion("ADVISOR_CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoEqualTo(String value) {
            addCriterion("ADVISOR_CERT_NO =", value, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoNotEqualTo(String value) {
            addCriterion("ADVISOR_CERT_NO <>", value, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoGreaterThan(String value) {
            addCriterion("ADVISOR_CERT_NO >", value, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISOR_CERT_NO >=", value, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoLessThan(String value) {
            addCriterion("ADVISOR_CERT_NO <", value, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoLessThanOrEqualTo(String value) {
            addCriterion("ADVISOR_CERT_NO <=", value, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoLike(String value) {
            addCriterion("ADVISOR_CERT_NO like", value, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoNotLike(String value) {
            addCriterion("ADVISOR_CERT_NO not like", value, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoIn(List<String> values) {
            addCriterion("ADVISOR_CERT_NO in", values, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoNotIn(List<String> values) {
            addCriterion("ADVISOR_CERT_NO not in", values, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoBetween(String value1, String value2) {
            addCriterion("ADVISOR_CERT_NO between", value1, value2, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andAdvisorCertNoNotBetween(String value1, String value2) {
            addCriterion("ADVISOR_CERT_NO not between", value1, value2, "advisorCertNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoIsNull() {
            addCriterion("ECIF_CUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoIsNotNull() {
            addCriterion("ECIF_CUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoEqualTo(String value) {
            addCriterion("ECIF_CUST_NO =", value, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoNotEqualTo(String value) {
            addCriterion("ECIF_CUST_NO <>", value, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoGreaterThan(String value) {
            addCriterion("ECIF_CUST_NO >", value, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("ECIF_CUST_NO >=", value, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoLessThan(String value) {
            addCriterion("ECIF_CUST_NO <", value, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoLessThanOrEqualTo(String value) {
            addCriterion("ECIF_CUST_NO <=", value, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoLike(String value) {
            addCriterion("ECIF_CUST_NO like", value, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoNotLike(String value) {
            addCriterion("ECIF_CUST_NO not like", value, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoIn(List<String> values) {
            addCriterion("ECIF_CUST_NO in", values, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoNotIn(List<String> values) {
            addCriterion("ECIF_CUST_NO not in", values, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoBetween(String value1, String value2) {
            addCriterion("ECIF_CUST_NO between", value1, value2, "ecifCustNo");
            return (Criteria) this;
        }

        public Criteria andEcifCustNoNotBetween(String value1, String value2) {
            addCriterion("ECIF_CUST_NO not between", value1, value2, "ecifCustNo");
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

        public Criteria andReturnVisitDateIsNull() {
            addCriterion("RETURN_VISIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateIsNotNull() {
            addCriterion("RETURN_VISIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateEqualTo(Date value) {
            addCriterion("RETURN_VISIT_DATE =", value, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateNotEqualTo(Date value) {
            addCriterion("RETURN_VISIT_DATE <>", value, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateGreaterThan(Date value) {
            addCriterion("RETURN_VISIT_DATE >", value, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RETURN_VISIT_DATE >=", value, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateLessThan(Date value) {
            addCriterion("RETURN_VISIT_DATE <", value, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateLessThanOrEqualTo(Date value) {
            addCriterion("RETURN_VISIT_DATE <=", value, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateIn(List<Date> values) {
            addCriterion("RETURN_VISIT_DATE in", values, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateNotIn(List<Date> values) {
            addCriterion("RETURN_VISIT_DATE not in", values, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateBetween(Date value1, Date value2) {
            addCriterion("RETURN_VISIT_DATE between", value1, value2, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDateNotBetween(Date value1, Date value2) {
            addCriterion("RETURN_VISIT_DATE not between", value1, value2, "returnVisitDate");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusIsNull() {
            addCriterion("RETURN_VISIT_DATA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusIsNotNull() {
            addCriterion("RETURN_VISIT_DATA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusEqualTo(String value) {
            addCriterion("RETURN_VISIT_DATA_STATUS =", value, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusNotEqualTo(String value) {
            addCriterion("RETURN_VISIT_DATA_STATUS <>", value, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusGreaterThan(String value) {
            addCriterion("RETURN_VISIT_DATA_STATUS >", value, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_VISIT_DATA_STATUS >=", value, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusLessThan(String value) {
            addCriterion("RETURN_VISIT_DATA_STATUS <", value, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusLessThanOrEqualTo(String value) {
            addCriterion("RETURN_VISIT_DATA_STATUS <=", value, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusLike(String value) {
            addCriterion("RETURN_VISIT_DATA_STATUS like", value, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusNotLike(String value) {
            addCriterion("RETURN_VISIT_DATA_STATUS not like", value, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusIn(List<String> values) {
            addCriterion("RETURN_VISIT_DATA_STATUS in", values, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusNotIn(List<String> values) {
            addCriterion("RETURN_VISIT_DATA_STATUS not in", values, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusBetween(String value1, String value2) {
            addCriterion("RETURN_VISIT_DATA_STATUS between", value1, value2, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitDataStatusNotBetween(String value1, String value2) {
            addCriterion("RETURN_VISIT_DATA_STATUS not between", value1, value2, "returnVisitDataStatus");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioIsNull() {
            addCriterion("EXTRAN_PROSCALE_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioIsNotNull() {
            addCriterion("EXTRAN_PROSCALE_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioEqualTo(Short value) {
            addCriterion("EXTRAN_PROSCALE_RATIO =", value, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioNotEqualTo(Short value) {
            addCriterion("EXTRAN_PROSCALE_RATIO <>", value, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioGreaterThan(Short value) {
            addCriterion("EXTRAN_PROSCALE_RATIO >", value, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioGreaterThanOrEqualTo(Short value) {
            addCriterion("EXTRAN_PROSCALE_RATIO >=", value, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioLessThan(Short value) {
            addCriterion("EXTRAN_PROSCALE_RATIO <", value, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioLessThanOrEqualTo(Short value) {
            addCriterion("EXTRAN_PROSCALE_RATIO <=", value, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioIn(List<Short> values) {
            addCriterion("EXTRAN_PROSCALE_RATIO in", values, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioNotIn(List<Short> values) {
            addCriterion("EXTRAN_PROSCALE_RATIO not in", values, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioBetween(Short value1, Short value2) {
            addCriterion("EXTRAN_PROSCALE_RATIO between", value1, value2, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andExtranProscaleRatioNotBetween(Short value1, Short value2) {
            addCriterion("EXTRAN_PROSCALE_RATIO not between", value1, value2, "extranProscaleRatio");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceIsNull() {
            addCriterion("MARGIN_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceIsNotNull() {
            addCriterion("MARGIN_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceEqualTo(Short value) {
            addCriterion("MARGIN_BALANCE =", value, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceNotEqualTo(Short value) {
            addCriterion("MARGIN_BALANCE <>", value, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceGreaterThan(Short value) {
            addCriterion("MARGIN_BALANCE >", value, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceGreaterThanOrEqualTo(Short value) {
            addCriterion("MARGIN_BALANCE >=", value, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceLessThan(Short value) {
            addCriterion("MARGIN_BALANCE <", value, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceLessThanOrEqualTo(Short value) {
            addCriterion("MARGIN_BALANCE <=", value, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceIn(List<Short> values) {
            addCriterion("MARGIN_BALANCE in", values, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceNotIn(List<Short> values) {
            addCriterion("MARGIN_BALANCE not in", values, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceBetween(Short value1, Short value2) {
            addCriterion("MARGIN_BALANCE between", value1, value2, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andMarginBalanceNotBetween(Short value1, Short value2) {
            addCriterion("MARGIN_BALANCE not between", value1, value2, "marginBalance");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateIsNull() {
            addCriterion("PRODUCT_ESTAB_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateIsNotNull() {
            addCriterion("PRODUCT_ESTAB_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateEqualTo(Date value) {
            addCriterion("PRODUCT_ESTAB_DATE =", value, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateNotEqualTo(Date value) {
            addCriterion("PRODUCT_ESTAB_DATE <>", value, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateGreaterThan(Date value) {
            addCriterion("PRODUCT_ESTAB_DATE >", value, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRODUCT_ESTAB_DATE >=", value, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateLessThan(Date value) {
            addCriterion("PRODUCT_ESTAB_DATE <", value, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateLessThanOrEqualTo(Date value) {
            addCriterion("PRODUCT_ESTAB_DATE <=", value, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateIn(List<Date> values) {
            addCriterion("PRODUCT_ESTAB_DATE in", values, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateNotIn(List<Date> values) {
            addCriterion("PRODUCT_ESTAB_DATE not in", values, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateBetween(Date value1, Date value2) {
            addCriterion("PRODUCT_ESTAB_DATE between", value1, value2, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andProductEstabDateNotBetween(Date value1, Date value2) {
            addCriterion("PRODUCT_ESTAB_DATE not between", value1, value2, "productEstabDate");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountIsNull() {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountIsNotNull() {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountEqualTo(Short value) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT =", value, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountNotEqualTo(Short value) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT <>", value, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountGreaterThan(Short value) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT >", value, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT >=", value, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountLessThan(Short value) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT <", value, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountLessThanOrEqualTo(Short value) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT <=", value, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountIn(List<Short> values) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT in", values, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountNotIn(List<Short> values) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT not in", values, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountBetween(Short value1, Short value2) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT between", value1, value2, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeMinTransferAmountNotBetween(Short value1, Short value2) {
            addCriterion("PAYEE_MIN_TRANSFER_AMOUNT not between", value1, value2, "payeeMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountIsNull() {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountIsNotNull() {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountEqualTo(Short value) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT =", value, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountNotEqualTo(Short value) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT <>", value, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountGreaterThan(Short value) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT >", value, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT >=", value, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountLessThan(Short value) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT <", value, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountLessThanOrEqualTo(Short value) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT <=", value, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountIn(List<Short> values) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT in", values, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountNotIn(List<Short> values) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT not in", values, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountBetween(Short value1, Short value2) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT between", value1, value2, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andPayerMinTransferAmountNotBetween(Short value1, Short value2) {
            addCriterion("PAYER_MIN_TRANSFER_AMOUNT not between", value1, value2, "payerMinTransferAmount");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientIsNull() {
            addCriterion("CLIENT_COEFFICIENT is null");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientIsNotNull() {
            addCriterion("CLIENT_COEFFICIENT is not null");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientEqualTo(Short value) {
            addCriterion("CLIENT_COEFFICIENT =", value, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientNotEqualTo(Short value) {
            addCriterion("CLIENT_COEFFICIENT <>", value, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientGreaterThan(Short value) {
            addCriterion("CLIENT_COEFFICIENT >", value, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientGreaterThanOrEqualTo(Short value) {
            addCriterion("CLIENT_COEFFICIENT >=", value, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientLessThan(Short value) {
            addCriterion("CLIENT_COEFFICIENT <", value, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientLessThanOrEqualTo(Short value) {
            addCriterion("CLIENT_COEFFICIENT <=", value, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientIn(List<Short> values) {
            addCriterion("CLIENT_COEFFICIENT in", values, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientNotIn(List<Short> values) {
            addCriterion("CLIENT_COEFFICIENT not in", values, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientBetween(Short value1, Short value2) {
            addCriterion("CLIENT_COEFFICIENT between", value1, value2, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andClientCoefficientNotBetween(Short value1, Short value2) {
            addCriterion("CLIENT_COEFFICIENT not between", value1, value2, "clientCoefficient");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("OP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("OP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(String value) {
            addCriterion("OP_TYPE =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(String value) {
            addCriterion("OP_TYPE <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(String value) {
            addCriterion("OP_TYPE >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OP_TYPE >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(String value) {
            addCriterion("OP_TYPE <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(String value) {
            addCriterion("OP_TYPE <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLike(String value) {
            addCriterion("OP_TYPE like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotLike(String value) {
            addCriterion("OP_TYPE not like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<String> values) {
            addCriterion("OP_TYPE in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<String> values) {
            addCriterion("OP_TYPE not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(String value1, String value2) {
            addCriterion("OP_TYPE between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(String value1, String value2) {
            addCriterion("OP_TYPE not between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceIsNull() {
            addCriterion("PUT_TAKE_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceIsNotNull() {
            addCriterion("PUT_TAKE_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceEqualTo(Short value) {
            addCriterion("PUT_TAKE_BALANCE =", value, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceNotEqualTo(Short value) {
            addCriterion("PUT_TAKE_BALANCE <>", value, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceGreaterThan(Short value) {
            addCriterion("PUT_TAKE_BALANCE >", value, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceGreaterThanOrEqualTo(Short value) {
            addCriterion("PUT_TAKE_BALANCE >=", value, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceLessThan(Short value) {
            addCriterion("PUT_TAKE_BALANCE <", value, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceLessThanOrEqualTo(Short value) {
            addCriterion("PUT_TAKE_BALANCE <=", value, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceIn(List<Short> values) {
            addCriterion("PUT_TAKE_BALANCE in", values, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceNotIn(List<Short> values) {
            addCriterion("PUT_TAKE_BALANCE not in", values, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceBetween(Short value1, Short value2) {
            addCriterion("PUT_TAKE_BALANCE between", value1, value2, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andPutTakeBalanceNotBetween(Short value1, Short value2) {
            addCriterion("PUT_TAKE_BALANCE not between", value1, value2, "putTakeBalance");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdIsNull() {
            addCriterion("GUARANTEE_AGREEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdIsNotNull() {
            addCriterion("GUARANTEE_AGREEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdEqualTo(String value) {
            addCriterion("GUARANTEE_AGREEMENT_ID =", value, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdNotEqualTo(String value) {
            addCriterion("GUARANTEE_AGREEMENT_ID <>", value, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdGreaterThan(String value) {
            addCriterion("GUARANTEE_AGREEMENT_ID >", value, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEE_AGREEMENT_ID >=", value, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdLessThan(String value) {
            addCriterion("GUARANTEE_AGREEMENT_ID <", value, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEE_AGREEMENT_ID <=", value, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdLike(String value) {
            addCriterion("GUARANTEE_AGREEMENT_ID like", value, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdNotLike(String value) {
            addCriterion("GUARANTEE_AGREEMENT_ID not like", value, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdIn(List<String> values) {
            addCriterion("GUARANTEE_AGREEMENT_ID in", values, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdNotIn(List<String> values) {
            addCriterion("GUARANTEE_AGREEMENT_ID not in", values, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdBetween(String value1, String value2) {
            addCriterion("GUARANTEE_AGREEMENT_ID between", value1, value2, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgreementIdNotBetween(String value1, String value2) {
            addCriterion("GUARANTEE_AGREEMENT_ID not between", value1, value2, "guaranteeAgreementId");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionIsNull() {
            addCriterion("EXECUTE_PRICE_PRECISION is null");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionIsNotNull() {
            addCriterion("EXECUTE_PRICE_PRECISION is not null");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionEqualTo(Short value) {
            addCriterion("EXECUTE_PRICE_PRECISION =", value, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionNotEqualTo(Short value) {
            addCriterion("EXECUTE_PRICE_PRECISION <>", value, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionGreaterThan(Short value) {
            addCriterion("EXECUTE_PRICE_PRECISION >", value, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionGreaterThanOrEqualTo(Short value) {
            addCriterion("EXECUTE_PRICE_PRECISION >=", value, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionLessThan(Short value) {
            addCriterion("EXECUTE_PRICE_PRECISION <", value, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionLessThanOrEqualTo(Short value) {
            addCriterion("EXECUTE_PRICE_PRECISION <=", value, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionIn(List<Short> values) {
            addCriterion("EXECUTE_PRICE_PRECISION in", values, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionNotIn(List<Short> values) {
            addCriterion("EXECUTE_PRICE_PRECISION not in", values, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionBetween(Short value1, Short value2) {
            addCriterion("EXECUTE_PRICE_PRECISION between", value1, value2, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andExecutePricePrecisionNotBetween(Short value1, Short value2) {
            addCriterion("EXECUTE_PRICE_PRECISION not between", value1, value2, "executePricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionIsNull() {
            addCriterion("BLOCK_PRICE_PRECISION is null");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionIsNotNull() {
            addCriterion("BLOCK_PRICE_PRECISION is not null");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionEqualTo(Short value) {
            addCriterion("BLOCK_PRICE_PRECISION =", value, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionNotEqualTo(Short value) {
            addCriterion("BLOCK_PRICE_PRECISION <>", value, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionGreaterThan(Short value) {
            addCriterion("BLOCK_PRICE_PRECISION >", value, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionGreaterThanOrEqualTo(Short value) {
            addCriterion("BLOCK_PRICE_PRECISION >=", value, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionLessThan(Short value) {
            addCriterion("BLOCK_PRICE_PRECISION <", value, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionLessThanOrEqualTo(Short value) {
            addCriterion("BLOCK_PRICE_PRECISION <=", value, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionIn(List<Short> values) {
            addCriterion("BLOCK_PRICE_PRECISION in", values, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionNotIn(List<Short> values) {
            addCriterion("BLOCK_PRICE_PRECISION not in", values, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionBetween(Short value1, Short value2) {
            addCriterion("BLOCK_PRICE_PRECISION between", value1, value2, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andBlockPricePrecisionNotBetween(Short value1, Short value2) {
            addCriterion("BLOCK_PRICE_PRECISION not between", value1, value2, "blockPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionIsNull() {
            addCriterion("INITIAL_PRICE_PRECISION is null");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionIsNotNull() {
            addCriterion("INITIAL_PRICE_PRECISION is not null");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionEqualTo(Short value) {
            addCriterion("INITIAL_PRICE_PRECISION =", value, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionNotEqualTo(Short value) {
            addCriterion("INITIAL_PRICE_PRECISION <>", value, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionGreaterThan(Short value) {
            addCriterion("INITIAL_PRICE_PRECISION >", value, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionGreaterThanOrEqualTo(Short value) {
            addCriterion("INITIAL_PRICE_PRECISION >=", value, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionLessThan(Short value) {
            addCriterion("INITIAL_PRICE_PRECISION <", value, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionLessThanOrEqualTo(Short value) {
            addCriterion("INITIAL_PRICE_PRECISION <=", value, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionIn(List<Short> values) {
            addCriterion("INITIAL_PRICE_PRECISION in", values, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionNotIn(List<Short> values) {
            addCriterion("INITIAL_PRICE_PRECISION not in", values, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionBetween(Short value1, Short value2) {
            addCriterion("INITIAL_PRICE_PRECISION between", value1, value2, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andInitialPricePrecisionNotBetween(Short value1, Short value2) {
            addCriterion("INITIAL_PRICE_PRECISION not between", value1, value2, "initialPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionIsNull() {
            addCriterion("FINAL_PRICE_PRECISION is null");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionIsNotNull() {
            addCriterion("FINAL_PRICE_PRECISION is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionEqualTo(Short value) {
            addCriterion("FINAL_PRICE_PRECISION =", value, "finalPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionNotEqualTo(Short value) {
            addCriterion("FINAL_PRICE_PRECISION <>", value, "finalPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionGreaterThan(Short value) {
            addCriterion("FINAL_PRICE_PRECISION >", value, "finalPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionGreaterThanOrEqualTo(Short value) {
            addCriterion("FINAL_PRICE_PRECISION >=", value, "finalPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionLessThan(Short value) {
            addCriterion("FINAL_PRICE_PRECISION <", value, "finalPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionLessThanOrEqualTo(Short value) {
            addCriterion("FINAL_PRICE_PRECISION <=", value, "finalPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionIn(List<Short> values) {
            addCriterion("FINAL_PRICE_PRECISION in", values, "finalPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionNotIn(List<Short> values) {
            addCriterion("FINAL_PRICE_PRECISION not in", values, "finalPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionBetween(Short value1, Short value2) {
            addCriterion("FINAL_PRICE_PRECISION between", value1, value2, "finalPricePrecision");
            return (Criteria) this;
        }

        public Criteria andFinalPricePrecisionNotBetween(Short value1, Short value2) {
            addCriterion("FINAL_PRICE_PRECISION not between", value1, value2, "finalPricePrecision");
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

        public Criteria andJobIdIsNull() {
            addCriterion("JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(String value) {
            addCriterion("JOB_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(String value) {
            addCriterion("JOB_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(String value) {
            addCriterion("JOB_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(String value) {
            addCriterion("JOB_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(String value) {
            addCriterion("JOB_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLike(String value) {
            addCriterion("JOB_ID like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotLike(String value) {
            addCriterion("JOB_ID not like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<String> values) {
            addCriterion("JOB_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<String> values) {
            addCriterion("JOB_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(String value1, String value2) {
            addCriterion("JOB_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(String value1, String value2) {
            addCriterion("JOB_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakIsNull() {
            addCriterion("AUDIT_STATUS_BAK is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakIsNotNull() {
            addCriterion("AUDIT_STATUS_BAK is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakEqualTo(String value) {
            addCriterion("AUDIT_STATUS_BAK =", value, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakNotEqualTo(String value) {
            addCriterion("AUDIT_STATUS_BAK <>", value, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakGreaterThan(String value) {
            addCriterion("AUDIT_STATUS_BAK >", value, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS_BAK >=", value, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakLessThan(String value) {
            addCriterion("AUDIT_STATUS_BAK <", value, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS_BAK <=", value, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakLike(String value) {
            addCriterion("AUDIT_STATUS_BAK like", value, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakNotLike(String value) {
            addCriterion("AUDIT_STATUS_BAK not like", value, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakIn(List<String> values) {
            addCriterion("AUDIT_STATUS_BAK in", values, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakNotIn(List<String> values) {
            addCriterion("AUDIT_STATUS_BAK not in", values, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS_BAK between", value1, value2, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBakNotBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS_BAK not between", value1, value2, "auditStatusBak");
            return (Criteria) this;
        }

        public Criteria andStampCountIsNull() {
            addCriterion("STAMP_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andStampCountIsNotNull() {
            addCriterion("STAMP_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andStampCountEqualTo(Long value) {
            addCriterion("STAMP_COUNT =", value, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampCountNotEqualTo(Long value) {
            addCriterion("STAMP_COUNT <>", value, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampCountGreaterThan(Long value) {
            addCriterion("STAMP_COUNT >", value, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampCountGreaterThanOrEqualTo(Long value) {
            addCriterion("STAMP_COUNT >=", value, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampCountLessThan(Long value) {
            addCriterion("STAMP_COUNT <", value, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampCountLessThanOrEqualTo(Long value) {
            addCriterion("STAMP_COUNT <=", value, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampCountIn(List<Long> values) {
            addCriterion("STAMP_COUNT in", values, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampCountNotIn(List<Long> values) {
            addCriterion("STAMP_COUNT not in", values, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampCountBetween(Long value1, Long value2) {
            addCriterion("STAMP_COUNT between", value1, value2, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampCountNotBetween(Long value1, Long value2) {
            addCriterion("STAMP_COUNT not between", value1, value2, "stampCount");
            return (Criteria) this;
        }

        public Criteria andStampNameIsNull() {
            addCriterion("STAMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStampNameIsNotNull() {
            addCriterion("STAMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStampNameEqualTo(String value) {
            addCriterion("STAMP_NAME =", value, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameNotEqualTo(String value) {
            addCriterion("STAMP_NAME <>", value, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameGreaterThan(String value) {
            addCriterion("STAMP_NAME >", value, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameGreaterThanOrEqualTo(String value) {
            addCriterion("STAMP_NAME >=", value, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameLessThan(String value) {
            addCriterion("STAMP_NAME <", value, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameLessThanOrEqualTo(String value) {
            addCriterion("STAMP_NAME <=", value, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameLike(String value) {
            addCriterion("STAMP_NAME like", value, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameNotLike(String value) {
            addCriterion("STAMP_NAME not like", value, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameIn(List<String> values) {
            addCriterion("STAMP_NAME in", values, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameNotIn(List<String> values) {
            addCriterion("STAMP_NAME not in", values, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameBetween(String value1, String value2) {
            addCriterion("STAMP_NAME between", value1, value2, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampNameNotBetween(String value1, String value2) {
            addCriterion("STAMP_NAME not between", value1, value2, "stampName");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagIsNull() {
            addCriterion("STAMP_FIRST_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagIsNotNull() {
            addCriterion("STAMP_FIRST_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagEqualTo(String value) {
            addCriterion("STAMP_FIRST_FLAG =", value, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagNotEqualTo(String value) {
            addCriterion("STAMP_FIRST_FLAG <>", value, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagGreaterThan(String value) {
            addCriterion("STAMP_FIRST_FLAG >", value, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagGreaterThanOrEqualTo(String value) {
            addCriterion("STAMP_FIRST_FLAG >=", value, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagLessThan(String value) {
            addCriterion("STAMP_FIRST_FLAG <", value, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagLessThanOrEqualTo(String value) {
            addCriterion("STAMP_FIRST_FLAG <=", value, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagLike(String value) {
            addCriterion("STAMP_FIRST_FLAG like", value, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagNotLike(String value) {
            addCriterion("STAMP_FIRST_FLAG not like", value, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagIn(List<String> values) {
            addCriterion("STAMP_FIRST_FLAG in", values, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagNotIn(List<String> values) {
            addCriterion("STAMP_FIRST_FLAG not in", values, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagBetween(String value1, String value2) {
            addCriterion("STAMP_FIRST_FLAG between", value1, value2, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andStampFirstFlagNotBetween(String value1, String value2) {
            addCriterion("STAMP_FIRST_FLAG not between", value1, value2, "stampFirstFlag");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothIsNull() {
            addCriterion("MASTER_AGREEMENT_ID_BOTH is null");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothIsNotNull() {
            addCriterion("MASTER_AGREEMENT_ID_BOTH is not null");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH =", value, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothNotEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH <>", value, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothGreaterThan(String value) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH >", value, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothGreaterThanOrEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH >=", value, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothLessThan(String value) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH <", value, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothLessThanOrEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH <=", value, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothLike(String value) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH like", value, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothNotLike(String value) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH not like", value, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothIn(List<String> values) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH in", values, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothNotIn(List<String> values) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH not in", values, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothBetween(String value1, String value2) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH between", value1, value2, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementIdBothNotBetween(String value1, String value2) {
            addCriterion("MASTER_AGREEMENT_ID_BOTH not between", value1, value2, "masterAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothIsNull() {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH is null");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothIsNotNull() {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH =", value, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothNotEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH <>", value, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothGreaterThan(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH >", value, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH >=", value, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothLessThan(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH <", value, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothLessThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH <=", value, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothLike(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH like", value, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothNotLike(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH not like", value, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothIn(List<String> values) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH in", values, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothNotIn(List<String> values) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH not in", values, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothBetween(String value1, String value2) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH between", value1, value2, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementIdBothNotBetween(String value1, String value2) {
            addCriterion("SUPPLEMENT_AGREEMENT_ID_BOTH not between", value1, value2, "supplementAgreementIdBoth");
            return (Criteria) this;
        }

        public Criteria andFillRoleIsNull() {
            addCriterion("FILL_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andFillRoleIsNotNull() {
            addCriterion("FILL_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andFillRoleEqualTo(String value) {
            addCriterion("FILL_ROLE =", value, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleNotEqualTo(String value) {
            addCriterion("FILL_ROLE <>", value, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleGreaterThan(String value) {
            addCriterion("FILL_ROLE >", value, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleGreaterThanOrEqualTo(String value) {
            addCriterion("FILL_ROLE >=", value, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleLessThan(String value) {
            addCriterion("FILL_ROLE <", value, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleLessThanOrEqualTo(String value) {
            addCriterion("FILL_ROLE <=", value, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleLike(String value) {
            addCriterion("FILL_ROLE like", value, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleNotLike(String value) {
            addCriterion("FILL_ROLE not like", value, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleIn(List<String> values) {
            addCriterion("FILL_ROLE in", values, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleNotIn(List<String> values) {
            addCriterion("FILL_ROLE not in", values, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleBetween(String value1, String value2) {
            addCriterion("FILL_ROLE between", value1, value2, "fillRole");
            return (Criteria) this;
        }

        public Criteria andFillRoleNotBetween(String value1, String value2) {
            addCriterion("FILL_ROLE not between", value1, value2, "fillRole");
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

        public Criteria andMasterAgreementFilePathIsNull() {
            addCriterion("MASTER_AGREEMENT_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathIsNotNull() {
            addCriterion("MASTER_AGREEMENT_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH =", value, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathNotEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH <>", value, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathGreaterThan(String value) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH >", value, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH >=", value, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathLessThan(String value) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH <", value, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathLessThanOrEqualTo(String value) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH <=", value, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathLike(String value) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH like", value, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathNotLike(String value) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH not like", value, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathIn(List<String> values) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH in", values, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathNotIn(List<String> values) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH not in", values, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathBetween(String value1, String value2) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH between", value1, value2, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andMasterAgreementFilePathNotBetween(String value1, String value2) {
            addCriterion("MASTER_AGREEMENT_FILE_PATH not between", value1, value2, "masterAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathIsNull() {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathIsNotNull() {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH =", value, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathNotEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH <>", value, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathGreaterThan(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH >", value, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH >=", value, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathLessThan(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH <", value, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathLessThanOrEqualTo(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH <=", value, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathLike(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH like", value, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathNotLike(String value) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH not like", value, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathIn(List<String> values) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH in", values, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathNotIn(List<String> values) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH not in", values, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathBetween(String value1, String value2) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH between", value1, value2, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSupplementAgreementFilePathNotBetween(String value1, String value2) {
            addCriterion("SUPPLEMENT_AGREEMENT_FILE_PATH not between", value1, value2, "supplementAgreementFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathIsNull() {
            addCriterion("SIGNED_PRODUCT_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathIsNotNull() {
            addCriterion("SIGNED_PRODUCT_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathEqualTo(String value) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH =", value, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathNotEqualTo(String value) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH <>", value, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathGreaterThan(String value) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH >", value, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH >=", value, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathLessThan(String value) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH <", value, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathLessThanOrEqualTo(String value) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH <=", value, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathLike(String value) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH like", value, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathNotLike(String value) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH not like", value, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathIn(List<String> values) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH in", values, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathNotIn(List<String> values) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH not in", values, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathBetween(String value1, String value2) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH between", value1, value2, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andSignedProductFilePathNotBetween(String value1, String value2) {
            addCriterion("SIGNED_PRODUCT_FILE_PATH not between", value1, value2, "signedProductFilePath");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeIsNull() {
            addCriterion("RPT_PRODCODE is null");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeIsNotNull() {
            addCriterion("RPT_PRODCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeEqualTo(String value) {
            addCriterion("RPT_PRODCODE =", value, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeNotEqualTo(String value) {
            addCriterion("RPT_PRODCODE <>", value, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeGreaterThan(String value) {
            addCriterion("RPT_PRODCODE >", value, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_PRODCODE >=", value, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeLessThan(String value) {
            addCriterion("RPT_PRODCODE <", value, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeLessThanOrEqualTo(String value) {
            addCriterion("RPT_PRODCODE <=", value, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeLike(String value) {
            addCriterion("RPT_PRODCODE like", value, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeNotLike(String value) {
            addCriterion("RPT_PRODCODE not like", value, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeIn(List<String> values) {
            addCriterion("RPT_PRODCODE in", values, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeNotIn(List<String> values) {
            addCriterion("RPT_PRODCODE not in", values, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeBetween(String value1, String value2) {
            addCriterion("RPT_PRODCODE between", value1, value2, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andRptProdcodeNotBetween(String value1, String value2) {
            addCriterion("RPT_PRODCODE not between", value1, value2, "rptProdcode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathIsNull() {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathIsNotNull() {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathEqualTo(String value) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH =", value, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathNotEqualTo(String value) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH <>", value, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathGreaterThan(String value) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH >", value, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH >=", value, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathLessThan(String value) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH <", value, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH <=", value, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathLike(String value) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH like", value, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathNotLike(String value) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH not like", value, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathIn(List<String> values) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH in", values, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathNotIn(List<String> values) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH not in", values, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathBetween(String value1, String value2) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH between", value1, value2, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgrmtFilePathNotBetween(String value1, String value2) {
            addCriterion("GUARANTEE_AGRMT_FILE_PATH not between", value1, value2, "guaranteeAgrmtFilePath");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("COMMISSION_RATE is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("COMMISSION_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(Short value) {
            addCriterion("COMMISSION_RATE =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(Short value) {
            addCriterion("COMMISSION_RATE <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(Short value) {
            addCriterion("COMMISSION_RATE >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(Short value) {
            addCriterion("COMMISSION_RATE >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(Short value) {
            addCriterion("COMMISSION_RATE <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(Short value) {
            addCriterion("COMMISSION_RATE <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<Short> values) {
            addCriterion("COMMISSION_RATE in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<Short> values) {
            addCriterion("COMMISSION_RATE not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(Short value1, Short value2) {
            addCriterion("COMMISSION_RATE between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(Short value1, Short value2) {
            addCriterion("COMMISSION_RATE not between", value1, value2, "commissionRate");
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

        public Criteria andPartialMarginFlagIsNull() {
            addCriterion("PARTIAL_MARGIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagIsNotNull() {
            addCriterion("PARTIAL_MARGIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagEqualTo(String value) {
            addCriterion("PARTIAL_MARGIN_FLAG =", value, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagNotEqualTo(String value) {
            addCriterion("PARTIAL_MARGIN_FLAG <>", value, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagGreaterThan(String value) {
            addCriterion("PARTIAL_MARGIN_FLAG >", value, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PARTIAL_MARGIN_FLAG >=", value, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagLessThan(String value) {
            addCriterion("PARTIAL_MARGIN_FLAG <", value, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagLessThanOrEqualTo(String value) {
            addCriterion("PARTIAL_MARGIN_FLAG <=", value, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagLike(String value) {
            addCriterion("PARTIAL_MARGIN_FLAG like", value, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagNotLike(String value) {
            addCriterion("PARTIAL_MARGIN_FLAG not like", value, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagIn(List<String> values) {
            addCriterion("PARTIAL_MARGIN_FLAG in", values, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagNotIn(List<String> values) {
            addCriterion("PARTIAL_MARGIN_FLAG not in", values, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagBetween(String value1, String value2) {
            addCriterion("PARTIAL_MARGIN_FLAG between", value1, value2, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andPartialMarginFlagNotBetween(String value1, String value2) {
            addCriterion("PARTIAL_MARGIN_FLAG not between", value1, value2, "partialMarginFlag");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkIsNull() {
            addCriterion("COMMISSION_RATE_HK is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkIsNotNull() {
            addCriterion("COMMISSION_RATE_HK is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkEqualTo(Short value) {
            addCriterion("COMMISSION_RATE_HK =", value, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkNotEqualTo(Short value) {
            addCriterion("COMMISSION_RATE_HK <>", value, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkGreaterThan(Short value) {
            addCriterion("COMMISSION_RATE_HK >", value, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkGreaterThanOrEqualTo(Short value) {
            addCriterion("COMMISSION_RATE_HK >=", value, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkLessThan(Short value) {
            addCriterion("COMMISSION_RATE_HK <", value, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkLessThanOrEqualTo(Short value) {
            addCriterion("COMMISSION_RATE_HK <=", value, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkIn(List<Short> values) {
            addCriterion("COMMISSION_RATE_HK in", values, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkNotIn(List<Short> values) {
            addCriterion("COMMISSION_RATE_HK not in", values, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkBetween(Short value1, Short value2) {
            addCriterion("COMMISSION_RATE_HK between", value1, value2, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andCommissionRateHkNotBetween(Short value1, Short value2) {
            addCriterion("COMMISSION_RATE_HK not between", value1, value2, "commissionRateHk");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioIsNull() {
            addCriterion("PREMIUM_FEE_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioIsNotNull() {
            addCriterion("PREMIUM_FEE_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioEqualTo(Short value) {
            addCriterion("PREMIUM_FEE_RATIO =", value, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioNotEqualTo(Short value) {
            addCriterion("PREMIUM_FEE_RATIO <>", value, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioGreaterThan(Short value) {
            addCriterion("PREMIUM_FEE_RATIO >", value, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioGreaterThanOrEqualTo(Short value) {
            addCriterion("PREMIUM_FEE_RATIO >=", value, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioLessThan(Short value) {
            addCriterion("PREMIUM_FEE_RATIO <", value, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioLessThanOrEqualTo(Short value) {
            addCriterion("PREMIUM_FEE_RATIO <=", value, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioIn(List<Short> values) {
            addCriterion("PREMIUM_FEE_RATIO in", values, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioNotIn(List<Short> values) {
            addCriterion("PREMIUM_FEE_RATIO not in", values, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioBetween(Short value1, Short value2) {
            addCriterion("PREMIUM_FEE_RATIO between", value1, value2, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeRatioNotBetween(Short value1, Short value2) {
            addCriterion("PREMIUM_FEE_RATIO not between", value1, value2, "premiumFeeRatio");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIsNull() {
            addCriterion("INTEREST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIsNotNull() {
            addCriterion("INTEREST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInterestTypeEqualTo(String value) {
            addCriterion("INTEREST_TYPE =", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotEqualTo(String value) {
            addCriterion("INTEREST_TYPE <>", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeGreaterThan(String value) {
            addCriterion("INTEREST_TYPE >", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INTEREST_TYPE >=", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLessThan(String value) {
            addCriterion("INTEREST_TYPE <", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLessThanOrEqualTo(String value) {
            addCriterion("INTEREST_TYPE <=", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLike(String value) {
            addCriterion("INTEREST_TYPE like", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotLike(String value) {
            addCriterion("INTEREST_TYPE not like", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIn(List<String> values) {
            addCriterion("INTEREST_TYPE in", values, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotIn(List<String> values) {
            addCriterion("INTEREST_TYPE not in", values, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeBetween(String value1, String value2) {
            addCriterion("INTEREST_TYPE between", value1, value2, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotBetween(String value1, String value2) {
            addCriterion("INTEREST_TYPE not between", value1, value2, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalIsNull() {
            addCriterion("INTEREST_INTERVAL is null");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalIsNotNull() {
            addCriterion("INTEREST_INTERVAL is not null");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalEqualTo(String value) {
            addCriterion("INTEREST_INTERVAL =", value, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalNotEqualTo(String value) {
            addCriterion("INTEREST_INTERVAL <>", value, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalGreaterThan(String value) {
            addCriterion("INTEREST_INTERVAL >", value, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("INTEREST_INTERVAL >=", value, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalLessThan(String value) {
            addCriterion("INTEREST_INTERVAL <", value, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalLessThanOrEqualTo(String value) {
            addCriterion("INTEREST_INTERVAL <=", value, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalLike(String value) {
            addCriterion("INTEREST_INTERVAL like", value, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalNotLike(String value) {
            addCriterion("INTEREST_INTERVAL not like", value, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalIn(List<String> values) {
            addCriterion("INTEREST_INTERVAL in", values, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalNotIn(List<String> values) {
            addCriterion("INTEREST_INTERVAL not in", values, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalBetween(String value1, String value2) {
            addCriterion("INTEREST_INTERVAL between", value1, value2, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andInterestIntervalNotBetween(String value1, String value2) {
            addCriterion("INTEREST_INTERVAL not between", value1, value2, "interestInterval");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeIsNull() {
            addCriterion("EXCHANGE_RATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeIsNotNull() {
            addCriterion("EXCHANGE_RATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeEqualTo(String value) {
            addCriterion("EXCHANGE_RATE_TYPE =", value, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeNotEqualTo(String value) {
            addCriterion("EXCHANGE_RATE_TYPE <>", value, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeGreaterThan(String value) {
            addCriterion("EXCHANGE_RATE_TYPE >", value, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_RATE_TYPE >=", value, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeLessThan(String value) {
            addCriterion("EXCHANGE_RATE_TYPE <", value, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_RATE_TYPE <=", value, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeLike(String value) {
            addCriterion("EXCHANGE_RATE_TYPE like", value, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeNotLike(String value) {
            addCriterion("EXCHANGE_RATE_TYPE not like", value, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeIn(List<String> values) {
            addCriterion("EXCHANGE_RATE_TYPE in", values, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeNotIn(List<String> values) {
            addCriterion("EXCHANGE_RATE_TYPE not in", values, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeBetween(String value1, String value2) {
            addCriterion("EXCHANGE_RATE_TYPE between", value1, value2, "exchangeRateType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateTypeNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE_RATE_TYPE not between", value1, value2, "exchangeRateType");
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

        public Criteria andCptyNotionalLimitIsNull() {
            addCriterion("CPTY_NOTIONAL_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitIsNotNull() {
            addCriterion("CPTY_NOTIONAL_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitEqualTo(Short value) {
            addCriterion("CPTY_NOTIONAL_LIMIT =", value, "cptyNotionalLimit");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitNotEqualTo(Short value) {
            addCriterion("CPTY_NOTIONAL_LIMIT <>", value, "cptyNotionalLimit");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitGreaterThan(Short value) {
            addCriterion("CPTY_NOTIONAL_LIMIT >", value, "cptyNotionalLimit");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitGreaterThanOrEqualTo(Short value) {
            addCriterion("CPTY_NOTIONAL_LIMIT >=", value, "cptyNotionalLimit");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitLessThan(Short value) {
            addCriterion("CPTY_NOTIONAL_LIMIT <", value, "cptyNotionalLimit");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitLessThanOrEqualTo(Short value) {
            addCriterion("CPTY_NOTIONAL_LIMIT <=", value, "cptyNotionalLimit");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitIn(List<Short> values) {
            addCriterion("CPTY_NOTIONAL_LIMIT in", values, "cptyNotionalLimit");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitNotIn(List<Short> values) {
            addCriterion("CPTY_NOTIONAL_LIMIT not in", values, "cptyNotionalLimit");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitBetween(Short value1, Short value2) {
            addCriterion("CPTY_NOTIONAL_LIMIT between", value1, value2, "cptyNotionalLimit");
            return (Criteria) this;
        }

        public Criteria andCptyNotionalLimitNotBetween(Short value1, Short value2) {
            addCriterion("CPTY_NOTIONAL_LIMIT not between", value1, value2, "cptyNotionalLimit");
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

        public Criteria andFiidIsNull() {
            addCriterion("FIID is null");
            return (Criteria) this;
        }

        public Criteria andFiidIsNotNull() {
            addCriterion("FIID is not null");
            return (Criteria) this;
        }

        public Criteria andFiidEqualTo(Long value) {
            addCriterion("FIID =", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidNotEqualTo(Long value) {
            addCriterion("FIID <>", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidGreaterThan(Long value) {
            addCriterion("FIID >", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidGreaterThanOrEqualTo(Long value) {
            addCriterion("FIID >=", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidLessThan(Long value) {
            addCriterion("FIID <", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidLessThanOrEqualTo(Long value) {
            addCriterion("FIID <=", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidIn(List<Long> values) {
            addCriterion("FIID in", values, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidNotIn(List<Long> values) {
            addCriterion("FIID not in", values, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidBetween(Long value1, Long value2) {
            addCriterion("FIID between", value1, value2, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidNotBetween(Long value1, Long value2) {
            addCriterion("FIID not between", value1, value2, "fiid");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsIsNull() {
            addCriterion("HK_FEE_RATE_US is null");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsIsNotNull() {
            addCriterion("HK_FEE_RATE_US is not null");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsEqualTo(Short value) {
            addCriterion("HK_FEE_RATE_US =", value, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsNotEqualTo(Short value) {
            addCriterion("HK_FEE_RATE_US <>", value, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsGreaterThan(Short value) {
            addCriterion("HK_FEE_RATE_US >", value, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsGreaterThanOrEqualTo(Short value) {
            addCriterion("HK_FEE_RATE_US >=", value, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsLessThan(Short value) {
            addCriterion("HK_FEE_RATE_US <", value, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsLessThanOrEqualTo(Short value) {
            addCriterion("HK_FEE_RATE_US <=", value, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsIn(List<Short> values) {
            addCriterion("HK_FEE_RATE_US in", values, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsNotIn(List<Short> values) {
            addCriterion("HK_FEE_RATE_US not in", values, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsBetween(Short value1, Short value2) {
            addCriterion("HK_FEE_RATE_US between", value1, value2, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateUsNotBetween(Short value1, Short value2) {
            addCriterion("HK_FEE_RATE_US not between", value1, value2, "hkFeeRateUs");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkIsNull() {
            addCriterion("HK_FEE_RATE_HK is null");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkIsNotNull() {
            addCriterion("HK_FEE_RATE_HK is not null");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkEqualTo(Short value) {
            addCriterion("HK_FEE_RATE_HK =", value, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkNotEqualTo(Short value) {
            addCriterion("HK_FEE_RATE_HK <>", value, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkGreaterThan(Short value) {
            addCriterion("HK_FEE_RATE_HK >", value, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkGreaterThanOrEqualTo(Short value) {
            addCriterion("HK_FEE_RATE_HK >=", value, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkLessThan(Short value) {
            addCriterion("HK_FEE_RATE_HK <", value, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkLessThanOrEqualTo(Short value) {
            addCriterion("HK_FEE_RATE_HK <=", value, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkIn(List<Short> values) {
            addCriterion("HK_FEE_RATE_HK in", values, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkNotIn(List<Short> values) {
            addCriterion("HK_FEE_RATE_HK not in", values, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkBetween(Short value1, Short value2) {
            addCriterion("HK_FEE_RATE_HK between", value1, value2, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFeeRateHkNotBetween(Short value1, Short value2) {
            addCriterion("HK_FEE_RATE_HK not between", value1, value2, "hkFeeRateHk");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateIsNull() {
            addCriterion("HK_FIXED_RATE is null");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateIsNotNull() {
            addCriterion("HK_FIXED_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateEqualTo(Short value) {
            addCriterion("HK_FIXED_RATE =", value, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateNotEqualTo(Short value) {
            addCriterion("HK_FIXED_RATE <>", value, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateGreaterThan(Short value) {
            addCriterion("HK_FIXED_RATE >", value, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateGreaterThanOrEqualTo(Short value) {
            addCriterion("HK_FIXED_RATE >=", value, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateLessThan(Short value) {
            addCriterion("HK_FIXED_RATE <", value, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateLessThanOrEqualTo(Short value) {
            addCriterion("HK_FIXED_RATE <=", value, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateIn(List<Short> values) {
            addCriterion("HK_FIXED_RATE in", values, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateNotIn(List<Short> values) {
            addCriterion("HK_FIXED_RATE not in", values, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateBetween(Short value1, Short value2) {
            addCriterion("HK_FIXED_RATE between", value1, value2, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andHkFixedRateNotBetween(Short value1, Short value2) {
            addCriterion("HK_FIXED_RATE not between", value1, value2, "hkFixedRate");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagIsNull() {
            addCriterion("RELATED_PARTY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagIsNotNull() {
            addCriterion("RELATED_PARTY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagEqualTo(String value) {
            addCriterion("RELATED_PARTY_FLAG =", value, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagNotEqualTo(String value) {
            addCriterion("RELATED_PARTY_FLAG <>", value, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagGreaterThan(String value) {
            addCriterion("RELATED_PARTY_FLAG >", value, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("RELATED_PARTY_FLAG >=", value, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagLessThan(String value) {
            addCriterion("RELATED_PARTY_FLAG <", value, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagLessThanOrEqualTo(String value) {
            addCriterion("RELATED_PARTY_FLAG <=", value, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagLike(String value) {
            addCriterion("RELATED_PARTY_FLAG like", value, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagNotLike(String value) {
            addCriterion("RELATED_PARTY_FLAG not like", value, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagIn(List<String> values) {
            addCriterion("RELATED_PARTY_FLAG in", values, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagNotIn(List<String> values) {
            addCriterion("RELATED_PARTY_FLAG not in", values, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagBetween(String value1, String value2) {
            addCriterion("RELATED_PARTY_FLAG between", value1, value2, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyFlagNotBetween(String value1, String value2) {
            addCriterion("RELATED_PARTY_FLAG not between", value1, value2, "relatedPartyFlag");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultIsNull() {
            addCriterion("RELATED_PARTY_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultIsNotNull() {
            addCriterion("RELATED_PARTY_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultEqualTo(String value) {
            addCriterion("RELATED_PARTY_RESULT =", value, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultNotEqualTo(String value) {
            addCriterion("RELATED_PARTY_RESULT <>", value, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultGreaterThan(String value) {
            addCriterion("RELATED_PARTY_RESULT >", value, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultGreaterThanOrEqualTo(String value) {
            addCriterion("RELATED_PARTY_RESULT >=", value, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultLessThan(String value) {
            addCriterion("RELATED_PARTY_RESULT <", value, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultLessThanOrEqualTo(String value) {
            addCriterion("RELATED_PARTY_RESULT <=", value, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultLike(String value) {
            addCriterion("RELATED_PARTY_RESULT like", value, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultNotLike(String value) {
            addCriterion("RELATED_PARTY_RESULT not like", value, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultIn(List<String> values) {
            addCriterion("RELATED_PARTY_RESULT in", values, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultNotIn(List<String> values) {
            addCriterion("RELATED_PARTY_RESULT not in", values, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultBetween(String value1, String value2) {
            addCriterion("RELATED_PARTY_RESULT between", value1, value2, "relatedPartyResult");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyResultNotBetween(String value1, String value2) {
            addCriterion("RELATED_PARTY_RESULT not between", value1, value2, "relatedPartyResult");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagIsNull() {
            addCriterion("OPTION_DURATION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagIsNotNull() {
            addCriterion("OPTION_DURATION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagEqualTo(String value) {
            addCriterion("OPTION_DURATION_FLAG =", value, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagNotEqualTo(String value) {
            addCriterion("OPTION_DURATION_FLAG <>", value, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagGreaterThan(String value) {
            addCriterion("OPTION_DURATION_FLAG >", value, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OPTION_DURATION_FLAG >=", value, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagLessThan(String value) {
            addCriterion("OPTION_DURATION_FLAG <", value, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagLessThanOrEqualTo(String value) {
            addCriterion("OPTION_DURATION_FLAG <=", value, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagLike(String value) {
            addCriterion("OPTION_DURATION_FLAG like", value, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagNotLike(String value) {
            addCriterion("OPTION_DURATION_FLAG not like", value, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagIn(List<String> values) {
            addCriterion("OPTION_DURATION_FLAG in", values, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagNotIn(List<String> values) {
            addCriterion("OPTION_DURATION_FLAG not in", values, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagBetween(String value1, String value2) {
            addCriterion("OPTION_DURATION_FLAG between", value1, value2, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andOptionDurationFlagNotBetween(String value1, String value2) {
            addCriterion("OPTION_DURATION_FLAG not between", value1, value2, "optionDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagIsNull() {
            addCriterion("TRS_DURATION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagIsNotNull() {
            addCriterion("TRS_DURATION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagEqualTo(String value) {
            addCriterion("TRS_DURATION_FLAG =", value, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagNotEqualTo(String value) {
            addCriterion("TRS_DURATION_FLAG <>", value, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagGreaterThan(String value) {
            addCriterion("TRS_DURATION_FLAG >", value, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TRS_DURATION_FLAG >=", value, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagLessThan(String value) {
            addCriterion("TRS_DURATION_FLAG <", value, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagLessThanOrEqualTo(String value) {
            addCriterion("TRS_DURATION_FLAG <=", value, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagLike(String value) {
            addCriterion("TRS_DURATION_FLAG like", value, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagNotLike(String value) {
            addCriterion("TRS_DURATION_FLAG not like", value, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagIn(List<String> values) {
            addCriterion("TRS_DURATION_FLAG in", values, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagNotIn(List<String> values) {
            addCriterion("TRS_DURATION_FLAG not in", values, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagBetween(String value1, String value2) {
            addCriterion("TRS_DURATION_FLAG between", value1, value2, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andTrsDurationFlagNotBetween(String value1, String value2) {
            addCriterion("TRS_DURATION_FLAG not between", value1, value2, "trsDurationFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagIsNull() {
            addCriterion("AML_EXCLUDE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagIsNotNull() {
            addCriterion("AML_EXCLUDE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagEqualTo(String value) {
            addCriterion("AML_EXCLUDE_FLAG =", value, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagNotEqualTo(String value) {
            addCriterion("AML_EXCLUDE_FLAG <>", value, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagGreaterThan(String value) {
            addCriterion("AML_EXCLUDE_FLAG >", value, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AML_EXCLUDE_FLAG >=", value, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagLessThan(String value) {
            addCriterion("AML_EXCLUDE_FLAG <", value, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagLessThanOrEqualTo(String value) {
            addCriterion("AML_EXCLUDE_FLAG <=", value, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagLike(String value) {
            addCriterion("AML_EXCLUDE_FLAG like", value, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagNotLike(String value) {
            addCriterion("AML_EXCLUDE_FLAG not like", value, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagIn(List<String> values) {
            addCriterion("AML_EXCLUDE_FLAG in", values, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagNotIn(List<String> values) {
            addCriterion("AML_EXCLUDE_FLAG not in", values, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagBetween(String value1, String value2) {
            addCriterion("AML_EXCLUDE_FLAG between", value1, value2, "amlExcludeFlag");
            return (Criteria) this;
        }

        public Criteria andAmlExcludeFlagNotBetween(String value1, String value2) {
            addCriterion("AML_EXCLUDE_FLAG not between", value1, value2, "amlExcludeFlag");
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

        public Criteria andGrantBalanceIsNull() {
            addCriterion("GRANT_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceIsNotNull() {
            addCriterion("GRANT_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceEqualTo(Short value) {
            addCriterion("GRANT_BALANCE =", value, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceNotEqualTo(Short value) {
            addCriterion("GRANT_BALANCE <>", value, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceGreaterThan(Short value) {
            addCriterion("GRANT_BALANCE >", value, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceGreaterThanOrEqualTo(Short value) {
            addCriterion("GRANT_BALANCE >=", value, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceLessThan(Short value) {
            addCriterion("GRANT_BALANCE <", value, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceLessThanOrEqualTo(Short value) {
            addCriterion("GRANT_BALANCE <=", value, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceIn(List<Short> values) {
            addCriterion("GRANT_BALANCE in", values, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceNotIn(List<Short> values) {
            addCriterion("GRANT_BALANCE not in", values, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceBetween(Short value1, Short value2) {
            addCriterion("GRANT_BALANCE between", value1, value2, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceNotBetween(Short value1, Short value2) {
            addCriterion("GRANT_BALANCE not between", value1, value2, "grantBalance");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateIsNull() {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateIsNotNull() {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateEqualTo(Date value) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE =", value, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateNotEqualTo(Date value) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE <>", value, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateGreaterThan(Date value) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE >", value, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE >=", value, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateLessThan(Date value) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE <", value, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE <=", value, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateIn(List<Date> values) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE in", values, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateNotIn(List<Date> values) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE not in", values, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateBetween(Date value1, Date value2) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE between", value1, value2, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andGrantBalanceExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("GRANT_BALANCE_EXPIRE_DATE not between", value1, value2, "grantBalanceExpireDate");
            return (Criteria) this;
        }

        public Criteria andMarginTypeIsNull() {
            addCriterion("MARGIN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMarginTypeIsNotNull() {
            addCriterion("MARGIN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMarginTypeEqualTo(String value) {
            addCriterion("MARGIN_TYPE =", value, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeNotEqualTo(String value) {
            addCriterion("MARGIN_TYPE <>", value, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeGreaterThan(String value) {
            addCriterion("MARGIN_TYPE >", value, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MARGIN_TYPE >=", value, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeLessThan(String value) {
            addCriterion("MARGIN_TYPE <", value, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeLessThanOrEqualTo(String value) {
            addCriterion("MARGIN_TYPE <=", value, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeLike(String value) {
            addCriterion("MARGIN_TYPE like", value, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeNotLike(String value) {
            addCriterion("MARGIN_TYPE not like", value, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeIn(List<String> values) {
            addCriterion("MARGIN_TYPE in", values, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeNotIn(List<String> values) {
            addCriterion("MARGIN_TYPE not in", values, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeBetween(String value1, String value2) {
            addCriterion("MARGIN_TYPE between", value1, value2, "marginType");
            return (Criteria) this;
        }

        public Criteria andMarginTypeNotBetween(String value1, String value2) {
            addCriterion("MARGIN_TYPE not between", value1, value2, "marginType");
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

        public Criteria andProdTypeIsNull() {
            addCriterion("PROD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProdTypeIsNotNull() {
            addCriterion("PROD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProdTypeEqualTo(String value) {
            addCriterion("PROD_TYPE =", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotEqualTo(String value) {
            addCriterion("PROD_TYPE <>", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThan(String value) {
            addCriterion("PROD_TYPE >", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_TYPE >=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThan(String value) {
            addCriterion("PROD_TYPE <", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThanOrEqualTo(String value) {
            addCriterion("PROD_TYPE <=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLike(String value) {
            addCriterion("PROD_TYPE like", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotLike(String value) {
            addCriterion("PROD_TYPE not like", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeIn(List<String> values) {
            addCriterion("PROD_TYPE in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotIn(List<String> values) {
            addCriterion("PROD_TYPE not in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeBetween(String value1, String value2) {
            addCriterion("PROD_TYPE between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotBetween(String value1, String value2) {
            addCriterion("PROD_TYPE not between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdEndDateIsNull() {
            addCriterion("PROD_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProdEndDateIsNotNull() {
            addCriterion("PROD_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProdEndDateEqualTo(Date value) {
            addCriterion("PROD_END_DATE =", value, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andProdEndDateNotEqualTo(Date value) {
            addCriterion("PROD_END_DATE <>", value, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andProdEndDateGreaterThan(Date value) {
            addCriterion("PROD_END_DATE >", value, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andProdEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PROD_END_DATE >=", value, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andProdEndDateLessThan(Date value) {
            addCriterion("PROD_END_DATE <", value, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andProdEndDateLessThanOrEqualTo(Date value) {
            addCriterion("PROD_END_DATE <=", value, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andProdEndDateIn(List<Date> values) {
            addCriterion("PROD_END_DATE in", values, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andProdEndDateNotIn(List<Date> values) {
            addCriterion("PROD_END_DATE not in", values, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andProdEndDateBetween(Date value1, Date value2) {
            addCriterion("PROD_END_DATE between", value1, value2, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andProdEndDateNotBetween(Date value1, Date value2) {
            addCriterion("PROD_END_DATE not between", value1, value2, "prodEndDate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateIsNull() {
            addCriterion("AB_FUTURES_PREMIUM_RATE is null");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateIsNotNull() {
            addCriterion("AB_FUTURES_PREMIUM_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateEqualTo(Short value) {
            addCriterion("AB_FUTURES_PREMIUM_RATE =", value, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateNotEqualTo(Short value) {
            addCriterion("AB_FUTURES_PREMIUM_RATE <>", value, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateGreaterThan(Short value) {
            addCriterion("AB_FUTURES_PREMIUM_RATE >", value, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateGreaterThanOrEqualTo(Short value) {
            addCriterion("AB_FUTURES_PREMIUM_RATE >=", value, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateLessThan(Short value) {
            addCriterion("AB_FUTURES_PREMIUM_RATE <", value, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateLessThanOrEqualTo(Short value) {
            addCriterion("AB_FUTURES_PREMIUM_RATE <=", value, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateIn(List<Short> values) {
            addCriterion("AB_FUTURES_PREMIUM_RATE in", values, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateNotIn(List<Short> values) {
            addCriterion("AB_FUTURES_PREMIUM_RATE not in", values, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateBetween(Short value1, Short value2) {
            addCriterion("AB_FUTURES_PREMIUM_RATE between", value1, value2, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesPremiumRateNotBetween(Short value1, Short value2) {
            addCriterion("AB_FUTURES_PREMIUM_RATE not between", value1, value2, "abFuturesPremiumRate");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorIsNull() {
            addCriterion("AB_FUTURES_LEVEL_FACTOR is null");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorIsNotNull() {
            addCriterion("AB_FUTURES_LEVEL_FACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorEqualTo(Short value) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR =", value, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorNotEqualTo(Short value) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR <>", value, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorGreaterThan(Short value) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR >", value, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorGreaterThanOrEqualTo(Short value) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR >=", value, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorLessThan(Short value) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR <", value, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorLessThanOrEqualTo(Short value) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR <=", value, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorIn(List<Short> values) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR in", values, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorNotIn(List<Short> values) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR not in", values, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorBetween(Short value1, Short value2) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR between", value1, value2, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andAbFuturesLevelFactorNotBetween(Short value1, Short value2) {
            addCriterion("AB_FUTURES_LEVEL_FACTOR not between", value1, value2, "abFuturesLevelFactor");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherIsNull() {
            addCriterion("PROD_TYPE_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherIsNotNull() {
            addCriterion("PROD_TYPE_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherEqualTo(String value) {
            addCriterion("PROD_TYPE_OTHER =", value, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherNotEqualTo(String value) {
            addCriterion("PROD_TYPE_OTHER <>", value, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherGreaterThan(String value) {
            addCriterion("PROD_TYPE_OTHER >", value, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_TYPE_OTHER >=", value, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherLessThan(String value) {
            addCriterion("PROD_TYPE_OTHER <", value, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherLessThanOrEqualTo(String value) {
            addCriterion("PROD_TYPE_OTHER <=", value, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherLike(String value) {
            addCriterion("PROD_TYPE_OTHER like", value, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherNotLike(String value) {
            addCriterion("PROD_TYPE_OTHER not like", value, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherIn(List<String> values) {
            addCriterion("PROD_TYPE_OTHER in", values, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherNotIn(List<String> values) {
            addCriterion("PROD_TYPE_OTHER not in", values, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherBetween(String value1, String value2) {
            addCriterion("PROD_TYPE_OTHER between", value1, value2, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andProdTypeOtherNotBetween(String value1, String value2) {
            addCriterion("PROD_TYPE_OTHER not between", value1, value2, "prodTypeOther");
            return (Criteria) this;
        }

        public Criteria andSpreadIsNull() {
            addCriterion("SPREAD is null");
            return (Criteria) this;
        }

        public Criteria andSpreadIsNotNull() {
            addCriterion("SPREAD is not null");
            return (Criteria) this;
        }

        public Criteria andSpreadEqualTo(Short value) {
            addCriterion("SPREAD =", value, "spread");
            return (Criteria) this;
        }

        public Criteria andSpreadNotEqualTo(Short value) {
            addCriterion("SPREAD <>", value, "spread");
            return (Criteria) this;
        }

        public Criteria andSpreadGreaterThan(Short value) {
            addCriterion("SPREAD >", value, "spread");
            return (Criteria) this;
        }

        public Criteria andSpreadGreaterThanOrEqualTo(Short value) {
            addCriterion("SPREAD >=", value, "spread");
            return (Criteria) this;
        }

        public Criteria andSpreadLessThan(Short value) {
            addCriterion("SPREAD <", value, "spread");
            return (Criteria) this;
        }

        public Criteria andSpreadLessThanOrEqualTo(Short value) {
            addCriterion("SPREAD <=", value, "spread");
            return (Criteria) this;
        }

        public Criteria andSpreadIn(List<Short> values) {
            addCriterion("SPREAD in", values, "spread");
            return (Criteria) this;
        }

        public Criteria andSpreadNotIn(List<Short> values) {
            addCriterion("SPREAD not in", values, "spread");
            return (Criteria) this;
        }

        public Criteria andSpreadBetween(Short value1, Short value2) {
            addCriterion("SPREAD between", value1, value2, "spread");
            return (Criteria) this;
        }

        public Criteria andSpreadNotBetween(Short value1, Short value2) {
            addCriterion("SPREAD not between", value1, value2, "spread");
            return (Criteria) this;
        }

        public Criteria andLeiCodeIsNull() {
            addCriterion("LEI_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLeiCodeIsNotNull() {
            addCriterion("LEI_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLeiCodeEqualTo(String value) {
            addCriterion("LEI_CODE =", value, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeNotEqualTo(String value) {
            addCriterion("LEI_CODE <>", value, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeGreaterThan(String value) {
            addCriterion("LEI_CODE >", value, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LEI_CODE >=", value, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeLessThan(String value) {
            addCriterion("LEI_CODE <", value, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeLessThanOrEqualTo(String value) {
            addCriterion("LEI_CODE <=", value, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeLike(String value) {
            addCriterion("LEI_CODE like", value, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeNotLike(String value) {
            addCriterion("LEI_CODE not like", value, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeIn(List<String> values) {
            addCriterion("LEI_CODE in", values, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeNotIn(List<String> values) {
            addCriterion("LEI_CODE not in", values, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeBetween(String value1, String value2) {
            addCriterion("LEI_CODE between", value1, value2, "leiCode");
            return (Criteria) this;
        }

        public Criteria andLeiCodeNotBetween(String value1, String value2) {
            addCriterion("LEI_CODE not between", value1, value2, "leiCode");
            return (Criteria) this;
        }

        public Criteria andClientProtocolIsNull() {
            addCriterion("CLIENT_PROTOCOL is null");
            return (Criteria) this;
        }

        public Criteria andClientProtocolIsNotNull() {
            addCriterion("CLIENT_PROTOCOL is not null");
            return (Criteria) this;
        }

        public Criteria andClientProtocolEqualTo(String value) {
            addCriterion("CLIENT_PROTOCOL =", value, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolNotEqualTo(String value) {
            addCriterion("CLIENT_PROTOCOL <>", value, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolGreaterThan(String value) {
            addCriterion("CLIENT_PROTOCOL >", value, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_PROTOCOL >=", value, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolLessThan(String value) {
            addCriterion("CLIENT_PROTOCOL <", value, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_PROTOCOL <=", value, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolLike(String value) {
            addCriterion("CLIENT_PROTOCOL like", value, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolNotLike(String value) {
            addCriterion("CLIENT_PROTOCOL not like", value, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolIn(List<String> values) {
            addCriterion("CLIENT_PROTOCOL in", values, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolNotIn(List<String> values) {
            addCriterion("CLIENT_PROTOCOL not in", values, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolBetween(String value1, String value2) {
            addCriterion("CLIENT_PROTOCOL between", value1, value2, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andClientProtocolNotBetween(String value1, String value2) {
            addCriterion("CLIENT_PROTOCOL not between", value1, value2, "clientProtocol");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedIsNull() {
            addCriterion("PUBLIC_RELATED is null");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedIsNotNull() {
            addCriterion("PUBLIC_RELATED is not null");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedEqualTo(String value) {
            addCriterion("PUBLIC_RELATED =", value, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedNotEqualTo(String value) {
            addCriterion("PUBLIC_RELATED <>", value, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedGreaterThan(String value) {
            addCriterion("PUBLIC_RELATED >", value, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_RELATED >=", value, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedLessThan(String value) {
            addCriterion("PUBLIC_RELATED <", value, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_RELATED <=", value, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedLike(String value) {
            addCriterion("PUBLIC_RELATED like", value, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedNotLike(String value) {
            addCriterion("PUBLIC_RELATED not like", value, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedIn(List<String> values) {
            addCriterion("PUBLIC_RELATED in", values, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedNotIn(List<String> values) {
            addCriterion("PUBLIC_RELATED not in", values, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedBetween(String value1, String value2) {
            addCriterion("PUBLIC_RELATED between", value1, value2, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicRelatedNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_RELATED not between", value1, value2, "publicRelated");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeIsNull() {
            addCriterion("PUBLIC_STOCK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeIsNotNull() {
            addCriterion("PUBLIC_STOCK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeEqualTo(String value) {
            addCriterion("PUBLIC_STOCK_CODE =", value, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeNotEqualTo(String value) {
            addCriterion("PUBLIC_STOCK_CODE <>", value, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeGreaterThan(String value) {
            addCriterion("PUBLIC_STOCK_CODE >", value, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_STOCK_CODE >=", value, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeLessThan(String value) {
            addCriterion("PUBLIC_STOCK_CODE <", value, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_STOCK_CODE <=", value, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeLike(String value) {
            addCriterion("PUBLIC_STOCK_CODE like", value, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeNotLike(String value) {
            addCriterion("PUBLIC_STOCK_CODE not like", value, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeIn(List<String> values) {
            addCriterion("PUBLIC_STOCK_CODE in", values, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeNotIn(List<String> values) {
            addCriterion("PUBLIC_STOCK_CODE not in", values, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeBetween(String value1, String value2) {
            addCriterion("PUBLIC_STOCK_CODE between", value1, value2, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andPublicStockCodeNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_STOCK_CODE not between", value1, value2, "publicStockCode");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorIsNull() {
            addCriterion("INTRODUCTION_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorIsNotNull() {
            addCriterion("INTRODUCTION_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorEqualTo(String value) {
            addCriterion("INTRODUCTION_OPERATOR =", value, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorNotEqualTo(String value) {
            addCriterion("INTRODUCTION_OPERATOR <>", value, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorGreaterThan(String value) {
            addCriterion("INTRODUCTION_OPERATOR >", value, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION_OPERATOR >=", value, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorLessThan(String value) {
            addCriterion("INTRODUCTION_OPERATOR <", value, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION_OPERATOR <=", value, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorLike(String value) {
            addCriterion("INTRODUCTION_OPERATOR like", value, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorNotLike(String value) {
            addCriterion("INTRODUCTION_OPERATOR not like", value, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorIn(List<String> values) {
            addCriterion("INTRODUCTION_OPERATOR in", values, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorNotIn(List<String> values) {
            addCriterion("INTRODUCTION_OPERATOR not in", values, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorBetween(String value1, String value2) {
            addCriterion("INTRODUCTION_OPERATOR between", value1, value2, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andIntroductionOperatorNotBetween(String value1, String value2) {
            addCriterion("INTRODUCTION_OPERATOR not between", value1, value2, "introductionOperator");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonIsNull() {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON is null");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonIsNotNull() {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON =", value, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonNotEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON <>", value, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonGreaterThan(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON >", value, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON >=", value, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonLessThan(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON <", value, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON <=", value, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonLike(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON like", value, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonNotLike(String value) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON not like", value, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonIn(List<String> values) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON in", values, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonNotIn(List<String> values) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON not in", values, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonBetween(String value1, String value2) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON between", value1, value2, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andClientQualifyReviewReasonNotBetween(String value1, String value2) {
            addCriterion("CLIENT_QUALIFY_REVIEW_REASON not between", value1, value2, "clientQualifyReviewReason");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedIsNull() {
            addCriterion("PROD_PUBLIC_RELATED is null");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedIsNotNull() {
            addCriterion("PROD_PUBLIC_RELATED is not null");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedEqualTo(String value) {
            addCriterion("PROD_PUBLIC_RELATED =", value, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedNotEqualTo(String value) {
            addCriterion("PROD_PUBLIC_RELATED <>", value, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedGreaterThan(String value) {
            addCriterion("PROD_PUBLIC_RELATED >", value, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_PUBLIC_RELATED >=", value, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedLessThan(String value) {
            addCriterion("PROD_PUBLIC_RELATED <", value, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedLessThanOrEqualTo(String value) {
            addCriterion("PROD_PUBLIC_RELATED <=", value, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedLike(String value) {
            addCriterion("PROD_PUBLIC_RELATED like", value, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedNotLike(String value) {
            addCriterion("PROD_PUBLIC_RELATED not like", value, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedIn(List<String> values) {
            addCriterion("PROD_PUBLIC_RELATED in", values, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedNotIn(List<String> values) {
            addCriterion("PROD_PUBLIC_RELATED not in", values, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedBetween(String value1, String value2) {
            addCriterion("PROD_PUBLIC_RELATED between", value1, value2, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicRelatedNotBetween(String value1, String value2) {
            addCriterion("PROD_PUBLIC_RELATED not between", value1, value2, "prodPublicRelated");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeIsNull() {
            addCriterion("PROD_PUBLIC_STOCK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeIsNotNull() {
            addCriterion("PROD_PUBLIC_STOCK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeEqualTo(String value) {
            addCriterion("PROD_PUBLIC_STOCK_CODE =", value, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeNotEqualTo(String value) {
            addCriterion("PROD_PUBLIC_STOCK_CODE <>", value, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeGreaterThan(String value) {
            addCriterion("PROD_PUBLIC_STOCK_CODE >", value, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_PUBLIC_STOCK_CODE >=", value, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeLessThan(String value) {
            addCriterion("PROD_PUBLIC_STOCK_CODE <", value, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeLessThanOrEqualTo(String value) {
            addCriterion("PROD_PUBLIC_STOCK_CODE <=", value, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeLike(String value) {
            addCriterion("PROD_PUBLIC_STOCK_CODE like", value, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeNotLike(String value) {
            addCriterion("PROD_PUBLIC_STOCK_CODE not like", value, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeIn(List<String> values) {
            addCriterion("PROD_PUBLIC_STOCK_CODE in", values, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeNotIn(List<String> values) {
            addCriterion("PROD_PUBLIC_STOCK_CODE not in", values, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeBetween(String value1, String value2) {
            addCriterion("PROD_PUBLIC_STOCK_CODE between", value1, value2, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andProdPublicStockCodeNotBetween(String value1, String value2) {
            addCriterion("PROD_PUBLIC_STOCK_CODE not between", value1, value2, "prodPublicStockCode");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagIsNull() {
            addCriterion("EXCHANGE_REPORT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagIsNotNull() {
            addCriterion("EXCHANGE_REPORT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagEqualTo(String value) {
            addCriterion("EXCHANGE_REPORT_FLAG =", value, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagNotEqualTo(String value) {
            addCriterion("EXCHANGE_REPORT_FLAG <>", value, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagGreaterThan(String value) {
            addCriterion("EXCHANGE_REPORT_FLAG >", value, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_REPORT_FLAG >=", value, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagLessThan(String value) {
            addCriterion("EXCHANGE_REPORT_FLAG <", value, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_REPORT_FLAG <=", value, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagLike(String value) {
            addCriterion("EXCHANGE_REPORT_FLAG like", value, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagNotLike(String value) {
            addCriterion("EXCHANGE_REPORT_FLAG not like", value, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagIn(List<String> values) {
            addCriterion("EXCHANGE_REPORT_FLAG in", values, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagNotIn(List<String> values) {
            addCriterion("EXCHANGE_REPORT_FLAG not in", values, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagBetween(String value1, String value2) {
            addCriterion("EXCHANGE_REPORT_FLAG between", value1, value2, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andExchangeReportFlagNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE_REPORT_FLAG not between", value1, value2, "exchangeReportFlag");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameIsNull() {
            addCriterion("CHAT_ROOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameIsNotNull() {
            addCriterion("CHAT_ROOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameEqualTo(String value) {
            addCriterion("CHAT_ROOM_NAME =", value, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameNotEqualTo(String value) {
            addCriterion("CHAT_ROOM_NAME <>", value, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameGreaterThan(String value) {
            addCriterion("CHAT_ROOM_NAME >", value, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHAT_ROOM_NAME >=", value, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameLessThan(String value) {
            addCriterion("CHAT_ROOM_NAME <", value, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameLessThanOrEqualTo(String value) {
            addCriterion("CHAT_ROOM_NAME <=", value, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameLike(String value) {
            addCriterion("CHAT_ROOM_NAME like", value, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameNotLike(String value) {
            addCriterion("CHAT_ROOM_NAME not like", value, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameIn(List<String> values) {
            addCriterion("CHAT_ROOM_NAME in", values, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameNotIn(List<String> values) {
            addCriterion("CHAT_ROOM_NAME not in", values, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameBetween(String value1, String value2) {
            addCriterion("CHAT_ROOM_NAME between", value1, value2, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andChatRoomNameNotBetween(String value1, String value2) {
            addCriterion("CHAT_ROOM_NAME not between", value1, value2, "chatRoomName");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitIsNull() {
            addCriterion("NO_AUTO_VISIT is null");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitIsNotNull() {
            addCriterion("NO_AUTO_VISIT is not null");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitEqualTo(String value) {
            addCriterion("NO_AUTO_VISIT =", value, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitNotEqualTo(String value) {
            addCriterion("NO_AUTO_VISIT <>", value, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitGreaterThan(String value) {
            addCriterion("NO_AUTO_VISIT >", value, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitGreaterThanOrEqualTo(String value) {
            addCriterion("NO_AUTO_VISIT >=", value, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitLessThan(String value) {
            addCriterion("NO_AUTO_VISIT <", value, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitLessThanOrEqualTo(String value) {
            addCriterion("NO_AUTO_VISIT <=", value, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitLike(String value) {
            addCriterion("NO_AUTO_VISIT like", value, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitNotLike(String value) {
            addCriterion("NO_AUTO_VISIT not like", value, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitIn(List<String> values) {
            addCriterion("NO_AUTO_VISIT in", values, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitNotIn(List<String> values) {
            addCriterion("NO_AUTO_VISIT not in", values, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitBetween(String value1, String value2) {
            addCriterion("NO_AUTO_VISIT between", value1, value2, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andNoAutoVisitNotBetween(String value1, String value2) {
            addCriterion("NO_AUTO_VISIT not between", value1, value2, "noAutoVisit");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusIsNull() {
            addCriterion("PRODUCT_REPORT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusIsNotNull() {
            addCriterion("PRODUCT_REPORT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusEqualTo(String value) {
            addCriterion("PRODUCT_REPORT_STATUS =", value, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusNotEqualTo(String value) {
            addCriterion("PRODUCT_REPORT_STATUS <>", value, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusGreaterThan(String value) {
            addCriterion("PRODUCT_REPORT_STATUS >", value, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REPORT_STATUS >=", value, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusLessThan(String value) {
            addCriterion("PRODUCT_REPORT_STATUS <", value, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REPORT_STATUS <=", value, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusLike(String value) {
            addCriterion("PRODUCT_REPORT_STATUS like", value, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusNotLike(String value) {
            addCriterion("PRODUCT_REPORT_STATUS not like", value, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusIn(List<String> values) {
            addCriterion("PRODUCT_REPORT_STATUS in", values, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusNotIn(List<String> values) {
            addCriterion("PRODUCT_REPORT_STATUS not in", values, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusBetween(String value1, String value2) {
            addCriterion("PRODUCT_REPORT_STATUS between", value1, value2, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andProductReportStatusNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_REPORT_STATUS not between", value1, value2, "productReportStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonIsNull() {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON is null");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonIsNotNull() {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonEqualTo(String value) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON =", value, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonNotEqualTo(String value) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON <>", value, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonGreaterThan(String value) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON >", value, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonGreaterThanOrEqualTo(String value) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON >=", value, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonLessThan(String value) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON <", value, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonLessThanOrEqualTo(String value) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON <=", value, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonLike(String value) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON like", value, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonNotLike(String value) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON not like", value, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonIn(List<String> values) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON in", values, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonNotIn(List<String> values) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON not in", values, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonBetween(String value1, String value2) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON between", value1, value2, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andOptionProductQualityReasonNotBetween(String value1, String value2) {
            addCriterion("OPTION_PRODUCT_QUALITY_REASON not between", value1, value2, "optionProductQualityReason");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeIsNull() {
            addCriterion("HIS_ALLOW_BUSI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeIsNotNull() {
            addCriterion("HIS_ALLOW_BUSI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeEqualTo(String value) {
            addCriterion("HIS_ALLOW_BUSI_TYPE =", value, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeNotEqualTo(String value) {
            addCriterion("HIS_ALLOW_BUSI_TYPE <>", value, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeGreaterThan(String value) {
            addCriterion("HIS_ALLOW_BUSI_TYPE >", value, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HIS_ALLOW_BUSI_TYPE >=", value, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeLessThan(String value) {
            addCriterion("HIS_ALLOW_BUSI_TYPE <", value, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("HIS_ALLOW_BUSI_TYPE <=", value, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeLike(String value) {
            addCriterion("HIS_ALLOW_BUSI_TYPE like", value, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeNotLike(String value) {
            addCriterion("HIS_ALLOW_BUSI_TYPE not like", value, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeIn(List<String> values) {
            addCriterion("HIS_ALLOW_BUSI_TYPE in", values, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeNotIn(List<String> values) {
            addCriterion("HIS_ALLOW_BUSI_TYPE not in", values, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeBetween(String value1, String value2) {
            addCriterion("HIS_ALLOW_BUSI_TYPE between", value1, value2, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andHisAllowBusiTypeNotBetween(String value1, String value2) {
            addCriterion("HIS_ALLOW_BUSI_TYPE not between", value1, value2, "hisAllowBusiType");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyIsNull() {
            addCriterion("BASIC_HOST_AGENCY is null");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyIsNotNull() {
            addCriterion("BASIC_HOST_AGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyEqualTo(String value) {
            addCriterion("BASIC_HOST_AGENCY =", value, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyNotEqualTo(String value) {
            addCriterion("BASIC_HOST_AGENCY <>", value, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyGreaterThan(String value) {
            addCriterion("BASIC_HOST_AGENCY >", value, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("BASIC_HOST_AGENCY >=", value, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyLessThan(String value) {
            addCriterion("BASIC_HOST_AGENCY <", value, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyLessThanOrEqualTo(String value) {
            addCriterion("BASIC_HOST_AGENCY <=", value, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyLike(String value) {
            addCriterion("BASIC_HOST_AGENCY like", value, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyNotLike(String value) {
            addCriterion("BASIC_HOST_AGENCY not like", value, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyIn(List<String> values) {
            addCriterion("BASIC_HOST_AGENCY in", values, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyNotIn(List<String> values) {
            addCriterion("BASIC_HOST_AGENCY not in", values, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyBetween(String value1, String value2) {
            addCriterion("BASIC_HOST_AGENCY between", value1, value2, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andBasicHostAgencyNotBetween(String value1, String value2) {
            addCriterion("BASIC_HOST_AGENCY not between", value1, value2, "basicHostAgency");
            return (Criteria) this;
        }

        public Criteria andFundManagerIsNull() {
            addCriterion("FUND_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andFundManagerIsNotNull() {
            addCriterion("FUND_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andFundManagerEqualTo(String value) {
            addCriterion("FUND_MANAGER =", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotEqualTo(String value) {
            addCriterion("FUND_MANAGER <>", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerGreaterThan(String value) {
            addCriterion("FUND_MANAGER >", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_MANAGER >=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLessThan(String value) {
            addCriterion("FUND_MANAGER <", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLessThanOrEqualTo(String value) {
            addCriterion("FUND_MANAGER <=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLike(String value) {
            addCriterion("FUND_MANAGER like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotLike(String value) {
            addCriterion("FUND_MANAGER not like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerIn(List<String> values) {
            addCriterion("FUND_MANAGER in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotIn(List<String> values) {
            addCriterion("FUND_MANAGER not in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerBetween(String value1, String value2) {
            addCriterion("FUND_MANAGER between", value1, value2, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotBetween(String value1, String value2) {
            addCriterion("FUND_MANAGER not between", value1, value2, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelIsNull() {
            addCriterion("FUND_MANAGER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelIsNotNull() {
            addCriterion("FUND_MANAGER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelEqualTo(String value) {
            addCriterion("FUND_MANAGER_TEL =", value, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelNotEqualTo(String value) {
            addCriterion("FUND_MANAGER_TEL <>", value, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelGreaterThan(String value) {
            addCriterion("FUND_MANAGER_TEL >", value, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_MANAGER_TEL >=", value, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelLessThan(String value) {
            addCriterion("FUND_MANAGER_TEL <", value, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelLessThanOrEqualTo(String value) {
            addCriterion("FUND_MANAGER_TEL <=", value, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelLike(String value) {
            addCriterion("FUND_MANAGER_TEL like", value, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelNotLike(String value) {
            addCriterion("FUND_MANAGER_TEL not like", value, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelIn(List<String> values) {
            addCriterion("FUND_MANAGER_TEL in", values, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelNotIn(List<String> values) {
            addCriterion("FUND_MANAGER_TEL not in", values, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelBetween(String value1, String value2) {
            addCriterion("FUND_MANAGER_TEL between", value1, value2, "fundManagerTel");
            return (Criteria) this;
        }

        public Criteria andFundManagerTelNotBetween(String value1, String value2) {
            addCriterion("FUND_MANAGER_TEL not between", value1, value2, "fundManagerTel");
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