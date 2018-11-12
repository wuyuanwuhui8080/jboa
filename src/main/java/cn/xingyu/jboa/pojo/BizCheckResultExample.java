package cn.xingyu.jboa.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BizCheckResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizCheckResultExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClaimIdIsNull() {
            addCriterion("CLAIM_ID is null");
            return (Criteria) this;
        }

        public Criteria andClaimIdIsNotNull() {
            addCriterion("CLAIM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClaimIdEqualTo(Long value) {
            addCriterion("CLAIM_ID =", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotEqualTo(Long value) {
            addCriterion("CLAIM_ID <>", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdGreaterThan(Long value) {
            addCriterion("CLAIM_ID >", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CLAIM_ID >=", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdLessThan(Long value) {
            addCriterion("CLAIM_ID <", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdLessThanOrEqualTo(Long value) {
            addCriterion("CLAIM_ID <=", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdIn(List<Long> values) {
            addCriterion("CLAIM_ID in", values, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotIn(List<Long> values) {
            addCriterion("CLAIM_ID not in", values, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdBetween(Long value1, Long value2) {
            addCriterion("CLAIM_ID between", value1, value2, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotBetween(Long value1, Long value2) {
            addCriterion("CLAIM_ID not between", value1, value2, "claimId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_TIME =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_TIME <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CHECK_TIME >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_TIME >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterionForJDBCDate("CHECK_TIME <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_TIME <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CHECK_TIME in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHECK_TIME not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECK_TIME between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECK_TIME not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckerSnIsNull() {
            addCriterion("CHECKER_SN is null");
            return (Criteria) this;
        }

        public Criteria andCheckerSnIsNotNull() {
            addCriterion("CHECKER_SN is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerSnEqualTo(String value) {
            addCriterion("CHECKER_SN =", value, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnNotEqualTo(String value) {
            addCriterion("CHECKER_SN <>", value, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnGreaterThan(String value) {
            addCriterion("CHECKER_SN >", value, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKER_SN >=", value, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnLessThan(String value) {
            addCriterion("CHECKER_SN <", value, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnLessThanOrEqualTo(String value) {
            addCriterion("CHECKER_SN <=", value, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnLike(String value) {
            addCriterion("CHECKER_SN like", value, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnNotLike(String value) {
            addCriterion("CHECKER_SN not like", value, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnIn(List<String> values) {
            addCriterion("CHECKER_SN in", values, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnNotIn(List<String> values) {
            addCriterion("CHECKER_SN not in", values, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnBetween(String value1, String value2) {
            addCriterion("CHECKER_SN between", value1, value2, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andCheckerSnNotBetween(String value1, String value2) {
            addCriterion("CHECKER_SN not between", value1, value2, "checkerSn");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andCommIsNull() {
            addCriterion("COMM is null");
            return (Criteria) this;
        }

        public Criteria andCommIsNotNull() {
            addCriterion("COMM is not null");
            return (Criteria) this;
        }

        public Criteria andCommEqualTo(String value) {
            addCriterion("COMM =", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotEqualTo(String value) {
            addCriterion("COMM <>", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommGreaterThan(String value) {
            addCriterion("COMM >", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommGreaterThanOrEqualTo(String value) {
            addCriterion("COMM >=", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommLessThan(String value) {
            addCriterion("COMM <", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommLessThanOrEqualTo(String value) {
            addCriterion("COMM <=", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommLike(String value) {
            addCriterion("COMM like", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotLike(String value) {
            addCriterion("COMM not like", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommIn(List<String> values) {
            addCriterion("COMM in", values, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotIn(List<String> values) {
            addCriterion("COMM not in", values, "comm");
            return (Criteria) this;
        }

        public Criteria andCommBetween(String value1, String value2) {
            addCriterion("COMM between", value1, value2, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotBetween(String value1, String value2) {
            addCriterion("COMM not between", value1, value2, "comm");
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