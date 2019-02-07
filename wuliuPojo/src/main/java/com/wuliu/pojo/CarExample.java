package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carid not between", value1, value2, "carid");
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

        public Criteria andCarnumEqualTo(String value) {
            addCriterion("carnum =", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotEqualTo(String value) {
            addCriterion("carnum <>", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThan(String value) {
            addCriterion("carnum >", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThanOrEqualTo(String value) {
            addCriterion("carnum >=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThan(String value) {
            addCriterion("carnum <", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThanOrEqualTo(String value) {
            addCriterion("carnum <=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLike(String value) {
            addCriterion("carnum like", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotLike(String value) {
            addCriterion("carnum not like", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumIn(List<String> values) {
            addCriterion("carnum in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotIn(List<String> values) {
            addCriterion("carnum not in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumBetween(String value1, String value2) {
            addCriterion("carnum between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotBetween(String value1, String value2) {
            addCriterion("carnum not between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumIsNull() {
            addCriterion("carrunnum is null");
            return (Criteria) this;
        }

        public Criteria andCarrunnumIsNotNull() {
            addCriterion("carrunnum is not null");
            return (Criteria) this;
        }

        public Criteria andCarrunnumEqualTo(String value) {
            addCriterion("carrunnum =", value, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumNotEqualTo(String value) {
            addCriterion("carrunnum <>", value, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumGreaterThan(String value) {
            addCriterion("carrunnum >", value, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumGreaterThanOrEqualTo(String value) {
            addCriterion("carrunnum >=", value, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumLessThan(String value) {
            addCriterion("carrunnum <", value, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumLessThanOrEqualTo(String value) {
            addCriterion("carrunnum <=", value, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumLike(String value) {
            addCriterion("carrunnum like", value, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumNotLike(String value) {
            addCriterion("carrunnum not like", value, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumIn(List<String> values) {
            addCriterion("carrunnum in", values, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumNotIn(List<String> values) {
            addCriterion("carrunnum not in", values, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumBetween(String value1, String value2) {
            addCriterion("carrunnum between", value1, value2, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCarrunnumNotBetween(String value1, String value2) {
            addCriterion("carrunnum not between", value1, value2, "carrunnum");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("cartype is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("cartype is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("cartype =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("cartype <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("cartype >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("cartype >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("cartype <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("cartype <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("cartype like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("cartype not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("cartype in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("cartype not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("cartype between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("cartype not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartunIsNull() {
            addCriterion("cartun is null");
            return (Criteria) this;
        }

        public Criteria andCartunIsNotNull() {
            addCriterion("cartun is not null");
            return (Criteria) this;
        }

        public Criteria andCartunEqualTo(Float value) {
            addCriterion("cartun =", value, "cartun");
            return (Criteria) this;
        }

        public Criteria andCartunNotEqualTo(Float value) {
            addCriterion("cartun <>", value, "cartun");
            return (Criteria) this;
        }

        public Criteria andCartunGreaterThan(Float value) {
            addCriterion("cartun >", value, "cartun");
            return (Criteria) this;
        }

        public Criteria andCartunGreaterThanOrEqualTo(Float value) {
            addCriterion("cartun >=", value, "cartun");
            return (Criteria) this;
        }

        public Criteria andCartunLessThan(Float value) {
            addCriterion("cartun <", value, "cartun");
            return (Criteria) this;
        }

        public Criteria andCartunLessThanOrEqualTo(Float value) {
            addCriterion("cartun <=", value, "cartun");
            return (Criteria) this;
        }

        public Criteria andCartunIn(List<Float> values) {
            addCriterion("cartun in", values, "cartun");
            return (Criteria) this;
        }

        public Criteria andCartunNotIn(List<Float> values) {
            addCriterion("cartun not in", values, "cartun");
            return (Criteria) this;
        }

        public Criteria andCartunBetween(Float value1, Float value2) {
            addCriterion("cartun between", value1, value2, "cartun");
            return (Criteria) this;
        }

        public Criteria andCartunNotBetween(Float value1, Float value2) {
            addCriterion("cartun not between", value1, value2, "cartun");
            return (Criteria) this;
        }

        public Criteria andCarboxIsNull() {
            addCriterion("carbox is null");
            return (Criteria) this;
        }

        public Criteria andCarboxIsNotNull() {
            addCriterion("carbox is not null");
            return (Criteria) this;
        }

        public Criteria andCarboxEqualTo(String value) {
            addCriterion("carbox =", value, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxNotEqualTo(String value) {
            addCriterion("carbox <>", value, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxGreaterThan(String value) {
            addCriterion("carbox >", value, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxGreaterThanOrEqualTo(String value) {
            addCriterion("carbox >=", value, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxLessThan(String value) {
            addCriterion("carbox <", value, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxLessThanOrEqualTo(String value) {
            addCriterion("carbox <=", value, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxLike(String value) {
            addCriterion("carbox like", value, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxNotLike(String value) {
            addCriterion("carbox not like", value, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxIn(List<String> values) {
            addCriterion("carbox in", values, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxNotIn(List<String> values) {
            addCriterion("carbox not in", values, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxBetween(String value1, String value2) {
            addCriterion("carbox between", value1, value2, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarboxNotBetween(String value1, String value2) {
            addCriterion("carbox not between", value1, value2, "carbox");
            return (Criteria) this;
        }

        public Criteria andCarriiIsNull() {
            addCriterion("carrii is null");
            return (Criteria) this;
        }

        public Criteria andCarriiIsNotNull() {
            addCriterion("carrii is not null");
            return (Criteria) this;
        }

        public Criteria andCarriiEqualTo(Float value) {
            addCriterion("carrii =", value, "carrii");
            return (Criteria) this;
        }

        public Criteria andCarriiNotEqualTo(Float value) {
            addCriterion("carrii <>", value, "carrii");
            return (Criteria) this;
        }

        public Criteria andCarriiGreaterThan(Float value) {
            addCriterion("carrii >", value, "carrii");
            return (Criteria) this;
        }

        public Criteria andCarriiGreaterThanOrEqualTo(Float value) {
            addCriterion("carrii >=", value, "carrii");
            return (Criteria) this;
        }

        public Criteria andCarriiLessThan(Float value) {
            addCriterion("carrii <", value, "carrii");
            return (Criteria) this;
        }

        public Criteria andCarriiLessThanOrEqualTo(Float value) {
            addCriterion("carrii <=", value, "carrii");
            return (Criteria) this;
        }

        public Criteria andCarriiIn(List<Float> values) {
            addCriterion("carrii in", values, "carrii");
            return (Criteria) this;
        }

        public Criteria andCarriiNotIn(List<Float> values) {
            addCriterion("carrii not in", values, "carrii");
            return (Criteria) this;
        }

        public Criteria andCarriiBetween(Float value1, Float value2) {
            addCriterion("carrii between", value1, value2, "carrii");
            return (Criteria) this;
        }

        public Criteria andCarriiNotBetween(Float value1, Float value2) {
            addCriterion("carrii not between", value1, value2, "carrii");
            return (Criteria) this;
        }

        public Criteria andCartimeIsNull() {
            addCriterion("cartime is null");
            return (Criteria) this;
        }

        public Criteria andCartimeIsNotNull() {
            addCriterion("cartime is not null");
            return (Criteria) this;
        }

        public Criteria andCartimeEqualTo(Date value) {
            addCriterionForJDBCDate("cartime =", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("cartime <>", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeGreaterThan(Date value) {
            addCriterionForJDBCDate("cartime >", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cartime >=", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeLessThan(Date value) {
            addCriterionForJDBCDate("cartime <", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cartime <=", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeIn(List<Date> values) {
            addCriterionForJDBCDate("cartime in", values, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("cartime not in", values, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cartime between", value1, value2, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cartime not between", value1, value2, "cartime");
            return (Criteria) this;
        }

        public Criteria andTimescIsNull() {
            addCriterion("timesc is null");
            return (Criteria) this;
        }

        public Criteria andTimescIsNotNull() {
            addCriterion("timesc is not null");
            return (Criteria) this;
        }

        public Criteria andTimescEqualTo(Date value) {
            addCriterionForJDBCDate("timesc =", value, "timesc");
            return (Criteria) this;
        }

        public Criteria andTimescNotEqualTo(Date value) {
            addCriterionForJDBCDate("timesc <>", value, "timesc");
            return (Criteria) this;
        }

        public Criteria andTimescGreaterThan(Date value) {
            addCriterionForJDBCDate("timesc >", value, "timesc");
            return (Criteria) this;
        }

        public Criteria andTimescGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("timesc >=", value, "timesc");
            return (Criteria) this;
        }

        public Criteria andTimescLessThan(Date value) {
            addCriterionForJDBCDate("timesc <", value, "timesc");
            return (Criteria) this;
        }

        public Criteria andTimescLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("timesc <=", value, "timesc");
            return (Criteria) this;
        }

        public Criteria andTimescIn(List<Date> values) {
            addCriterionForJDBCDate("timesc in", values, "timesc");
            return (Criteria) this;
        }

        public Criteria andTimescNotIn(List<Date> values) {
            addCriterionForJDBCDate("timesc not in", values, "timesc");
            return (Criteria) this;
        }

        public Criteria andTimescBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("timesc between", value1, value2, "timesc");
            return (Criteria) this;
        }

        public Criteria andTimescNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("timesc not between", value1, value2, "timesc");
            return (Criteria) this;
        }

        public Criteria andCarztIsNull() {
            addCriterion("carzt is null");
            return (Criteria) this;
        }

        public Criteria andCarztIsNotNull() {
            addCriterion("carzt is not null");
            return (Criteria) this;
        }

        public Criteria andCarztEqualTo(String value) {
            addCriterion("carzt =", value, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztNotEqualTo(String value) {
            addCriterion("carzt <>", value, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztGreaterThan(String value) {
            addCriterion("carzt >", value, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztGreaterThanOrEqualTo(String value) {
            addCriterion("carzt >=", value, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztLessThan(String value) {
            addCriterion("carzt <", value, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztLessThanOrEqualTo(String value) {
            addCriterion("carzt <=", value, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztLike(String value) {
            addCriterion("carzt like", value, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztNotLike(String value) {
            addCriterion("carzt not like", value, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztIn(List<String> values) {
            addCriterion("carzt in", values, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztNotIn(List<String> values) {
            addCriterion("carzt not in", values, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztBetween(String value1, String value2) {
            addCriterion("carzt between", value1, value2, "carzt");
            return (Criteria) this;
        }

        public Criteria andCarztNotBetween(String value1, String value2) {
            addCriterion("carzt not between", value1, value2, "carzt");
            return (Criteria) this;
        }

        public Criteria andPinpaiIsNull() {
            addCriterion("pinpai is null");
            return (Criteria) this;
        }

        public Criteria andPinpaiIsNotNull() {
            addCriterion("pinpai is not null");
            return (Criteria) this;
        }

        public Criteria andPinpaiEqualTo(String value) {
            addCriterion("pinpai =", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiNotEqualTo(String value) {
            addCriterion("pinpai <>", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiGreaterThan(String value) {
            addCriterion("pinpai >", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiGreaterThanOrEqualTo(String value) {
            addCriterion("pinpai >=", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiLessThan(String value) {
            addCriterion("pinpai <", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiLessThanOrEqualTo(String value) {
            addCriterion("pinpai <=", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiLike(String value) {
            addCriterion("pinpai like", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiNotLike(String value) {
            addCriterion("pinpai not like", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiIn(List<String> values) {
            addCriterion("pinpai in", values, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiNotIn(List<String> values) {
            addCriterion("pinpai not in", values, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiBetween(String value1, String value2) {
            addCriterion("pinpai between", value1, value2, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiNotBetween(String value1, String value2) {
            addCriterion("pinpai not between", value1, value2, "pinpai");
            return (Criteria) this;
        }

        public Criteria andFzyuangongIsNull() {
            addCriterion("fzyuangong is null");
            return (Criteria) this;
        }

        public Criteria andFzyuangongIsNotNull() {
            addCriterion("fzyuangong is not null");
            return (Criteria) this;
        }

        public Criteria andFzyuangongEqualTo(String value) {
            addCriterion("fzyuangong =", value, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongNotEqualTo(String value) {
            addCriterion("fzyuangong <>", value, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongGreaterThan(String value) {
            addCriterion("fzyuangong >", value, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongGreaterThanOrEqualTo(String value) {
            addCriterion("fzyuangong >=", value, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongLessThan(String value) {
            addCriterion("fzyuangong <", value, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongLessThanOrEqualTo(String value) {
            addCriterion("fzyuangong <=", value, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongLike(String value) {
            addCriterion("fzyuangong like", value, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongNotLike(String value) {
            addCriterion("fzyuangong not like", value, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongIn(List<String> values) {
            addCriterion("fzyuangong in", values, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongNotIn(List<String> values) {
            addCriterion("fzyuangong not in", values, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongBetween(String value1, String value2) {
            addCriterion("fzyuangong between", value1, value2, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andFzyuangongNotBetween(String value1, String value2) {
            addCriterion("fzyuangong not between", value1, value2, "fzyuangong");
            return (Criteria) this;
        }

        public Criteria andCareunpathIsNull() {
            addCriterion("careunpath is null");
            return (Criteria) this;
        }

        public Criteria andCareunpathIsNotNull() {
            addCriterion("careunpath is not null");
            return (Criteria) this;
        }

        public Criteria andCareunpathEqualTo(String value) {
            addCriterion("careunpath =", value, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathNotEqualTo(String value) {
            addCriterion("careunpath <>", value, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathGreaterThan(String value) {
            addCriterion("careunpath >", value, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathGreaterThanOrEqualTo(String value) {
            addCriterion("careunpath >=", value, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathLessThan(String value) {
            addCriterion("careunpath <", value, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathLessThanOrEqualTo(String value) {
            addCriterion("careunpath <=", value, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathLike(String value) {
            addCriterion("careunpath like", value, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathNotLike(String value) {
            addCriterion("careunpath not like", value, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathIn(List<String> values) {
            addCriterion("careunpath in", values, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathNotIn(List<String> values) {
            addCriterion("careunpath not in", values, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathBetween(String value1, String value2) {
            addCriterion("careunpath between", value1, value2, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCareunpathNotBetween(String value1, String value2) {
            addCriterion("careunpath not between", value1, value2, "careunpath");
            return (Criteria) this;
        }

        public Criteria andCarsayIsNull() {
            addCriterion("carsay is null");
            return (Criteria) this;
        }

        public Criteria andCarsayIsNotNull() {
            addCriterion("carsay is not null");
            return (Criteria) this;
        }

        public Criteria andCarsayEqualTo(String value) {
            addCriterion("carsay =", value, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayNotEqualTo(String value) {
            addCriterion("carsay <>", value, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayGreaterThan(String value) {
            addCriterion("carsay >", value, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayGreaterThanOrEqualTo(String value) {
            addCriterion("carsay >=", value, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayLessThan(String value) {
            addCriterion("carsay <", value, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayLessThanOrEqualTo(String value) {
            addCriterion("carsay <=", value, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayLike(String value) {
            addCriterion("carsay like", value, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayNotLike(String value) {
            addCriterion("carsay not like", value, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayIn(List<String> values) {
            addCriterion("carsay in", values, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayNotIn(List<String> values) {
            addCriterion("carsay not in", values, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayBetween(String value1, String value2) {
            addCriterion("carsay between", value1, value2, "carsay");
            return (Criteria) this;
        }

        public Criteria andCarsayNotBetween(String value1, String value2) {
            addCriterion("carsay not between", value1, value2, "carsay");
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