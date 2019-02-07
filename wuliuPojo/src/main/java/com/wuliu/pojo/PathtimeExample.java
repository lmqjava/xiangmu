package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PathtimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PathtimeExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andPathtimeidIsNull() {
            addCriterion("pathtimeid is null");
            return (Criteria) this;
        }

        public Criteria andPathtimeidIsNotNull() {
            addCriterion("pathtimeid is not null");
            return (Criteria) this;
        }

        public Criteria andPathtimeidEqualTo(Integer value) {
            addCriterion("pathtimeid =", value, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathtimeidNotEqualTo(Integer value) {
            addCriterion("pathtimeid <>", value, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathtimeidGreaterThan(Integer value) {
            addCriterion("pathtimeid >", value, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathtimeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathtimeid >=", value, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathtimeidLessThan(Integer value) {
            addCriterion("pathtimeid <", value, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathtimeidLessThanOrEqualTo(Integer value) {
            addCriterion("pathtimeid <=", value, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathtimeidIn(List<Integer> values) {
            addCriterion("pathtimeid in", values, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathtimeidNotIn(List<Integer> values) {
            addCriterion("pathtimeid not in", values, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathtimeidBetween(Integer value1, Integer value2) {
            addCriterion("pathtimeid between", value1, value2, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathtimeidNotBetween(Integer value1, Integer value2) {
            addCriterion("pathtimeid not between", value1, value2, "pathtimeid");
            return (Criteria) this;
        }

        public Criteria andPathidIsNull() {
            addCriterion("pathid is null");
            return (Criteria) this;
        }

        public Criteria andPathidIsNotNull() {
            addCriterion("pathid is not null");
            return (Criteria) this;
        }

        public Criteria andPathidEqualTo(Integer value) {
            addCriterion("pathid =", value, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathidNotEqualTo(Integer value) {
            addCriterion("pathid <>", value, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathidGreaterThan(Integer value) {
            addCriterion("pathid >", value, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathid >=", value, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathidLessThan(Integer value) {
            addCriterion("pathid <", value, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathidLessThanOrEqualTo(Integer value) {
            addCriterion("pathid <=", value, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathidIn(List<Integer> values) {
            addCriterion("pathid in", values, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathidNotIn(List<Integer> values) {
            addCriterion("pathid not in", values, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathidBetween(Integer value1, Integer value2) {
            addCriterion("pathid between", value1, value2, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathidNotBetween(Integer value1, Integer value2) {
            addCriterion("pathid not between", value1, value2, "pathid");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeIsNull() {
            addCriterion("pathtimestarttime is null");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeIsNotNull() {
            addCriterion("pathtimestarttime is not null");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeEqualTo(Date value) {
            addCriterionForJDBCTime("pathtimestarttime =", value, "pathtimestarttime");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("pathtimestarttime <>", value, "pathtimestarttime");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeGreaterThan(Date value) {
            addCriterionForJDBCTime("pathtimestarttime >", value, "pathtimestarttime");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("pathtimestarttime >=", value, "pathtimestarttime");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeLessThan(Date value) {
            addCriterionForJDBCTime("pathtimestarttime <", value, "pathtimestarttime");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("pathtimestarttime <=", value, "pathtimestarttime");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeIn(List<Date> values) {
            addCriterionForJDBCTime("pathtimestarttime in", values, "pathtimestarttime");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("pathtimestarttime not in", values, "pathtimestarttime");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("pathtimestarttime between", value1, value2, "pathtimestarttime");
            return (Criteria) this;
        }

        public Criteria andPathtimestarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("pathtimestarttime not between", value1, value2, "pathtimestarttime");
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