package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.List;

public class RolerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolerExample() {
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

        public Criteria andPartnumberIsNull() {
            addCriterion("partnumber is null");
            return (Criteria) this;
        }

        public Criteria andPartnumberIsNotNull() {
            addCriterion("partnumber is not null");
            return (Criteria) this;
        }

        public Criteria andPartnumberEqualTo(Integer value) {
            addCriterion("partnumber =", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotEqualTo(Integer value) {
            addCriterion("partnumber <>", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberGreaterThan(Integer value) {
            addCriterion("partnumber >", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("partnumber >=", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberLessThan(Integer value) {
            addCriterion("partnumber <", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberLessThanOrEqualTo(Integer value) {
            addCriterion("partnumber <=", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberIn(List<Integer> values) {
            addCriterion("partnumber in", values, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotIn(List<Integer> values) {
            addCriterion("partnumber not in", values, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberBetween(Integer value1, Integer value2) {
            addCriterion("partnumber between", value1, value2, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("partnumber not between", value1, value2, "partnumber");
            return (Criteria) this;
        }

        public Criteria andRolernameIsNull() {
            addCriterion("rolername is null");
            return (Criteria) this;
        }

        public Criteria andRolernameIsNotNull() {
            addCriterion("rolername is not null");
            return (Criteria) this;
        }

        public Criteria andRolernameEqualTo(String value) {
            addCriterion("rolername =", value, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameNotEqualTo(String value) {
            addCriterion("rolername <>", value, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameGreaterThan(String value) {
            addCriterion("rolername >", value, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameGreaterThanOrEqualTo(String value) {
            addCriterion("rolername >=", value, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameLessThan(String value) {
            addCriterion("rolername <", value, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameLessThanOrEqualTo(String value) {
            addCriterion("rolername <=", value, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameLike(String value) {
            addCriterion("rolername like", value, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameNotLike(String value) {
            addCriterion("rolername not like", value, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameIn(List<String> values) {
            addCriterion("rolername in", values, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameNotIn(List<String> values) {
            addCriterion("rolername not in", values, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameBetween(String value1, String value2) {
            addCriterion("rolername between", value1, value2, "rolername");
            return (Criteria) this;
        }

        public Criteria andRolernameNotBetween(String value1, String value2) {
            addCriterion("rolername not between", value1, value2, "rolername");
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