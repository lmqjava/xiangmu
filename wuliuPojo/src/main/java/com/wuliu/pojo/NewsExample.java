package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andPressnumberIsNull() {
            addCriterion("pressnumber is null");
            return (Criteria) this;
        }

        public Criteria andPressnumberIsNotNull() {
            addCriterion("pressnumber is not null");
            return (Criteria) this;
        }

        public Criteria andPressnumberEqualTo(Integer value) {
            addCriterion("pressnumber =", value, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andPressnumberNotEqualTo(Integer value) {
            addCriterion("pressnumber <>", value, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andPressnumberGreaterThan(Integer value) {
            addCriterion("pressnumber >", value, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andPressnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("pressnumber >=", value, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andPressnumberLessThan(Integer value) {
            addCriterion("pressnumber <", value, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andPressnumberLessThanOrEqualTo(Integer value) {
            addCriterion("pressnumber <=", value, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andPressnumberIn(List<Integer> values) {
            addCriterion("pressnumber in", values, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andPressnumberNotIn(List<Integer> values) {
            addCriterion("pressnumber not in", values, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andPressnumberBetween(Integer value1, Integer value2) {
            addCriterion("pressnumber between", value1, value2, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andPressnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("pressnumber not between", value1, value2, "pressnumber");
            return (Criteria) this;
        }

        public Criteria andNewsheadIsNull() {
            addCriterion("newshead is null");
            return (Criteria) this;
        }

        public Criteria andNewsheadIsNotNull() {
            addCriterion("newshead is not null");
            return (Criteria) this;
        }

        public Criteria andNewsheadEqualTo(String value) {
            addCriterion("newshead =", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadNotEqualTo(String value) {
            addCriterion("newshead <>", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadGreaterThan(String value) {
            addCriterion("newshead >", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadGreaterThanOrEqualTo(String value) {
            addCriterion("newshead >=", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadLessThan(String value) {
            addCriterion("newshead <", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadLessThanOrEqualTo(String value) {
            addCriterion("newshead <=", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadLike(String value) {
            addCriterion("newshead like", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadNotLike(String value) {
            addCriterion("newshead not like", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadIn(List<String> values) {
            addCriterion("newshead in", values, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadNotIn(List<String> values) {
            addCriterion("newshead not in", values, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadBetween(String value1, String value2) {
            addCriterion("newshead between", value1, value2, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadNotBetween(String value1, String value2) {
            addCriterion("newshead not between", value1, value2, "newshead");
            return (Criteria) this;
        }

        public Criteria andWriterIsNull() {
            addCriterion("writer is null");
            return (Criteria) this;
        }

        public Criteria andWriterIsNotNull() {
            addCriterion("writer is not null");
            return (Criteria) this;
        }

        public Criteria andWriterEqualTo(String value) {
            addCriterion("writer =", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotEqualTo(String value) {
            addCriterion("writer <>", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThan(String value) {
            addCriterion("writer >", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThanOrEqualTo(String value) {
            addCriterion("writer >=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThan(String value) {
            addCriterion("writer <", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThanOrEqualTo(String value) {
            addCriterion("writer <=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLike(String value) {
            addCriterion("writer like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotLike(String value) {
            addCriterion("writer not like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterIn(List<String> values) {
            addCriterion("writer in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotIn(List<String> values) {
            addCriterion("writer not in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterBetween(String value1, String value2) {
            addCriterion("writer between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotBetween(String value1, String value2) {
            addCriterion("writer not between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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