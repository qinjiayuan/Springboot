package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CounterpartyBenefitOverListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CounterpartyBenefitOverListExample() {
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

        public Criteria andProportionIsNull() {
            addCriterion("PROPORTION is null");
            return (Criteria) this;
        }

        public Criteria andProportionIsNotNull() {
            addCriterion("PROPORTION is not null");
            return (Criteria) this;
        }

        public Criteria andProportionEqualTo(Short value) {
            addCriterion("PROPORTION =", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotEqualTo(Short value) {
            addCriterion("PROPORTION <>", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThan(Short value) {
            addCriterion("PROPORTION >", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThanOrEqualTo(Short value) {
            addCriterion("PROPORTION >=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThan(Short value) {
            addCriterion("PROPORTION <", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThanOrEqualTo(Short value) {
            addCriterion("PROPORTION <=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionIn(List<Short> values) {
            addCriterion("PROPORTION in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotIn(List<Short> values) {
            addCriterion("PROPORTION not in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionBetween(Short value1, Short value2) {
            addCriterion("PROPORTION between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotBetween(Short value1, Short value2) {
            addCriterion("PROPORTION not between", value1, value2, "proportion");
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

        public Criteria andFiidEqualTo(BigDecimal value) {
            addCriterion("FIID =", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidNotEqualTo(BigDecimal value) {
            addCriterion("FIID <>", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidGreaterThan(BigDecimal value) {
            addCriterion("FIID >", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIID >=", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidLessThan(BigDecimal value) {
            addCriterion("FIID <", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIID <=", value, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidIn(List<BigDecimal> values) {
            addCriterion("FIID in", values, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidNotIn(List<BigDecimal> values) {
            addCriterion("FIID not in", values, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIID between", value1, value2, "fiid");
            return (Criteria) this;
        }

        public Criteria andFiidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIID not between", value1, value2, "fiid");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagIsNull() {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagIsNotNull() {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagEqualTo(String value) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG =", value, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagNotEqualTo(String value) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG <>", value, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagGreaterThan(String value) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG >", value, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG >=", value, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagLessThan(String value) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG <", value, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG <=", value, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagLike(String value) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG like", value, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagNotLike(String value) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG not like", value, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagIn(List<String> values) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG in", values, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagNotIn(List<String> values) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG not in", values, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG between", value1, value2, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andProfessionalInvestorFlagNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL_INVESTOR_FLAG not between", value1, value2, "professionalInvestorFlag");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearIsNull() {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR is null");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearIsNotNull() {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearEqualTo(Short value) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR =", value, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearNotEqualTo(Short value) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR <>", value, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearGreaterThan(Short value) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR >", value, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearGreaterThanOrEqualTo(Short value) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR >=", value, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearLessThan(Short value) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR <", value, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearLessThanOrEqualTo(Short value) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR <=", value, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearIn(List<Short> values) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR in", values, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearNotIn(List<Short> values) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR not in", values, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearBetween(Short value1, Short value2) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR between", value1, value2, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andFinancialAssetsOfLastyearNotBetween(Short value1, Short value2) {
            addCriterion("FINANCIAL_ASSETS_OF_LASTYEAR not between", value1, value2, "financialAssetsOfLastyear");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagIsNull() {
            addCriterion("INVEST_3YEAR_EXP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagIsNotNull() {
            addCriterion("INVEST_3YEAR_EXP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagEqualTo(String value) {
            addCriterion("INVEST_3YEAR_EXP_FLAG =", value, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagNotEqualTo(String value) {
            addCriterion("INVEST_3YEAR_EXP_FLAG <>", value, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagGreaterThan(String value) {
            addCriterion("INVEST_3YEAR_EXP_FLAG >", value, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagGreaterThanOrEqualTo(String value) {
            addCriterion("INVEST_3YEAR_EXP_FLAG >=", value, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagLessThan(String value) {
            addCriterion("INVEST_3YEAR_EXP_FLAG <", value, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagLessThanOrEqualTo(String value) {
            addCriterion("INVEST_3YEAR_EXP_FLAG <=", value, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagLike(String value) {
            addCriterion("INVEST_3YEAR_EXP_FLAG like", value, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagNotLike(String value) {
            addCriterion("INVEST_3YEAR_EXP_FLAG not like", value, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagIn(List<String> values) {
            addCriterion("INVEST_3YEAR_EXP_FLAG in", values, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagNotIn(List<String> values) {
            addCriterion("INVEST_3YEAR_EXP_FLAG not in", values, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagBetween(String value1, String value2) {
            addCriterion("INVEST_3YEAR_EXP_FLAG between", value1, value2, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andInvest3yearExpFlagNotBetween(String value1, String value2) {
            addCriterion("INVEST_3YEAR_EXP_FLAG not between", value1, value2, "invest3yearExpFlag");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNull() {
            addCriterion("PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(String value) {
            addCriterion("PROD_ID =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(String value) {
            addCriterion("PROD_ID <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(String value) {
            addCriterion("PROD_ID >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_ID >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(String value) {
            addCriterion("PROD_ID <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(String value) {
            addCriterion("PROD_ID <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLike(String value) {
            addCriterion("PROD_ID like", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotLike(String value) {
            addCriterion("PROD_ID not like", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<String> values) {
            addCriterion("PROD_ID in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<String> values) {
            addCriterion("PROD_ID not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(String value1, String value2) {
            addCriterion("PROD_ID between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(String value1, String value2) {
            addCriterion("PROD_ID not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagIsNull() {
            addCriterion("ASSETS_20MILLION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagIsNotNull() {
            addCriterion("ASSETS_20MILLION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagEqualTo(String value) {
            addCriterion("ASSETS_20MILLION_FLAG =", value, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagNotEqualTo(String value) {
            addCriterion("ASSETS_20MILLION_FLAG <>", value, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagGreaterThan(String value) {
            addCriterion("ASSETS_20MILLION_FLAG >", value, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETS_20MILLION_FLAG >=", value, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagLessThan(String value) {
            addCriterion("ASSETS_20MILLION_FLAG <", value, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagLessThanOrEqualTo(String value) {
            addCriterion("ASSETS_20MILLION_FLAG <=", value, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagLike(String value) {
            addCriterion("ASSETS_20MILLION_FLAG like", value, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagNotLike(String value) {
            addCriterion("ASSETS_20MILLION_FLAG not like", value, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagIn(List<String> values) {
            addCriterion("ASSETS_20MILLION_FLAG in", values, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagNotIn(List<String> values) {
            addCriterion("ASSETS_20MILLION_FLAG not in", values, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagBetween(String value1, String value2) {
            addCriterion("ASSETS_20MILLION_FLAG between", value1, value2, "assets20millionFlag");
            return (Criteria) this;
        }

        public Criteria andAssets20millionFlagNotBetween(String value1, String value2) {
            addCriterion("ASSETS_20MILLION_FLAG not between", value1, value2, "assets20millionFlag");
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