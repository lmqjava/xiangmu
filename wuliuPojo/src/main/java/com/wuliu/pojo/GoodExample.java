package com.wuliu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodExample() {
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

        public Criteria andGoodidIsNull() {
            addCriterion("goodid is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("goodid =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("goodid <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("goodid >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodid >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("goodid <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("goodid <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("goodid in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("goodid not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("goodid between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodid not between", value1, value2, "goodid");
            return (Criteria) this;
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

        public Criteria andOrderlistidIsNull() {
            addCriterion("orderlistid is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistidIsNotNull() {
            addCriterion("orderlistid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistidEqualTo(Integer value) {
            addCriterion("orderlistid =", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidNotEqualTo(Integer value) {
            addCriterion("orderlistid <>", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidGreaterThan(Integer value) {
            addCriterion("orderlistid >", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderlistid >=", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidLessThan(Integer value) {
            addCriterion("orderlistid <", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidLessThanOrEqualTo(Integer value) {
            addCriterion("orderlistid <=", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidIn(List<Integer> values) {
            addCriterion("orderlistid in", values, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidNotIn(List<Integer> values) {
            addCriterion("orderlistid not in", values, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidBetween(Integer value1, Integer value2) {
            addCriterion("orderlistid between", value1, value2, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderlistid not between", value1, value2, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNull() {
            addCriterion("goodname is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("goodname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("goodname =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("goodname <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("goodname >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodname >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("goodname <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("goodname <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("goodname like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("goodname not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("goodname in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("goodname not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("goodname between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("goodname not between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNull() {
            addCriterion("goodnum is null");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNotNull() {
            addCriterion("goodnum is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnumEqualTo(Integer value) {
            addCriterion("goodnum =", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotEqualTo(Integer value) {
            addCriterion("goodnum <>", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThan(Integer value) {
            addCriterion("goodnum >", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodnum >=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThan(Integer value) {
            addCriterion("goodnum <", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThanOrEqualTo(Integer value) {
            addCriterion("goodnum <=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumIn(List<Integer> values) {
            addCriterion("goodnum in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotIn(List<Integer> values) {
            addCriterion("goodnum not in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumBetween(Integer value1, Integer value2) {
            addCriterion("goodnum between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotBetween(Integer value1, Integer value2) {
            addCriterion("goodnum not between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNull() {
            addCriterion("goodprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNotNull() {
            addCriterion("goodprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceEqualTo(BigDecimal value) {
            addCriterion("goodprice =", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotEqualTo(BigDecimal value) {
            addCriterion("goodprice <>", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThan(BigDecimal value) {
            addCriterion("goodprice >", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goodprice >=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThan(BigDecimal value) {
            addCriterion("goodprice <", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goodprice <=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIn(List<BigDecimal> values) {
            addCriterion("goodprice in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotIn(List<BigDecimal> values) {
            addCriterion("goodprice not in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodprice between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodprice not between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodtijiIsNull() {
            addCriterion("goodtiji is null");
            return (Criteria) this;
        }

        public Criteria andGoodtijiIsNotNull() {
            addCriterion("goodtiji is not null");
            return (Criteria) this;
        }

        public Criteria andGoodtijiEqualTo(Float value) {
            addCriterion("goodtiji =", value, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodtijiNotEqualTo(Float value) {
            addCriterion("goodtiji <>", value, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodtijiGreaterThan(Float value) {
            addCriterion("goodtiji >", value, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodtijiGreaterThanOrEqualTo(Float value) {
            addCriterion("goodtiji >=", value, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodtijiLessThan(Float value) {
            addCriterion("goodtiji <", value, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodtijiLessThanOrEqualTo(Float value) {
            addCriterion("goodtiji <=", value, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodtijiIn(List<Float> values) {
            addCriterion("goodtiji in", values, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodtijiNotIn(List<Float> values) {
            addCriterion("goodtiji not in", values, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodtijiBetween(Float value1, Float value2) {
            addCriterion("goodtiji between", value1, value2, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodtijiNotBetween(Float value1, Float value2) {
            addCriterion("goodtiji not between", value1, value2, "goodtiji");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangIsNull() {
            addCriterion("goodzhongliang is null");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangIsNotNull() {
            addCriterion("goodzhongliang is not null");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangEqualTo(Float value) {
            addCriterion("goodzhongliang =", value, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangNotEqualTo(Float value) {
            addCriterion("goodzhongliang <>", value, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangGreaterThan(Float value) {
            addCriterion("goodzhongliang >", value, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangGreaterThanOrEqualTo(Float value) {
            addCriterion("goodzhongliang >=", value, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangLessThan(Float value) {
            addCriterion("goodzhongliang <", value, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangLessThanOrEqualTo(Float value) {
            addCriterion("goodzhongliang <=", value, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangIn(List<Float> values) {
            addCriterion("goodzhongliang in", values, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangNotIn(List<Float> values) {
            addCriterion("goodzhongliang not in", values, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangBetween(Float value1, Float value2) {
            addCriterion("goodzhongliang between", value1, value2, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodzhongliangNotBetween(Float value1, Float value2) {
            addCriterion("goodzhongliang not between", value1, value2, "goodzhongliang");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuIsNull() {
            addCriterion("goodmiaoshu is null");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuIsNotNull() {
            addCriterion("goodmiaoshu is not null");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuEqualTo(String value) {
            addCriterion("goodmiaoshu =", value, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuNotEqualTo(String value) {
            addCriterion("goodmiaoshu <>", value, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuGreaterThan(String value) {
            addCriterion("goodmiaoshu >", value, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("goodmiaoshu >=", value, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuLessThan(String value) {
            addCriterion("goodmiaoshu <", value, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuLessThanOrEqualTo(String value) {
            addCriterion("goodmiaoshu <=", value, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuLike(String value) {
            addCriterion("goodmiaoshu like", value, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuNotLike(String value) {
            addCriterion("goodmiaoshu not like", value, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuIn(List<String> values) {
            addCriterion("goodmiaoshu in", values, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuNotIn(List<String> values) {
            addCriterion("goodmiaoshu not in", values, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuBetween(String value1, String value2) {
            addCriterion("goodmiaoshu between", value1, value2, "goodmiaoshu");
            return (Criteria) this;
        }

        public Criteria andGoodmiaoshuNotBetween(String value1, String value2) {
            addCriterion("goodmiaoshu not between", value1, value2, "goodmiaoshu");
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