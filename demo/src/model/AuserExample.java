package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNull() {
            addCriterion("ADMINID is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("ADMINID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(String value) {
            addCriterion("ADMINID =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(String value) {
            addCriterion("ADMINID <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(String value) {
            addCriterion("ADMINID >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINID >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(String value) {
            addCriterion("ADMINID <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(String value) {
            addCriterion("ADMINID <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLike(String value) {
            addCriterion("ADMINID like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotLike(String value) {
            addCriterion("ADMINID not like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<String> values) {
            addCriterion("ADMINID in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<String> values) {
            addCriterion("ADMINID not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(String value1, String value2) {
            addCriterion("ADMINID between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(String value1, String value2) {
            addCriterion("ADMINID not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("ORGID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("ORGID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("ORGID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("ORGID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("ORGID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("ORGID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("ORGID like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("ORGID not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("ORGID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("ORGID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("ORGID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("ORGID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andStamppasswordIsNull() {
            addCriterion("STAMPPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andStamppasswordIsNotNull() {
            addCriterion("STAMPPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andStamppasswordEqualTo(String value) {
            addCriterion("STAMPPASSWORD =", value, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordNotEqualTo(String value) {
            addCriterion("STAMPPASSWORD <>", value, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordGreaterThan(String value) {
            addCriterion("STAMPPASSWORD >", value, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordGreaterThanOrEqualTo(String value) {
            addCriterion("STAMPPASSWORD >=", value, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordLessThan(String value) {
            addCriterion("STAMPPASSWORD <", value, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordLessThanOrEqualTo(String value) {
            addCriterion("STAMPPASSWORD <=", value, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordLike(String value) {
            addCriterion("STAMPPASSWORD like", value, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordNotLike(String value) {
            addCriterion("STAMPPASSWORD not like", value, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordIn(List<String> values) {
            addCriterion("STAMPPASSWORD in", values, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordNotIn(List<String> values) {
            addCriterion("STAMPPASSWORD not in", values, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordBetween(String value1, String value2) {
            addCriterion("STAMPPASSWORD between", value1, value2, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andStamppasswordNotBetween(String value1, String value2) {
            addCriterion("STAMPPASSWORD not between", value1, value2, "stamppassword");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNull() {
            addCriterion("USERLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNotNull() {
            addCriterion("USERLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserlevelEqualTo(Short value) {
            addCriterion("USERLEVEL =", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotEqualTo(Short value) {
            addCriterion("USERLEVEL <>", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThan(Short value) {
            addCriterion("USERLEVEL >", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThanOrEqualTo(Short value) {
            addCriterion("USERLEVEL >=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThan(Short value) {
            addCriterion("USERLEVEL <", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThanOrEqualTo(Short value) {
            addCriterion("USERLEVEL <=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelIn(List<Short> values) {
            addCriterion("USERLEVEL in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotIn(List<Short> values) {
            addCriterion("USERLEVEL not in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelBetween(Short value1, Short value2) {
            addCriterion("USERLEVEL between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotBetween(Short value1, Short value2) {
            addCriterion("USERLEVEL not between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andIsleaderIsNull() {
            addCriterion("ISLEADER is null");
            return (Criteria) this;
        }

        public Criteria andIsleaderIsNotNull() {
            addCriterion("ISLEADER is not null");
            return (Criteria) this;
        }

        public Criteria andIsleaderEqualTo(Short value) {
            addCriterion("ISLEADER =", value, "isleader");
            return (Criteria) this;
        }

        public Criteria andIsleaderNotEqualTo(Short value) {
            addCriterion("ISLEADER <>", value, "isleader");
            return (Criteria) this;
        }

        public Criteria andIsleaderGreaterThan(Short value) {
            addCriterion("ISLEADER >", value, "isleader");
            return (Criteria) this;
        }

        public Criteria andIsleaderGreaterThanOrEqualTo(Short value) {
            addCriterion("ISLEADER >=", value, "isleader");
            return (Criteria) this;
        }

        public Criteria andIsleaderLessThan(Short value) {
            addCriterion("ISLEADER <", value, "isleader");
            return (Criteria) this;
        }

        public Criteria andIsleaderLessThanOrEqualTo(Short value) {
            addCriterion("ISLEADER <=", value, "isleader");
            return (Criteria) this;
        }

        public Criteria andIsleaderIn(List<Short> values) {
            addCriterion("ISLEADER in", values, "isleader");
            return (Criteria) this;
        }

        public Criteria andIsleaderNotIn(List<Short> values) {
            addCriterion("ISLEADER not in", values, "isleader");
            return (Criteria) this;
        }

        public Criteria andIsleaderBetween(Short value1, Short value2) {
            addCriterion("ISLEADER between", value1, value2, "isleader");
            return (Criteria) this;
        }

        public Criteria andIsleaderNotBetween(Short value1, Short value2) {
            addCriterion("ISLEADER not between", value1, value2, "isleader");
            return (Criteria) this;
        }

        public Criteria andExpireddateIsNull() {
            addCriterion("EXPIREDDATE is null");
            return (Criteria) this;
        }

        public Criteria andExpireddateIsNotNull() {
            addCriterion("EXPIREDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpireddateEqualTo(Date value) {
            addCriterion("EXPIREDDATE =", value, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpireddateNotEqualTo(Date value) {
            addCriterion("EXPIREDDATE <>", value, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpireddateGreaterThan(Date value) {
            addCriterion("EXPIREDDATE >", value, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpireddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIREDDATE >=", value, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpireddateLessThan(Date value) {
            addCriterion("EXPIREDDATE <", value, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpireddateLessThanOrEqualTo(Date value) {
            addCriterion("EXPIREDDATE <=", value, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpireddateIn(List<Date> values) {
            addCriterion("EXPIREDDATE in", values, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpireddateNotIn(List<Date> values) {
            addCriterion("EXPIREDDATE not in", values, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpireddateBetween(Date value1, Date value2) {
            addCriterion("EXPIREDDATE between", value1, value2, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpireddateNotBetween(Date value1, Date value2) {
            addCriterion("EXPIREDDATE not between", value1, value2, "expireddate");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNull() {
            addCriterion("EXPIRED is null");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNotNull() {
            addCriterion("EXPIRED is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredEqualTo(Short value) {
            addCriterion("EXPIRED =", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotEqualTo(Short value) {
            addCriterion("EXPIRED <>", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThan(Short value) {
            addCriterion("EXPIRED >", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThanOrEqualTo(Short value) {
            addCriterion("EXPIRED >=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThan(Short value) {
            addCriterion("EXPIRED <", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThanOrEqualTo(Short value) {
            addCriterion("EXPIRED <=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredIn(List<Short> values) {
            addCriterion("EXPIRED in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotIn(List<Short> values) {
            addCriterion("EXPIRED not in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredBetween(Short value1, Short value2) {
            addCriterion("EXPIRED between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotBetween(Short value1, Short value2) {
            addCriterion("EXPIRED not between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("LOGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("LOGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("LOGINTIME =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("LOGINTIME <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("LOGINTIME >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGINTIME >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("LOGINTIME <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGINTIME <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("LOGINTIME in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("LOGINTIME not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("LOGINTIME between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGINTIME not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNull() {
            addCriterion("LOGINIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("LOGINIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("LOGINIP =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("LOGINIP <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("LOGINIP >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("LOGINIP >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("LOGINIP <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("LOGINIP <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("LOGINIP like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("LOGINIP not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("LOGINIP in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("LOGINIP not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("LOGINIP between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("LOGINIP not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("LASTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("LASTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Date value) {
            addCriterion("LASTTIME =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Date value) {
            addCriterion("LASTTIME <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Date value) {
            addCriterion("LASTTIME >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTTIME >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Date value) {
            addCriterion("LASTTIME <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTTIME <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Date> values) {
            addCriterion("LASTTIME in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Date> values) {
            addCriterion("LASTTIME not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Date value1, Date value2) {
            addCriterion("LASTTIME between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTTIME not between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLastipIsNull() {
            addCriterion("LASTIP is null");
            return (Criteria) this;
        }

        public Criteria andLastipIsNotNull() {
            addCriterion("LASTIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastipEqualTo(String value) {
            addCriterion("LASTIP =", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotEqualTo(String value) {
            addCriterion("LASTIP <>", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipGreaterThan(String value) {
            addCriterion("LASTIP >", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipGreaterThanOrEqualTo(String value) {
            addCriterion("LASTIP >=", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLessThan(String value) {
            addCriterion("LASTIP <", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLessThanOrEqualTo(String value) {
            addCriterion("LASTIP <=", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLike(String value) {
            addCriterion("LASTIP like", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotLike(String value) {
            addCriterion("LASTIP not like", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipIn(List<String> values) {
            addCriterion("LASTIP in", values, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotIn(List<String> values) {
            addCriterion("LASTIP not in", values, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipBetween(String value1, String value2) {
            addCriterion("LASTIP between", value1, value2, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotBetween(String value1, String value2) {
            addCriterion("LASTIP not between", value1, value2, "lastip");
            return (Criteria) this;
        }

        public Criteria andSkinIsNull() {
            addCriterion("SKIN is null");
            return (Criteria) this;
        }

        public Criteria andSkinIsNotNull() {
            addCriterion("SKIN is not null");
            return (Criteria) this;
        }

        public Criteria andSkinEqualTo(String value) {
            addCriterion("SKIN =", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotEqualTo(String value) {
            addCriterion("SKIN <>", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThan(String value) {
            addCriterion("SKIN >", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThanOrEqualTo(String value) {
            addCriterion("SKIN >=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThan(String value) {
            addCriterion("SKIN <", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThanOrEqualTo(String value) {
            addCriterion("SKIN <=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLike(String value) {
            addCriterion("SKIN like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotLike(String value) {
            addCriterion("SKIN not like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinIn(List<String> values) {
            addCriterion("SKIN in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotIn(List<String> values) {
            addCriterion("SKIN not in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinBetween(String value1, String value2) {
            addCriterion("SKIN between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotBetween(String value1, String value2) {
            addCriterion("SKIN not between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andIpconfigIsNull() {
            addCriterion("IPCONFIG is null");
            return (Criteria) this;
        }

        public Criteria andIpconfigIsNotNull() {
            addCriterion("IPCONFIG is not null");
            return (Criteria) this;
        }

        public Criteria andIpconfigEqualTo(String value) {
            addCriterion("IPCONFIG =", value, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigNotEqualTo(String value) {
            addCriterion("IPCONFIG <>", value, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigGreaterThan(String value) {
            addCriterion("IPCONFIG >", value, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigGreaterThanOrEqualTo(String value) {
            addCriterion("IPCONFIG >=", value, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigLessThan(String value) {
            addCriterion("IPCONFIG <", value, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigLessThanOrEqualTo(String value) {
            addCriterion("IPCONFIG <=", value, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigLike(String value) {
            addCriterion("IPCONFIG like", value, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigNotLike(String value) {
            addCriterion("IPCONFIG not like", value, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigIn(List<String> values) {
            addCriterion("IPCONFIG in", values, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigNotIn(List<String> values) {
            addCriterion("IPCONFIG not in", values, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigBetween(String value1, String value2) {
            addCriterion("IPCONFIG between", value1, value2, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andIpconfigNotBetween(String value1, String value2) {
            addCriterion("IPCONFIG not between", value1, value2, "ipconfig");
            return (Criteria) this;
        }

        public Criteria andLangcodeIsNull() {
            addCriterion("LANGCODE is null");
            return (Criteria) this;
        }

        public Criteria andLangcodeIsNotNull() {
            addCriterion("LANGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLangcodeEqualTo(String value) {
            addCriterion("LANGCODE =", value, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeNotEqualTo(String value) {
            addCriterion("LANGCODE <>", value, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeGreaterThan(String value) {
            addCriterion("LANGCODE >", value, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeGreaterThanOrEqualTo(String value) {
            addCriterion("LANGCODE >=", value, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeLessThan(String value) {
            addCriterion("LANGCODE <", value, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeLessThanOrEqualTo(String value) {
            addCriterion("LANGCODE <=", value, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeLike(String value) {
            addCriterion("LANGCODE like", value, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeNotLike(String value) {
            addCriterion("LANGCODE not like", value, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeIn(List<String> values) {
            addCriterion("LANGCODE in", values, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeNotIn(List<String> values) {
            addCriterion("LANGCODE not in", values, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeBetween(String value1, String value2) {
            addCriterion("LANGCODE between", value1, value2, "langcode");
            return (Criteria) this;
        }

        public Criteria andLangcodeNotBetween(String value1, String value2) {
            addCriterion("LANGCODE not between", value1, value2, "langcode");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("USERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("USERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("USERTYPE =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("USERTYPE <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("USERTYPE >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("USERTYPE >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("USERTYPE <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("USERTYPE <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("USERTYPE like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("USERTYPE not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<String> values) {
            addCriterion("USERTYPE in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<String> values) {
            addCriterion("USERTYPE not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("USERTYPE between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("USERTYPE not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andPostidIsNull() {
            addCriterion("POSTID is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("POSTID is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("POSTID =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("POSTID <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("POSTID >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("POSTID >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("POSTID <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("POSTID <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("POSTID in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("POSTID not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("POSTID between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("POSTID not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("SCHOOL =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("SCHOOL <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("SCHOOL >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("SCHOOL <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("SCHOOL like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("SCHOOL not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("SCHOOL in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("SCHOOL not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("SCHOOL between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("SCHOOL not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andGraduationIsNull() {
            addCriterion("GRADUATION is null");
            return (Criteria) this;
        }

        public Criteria andGraduationIsNotNull() {
            addCriterion("GRADUATION is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationEqualTo(Short value) {
            addCriterion("GRADUATION =", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationNotEqualTo(Short value) {
            addCriterion("GRADUATION <>", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationGreaterThan(Short value) {
            addCriterion("GRADUATION >", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationGreaterThanOrEqualTo(Short value) {
            addCriterion("GRADUATION >=", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationLessThan(Short value) {
            addCriterion("GRADUATION <", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationLessThanOrEqualTo(Short value) {
            addCriterion("GRADUATION <=", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationIn(List<Short> values) {
            addCriterion("GRADUATION in", values, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationNotIn(List<Short> values) {
            addCriterion("GRADUATION not in", values, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationBetween(Short value1, Short value2) {
            addCriterion("GRADUATION between", value1, value2, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationNotBetween(Short value1, Short value2) {
            addCriterion("GRADUATION not between", value1, value2, "graduation");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(Short value) {
            addCriterion("DEGREE =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(Short value) {
            addCriterion("DEGREE <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(Short value) {
            addCriterion("DEGREE >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(Short value) {
            addCriterion("DEGREE >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(Short value) {
            addCriterion("DEGREE <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(Short value) {
            addCriterion("DEGREE <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<Short> values) {
            addCriterion("DEGREE in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<Short> values) {
            addCriterion("DEGREE not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(Short value1, Short value2) {
            addCriterion("DEGREE between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(Short value1, Short value2) {
            addCriterion("DEGREE not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("MAJOR not between", value1, value2, "major");
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

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
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

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("MODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("MODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("MODIFYTIME =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("MODIFYTIME <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("MODIFYTIME >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("MODIFYTIME <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("MODIFYTIME in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("MODIFYTIME not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andErpidIsNull() {
            addCriterion("ERPID is null");
            return (Criteria) this;
        }

        public Criteria andErpidIsNotNull() {
            addCriterion("ERPID is not null");
            return (Criteria) this;
        }

        public Criteria andErpidEqualTo(String value) {
            addCriterion("ERPID =", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidNotEqualTo(String value) {
            addCriterion("ERPID <>", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidGreaterThan(String value) {
            addCriterion("ERPID >", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidGreaterThanOrEqualTo(String value) {
            addCriterion("ERPID >=", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidLessThan(String value) {
            addCriterion("ERPID <", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidLessThanOrEqualTo(String value) {
            addCriterion("ERPID <=", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidLike(String value) {
            addCriterion("ERPID like", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidNotLike(String value) {
            addCriterion("ERPID not like", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidIn(List<String> values) {
            addCriterion("ERPID in", values, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidNotIn(List<String> values) {
            addCriterion("ERPID not in", values, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidBetween(String value1, String value2) {
            addCriterion("ERPID between", value1, value2, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidNotBetween(String value1, String value2) {
            addCriterion("ERPID not between", value1, value2, "erpid");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderIsNull() {
            addCriterion("SUPERIORLEADER is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderIsNotNull() {
            addCriterion("SUPERIORLEADER is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderEqualTo(String value) {
            addCriterion("SUPERIORLEADER =", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderNotEqualTo(String value) {
            addCriterion("SUPERIORLEADER <>", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderGreaterThan(String value) {
            addCriterion("SUPERIORLEADER >", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERIORLEADER >=", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderLessThan(String value) {
            addCriterion("SUPERIORLEADER <", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderLessThanOrEqualTo(String value) {
            addCriterion("SUPERIORLEADER <=", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderLike(String value) {
            addCriterion("SUPERIORLEADER like", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderNotLike(String value) {
            addCriterion("SUPERIORLEADER not like", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderIn(List<String> values) {
            addCriterion("SUPERIORLEADER in", values, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderNotIn(List<String> values) {
            addCriterion("SUPERIORLEADER not in", values, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderBetween(String value1, String value2) {
            addCriterion("SUPERIORLEADER between", value1, value2, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderNotBetween(String value1, String value2) {
            addCriterion("SUPERIORLEADER not between", value1, value2, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("POST like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("POST not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "post");
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