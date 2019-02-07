package com.wuliu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RunpriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RunpriceExample() {
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

        public Criteria andRunpriceidIsNull() {
            addCriterion("runpriceid is null");
            return (Criteria) this;
        }

        public Criteria andRunpriceidIsNotNull() {
            addCriterion("runpriceid is not null");
            return (Criteria) this;
        }

        public Criteria andRunpriceidEqualTo(Integer value) {
            addCriterion("runpriceid =", value, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andRunpriceidNotEqualTo(Integer value) {
            addCriterion("runpriceid <>", value, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andRunpriceidGreaterThan(Integer value) {
            addCriterion("runpriceid >", value, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andRunpriceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("runpriceid >=", value, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andRunpriceidLessThan(Integer value) {
            addCriterion("runpriceid <", value, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andRunpriceidLessThanOrEqualTo(Integer value) {
            addCriterion("runpriceid <=", value, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andRunpriceidIn(List<Integer> values) {
            addCriterion("runpriceid in", values, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andRunpriceidNotIn(List<Integer> values) {
            addCriterion("runpriceid not in", values, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andRunpriceidBetween(Integer value1, Integer value2) {
            addCriterion("runpriceid between", value1, value2, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andRunpriceidNotBetween(Integer value1, Integer value2) {
            addCriterion("runpriceid not between", value1, value2, "runpriceid");
            return (Criteria) this;
        }

        public Criteria andFhaddIsNull() {
            addCriterion("fhadd is null");
            return (Criteria) this;
        }

        public Criteria andFhaddIsNotNull() {
            addCriterion("fhadd is not null");
            return (Criteria) this;
        }

        public Criteria andFhaddEqualTo(String value) {
            addCriterion("fhadd =", value, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddNotEqualTo(String value) {
            addCriterion("fhadd <>", value, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddGreaterThan(String value) {
            addCriterion("fhadd >", value, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddGreaterThanOrEqualTo(String value) {
            addCriterion("fhadd >=", value, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddLessThan(String value) {
            addCriterion("fhadd <", value, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddLessThanOrEqualTo(String value) {
            addCriterion("fhadd <=", value, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddLike(String value) {
            addCriterion("fhadd like", value, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddNotLike(String value) {
            addCriterion("fhadd not like", value, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddIn(List<String> values) {
            addCriterion("fhadd in", values, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddNotIn(List<String> values) {
            addCriterion("fhadd not in", values, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddBetween(String value1, String value2) {
            addCriterion("fhadd between", value1, value2, "fhadd");
            return (Criteria) this;
        }

        public Criteria andFhaddNotBetween(String value1, String value2) {
            addCriterion("fhadd not between", value1, value2, "fhadd");
            return (Criteria) this;
        }

        public Criteria andShaddIsNull() {
            addCriterion("shadd is null");
            return (Criteria) this;
        }

        public Criteria andShaddIsNotNull() {
            addCriterion("shadd is not null");
            return (Criteria) this;
        }

        public Criteria andShaddEqualTo(String value) {
            addCriterion("shadd =", value, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddNotEqualTo(String value) {
            addCriterion("shadd <>", value, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddGreaterThan(String value) {
            addCriterion("shadd >", value, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddGreaterThanOrEqualTo(String value) {
            addCriterion("shadd >=", value, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddLessThan(String value) {
            addCriterion("shadd <", value, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddLessThanOrEqualTo(String value) {
            addCriterion("shadd <=", value, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddLike(String value) {
            addCriterion("shadd like", value, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddNotLike(String value) {
            addCriterion("shadd not like", value, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddIn(List<String> values) {
            addCriterion("shadd in", values, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddNotIn(List<String> values) {
            addCriterion("shadd not in", values, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddBetween(String value1, String value2) {
            addCriterion("shadd between", value1, value2, "shadd");
            return (Criteria) this;
        }

        public Criteria andShaddNotBetween(String value1, String value2) {
            addCriterion("shadd not between", value1, value2, "shadd");
            return (Criteria) this;
        }

        public Criteria andFirstpriceIsNull() {
            addCriterion("firstprice is null");
            return (Criteria) this;
        }

        public Criteria andFirstpriceIsNotNull() {
            addCriterion("firstprice is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpriceEqualTo(BigDecimal value) {
            addCriterion("firstprice =", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceNotEqualTo(BigDecimal value) {
            addCriterion("firstprice <>", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceGreaterThan(BigDecimal value) {
            addCriterion("firstprice >", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("firstprice >=", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceLessThan(BigDecimal value) {
            addCriterion("firstprice <", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("firstprice <=", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceIn(List<BigDecimal> values) {
            addCriterion("firstprice in", values, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceNotIn(List<BigDecimal> values) {
            addCriterion("firstprice not in", values, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("firstprice between", value1, value2, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("firstprice not between", value1, value2, "firstprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceIsNull() {
            addCriterion("cgjprice is null");
            return (Criteria) this;
        }

        public Criteria andCgjpriceIsNotNull() {
            addCriterion("cgjprice is not null");
            return (Criteria) this;
        }

        public Criteria andCgjpriceEqualTo(BigDecimal value) {
            addCriterion("cgjprice =", value, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceNotEqualTo(BigDecimal value) {
            addCriterion("cgjprice <>", value, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceGreaterThan(BigDecimal value) {
            addCriterion("cgjprice >", value, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cgjprice >=", value, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceLessThan(BigDecimal value) {
            addCriterion("cgjprice <", value, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cgjprice <=", value, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceIn(List<BigDecimal> values) {
            addCriterion("cgjprice in", values, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceNotIn(List<BigDecimal> values) {
            addCriterion("cgjprice not in", values, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cgjprice between", value1, value2, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andCgjpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cgjprice not between", value1, value2, "cgjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceIsNull() {
            addCriterion("stjprice is null");
            return (Criteria) this;
        }

        public Criteria andStjpriceIsNotNull() {
            addCriterion("stjprice is not null");
            return (Criteria) this;
        }

        public Criteria andStjpriceEqualTo(BigDecimal value) {
            addCriterion("stjprice =", value, "stjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceNotEqualTo(BigDecimal value) {
            addCriterion("stjprice <>", value, "stjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceGreaterThan(BigDecimal value) {
            addCriterion("stjprice >", value, "stjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stjprice >=", value, "stjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceLessThan(BigDecimal value) {
            addCriterion("stjprice <", value, "stjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stjprice <=", value, "stjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceIn(List<BigDecimal> values) {
            addCriterion("stjprice in", values, "stjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceNotIn(List<BigDecimal> values) {
            addCriterion("stjprice not in", values, "stjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stjprice between", value1, value2, "stjprice");
            return (Criteria) this;
        }

        public Criteria andStjpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stjprice not between", value1, value2, "stjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceIsNull() {
            addCriterion("ctjprice is null");
            return (Criteria) this;
        }

        public Criteria andCtjpriceIsNotNull() {
            addCriterion("ctjprice is not null");
            return (Criteria) this;
        }

        public Criteria andCtjpriceEqualTo(BigDecimal value) {
            addCriterion("ctjprice =", value, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceNotEqualTo(BigDecimal value) {
            addCriterion("ctjprice <>", value, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceGreaterThan(BigDecimal value) {
            addCriterion("ctjprice >", value, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ctjprice >=", value, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceLessThan(BigDecimal value) {
            addCriterion("ctjprice <", value, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ctjprice <=", value, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceIn(List<BigDecimal> values) {
            addCriterion("ctjprice in", values, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceNotIn(List<BigDecimal> values) {
            addCriterion("ctjprice not in", values, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ctjprice between", value1, value2, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andCtjpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ctjprice not between", value1, value2, "ctjprice");
            return (Criteria) this;
        }

        public Criteria andSslxnIsNull() {
            addCriterion("sslxn is null");
            return (Criteria) this;
        }

        public Criteria andSslxnIsNotNull() {
            addCriterion("sslxn is not null");
            return (Criteria) this;
        }

        public Criteria andSslxnEqualTo(Integer value) {
            addCriterion("sslxn =", value, "sslxn");
            return (Criteria) this;
        }

        public Criteria andSslxnNotEqualTo(Integer value) {
            addCriterion("sslxn <>", value, "sslxn");
            return (Criteria) this;
        }

        public Criteria andSslxnGreaterThan(Integer value) {
            addCriterion("sslxn >", value, "sslxn");
            return (Criteria) this;
        }

        public Criteria andSslxnGreaterThanOrEqualTo(Integer value) {
            addCriterion("sslxn >=", value, "sslxn");
            return (Criteria) this;
        }

        public Criteria andSslxnLessThan(Integer value) {
            addCriterion("sslxn <", value, "sslxn");
            return (Criteria) this;
        }

        public Criteria andSslxnLessThanOrEqualTo(Integer value) {
            addCriterion("sslxn <=", value, "sslxn");
            return (Criteria) this;
        }

        public Criteria andSslxnIn(List<Integer> values) {
            addCriterion("sslxn in", values, "sslxn");
            return (Criteria) this;
        }

        public Criteria andSslxnNotIn(List<Integer> values) {
            addCriterion("sslxn not in", values, "sslxn");
            return (Criteria) this;
        }

        public Criteria andSslxnBetween(Integer value1, Integer value2) {
            addCriterion("sslxn between", value1, value2, "sslxn");
            return (Criteria) this;
        }

        public Criteria andSslxnNotBetween(Integer value1, Integer value2) {
            addCriterion("sslxn not between", value1, value2, "sslxn");
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