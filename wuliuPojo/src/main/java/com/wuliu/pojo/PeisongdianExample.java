package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.List;

public class PeisongdianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeisongdianExample() {
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

        public Criteria andPsdidIsNull() {
            addCriterion("psdid is null");
            return (Criteria) this;
        }

        public Criteria andPsdidIsNotNull() {
            addCriterion("psdid is not null");
            return (Criteria) this;
        }

        public Criteria andPsdidEqualTo(Integer value) {
            addCriterion("psdid =", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidNotEqualTo(Integer value) {
            addCriterion("psdid <>", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidGreaterThan(Integer value) {
            addCriterion("psdid >", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psdid >=", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidLessThan(Integer value) {
            addCriterion("psdid <", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidLessThanOrEqualTo(Integer value) {
            addCriterion("psdid <=", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidIn(List<Integer> values) {
            addCriterion("psdid in", values, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidNotIn(List<Integer> values) {
            addCriterion("psdid not in", values, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidBetween(Integer value1, Integer value2) {
            addCriterion("psdid between", value1, value2, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidNotBetween(Integer value1, Integer value2) {
            addCriterion("psdid not between", value1, value2, "psdid");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameIsNull() {
            addCriterion("peisongidianname is null");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameIsNotNull() {
            addCriterion("peisongidianname is not null");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameEqualTo(String value) {
            addCriterion("peisongidianname =", value, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameNotEqualTo(String value) {
            addCriterion("peisongidianname <>", value, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameGreaterThan(String value) {
            addCriterion("peisongidianname >", value, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameGreaterThanOrEqualTo(String value) {
            addCriterion("peisongidianname >=", value, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameLessThan(String value) {
            addCriterion("peisongidianname <", value, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameLessThanOrEqualTo(String value) {
            addCriterion("peisongidianname <=", value, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameLike(String value) {
            addCriterion("peisongidianname like", value, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameNotLike(String value) {
            addCriterion("peisongidianname not like", value, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameIn(List<String> values) {
            addCriterion("peisongidianname in", values, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameNotIn(List<String> values) {
            addCriterion("peisongidianname not in", values, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameBetween(String value1, String value2) {
            addCriterion("peisongidianname between", value1, value2, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andPeisongidiannameNotBetween(String value1, String value2) {
            addCriterion("peisongidianname not between", value1, value2, "peisongidianname");
            return (Criteria) this;
        }

        public Criteria andShengfenIsNull() {
            addCriterion("shengfen is null");
            return (Criteria) this;
        }

        public Criteria andShengfenIsNotNull() {
            addCriterion("shengfen is not null");
            return (Criteria) this;
        }

        public Criteria andShengfenEqualTo(String value) {
            addCriterion("shengfen =", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotEqualTo(String value) {
            addCriterion("shengfen <>", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenGreaterThan(String value) {
            addCriterion("shengfen >", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenGreaterThanOrEqualTo(String value) {
            addCriterion("shengfen >=", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenLessThan(String value) {
            addCriterion("shengfen <", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenLessThanOrEqualTo(String value) {
            addCriterion("shengfen <=", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenLike(String value) {
            addCriterion("shengfen like", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotLike(String value) {
            addCriterion("shengfen not like", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenIn(List<String> values) {
            addCriterion("shengfen in", values, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotIn(List<String> values) {
            addCriterion("shengfen not in", values, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenBetween(String value1, String value2) {
            addCriterion("shengfen between", value1, value2, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotBetween(String value1, String value2) {
            addCriterion("shengfen not between", value1, value2, "shengfen");
            return (Criteria) this;
        }

        public Criteria andPsphoneIsNull() {
            addCriterion("psphone is null");
            return (Criteria) this;
        }

        public Criteria andPsphoneIsNotNull() {
            addCriterion("psphone is not null");
            return (Criteria) this;
        }

        public Criteria andPsphoneEqualTo(String value) {
            addCriterion("psphone =", value, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneNotEqualTo(String value) {
            addCriterion("psphone <>", value, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneGreaterThan(String value) {
            addCriterion("psphone >", value, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("psphone >=", value, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneLessThan(String value) {
            addCriterion("psphone <", value, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneLessThanOrEqualTo(String value) {
            addCriterion("psphone <=", value, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneLike(String value) {
            addCriterion("psphone like", value, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneNotLike(String value) {
            addCriterion("psphone not like", value, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneIn(List<String> values) {
            addCriterion("psphone in", values, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneNotIn(List<String> values) {
            addCriterion("psphone not in", values, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneBetween(String value1, String value2) {
            addCriterion("psphone between", value1, value2, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsphoneNotBetween(String value1, String value2) {
            addCriterion("psphone not between", value1, value2, "psphone");
            return (Criteria) this;
        }

        public Criteria andPsemailIsNull() {
            addCriterion("psemail is null");
            return (Criteria) this;
        }

        public Criteria andPsemailIsNotNull() {
            addCriterion("psemail is not null");
            return (Criteria) this;
        }

        public Criteria andPsemailEqualTo(String value) {
            addCriterion("psemail =", value, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailNotEqualTo(String value) {
            addCriterion("psemail <>", value, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailGreaterThan(String value) {
            addCriterion("psemail >", value, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailGreaterThanOrEqualTo(String value) {
            addCriterion("psemail >=", value, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailLessThan(String value) {
            addCriterion("psemail <", value, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailLessThanOrEqualTo(String value) {
            addCriterion("psemail <=", value, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailLike(String value) {
            addCriterion("psemail like", value, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailNotLike(String value) {
            addCriterion("psemail not like", value, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailIn(List<String> values) {
            addCriterion("psemail in", values, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailNotIn(List<String> values) {
            addCriterion("psemail not in", values, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailBetween(String value1, String value2) {
            addCriterion("psemail between", value1, value2, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsemailNotBetween(String value1, String value2) {
            addCriterion("psemail not between", value1, value2, "psemail");
            return (Criteria) this;
        }

        public Criteria andPsxinxiIsNull() {
            addCriterion("psxinxi is null");
            return (Criteria) this;
        }

        public Criteria andPsxinxiIsNotNull() {
            addCriterion("psxinxi is not null");
            return (Criteria) this;
        }

        public Criteria andPsxinxiEqualTo(String value) {
            addCriterion("psxinxi =", value, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiNotEqualTo(String value) {
            addCriterion("psxinxi <>", value, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiGreaterThan(String value) {
            addCriterion("psxinxi >", value, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiGreaterThanOrEqualTo(String value) {
            addCriterion("psxinxi >=", value, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiLessThan(String value) {
            addCriterion("psxinxi <", value, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiLessThanOrEqualTo(String value) {
            addCriterion("psxinxi <=", value, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiLike(String value) {
            addCriterion("psxinxi like", value, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiNotLike(String value) {
            addCriterion("psxinxi not like", value, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiIn(List<String> values) {
            addCriterion("psxinxi in", values, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiNotIn(List<String> values) {
            addCriterion("psxinxi not in", values, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiBetween(String value1, String value2) {
            addCriterion("psxinxi between", value1, value2, "psxinxi");
            return (Criteria) this;
        }

        public Criteria andPsxinxiNotBetween(String value1, String value2) {
            addCriterion("psxinxi not between", value1, value2, "psxinxi");
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