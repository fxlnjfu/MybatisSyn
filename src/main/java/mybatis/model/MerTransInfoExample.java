package mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MerTransInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerTransInfoExample() {
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

        public Criteria andMerNameShortIsNull() {
            addCriterion("MER_NAME_SHORT is null");
            return (Criteria) this;
        }

        public Criteria andMerNameShortIsNotNull() {
            addCriterion("MER_NAME_SHORT is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameShortEqualTo(String value) {
            addCriterion("MER_NAME_SHORT =", value, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortNotEqualTo(String value) {
            addCriterion("MER_NAME_SHORT <>", value, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortGreaterThan(String value) {
            addCriterion("MER_NAME_SHORT >", value, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortGreaterThanOrEqualTo(String value) {
            addCriterion("MER_NAME_SHORT >=", value, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortLessThan(String value) {
            addCriterion("MER_NAME_SHORT <", value, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortLessThanOrEqualTo(String value) {
            addCriterion("MER_NAME_SHORT <=", value, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortLike(String value) {
            addCriterion("MER_NAME_SHORT like", value, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortNotLike(String value) {
            addCriterion("MER_NAME_SHORT not like", value, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortIn(List<String> values) {
            addCriterion("MER_NAME_SHORT in", values, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortNotIn(List<String> values) {
            addCriterion("MER_NAME_SHORT not in", values, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortBetween(String value1, String value2) {
            addCriterion("MER_NAME_SHORT between", value1, value2, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andMerNameShortNotBetween(String value1, String value2) {
            addCriterion("MER_NAME_SHORT not between", value1, value2, "merNameShort");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdIsNull() {
            addCriterion("TTF_MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdIsNotNull() {
            addCriterion("TTF_MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdEqualTo(String value) {
            addCriterion("TTF_MER_ID =", value, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdNotEqualTo(String value) {
            addCriterion("TTF_MER_ID <>", value, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdGreaterThan(String value) {
            addCriterion("TTF_MER_ID >", value, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("TTF_MER_ID >=", value, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdLessThan(String value) {
            addCriterion("TTF_MER_ID <", value, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdLessThanOrEqualTo(String value) {
            addCriterion("TTF_MER_ID <=", value, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdLike(String value) {
            addCriterion("TTF_MER_ID like", value, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdNotLike(String value) {
            addCriterion("TTF_MER_ID not like", value, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdIn(List<String> values) {
            addCriterion("TTF_MER_ID in", values, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdNotIn(List<String> values) {
            addCriterion("TTF_MER_ID not in", values, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdBetween(String value1, String value2) {
            addCriterion("TTF_MER_ID between", value1, value2, "ttfMerId");
            return (Criteria) this;
        }

        public Criteria andTtfMerIdNotBetween(String value1, String value2) {
            addCriterion("TTF_MER_ID not between", value1, value2, "ttfMerId");
            return (Criteria) this;
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

        public Criteria andLiqDriIsNull() {
            addCriterion("LIQ_DRI is null");
            return (Criteria) this;
        }

        public Criteria andLiqDriIsNotNull() {
            addCriterion("LIQ_DRI is not null");
            return (Criteria) this;
        }

        public Criteria andLiqDriEqualTo(String value) {
            addCriterion("LIQ_DRI =", value, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriNotEqualTo(String value) {
            addCriterion("LIQ_DRI <>", value, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriGreaterThan(String value) {
            addCriterion("LIQ_DRI >", value, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriGreaterThanOrEqualTo(String value) {
            addCriterion("LIQ_DRI >=", value, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriLessThan(String value) {
            addCriterion("LIQ_DRI <", value, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriLessThanOrEqualTo(String value) {
            addCriterion("LIQ_DRI <=", value, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriLike(String value) {
            addCriterion("LIQ_DRI like", value, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriNotLike(String value) {
            addCriterion("LIQ_DRI not like", value, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriIn(List<String> values) {
            addCriterion("LIQ_DRI in", values, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriNotIn(List<String> values) {
            addCriterion("LIQ_DRI not in", values, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriBetween(String value1, String value2) {
            addCriterion("LIQ_DRI between", value1, value2, "liqDri");
            return (Criteria) this;
        }

        public Criteria andLiqDriNotBetween(String value1, String value2) {
            addCriterion("LIQ_DRI not between", value1, value2, "liqDri");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeIsNull() {
            addCriterion("GET_FEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeIsNotNull() {
            addCriterion("GET_FEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeEqualTo(String value) {
            addCriterion("GET_FEE_TYPE =", value, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeNotEqualTo(String value) {
            addCriterion("GET_FEE_TYPE <>", value, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeGreaterThan(String value) {
            addCriterion("GET_FEE_TYPE >", value, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GET_FEE_TYPE >=", value, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeLessThan(String value) {
            addCriterion("GET_FEE_TYPE <", value, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("GET_FEE_TYPE <=", value, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeLike(String value) {
            addCriterion("GET_FEE_TYPE like", value, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeNotLike(String value) {
            addCriterion("GET_FEE_TYPE not like", value, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeIn(List<String> values) {
            addCriterion("GET_FEE_TYPE in", values, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeNotIn(List<String> values) {
            addCriterion("GET_FEE_TYPE not in", values, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeBetween(String value1, String value2) {
            addCriterion("GET_FEE_TYPE between", value1, value2, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andGetFeeTypeNotBetween(String value1, String value2) {
            addCriterion("GET_FEE_TYPE not between", value1, value2, "getFeeType");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateIsNull() {
            addCriterion("LAST_FEE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateIsNotNull() {
            addCriterion("LAST_FEE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateEqualTo(String value) {
            addCriterion("LAST_FEE_DATE =", value, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateNotEqualTo(String value) {
            addCriterion("LAST_FEE_DATE <>", value, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateGreaterThan(String value) {
            addCriterion("LAST_FEE_DATE >", value, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_FEE_DATE >=", value, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateLessThan(String value) {
            addCriterion("LAST_FEE_DATE <", value, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateLessThanOrEqualTo(String value) {
            addCriterion("LAST_FEE_DATE <=", value, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateLike(String value) {
            addCriterion("LAST_FEE_DATE like", value, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateNotLike(String value) {
            addCriterion("LAST_FEE_DATE not like", value, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateIn(List<String> values) {
            addCriterion("LAST_FEE_DATE in", values, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateNotIn(List<String> values) {
            addCriterion("LAST_FEE_DATE not in", values, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateBetween(String value1, String value2) {
            addCriterion("LAST_FEE_DATE between", value1, value2, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andLastFeeDateNotBetween(String value1, String value2) {
            addCriterion("LAST_FEE_DATE not between", value1, value2, "lastFeeDate");
            return (Criteria) this;
        }

        public Criteria andStatFlagIsNull() {
            addCriterion("STAT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andStatFlagIsNotNull() {
            addCriterion("STAT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStatFlagEqualTo(String value) {
            addCriterion("STAT_FLAG =", value, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagNotEqualTo(String value) {
            addCriterion("STAT_FLAG <>", value, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagGreaterThan(String value) {
            addCriterion("STAT_FLAG >", value, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagGreaterThanOrEqualTo(String value) {
            addCriterion("STAT_FLAG >=", value, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagLessThan(String value) {
            addCriterion("STAT_FLAG <", value, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagLessThanOrEqualTo(String value) {
            addCriterion("STAT_FLAG <=", value, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagLike(String value) {
            addCriterion("STAT_FLAG like", value, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagNotLike(String value) {
            addCriterion("STAT_FLAG not like", value, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagIn(List<String> values) {
            addCriterion("STAT_FLAG in", values, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagNotIn(List<String> values) {
            addCriterion("STAT_FLAG not in", values, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagBetween(String value1, String value2) {
            addCriterion("STAT_FLAG between", value1, value2, "statFlag");
            return (Criteria) this;
        }

        public Criteria andStatFlagNotBetween(String value1, String value2) {
            addCriterion("STAT_FLAG not between", value1, value2, "statFlag");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIsNull() {
            addCriterion("LAST_UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIsNotNull() {
            addCriterion("LAST_UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeEqualTo(String value) {
            addCriterion("LAST_UPD_TIME =", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotEqualTo(String value) {
            addCriterion("LAST_UPD_TIME <>", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeGreaterThan(String value) {
            addCriterion("LAST_UPD_TIME >", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_TIME >=", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLessThan(String value) {
            addCriterion("LAST_UPD_TIME <", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_TIME <=", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLike(String value) {
            addCriterion("LAST_UPD_TIME like", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotLike(String value) {
            addCriterion("LAST_UPD_TIME not like", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIn(List<String> values) {
            addCriterion("LAST_UPD_TIME in", values, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotIn(List<String> values) {
            addCriterion("LAST_UPD_TIME not in", values, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeBetween(String value1, String value2) {
            addCriterion("LAST_UPD_TIME between", value1, value2, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_UPD_TIME not between", value1, value2, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtIsNull() {
            addCriterion("REF_DIV_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtIsNotNull() {
            addCriterion("REF_DIV_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtEqualTo(String value) {
            addCriterion("REF_DIV_AMT =", value, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtNotEqualTo(String value) {
            addCriterion("REF_DIV_AMT <>", value, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtGreaterThan(String value) {
            addCriterion("REF_DIV_AMT >", value, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtGreaterThanOrEqualTo(String value) {
            addCriterion("REF_DIV_AMT >=", value, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtLessThan(String value) {
            addCriterion("REF_DIV_AMT <", value, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtLessThanOrEqualTo(String value) {
            addCriterion("REF_DIV_AMT <=", value, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtLike(String value) {
            addCriterion("REF_DIV_AMT like", value, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtNotLike(String value) {
            addCriterion("REF_DIV_AMT not like", value, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtIn(List<String> values) {
            addCriterion("REF_DIV_AMT in", values, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtNotIn(List<String> values) {
            addCriterion("REF_DIV_AMT not in", values, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtBetween(String value1, String value2) {
            addCriterion("REF_DIV_AMT between", value1, value2, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefDivAmtNotBetween(String value1, String value2) {
            addCriterion("REF_DIV_AMT not between", value1, value2, "refDivAmt");
            return (Criteria) this;
        }

        public Criteria andRefundWaitIsNull() {
            addCriterion("REFUND_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andRefundWaitIsNotNull() {
            addCriterion("REFUND_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundWaitEqualTo(String value) {
            addCriterion("REFUND_WAIT =", value, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitNotEqualTo(String value) {
            addCriterion("REFUND_WAIT <>", value, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitGreaterThan(String value) {
            addCriterion("REFUND_WAIT >", value, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_WAIT >=", value, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitLessThan(String value) {
            addCriterion("REFUND_WAIT <", value, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitLessThanOrEqualTo(String value) {
            addCriterion("REFUND_WAIT <=", value, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitLike(String value) {
            addCriterion("REFUND_WAIT like", value, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitNotLike(String value) {
            addCriterion("REFUND_WAIT not like", value, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitIn(List<String> values) {
            addCriterion("REFUND_WAIT in", values, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitNotIn(List<String> values) {
            addCriterion("REFUND_WAIT not in", values, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitBetween(String value1, String value2) {
            addCriterion("REFUND_WAIT between", value1, value2, "refundWait");
            return (Criteria) this;
        }

        public Criteria andRefundWaitNotBetween(String value1, String value2) {
            addCriterion("REFUND_WAIT not between", value1, value2, "refundWait");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrIsNull() {
            addCriterion("IS_OPEN_CR is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrIsNotNull() {
            addCriterion("IS_OPEN_CR is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrEqualTo(String value) {
            addCriterion("IS_OPEN_CR =", value, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrNotEqualTo(String value) {
            addCriterion("IS_OPEN_CR <>", value, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrGreaterThan(String value) {
            addCriterion("IS_OPEN_CR >", value, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_CR >=", value, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrLessThan(String value) {
            addCriterion("IS_OPEN_CR <", value, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrLessThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_CR <=", value, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrLike(String value) {
            addCriterion("IS_OPEN_CR like", value, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrNotLike(String value) {
            addCriterion("IS_OPEN_CR not like", value, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrIn(List<String> values) {
            addCriterion("IS_OPEN_CR in", values, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrNotIn(List<String> values) {
            addCriterion("IS_OPEN_CR not in", values, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrBetween(String value1, String value2) {
            addCriterion("IS_OPEN_CR between", value1, value2, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenCrNotBetween(String value1, String value2) {
            addCriterion("IS_OPEN_CR not between", value1, value2, "isOpenCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvIsNull() {
            addCriterion("IS_OPEN_RECV is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvIsNotNull() {
            addCriterion("IS_OPEN_RECV is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvEqualTo(String value) {
            addCriterion("IS_OPEN_RECV =", value, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvNotEqualTo(String value) {
            addCriterion("IS_OPEN_RECV <>", value, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvGreaterThan(String value) {
            addCriterion("IS_OPEN_RECV >", value, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_RECV >=", value, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvLessThan(String value) {
            addCriterion("IS_OPEN_RECV <", value, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvLessThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_RECV <=", value, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvLike(String value) {
            addCriterion("IS_OPEN_RECV like", value, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvNotLike(String value) {
            addCriterion("IS_OPEN_RECV not like", value, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvIn(List<String> values) {
            addCriterion("IS_OPEN_RECV in", values, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvNotIn(List<String> values) {
            addCriterion("IS_OPEN_RECV not in", values, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvBetween(String value1, String value2) {
            addCriterion("IS_OPEN_RECV between", value1, value2, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andIsOpenRecvNotBetween(String value1, String value2) {
            addCriterion("IS_OPEN_RECV not between", value1, value2, "isOpenRecv");
            return (Criteria) this;
        }

        public Criteria andMerTypeIsNull() {
            addCriterion("MER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMerTypeIsNotNull() {
            addCriterion("MER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMerTypeEqualTo(String value) {
            addCriterion("MER_TYPE =", value, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeNotEqualTo(String value) {
            addCriterion("MER_TYPE <>", value, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeGreaterThan(String value) {
            addCriterion("MER_TYPE >", value, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MER_TYPE >=", value, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeLessThan(String value) {
            addCriterion("MER_TYPE <", value, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeLessThanOrEqualTo(String value) {
            addCriterion("MER_TYPE <=", value, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeLike(String value) {
            addCriterion("MER_TYPE like", value, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeNotLike(String value) {
            addCriterion("MER_TYPE not like", value, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeIn(List<String> values) {
            addCriterion("MER_TYPE in", values, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeNotIn(List<String> values) {
            addCriterion("MER_TYPE not in", values, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeBetween(String value1, String value2) {
            addCriterion("MER_TYPE between", value1, value2, "merType");
            return (Criteria) this;
        }

        public Criteria andMerTypeNotBetween(String value1, String value2) {
            addCriterion("MER_TYPE not between", value1, value2, "merType");
            return (Criteria) this;
        }

        public Criteria andLiqFlagIsNull() {
            addCriterion("LIQ_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLiqFlagIsNotNull() {
            addCriterion("LIQ_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLiqFlagEqualTo(String value) {
            addCriterion("LIQ_FLAG =", value, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagNotEqualTo(String value) {
            addCriterion("LIQ_FLAG <>", value, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagGreaterThan(String value) {
            addCriterion("LIQ_FLAG >", value, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagGreaterThanOrEqualTo(String value) {
            addCriterion("LIQ_FLAG >=", value, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagLessThan(String value) {
            addCriterion("LIQ_FLAG <", value, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagLessThanOrEqualTo(String value) {
            addCriterion("LIQ_FLAG <=", value, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagLike(String value) {
            addCriterion("LIQ_FLAG like", value, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagNotLike(String value) {
            addCriterion("LIQ_FLAG not like", value, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagIn(List<String> values) {
            addCriterion("LIQ_FLAG in", values, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagNotIn(List<String> values) {
            addCriterion("LIQ_FLAG not in", values, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagBetween(String value1, String value2) {
            addCriterion("LIQ_FLAG between", value1, value2, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andLiqFlagNotBetween(String value1, String value2) {
            addCriterion("LIQ_FLAG not between", value1, value2, "liqFlag");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepIsNull() {
            addCriterion("IS_OPEN_DEP is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepIsNotNull() {
            addCriterion("IS_OPEN_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepEqualTo(String value) {
            addCriterion("IS_OPEN_DEP =", value, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepNotEqualTo(String value) {
            addCriterion("IS_OPEN_DEP <>", value, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepGreaterThan(String value) {
            addCriterion("IS_OPEN_DEP >", value, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_DEP >=", value, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepLessThan(String value) {
            addCriterion("IS_OPEN_DEP <", value, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepLessThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_DEP <=", value, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepLike(String value) {
            addCriterion("IS_OPEN_DEP like", value, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepNotLike(String value) {
            addCriterion("IS_OPEN_DEP not like", value, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepIn(List<String> values) {
            addCriterion("IS_OPEN_DEP in", values, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepNotIn(List<String> values) {
            addCriterion("IS_OPEN_DEP not in", values, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepBetween(String value1, String value2) {
            addCriterion("IS_OPEN_DEP between", value1, value2, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andIsOpenDepNotBetween(String value1, String value2) {
            addCriterion("IS_OPEN_DEP not between", value1, value2, "isOpenDep");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeIsNull() {
            addCriterion("RECV_ACCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeIsNotNull() {
            addCriterion("RECV_ACCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeEqualTo(String value) {
            addCriterion("RECV_ACCT_TYPE =", value, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeNotEqualTo(String value) {
            addCriterion("RECV_ACCT_TYPE <>", value, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeGreaterThan(String value) {
            addCriterion("RECV_ACCT_TYPE >", value, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECV_ACCT_TYPE >=", value, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeLessThan(String value) {
            addCriterion("RECV_ACCT_TYPE <", value, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeLessThanOrEqualTo(String value) {
            addCriterion("RECV_ACCT_TYPE <=", value, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeLike(String value) {
            addCriterion("RECV_ACCT_TYPE like", value, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeNotLike(String value) {
            addCriterion("RECV_ACCT_TYPE not like", value, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeIn(List<String> values) {
            addCriterion("RECV_ACCT_TYPE in", values, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeNotIn(List<String> values) {
            addCriterion("RECV_ACCT_TYPE not in", values, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeBetween(String value1, String value2) {
            addCriterion("RECV_ACCT_TYPE between", value1, value2, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andRecvAcctTypeNotBetween(String value1, String value2) {
            addCriterion("RECV_ACCT_TYPE not between", value1, value2, "recvAcctType");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdIsNull() {
            addCriterion("DEP_SAVE_MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdIsNotNull() {
            addCriterion("DEP_SAVE_MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdEqualTo(String value) {
            addCriterion("DEP_SAVE_MER_ID =", value, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdNotEqualTo(String value) {
            addCriterion("DEP_SAVE_MER_ID <>", value, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdGreaterThan(String value) {
            addCriterion("DEP_SAVE_MER_ID >", value, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_SAVE_MER_ID >=", value, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdLessThan(String value) {
            addCriterion("DEP_SAVE_MER_ID <", value, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdLessThanOrEqualTo(String value) {
            addCriterion("DEP_SAVE_MER_ID <=", value, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdLike(String value) {
            addCriterion("DEP_SAVE_MER_ID like", value, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdNotLike(String value) {
            addCriterion("DEP_SAVE_MER_ID not like", value, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdIn(List<String> values) {
            addCriterion("DEP_SAVE_MER_ID in", values, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdNotIn(List<String> values) {
            addCriterion("DEP_SAVE_MER_ID not in", values, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdBetween(String value1, String value2) {
            addCriterion("DEP_SAVE_MER_ID between", value1, value2, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andDepSaveMerIdNotBetween(String value1, String value2) {
            addCriterion("DEP_SAVE_MER_ID not between", value1, value2, "depSaveMerId");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectIsNull() {
            addCriterion("GET_FEE_ASPECT is null");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectIsNotNull() {
            addCriterion("GET_FEE_ASPECT is not null");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectEqualTo(String value) {
            addCriterion("GET_FEE_ASPECT =", value, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectNotEqualTo(String value) {
            addCriterion("GET_FEE_ASPECT <>", value, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectGreaterThan(String value) {
            addCriterion("GET_FEE_ASPECT >", value, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectGreaterThanOrEqualTo(String value) {
            addCriterion("GET_FEE_ASPECT >=", value, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectLessThan(String value) {
            addCriterion("GET_FEE_ASPECT <", value, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectLessThanOrEqualTo(String value) {
            addCriterion("GET_FEE_ASPECT <=", value, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectLike(String value) {
            addCriterion("GET_FEE_ASPECT like", value, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectNotLike(String value) {
            addCriterion("GET_FEE_ASPECT not like", value, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectIn(List<String> values) {
            addCriterion("GET_FEE_ASPECT in", values, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectNotIn(List<String> values) {
            addCriterion("GET_FEE_ASPECT not in", values, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectBetween(String value1, String value2) {
            addCriterion("GET_FEE_ASPECT between", value1, value2, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andGetFeeAspectNotBetween(String value1, String value2) {
            addCriterion("GET_FEE_ASPECT not between", value1, value2, "getFeeAspect");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrIsNull() {
            addCriterion("IS_OPEN_BIG_CR is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrIsNotNull() {
            addCriterion("IS_OPEN_BIG_CR is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrEqualTo(String value) {
            addCriterion("IS_OPEN_BIG_CR =", value, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrNotEqualTo(String value) {
            addCriterion("IS_OPEN_BIG_CR <>", value, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrGreaterThan(String value) {
            addCriterion("IS_OPEN_BIG_CR >", value, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_BIG_CR >=", value, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrLessThan(String value) {
            addCriterion("IS_OPEN_BIG_CR <", value, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrLessThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_BIG_CR <=", value, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrLike(String value) {
            addCriterion("IS_OPEN_BIG_CR like", value, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrNotLike(String value) {
            addCriterion("IS_OPEN_BIG_CR not like", value, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrIn(List<String> values) {
            addCriterion("IS_OPEN_BIG_CR in", values, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrNotIn(List<String> values) {
            addCriterion("IS_OPEN_BIG_CR not in", values, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrBetween(String value1, String value2) {
            addCriterion("IS_OPEN_BIG_CR between", value1, value2, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andIsOpenBigCrNotBetween(String value1, String value2) {
            addCriterion("IS_OPEN_BIG_CR not between", value1, value2, "isOpenBigCr");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeIsNull() {
            addCriterion("NEW_DIV_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeIsNotNull() {
            addCriterion("NEW_DIV_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeEqualTo(String value) {
            addCriterion("NEW_DIV_TYPE =", value, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeNotEqualTo(String value) {
            addCriterion("NEW_DIV_TYPE <>", value, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeGreaterThan(String value) {
            addCriterion("NEW_DIV_TYPE >", value, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_DIV_TYPE >=", value, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeLessThan(String value) {
            addCriterion("NEW_DIV_TYPE <", value, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeLessThanOrEqualTo(String value) {
            addCriterion("NEW_DIV_TYPE <=", value, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeLike(String value) {
            addCriterion("NEW_DIV_TYPE like", value, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeNotLike(String value) {
            addCriterion("NEW_DIV_TYPE not like", value, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeIn(List<String> values) {
            addCriterion("NEW_DIV_TYPE in", values, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeNotIn(List<String> values) {
            addCriterion("NEW_DIV_TYPE not in", values, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeBetween(String value1, String value2) {
            addCriterion("NEW_DIV_TYPE between", value1, value2, "newDivType");
            return (Criteria) this;
        }

        public Criteria andNewDivTypeNotBetween(String value1, String value2) {
            addCriterion("NEW_DIV_TYPE not between", value1, value2, "newDivType");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosIsNull() {
            addCriterion("IS_OPEN_SAND_POS is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosIsNotNull() {
            addCriterion("IS_OPEN_SAND_POS is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosEqualTo(String value) {
            addCriterion("IS_OPEN_SAND_POS =", value, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosNotEqualTo(String value) {
            addCriterion("IS_OPEN_SAND_POS <>", value, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosGreaterThan(String value) {
            addCriterion("IS_OPEN_SAND_POS >", value, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_SAND_POS >=", value, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosLessThan(String value) {
            addCriterion("IS_OPEN_SAND_POS <", value, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosLessThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_SAND_POS <=", value, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosLike(String value) {
            addCriterion("IS_OPEN_SAND_POS like", value, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosNotLike(String value) {
            addCriterion("IS_OPEN_SAND_POS not like", value, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosIn(List<String> values) {
            addCriterion("IS_OPEN_SAND_POS in", values, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosNotIn(List<String> values) {
            addCriterion("IS_OPEN_SAND_POS not in", values, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosBetween(String value1, String value2) {
            addCriterion("IS_OPEN_SAND_POS between", value1, value2, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenSandPosNotBetween(String value1, String value2) {
            addCriterion("IS_OPEN_SAND_POS not between", value1, value2, "isOpenSandPos");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdIsNull() {
            addCriterion("SAND_TTH_MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdIsNotNull() {
            addCriterion("SAND_TTH_MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdEqualTo(String value) {
            addCriterion("SAND_TTH_MER_ID =", value, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdNotEqualTo(String value) {
            addCriterion("SAND_TTH_MER_ID <>", value, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdGreaterThan(String value) {
            addCriterion("SAND_TTH_MER_ID >", value, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("SAND_TTH_MER_ID >=", value, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdLessThan(String value) {
            addCriterion("SAND_TTH_MER_ID <", value, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdLessThanOrEqualTo(String value) {
            addCriterion("SAND_TTH_MER_ID <=", value, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdLike(String value) {
            addCriterion("SAND_TTH_MER_ID like", value, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdNotLike(String value) {
            addCriterion("SAND_TTH_MER_ID not like", value, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdIn(List<String> values) {
            addCriterion("SAND_TTH_MER_ID in", values, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdNotIn(List<String> values) {
            addCriterion("SAND_TTH_MER_ID not in", values, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdBetween(String value1, String value2) {
            addCriterion("SAND_TTH_MER_ID between", value1, value2, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andSandTthMerIdNotBetween(String value1, String value2) {
            addCriterion("SAND_TTH_MER_ID not between", value1, value2, "sandTthMerId");
            return (Criteria) this;
        }

        public Criteria andIsNotifyIsNull() {
            addCriterion("IS_NOTIFY is null");
            return (Criteria) this;
        }

        public Criteria andIsNotifyIsNotNull() {
            addCriterion("IS_NOTIFY is not null");
            return (Criteria) this;
        }

        public Criteria andIsNotifyEqualTo(String value) {
            addCriterion("IS_NOTIFY =", value, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyNotEqualTo(String value) {
            addCriterion("IS_NOTIFY <>", value, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyGreaterThan(String value) {
            addCriterion("IS_NOTIFY >", value, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_NOTIFY >=", value, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyLessThan(String value) {
            addCriterion("IS_NOTIFY <", value, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyLessThanOrEqualTo(String value) {
            addCriterion("IS_NOTIFY <=", value, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyLike(String value) {
            addCriterion("IS_NOTIFY like", value, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyNotLike(String value) {
            addCriterion("IS_NOTIFY not like", value, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyIn(List<String> values) {
            addCriterion("IS_NOTIFY in", values, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyNotIn(List<String> values) {
            addCriterion("IS_NOTIFY not in", values, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyBetween(String value1, String value2) {
            addCriterion("IS_NOTIFY between", value1, value2, "isNotify");
            return (Criteria) this;
        }

        public Criteria andIsNotifyNotBetween(String value1, String value2) {
            addCriterion("IS_NOTIFY not between", value1, value2, "isNotify");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlIsNull() {
            addCriterion("BG_RET_URL is null");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlIsNotNull() {
            addCriterion("BG_RET_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlEqualTo(String value) {
            addCriterion("BG_RET_URL =", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlNotEqualTo(String value) {
            addCriterion("BG_RET_URL <>", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlGreaterThan(String value) {
            addCriterion("BG_RET_URL >", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BG_RET_URL >=", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlLessThan(String value) {
            addCriterion("BG_RET_URL <", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlLessThanOrEqualTo(String value) {
            addCriterion("BG_RET_URL <=", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlLike(String value) {
            addCriterion("BG_RET_URL like", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlNotLike(String value) {
            addCriterion("BG_RET_URL not like", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlIn(List<String> values) {
            addCriterion("BG_RET_URL in", values, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlNotIn(List<String> values) {
            addCriterion("BG_RET_URL not in", values, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlBetween(String value1, String value2) {
            addCriterion("BG_RET_URL between", value1, value2, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlNotBetween(String value1, String value2) {
            addCriterion("BG_RET_URL not between", value1, value2, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosIsNull() {
            addCriterion("IS_OPEN_PNR_POS is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosIsNotNull() {
            addCriterion("IS_OPEN_PNR_POS is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosEqualTo(String value) {
            addCriterion("IS_OPEN_PNR_POS =", value, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosNotEqualTo(String value) {
            addCriterion("IS_OPEN_PNR_POS <>", value, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosGreaterThan(String value) {
            addCriterion("IS_OPEN_PNR_POS >", value, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_PNR_POS >=", value, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosLessThan(String value) {
            addCriterion("IS_OPEN_PNR_POS <", value, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosLessThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_PNR_POS <=", value, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosLike(String value) {
            addCriterion("IS_OPEN_PNR_POS like", value, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosNotLike(String value) {
            addCriterion("IS_OPEN_PNR_POS not like", value, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosIn(List<String> values) {
            addCriterion("IS_OPEN_PNR_POS in", values, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosNotIn(List<String> values) {
            addCriterion("IS_OPEN_PNR_POS not in", values, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosBetween(String value1, String value2) {
            addCriterion("IS_OPEN_PNR_POS between", value1, value2, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsOpenPnrPosNotBetween(String value1, String value2) {
            addCriterion("IS_OPEN_PNR_POS not between", value1, value2, "isOpenPnrPos");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoIsNull() {
            addCriterion("IS_FP_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoIsNotNull() {
            addCriterion("IS_FP_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoEqualTo(String value) {
            addCriterion("IS_FP_LOGO =", value, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoNotEqualTo(String value) {
            addCriterion("IS_FP_LOGO <>", value, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoGreaterThan(String value) {
            addCriterion("IS_FP_LOGO >", value, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FP_LOGO >=", value, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoLessThan(String value) {
            addCriterion("IS_FP_LOGO <", value, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoLessThanOrEqualTo(String value) {
            addCriterion("IS_FP_LOGO <=", value, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoLike(String value) {
            addCriterion("IS_FP_LOGO like", value, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoNotLike(String value) {
            addCriterion("IS_FP_LOGO not like", value, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoIn(List<String> values) {
            addCriterion("IS_FP_LOGO in", values, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoNotIn(List<String> values) {
            addCriterion("IS_FP_LOGO not in", values, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoBetween(String value1, String value2) {
            addCriterion("IS_FP_LOGO between", value1, value2, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andIsFpLogoNotBetween(String value1, String value2) {
            addCriterion("IS_FP_LOGO not between", value1, value2, "isFpLogo");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlIsNull() {
            addCriterion("BG_REF_RET_URL is null");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlIsNotNull() {
            addCriterion("BG_REF_RET_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlEqualTo(String value) {
            addCriterion("BG_REF_RET_URL =", value, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlNotEqualTo(String value) {
            addCriterion("BG_REF_RET_URL <>", value, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlGreaterThan(String value) {
            addCriterion("BG_REF_RET_URL >", value, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BG_REF_RET_URL >=", value, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlLessThan(String value) {
            addCriterion("BG_REF_RET_URL <", value, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlLessThanOrEqualTo(String value) {
            addCriterion("BG_REF_RET_URL <=", value, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlLike(String value) {
            addCriterion("BG_REF_RET_URL like", value, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlNotLike(String value) {
            addCriterion("BG_REF_RET_URL not like", value, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlIn(List<String> values) {
            addCriterion("BG_REF_RET_URL in", values, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlNotIn(List<String> values) {
            addCriterion("BG_REF_RET_URL not in", values, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlBetween(String value1, String value2) {
            addCriterion("BG_REF_RET_URL between", value1, value2, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRefRetUrlNotBetween(String value1, String value2) {
            addCriterion("BG_REF_RET_URL not between", value1, value2, "bgRefRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlIsNull() {
            addCriterion("QUERY_RET_URL is null");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlIsNotNull() {
            addCriterion("QUERY_RET_URL is not null");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlEqualTo(String value) {
            addCriterion("QUERY_RET_URL =", value, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlNotEqualTo(String value) {
            addCriterion("QUERY_RET_URL <>", value, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlGreaterThan(String value) {
            addCriterion("QUERY_RET_URL >", value, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("QUERY_RET_URL >=", value, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlLessThan(String value) {
            addCriterion("QUERY_RET_URL <", value, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlLessThanOrEqualTo(String value) {
            addCriterion("QUERY_RET_URL <=", value, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlLike(String value) {
            addCriterion("QUERY_RET_URL like", value, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlNotLike(String value) {
            addCriterion("QUERY_RET_URL not like", value, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlIn(List<String> values) {
            addCriterion("QUERY_RET_URL in", values, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlNotIn(List<String> values) {
            addCriterion("QUERY_RET_URL not in", values, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlBetween(String value1, String value2) {
            addCriterion("QUERY_RET_URL between", value1, value2, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andQueryRetUrlNotBetween(String value1, String value2) {
            addCriterion("QUERY_RET_URL not between", value1, value2, "queryRetUrl");
            return (Criteria) this;
        }

        public Criteria andMd5KeyIsNull() {
            addCriterion("MD5_KEY is null");
            return (Criteria) this;
        }

        public Criteria andMd5KeyIsNotNull() {
            addCriterion("MD5_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andMd5KeyEqualTo(String value) {
            addCriterion("MD5_KEY =", value, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyNotEqualTo(String value) {
            addCriterion("MD5_KEY <>", value, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyGreaterThan(String value) {
            addCriterion("MD5_KEY >", value, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyGreaterThanOrEqualTo(String value) {
            addCriterion("MD5_KEY >=", value, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyLessThan(String value) {
            addCriterion("MD5_KEY <", value, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyLessThanOrEqualTo(String value) {
            addCriterion("MD5_KEY <=", value, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyLike(String value) {
            addCriterion("MD5_KEY like", value, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyNotLike(String value) {
            addCriterion("MD5_KEY not like", value, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyIn(List<String> values) {
            addCriterion("MD5_KEY in", values, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyNotIn(List<String> values) {
            addCriterion("MD5_KEY not in", values, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyBetween(String value1, String value2) {
            addCriterion("MD5_KEY between", value1, value2, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMd5KeyNotBetween(String value1, String value2) {
            addCriterion("MD5_KEY not between", value1, value2, "md5Key");
            return (Criteria) this;
        }

        public Criteria andMerNameEnIsNull() {
            addCriterion("MER_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andMerNameEnIsNotNull() {
            addCriterion("MER_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameEnEqualTo(String value) {
            addCriterion("MER_NAME_EN =", value, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnNotEqualTo(String value) {
            addCriterion("MER_NAME_EN <>", value, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnGreaterThan(String value) {
            addCriterion("MER_NAME_EN >", value, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("MER_NAME_EN >=", value, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnLessThan(String value) {
            addCriterion("MER_NAME_EN <", value, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnLessThanOrEqualTo(String value) {
            addCriterion("MER_NAME_EN <=", value, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnLike(String value) {
            addCriterion("MER_NAME_EN like", value, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnNotLike(String value) {
            addCriterion("MER_NAME_EN not like", value, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnIn(List<String> values) {
            addCriterion("MER_NAME_EN in", values, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnNotIn(List<String> values) {
            addCriterion("MER_NAME_EN not in", values, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnBetween(String value1, String value2) {
            addCriterion("MER_NAME_EN between", value1, value2, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andMerNameEnNotBetween(String value1, String value2) {
            addCriterion("MER_NAME_EN not between", value1, value2, "merNameEn");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpIsNull() {
            addCriterion("IS_OPEN_FP is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpIsNotNull() {
            addCriterion("IS_OPEN_FP is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpEqualTo(String value) {
            addCriterion("IS_OPEN_FP =", value, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpNotEqualTo(String value) {
            addCriterion("IS_OPEN_FP <>", value, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpGreaterThan(String value) {
            addCriterion("IS_OPEN_FP >", value, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_FP >=", value, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpLessThan(String value) {
            addCriterion("IS_OPEN_FP <", value, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpLessThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_FP <=", value, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpLike(String value) {
            addCriterion("IS_OPEN_FP like", value, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpNotLike(String value) {
            addCriterion("IS_OPEN_FP not like", value, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpIn(List<String> values) {
            addCriterion("IS_OPEN_FP in", values, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpNotIn(List<String> values) {
            addCriterion("IS_OPEN_FP not in", values, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpBetween(String value1, String value2) {
            addCriterion("IS_OPEN_FP between", value1, value2, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenFpNotBetween(String value1, String value2) {
            addCriterion("IS_OPEN_FP not between", value1, value2, "isOpenFp");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelIsNull() {
            addCriterion("IS_OPEN_DA_TEL is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelIsNotNull() {
            addCriterion("IS_OPEN_DA_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelEqualTo(String value) {
            addCriterion("IS_OPEN_DA_TEL =", value, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelNotEqualTo(String value) {
            addCriterion("IS_OPEN_DA_TEL <>", value, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelGreaterThan(String value) {
            addCriterion("IS_OPEN_DA_TEL >", value, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_DA_TEL >=", value, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelLessThan(String value) {
            addCriterion("IS_OPEN_DA_TEL <", value, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelLessThanOrEqualTo(String value) {
            addCriterion("IS_OPEN_DA_TEL <=", value, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelLike(String value) {
            addCriterion("IS_OPEN_DA_TEL like", value, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelNotLike(String value) {
            addCriterion("IS_OPEN_DA_TEL not like", value, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelIn(List<String> values) {
            addCriterion("IS_OPEN_DA_TEL in", values, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelNotIn(List<String> values) {
            addCriterion("IS_OPEN_DA_TEL not in", values, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelBetween(String value1, String value2) {
            addCriterion("IS_OPEN_DA_TEL between", value1, value2, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andIsOpenDaTelNotBetween(String value1, String value2) {
            addCriterion("IS_OPEN_DA_TEL not between", value1, value2, "isOpenDaTel");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeIsNull() {
            addCriterion("OPEN_TEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeIsNotNull() {
            addCriterion("OPEN_TEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeEqualTo(String value) {
            addCriterion("OPEN_TEL_TYPE =", value, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeNotEqualTo(String value) {
            addCriterion("OPEN_TEL_TYPE <>", value, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeGreaterThan(String value) {
            addCriterion("OPEN_TEL_TYPE >", value, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_TEL_TYPE >=", value, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeLessThan(String value) {
            addCriterion("OPEN_TEL_TYPE <", value, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeLessThanOrEqualTo(String value) {
            addCriterion("OPEN_TEL_TYPE <=", value, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeLike(String value) {
            addCriterion("OPEN_TEL_TYPE like", value, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeNotLike(String value) {
            addCriterion("OPEN_TEL_TYPE not like", value, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeIn(List<String> values) {
            addCriterion("OPEN_TEL_TYPE in", values, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeNotIn(List<String> values) {
            addCriterion("OPEN_TEL_TYPE not in", values, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeBetween(String value1, String value2) {
            addCriterion("OPEN_TEL_TYPE between", value1, value2, "openTelType");
            return (Criteria) this;
        }

        public Criteria andOpenTelTypeNotBetween(String value1, String value2) {
            addCriterion("OPEN_TEL_TYPE not between", value1, value2, "openTelType");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectIsNull() {
            addCriterion("DEP_SAVE_FEE_ASPECT is null");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectIsNotNull() {
            addCriterion("DEP_SAVE_FEE_ASPECT is not null");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectEqualTo(String value) {
            addCriterion("DEP_SAVE_FEE_ASPECT =", value, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectNotEqualTo(String value) {
            addCriterion("DEP_SAVE_FEE_ASPECT <>", value, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectGreaterThan(String value) {
            addCriterion("DEP_SAVE_FEE_ASPECT >", value, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_SAVE_FEE_ASPECT >=", value, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectLessThan(String value) {
            addCriterion("DEP_SAVE_FEE_ASPECT <", value, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectLessThanOrEqualTo(String value) {
            addCriterion("DEP_SAVE_FEE_ASPECT <=", value, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectLike(String value) {
            addCriterion("DEP_SAVE_FEE_ASPECT like", value, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectNotLike(String value) {
            addCriterion("DEP_SAVE_FEE_ASPECT not like", value, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectIn(List<String> values) {
            addCriterion("DEP_SAVE_FEE_ASPECT in", values, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectNotIn(List<String> values) {
            addCriterion("DEP_SAVE_FEE_ASPECT not in", values, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectBetween(String value1, String value2) {
            addCriterion("DEP_SAVE_FEE_ASPECT between", value1, value2, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andDepSaveFeeAspectNotBetween(String value1, String value2) {
            addCriterion("DEP_SAVE_FEE_ASPECT not between", value1, value2, "depSaveFeeAspect");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthIsNull() {
            addCriterion("IS_MP_VALID_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthIsNotNull() {
            addCriterion("IS_MP_VALID_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthEqualTo(String value) {
            addCriterion("IS_MP_VALID_BIRTH =", value, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthNotEqualTo(String value) {
            addCriterion("IS_MP_VALID_BIRTH <>", value, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthGreaterThan(String value) {
            addCriterion("IS_MP_VALID_BIRTH >", value, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MP_VALID_BIRTH >=", value, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthLessThan(String value) {
            addCriterion("IS_MP_VALID_BIRTH <", value, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthLessThanOrEqualTo(String value) {
            addCriterion("IS_MP_VALID_BIRTH <=", value, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthLike(String value) {
            addCriterion("IS_MP_VALID_BIRTH like", value, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthNotLike(String value) {
            addCriterion("IS_MP_VALID_BIRTH not like", value, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthIn(List<String> values) {
            addCriterion("IS_MP_VALID_BIRTH in", values, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthNotIn(List<String> values) {
            addCriterion("IS_MP_VALID_BIRTH not in", values, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthBetween(String value1, String value2) {
            addCriterion("IS_MP_VALID_BIRTH between", value1, value2, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andIsMpValidBirthNotBetween(String value1, String value2) {
            addCriterion("IS_MP_VALID_BIRTH not between", value1, value2, "isMpValidBirth");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitIsNull() {
            addCriterion("EPOS_TRANS_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitIsNotNull() {
            addCriterion("EPOS_TRANS_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitEqualTo(BigDecimal value) {
            addCriterion("EPOS_TRANS_LIMIT =", value, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitNotEqualTo(BigDecimal value) {
            addCriterion("EPOS_TRANS_LIMIT <>", value, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitGreaterThan(BigDecimal value) {
            addCriterion("EPOS_TRANS_LIMIT >", value, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EPOS_TRANS_LIMIT >=", value, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitLessThan(BigDecimal value) {
            addCriterion("EPOS_TRANS_LIMIT <", value, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EPOS_TRANS_LIMIT <=", value, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitIn(List<BigDecimal> values) {
            addCriterion("EPOS_TRANS_LIMIT in", values, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitNotIn(List<BigDecimal> values) {
            addCriterion("EPOS_TRANS_LIMIT not in", values, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EPOS_TRANS_LIMIT between", value1, value2, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andEposTransLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EPOS_TRANS_LIMIT not between", value1, value2, "eposTransLimit");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeIsNull() {
            addCriterion("IS_CANCEL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeIsNotNull() {
            addCriterion("IS_CANCEL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeEqualTo(String value) {
            addCriterion("IS_CANCEL_FEE =", value, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeNotEqualTo(String value) {
            addCriterion("IS_CANCEL_FEE <>", value, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeGreaterThan(String value) {
            addCriterion("IS_CANCEL_FEE >", value, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CANCEL_FEE >=", value, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeLessThan(String value) {
            addCriterion("IS_CANCEL_FEE <", value, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeLessThanOrEqualTo(String value) {
            addCriterion("IS_CANCEL_FEE <=", value, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeLike(String value) {
            addCriterion("IS_CANCEL_FEE like", value, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeNotLike(String value) {
            addCriterion("IS_CANCEL_FEE not like", value, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeIn(List<String> values) {
            addCriterion("IS_CANCEL_FEE in", values, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeNotIn(List<String> values) {
            addCriterion("IS_CANCEL_FEE not in", values, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeBetween(String value1, String value2) {
            addCriterion("IS_CANCEL_FEE between", value1, value2, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsCancelFeeNotBetween(String value1, String value2) {
            addCriterion("IS_CANCEL_FEE not between", value1, value2, "isCancelFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeIsNull() {
            addCriterion("IS_PART_FEE is null");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeIsNotNull() {
            addCriterion("IS_PART_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeEqualTo(String value) {
            addCriterion("IS_PART_FEE =", value, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeNotEqualTo(String value) {
            addCriterion("IS_PART_FEE <>", value, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeGreaterThan(String value) {
            addCriterion("IS_PART_FEE >", value, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PART_FEE >=", value, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeLessThan(String value) {
            addCriterion("IS_PART_FEE <", value, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeLessThanOrEqualTo(String value) {
            addCriterion("IS_PART_FEE <=", value, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeLike(String value) {
            addCriterion("IS_PART_FEE like", value, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeNotLike(String value) {
            addCriterion("IS_PART_FEE not like", value, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeIn(List<String> values) {
            addCriterion("IS_PART_FEE in", values, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeNotIn(List<String> values) {
            addCriterion("IS_PART_FEE not in", values, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeBetween(String value1, String value2) {
            addCriterion("IS_PART_FEE between", value1, value2, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andIsPartFeeNotBetween(String value1, String value2) {
            addCriterion("IS_PART_FEE not between", value1, value2, "isPartFee");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitIsNull() {
            addCriterion("MONTH_TRANS_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitIsNotNull() {
            addCriterion("MONTH_TRANS_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitEqualTo(BigDecimal value) {
            addCriterion("MONTH_TRANS_LIMIT =", value, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitNotEqualTo(BigDecimal value) {
            addCriterion("MONTH_TRANS_LIMIT <>", value, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitGreaterThan(BigDecimal value) {
            addCriterion("MONTH_TRANS_LIMIT >", value, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_TRANS_LIMIT >=", value, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitLessThan(BigDecimal value) {
            addCriterion("MONTH_TRANS_LIMIT <", value, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_TRANS_LIMIT <=", value, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitIn(List<BigDecimal> values) {
            addCriterion("MONTH_TRANS_LIMIT in", values, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitNotIn(List<BigDecimal> values) {
            addCriterion("MONTH_TRANS_LIMIT not in", values, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_TRANS_LIMIT between", value1, value2, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andMonthTransLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_TRANS_LIMIT not between", value1, value2, "monthTransLimit");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateIsNull() {
            addCriterion("OVER_MONTH_LIMIT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateIsNotNull() {
            addCriterion("OVER_MONTH_LIMIT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateEqualTo(String value) {
            addCriterion("OVER_MONTH_LIMIT_RATE =", value, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateNotEqualTo(String value) {
            addCriterion("OVER_MONTH_LIMIT_RATE <>", value, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateGreaterThan(String value) {
            addCriterion("OVER_MONTH_LIMIT_RATE >", value, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateGreaterThanOrEqualTo(String value) {
            addCriterion("OVER_MONTH_LIMIT_RATE >=", value, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateLessThan(String value) {
            addCriterion("OVER_MONTH_LIMIT_RATE <", value, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateLessThanOrEqualTo(String value) {
            addCriterion("OVER_MONTH_LIMIT_RATE <=", value, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateLike(String value) {
            addCriterion("OVER_MONTH_LIMIT_RATE like", value, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateNotLike(String value) {
            addCriterion("OVER_MONTH_LIMIT_RATE not like", value, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateIn(List<String> values) {
            addCriterion("OVER_MONTH_LIMIT_RATE in", values, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateNotIn(List<String> values) {
            addCriterion("OVER_MONTH_LIMIT_RATE not in", values, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateBetween(String value1, String value2) {
            addCriterion("OVER_MONTH_LIMIT_RATE between", value1, value2, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andOverMonthLimitRateNotBetween(String value1, String value2) {
            addCriterion("OVER_MONTH_LIMIT_RATE not between", value1, value2, "overMonthLimitRate");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthIsNull() {
            addCriterion("IS_DEBIT_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthIsNotNull() {
            addCriterion("IS_DEBIT_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthEqualTo(String value) {
            addCriterion("IS_DEBIT_AUTH =", value, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthNotEqualTo(String value) {
            addCriterion("IS_DEBIT_AUTH <>", value, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthGreaterThan(String value) {
            addCriterion("IS_DEBIT_AUTH >", value, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEBIT_AUTH >=", value, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthLessThan(String value) {
            addCriterion("IS_DEBIT_AUTH <", value, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthLessThanOrEqualTo(String value) {
            addCriterion("IS_DEBIT_AUTH <=", value, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthLike(String value) {
            addCriterion("IS_DEBIT_AUTH like", value, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthNotLike(String value) {
            addCriterion("IS_DEBIT_AUTH not like", value, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthIn(List<String> values) {
            addCriterion("IS_DEBIT_AUTH in", values, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthNotIn(List<String> values) {
            addCriterion("IS_DEBIT_AUTH not in", values, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthBetween(String value1, String value2) {
            addCriterion("IS_DEBIT_AUTH between", value1, value2, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andIsDebitAuthNotBetween(String value1, String value2) {
            addCriterion("IS_DEBIT_AUTH not between", value1, value2, "isDebitAuth");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeIsNull() {
            addCriterion("BASE_CALC_MODE is null");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeIsNotNull() {
            addCriterion("BASE_CALC_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeEqualTo(String value) {
            addCriterion("BASE_CALC_MODE =", value, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeNotEqualTo(String value) {
            addCriterion("BASE_CALC_MODE <>", value, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeGreaterThan(String value) {
            addCriterion("BASE_CALC_MODE >", value, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeGreaterThanOrEqualTo(String value) {
            addCriterion("BASE_CALC_MODE >=", value, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeLessThan(String value) {
            addCriterion("BASE_CALC_MODE <", value, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeLessThanOrEqualTo(String value) {
            addCriterion("BASE_CALC_MODE <=", value, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeLike(String value) {
            addCriterion("BASE_CALC_MODE like", value, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeNotLike(String value) {
            addCriterion("BASE_CALC_MODE not like", value, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeIn(List<String> values) {
            addCriterion("BASE_CALC_MODE in", values, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeNotIn(List<String> values) {
            addCriterion("BASE_CALC_MODE not in", values, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeBetween(String value1, String value2) {
            addCriterion("BASE_CALC_MODE between", value1, value2, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andBaseCalcModeNotBetween(String value1, String value2) {
            addCriterion("BASE_CALC_MODE not between", value1, value2, "baseCalcMode");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingIsNull() {
            addCriterion("IS_ANTI_PHISHING is null");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingIsNotNull() {
            addCriterion("IS_ANTI_PHISHING is not null");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingEqualTo(String value) {
            addCriterion("IS_ANTI_PHISHING =", value, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingNotEqualTo(String value) {
            addCriterion("IS_ANTI_PHISHING <>", value, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingGreaterThan(String value) {
            addCriterion("IS_ANTI_PHISHING >", value, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ANTI_PHISHING >=", value, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingLessThan(String value) {
            addCriterion("IS_ANTI_PHISHING <", value, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingLessThanOrEqualTo(String value) {
            addCriterion("IS_ANTI_PHISHING <=", value, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingLike(String value) {
            addCriterion("IS_ANTI_PHISHING like", value, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingNotLike(String value) {
            addCriterion("IS_ANTI_PHISHING not like", value, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingIn(List<String> values) {
            addCriterion("IS_ANTI_PHISHING in", values, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingNotIn(List<String> values) {
            addCriterion("IS_ANTI_PHISHING not in", values, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingBetween(String value1, String value2) {
            addCriterion("IS_ANTI_PHISHING between", value1, value2, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsAntiPhishingNotBetween(String value1, String value2) {
            addCriterion("IS_ANTI_PHISHING not between", value1, value2, "isAntiPhishing");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpIsNull() {
            addCriterion("IS_VERIFY_IP is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpIsNotNull() {
            addCriterion("IS_VERIFY_IP is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpEqualTo(String value) {
            addCriterion("IS_VERIFY_IP =", value, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpNotEqualTo(String value) {
            addCriterion("IS_VERIFY_IP <>", value, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpGreaterThan(String value) {
            addCriterion("IS_VERIFY_IP >", value, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VERIFY_IP >=", value, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpLessThan(String value) {
            addCriterion("IS_VERIFY_IP <", value, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpLessThanOrEqualTo(String value) {
            addCriterion("IS_VERIFY_IP <=", value, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpLike(String value) {
            addCriterion("IS_VERIFY_IP like", value, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpNotLike(String value) {
            addCriterion("IS_VERIFY_IP not like", value, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpIn(List<String> values) {
            addCriterion("IS_VERIFY_IP in", values, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpNotIn(List<String> values) {
            addCriterion("IS_VERIFY_IP not in", values, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpBetween(String value1, String value2) {
            addCriterion("IS_VERIFY_IP between", value1, value2, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIpNotBetween(String value1, String value2) {
            addCriterion("IS_VERIFY_IP not between", value1, value2, "isVerifyIp");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductIsNull() {
            addCriterion("IS_DEBIT_DEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductIsNotNull() {
            addCriterion("IS_DEBIT_DEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductEqualTo(String value) {
            addCriterion("IS_DEBIT_DEDUCT =", value, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductNotEqualTo(String value) {
            addCriterion("IS_DEBIT_DEDUCT <>", value, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductGreaterThan(String value) {
            addCriterion("IS_DEBIT_DEDUCT >", value, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEBIT_DEDUCT >=", value, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductLessThan(String value) {
            addCriterion("IS_DEBIT_DEDUCT <", value, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductLessThanOrEqualTo(String value) {
            addCriterion("IS_DEBIT_DEDUCT <=", value, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductLike(String value) {
            addCriterion("IS_DEBIT_DEDUCT like", value, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductNotLike(String value) {
            addCriterion("IS_DEBIT_DEDUCT not like", value, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductIn(List<String> values) {
            addCriterion("IS_DEBIT_DEDUCT in", values, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductNotIn(List<String> values) {
            addCriterion("IS_DEBIT_DEDUCT not in", values, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductBetween(String value1, String value2) {
            addCriterion("IS_DEBIT_DEDUCT between", value1, value2, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsDebitDeductNotBetween(String value1, String value2) {
            addCriterion("IS_DEBIT_DEDUCT not between", value1, value2, "isDebitDeduct");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashIsNull() {
            addCriterion("IS_ACTIVE_CASH is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashIsNotNull() {
            addCriterion("IS_ACTIVE_CASH is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashEqualTo(String value) {
            addCriterion("IS_ACTIVE_CASH =", value, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashNotEqualTo(String value) {
            addCriterion("IS_ACTIVE_CASH <>", value, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashGreaterThan(String value) {
            addCriterion("IS_ACTIVE_CASH >", value, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ACTIVE_CASH >=", value, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashLessThan(String value) {
            addCriterion("IS_ACTIVE_CASH <", value, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashLessThanOrEqualTo(String value) {
            addCriterion("IS_ACTIVE_CASH <=", value, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashLike(String value) {
            addCriterion("IS_ACTIVE_CASH like", value, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashNotLike(String value) {
            addCriterion("IS_ACTIVE_CASH not like", value, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashIn(List<String> values) {
            addCriterion("IS_ACTIVE_CASH in", values, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashNotIn(List<String> values) {
            addCriterion("IS_ACTIVE_CASH not in", values, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashBetween(String value1, String value2) {
            addCriterion("IS_ACTIVE_CASH between", value1, value2, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsActiveCashNotBetween(String value1, String value2) {
            addCriterion("IS_ACTIVE_CASH not between", value1, value2, "isActiveCash");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoIsNull() {
            addCriterion("IS_OWN_CHG_INFO is null");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoIsNotNull() {
            addCriterion("IS_OWN_CHG_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoEqualTo(String value) {
            addCriterion("IS_OWN_CHG_INFO =", value, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoNotEqualTo(String value) {
            addCriterion("IS_OWN_CHG_INFO <>", value, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoGreaterThan(String value) {
            addCriterion("IS_OWN_CHG_INFO >", value, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OWN_CHG_INFO >=", value, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoLessThan(String value) {
            addCriterion("IS_OWN_CHG_INFO <", value, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoLessThanOrEqualTo(String value) {
            addCriterion("IS_OWN_CHG_INFO <=", value, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoLike(String value) {
            addCriterion("IS_OWN_CHG_INFO like", value, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoNotLike(String value) {
            addCriterion("IS_OWN_CHG_INFO not like", value, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoIn(List<String> values) {
            addCriterion("IS_OWN_CHG_INFO in", values, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoNotIn(List<String> values) {
            addCriterion("IS_OWN_CHG_INFO not in", values, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoBetween(String value1, String value2) {
            addCriterion("IS_OWN_CHG_INFO between", value1, value2, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsOwnChgInfoNotBetween(String value1, String value2) {
            addCriterion("IS_OWN_CHG_INFO not between", value1, value2, "isOwnChgInfo");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdIsNull() {
            addCriterion("IS_POS_REL_ORD is null");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdIsNotNull() {
            addCriterion("IS_POS_REL_ORD is not null");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdEqualTo(String value) {
            addCriterion("IS_POS_REL_ORD =", value, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdNotEqualTo(String value) {
            addCriterion("IS_POS_REL_ORD <>", value, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdGreaterThan(String value) {
            addCriterion("IS_POS_REL_ORD >", value, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdGreaterThanOrEqualTo(String value) {
            addCriterion("IS_POS_REL_ORD >=", value, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdLessThan(String value) {
            addCriterion("IS_POS_REL_ORD <", value, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdLessThanOrEqualTo(String value) {
            addCriterion("IS_POS_REL_ORD <=", value, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdLike(String value) {
            addCriterion("IS_POS_REL_ORD like", value, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdNotLike(String value) {
            addCriterion("IS_POS_REL_ORD not like", value, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdIn(List<String> values) {
            addCriterion("IS_POS_REL_ORD in", values, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdNotIn(List<String> values) {
            addCriterion("IS_POS_REL_ORD not in", values, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdBetween(String value1, String value2) {
            addCriterion("IS_POS_REL_ORD between", value1, value2, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsPosRelOrdNotBetween(String value1, String value2) {
            addCriterion("IS_POS_REL_ORD not between", value1, value2, "isPosRelOrd");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateIsNull() {
            addCriterion("IS_CFC_VALIDATE is null");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateIsNotNull() {
            addCriterion("IS_CFC_VALIDATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateEqualTo(String value) {
            addCriterion("IS_CFC_VALIDATE =", value, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateNotEqualTo(String value) {
            addCriterion("IS_CFC_VALIDATE <>", value, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateGreaterThan(String value) {
            addCriterion("IS_CFC_VALIDATE >", value, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CFC_VALIDATE >=", value, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateLessThan(String value) {
            addCriterion("IS_CFC_VALIDATE <", value, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateLessThanOrEqualTo(String value) {
            addCriterion("IS_CFC_VALIDATE <=", value, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateLike(String value) {
            addCriterion("IS_CFC_VALIDATE like", value, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateNotLike(String value) {
            addCriterion("IS_CFC_VALIDATE not like", value, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateIn(List<String> values) {
            addCriterion("IS_CFC_VALIDATE in", values, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateNotIn(List<String> values) {
            addCriterion("IS_CFC_VALIDATE not in", values, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateBetween(String value1, String value2) {
            addCriterion("IS_CFC_VALIDATE between", value1, value2, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andIsCfcValidateNotBetween(String value1, String value2) {
            addCriterion("IS_CFC_VALIDATE not between", value1, value2, "isCfcValidate");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdIsNull() {
            addCriterion("REL_FEE_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdIsNotNull() {
            addCriterion("REL_FEE_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdEqualTo(String value) {
            addCriterion("REL_FEE_USR_ID =", value, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdNotEqualTo(String value) {
            addCriterion("REL_FEE_USR_ID <>", value, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdGreaterThan(String value) {
            addCriterion("REL_FEE_USR_ID >", value, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("REL_FEE_USR_ID >=", value, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdLessThan(String value) {
            addCriterion("REL_FEE_USR_ID <", value, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdLessThanOrEqualTo(String value) {
            addCriterion("REL_FEE_USR_ID <=", value, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdLike(String value) {
            addCriterion("REL_FEE_USR_ID like", value, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdNotLike(String value) {
            addCriterion("REL_FEE_USR_ID not like", value, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdIn(List<String> values) {
            addCriterion("REL_FEE_USR_ID in", values, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdNotIn(List<String> values) {
            addCriterion("REL_FEE_USR_ID not in", values, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdBetween(String value1, String value2) {
            addCriterion("REL_FEE_USR_ID between", value1, value2, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andRelFeeUsrIdNotBetween(String value1, String value2) {
            addCriterion("REL_FEE_USR_ID not between", value1, value2, "relFeeUsrId");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardIsNull() {
            addCriterion("IS_BIND_MTP_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardIsNotNull() {
            addCriterion("IS_BIND_MTP_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardEqualTo(String value) {
            addCriterion("IS_BIND_MTP_CARD =", value, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardNotEqualTo(String value) {
            addCriterion("IS_BIND_MTP_CARD <>", value, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardGreaterThan(String value) {
            addCriterion("IS_BIND_MTP_CARD >", value, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BIND_MTP_CARD >=", value, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardLessThan(String value) {
            addCriterion("IS_BIND_MTP_CARD <", value, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardLessThanOrEqualTo(String value) {
            addCriterion("IS_BIND_MTP_CARD <=", value, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardLike(String value) {
            addCriterion("IS_BIND_MTP_CARD like", value, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardNotLike(String value) {
            addCriterion("IS_BIND_MTP_CARD not like", value, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardIn(List<String> values) {
            addCriterion("IS_BIND_MTP_CARD in", values, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardNotIn(List<String> values) {
            addCriterion("IS_BIND_MTP_CARD not in", values, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardBetween(String value1, String value2) {
            addCriterion("IS_BIND_MTP_CARD between", value1, value2, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsBindMtpCardNotBetween(String value1, String value2) {
            addCriterion("IS_BIND_MTP_CARD not between", value1, value2, "isBindMtpCard");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpIsNull() {
            addCriterion("IS_AGREEMENT_FP is null");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpIsNotNull() {
            addCriterion("IS_AGREEMENT_FP is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpEqualTo(String value) {
            addCriterion("IS_AGREEMENT_FP =", value, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpNotEqualTo(String value) {
            addCriterion("IS_AGREEMENT_FP <>", value, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpGreaterThan(String value) {
            addCriterion("IS_AGREEMENT_FP >", value, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AGREEMENT_FP >=", value, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpLessThan(String value) {
            addCriterion("IS_AGREEMENT_FP <", value, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpLessThanOrEqualTo(String value) {
            addCriterion("IS_AGREEMENT_FP <=", value, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpLike(String value) {
            addCriterion("IS_AGREEMENT_FP like", value, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpNotLike(String value) {
            addCriterion("IS_AGREEMENT_FP not like", value, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpIn(List<String> values) {
            addCriterion("IS_AGREEMENT_FP in", values, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpNotIn(List<String> values) {
            addCriterion("IS_AGREEMENT_FP not in", values, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpBetween(String value1, String value2) {
            addCriterion("IS_AGREEMENT_FP between", value1, value2, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsAgreementFpNotBetween(String value1, String value2) {
            addCriterion("IS_AGREEMENT_FP not between", value1, value2, "isAgreementFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpIsNull() {
            addCriterion("IS_SPT_CRE_FP is null");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpIsNotNull() {
            addCriterion("IS_SPT_CRE_FP is not null");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpEqualTo(String value) {
            addCriterion("IS_SPT_CRE_FP =", value, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpNotEqualTo(String value) {
            addCriterion("IS_SPT_CRE_FP <>", value, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpGreaterThan(String value) {
            addCriterion("IS_SPT_CRE_FP >", value, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SPT_CRE_FP >=", value, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpLessThan(String value) {
            addCriterion("IS_SPT_CRE_FP <", value, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpLessThanOrEqualTo(String value) {
            addCriterion("IS_SPT_CRE_FP <=", value, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpLike(String value) {
            addCriterion("IS_SPT_CRE_FP like", value, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpNotLike(String value) {
            addCriterion("IS_SPT_CRE_FP not like", value, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpIn(List<String> values) {
            addCriterion("IS_SPT_CRE_FP in", values, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpNotIn(List<String> values) {
            addCriterion("IS_SPT_CRE_FP not in", values, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpBetween(String value1, String value2) {
            addCriterion("IS_SPT_CRE_FP between", value1, value2, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCreFpNotBetween(String value1, String value2) {
            addCriterion("IS_SPT_CRE_FP not between", value1, value2, "isSptCreFp");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleIsNull() {
            addCriterion("IS_SPT_CARD_FP_SIMPLE is null");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleIsNotNull() {
            addCriterion("IS_SPT_CARD_FP_SIMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleEqualTo(String value) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE =", value, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleNotEqualTo(String value) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE <>", value, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleGreaterThan(String value) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE >", value, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE >=", value, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleLessThan(String value) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE <", value, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleLessThanOrEqualTo(String value) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE <=", value, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleLike(String value) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE like", value, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleNotLike(String value) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE not like", value, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleIn(List<String> values) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE in", values, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleNotIn(List<String> values) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE not in", values, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleBetween(String value1, String value2) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE between", value1, value2, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsSptCardFpSimpleNotBetween(String value1, String value2) {
            addCriterion("IS_SPT_CARD_FP_SIMPLE not between", value1, value2, "isSptCardFpSimple");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverIsNull() {
            addCriterion("IS_CLOSE_FOREVER is null");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverIsNotNull() {
            addCriterion("IS_CLOSE_FOREVER is not null");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverEqualTo(String value) {
            addCriterion("IS_CLOSE_FOREVER =", value, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverNotEqualTo(String value) {
            addCriterion("IS_CLOSE_FOREVER <>", value, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverGreaterThan(String value) {
            addCriterion("IS_CLOSE_FOREVER >", value, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CLOSE_FOREVER >=", value, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverLessThan(String value) {
            addCriterion("IS_CLOSE_FOREVER <", value, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverLessThanOrEqualTo(String value) {
            addCriterion("IS_CLOSE_FOREVER <=", value, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverLike(String value) {
            addCriterion("IS_CLOSE_FOREVER like", value, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverNotLike(String value) {
            addCriterion("IS_CLOSE_FOREVER not like", value, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverIn(List<String> values) {
            addCriterion("IS_CLOSE_FOREVER in", values, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverNotIn(List<String> values) {
            addCriterion("IS_CLOSE_FOREVER not in", values, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverBetween(String value1, String value2) {
            addCriterion("IS_CLOSE_FOREVER between", value1, value2, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsCloseForeverNotBetween(String value1, String value2) {
            addCriterion("IS_CLOSE_FOREVER not between", value1, value2, "isCloseForever");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceIsNull() {
            addCriterion("IS_BUY_INTERFACE is null");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceIsNotNull() {
            addCriterion("IS_BUY_INTERFACE is not null");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceEqualTo(String value) {
            addCriterion("IS_BUY_INTERFACE =", value, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceNotEqualTo(String value) {
            addCriterion("IS_BUY_INTERFACE <>", value, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceGreaterThan(String value) {
            addCriterion("IS_BUY_INTERFACE >", value, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BUY_INTERFACE >=", value, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceLessThan(String value) {
            addCriterion("IS_BUY_INTERFACE <", value, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceLessThanOrEqualTo(String value) {
            addCriterion("IS_BUY_INTERFACE <=", value, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceLike(String value) {
            addCriterion("IS_BUY_INTERFACE like", value, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceNotLike(String value) {
            addCriterion("IS_BUY_INTERFACE not like", value, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceIn(List<String> values) {
            addCriterion("IS_BUY_INTERFACE in", values, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceNotIn(List<String> values) {
            addCriterion("IS_BUY_INTERFACE not in", values, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceBetween(String value1, String value2) {
            addCriterion("IS_BUY_INTERFACE between", value1, value2, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsBuyInterfaceNotBetween(String value1, String value2) {
            addCriterion("IS_BUY_INTERFACE not between", value1, value2, "isBuyInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceIsNull() {
            addCriterion("IS_TEL_INTERFACE is null");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceIsNotNull() {
            addCriterion("IS_TEL_INTERFACE is not null");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceEqualTo(String value) {
            addCriterion("IS_TEL_INTERFACE =", value, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceNotEqualTo(String value) {
            addCriterion("IS_TEL_INTERFACE <>", value, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceGreaterThan(String value) {
            addCriterion("IS_TEL_INTERFACE >", value, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TEL_INTERFACE >=", value, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceLessThan(String value) {
            addCriterion("IS_TEL_INTERFACE <", value, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceLessThanOrEqualTo(String value) {
            addCriterion("IS_TEL_INTERFACE <=", value, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceLike(String value) {
            addCriterion("IS_TEL_INTERFACE like", value, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceNotLike(String value) {
            addCriterion("IS_TEL_INTERFACE not like", value, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceIn(List<String> values) {
            addCriterion("IS_TEL_INTERFACE in", values, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceNotIn(List<String> values) {
            addCriterion("IS_TEL_INTERFACE not in", values, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceBetween(String value1, String value2) {
            addCriterion("IS_TEL_INTERFACE between", value1, value2, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsTelInterfaceNotBetween(String value1, String value2) {
            addCriterion("IS_TEL_INTERFACE not between", value1, value2, "isTelInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceIsNull() {
            addCriterion("IS_FP_INTERFACE is null");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceIsNotNull() {
            addCriterion("IS_FP_INTERFACE is not null");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceEqualTo(String value) {
            addCriterion("IS_FP_INTERFACE =", value, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceNotEqualTo(String value) {
            addCriterion("IS_FP_INTERFACE <>", value, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceGreaterThan(String value) {
            addCriterion("IS_FP_INTERFACE >", value, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FP_INTERFACE >=", value, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceLessThan(String value) {
            addCriterion("IS_FP_INTERFACE <", value, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceLessThanOrEqualTo(String value) {
            addCriterion("IS_FP_INTERFACE <=", value, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceLike(String value) {
            addCriterion("IS_FP_INTERFACE like", value, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceNotLike(String value) {
            addCriterion("IS_FP_INTERFACE not like", value, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceIn(List<String> values) {
            addCriterion("IS_FP_INTERFACE in", values, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceNotIn(List<String> values) {
            addCriterion("IS_FP_INTERFACE not in", values, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceBetween(String value1, String value2) {
            addCriterion("IS_FP_INTERFACE between", value1, value2, "isFpInterface");
            return (Criteria) this;
        }

        public Criteria andIsFpInterfaceNotBetween(String value1, String value2) {
            addCriterion("IS_FP_INTERFACE not between", value1, value2, "isFpInterface");
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