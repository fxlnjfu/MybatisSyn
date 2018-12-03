package mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RecvAcctInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecvAcctInfoExample() {
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

        public Criteria andMerIdIsNull() {
            addCriterion("MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(String value) {
            addCriterion("MER_ID =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(String value) {
            addCriterion("MER_ID <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(String value) {
            addCriterion("MER_ID >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ID >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(String value) {
            addCriterion("MER_ID <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(String value) {
            addCriterion("MER_ID <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLike(String value) {
            addCriterion("MER_ID like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotLike(String value) {
            addCriterion("MER_ID not like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<String> values) {
            addCriterion("MER_ID in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<String> values) {
            addCriterion("MER_ID not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(String value1, String value2) {
            addCriterion("MER_ID between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(String value1, String value2) {
            addCriterion("MER_ID not between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdIsNull() {
            addCriterion("MER_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdIsNotNull() {
            addCriterion("MER_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdEqualTo(String value) {
            addCriterion("MER_USR_ID =", value, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdNotEqualTo(String value) {
            addCriterion("MER_USR_ID <>", value, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdGreaterThan(String value) {
            addCriterion("MER_USR_ID >", value, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_USR_ID >=", value, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdLessThan(String value) {
            addCriterion("MER_USR_ID <", value, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdLessThanOrEqualTo(String value) {
            addCriterion("MER_USR_ID <=", value, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdLike(String value) {
            addCriterion("MER_USR_ID like", value, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdNotLike(String value) {
            addCriterion("MER_USR_ID not like", value, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdIn(List<String> values) {
            addCriterion("MER_USR_ID in", values, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdNotIn(List<String> values) {
            addCriterion("MER_USR_ID not in", values, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdBetween(String value1, String value2) {
            addCriterion("MER_USR_ID between", value1, value2, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andMerUsrIdNotBetween(String value1, String value2) {
            addCriterion("MER_USR_ID not between", value1, value2, "merUsrId");
            return (Criteria) this;
        }

        public Criteria andAcctAliasIsNull() {
            addCriterion("ACCT_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andAcctAliasIsNotNull() {
            addCriterion("ACCT_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andAcctAliasEqualTo(String value) {
            addCriterion("ACCT_ALIAS =", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotEqualTo(String value) {
            addCriterion("ACCT_ALIAS <>", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasGreaterThan(String value) {
            addCriterion("ACCT_ALIAS >", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_ALIAS >=", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLessThan(String value) {
            addCriterion("ACCT_ALIAS <", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLessThanOrEqualTo(String value) {
            addCriterion("ACCT_ALIAS <=", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLike(String value) {
            addCriterion("ACCT_ALIAS like", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotLike(String value) {
            addCriterion("ACCT_ALIAS not like", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasIn(List<String> values) {
            addCriterion("ACCT_ALIAS in", values, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotIn(List<String> values) {
            addCriterion("ACCT_ALIAS not in", values, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasBetween(String value1, String value2) {
            addCriterion("ACCT_ALIAS between", value1, value2, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotBetween(String value1, String value2) {
            addCriterion("ACCT_ALIAS not between", value1, value2, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctStatusIsNull() {
            addCriterion("ACCT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAcctStatusIsNotNull() {
            addCriterion("ACCT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAcctStatusEqualTo(String value) {
            addCriterion("ACCT_STATUS =", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusNotEqualTo(String value) {
            addCriterion("ACCT_STATUS <>", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusGreaterThan(String value) {
            addCriterion("ACCT_STATUS >", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_STATUS >=", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusLessThan(String value) {
            addCriterion("ACCT_STATUS <", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusLessThanOrEqualTo(String value) {
            addCriterion("ACCT_STATUS <=", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusLike(String value) {
            addCriterion("ACCT_STATUS like", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusNotLike(String value) {
            addCriterion("ACCT_STATUS not like", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusIn(List<String> values) {
            addCriterion("ACCT_STATUS in", values, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusNotIn(List<String> values) {
            addCriterion("ACCT_STATUS not in", values, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusBetween(String value1, String value2) {
            addCriterion("ACCT_STATUS between", value1, value2, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusNotBetween(String value1, String value2) {
            addCriterion("ACCT_STATUS not between", value1, value2, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateIsNull() {
            addCriterion("LAST_UPD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateIsNotNull() {
            addCriterion("LAST_UPD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateEqualTo(String value) {
            addCriterion("LAST_UPD_DATE =", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateNotEqualTo(String value) {
            addCriterion("LAST_UPD_DATE <>", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateGreaterThan(String value) {
            addCriterion("LAST_UPD_DATE >", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_DATE >=", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateLessThan(String value) {
            addCriterion("LAST_UPD_DATE <", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_DATE <=", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateLike(String value) {
            addCriterion("LAST_UPD_DATE like", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateNotLike(String value) {
            addCriterion("LAST_UPD_DATE not like", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateIn(List<String> values) {
            addCriterion("LAST_UPD_DATE in", values, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateNotIn(List<String> values) {
            addCriterion("LAST_UPD_DATE not in", values, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateBetween(String value1, String value2) {
            addCriterion("LAST_UPD_DATE between", value1, value2, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateNotBetween(String value1, String value2) {
            addCriterion("LAST_UPD_DATE not between", value1, value2, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastDayBalIsNull() {
            addCriterion("LAST_DAY_BAL is null");
            return (Criteria) this;
        }

        public Criteria andLastDayBalIsNotNull() {
            addCriterion("LAST_DAY_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andLastDayBalEqualTo(BigDecimal value) {
            addCriterion("LAST_DAY_BAL =", value, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLastDayBalNotEqualTo(BigDecimal value) {
            addCriterion("LAST_DAY_BAL <>", value, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLastDayBalGreaterThan(BigDecimal value) {
            addCriterion("LAST_DAY_BAL >", value, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLastDayBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_DAY_BAL >=", value, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLastDayBalLessThan(BigDecimal value) {
            addCriterion("LAST_DAY_BAL <", value, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLastDayBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_DAY_BAL <=", value, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLastDayBalIn(List<BigDecimal> values) {
            addCriterion("LAST_DAY_BAL in", values, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLastDayBalNotIn(List<BigDecimal> values) {
            addCriterion("LAST_DAY_BAL not in", values, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLastDayBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_DAY_BAL between", value1, value2, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLastDayBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_DAY_BAL not between", value1, value2, "lastDayBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalIsNull() {
            addCriterion("LIQ_BAL is null");
            return (Criteria) this;
        }

        public Criteria andLiqBalIsNotNull() {
            addCriterion("LIQ_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andLiqBalEqualTo(BigDecimal value) {
            addCriterion("LIQ_BAL =", value, "liqBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalNotEqualTo(BigDecimal value) {
            addCriterion("LIQ_BAL <>", value, "liqBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalGreaterThan(BigDecimal value) {
            addCriterion("LIQ_BAL >", value, "liqBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQ_BAL >=", value, "liqBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalLessThan(BigDecimal value) {
            addCriterion("LIQ_BAL <", value, "liqBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQ_BAL <=", value, "liqBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalIn(List<BigDecimal> values) {
            addCriterion("LIQ_BAL in", values, "liqBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalNotIn(List<BigDecimal> values) {
            addCriterion("LIQ_BAL not in", values, "liqBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQ_BAL between", value1, value2, "liqBal");
            return (Criteria) this;
        }

        public Criteria andLiqBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQ_BAL not between", value1, value2, "liqBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalIsNull() {
            addCriterion("ACCT_BAL is null");
            return (Criteria) this;
        }

        public Criteria andAcctBalIsNotNull() {
            addCriterion("ACCT_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andAcctBalEqualTo(BigDecimal value) {
            addCriterion("ACCT_BAL =", value, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalNotEqualTo(BigDecimal value) {
            addCriterion("ACCT_BAL <>", value, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalGreaterThan(BigDecimal value) {
            addCriterion("ACCT_BAL >", value, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCT_BAL >=", value, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalLessThan(BigDecimal value) {
            addCriterion("ACCT_BAL <", value, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCT_BAL <=", value, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalIn(List<BigDecimal> values) {
            addCriterion("ACCT_BAL in", values, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalNotIn(List<BigDecimal> values) {
            addCriterion("ACCT_BAL not in", values, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCT_BAL between", value1, value2, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAcctBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCT_BAL not between", value1, value2, "acctBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalIsNull() {
            addCriterion("AVL_BAL is null");
            return (Criteria) this;
        }

        public Criteria andAvlBalIsNotNull() {
            addCriterion("AVL_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andAvlBalEqualTo(BigDecimal value) {
            addCriterion("AVL_BAL =", value, "avlBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalNotEqualTo(BigDecimal value) {
            addCriterion("AVL_BAL <>", value, "avlBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalGreaterThan(BigDecimal value) {
            addCriterion("AVL_BAL >", value, "avlBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVL_BAL >=", value, "avlBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalLessThan(BigDecimal value) {
            addCriterion("AVL_BAL <", value, "avlBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVL_BAL <=", value, "avlBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalIn(List<BigDecimal> values) {
            addCriterion("AVL_BAL in", values, "avlBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalNotIn(List<BigDecimal> values) {
            addCriterion("AVL_BAL not in", values, "avlBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVL_BAL between", value1, value2, "avlBal");
            return (Criteria) this;
        }

        public Criteria andAvlBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVL_BAL not between", value1, value2, "avlBal");
            return (Criteria) this;
        }

        public Criteria andSepBalIsNull() {
            addCriterion("SEP_BAL is null");
            return (Criteria) this;
        }

        public Criteria andSepBalIsNotNull() {
            addCriterion("SEP_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andSepBalEqualTo(BigDecimal value) {
            addCriterion("SEP_BAL =", value, "sepBal");
            return (Criteria) this;
        }

        public Criteria andSepBalNotEqualTo(BigDecimal value) {
            addCriterion("SEP_BAL <>", value, "sepBal");
            return (Criteria) this;
        }

        public Criteria andSepBalGreaterThan(BigDecimal value) {
            addCriterion("SEP_BAL >", value, "sepBal");
            return (Criteria) this;
        }

        public Criteria andSepBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEP_BAL >=", value, "sepBal");
            return (Criteria) this;
        }

        public Criteria andSepBalLessThan(BigDecimal value) {
            addCriterion("SEP_BAL <", value, "sepBal");
            return (Criteria) this;
        }

        public Criteria andSepBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEP_BAL <=", value, "sepBal");
            return (Criteria) this;
        }

        public Criteria andSepBalIn(List<BigDecimal> values) {
            addCriterion("SEP_BAL in", values, "sepBal");
            return (Criteria) this;
        }

        public Criteria andSepBalNotIn(List<BigDecimal> values) {
            addCriterion("SEP_BAL not in", values, "sepBal");
            return (Criteria) this;
        }

        public Criteria andSepBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEP_BAL between", value1, value2, "sepBal");
            return (Criteria) this;
        }

        public Criteria andSepBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEP_BAL not between", value1, value2, "sepBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalIsNull() {
            addCriterion("FRZ_BAL is null");
            return (Criteria) this;
        }

        public Criteria andFrzBalIsNotNull() {
            addCriterion("FRZ_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andFrzBalEqualTo(BigDecimal value) {
            addCriterion("FRZ_BAL =", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalNotEqualTo(BigDecimal value) {
            addCriterion("FRZ_BAL <>", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalGreaterThan(BigDecimal value) {
            addCriterion("FRZ_BAL >", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FRZ_BAL >=", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalLessThan(BigDecimal value) {
            addCriterion("FRZ_BAL <", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FRZ_BAL <=", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalIn(List<BigDecimal> values) {
            addCriterion("FRZ_BAL in", values, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalNotIn(List<BigDecimal> values) {
            addCriterion("FRZ_BAL not in", values, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRZ_BAL between", value1, value2, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRZ_BAL not between", value1, value2, "frzBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalIsNull() {
            addCriterion("TMP_BAL is null");
            return (Criteria) this;
        }

        public Criteria andTmpBalIsNotNull() {
            addCriterion("TMP_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andTmpBalEqualTo(BigDecimal value) {
            addCriterion("TMP_BAL =", value, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalNotEqualTo(BigDecimal value) {
            addCriterion("TMP_BAL <>", value, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalGreaterThan(BigDecimal value) {
            addCriterion("TMP_BAL >", value, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TMP_BAL >=", value, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalLessThan(BigDecimal value) {
            addCriterion("TMP_BAL <", value, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TMP_BAL <=", value, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalIn(List<BigDecimal> values) {
            addCriterion("TMP_BAL in", values, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalNotIn(List<BigDecimal> values) {
            addCriterion("TMP_BAL not in", values, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMP_BAL between", value1, value2, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTmpBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMP_BAL not between", value1, value2, "tmpBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalIsNull() {
            addCriterion("TRF_BAL is null");
            return (Criteria) this;
        }

        public Criteria andTrfBalIsNotNull() {
            addCriterion("TRF_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andTrfBalEqualTo(BigDecimal value) {
            addCriterion("TRF_BAL =", value, "trfBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalNotEqualTo(BigDecimal value) {
            addCriterion("TRF_BAL <>", value, "trfBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalGreaterThan(BigDecimal value) {
            addCriterion("TRF_BAL >", value, "trfBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRF_BAL >=", value, "trfBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalLessThan(BigDecimal value) {
            addCriterion("TRF_BAL <", value, "trfBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRF_BAL <=", value, "trfBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalIn(List<BigDecimal> values) {
            addCriterion("TRF_BAL in", values, "trfBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalNotIn(List<BigDecimal> values) {
            addCriterion("TRF_BAL not in", values, "trfBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRF_BAL between", value1, value2, "trfBal");
            return (Criteria) this;
        }

        public Criteria andTrfBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRF_BAL not between", value1, value2, "trfBal");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeIsNull() {
            addCriterion("AUTO_TRF_MODE is null");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeIsNotNull() {
            addCriterion("AUTO_TRF_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeEqualTo(String value) {
            addCriterion("AUTO_TRF_MODE =", value, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeNotEqualTo(String value) {
            addCriterion("AUTO_TRF_MODE <>", value, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeGreaterThan(String value) {
            addCriterion("AUTO_TRF_MODE >", value, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_TRF_MODE >=", value, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeLessThan(String value) {
            addCriterion("AUTO_TRF_MODE <", value, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeLessThanOrEqualTo(String value) {
            addCriterion("AUTO_TRF_MODE <=", value, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeLike(String value) {
            addCriterion("AUTO_TRF_MODE like", value, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeNotLike(String value) {
            addCriterion("AUTO_TRF_MODE not like", value, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeIn(List<String> values) {
            addCriterion("AUTO_TRF_MODE in", values, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeNotIn(List<String> values) {
            addCriterion("AUTO_TRF_MODE not in", values, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeBetween(String value1, String value2) {
            addCriterion("AUTO_TRF_MODE between", value1, value2, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andAutoTrfModeNotBetween(String value1, String value2) {
            addCriterion("AUTO_TRF_MODE not between", value1, value2, "autoTrfMode");
            return (Criteria) this;
        }

        public Criteria andHoldAmtIsNull() {
            addCriterion("HOLD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andHoldAmtIsNotNull() {
            addCriterion("HOLD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andHoldAmtEqualTo(BigDecimal value) {
            addCriterion("HOLD_AMT =", value, "holdAmt");
            return (Criteria) this;
        }

        public Criteria andHoldAmtNotEqualTo(BigDecimal value) {
            addCriterion("HOLD_AMT <>", value, "holdAmt");
            return (Criteria) this;
        }

        public Criteria andHoldAmtGreaterThan(BigDecimal value) {
            addCriterion("HOLD_AMT >", value, "holdAmt");
            return (Criteria) this;
        }

        public Criteria andHoldAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOLD_AMT >=", value, "holdAmt");
            return (Criteria) this;
        }

        public Criteria andHoldAmtLessThan(BigDecimal value) {
            addCriterion("HOLD_AMT <", value, "holdAmt");
            return (Criteria) this;
        }

        public Criteria andHoldAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOLD_AMT <=", value, "holdAmt");
            return (Criteria) this;
        }

        public Criteria andHoldAmtIn(List<BigDecimal> values) {
            addCriterion("HOLD_AMT in", values, "holdAmt");
            return (Criteria) this;
        }

        public Criteria andHoldAmtNotIn(List<BigDecimal> values) {
            addCriterion("HOLD_AMT not in", values, "holdAmt");
            return (Criteria) this;
        }

        public Criteria andHoldAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOLD_AMT between", value1, value2, "holdAmt");
            return (Criteria) this;
        }

        public Criteria andHoldAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOLD_AMT not between", value1, value2, "holdAmt");
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

        public Criteria andDepBalIsNull() {
            addCriterion("DEP_BAL is null");
            return (Criteria) this;
        }

        public Criteria andDepBalIsNotNull() {
            addCriterion("DEP_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andDepBalEqualTo(BigDecimal value) {
            addCriterion("DEP_BAL =", value, "depBal");
            return (Criteria) this;
        }

        public Criteria andDepBalNotEqualTo(BigDecimal value) {
            addCriterion("DEP_BAL <>", value, "depBal");
            return (Criteria) this;
        }

        public Criteria andDepBalGreaterThan(BigDecimal value) {
            addCriterion("DEP_BAL >", value, "depBal");
            return (Criteria) this;
        }

        public Criteria andDepBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEP_BAL >=", value, "depBal");
            return (Criteria) this;
        }

        public Criteria andDepBalLessThan(BigDecimal value) {
            addCriterion("DEP_BAL <", value, "depBal");
            return (Criteria) this;
        }

        public Criteria andDepBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEP_BAL <=", value, "depBal");
            return (Criteria) this;
        }

        public Criteria andDepBalIn(List<BigDecimal> values) {
            addCriterion("DEP_BAL in", values, "depBal");
            return (Criteria) this;
        }

        public Criteria andDepBalNotIn(List<BigDecimal> values) {
            addCriterion("DEP_BAL not in", values, "depBal");
            return (Criteria) this;
        }

        public Criteria andDepBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEP_BAL between", value1, value2, "depBal");
            return (Criteria) this;
        }

        public Criteria andDepBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEP_BAL not between", value1, value2, "depBal");
            return (Criteria) this;
        }

        public Criteria andCashLimitIsNull() {
            addCriterion("CASH_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCashLimitIsNotNull() {
            addCriterion("CASH_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCashLimitEqualTo(BigDecimal value) {
            addCriterion("CASH_LIMIT =", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitNotEqualTo(BigDecimal value) {
            addCriterion("CASH_LIMIT <>", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitGreaterThan(BigDecimal value) {
            addCriterion("CASH_LIMIT >", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_LIMIT >=", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitLessThan(BigDecimal value) {
            addCriterion("CASH_LIMIT <", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_LIMIT <=", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitIn(List<BigDecimal> values) {
            addCriterion("CASH_LIMIT in", values, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitNotIn(List<BigDecimal> values) {
            addCriterion("CASH_LIMIT not in", values, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_LIMIT between", value1, value2, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_LIMIT not between", value1, value2, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalIsNull() {
            addCriterion("LAST_AVL_BAL is null");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalIsNotNull() {
            addCriterion("LAST_AVL_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalEqualTo(BigDecimal value) {
            addCriterion("LAST_AVL_BAL =", value, "lastAvlBal");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalNotEqualTo(BigDecimal value) {
            addCriterion("LAST_AVL_BAL <>", value, "lastAvlBal");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalGreaterThan(BigDecimal value) {
            addCriterion("LAST_AVL_BAL >", value, "lastAvlBal");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_AVL_BAL >=", value, "lastAvlBal");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalLessThan(BigDecimal value) {
            addCriterion("LAST_AVL_BAL <", value, "lastAvlBal");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_AVL_BAL <=", value, "lastAvlBal");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalIn(List<BigDecimal> values) {
            addCriterion("LAST_AVL_BAL in", values, "lastAvlBal");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalNotIn(List<BigDecimal> values) {
            addCriterion("LAST_AVL_BAL not in", values, "lastAvlBal");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_AVL_BAL between", value1, value2, "lastAvlBal");
            return (Criteria) this;
        }

        public Criteria andLastAvlBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_AVL_BAL not between", value1, value2, "lastAvlBal");
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