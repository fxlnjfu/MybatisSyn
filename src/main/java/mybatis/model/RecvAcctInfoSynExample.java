package mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class RecvAcctInfoSynExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecvAcctInfoSynExample() {
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