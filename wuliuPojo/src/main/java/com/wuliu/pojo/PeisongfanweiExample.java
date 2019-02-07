package com.wuliu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PeisongfanweiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeisongfanweiExample() {
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

        public Criteria andPsfwidIsNull() {
            addCriterion("psfwid is null");
            return (Criteria) this;
        }

        public Criteria andPsfwidIsNotNull() {
            addCriterion("psfwid is not null");
            return (Criteria) this;
        }

        public Criteria andPsfwidEqualTo(Integer value) {
            addCriterion("psfwid =", value, "psfwid");
            return (Criteria) this;
        }

        public Criteria andPsfwidNotEqualTo(Integer value) {
            addCriterion("psfwid <>", value, "psfwid");
            return (Criteria) this;
        }

        public Criteria andPsfwidGreaterThan(Integer value) {
            addCriterion("psfwid >", value, "psfwid");
            return (Criteria) this;
        }

        public Criteria andPsfwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psfwid >=", value, "psfwid");
            return (Criteria) this;
        }

        public Criteria andPsfwidLessThan(Integer value) {
            addCriterion("psfwid <", value, "psfwid");
            return (Criteria) this;
        }

        public Criteria andPsfwidLessThanOrEqualTo(Integer value) {
            addCriterion("psfwid <=", value, "psfwid");
            return (Criteria) this;
        }

        public Criteria andPsfwidIn(List<Integer> values) {
            addCriterion("psfwid in", values, "psfwid");
            return (Criteria) this;
        }

        public Criteria andPsfwidNotIn(List<Integer> values) {
            addCriterion("psfwid not in", values, "psfwid");
            return (Criteria) this;
        }

        public Criteria andPsfwidBetween(Integer value1, Integer value2) {
            addCriterion("psfwid between", value1, value2, "psfwid");
            return (Criteria) this;
        }

        public Criteria andPsfwidNotBetween(Integer value1, Integer value2) {
            addCriterion("psfwid not between", value1, value2, "psfwid");
            return (Criteria) this;
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

        public Criteria andPsfwnameIsNull() {
            addCriterion("psfwname is null");
            return (Criteria) this;
        }

        public Criteria andPsfwnameIsNotNull() {
            addCriterion("psfwname is not null");
            return (Criteria) this;
        }

        public Criteria andPsfwnameEqualTo(String value) {
            addCriterion("psfwname =", value, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameNotEqualTo(String value) {
            addCriterion("psfwname <>", value, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameGreaterThan(String value) {
            addCriterion("psfwname >", value, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameGreaterThanOrEqualTo(String value) {
            addCriterion("psfwname >=", value, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameLessThan(String value) {
            addCriterion("psfwname <", value, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameLessThanOrEqualTo(String value) {
            addCriterion("psfwname <=", value, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameLike(String value) {
            addCriterion("psfwname like", value, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameNotLike(String value) {
            addCriterion("psfwname not like", value, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameIn(List<String> values) {
            addCriterion("psfwname in", values, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameNotIn(List<String> values) {
            addCriterion("psfwname not in", values, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameBetween(String value1, String value2) {
            addCriterion("psfwname between", value1, value2, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPsfwnameNotBetween(String value1, String value2) {
            addCriterion("psfwname not between", value1, value2, "psfwname");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceIsNull() {
            addCriterion("pszhongliangprice is null");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceIsNotNull() {
            addCriterion("pszhongliangprice is not null");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceEqualTo(BigDecimal value) {
            addCriterion("pszhongliangprice =", value, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceNotEqualTo(BigDecimal value) {
            addCriterion("pszhongliangprice <>", value, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceGreaterThan(BigDecimal value) {
            addCriterion("pszhongliangprice >", value, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pszhongliangprice >=", value, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceLessThan(BigDecimal value) {
            addCriterion("pszhongliangprice <", value, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pszhongliangprice <=", value, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceIn(List<BigDecimal> values) {
            addCriterion("pszhongliangprice in", values, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceNotIn(List<BigDecimal> values) {
            addCriterion("pszhongliangprice not in", values, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pszhongliangprice between", value1, value2, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhongliangpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pszhongliangprice not between", value1, value2, "pszhongliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceIsNull() {
            addCriterion("pszhiliangprice is null");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceIsNotNull() {
            addCriterion("pszhiliangprice is not null");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceEqualTo(BigDecimal value) {
            addCriterion("pszhiliangprice =", value, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceNotEqualTo(BigDecimal value) {
            addCriterion("pszhiliangprice <>", value, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceGreaterThan(BigDecimal value) {
            addCriterion("pszhiliangprice >", value, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pszhiliangprice >=", value, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceLessThan(BigDecimal value) {
            addCriterion("pszhiliangprice <", value, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pszhiliangprice <=", value, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceIn(List<BigDecimal> values) {
            addCriterion("pszhiliangprice in", values, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceNotIn(List<BigDecimal> values) {
            addCriterion("pszhiliangprice not in", values, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pszhiliangprice between", value1, value2, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPszhiliangpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pszhiliangprice not between", value1, value2, "pszhiliangprice");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuIsNull() {
            addCriterion("pfmiaoshu is null");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuIsNotNull() {
            addCriterion("pfmiaoshu is not null");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuEqualTo(BigDecimal value) {
            addCriterion("pfmiaoshu =", value, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuNotEqualTo(BigDecimal value) {
            addCriterion("pfmiaoshu <>", value, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuGreaterThan(BigDecimal value) {
            addCriterion("pfmiaoshu >", value, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pfmiaoshu >=", value, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuLessThan(BigDecimal value) {
            addCriterion("pfmiaoshu <", value, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pfmiaoshu <=", value, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuIn(List<BigDecimal> values) {
            addCriterion("pfmiaoshu in", values, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuNotIn(List<BigDecimal> values) {
            addCriterion("pfmiaoshu not in", values, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pfmiaoshu between", value1, value2, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPfmiaoshuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pfmiaoshu not between", value1, value2, "pfmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPsshenheIsNull() {
            addCriterion("psshenhe is null");
            return (Criteria) this;
        }

        public Criteria andPsshenheIsNotNull() {
            addCriterion("psshenhe is not null");
            return (Criteria) this;
        }

        public Criteria andPsshenheEqualTo(String value) {
            addCriterion("psshenhe =", value, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheNotEqualTo(String value) {
            addCriterion("psshenhe <>", value, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheGreaterThan(String value) {
            addCriterion("psshenhe >", value, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheGreaterThanOrEqualTo(String value) {
            addCriterion("psshenhe >=", value, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheLessThan(String value) {
            addCriterion("psshenhe <", value, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheLessThanOrEqualTo(String value) {
            addCriterion("psshenhe <=", value, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheLike(String value) {
            addCriterion("psshenhe like", value, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheNotLike(String value) {
            addCriterion("psshenhe not like", value, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheIn(List<String> values) {
            addCriterion("psshenhe in", values, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheNotIn(List<String> values) {
            addCriterion("psshenhe not in", values, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheBetween(String value1, String value2) {
            addCriterion("psshenhe between", value1, value2, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andPsshenheNotBetween(String value1, String value2) {
            addCriterion("psshenhe not between", value1, value2, "psshenhe");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiIsNull() {
            addCriterion("shenhezhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiIsNotNull() {
            addCriterion("shenhezhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiEqualTo(String value) {
            addCriterion("shenhezhuangtai =", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiNotEqualTo(String value) {
            addCriterion("shenhezhuangtai <>", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiGreaterThan(String value) {
            addCriterion("shenhezhuangtai >", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("shenhezhuangtai >=", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiLessThan(String value) {
            addCriterion("shenhezhuangtai <", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("shenhezhuangtai <=", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiLike(String value) {
            addCriterion("shenhezhuangtai like", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiNotLike(String value) {
            addCriterion("shenhezhuangtai not like", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiIn(List<String> values) {
            addCriterion("shenhezhuangtai in", values, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiNotIn(List<String> values) {
            addCriterion("shenhezhuangtai not in", values, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiBetween(String value1, String value2) {
            addCriterion("shenhezhuangtai between", value1, value2, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiNotBetween(String value1, String value2) {
            addCriterion("shenhezhuangtai not between", value1, value2, "shenhezhuangtai");
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