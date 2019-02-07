package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DingdanztExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DingdanztExample() {
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

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderstatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Integer value) {
            addCriterion("orderstatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Integer value) {
            addCriterion("orderstatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Integer value) {
            addCriterion("orderstatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderstatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Integer value) {
            addCriterion("orderstatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("orderstatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Integer> values) {
            addCriterion("orderstatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Integer> values) {
            addCriterion("orderstatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Integer value1, Integer value2) {
            addCriterion("orderstatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orderstatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnellidIsNull() {
            addCriterion("personnellid is null");
            return (Criteria) this;
        }

        public Criteria andPersonnellidIsNotNull() {
            addCriterion("personnellid is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnellidEqualTo(Integer value) {
            addCriterion("personnellid =", value, "personnellid");
            return (Criteria) this;
        }

        public Criteria andPersonnellidNotEqualTo(Integer value) {
            addCriterion("personnellid <>", value, "personnellid");
            return (Criteria) this;
        }

        public Criteria andPersonnellidGreaterThan(Integer value) {
            addCriterion("personnellid >", value, "personnellid");
            return (Criteria) this;
        }

        public Criteria andPersonnellidGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnellid >=", value, "personnellid");
            return (Criteria) this;
        }

        public Criteria andPersonnellidLessThan(Integer value) {
            addCriterion("personnellid <", value, "personnellid");
            return (Criteria) this;
        }

        public Criteria andPersonnellidLessThanOrEqualTo(Integer value) {
            addCriterion("personnellid <=", value, "personnellid");
            return (Criteria) this;
        }

        public Criteria andPersonnellidIn(List<Integer> values) {
            addCriterion("personnellid in", values, "personnellid");
            return (Criteria) this;
        }

        public Criteria andPersonnellidNotIn(List<Integer> values) {
            addCriterion("personnellid not in", values, "personnellid");
            return (Criteria) this;
        }

        public Criteria andPersonnellidBetween(Integer value1, Integer value2) {
            addCriterion("personnellid between", value1, value2, "personnellid");
            return (Criteria) this;
        }

        public Criteria andPersonnellidNotBetween(Integer value1, Integer value2) {
            addCriterion("personnellid not between", value1, value2, "personnellid");
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

        public Criteria andOrderneirongIsNull() {
            addCriterion("orderneirong is null");
            return (Criteria) this;
        }

        public Criteria andOrderneirongIsNotNull() {
            addCriterion("orderneirong is not null");
            return (Criteria) this;
        }

        public Criteria andOrderneirongEqualTo(String value) {
            addCriterion("orderneirong =", value, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongNotEqualTo(String value) {
            addCriterion("orderneirong <>", value, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongGreaterThan(String value) {
            addCriterion("orderneirong >", value, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongGreaterThanOrEqualTo(String value) {
            addCriterion("orderneirong >=", value, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongLessThan(String value) {
            addCriterion("orderneirong <", value, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongLessThanOrEqualTo(String value) {
            addCriterion("orderneirong <=", value, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongLike(String value) {
            addCriterion("orderneirong like", value, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongNotLike(String value) {
            addCriterion("orderneirong not like", value, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongIn(List<String> values) {
            addCriterion("orderneirong in", values, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongNotIn(List<String> values) {
            addCriterion("orderneirong not in", values, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongBetween(String value1, String value2) {
            addCriterion("orderneirong between", value1, value2, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderneirongNotBetween(String value1, String value2) {
            addCriterion("orderneirong not between", value1, value2, "orderneirong");
            return (Criteria) this;
        }

        public Criteria andOrderremarkIsNull() {
            addCriterion("orderremark is null");
            return (Criteria) this;
        }

        public Criteria andOrderremarkIsNotNull() {
            addCriterion("orderremark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderremarkEqualTo(String value) {
            addCriterion("orderremark =", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotEqualTo(String value) {
            addCriterion("orderremark <>", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkGreaterThan(String value) {
            addCriterion("orderremark >", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkGreaterThanOrEqualTo(String value) {
            addCriterion("orderremark >=", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkLessThan(String value) {
            addCriterion("orderremark <", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkLessThanOrEqualTo(String value) {
            addCriterion("orderremark <=", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkLike(String value) {
            addCriterion("orderremark like", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotLike(String value) {
            addCriterion("orderremark not like", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkIn(List<String> values) {
            addCriterion("orderremark in", values, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotIn(List<String> values) {
            addCriterion("orderremark not in", values, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkBetween(String value1, String value2) {
            addCriterion("orderremark between", value1, value2, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotBetween(String value1, String value2) {
            addCriterion("orderremark not between", value1, value2, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeIsNull() {
            addCriterion("orderstatuschagetime is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeIsNotNull() {
            addCriterion("orderstatuschagetime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeEqualTo(Date value) {
            addCriterion("orderstatuschagetime =", value, "orderstatuschagetime");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeNotEqualTo(Date value) {
            addCriterion("orderstatuschagetime <>", value, "orderstatuschagetime");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeGreaterThan(Date value) {
            addCriterion("orderstatuschagetime >", value, "orderstatuschagetime");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderstatuschagetime >=", value, "orderstatuschagetime");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeLessThan(Date value) {
            addCriterion("orderstatuschagetime <", value, "orderstatuschagetime");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeLessThanOrEqualTo(Date value) {
            addCriterion("orderstatuschagetime <=", value, "orderstatuschagetime");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeIn(List<Date> values) {
            addCriterion("orderstatuschagetime in", values, "orderstatuschagetime");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeNotIn(List<Date> values) {
            addCriterion("orderstatuschagetime not in", values, "orderstatuschagetime");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeBetween(Date value1, Date value2) {
            addCriterion("orderstatuschagetime between", value1, value2, "orderstatuschagetime");
            return (Criteria) this;
        }

        public Criteria andOrderstatuschagetimeNotBetween(Date value1, Date value2) {
            addCriterion("orderstatuschagetime not between", value1, value2, "orderstatuschagetime");
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