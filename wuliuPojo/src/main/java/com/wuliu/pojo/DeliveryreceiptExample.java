package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliveryreceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryreceiptExample() {
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

        public Criteria andDeliveryreceiptidIsNull() {
            addCriterion("deliveryreceiptid is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidIsNotNull() {
            addCriterion("deliveryreceiptid is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidEqualTo(Integer value) {
            addCriterion("deliveryreceiptid =", value, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidNotEqualTo(Integer value) {
            addCriterion("deliveryreceiptid <>", value, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidGreaterThan(Integer value) {
            addCriterion("deliveryreceiptid >", value, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliveryreceiptid >=", value, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidLessThan(Integer value) {
            addCriterion("deliveryreceiptid <", value, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidLessThanOrEqualTo(Integer value) {
            addCriterion("deliveryreceiptid <=", value, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidIn(List<Integer> values) {
            addCriterion("deliveryreceiptid in", values, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidNotIn(List<Integer> values) {
            addCriterion("deliveryreceiptid not in", values, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidBetween(Integer value1, Integer value2) {
            addCriterion("deliveryreceiptid between", value1, value2, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deliveryreceiptid not between", value1, value2, "deliveryreceiptid");
            return (Criteria) this;
        }

        public Criteria andYlxxidIsNull() {
            addCriterion("ylxxid is null");
            return (Criteria) this;
        }

        public Criteria andYlxxidIsNotNull() {
            addCriterion("ylxxid is not null");
            return (Criteria) this;
        }

        public Criteria andYlxxidEqualTo(Integer value) {
            addCriterion("ylxxid =", value, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andYlxxidNotEqualTo(Integer value) {
            addCriterion("ylxxid <>", value, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andYlxxidGreaterThan(Integer value) {
            addCriterion("ylxxid >", value, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andYlxxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ylxxid >=", value, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andYlxxidLessThan(Integer value) {
            addCriterion("ylxxid <", value, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andYlxxidLessThanOrEqualTo(Integer value) {
            addCriterion("ylxxid <=", value, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andYlxxidIn(List<Integer> values) {
            addCriterion("ylxxid in", values, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andYlxxidNotIn(List<Integer> values) {
            addCriterion("ylxxid not in", values, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andYlxxidBetween(Integer value1, Integer value2) {
            addCriterion("ylxxid between", value1, value2, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andYlxxidNotBetween(Integer value1, Integer value2) {
            addCriterion("ylxxid not between", value1, value2, "ylxxid");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateIsNull() {
            addCriterion("deliveryreceiptdate is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateIsNotNull() {
            addCriterion("deliveryreceiptdate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateEqualTo(Date value) {
            addCriterion("deliveryreceiptdate =", value, "deliveryreceiptdate");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateNotEqualTo(Date value) {
            addCriterion("deliveryreceiptdate <>", value, "deliveryreceiptdate");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateGreaterThan(Date value) {
            addCriterion("deliveryreceiptdate >", value, "deliveryreceiptdate");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateGreaterThanOrEqualTo(Date value) {
            addCriterion("deliveryreceiptdate >=", value, "deliveryreceiptdate");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateLessThan(Date value) {
            addCriterion("deliveryreceiptdate <", value, "deliveryreceiptdate");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateLessThanOrEqualTo(Date value) {
            addCriterion("deliveryreceiptdate <=", value, "deliveryreceiptdate");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateIn(List<Date> values) {
            addCriterion("deliveryreceiptdate in", values, "deliveryreceiptdate");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateNotIn(List<Date> values) {
            addCriterion("deliveryreceiptdate not in", values, "deliveryreceiptdate");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateBetween(Date value1, Date value2) {
            addCriterion("deliveryreceiptdate between", value1, value2, "deliveryreceiptdate");
            return (Criteria) this;
        }

        public Criteria andDeliveryreceiptdateNotBetween(Date value1, Date value2) {
            addCriterion("deliveryreceiptdate not between", value1, value2, "deliveryreceiptdate");
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