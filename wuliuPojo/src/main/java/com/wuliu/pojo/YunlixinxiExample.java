package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.List;

public class YunlixinxiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunlixinxiExample() {
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

        public Criteria andDriverlicenseldIsNull() {
            addCriterion("driverlicenseld is null");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldIsNotNull() {
            addCriterion("driverlicenseld is not null");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldEqualTo(Integer value) {
            addCriterion("driverlicenseld =", value, "driverlicenseld");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldNotEqualTo(Integer value) {
            addCriterion("driverlicenseld <>", value, "driverlicenseld");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldGreaterThan(Integer value) {
            addCriterion("driverlicenseld >", value, "driverlicenseld");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldGreaterThanOrEqualTo(Integer value) {
            addCriterion("driverlicenseld >=", value, "driverlicenseld");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldLessThan(Integer value) {
            addCriterion("driverlicenseld <", value, "driverlicenseld");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldLessThanOrEqualTo(Integer value) {
            addCriterion("driverlicenseld <=", value, "driverlicenseld");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldIn(List<Integer> values) {
            addCriterion("driverlicenseld in", values, "driverlicenseld");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldNotIn(List<Integer> values) {
            addCriterion("driverlicenseld not in", values, "driverlicenseld");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldBetween(Integer value1, Integer value2) {
            addCriterion("driverlicenseld between", value1, value2, "driverlicenseld");
            return (Criteria) this;
        }

        public Criteria andDriverlicenseldNotBetween(Integer value1, Integer value2) {
            addCriterion("driverlicenseld not between", value1, value2, "driverlicenseld");
            return (Criteria) this;
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

        public Criteria andCarnumIsNull() {
            addCriterion("carnum is null");
            return (Criteria) this;
        }

        public Criteria andCarnumIsNotNull() {
            addCriterion("carnum is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumEqualTo(Integer value) {
            addCriterion("carnum =", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotEqualTo(Integer value) {
            addCriterion("carnum <>", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThan(Integer value) {
            addCriterion("carnum >", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("carnum >=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThan(Integer value) {
            addCriterion("carnum <", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThanOrEqualTo(Integer value) {
            addCriterion("carnum <=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumIn(List<Integer> values) {
            addCriterion("carnum in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotIn(List<Integer> values) {
            addCriterion("carnum not in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumBetween(Integer value1, Integer value2) {
            addCriterion("carnum between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotBetween(Integer value1, Integer value2) {
            addCriterion("carnum not between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andCartelIsNull() {
            addCriterion("cartel is null");
            return (Criteria) this;
        }

        public Criteria andCartelIsNotNull() {
            addCriterion("cartel is not null");
            return (Criteria) this;
        }

        public Criteria andCartelEqualTo(String value) {
            addCriterion("cartel =", value, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelNotEqualTo(String value) {
            addCriterion("cartel <>", value, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelGreaterThan(String value) {
            addCriterion("cartel >", value, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelGreaterThanOrEqualTo(String value) {
            addCriterion("cartel >=", value, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelLessThan(String value) {
            addCriterion("cartel <", value, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelLessThanOrEqualTo(String value) {
            addCriterion("cartel <=", value, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelLike(String value) {
            addCriterion("cartel like", value, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelNotLike(String value) {
            addCriterion("cartel not like", value, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelIn(List<String> values) {
            addCriterion("cartel in", values, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelNotIn(List<String> values) {
            addCriterion("cartel not in", values, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelBetween(String value1, String value2) {
            addCriterion("cartel between", value1, value2, "cartel");
            return (Criteria) this;
        }

        public Criteria andCartelNotBetween(String value1, String value2) {
            addCriterion("cartel not between", value1, value2, "cartel");
            return (Criteria) this;
        }

        public Criteria andYlxxmessIsNull() {
            addCriterion("ylxxmess is null");
            return (Criteria) this;
        }

        public Criteria andYlxxmessIsNotNull() {
            addCriterion("ylxxmess is not null");
            return (Criteria) this;
        }

        public Criteria andYlxxmessEqualTo(String value) {
            addCriterion("ylxxmess =", value, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessNotEqualTo(String value) {
            addCriterion("ylxxmess <>", value, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessGreaterThan(String value) {
            addCriterion("ylxxmess >", value, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessGreaterThanOrEqualTo(String value) {
            addCriterion("ylxxmess >=", value, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessLessThan(String value) {
            addCriterion("ylxxmess <", value, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessLessThanOrEqualTo(String value) {
            addCriterion("ylxxmess <=", value, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessLike(String value) {
            addCriterion("ylxxmess like", value, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessNotLike(String value) {
            addCriterion("ylxxmess not like", value, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessIn(List<String> values) {
            addCriterion("ylxxmess in", values, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessNotIn(List<String> values) {
            addCriterion("ylxxmess not in", values, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessBetween(String value1, String value2) {
            addCriterion("ylxxmess between", value1, value2, "ylxxmess");
            return (Criteria) this;
        }

        public Criteria andYlxxmessNotBetween(String value1, String value2) {
            addCriterion("ylxxmess not between", value1, value2, "ylxxmess");
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