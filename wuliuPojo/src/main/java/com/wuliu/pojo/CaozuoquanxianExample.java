package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CaozuoquanxianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaozuoquanxianExample() {
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

        public Criteria andCzqxidIsNull() {
            addCriterion("czqxid is null");
            return (Criteria) this;
        }

        public Criteria andCzqxidIsNotNull() {
            addCriterion("czqxid is not null");
            return (Criteria) this;
        }

        public Criteria andCzqxidEqualTo(Integer value) {
            addCriterion("czqxid =", value, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCzqxidNotEqualTo(Integer value) {
            addCriterion("czqxid <>", value, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCzqxidGreaterThan(Integer value) {
            addCriterion("czqxid >", value, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCzqxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("czqxid >=", value, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCzqxidLessThan(Integer value) {
            addCriterion("czqxid <", value, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCzqxidLessThanOrEqualTo(Integer value) {
            addCriterion("czqxid <=", value, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCzqxidIn(List<Integer> values) {
            addCriterion("czqxid in", values, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCzqxidNotIn(List<Integer> values) {
            addCriterion("czqxid not in", values, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCzqxidBetween(Integer value1, Integer value2) {
            addCriterion("czqxid between", value1, value2, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCzqxidNotBetween(Integer value1, Integer value2) {
            addCriterion("czqxid not between", value1, value2, "czqxid");
            return (Criteria) this;
        }

        public Criteria andCznameIsNull() {
            addCriterion("czname is null");
            return (Criteria) this;
        }

        public Criteria andCznameIsNotNull() {
            addCriterion("czname is not null");
            return (Criteria) this;
        }

        public Criteria andCznameEqualTo(String value) {
            addCriterion("czname =", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameNotEqualTo(String value) {
            addCriterion("czname <>", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameGreaterThan(String value) {
            addCriterion("czname >", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameGreaterThanOrEqualTo(String value) {
            addCriterion("czname >=", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameLessThan(String value) {
            addCriterion("czname <", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameLessThanOrEqualTo(String value) {
            addCriterion("czname <=", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameLike(String value) {
            addCriterion("czname like", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameNotLike(String value) {
            addCriterion("czname not like", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameIn(List<String> values) {
            addCriterion("czname in", values, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameNotIn(List<String> values) {
            addCriterion("czname not in", values, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameBetween(String value1, String value2) {
            addCriterion("czname between", value1, value2, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameNotBetween(String value1, String value2) {
            addCriterion("czname not between", value1, value2, "czname");
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