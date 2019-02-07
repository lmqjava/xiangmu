package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientExample() {
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

        public Criteria andClientidIsNull() {
            addCriterion("clientid is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientid is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(Integer value) {
            addCriterion("clientid =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(Integer value) {
            addCriterion("clientid <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(Integer value) {
            addCriterion("clientid >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientid >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(Integer value) {
            addCriterion("clientid <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(Integer value) {
            addCriterion("clientid <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<Integer> values) {
            addCriterion("clientid in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<Integer> values) {
            addCriterion("clientid not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(Integer value1, Integer value2) {
            addCriterion("clientid between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(Integer value1, Integer value2) {
            addCriterion("clientid not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientusernameIsNull() {
            addCriterion("clientusername is null");
            return (Criteria) this;
        }

        public Criteria andClientusernameIsNotNull() {
            addCriterion("clientusername is not null");
            return (Criteria) this;
        }

        public Criteria andClientusernameEqualTo(String value) {
            addCriterion("clientusername =", value, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameNotEqualTo(String value) {
            addCriterion("clientusername <>", value, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameGreaterThan(String value) {
            addCriterion("clientusername >", value, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameGreaterThanOrEqualTo(String value) {
            addCriterion("clientusername >=", value, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameLessThan(String value) {
            addCriterion("clientusername <", value, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameLessThanOrEqualTo(String value) {
            addCriterion("clientusername <=", value, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameLike(String value) {
            addCriterion("clientusername like", value, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameNotLike(String value) {
            addCriterion("clientusername not like", value, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameIn(List<String> values) {
            addCriterion("clientusername in", values, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameNotIn(List<String> values) {
            addCriterion("clientusername not in", values, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameBetween(String value1, String value2) {
            addCriterion("clientusername between", value1, value2, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientusernameNotBetween(String value1, String value2) {
            addCriterion("clientusername not between", value1, value2, "clientusername");
            return (Criteria) this;
        }

        public Criteria andClientaddressIsNull() {
            addCriterion("clientaddress is null");
            return (Criteria) this;
        }

        public Criteria andClientaddressIsNotNull() {
            addCriterion("clientaddress is not null");
            return (Criteria) this;
        }

        public Criteria andClientaddressEqualTo(String value) {
            addCriterion("clientaddress =", value, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressNotEqualTo(String value) {
            addCriterion("clientaddress <>", value, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressGreaterThan(String value) {
            addCriterion("clientaddress >", value, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressGreaterThanOrEqualTo(String value) {
            addCriterion("clientaddress >=", value, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressLessThan(String value) {
            addCriterion("clientaddress <", value, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressLessThanOrEqualTo(String value) {
            addCriterion("clientaddress <=", value, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressLike(String value) {
            addCriterion("clientaddress like", value, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressNotLike(String value) {
            addCriterion("clientaddress not like", value, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressIn(List<String> values) {
            addCriterion("clientaddress in", values, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressNotIn(List<String> values) {
            addCriterion("clientaddress not in", values, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressBetween(String value1, String value2) {
            addCriterion("clientaddress between", value1, value2, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientaddressNotBetween(String value1, String value2) {
            addCriterion("clientaddress not between", value1, value2, "clientaddress");
            return (Criteria) this;
        }

        public Criteria andClientphoneIsNull() {
            addCriterion("clientphone is null");
            return (Criteria) this;
        }

        public Criteria andClientphoneIsNotNull() {
            addCriterion("clientphone is not null");
            return (Criteria) this;
        }

        public Criteria andClientphoneEqualTo(String value) {
            addCriterion("clientphone =", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneNotEqualTo(String value) {
            addCriterion("clientphone <>", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneGreaterThan(String value) {
            addCriterion("clientphone >", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneGreaterThanOrEqualTo(String value) {
            addCriterion("clientphone >=", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneLessThan(String value) {
            addCriterion("clientphone <", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneLessThanOrEqualTo(String value) {
            addCriterion("clientphone <=", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneLike(String value) {
            addCriterion("clientphone like", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneNotLike(String value) {
            addCriterion("clientphone not like", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneIn(List<String> values) {
            addCriterion("clientphone in", values, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneNotIn(List<String> values) {
            addCriterion("clientphone not in", values, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneBetween(String value1, String value2) {
            addCriterion("clientphone between", value1, value2, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneNotBetween(String value1, String value2) {
            addCriterion("clientphone not between", value1, value2, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientemailIsNull() {
            addCriterion("clientemail is null");
            return (Criteria) this;
        }

        public Criteria andClientemailIsNotNull() {
            addCriterion("clientemail is not null");
            return (Criteria) this;
        }

        public Criteria andClientemailEqualTo(String value) {
            addCriterion("clientemail =", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailNotEqualTo(String value) {
            addCriterion("clientemail <>", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailGreaterThan(String value) {
            addCriterion("clientemail >", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailGreaterThanOrEqualTo(String value) {
            addCriterion("clientemail >=", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailLessThan(String value) {
            addCriterion("clientemail <", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailLessThanOrEqualTo(String value) {
            addCriterion("clientemail <=", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailLike(String value) {
            addCriterion("clientemail like", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailNotLike(String value) {
            addCriterion("clientemail not like", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailIn(List<String> values) {
            addCriterion("clientemail in", values, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailNotIn(List<String> values) {
            addCriterion("clientemail not in", values, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailBetween(String value1, String value2) {
            addCriterion("clientemail between", value1, value2, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailNotBetween(String value1, String value2) {
            addCriterion("clientemail not between", value1, value2, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientpasswordIsNull() {
            addCriterion("clientpassword is null");
            return (Criteria) this;
        }

        public Criteria andClientpasswordIsNotNull() {
            addCriterion("clientpassword is not null");
            return (Criteria) this;
        }

        public Criteria andClientpasswordEqualTo(String value) {
            addCriterion("clientpassword =", value, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordNotEqualTo(String value) {
            addCriterion("clientpassword <>", value, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordGreaterThan(String value) {
            addCriterion("clientpassword >", value, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("clientpassword >=", value, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordLessThan(String value) {
            addCriterion("clientpassword <", value, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordLessThanOrEqualTo(String value) {
            addCriterion("clientpassword <=", value, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordLike(String value) {
            addCriterion("clientpassword like", value, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordNotLike(String value) {
            addCriterion("clientpassword not like", value, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordIn(List<String> values) {
            addCriterion("clientpassword in", values, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordNotIn(List<String> values) {
            addCriterion("clientpassword not in", values, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordBetween(String value1, String value2) {
            addCriterion("clientpassword between", value1, value2, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordNotBetween(String value1, String value2) {
            addCriterion("clientpassword not between", value1, value2, "clientpassword");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionIsNull() {
            addCriterion("clientpasswordquestion is null");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionIsNotNull() {
            addCriterion("clientpasswordquestion is not null");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionEqualTo(String value) {
            addCriterion("clientpasswordquestion =", value, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionNotEqualTo(String value) {
            addCriterion("clientpasswordquestion <>", value, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionGreaterThan(String value) {
            addCriterion("clientpasswordquestion >", value, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionGreaterThanOrEqualTo(String value) {
            addCriterion("clientpasswordquestion >=", value, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionLessThan(String value) {
            addCriterion("clientpasswordquestion <", value, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionLessThanOrEqualTo(String value) {
            addCriterion("clientpasswordquestion <=", value, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionLike(String value) {
            addCriterion("clientpasswordquestion like", value, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionNotLike(String value) {
            addCriterion("clientpasswordquestion not like", value, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionIn(List<String> values) {
            addCriterion("clientpasswordquestion in", values, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionNotIn(List<String> values) {
            addCriterion("clientpasswordquestion not in", values, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionBetween(String value1, String value2) {
            addCriterion("clientpasswordquestion between", value1, value2, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordquestionNotBetween(String value1, String value2) {
            addCriterion("clientpasswordquestion not between", value1, value2, "clientpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerIsNull() {
            addCriterion("clientpasswordanswer is null");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerIsNotNull() {
            addCriterion("clientpasswordanswer is not null");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerEqualTo(String value) {
            addCriterion("clientpasswordanswer =", value, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerNotEqualTo(String value) {
            addCriterion("clientpasswordanswer <>", value, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerGreaterThan(String value) {
            addCriterion("clientpasswordanswer >", value, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerGreaterThanOrEqualTo(String value) {
            addCriterion("clientpasswordanswer >=", value, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerLessThan(String value) {
            addCriterion("clientpasswordanswer <", value, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerLessThanOrEqualTo(String value) {
            addCriterion("clientpasswordanswer <=", value, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerLike(String value) {
            addCriterion("clientpasswordanswer like", value, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerNotLike(String value) {
            addCriterion("clientpasswordanswer not like", value, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerIn(List<String> values) {
            addCriterion("clientpasswordanswer in", values, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerNotIn(List<String> values) {
            addCriterion("clientpasswordanswer not in", values, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerBetween(String value1, String value2) {
            addCriterion("clientpasswordanswer between", value1, value2, "clientpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andClientpasswordanswerNotBetween(String value1, String value2) {
            addCriterion("clientpasswordanswer not between", value1, value2, "clientpasswordanswer");
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