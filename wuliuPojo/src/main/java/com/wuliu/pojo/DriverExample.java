package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverExample() {
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

        public Criteria andPathnameIsNull() {
            addCriterion("pathname is null");
            return (Criteria) this;
        }

        public Criteria andPathnameIsNotNull() {
            addCriterion("pathname is not null");
            return (Criteria) this;
        }

        public Criteria andPathnameEqualTo(Integer value) {
            addCriterion("pathname =", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotEqualTo(Integer value) {
            addCriterion("pathname <>", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameGreaterThan(Integer value) {
            addCriterion("pathname >", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathname >=", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLessThan(Integer value) {
            addCriterion("pathname <", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLessThanOrEqualTo(Integer value) {
            addCriterion("pathname <=", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameIn(List<Integer> values) {
            addCriterion("pathname in", values, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotIn(List<Integer> values) {
            addCriterion("pathname not in", values, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameBetween(Integer value1, Integer value2) {
            addCriterion("pathname between", value1, value2, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotBetween(Integer value1, Integer value2) {
            addCriterion("pathname not between", value1, value2, "pathname");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNull() {
            addCriterion("personnelid is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNotNull() {
            addCriterion("personnelid is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidEqualTo(Integer value) {
            addCriterion("personnelid =", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotEqualTo(Integer value) {
            addCriterion("personnelid <>", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThan(Integer value) {
            addCriterion("personnelid >", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnelid >=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThan(Integer value) {
            addCriterion("personnelid <", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThanOrEqualTo(Integer value) {
            addCriterion("personnelid <=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIn(List<Integer> values) {
            addCriterion("personnelid in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotIn(List<Integer> values) {
            addCriterion("personnelid not in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidBetween(Integer value1, Integer value2) {
            addCriterion("personnelid between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotBetween(Integer value1, Integer value2) {
            addCriterion("personnelid not between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andDriverremarkIsNull() {
            addCriterion("driverremark is null");
            return (Criteria) this;
        }

        public Criteria andDriverremarkIsNotNull() {
            addCriterion("driverremark is not null");
            return (Criteria) this;
        }

        public Criteria andDriverremarkEqualTo(String value) {
            addCriterion("driverremark =", value, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkNotEqualTo(String value) {
            addCriterion("driverremark <>", value, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkGreaterThan(String value) {
            addCriterion("driverremark >", value, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkGreaterThanOrEqualTo(String value) {
            addCriterion("driverremark >=", value, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkLessThan(String value) {
            addCriterion("driverremark <", value, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkLessThanOrEqualTo(String value) {
            addCriterion("driverremark <=", value, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkLike(String value) {
            addCriterion("driverremark like", value, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkNotLike(String value) {
            addCriterion("driverremark not like", value, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkIn(List<String> values) {
            addCriterion("driverremark in", values, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkNotIn(List<String> values) {
            addCriterion("driverremark not in", values, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkBetween(String value1, String value2) {
            addCriterion("driverremark between", value1, value2, "driverremark");
            return (Criteria) this;
        }

        public Criteria andDriverremarkNotBetween(String value1, String value2) {
            addCriterion("driverremark not between", value1, value2, "driverremark");
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