package mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class MerBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerBaseInfoExample() {
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

        public Criteria andMerNameIsNull() {
            addCriterion("MER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNotNull() {
            addCriterion("MER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameEqualTo(String value) {
            addCriterion("MER_NAME =", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotEqualTo(String value) {
            addCriterion("MER_NAME <>", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThan(String value) {
            addCriterion("MER_NAME >", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThanOrEqualTo(String value) {
            addCriterion("MER_NAME >=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThan(String value) {
            addCriterion("MER_NAME <", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThanOrEqualTo(String value) {
            addCriterion("MER_NAME <=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLike(String value) {
            addCriterion("MER_NAME like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotLike(String value) {
            addCriterion("MER_NAME not like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameIn(List<String> values) {
            addCriterion("MER_NAME in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotIn(List<String> values) {
            addCriterion("MER_NAME not in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameBetween(String value1, String value2) {
            addCriterion("MER_NAME between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotBetween(String value1, String value2) {
            addCriterion("MER_NAME not between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerProvIsNull() {
            addCriterion("MER_PROV is null");
            return (Criteria) this;
        }

        public Criteria andMerProvIsNotNull() {
            addCriterion("MER_PROV is not null");
            return (Criteria) this;
        }

        public Criteria andMerProvEqualTo(String value) {
            addCriterion("MER_PROV =", value, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvNotEqualTo(String value) {
            addCriterion("MER_PROV <>", value, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvGreaterThan(String value) {
            addCriterion("MER_PROV >", value, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvGreaterThanOrEqualTo(String value) {
            addCriterion("MER_PROV >=", value, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvLessThan(String value) {
            addCriterion("MER_PROV <", value, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvLessThanOrEqualTo(String value) {
            addCriterion("MER_PROV <=", value, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvLike(String value) {
            addCriterion("MER_PROV like", value, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvNotLike(String value) {
            addCriterion("MER_PROV not like", value, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvIn(List<String> values) {
            addCriterion("MER_PROV in", values, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvNotIn(List<String> values) {
            addCriterion("MER_PROV not in", values, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvBetween(String value1, String value2) {
            addCriterion("MER_PROV between", value1, value2, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerProvNotBetween(String value1, String value2) {
            addCriterion("MER_PROV not between", value1, value2, "merProv");
            return (Criteria) this;
        }

        public Criteria andMerAreaIsNull() {
            addCriterion("MER_AREA is null");
            return (Criteria) this;
        }

        public Criteria andMerAreaIsNotNull() {
            addCriterion("MER_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andMerAreaEqualTo(String value) {
            addCriterion("MER_AREA =", value, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaNotEqualTo(String value) {
            addCriterion("MER_AREA <>", value, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaGreaterThan(String value) {
            addCriterion("MER_AREA >", value, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaGreaterThanOrEqualTo(String value) {
            addCriterion("MER_AREA >=", value, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaLessThan(String value) {
            addCriterion("MER_AREA <", value, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaLessThanOrEqualTo(String value) {
            addCriterion("MER_AREA <=", value, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaLike(String value) {
            addCriterion("MER_AREA like", value, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaNotLike(String value) {
            addCriterion("MER_AREA not like", value, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaIn(List<String> values) {
            addCriterion("MER_AREA in", values, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaNotIn(List<String> values) {
            addCriterion("MER_AREA not in", values, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaBetween(String value1, String value2) {
            addCriterion("MER_AREA between", value1, value2, "merArea");
            return (Criteria) this;
        }

        public Criteria andMerAreaNotBetween(String value1, String value2) {
            addCriterion("MER_AREA not between", value1, value2, "merArea");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNull() {
            addCriterion("EXP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNotNull() {
            addCriterion("EXP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpDateEqualTo(String value) {
            addCriterion("EXP_DATE =", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotEqualTo(String value) {
            addCriterion("EXP_DATE <>", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThan(String value) {
            addCriterion("EXP_DATE >", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThanOrEqualTo(String value) {
            addCriterion("EXP_DATE >=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThan(String value) {
            addCriterion("EXP_DATE <", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThanOrEqualTo(String value) {
            addCriterion("EXP_DATE <=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLike(String value) {
            addCriterion("EXP_DATE like", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotLike(String value) {
            addCriterion("EXP_DATE not like", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIn(List<String> values) {
            addCriterion("EXP_DATE in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotIn(List<String> values) {
            addCriterion("EXP_DATE not in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateBetween(String value1, String value2) {
            addCriterion("EXP_DATE between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotBetween(String value1, String value2) {
            addCriterion("EXP_DATE not between", value1, value2, "expDate");
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

        public Criteria andRegCodeIsNull() {
            addCriterion("REG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegCodeIsNotNull() {
            addCriterion("REG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegCodeEqualTo(String value) {
            addCriterion("REG_CODE =", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotEqualTo(String value) {
            addCriterion("REG_CODE <>", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeGreaterThan(String value) {
            addCriterion("REG_CODE >", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REG_CODE >=", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeLessThan(String value) {
            addCriterion("REG_CODE <", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeLessThanOrEqualTo(String value) {
            addCriterion("REG_CODE <=", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeLike(String value) {
            addCriterion("REG_CODE like", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotLike(String value) {
            addCriterion("REG_CODE not like", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeIn(List<String> values) {
            addCriterion("REG_CODE in", values, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotIn(List<String> values) {
            addCriterion("REG_CODE not in", values, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeBetween(String value1, String value2) {
            addCriterion("REG_CODE between", value1, value2, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotBetween(String value1, String value2) {
            addCriterion("REG_CODE not between", value1, value2, "regCode");
            return (Criteria) this;
        }

        public Criteria andMerAddrIsNull() {
            addCriterion("MER_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andMerAddrIsNotNull() {
            addCriterion("MER_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andMerAddrEqualTo(String value) {
            addCriterion("MER_ADDR =", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrNotEqualTo(String value) {
            addCriterion("MER_ADDR <>", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrGreaterThan(String value) {
            addCriterion("MER_ADDR >", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ADDR >=", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrLessThan(String value) {
            addCriterion("MER_ADDR <", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrLessThanOrEqualTo(String value) {
            addCriterion("MER_ADDR <=", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrLike(String value) {
            addCriterion("MER_ADDR like", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrNotLike(String value) {
            addCriterion("MER_ADDR not like", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrIn(List<String> values) {
            addCriterion("MER_ADDR in", values, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrNotIn(List<String> values) {
            addCriterion("MER_ADDR not in", values, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrBetween(String value1, String value2) {
            addCriterion("MER_ADDR between", value1, value2, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrNotBetween(String value1, String value2) {
            addCriterion("MER_ADDR not between", value1, value2, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerZipIsNull() {
            addCriterion("MER_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andMerZipIsNotNull() {
            addCriterion("MER_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andMerZipEqualTo(String value) {
            addCriterion("MER_ZIP =", value, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipNotEqualTo(String value) {
            addCriterion("MER_ZIP <>", value, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipGreaterThan(String value) {
            addCriterion("MER_ZIP >", value, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ZIP >=", value, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipLessThan(String value) {
            addCriterion("MER_ZIP <", value, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipLessThanOrEqualTo(String value) {
            addCriterion("MER_ZIP <=", value, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipLike(String value) {
            addCriterion("MER_ZIP like", value, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipNotLike(String value) {
            addCriterion("MER_ZIP not like", value, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipIn(List<String> values) {
            addCriterion("MER_ZIP in", values, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipNotIn(List<String> values) {
            addCriterion("MER_ZIP not in", values, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipBetween(String value1, String value2) {
            addCriterion("MER_ZIP between", value1, value2, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerZipNotBetween(String value1, String value2) {
            addCriterion("MER_ZIP not between", value1, value2, "merZip");
            return (Criteria) this;
        }

        public Criteria andMerDescIsNull() {
            addCriterion("MER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMerDescIsNotNull() {
            addCriterion("MER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMerDescEqualTo(String value) {
            addCriterion("MER_DESC =", value, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescNotEqualTo(String value) {
            addCriterion("MER_DESC <>", value, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescGreaterThan(String value) {
            addCriterion("MER_DESC >", value, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescGreaterThanOrEqualTo(String value) {
            addCriterion("MER_DESC >=", value, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescLessThan(String value) {
            addCriterion("MER_DESC <", value, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescLessThanOrEqualTo(String value) {
            addCriterion("MER_DESC <=", value, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescLike(String value) {
            addCriterion("MER_DESC like", value, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescNotLike(String value) {
            addCriterion("MER_DESC not like", value, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescIn(List<String> values) {
            addCriterion("MER_DESC in", values, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescNotIn(List<String> values) {
            addCriterion("MER_DESC not in", values, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescBetween(String value1, String value2) {
            addCriterion("MER_DESC between", value1, value2, "merDesc");
            return (Criteria) this;
        }

        public Criteria andMerDescNotBetween(String value1, String value2) {
            addCriterion("MER_DESC not between", value1, value2, "merDesc");
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

        public Criteria andSalesDepIdIsNull() {
            addCriterion("SALES_DEP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdIsNotNull() {
            addCriterion("SALES_DEP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdEqualTo(String value) {
            addCriterion("SALES_DEP_ID =", value, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdNotEqualTo(String value) {
            addCriterion("SALES_DEP_ID <>", value, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdGreaterThan(String value) {
            addCriterion("SALES_DEP_ID >", value, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_DEP_ID >=", value, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdLessThan(String value) {
            addCriterion("SALES_DEP_ID <", value, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdLessThanOrEqualTo(String value) {
            addCriterion("SALES_DEP_ID <=", value, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdLike(String value) {
            addCriterion("SALES_DEP_ID like", value, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdNotLike(String value) {
            addCriterion("SALES_DEP_ID not like", value, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdIn(List<String> values) {
            addCriterion("SALES_DEP_ID in", values, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdNotIn(List<String> values) {
            addCriterion("SALES_DEP_ID not in", values, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdBetween(String value1, String value2) {
            addCriterion("SALES_DEP_ID between", value1, value2, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesDepIdNotBetween(String value1, String value2) {
            addCriterion("SALES_DEP_ID not between", value1, value2, "salesDepId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdIsNull() {
            addCriterion("SALES_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdIsNotNull() {
            addCriterion("SALES_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdEqualTo(String value) {
            addCriterion("SALES_AREA_ID =", value, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdNotEqualTo(String value) {
            addCriterion("SALES_AREA_ID <>", value, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdGreaterThan(String value) {
            addCriterion("SALES_AREA_ID >", value, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_AREA_ID >=", value, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdLessThan(String value) {
            addCriterion("SALES_AREA_ID <", value, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdLessThanOrEqualTo(String value) {
            addCriterion("SALES_AREA_ID <=", value, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdLike(String value) {
            addCriterion("SALES_AREA_ID like", value, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdNotLike(String value) {
            addCriterion("SALES_AREA_ID not like", value, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdIn(List<String> values) {
            addCriterion("SALES_AREA_ID in", values, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdNotIn(List<String> values) {
            addCriterion("SALES_AREA_ID not in", values, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdBetween(String value1, String value2) {
            addCriterion("SALES_AREA_ID between", value1, value2, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIdNotBetween(String value1, String value2) {
            addCriterion("SALES_AREA_ID not between", value1, value2, "salesAreaId");
            return (Criteria) this;
        }

        public Criteria andMerType2IsNull() {
            addCriterion("MER_TYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andMerType2IsNotNull() {
            addCriterion("MER_TYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andMerType2EqualTo(String value) {
            addCriterion("MER_TYPE2 =", value, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2NotEqualTo(String value) {
            addCriterion("MER_TYPE2 <>", value, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2GreaterThan(String value) {
            addCriterion("MER_TYPE2 >", value, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2GreaterThanOrEqualTo(String value) {
            addCriterion("MER_TYPE2 >=", value, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2LessThan(String value) {
            addCriterion("MER_TYPE2 <", value, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2LessThanOrEqualTo(String value) {
            addCriterion("MER_TYPE2 <=", value, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2Like(String value) {
            addCriterion("MER_TYPE2 like", value, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2NotLike(String value) {
            addCriterion("MER_TYPE2 not like", value, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2In(List<String> values) {
            addCriterion("MER_TYPE2 in", values, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2NotIn(List<String> values) {
            addCriterion("MER_TYPE2 not in", values, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2Between(String value1, String value2) {
            addCriterion("MER_TYPE2 between", value1, value2, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerType2NotBetween(String value1, String value2) {
            addCriterion("MER_TYPE2 not between", value1, value2, "merType2");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeIsNull() {
            addCriterion("MER_PARTNER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeIsNotNull() {
            addCriterion("MER_PARTNER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeEqualTo(String value) {
            addCriterion("MER_PARTNER_CODE =", value, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeNotEqualTo(String value) {
            addCriterion("MER_PARTNER_CODE <>", value, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeGreaterThan(String value) {
            addCriterion("MER_PARTNER_CODE >", value, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MER_PARTNER_CODE >=", value, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeLessThan(String value) {
            addCriterion("MER_PARTNER_CODE <", value, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeLessThanOrEqualTo(String value) {
            addCriterion("MER_PARTNER_CODE <=", value, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeLike(String value) {
            addCriterion("MER_PARTNER_CODE like", value, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeNotLike(String value) {
            addCriterion("MER_PARTNER_CODE not like", value, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeIn(List<String> values) {
            addCriterion("MER_PARTNER_CODE in", values, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeNotIn(List<String> values) {
            addCriterion("MER_PARTNER_CODE not in", values, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeBetween(String value1, String value2) {
            addCriterion("MER_PARTNER_CODE between", value1, value2, "merPartnerCode");
            return (Criteria) this;
        }

        public Criteria andMerPartnerCodeNotBetween(String value1, String value2) {
            addCriterion("MER_PARTNER_CODE not between", value1, value2, "merPartnerCode");
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

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
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

        public Criteria andControlHolderIsNull() {
            addCriterion("CONTROL_HOLDER is null");
            return (Criteria) this;
        }

        public Criteria andControlHolderIsNotNull() {
            addCriterion("CONTROL_HOLDER is not null");
            return (Criteria) this;
        }

        public Criteria andControlHolderEqualTo(String value) {
            addCriterion("CONTROL_HOLDER =", value, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderNotEqualTo(String value) {
            addCriterion("CONTROL_HOLDER <>", value, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderGreaterThan(String value) {
            addCriterion("CONTROL_HOLDER >", value, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderGreaterThanOrEqualTo(String value) {
            addCriterion("CONTROL_HOLDER >=", value, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderLessThan(String value) {
            addCriterion("CONTROL_HOLDER <", value, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderLessThanOrEqualTo(String value) {
            addCriterion("CONTROL_HOLDER <=", value, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderLike(String value) {
            addCriterion("CONTROL_HOLDER like", value, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderNotLike(String value) {
            addCriterion("CONTROL_HOLDER not like", value, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderIn(List<String> values) {
            addCriterion("CONTROL_HOLDER in", values, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderNotIn(List<String> values) {
            addCriterion("CONTROL_HOLDER not in", values, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderBetween(String value1, String value2) {
            addCriterion("CONTROL_HOLDER between", value1, value2, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andControlHolderNotBetween(String value1, String value2) {
            addCriterion("CONTROL_HOLDER not between", value1, value2, "controlHolder");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescIsNull() {
            addCriterion("ID_TYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescIsNotNull() {
            addCriterion("ID_TYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescEqualTo(String value) {
            addCriterion("ID_TYPE_DESC =", value, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescNotEqualTo(String value) {
            addCriterion("ID_TYPE_DESC <>", value, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescGreaterThan(String value) {
            addCriterion("ID_TYPE_DESC >", value, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE_DESC >=", value, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescLessThan(String value) {
            addCriterion("ID_TYPE_DESC <", value, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE_DESC <=", value, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescLike(String value) {
            addCriterion("ID_TYPE_DESC like", value, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescNotLike(String value) {
            addCriterion("ID_TYPE_DESC not like", value, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescIn(List<String> values) {
            addCriterion("ID_TYPE_DESC in", values, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescNotIn(List<String> values) {
            addCriterion("ID_TYPE_DESC not in", values, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescBetween(String value1, String value2) {
            addCriterion("ID_TYPE_DESC between", value1, value2, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andIdTypeDescNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE_DESC not between", value1, value2, "idTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescIsNull() {
            addCriterion("LEGAL_ID_TYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescIsNotNull() {
            addCriterion("LEGAL_ID_TYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescEqualTo(String value) {
            addCriterion("LEGAL_ID_TYPE_DESC =", value, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescNotEqualTo(String value) {
            addCriterion("LEGAL_ID_TYPE_DESC <>", value, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescGreaterThan(String value) {
            addCriterion("LEGAL_ID_TYPE_DESC >", value, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_TYPE_DESC >=", value, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescLessThan(String value) {
            addCriterion("LEGAL_ID_TYPE_DESC <", value, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_TYPE_DESC <=", value, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescLike(String value) {
            addCriterion("LEGAL_ID_TYPE_DESC like", value, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescNotLike(String value) {
            addCriterion("LEGAL_ID_TYPE_DESC not like", value, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescIn(List<String> values) {
            addCriterion("LEGAL_ID_TYPE_DESC in", values, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescNotIn(List<String> values) {
            addCriterion("LEGAL_ID_TYPE_DESC not in", values, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_TYPE_DESC between", value1, value2, "legalIdTypeDesc");
            return (Criteria) this;
        }

        public Criteria andLegalIdTypeDescNotBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_TYPE_DESC not between", value1, value2, "legalIdTypeDesc");
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

        public Criteria andLegalIdNoCoverIsNull() {
            addCriterion("LEGAL_ID_NO_COVER is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverIsNotNull() {
            addCriterion("LEGAL_ID_NO_COVER is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverEqualTo(String value) {
            addCriterion("LEGAL_ID_NO_COVER =", value, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverNotEqualTo(String value) {
            addCriterion("LEGAL_ID_NO_COVER <>", value, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverGreaterThan(String value) {
            addCriterion("LEGAL_ID_NO_COVER >", value, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_NO_COVER >=", value, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverLessThan(String value) {
            addCriterion("LEGAL_ID_NO_COVER <", value, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_NO_COVER <=", value, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverLike(String value) {
            addCriterion("LEGAL_ID_NO_COVER like", value, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverNotLike(String value) {
            addCriterion("LEGAL_ID_NO_COVER not like", value, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverIn(List<String> values) {
            addCriterion("LEGAL_ID_NO_COVER in", values, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverNotIn(List<String> values) {
            addCriterion("LEGAL_ID_NO_COVER not in", values, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_NO_COVER between", value1, value2, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCoverNotBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_NO_COVER not between", value1, value2, "legalIdNoCover");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherIsNull() {
            addCriterion("LEGAL_ID_NO_CIPHER is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherIsNotNull() {
            addCriterion("LEGAL_ID_NO_CIPHER is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherEqualTo(String value) {
            addCriterion("LEGAL_ID_NO_CIPHER =", value, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherNotEqualTo(String value) {
            addCriterion("LEGAL_ID_NO_CIPHER <>", value, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherGreaterThan(String value) {
            addCriterion("LEGAL_ID_NO_CIPHER >", value, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_NO_CIPHER >=", value, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherLessThan(String value) {
            addCriterion("LEGAL_ID_NO_CIPHER <", value, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_NO_CIPHER <=", value, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherLike(String value) {
            addCriterion("LEGAL_ID_NO_CIPHER like", value, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherNotLike(String value) {
            addCriterion("LEGAL_ID_NO_CIPHER not like", value, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherIn(List<String> values) {
            addCriterion("LEGAL_ID_NO_CIPHER in", values, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherNotIn(List<String> values) {
            addCriterion("LEGAL_ID_NO_CIPHER not in", values, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_NO_CIPHER between", value1, value2, "legalIdNoCipher");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoCipherNotBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_NO_CIPHER not between", value1, value2, "legalIdNoCipher");
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