package mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class UsrInfoSynExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrInfoSynExample() {
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

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andAcctModeIsNull() {
            addCriterion("ACCT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andAcctModeIsNotNull() {
            addCriterion("ACCT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andAcctModeEqualTo(String value) {
            addCriterion("ACCT_MODE =", value, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeNotEqualTo(String value) {
            addCriterion("ACCT_MODE <>", value, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeGreaterThan(String value) {
            addCriterion("ACCT_MODE >", value, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_MODE >=", value, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeLessThan(String value) {
            addCriterion("ACCT_MODE <", value, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeLessThanOrEqualTo(String value) {
            addCriterion("ACCT_MODE <=", value, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeLike(String value) {
            addCriterion("ACCT_MODE like", value, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeNotLike(String value) {
            addCriterion("ACCT_MODE not like", value, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeIn(List<String> values) {
            addCriterion("ACCT_MODE in", values, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeNotIn(List<String> values) {
            addCriterion("ACCT_MODE not in", values, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeBetween(String value1, String value2) {
            addCriterion("ACCT_MODE between", value1, value2, "acctMode");
            return (Criteria) this;
        }

        public Criteria andAcctModeNotBetween(String value1, String value2) {
            addCriterion("ACCT_MODE not between", value1, value2, "acctMode");
            return (Criteria) this;
        }

        public Criteria andUsrMailIsNull() {
            addCriterion("USR_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andUsrMailIsNotNull() {
            addCriterion("USR_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUsrMailEqualTo(String value) {
            addCriterion("USR_MAIL =", value, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailNotEqualTo(String value) {
            addCriterion("USR_MAIL <>", value, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailGreaterThan(String value) {
            addCriterion("USR_MAIL >", value, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailGreaterThanOrEqualTo(String value) {
            addCriterion("USR_MAIL >=", value, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailLessThan(String value) {
            addCriterion("USR_MAIL <", value, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailLessThanOrEqualTo(String value) {
            addCriterion("USR_MAIL <=", value, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailLike(String value) {
            addCriterion("USR_MAIL like", value, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailNotLike(String value) {
            addCriterion("USR_MAIL not like", value, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailIn(List<String> values) {
            addCriterion("USR_MAIL in", values, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailNotIn(List<String> values) {
            addCriterion("USR_MAIL not in", values, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailBetween(String value1, String value2) {
            addCriterion("USR_MAIL between", value1, value2, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMailNotBetween(String value1, String value2) {
            addCriterion("USR_MAIL not between", value1, value2, "usrMail");
            return (Criteria) this;
        }

        public Criteria andUsrMpIsNull() {
            addCriterion("USR_MP is null");
            return (Criteria) this;
        }

        public Criteria andUsrMpIsNotNull() {
            addCriterion("USR_MP is not null");
            return (Criteria) this;
        }

        public Criteria andUsrMpEqualTo(String value) {
            addCriterion("USR_MP =", value, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpNotEqualTo(String value) {
            addCriterion("USR_MP <>", value, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpGreaterThan(String value) {
            addCriterion("USR_MP >", value, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpGreaterThanOrEqualTo(String value) {
            addCriterion("USR_MP >=", value, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpLessThan(String value) {
            addCriterion("USR_MP <", value, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpLessThanOrEqualTo(String value) {
            addCriterion("USR_MP <=", value, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpLike(String value) {
            addCriterion("USR_MP like", value, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpNotLike(String value) {
            addCriterion("USR_MP not like", value, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpIn(List<String> values) {
            addCriterion("USR_MP in", values, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpNotIn(List<String> values) {
            addCriterion("USR_MP not in", values, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpBetween(String value1, String value2) {
            addCriterion("USR_MP between", value1, value2, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrMpNotBetween(String value1, String value2) {
            addCriterion("USR_MP not between", value1, value2, "usrMp");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNull() {
            addCriterion("USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("USR_NAME =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("USR_NAME <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("USR_NAME >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NAME >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("USR_NAME <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("USR_NAME <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("USR_NAME like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("USR_NAME not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("USR_NAME in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("USR_NAME not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("USR_NAME between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("USR_NAME not between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortIsNull() {
            addCriterion("USR_NAME_SHORT is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortIsNotNull() {
            addCriterion("USR_NAME_SHORT is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortEqualTo(String value) {
            addCriterion("USR_NAME_SHORT =", value, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortNotEqualTo(String value) {
            addCriterion("USR_NAME_SHORT <>", value, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortGreaterThan(String value) {
            addCriterion("USR_NAME_SHORT >", value, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NAME_SHORT >=", value, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortLessThan(String value) {
            addCriterion("USR_NAME_SHORT <", value, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortLessThanOrEqualTo(String value) {
            addCriterion("USR_NAME_SHORT <=", value, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortLike(String value) {
            addCriterion("USR_NAME_SHORT like", value, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortNotLike(String value) {
            addCriterion("USR_NAME_SHORT not like", value, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortIn(List<String> values) {
            addCriterion("USR_NAME_SHORT in", values, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortNotIn(List<String> values) {
            addCriterion("USR_NAME_SHORT not in", values, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortBetween(String value1, String value2) {
            addCriterion("USR_NAME_SHORT between", value1, value2, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrNameShortNotBetween(String value1, String value2) {
            addCriterion("USR_NAME_SHORT not between", value1, value2, "usrNameShort");
            return (Criteria) this;
        }

        public Criteria andUsrTelIsNull() {
            addCriterion("USR_TEL is null");
            return (Criteria) this;
        }

        public Criteria andUsrTelIsNotNull() {
            addCriterion("USR_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andUsrTelEqualTo(String value) {
            addCriterion("USR_TEL =", value, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelNotEqualTo(String value) {
            addCriterion("USR_TEL <>", value, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelGreaterThan(String value) {
            addCriterion("USR_TEL >", value, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelGreaterThanOrEqualTo(String value) {
            addCriterion("USR_TEL >=", value, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelLessThan(String value) {
            addCriterion("USR_TEL <", value, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelLessThanOrEqualTo(String value) {
            addCriterion("USR_TEL <=", value, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelLike(String value) {
            addCriterion("USR_TEL like", value, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelNotLike(String value) {
            addCriterion("USR_TEL not like", value, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelIn(List<String> values) {
            addCriterion("USR_TEL in", values, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelNotIn(List<String> values) {
            addCriterion("USR_TEL not in", values, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelBetween(String value1, String value2) {
            addCriterion("USR_TEL between", value1, value2, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrTelNotBetween(String value1, String value2) {
            addCriterion("USR_TEL not between", value1, value2, "usrTel");
            return (Criteria) this;
        }

        public Criteria andUsrStatIsNull() {
            addCriterion("USR_STAT is null");
            return (Criteria) this;
        }

        public Criteria andUsrStatIsNotNull() {
            addCriterion("USR_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andUsrStatEqualTo(String value) {
            addCriterion("USR_STAT =", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatNotEqualTo(String value) {
            addCriterion("USR_STAT <>", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatGreaterThan(String value) {
            addCriterion("USR_STAT >", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatGreaterThanOrEqualTo(String value) {
            addCriterion("USR_STAT >=", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatLessThan(String value) {
            addCriterion("USR_STAT <", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatLessThanOrEqualTo(String value) {
            addCriterion("USR_STAT <=", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatLike(String value) {
            addCriterion("USR_STAT like", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatNotLike(String value) {
            addCriterion("USR_STAT not like", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatIn(List<String> values) {
            addCriterion("USR_STAT in", values, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatNotIn(List<String> values) {
            addCriterion("USR_STAT not in", values, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatBetween(String value1, String value2) {
            addCriterion("USR_STAT between", value1, value2, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatNotBetween(String value1, String value2) {
            addCriterion("USR_STAT not between", value1, value2, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrTypeIsNull() {
            addCriterion("USR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsrTypeIsNotNull() {
            addCriterion("USR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrTypeEqualTo(String value) {
            addCriterion("USR_TYPE =", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeNotEqualTo(String value) {
            addCriterion("USR_TYPE <>", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeGreaterThan(String value) {
            addCriterion("USR_TYPE >", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USR_TYPE >=", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeLessThan(String value) {
            addCriterion("USR_TYPE <", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeLessThanOrEqualTo(String value) {
            addCriterion("USR_TYPE <=", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeLike(String value) {
            addCriterion("USR_TYPE like", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeNotLike(String value) {
            addCriterion("USR_TYPE not like", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeIn(List<String> values) {
            addCriterion("USR_TYPE in", values, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeNotIn(List<String> values) {
            addCriterion("USR_TYPE not in", values, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeBetween(String value1, String value2) {
            addCriterion("USR_TYPE between", value1, value2, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeNotBetween(String value1, String value2) {
            addCriterion("USR_TYPE not between", value1, value2, "usrType");
            return (Criteria) this;
        }

        public Criteria andChkTypeIsNull() {
            addCriterion("CHK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChkTypeIsNotNull() {
            addCriterion("CHK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChkTypeEqualTo(String value) {
            addCriterion("CHK_TYPE =", value, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeNotEqualTo(String value) {
            addCriterion("CHK_TYPE <>", value, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeGreaterThan(String value) {
            addCriterion("CHK_TYPE >", value, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_TYPE >=", value, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeLessThan(String value) {
            addCriterion("CHK_TYPE <", value, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeLessThanOrEqualTo(String value) {
            addCriterion("CHK_TYPE <=", value, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeLike(String value) {
            addCriterion("CHK_TYPE like", value, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeNotLike(String value) {
            addCriterion("CHK_TYPE not like", value, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeIn(List<String> values) {
            addCriterion("CHK_TYPE in", values, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeNotIn(List<String> values) {
            addCriterion("CHK_TYPE not in", values, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeBetween(String value1, String value2) {
            addCriterion("CHK_TYPE between", value1, value2, "chkType");
            return (Criteria) this;
        }

        public Criteria andChkTypeNotBetween(String value1, String value2) {
            addCriterion("CHK_TYPE not between", value1, value2, "chkType");
            return (Criteria) this;
        }

        public Criteria andUsrSexIsNull() {
            addCriterion("USR_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUsrSexIsNotNull() {
            addCriterion("USR_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUsrSexEqualTo(String value) {
            addCriterion("USR_SEX =", value, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexNotEqualTo(String value) {
            addCriterion("USR_SEX <>", value, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexGreaterThan(String value) {
            addCriterion("USR_SEX >", value, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexGreaterThanOrEqualTo(String value) {
            addCriterion("USR_SEX >=", value, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexLessThan(String value) {
            addCriterion("USR_SEX <", value, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexLessThanOrEqualTo(String value) {
            addCriterion("USR_SEX <=", value, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexLike(String value) {
            addCriterion("USR_SEX like", value, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexNotLike(String value) {
            addCriterion("USR_SEX not like", value, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexIn(List<String> values) {
            addCriterion("USR_SEX in", values, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexNotIn(List<String> values) {
            addCriterion("USR_SEX not in", values, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexBetween(String value1, String value2) {
            addCriterion("USR_SEX between", value1, value2, "usrSex");
            return (Criteria) this;
        }

        public Criteria andUsrSexNotBetween(String value1, String value2) {
            addCriterion("USR_SEX not between", value1, value2, "usrSex");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("CERT_TYPE =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("CERT_TYPE <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("CERT_TYPE >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("CERT_TYPE <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("CERT_TYPE like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("CERT_TYPE not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("CERT_TYPE in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("CERT_TYPE not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("CERT_TYPE between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("CERT_TYPE not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertIdIsNull() {
            addCriterion("CERT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCertIdIsNotNull() {
            addCriterion("CERT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCertIdEqualTo(String value) {
            addCriterion("CERT_ID =", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotEqualTo(String value) {
            addCriterion("CERT_ID <>", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThan(String value) {
            addCriterion("CERT_ID >", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_ID >=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThan(String value) {
            addCriterion("CERT_ID <", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThanOrEqualTo(String value) {
            addCriterion("CERT_ID <=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLike(String value) {
            addCriterion("CERT_ID like", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotLike(String value) {
            addCriterion("CERT_ID not like", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdIn(List<String> values) {
            addCriterion("CERT_ID in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotIn(List<String> values) {
            addCriterion("CERT_ID not in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdBetween(String value1, String value2) {
            addCriterion("CERT_ID between", value1, value2, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotBetween(String value1, String value2) {
            addCriterion("CERT_ID not between", value1, value2, "certId");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIsNull() {
            addCriterion("CORP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIsNotNull() {
            addCriterion("CORP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCorpCodeEqualTo(String value) {
            addCriterion("CORP_CODE =", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotEqualTo(String value) {
            addCriterion("CORP_CODE <>", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeGreaterThan(String value) {
            addCriterion("CORP_CODE >", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_CODE >=", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLessThan(String value) {
            addCriterion("CORP_CODE <", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLessThanOrEqualTo(String value) {
            addCriterion("CORP_CODE <=", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLike(String value) {
            addCriterion("CORP_CODE like", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotLike(String value) {
            addCriterion("CORP_CODE not like", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIn(List<String> values) {
            addCriterion("CORP_CODE in", values, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotIn(List<String> values) {
            addCriterion("CORP_CODE not in", values, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeBetween(String value1, String value2) {
            addCriterion("CORP_CODE between", value1, value2, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotBetween(String value1, String value2) {
            addCriterion("CORP_CODE not between", value1, value2, "corpCode");
            return (Criteria) this;
        }

        public Criteria andUsrProvIsNull() {
            addCriterion("USR_PROV is null");
            return (Criteria) this;
        }

        public Criteria andUsrProvIsNotNull() {
            addCriterion("USR_PROV is not null");
            return (Criteria) this;
        }

        public Criteria andUsrProvEqualTo(String value) {
            addCriterion("USR_PROV =", value, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvNotEqualTo(String value) {
            addCriterion("USR_PROV <>", value, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvGreaterThan(String value) {
            addCriterion("USR_PROV >", value, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvGreaterThanOrEqualTo(String value) {
            addCriterion("USR_PROV >=", value, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvLessThan(String value) {
            addCriterion("USR_PROV <", value, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvLessThanOrEqualTo(String value) {
            addCriterion("USR_PROV <=", value, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvLike(String value) {
            addCriterion("USR_PROV like", value, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvNotLike(String value) {
            addCriterion("USR_PROV not like", value, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvIn(List<String> values) {
            addCriterion("USR_PROV in", values, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvNotIn(List<String> values) {
            addCriterion("USR_PROV not in", values, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvBetween(String value1, String value2) {
            addCriterion("USR_PROV between", value1, value2, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrProvNotBetween(String value1, String value2) {
            addCriterion("USR_PROV not between", value1, value2, "usrProv");
            return (Criteria) this;
        }

        public Criteria andUsrAreaIsNull() {
            addCriterion("USR_AREA is null");
            return (Criteria) this;
        }

        public Criteria andUsrAreaIsNotNull() {
            addCriterion("USR_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andUsrAreaEqualTo(String value) {
            addCriterion("USR_AREA =", value, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaNotEqualTo(String value) {
            addCriterion("USR_AREA <>", value, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaGreaterThan(String value) {
            addCriterion("USR_AREA >", value, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaGreaterThanOrEqualTo(String value) {
            addCriterion("USR_AREA >=", value, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaLessThan(String value) {
            addCriterion("USR_AREA <", value, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaLessThanOrEqualTo(String value) {
            addCriterion("USR_AREA <=", value, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaLike(String value) {
            addCriterion("USR_AREA like", value, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaNotLike(String value) {
            addCriterion("USR_AREA not like", value, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaIn(List<String> values) {
            addCriterion("USR_AREA in", values, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaNotIn(List<String> values) {
            addCriterion("USR_AREA not in", values, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaBetween(String value1, String value2) {
            addCriterion("USR_AREA between", value1, value2, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAreaNotBetween(String value1, String value2) {
            addCriterion("USR_AREA not between", value1, value2, "usrArea");
            return (Criteria) this;
        }

        public Criteria andUsrAddrIsNull() {
            addCriterion("USR_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andUsrAddrIsNotNull() {
            addCriterion("USR_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUsrAddrEqualTo(String value) {
            addCriterion("USR_ADDR =", value, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrNotEqualTo(String value) {
            addCriterion("USR_ADDR <>", value, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrGreaterThan(String value) {
            addCriterion("USR_ADDR >", value, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrGreaterThanOrEqualTo(String value) {
            addCriterion("USR_ADDR >=", value, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrLessThan(String value) {
            addCriterion("USR_ADDR <", value, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrLessThanOrEqualTo(String value) {
            addCriterion("USR_ADDR <=", value, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrLike(String value) {
            addCriterion("USR_ADDR like", value, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrNotLike(String value) {
            addCriterion("USR_ADDR not like", value, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrIn(List<String> values) {
            addCriterion("USR_ADDR in", values, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrNotIn(List<String> values) {
            addCriterion("USR_ADDR not in", values, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrBetween(String value1, String value2) {
            addCriterion("USR_ADDR between", value1, value2, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrAddrNotBetween(String value1, String value2) {
            addCriterion("USR_ADDR not between", value1, value2, "usrAddr");
            return (Criteria) this;
        }

        public Criteria andUsrZipIsNull() {
            addCriterion("USR_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andUsrZipIsNotNull() {
            addCriterion("USR_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andUsrZipEqualTo(String value) {
            addCriterion("USR_ZIP =", value, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipNotEqualTo(String value) {
            addCriterion("USR_ZIP <>", value, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipGreaterThan(String value) {
            addCriterion("USR_ZIP >", value, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipGreaterThanOrEqualTo(String value) {
            addCriterion("USR_ZIP >=", value, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipLessThan(String value) {
            addCriterion("USR_ZIP <", value, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipLessThanOrEqualTo(String value) {
            addCriterion("USR_ZIP <=", value, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipLike(String value) {
            addCriterion("USR_ZIP like", value, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipNotLike(String value) {
            addCriterion("USR_ZIP not like", value, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipIn(List<String> values) {
            addCriterion("USR_ZIP in", values, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipNotIn(List<String> values) {
            addCriterion("USR_ZIP not in", values, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipBetween(String value1, String value2) {
            addCriterion("USR_ZIP between", value1, value2, "usrZip");
            return (Criteria) this;
        }

        public Criteria andUsrZipNotBetween(String value1, String value2) {
            addCriterion("USR_ZIP not between", value1, value2, "usrZip");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("OPEN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("OPEN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(String value) {
            addCriterion("OPEN_DATE =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(String value) {
            addCriterion("OPEN_DATE <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(String value) {
            addCriterion("OPEN_DATE >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_DATE >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(String value) {
            addCriterion("OPEN_DATE <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(String value) {
            addCriterion("OPEN_DATE <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLike(String value) {
            addCriterion("OPEN_DATE like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotLike(String value) {
            addCriterion("OPEN_DATE not like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<String> values) {
            addCriterion("OPEN_DATE in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<String> values) {
            addCriterion("OPEN_DATE not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(String value1, String value2) {
            addCriterion("OPEN_DATE between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(String value1, String value2) {
            addCriterion("OPEN_DATE not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("OPEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("OPEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("OPEN_TIME =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("OPEN_TIME <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("OPEN_TIME >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_TIME >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("OPEN_TIME <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("OPEN_TIME <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("OPEN_TIME like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("OPEN_TIME not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("OPEN_TIME in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("OPEN_TIME not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("OPEN_TIME between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("OPEN_TIME not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdIsNull() {
            addCriterion("OPEN_PROV_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdIsNotNull() {
            addCriterion("OPEN_PROV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdEqualTo(String value) {
            addCriterion("OPEN_PROV_ID =", value, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdNotEqualTo(String value) {
            addCriterion("OPEN_PROV_ID <>", value, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdGreaterThan(String value) {
            addCriterion("OPEN_PROV_ID >", value, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_PROV_ID >=", value, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdLessThan(String value) {
            addCriterion("OPEN_PROV_ID <", value, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_PROV_ID <=", value, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdLike(String value) {
            addCriterion("OPEN_PROV_ID like", value, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdNotLike(String value) {
            addCriterion("OPEN_PROV_ID not like", value, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdIn(List<String> values) {
            addCriterion("OPEN_PROV_ID in", values, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdNotIn(List<String> values) {
            addCriterion("OPEN_PROV_ID not in", values, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdBetween(String value1, String value2) {
            addCriterion("OPEN_PROV_ID between", value1, value2, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenProvIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_PROV_ID not between", value1, value2, "openProvId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdIsNull() {
            addCriterion("OPEN_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdIsNotNull() {
            addCriterion("OPEN_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdEqualTo(String value) {
            addCriterion("OPEN_AREA_ID =", value, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdNotEqualTo(String value) {
            addCriterion("OPEN_AREA_ID <>", value, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdGreaterThan(String value) {
            addCriterion("OPEN_AREA_ID >", value, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_AREA_ID >=", value, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdLessThan(String value) {
            addCriterion("OPEN_AREA_ID <", value, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_AREA_ID <=", value, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdLike(String value) {
            addCriterion("OPEN_AREA_ID like", value, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdNotLike(String value) {
            addCriterion("OPEN_AREA_ID not like", value, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdIn(List<String> values) {
            addCriterion("OPEN_AREA_ID in", values, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdNotIn(List<String> values) {
            addCriterion("OPEN_AREA_ID not in", values, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdBetween(String value1, String value2) {
            addCriterion("OPEN_AREA_ID between", value1, value2, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenAreaIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_AREA_ID not between", value1, value2, "openAreaId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdIsNull() {
            addCriterion("OPEN_BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdIsNotNull() {
            addCriterion("OPEN_BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdEqualTo(String value) {
            addCriterion("OPEN_BANK_ID =", value, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdNotEqualTo(String value) {
            addCriterion("OPEN_BANK_ID <>", value, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdGreaterThan(String value) {
            addCriterion("OPEN_BANK_ID >", value, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_BANK_ID >=", value, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdLessThan(String value) {
            addCriterion("OPEN_BANK_ID <", value, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_BANK_ID <=", value, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdLike(String value) {
            addCriterion("OPEN_BANK_ID like", value, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdNotLike(String value) {
            addCriterion("OPEN_BANK_ID not like", value, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdIn(List<String> values) {
            addCriterion("OPEN_BANK_ID in", values, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdNotIn(List<String> values) {
            addCriterion("OPEN_BANK_ID not in", values, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdBetween(String value1, String value2) {
            addCriterion("OPEN_BANK_ID between", value1, value2, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBankIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_BANK_ID not between", value1, value2, "openBankId");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameIsNull() {
            addCriterion("OPEN_BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameIsNotNull() {
            addCriterion("OPEN_BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameEqualTo(String value) {
            addCriterion("OPEN_BRANCH_NAME =", value, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameNotEqualTo(String value) {
            addCriterion("OPEN_BRANCH_NAME <>", value, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameGreaterThan(String value) {
            addCriterion("OPEN_BRANCH_NAME >", value, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_BRANCH_NAME >=", value, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameLessThan(String value) {
            addCriterion("OPEN_BRANCH_NAME <", value, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameLessThanOrEqualTo(String value) {
            addCriterion("OPEN_BRANCH_NAME <=", value, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameLike(String value) {
            addCriterion("OPEN_BRANCH_NAME like", value, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameNotLike(String value) {
            addCriterion("OPEN_BRANCH_NAME not like", value, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameIn(List<String> values) {
            addCriterion("OPEN_BRANCH_NAME in", values, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameNotIn(List<String> values) {
            addCriterion("OPEN_BRANCH_NAME not in", values, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameBetween(String value1, String value2) {
            addCriterion("OPEN_BRANCH_NAME between", value1, value2, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenBranchNameNotBetween(String value1, String value2) {
            addCriterion("OPEN_BRANCH_NAME not between", value1, value2, "openBranchName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameIsNull() {
            addCriterion("OPEN_ACCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameIsNotNull() {
            addCriterion("OPEN_ACCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameEqualTo(String value) {
            addCriterion("OPEN_ACCT_NAME =", value, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameNotEqualTo(String value) {
            addCriterion("OPEN_ACCT_NAME <>", value, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameGreaterThan(String value) {
            addCriterion("OPEN_ACCT_NAME >", value, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ACCT_NAME >=", value, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameLessThan(String value) {
            addCriterion("OPEN_ACCT_NAME <", value, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ACCT_NAME <=", value, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameLike(String value) {
            addCriterion("OPEN_ACCT_NAME like", value, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameNotLike(String value) {
            addCriterion("OPEN_ACCT_NAME not like", value, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameIn(List<String> values) {
            addCriterion("OPEN_ACCT_NAME in", values, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameNotIn(List<String> values) {
            addCriterion("OPEN_ACCT_NAME not in", values, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameBetween(String value1, String value2) {
            addCriterion("OPEN_ACCT_NAME between", value1, value2, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctNameNotBetween(String value1, String value2) {
            addCriterion("OPEN_ACCT_NAME not between", value1, value2, "openAcctName");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdIsNull() {
            addCriterion("OPEN_ACCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdIsNotNull() {
            addCriterion("OPEN_ACCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdEqualTo(String value) {
            addCriterion("OPEN_ACCT_ID =", value, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdNotEqualTo(String value) {
            addCriterion("OPEN_ACCT_ID <>", value, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdGreaterThan(String value) {
            addCriterion("OPEN_ACCT_ID >", value, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ACCT_ID >=", value, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdLessThan(String value) {
            addCriterion("OPEN_ACCT_ID <", value, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ACCT_ID <=", value, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdLike(String value) {
            addCriterion("OPEN_ACCT_ID like", value, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdNotLike(String value) {
            addCriterion("OPEN_ACCT_ID not like", value, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdIn(List<String> values) {
            addCriterion("OPEN_ACCT_ID in", values, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdNotIn(List<String> values) {
            addCriterion("OPEN_ACCT_ID not in", values, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdBetween(String value1, String value2) {
            addCriterion("OPEN_ACCT_ID between", value1, value2, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andOpenAcctIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ACCT_ID not between", value1, value2, "openAcctId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdIsNull() {
            addCriterion("BSP_PROV_ID is null");
            return (Criteria) this;
        }

        public Criteria andBspProvIdIsNotNull() {
            addCriterion("BSP_PROV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBspProvIdEqualTo(String value) {
            addCriterion("BSP_PROV_ID =", value, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdNotEqualTo(String value) {
            addCriterion("BSP_PROV_ID <>", value, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdGreaterThan(String value) {
            addCriterion("BSP_PROV_ID >", value, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdGreaterThanOrEqualTo(String value) {
            addCriterion("BSP_PROV_ID >=", value, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdLessThan(String value) {
            addCriterion("BSP_PROV_ID <", value, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdLessThanOrEqualTo(String value) {
            addCriterion("BSP_PROV_ID <=", value, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdLike(String value) {
            addCriterion("BSP_PROV_ID like", value, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdNotLike(String value) {
            addCriterion("BSP_PROV_ID not like", value, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdIn(List<String> values) {
            addCriterion("BSP_PROV_ID in", values, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdNotIn(List<String> values) {
            addCriterion("BSP_PROV_ID not in", values, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdBetween(String value1, String value2) {
            addCriterion("BSP_PROV_ID between", value1, value2, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspProvIdNotBetween(String value1, String value2) {
            addCriterion("BSP_PROV_ID not between", value1, value2, "bspProvId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdIsNull() {
            addCriterion("BSP_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdIsNotNull() {
            addCriterion("BSP_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdEqualTo(String value) {
            addCriterion("BSP_AREA_ID =", value, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdNotEqualTo(String value) {
            addCriterion("BSP_AREA_ID <>", value, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdGreaterThan(String value) {
            addCriterion("BSP_AREA_ID >", value, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("BSP_AREA_ID >=", value, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdLessThan(String value) {
            addCriterion("BSP_AREA_ID <", value, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdLessThanOrEqualTo(String value) {
            addCriterion("BSP_AREA_ID <=", value, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdLike(String value) {
            addCriterion("BSP_AREA_ID like", value, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdNotLike(String value) {
            addCriterion("BSP_AREA_ID not like", value, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdIn(List<String> values) {
            addCriterion("BSP_AREA_ID in", values, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdNotIn(List<String> values) {
            addCriterion("BSP_AREA_ID not in", values, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdBetween(String value1, String value2) {
            addCriterion("BSP_AREA_ID between", value1, value2, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspAreaIdNotBetween(String value1, String value2) {
            addCriterion("BSP_AREA_ID not between", value1, value2, "bspAreaId");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameIsNull() {
            addCriterion("BSP_BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameIsNotNull() {
            addCriterion("BSP_BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameEqualTo(String value) {
            addCriterion("BSP_BRANCH_NAME =", value, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameNotEqualTo(String value) {
            addCriterion("BSP_BRANCH_NAME <>", value, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameGreaterThan(String value) {
            addCriterion("BSP_BRANCH_NAME >", value, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BSP_BRANCH_NAME >=", value, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameLessThan(String value) {
            addCriterion("BSP_BRANCH_NAME <", value, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameLessThanOrEqualTo(String value) {
            addCriterion("BSP_BRANCH_NAME <=", value, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameLike(String value) {
            addCriterion("BSP_BRANCH_NAME like", value, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameNotLike(String value) {
            addCriterion("BSP_BRANCH_NAME not like", value, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameIn(List<String> values) {
            addCriterion("BSP_BRANCH_NAME in", values, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameNotIn(List<String> values) {
            addCriterion("BSP_BRANCH_NAME not in", values, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameBetween(String value1, String value2) {
            addCriterion("BSP_BRANCH_NAME between", value1, value2, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspBranchNameNotBetween(String value1, String value2) {
            addCriterion("BSP_BRANCH_NAME not between", value1, value2, "bspBranchName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameIsNull() {
            addCriterion("BSP_ACCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameIsNotNull() {
            addCriterion("BSP_ACCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameEqualTo(String value) {
            addCriterion("BSP_ACCT_NAME =", value, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameNotEqualTo(String value) {
            addCriterion("BSP_ACCT_NAME <>", value, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameGreaterThan(String value) {
            addCriterion("BSP_ACCT_NAME >", value, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("BSP_ACCT_NAME >=", value, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameLessThan(String value) {
            addCriterion("BSP_ACCT_NAME <", value, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameLessThanOrEqualTo(String value) {
            addCriterion("BSP_ACCT_NAME <=", value, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameLike(String value) {
            addCriterion("BSP_ACCT_NAME like", value, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameNotLike(String value) {
            addCriterion("BSP_ACCT_NAME not like", value, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameIn(List<String> values) {
            addCriterion("BSP_ACCT_NAME in", values, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameNotIn(List<String> values) {
            addCriterion("BSP_ACCT_NAME not in", values, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameBetween(String value1, String value2) {
            addCriterion("BSP_ACCT_NAME between", value1, value2, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctNameNotBetween(String value1, String value2) {
            addCriterion("BSP_ACCT_NAME not between", value1, value2, "bspAcctName");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdIsNull() {
            addCriterion("BSP_ACCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdIsNotNull() {
            addCriterion("BSP_ACCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdEqualTo(String value) {
            addCriterion("BSP_ACCT_ID =", value, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdNotEqualTo(String value) {
            addCriterion("BSP_ACCT_ID <>", value, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdGreaterThan(String value) {
            addCriterion("BSP_ACCT_ID >", value, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdGreaterThanOrEqualTo(String value) {
            addCriterion("BSP_ACCT_ID >=", value, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdLessThan(String value) {
            addCriterion("BSP_ACCT_ID <", value, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdLessThanOrEqualTo(String value) {
            addCriterion("BSP_ACCT_ID <=", value, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdLike(String value) {
            addCriterion("BSP_ACCT_ID like", value, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdNotLike(String value) {
            addCriterion("BSP_ACCT_ID not like", value, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdIn(List<String> values) {
            addCriterion("BSP_ACCT_ID in", values, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdNotIn(List<String> values) {
            addCriterion("BSP_ACCT_ID not in", values, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdBetween(String value1, String value2) {
            addCriterion("BSP_ACCT_ID between", value1, value2, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andBspAcctIdNotBetween(String value1, String value2) {
            addCriterion("BSP_ACCT_ID not between", value1, value2, "bspAcctId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdIsNull() {
            addCriterion("PWD_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdIsNotNull() {
            addCriterion("PWD_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdEqualTo(String value) {
            addCriterion("PWD_CARD_ID =", value, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdNotEqualTo(String value) {
            addCriterion("PWD_CARD_ID <>", value, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdGreaterThan(String value) {
            addCriterion("PWD_CARD_ID >", value, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("PWD_CARD_ID >=", value, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdLessThan(String value) {
            addCriterion("PWD_CARD_ID <", value, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdLessThanOrEqualTo(String value) {
            addCriterion("PWD_CARD_ID <=", value, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdLike(String value) {
            addCriterion("PWD_CARD_ID like", value, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdNotLike(String value) {
            addCriterion("PWD_CARD_ID not like", value, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdIn(List<String> values) {
            addCriterion("PWD_CARD_ID in", values, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdNotIn(List<String> values) {
            addCriterion("PWD_CARD_ID not in", values, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdBetween(String value1, String value2) {
            addCriterion("PWD_CARD_ID between", value1, value2, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPwdCardIdNotBetween(String value1, String value2) {
            addCriterion("PWD_CARD_ID not between", value1, value2, "pwdCardId");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNull() {
            addCriterion("PAY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNotNull() {
            addCriterion("PAY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPayFlagEqualTo(String value) {
            addCriterion("PAY_FLAG =", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotEqualTo(String value) {
            addCriterion("PAY_FLAG <>", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThan(String value) {
            addCriterion("PAY_FLAG >", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_FLAG >=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThan(String value) {
            addCriterion("PAY_FLAG <", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThanOrEqualTo(String value) {
            addCriterion("PAY_FLAG <=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLike(String value) {
            addCriterion("PAY_FLAG like", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotLike(String value) {
            addCriterion("PAY_FLAG not like", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagIn(List<String> values) {
            addCriterion("PAY_FLAG in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotIn(List<String> values) {
            addCriterion("PAY_FLAG not in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagBetween(String value1, String value2) {
            addCriterion("PAY_FLAG between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotBetween(String value1, String value2) {
            addCriterion("PAY_FLAG not between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andIsCardCashIsNull() {
            addCriterion("IS_CARD_CASH is null");
            return (Criteria) this;
        }

        public Criteria andIsCardCashIsNotNull() {
            addCriterion("IS_CARD_CASH is not null");
            return (Criteria) this;
        }

        public Criteria andIsCardCashEqualTo(String value) {
            addCriterion("IS_CARD_CASH =", value, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashNotEqualTo(String value) {
            addCriterion("IS_CARD_CASH <>", value, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashGreaterThan(String value) {
            addCriterion("IS_CARD_CASH >", value, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CARD_CASH >=", value, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashLessThan(String value) {
            addCriterion("IS_CARD_CASH <", value, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashLessThanOrEqualTo(String value) {
            addCriterion("IS_CARD_CASH <=", value, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashLike(String value) {
            addCriterion("IS_CARD_CASH like", value, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashNotLike(String value) {
            addCriterion("IS_CARD_CASH not like", value, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashIn(List<String> values) {
            addCriterion("IS_CARD_CASH in", values, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashNotIn(List<String> values) {
            addCriterion("IS_CARD_CASH not in", values, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashBetween(String value1, String value2) {
            addCriterion("IS_CARD_CASH between", value1, value2, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardCashNotBetween(String value1, String value2) {
            addCriterion("IS_CARD_CASH not between", value1, value2, "isCardCash");
            return (Criteria) this;
        }

        public Criteria andIsCardBspIsNull() {
            addCriterion("IS_CARD_BSP is null");
            return (Criteria) this;
        }

        public Criteria andIsCardBspIsNotNull() {
            addCriterion("IS_CARD_BSP is not null");
            return (Criteria) this;
        }

        public Criteria andIsCardBspEqualTo(String value) {
            addCriterion("IS_CARD_BSP =", value, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspNotEqualTo(String value) {
            addCriterion("IS_CARD_BSP <>", value, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspGreaterThan(String value) {
            addCriterion("IS_CARD_BSP >", value, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CARD_BSP >=", value, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspLessThan(String value) {
            addCriterion("IS_CARD_BSP <", value, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspLessThanOrEqualTo(String value) {
            addCriterion("IS_CARD_BSP <=", value, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspLike(String value) {
            addCriterion("IS_CARD_BSP like", value, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspNotLike(String value) {
            addCriterion("IS_CARD_BSP not like", value, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspIn(List<String> values) {
            addCriterion("IS_CARD_BSP in", values, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspNotIn(List<String> values) {
            addCriterion("IS_CARD_BSP not in", values, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspBetween(String value1, String value2) {
            addCriterion("IS_CARD_BSP between", value1, value2, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardBspNotBetween(String value1, String value2) {
            addCriterion("IS_CARD_BSP not between", value1, value2, "isCardBsp");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfIsNull() {
            addCriterion("IS_CARD_OUT_TRF is null");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfIsNotNull() {
            addCriterion("IS_CARD_OUT_TRF is not null");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfEqualTo(String value) {
            addCriterion("IS_CARD_OUT_TRF =", value, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfNotEqualTo(String value) {
            addCriterion("IS_CARD_OUT_TRF <>", value, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfGreaterThan(String value) {
            addCriterion("IS_CARD_OUT_TRF >", value, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CARD_OUT_TRF >=", value, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfLessThan(String value) {
            addCriterion("IS_CARD_OUT_TRF <", value, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfLessThanOrEqualTo(String value) {
            addCriterion("IS_CARD_OUT_TRF <=", value, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfLike(String value) {
            addCriterion("IS_CARD_OUT_TRF like", value, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfNotLike(String value) {
            addCriterion("IS_CARD_OUT_TRF not like", value, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfIn(List<String> values) {
            addCriterion("IS_CARD_OUT_TRF in", values, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfNotIn(List<String> values) {
            addCriterion("IS_CARD_OUT_TRF not in", values, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfBetween(String value1, String value2) {
            addCriterion("IS_CARD_OUT_TRF between", value1, value2, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andIsCardOutTrfNotBetween(String value1, String value2) {
            addCriterion("IS_CARD_OUT_TRF not between", value1, value2, "isCardOutTrf");
            return (Criteria) this;
        }

        public Criteria andCertChkIsNull() {
            addCriterion("CERT_CHK is null");
            return (Criteria) this;
        }

        public Criteria andCertChkIsNotNull() {
            addCriterion("CERT_CHK is not null");
            return (Criteria) this;
        }

        public Criteria andCertChkEqualTo(String value) {
            addCriterion("CERT_CHK =", value, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkNotEqualTo(String value) {
            addCriterion("CERT_CHK <>", value, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkGreaterThan(String value) {
            addCriterion("CERT_CHK >", value, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_CHK >=", value, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkLessThan(String value) {
            addCriterion("CERT_CHK <", value, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkLessThanOrEqualTo(String value) {
            addCriterion("CERT_CHK <=", value, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkLike(String value) {
            addCriterion("CERT_CHK like", value, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkNotLike(String value) {
            addCriterion("CERT_CHK not like", value, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkIn(List<String> values) {
            addCriterion("CERT_CHK in", values, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkNotIn(List<String> values) {
            addCriterion("CERT_CHK not in", values, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkBetween(String value1, String value2) {
            addCriterion("CERT_CHK between", value1, value2, "certChk");
            return (Criteria) this;
        }

        public Criteria andCertChkNotBetween(String value1, String value2) {
            addCriterion("CERT_CHK not between", value1, value2, "certChk");
            return (Criteria) this;
        }

        public Criteria andCashCntIsNull() {
            addCriterion("CASH_CNT is null");
            return (Criteria) this;
        }

        public Criteria andCashCntIsNotNull() {
            addCriterion("CASH_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andCashCntEqualTo(Short value) {
            addCriterion("CASH_CNT =", value, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andCashCntNotEqualTo(Short value) {
            addCriterion("CASH_CNT <>", value, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andCashCntGreaterThan(Short value) {
            addCriterion("CASH_CNT >", value, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andCashCntGreaterThanOrEqualTo(Short value) {
            addCriterion("CASH_CNT >=", value, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andCashCntLessThan(Short value) {
            addCriterion("CASH_CNT <", value, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andCashCntLessThanOrEqualTo(Short value) {
            addCriterion("CASH_CNT <=", value, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andCashCntIn(List<Short> values) {
            addCriterion("CASH_CNT in", values, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andCashCntNotIn(List<Short> values) {
            addCriterion("CASH_CNT not in", values, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andCashCntBetween(Short value1, Short value2) {
            addCriterion("CASH_CNT between", value1, value2, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andCashCntNotBetween(Short value1, Short value2) {
            addCriterion("CASH_CNT not between", value1, value2, "cashCnt");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctIsNull() {
            addCriterion("IS_UPD_ACCT is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctIsNotNull() {
            addCriterion("IS_UPD_ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctEqualTo(String value) {
            addCriterion("IS_UPD_ACCT =", value, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctNotEqualTo(String value) {
            addCriterion("IS_UPD_ACCT <>", value, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctGreaterThan(String value) {
            addCriterion("IS_UPD_ACCT >", value, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctGreaterThanOrEqualTo(String value) {
            addCriterion("IS_UPD_ACCT >=", value, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctLessThan(String value) {
            addCriterion("IS_UPD_ACCT <", value, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctLessThanOrEqualTo(String value) {
            addCriterion("IS_UPD_ACCT <=", value, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctLike(String value) {
            addCriterion("IS_UPD_ACCT like", value, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctNotLike(String value) {
            addCriterion("IS_UPD_ACCT not like", value, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctIn(List<String> values) {
            addCriterion("IS_UPD_ACCT in", values, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctNotIn(List<String> values) {
            addCriterion("IS_UPD_ACCT not in", values, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctBetween(String value1, String value2) {
            addCriterion("IS_UPD_ACCT between", value1, value2, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdAcctNotBetween(String value1, String value2) {
            addCriterion("IS_UPD_ACCT not between", value1, value2, "isUpdAcct");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdIsNull() {
            addCriterion("IS_UPD_MAG_PWD is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdIsNotNull() {
            addCriterion("IS_UPD_MAG_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdEqualTo(String value) {
            addCriterion("IS_UPD_MAG_PWD =", value, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdNotEqualTo(String value) {
            addCriterion("IS_UPD_MAG_PWD <>", value, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdGreaterThan(String value) {
            addCriterion("IS_UPD_MAG_PWD >", value, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdGreaterThanOrEqualTo(String value) {
            addCriterion("IS_UPD_MAG_PWD >=", value, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdLessThan(String value) {
            addCriterion("IS_UPD_MAG_PWD <", value, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdLessThanOrEqualTo(String value) {
            addCriterion("IS_UPD_MAG_PWD <=", value, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdLike(String value) {
            addCriterion("IS_UPD_MAG_PWD like", value, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdNotLike(String value) {
            addCriterion("IS_UPD_MAG_PWD not like", value, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdIn(List<String> values) {
            addCriterion("IS_UPD_MAG_PWD in", values, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdNotIn(List<String> values) {
            addCriterion("IS_UPD_MAG_PWD not in", values, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdBetween(String value1, String value2) {
            addCriterion("IS_UPD_MAG_PWD between", value1, value2, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdMagPwdNotBetween(String value1, String value2) {
            addCriterion("IS_UPD_MAG_PWD not between", value1, value2, "isUpdMagPwd");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIsNull() {
            addCriterion("INFO_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIsNotNull() {
            addCriterion("INFO_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceEqualTo(String value) {
            addCriterion("INFO_SOURCE =", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotEqualTo(String value) {
            addCriterion("INFO_SOURCE <>", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceGreaterThan(String value) {
            addCriterion("INFO_SOURCE >", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_SOURCE >=", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLessThan(String value) {
            addCriterion("INFO_SOURCE <", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLessThanOrEqualTo(String value) {
            addCriterion("INFO_SOURCE <=", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLike(String value) {
            addCriterion("INFO_SOURCE like", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotLike(String value) {
            addCriterion("INFO_SOURCE not like", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIn(List<String> values) {
            addCriterion("INFO_SOURCE in", values, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotIn(List<String> values) {
            addCriterion("INFO_SOURCE not in", values, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceBetween(String value1, String value2) {
            addCriterion("INFO_SOURCE between", value1, value2, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotBetween(String value1, String value2) {
            addCriterion("INFO_SOURCE not between", value1, value2, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescIsNull() {
            addCriterion("INFO_SOURCE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescIsNotNull() {
            addCriterion("INFO_SOURCE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescEqualTo(String value) {
            addCriterion("INFO_SOURCE_DESC =", value, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescNotEqualTo(String value) {
            addCriterion("INFO_SOURCE_DESC <>", value, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescGreaterThan(String value) {
            addCriterion("INFO_SOURCE_DESC >", value, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_SOURCE_DESC >=", value, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescLessThan(String value) {
            addCriterion("INFO_SOURCE_DESC <", value, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescLessThanOrEqualTo(String value) {
            addCriterion("INFO_SOURCE_DESC <=", value, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescLike(String value) {
            addCriterion("INFO_SOURCE_DESC like", value, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescNotLike(String value) {
            addCriterion("INFO_SOURCE_DESC not like", value, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescIn(List<String> values) {
            addCriterion("INFO_SOURCE_DESC in", values, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescNotIn(List<String> values) {
            addCriterion("INFO_SOURCE_DESC not in", values, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescBetween(String value1, String value2) {
            addCriterion("INFO_SOURCE_DESC between", value1, value2, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andInfoSourceDescNotBetween(String value1, String value2) {
            addCriterion("INFO_SOURCE_DESC not between", value1, value2, "infoSourceDesc");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("USER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("USER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(String value) {
            addCriterion("USER_LEVEL =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(String value) {
            addCriterion("USER_LEVEL <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(String value) {
            addCriterion("USER_LEVEL >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(String value) {
            addCriterion("USER_LEVEL <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLike(String value) {
            addCriterion("USER_LEVEL like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotLike(String value) {
            addCriterion("USER_LEVEL not like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<String> values) {
            addCriterion("USER_LEVEL in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<String> values) {
            addCriterion("USER_LEVEL not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(String value1, String value2) {
            addCriterion("USER_LEVEL between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(String value1, String value2) {
            addCriterion("USER_LEVEL not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("USER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("USER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(String value) {
            addCriterion("USER_ROLE =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(String value) {
            addCriterion("USER_ROLE <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(String value) {
            addCriterion("USER_ROLE >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ROLE >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(String value) {
            addCriterion("USER_ROLE <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(String value) {
            addCriterion("USER_ROLE <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLike(String value) {
            addCriterion("USER_ROLE like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotLike(String value) {
            addCriterion("USER_ROLE not like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<String> values) {
            addCriterion("USER_ROLE in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<String> values) {
            addCriterion("USER_ROLE not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(String value1, String value2) {
            addCriterion("USER_ROLE between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(String value1, String value2) {
            addCriterion("USER_ROLE not between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeIsNull() {
            addCriterion("AUTO_PAY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeIsNotNull() {
            addCriterion("AUTO_PAY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeEqualTo(String value) {
            addCriterion("AUTO_PAY_MODE =", value, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeNotEqualTo(String value) {
            addCriterion("AUTO_PAY_MODE <>", value, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeGreaterThan(String value) {
            addCriterion("AUTO_PAY_MODE >", value, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_PAY_MODE >=", value, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeLessThan(String value) {
            addCriterion("AUTO_PAY_MODE <", value, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeLessThanOrEqualTo(String value) {
            addCriterion("AUTO_PAY_MODE <=", value, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeLike(String value) {
            addCriterion("AUTO_PAY_MODE like", value, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeNotLike(String value) {
            addCriterion("AUTO_PAY_MODE not like", value, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeIn(List<String> values) {
            addCriterion("AUTO_PAY_MODE in", values, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeNotIn(List<String> values) {
            addCriterion("AUTO_PAY_MODE not in", values, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeBetween(String value1, String value2) {
            addCriterion("AUTO_PAY_MODE between", value1, value2, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andAutoPayModeNotBetween(String value1, String value2) {
            addCriterion("AUTO_PAY_MODE not between", value1, value2, "autoPayMode");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashIsNull() {
            addCriterion("IS_PRIVATE_CASH is null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashIsNotNull() {
            addCriterion("IS_PRIVATE_CASH is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashEqualTo(String value) {
            addCriterion("IS_PRIVATE_CASH =", value, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashNotEqualTo(String value) {
            addCriterion("IS_PRIVATE_CASH <>", value, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashGreaterThan(String value) {
            addCriterion("IS_PRIVATE_CASH >", value, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PRIVATE_CASH >=", value, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashLessThan(String value) {
            addCriterion("IS_PRIVATE_CASH <", value, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashLessThanOrEqualTo(String value) {
            addCriterion("IS_PRIVATE_CASH <=", value, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashLike(String value) {
            addCriterion("IS_PRIVATE_CASH like", value, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashNotLike(String value) {
            addCriterion("IS_PRIVATE_CASH not like", value, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashIn(List<String> values) {
            addCriterion("IS_PRIVATE_CASH in", values, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashNotIn(List<String> values) {
            addCriterion("IS_PRIVATE_CASH not in", values, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashBetween(String value1, String value2) {
            addCriterion("IS_PRIVATE_CASH between", value1, value2, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsPrivateCashNotBetween(String value1, String value2) {
            addCriterion("IS_PRIVATE_CASH not between", value1, value2, "isPrivateCash");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctIsNull() {
            addCriterion("IS_OPEN_RICH_ACCT is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctIsNotNull() {
            addCriterion("IS_OPEN_RICH_ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctEqualTo(String value) {
            addCriterion("IS_OPEN_RICH_ACCT =", value, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctNotEqualTo(String value) {
            addCriterion("IS_OPEN_RICH_ACCT <>", value, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctGreaterThan(String value) {
            addCriterion("IS_OPEN_RICH_ACCT >", value, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_RICH_ACCT >=", value, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctLessThan(String value) {
            addCriterion("IS_OPEN_RICH_ACCT <", value, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctLessThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_RICH_ACCT <=", value, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctLike(String value) {
            addCriterion("IS_OPEN_RICH_ACCT like", value, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctNotLike(String value) {
            addCriterion("IS_OPEN_RICH_ACCT not like", value, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctIn(List<String> values) {
            addCriterion("IS_OPEN_RICH_ACCT in", values, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctNotIn(List<String> values) {
            addCriterion("IS_OPEN_RICH_ACCT not in", values, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctBetween(String value1, String value2) {
            addCriterion("IS_OPEN_RICH_ACCT between", value1, value2, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsOpenRichAcctNotBetween(String value1, String value2) {
            addCriterion("IS_OPEN_RICH_ACCT not between", value1, value2, "isOpenRichAcct");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfIsNull() {
            addCriterion("IS_REF_AUTO_TRF is null");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfIsNotNull() {
            addCriterion("IS_REF_AUTO_TRF is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfEqualTo(String value) {
            addCriterion("IS_REF_AUTO_TRF =", value, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfNotEqualTo(String value) {
            addCriterion("IS_REF_AUTO_TRF <>", value, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfGreaterThan(String value) {
            addCriterion("IS_REF_AUTO_TRF >", value, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REF_AUTO_TRF >=", value, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfLessThan(String value) {
            addCriterion("IS_REF_AUTO_TRF <", value, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfLessThanOrEqualTo(String value) {
            addCriterion("IS_REF_AUTO_TRF <=", value, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfLike(String value) {
            addCriterion("IS_REF_AUTO_TRF like", value, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfNotLike(String value) {
            addCriterion("IS_REF_AUTO_TRF not like", value, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfIn(List<String> values) {
            addCriterion("IS_REF_AUTO_TRF in", values, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfNotIn(List<String> values) {
            addCriterion("IS_REF_AUTO_TRF not in", values, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfBetween(String value1, String value2) {
            addCriterion("IS_REF_AUTO_TRF between", value1, value2, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsRefAutoTrfNotBetween(String value1, String value2) {
            addCriterion("IS_REF_AUTO_TRF not between", value1, value2, "isRefAutoTrf");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdIsNull() {
            addCriterion("SALES_BUSDEP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdIsNotNull() {
            addCriterion("SALES_BUSDEP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdEqualTo(String value) {
            addCriterion("SALES_BUSDEP_ID =", value, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdNotEqualTo(String value) {
            addCriterion("SALES_BUSDEP_ID <>", value, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdGreaterThan(String value) {
            addCriterion("SALES_BUSDEP_ID >", value, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_BUSDEP_ID >=", value, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdLessThan(String value) {
            addCriterion("SALES_BUSDEP_ID <", value, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdLessThanOrEqualTo(String value) {
            addCriterion("SALES_BUSDEP_ID <=", value, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdLike(String value) {
            addCriterion("SALES_BUSDEP_ID like", value, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdNotLike(String value) {
            addCriterion("SALES_BUSDEP_ID not like", value, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdIn(List<String> values) {
            addCriterion("SALES_BUSDEP_ID in", values, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdNotIn(List<String> values) {
            addCriterion("SALES_BUSDEP_ID not in", values, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdBetween(String value1, String value2) {
            addCriterion("SALES_BUSDEP_ID between", value1, value2, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andSalesBusdepIdNotBetween(String value1, String value2) {
            addCriterion("SALES_BUSDEP_ID not between", value1, value2, "salesBusdepId");
            return (Criteria) this;
        }

        public Criteria andPnrInstuIsNull() {
            addCriterion("PNR_INSTU is null");
            return (Criteria) this;
        }

        public Criteria andPnrInstuIsNotNull() {
            addCriterion("PNR_INSTU is not null");
            return (Criteria) this;
        }

        public Criteria andPnrInstuEqualTo(String value) {
            addCriterion("PNR_INSTU =", value, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuNotEqualTo(String value) {
            addCriterion("PNR_INSTU <>", value, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuGreaterThan(String value) {
            addCriterion("PNR_INSTU >", value, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuGreaterThanOrEqualTo(String value) {
            addCriterion("PNR_INSTU >=", value, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuLessThan(String value) {
            addCriterion("PNR_INSTU <", value, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuLessThanOrEqualTo(String value) {
            addCriterion("PNR_INSTU <=", value, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuLike(String value) {
            addCriterion("PNR_INSTU like", value, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuNotLike(String value) {
            addCriterion("PNR_INSTU not like", value, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuIn(List<String> values) {
            addCriterion("PNR_INSTU in", values, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuNotIn(List<String> values) {
            addCriterion("PNR_INSTU not in", values, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuBetween(String value1, String value2) {
            addCriterion("PNR_INSTU between", value1, value2, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrInstuNotBetween(String value1, String value2) {
            addCriterion("PNR_INSTU not between", value1, value2, "pnrInstu");
            return (Criteria) this;
        }

        public Criteria andPnrSalesIsNull() {
            addCriterion("PNR_SALES is null");
            return (Criteria) this;
        }

        public Criteria andPnrSalesIsNotNull() {
            addCriterion("PNR_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andPnrSalesEqualTo(String value) {
            addCriterion("PNR_SALES =", value, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesNotEqualTo(String value) {
            addCriterion("PNR_SALES <>", value, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesGreaterThan(String value) {
            addCriterion("PNR_SALES >", value, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesGreaterThanOrEqualTo(String value) {
            addCriterion("PNR_SALES >=", value, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesLessThan(String value) {
            addCriterion("PNR_SALES <", value, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesLessThanOrEqualTo(String value) {
            addCriterion("PNR_SALES <=", value, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesLike(String value) {
            addCriterion("PNR_SALES like", value, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesNotLike(String value) {
            addCriterion("PNR_SALES not like", value, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesIn(List<String> values) {
            addCriterion("PNR_SALES in", values, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesNotIn(List<String> values) {
            addCriterion("PNR_SALES not in", values, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesBetween(String value1, String value2) {
            addCriterion("PNR_SALES between", value1, value2, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andPnrSalesNotBetween(String value1, String value2) {
            addCriterion("PNR_SALES not between", value1, value2, "pnrSales");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeIsNull() {
            addCriterion("TAX_REGIST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeIsNotNull() {
            addCriterion("TAX_REGIST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeEqualTo(String value) {
            addCriterion("TAX_REGIST_CODE =", value, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeNotEqualTo(String value) {
            addCriterion("TAX_REGIST_CODE <>", value, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeGreaterThan(String value) {
            addCriterion("TAX_REGIST_CODE >", value, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_REGIST_CODE >=", value, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeLessThan(String value) {
            addCriterion("TAX_REGIST_CODE <", value, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeLessThanOrEqualTo(String value) {
            addCriterion("TAX_REGIST_CODE <=", value, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeLike(String value) {
            addCriterion("TAX_REGIST_CODE like", value, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeNotLike(String value) {
            addCriterion("TAX_REGIST_CODE not like", value, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeIn(List<String> values) {
            addCriterion("TAX_REGIST_CODE in", values, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeNotIn(List<String> values) {
            addCriterion("TAX_REGIST_CODE not in", values, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeBetween(String value1, String value2) {
            addCriterion("TAX_REGIST_CODE between", value1, value2, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCodeNotBetween(String value1, String value2) {
            addCriterion("TAX_REGIST_CODE not between", value1, value2, "taxRegistCode");
            return (Criteria) this;
        }

        public Criteria andTthMerIdIsNull() {
            addCriterion("TTH_MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTthMerIdIsNotNull() {
            addCriterion("TTH_MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTthMerIdEqualTo(String value) {
            addCriterion("TTH_MER_ID =", value, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdNotEqualTo(String value) {
            addCriterion("TTH_MER_ID <>", value, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdGreaterThan(String value) {
            addCriterion("TTH_MER_ID >", value, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("TTH_MER_ID >=", value, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdLessThan(String value) {
            addCriterion("TTH_MER_ID <", value, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdLessThanOrEqualTo(String value) {
            addCriterion("TTH_MER_ID <=", value, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdLike(String value) {
            addCriterion("TTH_MER_ID like", value, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdNotLike(String value) {
            addCriterion("TTH_MER_ID not like", value, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdIn(List<String> values) {
            addCriterion("TTH_MER_ID in", values, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdNotIn(List<String> values) {
            addCriterion("TTH_MER_ID not in", values, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdBetween(String value1, String value2) {
            addCriterion("TTH_MER_ID between", value1, value2, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andTthMerIdNotBetween(String value1, String value2) {
            addCriterion("TTH_MER_ID not between", value1, value2, "tthMerId");
            return (Criteria) this;
        }

        public Criteria andCashTypeIsNull() {
            addCriterion("CASH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCashTypeIsNotNull() {
            addCriterion("CASH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCashTypeEqualTo(String value) {
            addCriterion("CASH_TYPE =", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotEqualTo(String value) {
            addCriterion("CASH_TYPE <>", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeGreaterThan(String value) {
            addCriterion("CASH_TYPE >", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_TYPE >=", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeLessThan(String value) {
            addCriterion("CASH_TYPE <", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeLessThanOrEqualTo(String value) {
            addCriterion("CASH_TYPE <=", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeLike(String value) {
            addCriterion("CASH_TYPE like", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotLike(String value) {
            addCriterion("CASH_TYPE not like", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeIn(List<String> values) {
            addCriterion("CASH_TYPE in", values, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotIn(List<String> values) {
            addCriterion("CASH_TYPE not in", values, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeBetween(String value1, String value2) {
            addCriterion("CASH_TYPE between", value1, value2, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotBetween(String value1, String value2) {
            addCriterion("CASH_TYPE not between", value1, value2, "cashType");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNull() {
            addCriterion("SITE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("SITE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("SITE_NAME =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("SITE_NAME <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("SITE_NAME >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_NAME >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("SITE_NAME <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("SITE_NAME <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("SITE_NAME like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("SITE_NAME not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("SITE_NAME in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("SITE_NAME not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("SITE_NAME between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("SITE_NAME not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeIsNull() {
            addCriterion("BUS_LICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeIsNotNull() {
            addCriterion("BUS_LICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeEqualTo(String value) {
            addCriterion("BUS_LICE_CODE =", value, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeNotEqualTo(String value) {
            addCriterion("BUS_LICE_CODE <>", value, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeGreaterThan(String value) {
            addCriterion("BUS_LICE_CODE >", value, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_LICE_CODE >=", value, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeLessThan(String value) {
            addCriterion("BUS_LICE_CODE <", value, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeLessThanOrEqualTo(String value) {
            addCriterion("BUS_LICE_CODE <=", value, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeLike(String value) {
            addCriterion("BUS_LICE_CODE like", value, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeNotLike(String value) {
            addCriterion("BUS_LICE_CODE not like", value, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeIn(List<String> values) {
            addCriterion("BUS_LICE_CODE in", values, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeNotIn(List<String> values) {
            addCriterion("BUS_LICE_CODE not in", values, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeBetween(String value1, String value2) {
            addCriterion("BUS_LICE_CODE between", value1, value2, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andBusLiceCodeNotBetween(String value1, String value2) {
            addCriterion("BUS_LICE_CODE not between", value1, value2, "busLiceCode");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollIsNull() {
            addCriterion("IS_BINDING_PAYROLL is null");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollIsNotNull() {
            addCriterion("IS_BINDING_PAYROLL is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollEqualTo(String value) {
            addCriterion("IS_BINDING_PAYROLL =", value, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollNotEqualTo(String value) {
            addCriterion("IS_BINDING_PAYROLL <>", value, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollGreaterThan(String value) {
            addCriterion("IS_BINDING_PAYROLL >", value, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BINDING_PAYROLL >=", value, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollLessThan(String value) {
            addCriterion("IS_BINDING_PAYROLL <", value, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollLessThanOrEqualTo(String value) {
            addCriterion("IS_BINDING_PAYROLL <=", value, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollLike(String value) {
            addCriterion("IS_BINDING_PAYROLL like", value, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollNotLike(String value) {
            addCriterion("IS_BINDING_PAYROLL not like", value, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollIn(List<String> values) {
            addCriterion("IS_BINDING_PAYROLL in", values, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollNotIn(List<String> values) {
            addCriterion("IS_BINDING_PAYROLL not in", values, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollBetween(String value1, String value2) {
            addCriterion("IS_BINDING_PAYROLL between", value1, value2, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andIsBindingPayrollNotBetween(String value1, String value2) {
            addCriterion("IS_BINDING_PAYROLL not between", value1, value2, "isBindingPayroll");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdIsNull() {
            addCriterion("PAYROLL_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdIsNotNull() {
            addCriterion("PAYROLL_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdEqualTo(String value) {
            addCriterion("PAYROLL_CUST_ID =", value, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdNotEqualTo(String value) {
            addCriterion("PAYROLL_CUST_ID <>", value, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdGreaterThan(String value) {
            addCriterion("PAYROLL_CUST_ID >", value, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYROLL_CUST_ID >=", value, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdLessThan(String value) {
            addCriterion("PAYROLL_CUST_ID <", value, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdLessThanOrEqualTo(String value) {
            addCriterion("PAYROLL_CUST_ID <=", value, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdLike(String value) {
            addCriterion("PAYROLL_CUST_ID like", value, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdNotLike(String value) {
            addCriterion("PAYROLL_CUST_ID not like", value, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdIn(List<String> values) {
            addCriterion("PAYROLL_CUST_ID in", values, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdNotIn(List<String> values) {
            addCriterion("PAYROLL_CUST_ID not in", values, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdBetween(String value1, String value2) {
            addCriterion("PAYROLL_CUST_ID between", value1, value2, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andPayrollCustIdNotBetween(String value1, String value2) {
            addCriterion("PAYROLL_CUST_ID not between", value1, value2, "payrollCustId");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbIsNull() {
            addCriterion("IS_BINDING_SLB is null");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbIsNotNull() {
            addCriterion("IS_BINDING_SLB is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbEqualTo(String value) {
            addCriterion("IS_BINDING_SLB =", value, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbNotEqualTo(String value) {
            addCriterion("IS_BINDING_SLB <>", value, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbGreaterThan(String value) {
            addCriterion("IS_BINDING_SLB >", value, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BINDING_SLB >=", value, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbLessThan(String value) {
            addCriterion("IS_BINDING_SLB <", value, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbLessThanOrEqualTo(String value) {
            addCriterion("IS_BINDING_SLB <=", value, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbLike(String value) {
            addCriterion("IS_BINDING_SLB like", value, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbNotLike(String value) {
            addCriterion("IS_BINDING_SLB not like", value, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbIn(List<String> values) {
            addCriterion("IS_BINDING_SLB in", values, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbNotIn(List<String> values) {
            addCriterion("IS_BINDING_SLB not in", values, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbBetween(String value1, String value2) {
            addCriterion("IS_BINDING_SLB between", value1, value2, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andIsBindingSlbNotBetween(String value1, String value2) {
            addCriterion("IS_BINDING_SLB not between", value1, value2, "isBindingSlb");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdIsNull() {
            addCriterion("SLB_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdIsNotNull() {
            addCriterion("SLB_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdEqualTo(String value) {
            addCriterion("SLB_CUST_ID =", value, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdNotEqualTo(String value) {
            addCriterion("SLB_CUST_ID <>", value, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdGreaterThan(String value) {
            addCriterion("SLB_CUST_ID >", value, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("SLB_CUST_ID >=", value, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdLessThan(String value) {
            addCriterion("SLB_CUST_ID <", value, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdLessThanOrEqualTo(String value) {
            addCriterion("SLB_CUST_ID <=", value, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdLike(String value) {
            addCriterion("SLB_CUST_ID like", value, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdNotLike(String value) {
            addCriterion("SLB_CUST_ID not like", value, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdIn(List<String> values) {
            addCriterion("SLB_CUST_ID in", values, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdNotIn(List<String> values) {
            addCriterion("SLB_CUST_ID not in", values, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdBetween(String value1, String value2) {
            addCriterion("SLB_CUST_ID between", value1, value2, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andSlbCustIdNotBetween(String value1, String value2) {
            addCriterion("SLB_CUST_ID not between", value1, value2, "slbCustId");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfIsNull() {
            addCriterion("IS_FRZ_AUTO_TRF is null");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfIsNotNull() {
            addCriterion("IS_FRZ_AUTO_TRF is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfEqualTo(String value) {
            addCriterion("IS_FRZ_AUTO_TRF =", value, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfNotEqualTo(String value) {
            addCriterion("IS_FRZ_AUTO_TRF <>", value, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfGreaterThan(String value) {
            addCriterion("IS_FRZ_AUTO_TRF >", value, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FRZ_AUTO_TRF >=", value, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfLessThan(String value) {
            addCriterion("IS_FRZ_AUTO_TRF <", value, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfLessThanOrEqualTo(String value) {
            addCriterion("IS_FRZ_AUTO_TRF <=", value, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfLike(String value) {
            addCriterion("IS_FRZ_AUTO_TRF like", value, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfNotLike(String value) {
            addCriterion("IS_FRZ_AUTO_TRF not like", value, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfIn(List<String> values) {
            addCriterion("IS_FRZ_AUTO_TRF in", values, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfNotIn(List<String> values) {
            addCriterion("IS_FRZ_AUTO_TRF not in", values, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfBetween(String value1, String value2) {
            addCriterion("IS_FRZ_AUTO_TRF between", value1, value2, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFrzAutoTrfNotBetween(String value1, String value2) {
            addCriterion("IS_FRZ_AUTO_TRF not between", value1, value2, "isFrzAutoTrf");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseIsNull() {
            addCriterion("IS_FIN_AUTO_BASE is null");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseIsNotNull() {
            addCriterion("IS_FIN_AUTO_BASE is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseEqualTo(String value) {
            addCriterion("IS_FIN_AUTO_BASE =", value, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseNotEqualTo(String value) {
            addCriterion("IS_FIN_AUTO_BASE <>", value, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseGreaterThan(String value) {
            addCriterion("IS_FIN_AUTO_BASE >", value, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FIN_AUTO_BASE >=", value, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseLessThan(String value) {
            addCriterion("IS_FIN_AUTO_BASE <", value, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseLessThanOrEqualTo(String value) {
            addCriterion("IS_FIN_AUTO_BASE <=", value, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseLike(String value) {
            addCriterion("IS_FIN_AUTO_BASE like", value, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseNotLike(String value) {
            addCriterion("IS_FIN_AUTO_BASE not like", value, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseIn(List<String> values) {
            addCriterion("IS_FIN_AUTO_BASE in", values, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseNotIn(List<String> values) {
            addCriterion("IS_FIN_AUTO_BASE not in", values, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseBetween(String value1, String value2) {
            addCriterion("IS_FIN_AUTO_BASE between", value1, value2, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsFinAutoBaseNotBetween(String value1, String value2) {
            addCriterion("IS_FIN_AUTO_BASE not between", value1, value2, "isFinAutoBase");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayIsNull() {
            addCriterion("IS_BASE_AUTO_PAY is null");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayIsNotNull() {
            addCriterion("IS_BASE_AUTO_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayEqualTo(String value) {
            addCriterion("IS_BASE_AUTO_PAY =", value, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayNotEqualTo(String value) {
            addCriterion("IS_BASE_AUTO_PAY <>", value, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayGreaterThan(String value) {
            addCriterion("IS_BASE_AUTO_PAY >", value, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BASE_AUTO_PAY >=", value, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayLessThan(String value) {
            addCriterion("IS_BASE_AUTO_PAY <", value, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayLessThanOrEqualTo(String value) {
            addCriterion("IS_BASE_AUTO_PAY <=", value, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayLike(String value) {
            addCriterion("IS_BASE_AUTO_PAY like", value, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayNotLike(String value) {
            addCriterion("IS_BASE_AUTO_PAY not like", value, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayIn(List<String> values) {
            addCriterion("IS_BASE_AUTO_PAY in", values, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayNotIn(List<String> values) {
            addCriterion("IS_BASE_AUTO_PAY not in", values, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayBetween(String value1, String value2) {
            addCriterion("IS_BASE_AUTO_PAY between", value1, value2, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andIsBaseAutoPayNotBetween(String value1, String value2) {
            addCriterion("IS_BASE_AUTO_PAY not between", value1, value2, "isBaseAutoPay");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameIsNull() {
            addCriterion("USR_FOREIGN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameIsNotNull() {
            addCriterion("USR_FOREIGN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameEqualTo(String value) {
            addCriterion("USR_FOREIGN_NAME =", value, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameNotEqualTo(String value) {
            addCriterion("USR_FOREIGN_NAME <>", value, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameGreaterThan(String value) {
            addCriterion("USR_FOREIGN_NAME >", value, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameGreaterThanOrEqualTo(String value) {
            addCriterion("USR_FOREIGN_NAME >=", value, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameLessThan(String value) {
            addCriterion("USR_FOREIGN_NAME <", value, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameLessThanOrEqualTo(String value) {
            addCriterion("USR_FOREIGN_NAME <=", value, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameLike(String value) {
            addCriterion("USR_FOREIGN_NAME like", value, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameNotLike(String value) {
            addCriterion("USR_FOREIGN_NAME not like", value, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameIn(List<String> values) {
            addCriterion("USR_FOREIGN_NAME in", values, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameNotIn(List<String> values) {
            addCriterion("USR_FOREIGN_NAME not in", values, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameBetween(String value1, String value2) {
            addCriterion("USR_FOREIGN_NAME between", value1, value2, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andUsrForeignNameNotBetween(String value1, String value2) {
            addCriterion("USR_FOREIGN_NAME not between", value1, value2, "usrForeignName");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckIsNull() {
            addCriterion("IS_ACCT_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckIsNotNull() {
            addCriterion("IS_ACCT_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckEqualTo(String value) {
            addCriterion("IS_ACCT_CHECK =", value, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckNotEqualTo(String value) {
            addCriterion("IS_ACCT_CHECK <>", value, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckGreaterThan(String value) {
            addCriterion("IS_ACCT_CHECK >", value, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ACCT_CHECK >=", value, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckLessThan(String value) {
            addCriterion("IS_ACCT_CHECK <", value, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckLessThanOrEqualTo(String value) {
            addCriterion("IS_ACCT_CHECK <=", value, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckLike(String value) {
            addCriterion("IS_ACCT_CHECK like", value, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckNotLike(String value) {
            addCriterion("IS_ACCT_CHECK not like", value, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckIn(List<String> values) {
            addCriterion("IS_ACCT_CHECK in", values, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckNotIn(List<String> values) {
            addCriterion("IS_ACCT_CHECK not in", values, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckBetween(String value1, String value2) {
            addCriterion("IS_ACCT_CHECK between", value1, value2, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andIsAcctCheckNotBetween(String value1, String value2) {
            addCriterion("IS_ACCT_CHECK not between", value1, value2, "isAcctCheck");
            return (Criteria) this;
        }

        public Criteria andCuidIsNull() {
            addCriterion("CUID is null");
            return (Criteria) this;
        }

        public Criteria andCuidIsNotNull() {
            addCriterion("CUID is not null");
            return (Criteria) this;
        }

        public Criteria andCuidEqualTo(String value) {
            addCriterion("CUID =", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotEqualTo(String value) {
            addCriterion("CUID <>", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThan(String value) {
            addCriterion("CUID >", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThanOrEqualTo(String value) {
            addCriterion("CUID >=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThan(String value) {
            addCriterion("CUID <", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThanOrEqualTo(String value) {
            addCriterion("CUID <=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLike(String value) {
            addCriterion("CUID like", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotLike(String value) {
            addCriterion("CUID not like", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidIn(List<String> values) {
            addCriterion("CUID in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotIn(List<String> values) {
            addCriterion("CUID not in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidBetween(String value1, String value2) {
            addCriterion("CUID between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotBetween(String value1, String value2) {
            addCriterion("CUID not between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andIsTsIsNull() {
            addCriterion("IS_TS is null");
            return (Criteria) this;
        }

        public Criteria andIsTsIsNotNull() {
            addCriterion("IS_TS is not null");
            return (Criteria) this;
        }

        public Criteria andIsTsEqualTo(String value) {
            addCriterion("IS_TS =", value, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsNotEqualTo(String value) {
            addCriterion("IS_TS <>", value, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsGreaterThan(String value) {
            addCriterion("IS_TS >", value, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TS >=", value, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsLessThan(String value) {
            addCriterion("IS_TS <", value, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsLessThanOrEqualTo(String value) {
            addCriterion("IS_TS <=", value, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsLike(String value) {
            addCriterion("IS_TS like", value, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsNotLike(String value) {
            addCriterion("IS_TS not like", value, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsIn(List<String> values) {
            addCriterion("IS_TS in", values, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsNotIn(List<String> values) {
            addCriterion("IS_TS not in", values, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsBetween(String value1, String value2) {
            addCriterion("IS_TS between", value1, value2, "isTs");
            return (Criteria) this;
        }

        public Criteria andIsTsNotBetween(String value1, String value2) {
            addCriterion("IS_TS not between", value1, value2, "isTs");
            return (Criteria) this;
        }

        public Criteria andBusiScopeIsNull() {
            addCriterion("BUSI_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andBusiScopeIsNotNull() {
            addCriterion("BUSI_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiScopeEqualTo(String value) {
            addCriterion("BUSI_SCOPE =", value, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeNotEqualTo(String value) {
            addCriterion("BUSI_SCOPE <>", value, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeGreaterThan(String value) {
            addCriterion("BUSI_SCOPE >", value, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_SCOPE >=", value, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeLessThan(String value) {
            addCriterion("BUSI_SCOPE <", value, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_SCOPE <=", value, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeLike(String value) {
            addCriterion("BUSI_SCOPE like", value, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeNotLike(String value) {
            addCriterion("BUSI_SCOPE not like", value, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeIn(List<String> values) {
            addCriterion("BUSI_SCOPE in", values, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeNotIn(List<String> values) {
            addCriterion("BUSI_SCOPE not in", values, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeBetween(String value1, String value2) {
            addCriterion("BUSI_SCOPE between", value1, value2, "busiScope");
            return (Criteria) this;
        }

        public Criteria andBusiScopeNotBetween(String value1, String value2) {
            addCriterion("BUSI_SCOPE not between", value1, value2, "busiScope");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneIsNull() {
            addCriterion("IS_MULT_CERT_FOR_ONE is null");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneIsNotNull() {
            addCriterion("IS_MULT_CERT_FOR_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneEqualTo(String value) {
            addCriterion("IS_MULT_CERT_FOR_ONE =", value, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneNotEqualTo(String value) {
            addCriterion("IS_MULT_CERT_FOR_ONE <>", value, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneGreaterThan(String value) {
            addCriterion("IS_MULT_CERT_FOR_ONE >", value, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MULT_CERT_FOR_ONE >=", value, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneLessThan(String value) {
            addCriterion("IS_MULT_CERT_FOR_ONE <", value, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneLessThanOrEqualTo(String value) {
            addCriterion("IS_MULT_CERT_FOR_ONE <=", value, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneLike(String value) {
            addCriterion("IS_MULT_CERT_FOR_ONE like", value, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneNotLike(String value) {
            addCriterion("IS_MULT_CERT_FOR_ONE not like", value, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneIn(List<String> values) {
            addCriterion("IS_MULT_CERT_FOR_ONE in", values, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneNotIn(List<String> values) {
            addCriterion("IS_MULT_CERT_FOR_ONE not in", values, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneBetween(String value1, String value2) {
            addCriterion("IS_MULT_CERT_FOR_ONE between", value1, value2, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIsMultCertForOneNotBetween(String value1, String value2) {
            addCriterion("IS_MULT_CERT_FOR_ONE not between", value1, value2, "isMultCertForOne");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginIsNull() {
            addCriterion("ID_DATE_BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginIsNotNull() {
            addCriterion("ID_DATE_BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginEqualTo(String value) {
            addCriterion("ID_DATE_BEGIN =", value, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginNotEqualTo(String value) {
            addCriterion("ID_DATE_BEGIN <>", value, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginGreaterThan(String value) {
            addCriterion("ID_DATE_BEGIN >", value, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginGreaterThanOrEqualTo(String value) {
            addCriterion("ID_DATE_BEGIN >=", value, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginLessThan(String value) {
            addCriterion("ID_DATE_BEGIN <", value, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginLessThanOrEqualTo(String value) {
            addCriterion("ID_DATE_BEGIN <=", value, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginLike(String value) {
            addCriterion("ID_DATE_BEGIN like", value, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginNotLike(String value) {
            addCriterion("ID_DATE_BEGIN not like", value, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginIn(List<String> values) {
            addCriterion("ID_DATE_BEGIN in", values, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginNotIn(List<String> values) {
            addCriterion("ID_DATE_BEGIN not in", values, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginBetween(String value1, String value2) {
            addCriterion("ID_DATE_BEGIN between", value1, value2, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateBeginNotBetween(String value1, String value2) {
            addCriterion("ID_DATE_BEGIN not between", value1, value2, "idDateBegin");
            return (Criteria) this;
        }

        public Criteria andIdDateEndIsNull() {
            addCriterion("ID_DATE_END is null");
            return (Criteria) this;
        }

        public Criteria andIdDateEndIsNotNull() {
            addCriterion("ID_DATE_END is not null");
            return (Criteria) this;
        }

        public Criteria andIdDateEndEqualTo(String value) {
            addCriterion("ID_DATE_END =", value, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndNotEqualTo(String value) {
            addCriterion("ID_DATE_END <>", value, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndGreaterThan(String value) {
            addCriterion("ID_DATE_END >", value, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndGreaterThanOrEqualTo(String value) {
            addCriterion("ID_DATE_END >=", value, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndLessThan(String value) {
            addCriterion("ID_DATE_END <", value, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndLessThanOrEqualTo(String value) {
            addCriterion("ID_DATE_END <=", value, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndLike(String value) {
            addCriterion("ID_DATE_END like", value, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndNotLike(String value) {
            addCriterion("ID_DATE_END not like", value, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndIn(List<String> values) {
            addCriterion("ID_DATE_END in", values, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndNotIn(List<String> values) {
            addCriterion("ID_DATE_END not in", values, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndBetween(String value1, String value2) {
            addCriterion("ID_DATE_END between", value1, value2, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andIdDateEndNotBetween(String value1, String value2) {
            addCriterion("ID_DATE_END not between", value1, value2, "idDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNull() {
            addCriterion("LEGAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNotNull() {
            addCriterion("LEGAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNameEqualTo(String value) {
            addCriterion("LEGAL_NAME =", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotEqualTo(String value) {
            addCriterion("LEGAL_NAME <>", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThan(String value) {
            addCriterion("LEGAL_NAME >", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_NAME >=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThan(String value) {
            addCriterion("LEGAL_NAME <", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_NAME <=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLike(String value) {
            addCriterion("LEGAL_NAME like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotLike(String value) {
            addCriterion("LEGAL_NAME not like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameIn(List<String> values) {
            addCriterion("LEGAL_NAME in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotIn(List<String> values) {
            addCriterion("LEGAL_NAME not in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameBetween(String value1, String value2) {
            addCriterion("LEGAL_NAME between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotBetween(String value1, String value2) {
            addCriterion("LEGAL_NAME not between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeIsNull() {
            addCriterion("LEGAL_ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeIsNotNull() {
            addCriterion("LEGAL_ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeEqualTo(String value) {
            addCriterion("LEGAL_ID_TYPE =", value, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeNotEqualTo(String value) {
            addCriterion("LEGAL_ID_TYPE <>", value, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeGreaterThan(String value) {
            addCriterion("LEGAL_ID_TYPE >", value, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_TYPE >=", value, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeLessThan(String value) {
            addCriterion("LEGAL_ID_TYPE <", value, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_TYPE <=", value, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeLike(String value) {
            addCriterion("LEGAL_ID_TYPE like", value, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeNotLike(String value) {
            addCriterion("LEGAL_ID_TYPE not like", value, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeIn(List<String> values) {
            addCriterion("LEGAL_ID_TYPE in", values, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeNotIn(List<String> values) {
            addCriterion("LEGAL_ID_TYPE not in", values, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_TYPE between", value1, value2, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeNotBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_TYPE not between", value1, value2, "legalIdType");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoIsNull() {
            addCriterion("LEGAL_ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoIsNotNull() {
            addCriterion("LEGAL_ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoEqualTo(String value) {
            addCriterion("LEGAL_ID_NO =", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoNotEqualTo(String value) {
            addCriterion("LEGAL_ID_NO <>", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoGreaterThan(String value) {
            addCriterion("LEGAL_ID_NO >", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_NO >=", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoLessThan(String value) {
            addCriterion("LEGAL_ID_NO <", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_NO <=", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoLike(String value) {
            addCriterion("LEGAL_ID_NO like", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoNotLike(String value) {
            addCriterion("LEGAL_ID_NO not like", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoIn(List<String> values) {
            addCriterion("LEGAL_ID_NO in", values, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoNotIn(List<String> values) {
            addCriterion("LEGAL_ID_NO not in", values, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_NO between", value1, value2, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoNotBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_NO not between", value1, value2, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginIsNull() {
            addCriterion("LEGAL_ID_DATE_BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginIsNotNull() {
            addCriterion("LEGAL_ID_DATE_BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginEqualTo(String value) {
            addCriterion("LEGAL_ID_DATE_BEGIN =", value, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginNotEqualTo(String value) {
            addCriterion("LEGAL_ID_DATE_BEGIN <>", value, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginGreaterThan(String value) {
            addCriterion("LEGAL_ID_DATE_BEGIN >", value, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_DATE_BEGIN >=", value, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginLessThan(String value) {
            addCriterion("LEGAL_ID_DATE_BEGIN <", value, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_DATE_BEGIN <=", value, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginLike(String value) {
            addCriterion("LEGAL_ID_DATE_BEGIN like", value, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginNotLike(String value) {
            addCriterion("LEGAL_ID_DATE_BEGIN not like", value, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginIn(List<String> values) {
            addCriterion("LEGAL_ID_DATE_BEGIN in", values, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginNotIn(List<String> values) {
            addCriterion("LEGAL_ID_DATE_BEGIN not in", values, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_DATE_BEGIN between", value1, value2, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateBeginNotBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_DATE_BEGIN not between", value1, value2, "legalIdDateBegin");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndIsNull() {
            addCriterion("LEGAL_ID_DATE_END is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndIsNotNull() {
            addCriterion("LEGAL_ID_DATE_END is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndEqualTo(String value) {
            addCriterion("LEGAL_ID_DATE_END =", value, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndNotEqualTo(String value) {
            addCriterion("LEGAL_ID_DATE_END <>", value, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndGreaterThan(String value) {
            addCriterion("LEGAL_ID_DATE_END >", value, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_DATE_END >=", value, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndLessThan(String value) {
            addCriterion("LEGAL_ID_DATE_END <", value, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_DATE_END <=", value, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndLike(String value) {
            addCriterion("LEGAL_ID_DATE_END like", value, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndNotLike(String value) {
            addCriterion("LEGAL_ID_DATE_END not like", value, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndIn(List<String> values) {
            addCriterion("LEGAL_ID_DATE_END in", values, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndNotIn(List<String> values) {
            addCriterion("LEGAL_ID_DATE_END not in", values, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_DATE_END between", value1, value2, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalIdDateEndNotBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_DATE_END not between", value1, value2, "legalIdDateEnd");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpIsNull() {
            addCriterion("LEGAL_USR_MP is null");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpIsNotNull() {
            addCriterion("LEGAL_USR_MP is not null");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpEqualTo(String value) {
            addCriterion("LEGAL_USR_MP =", value, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpNotEqualTo(String value) {
            addCriterion("LEGAL_USR_MP <>", value, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpGreaterThan(String value) {
            addCriterion("LEGAL_USR_MP >", value, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_USR_MP >=", value, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpLessThan(String value) {
            addCriterion("LEGAL_USR_MP <", value, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_USR_MP <=", value, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpLike(String value) {
            addCriterion("LEGAL_USR_MP like", value, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpNotLike(String value) {
            addCriterion("LEGAL_USR_MP not like", value, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpIn(List<String> values) {
            addCriterion("LEGAL_USR_MP in", values, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpNotIn(List<String> values) {
            addCriterion("LEGAL_USR_MP not in", values, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpBetween(String value1, String value2) {
            addCriterion("LEGAL_USR_MP between", value1, value2, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andLegalUsrMpNotBetween(String value1, String value2) {
            addCriterion("LEGAL_USR_MP not between", value1, value2, "legalUsrMp");
            return (Criteria) this;
        }

        public Criteria andCorpDateIsNull() {
            addCriterion("CORP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCorpDateIsNotNull() {
            addCriterion("CORP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCorpDateEqualTo(String value) {
            addCriterion("CORP_DATE =", value, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateNotEqualTo(String value) {
            addCriterion("CORP_DATE <>", value, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateGreaterThan(String value) {
            addCriterion("CORP_DATE >", value, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_DATE >=", value, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateLessThan(String value) {
            addCriterion("CORP_DATE <", value, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateLessThanOrEqualTo(String value) {
            addCriterion("CORP_DATE <=", value, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateLike(String value) {
            addCriterion("CORP_DATE like", value, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateNotLike(String value) {
            addCriterion("CORP_DATE not like", value, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateIn(List<String> values) {
            addCriterion("CORP_DATE in", values, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateNotIn(List<String> values) {
            addCriterion("CORP_DATE not in", values, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateBetween(String value1, String value2) {
            addCriterion("CORP_DATE between", value1, value2, "corpDate");
            return (Criteria) this;
        }

        public Criteria andCorpDateNotBetween(String value1, String value2) {
            addCriterion("CORP_DATE not between", value1, value2, "corpDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumIsNull() {
            addCriterion("TAX_REG_ID_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumIsNotNull() {
            addCriterion("TAX_REG_ID_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumEqualTo(String value) {
            addCriterion("TAX_REG_ID_NUM =", value, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumNotEqualTo(String value) {
            addCriterion("TAX_REG_ID_NUM <>", value, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumGreaterThan(String value) {
            addCriterion("TAX_REG_ID_NUM >", value, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_REG_ID_NUM >=", value, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumLessThan(String value) {
            addCriterion("TAX_REG_ID_NUM <", value, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumLessThanOrEqualTo(String value) {
            addCriterion("TAX_REG_ID_NUM <=", value, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumLike(String value) {
            addCriterion("TAX_REG_ID_NUM like", value, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumNotLike(String value) {
            addCriterion("TAX_REG_ID_NUM not like", value, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumIn(List<String> values) {
            addCriterion("TAX_REG_ID_NUM in", values, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumNotIn(List<String> values) {
            addCriterion("TAX_REG_ID_NUM not in", values, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumBetween(String value1, String value2) {
            addCriterion("TAX_REG_ID_NUM between", value1, value2, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdNumNotBetween(String value1, String value2) {
            addCriterion("TAX_REG_ID_NUM not between", value1, value2, "taxRegIdNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateIsNull() {
            addCriterion("TAX_REG_ID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateIsNotNull() {
            addCriterion("TAX_REG_ID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateEqualTo(String value) {
            addCriterion("TAX_REG_ID_DATE =", value, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateNotEqualTo(String value) {
            addCriterion("TAX_REG_ID_DATE <>", value, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateGreaterThan(String value) {
            addCriterion("TAX_REG_ID_DATE >", value, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_REG_ID_DATE >=", value, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateLessThan(String value) {
            addCriterion("TAX_REG_ID_DATE <", value, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateLessThanOrEqualTo(String value) {
            addCriterion("TAX_REG_ID_DATE <=", value, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateLike(String value) {
            addCriterion("TAX_REG_ID_DATE like", value, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateNotLike(String value) {
            addCriterion("TAX_REG_ID_DATE not like", value, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateIn(List<String> values) {
            addCriterion("TAX_REG_ID_DATE in", values, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateNotIn(List<String> values) {
            addCriterion("TAX_REG_ID_DATE not in", values, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateBetween(String value1, String value2) {
            addCriterion("TAX_REG_ID_DATE between", value1, value2, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andTaxRegIdDateNotBetween(String value1, String value2) {
            addCriterion("TAX_REG_ID_DATE not between", value1, value2, "taxRegIdDate");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("IMAGE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("IMAGE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("IMAGE_PATH =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("IMAGE_PATH <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("IMAGE_PATH >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_PATH >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("IMAGE_PATH <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_PATH <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("IMAGE_PATH like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("IMAGE_PATH not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("IMAGE_PATH in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("IMAGE_PATH not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("IMAGE_PATH between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("IMAGE_PATH not between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNull() {
            addCriterion("IS_AUDIT is null");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNotNull() {
            addCriterion("IS_AUDIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuditEqualTo(String value) {
            addCriterion("IS_AUDIT =", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotEqualTo(String value) {
            addCriterion("IS_AUDIT <>", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThan(String value) {
            addCriterion("IS_AUDIT >", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AUDIT >=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThan(String value) {
            addCriterion("IS_AUDIT <", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThanOrEqualTo(String value) {
            addCriterion("IS_AUDIT <=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLike(String value) {
            addCriterion("IS_AUDIT like", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotLike(String value) {
            addCriterion("IS_AUDIT not like", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditIn(List<String> values) {
            addCriterion("IS_AUDIT in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotIn(List<String> values) {
            addCriterion("IS_AUDIT not in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditBetween(String value1, String value2) {
            addCriterion("IS_AUDIT between", value1, value2, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotBetween(String value1, String value2) {
            addCriterion("IS_AUDIT not between", value1, value2, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthIsNull() {
            addCriterion("IS_REAL_NAME_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthIsNotNull() {
            addCriterion("IS_REAL_NAME_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthEqualTo(String value) {
            addCriterion("IS_REAL_NAME_AUTH =", value, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthNotEqualTo(String value) {
            addCriterion("IS_REAL_NAME_AUTH <>", value, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthGreaterThan(String value) {
            addCriterion("IS_REAL_NAME_AUTH >", value, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REAL_NAME_AUTH >=", value, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthLessThan(String value) {
            addCriterion("IS_REAL_NAME_AUTH <", value, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthLessThanOrEqualTo(String value) {
            addCriterion("IS_REAL_NAME_AUTH <=", value, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthLike(String value) {
            addCriterion("IS_REAL_NAME_AUTH like", value, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthNotLike(String value) {
            addCriterion("IS_REAL_NAME_AUTH not like", value, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthIn(List<String> values) {
            addCriterion("IS_REAL_NAME_AUTH in", values, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthNotIn(List<String> values) {
            addCriterion("IS_REAL_NAME_AUTH not in", values, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthBetween(String value1, String value2) {
            addCriterion("IS_REAL_NAME_AUTH between", value1, value2, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsRealNameAuthNotBetween(String value1, String value2) {
            addCriterion("IS_REAL_NAME_AUTH not between", value1, value2, "isRealNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagIsNull() {
            addCriterion("IS_T0_CASH_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagIsNotNull() {
            addCriterion("IS_T0_CASH_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagEqualTo(String value) {
            addCriterion("IS_T0_CASH_FLAG =", value, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagNotEqualTo(String value) {
            addCriterion("IS_T0_CASH_FLAG <>", value, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagGreaterThan(String value) {
            addCriterion("IS_T0_CASH_FLAG >", value, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IS_T0_CASH_FLAG >=", value, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagLessThan(String value) {
            addCriterion("IS_T0_CASH_FLAG <", value, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagLessThanOrEqualTo(String value) {
            addCriterion("IS_T0_CASH_FLAG <=", value, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagLike(String value) {
            addCriterion("IS_T0_CASH_FLAG like", value, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagNotLike(String value) {
            addCriterion("IS_T0_CASH_FLAG not like", value, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagIn(List<String> values) {
            addCriterion("IS_T0_CASH_FLAG in", values, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagNotIn(List<String> values) {
            addCriterion("IS_T0_CASH_FLAG not in", values, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagBetween(String value1, String value2) {
            addCriterion("IS_T0_CASH_FLAG between", value1, value2, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andIsT0CashFlagNotBetween(String value1, String value2) {
            addCriterion("IS_T0_CASH_FLAG not between", value1, value2, "isT0CashFlag");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeIsNull() {
            addCriterion("UNI_SOC_CRE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeIsNotNull() {
            addCriterion("UNI_SOC_CRE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeEqualTo(String value) {
            addCriterion("UNI_SOC_CRE_CODE =", value, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeNotEqualTo(String value) {
            addCriterion("UNI_SOC_CRE_CODE <>", value, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeGreaterThan(String value) {
            addCriterion("UNI_SOC_CRE_CODE >", value, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNI_SOC_CRE_CODE >=", value, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeLessThan(String value) {
            addCriterion("UNI_SOC_CRE_CODE <", value, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeLessThanOrEqualTo(String value) {
            addCriterion("UNI_SOC_CRE_CODE <=", value, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeLike(String value) {
            addCriterion("UNI_SOC_CRE_CODE like", value, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeNotLike(String value) {
            addCriterion("UNI_SOC_CRE_CODE not like", value, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeIn(List<String> values) {
            addCriterion("UNI_SOC_CRE_CODE in", values, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeNotIn(List<String> values) {
            addCriterion("UNI_SOC_CRE_CODE not in", values, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeBetween(String value1, String value2) {
            addCriterion("UNI_SOC_CRE_CODE between", value1, value2, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andUniSocCreCodeNotBetween(String value1, String value2) {
            addCriterion("UNI_SOC_CRE_CODE not between", value1, value2, "uniSocCreCode");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("CREATE_DATE like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("CREATE_DATE not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(String value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(String value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(String value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(String value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLike(String value) {
            addCriterion("UPDATE_DATE like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotLike(String value) {
            addCriterion("UPDATE_DATE not like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<String> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<String> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(String value1, String value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
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

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andRegCaplIsNull() {
            addCriterion("REG_CAPL is null");
            return (Criteria) this;
        }

        public Criteria andRegCaplIsNotNull() {
            addCriterion("REG_CAPL is not null");
            return (Criteria) this;
        }

        public Criteria andRegCaplEqualTo(String value) {
            addCriterion("REG_CAPL =", value, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplNotEqualTo(String value) {
            addCriterion("REG_CAPL <>", value, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplGreaterThan(String value) {
            addCriterion("REG_CAPL >", value, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplGreaterThanOrEqualTo(String value) {
            addCriterion("REG_CAPL >=", value, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplLessThan(String value) {
            addCriterion("REG_CAPL <", value, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplLessThanOrEqualTo(String value) {
            addCriterion("REG_CAPL <=", value, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplLike(String value) {
            addCriterion("REG_CAPL like", value, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplNotLike(String value) {
            addCriterion("REG_CAPL not like", value, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplIn(List<String> values) {
            addCriterion("REG_CAPL in", values, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplNotIn(List<String> values) {
            addCriterion("REG_CAPL not in", values, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplBetween(String value1, String value2) {
            addCriterion("REG_CAPL between", value1, value2, "regCapl");
            return (Criteria) this;
        }

        public Criteria andRegCaplNotBetween(String value1, String value2) {
            addCriterion("REG_CAPL not between", value1, value2, "regCapl");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNull() {
            addCriterion("CLOSE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNotNull() {
            addCriterion("CLOSE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCloseDateEqualTo(String value) {
            addCriterion("CLOSE_DATE =", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotEqualTo(String value) {
            addCriterion("CLOSE_DATE <>", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThan(String value) {
            addCriterion("CLOSE_DATE >", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSE_DATE >=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThan(String value) {
            addCriterion("CLOSE_DATE <", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThanOrEqualTo(String value) {
            addCriterion("CLOSE_DATE <=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLike(String value) {
            addCriterion("CLOSE_DATE like", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotLike(String value) {
            addCriterion("CLOSE_DATE not like", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIn(List<String> values) {
            addCriterion("CLOSE_DATE in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotIn(List<String> values) {
            addCriterion("CLOSE_DATE not in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateBetween(String value1, String value2) {
            addCriterion("CLOSE_DATE between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotBetween(String value1, String value2) {
            addCriterion("CLOSE_DATE not between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("CLOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("CLOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(String value) {
            addCriterion("CLOSE_TIME =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(String value) {
            addCriterion("CLOSE_TIME <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(String value) {
            addCriterion("CLOSE_TIME >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSE_TIME >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(String value) {
            addCriterion("CLOSE_TIME <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(String value) {
            addCriterion("CLOSE_TIME <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLike(String value) {
            addCriterion("CLOSE_TIME like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotLike(String value) {
            addCriterion("CLOSE_TIME not like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<String> values) {
            addCriterion("CLOSE_TIME in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<String> values) {
            addCriterion("CLOSE_TIME not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(String value1, String value2) {
            addCriterion("CLOSE_TIME between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(String value1, String value2) {
            addCriterion("CLOSE_TIME not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdIsNull() {
            addCriterion("FT_ACCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdIsNotNull() {
            addCriterion("FT_ACCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdEqualTo(String value) {
            addCriterion("FT_ACCT_ID =", value, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdNotEqualTo(String value) {
            addCriterion("FT_ACCT_ID <>", value, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdGreaterThan(String value) {
            addCriterion("FT_ACCT_ID >", value, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdGreaterThanOrEqualTo(String value) {
            addCriterion("FT_ACCT_ID >=", value, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdLessThan(String value) {
            addCriterion("FT_ACCT_ID <", value, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdLessThanOrEqualTo(String value) {
            addCriterion("FT_ACCT_ID <=", value, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdLike(String value) {
            addCriterion("FT_ACCT_ID like", value, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdNotLike(String value) {
            addCriterion("FT_ACCT_ID not like", value, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdIn(List<String> values) {
            addCriterion("FT_ACCT_ID in", values, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdNotIn(List<String> values) {
            addCriterion("FT_ACCT_ID not in", values, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdBetween(String value1, String value2) {
            addCriterion("FT_ACCT_ID between", value1, value2, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andFtAcctIdNotBetween(String value1, String value2) {
            addCriterion("FT_ACCT_ID not between", value1, value2, "ftAcctId");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstIsNull() {
            addCriterion("IS_FT_FIRST is null");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstIsNotNull() {
            addCriterion("IS_FT_FIRST is not null");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstEqualTo(String value) {
            addCriterion("IS_FT_FIRST =", value, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstNotEqualTo(String value) {
            addCriterion("IS_FT_FIRST <>", value, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstGreaterThan(String value) {
            addCriterion("IS_FT_FIRST >", value, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FT_FIRST >=", value, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstLessThan(String value) {
            addCriterion("IS_FT_FIRST <", value, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstLessThanOrEqualTo(String value) {
            addCriterion("IS_FT_FIRST <=", value, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstLike(String value) {
            addCriterion("IS_FT_FIRST like", value, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstNotLike(String value) {
            addCriterion("IS_FT_FIRST not like", value, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstIn(List<String> values) {
            addCriterion("IS_FT_FIRST in", values, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstNotIn(List<String> values) {
            addCriterion("IS_FT_FIRST not in", values, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstBetween(String value1, String value2) {
            addCriterion("IS_FT_FIRST between", value1, value2, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andIsFtFirstNotBetween(String value1, String value2) {
            addCriterion("IS_FT_FIRST not between", value1, value2, "isFtFirst");
            return (Criteria) this;
        }

        public Criteria andBusinessStatIsNull() {
            addCriterion("BUSINESS_STAT is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatIsNotNull() {
            addCriterion("BUSINESS_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatEqualTo(String value) {
            addCriterion("BUSINESS_STAT =", value, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatNotEqualTo(String value) {
            addCriterion("BUSINESS_STAT <>", value, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatGreaterThan(String value) {
            addCriterion("BUSINESS_STAT >", value, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_STAT >=", value, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatLessThan(String value) {
            addCriterion("BUSINESS_STAT <", value, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_STAT <=", value, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatLike(String value) {
            addCriterion("BUSINESS_STAT like", value, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatNotLike(String value) {
            addCriterion("BUSINESS_STAT not like", value, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatIn(List<String> values) {
            addCriterion("BUSINESS_STAT in", values, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatNotIn(List<String> values) {
            addCriterion("BUSINESS_STAT not in", values, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatBetween(String value1, String value2) {
            addCriterion("BUSINESS_STAT between", value1, value2, "businessStat");
            return (Criteria) this;
        }

        public Criteria andBusinessStatNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_STAT not between", value1, value2, "businessStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatIsNull() {
            addCriterion("RISK_MANAGER_STAT is null");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatIsNotNull() {
            addCriterion("RISK_MANAGER_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatEqualTo(String value) {
            addCriterion("RISK_MANAGER_STAT =", value, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatNotEqualTo(String value) {
            addCriterion("RISK_MANAGER_STAT <>", value, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatGreaterThan(String value) {
            addCriterion("RISK_MANAGER_STAT >", value, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_MANAGER_STAT >=", value, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatLessThan(String value) {
            addCriterion("RISK_MANAGER_STAT <", value, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatLessThanOrEqualTo(String value) {
            addCriterion("RISK_MANAGER_STAT <=", value, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatLike(String value) {
            addCriterion("RISK_MANAGER_STAT like", value, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatNotLike(String value) {
            addCriterion("RISK_MANAGER_STAT not like", value, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatIn(List<String> values) {
            addCriterion("RISK_MANAGER_STAT in", values, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatNotIn(List<String> values) {
            addCriterion("RISK_MANAGER_STAT not in", values, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatBetween(String value1, String value2) {
            addCriterion("RISK_MANAGER_STAT between", value1, value2, "riskManagerStat");
            return (Criteria) this;
        }

        public Criteria andRiskManagerStatNotBetween(String value1, String value2) {
            addCriterion("RISK_MANAGER_STAT not between", value1, value2, "riskManagerStat");
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