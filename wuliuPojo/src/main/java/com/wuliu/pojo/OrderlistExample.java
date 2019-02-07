package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlistExample() {
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

        public Criteria andOrderliststatusIsNull() {
            addCriterion("orderliststatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusIsNotNull() {
            addCriterion("orderliststatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusEqualTo(String value) {
            addCriterion("orderliststatus =", value, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusNotEqualTo(String value) {
            addCriterion("orderliststatus <>", value, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusGreaterThan(String value) {
            addCriterion("orderliststatus >", value, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderliststatus >=", value, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusLessThan(String value) {
            addCriterion("orderliststatus <", value, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusLessThanOrEqualTo(String value) {
            addCriterion("orderliststatus <=", value, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusLike(String value) {
            addCriterion("orderliststatus like", value, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusNotLike(String value) {
            addCriterion("orderliststatus not like", value, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusIn(List<String> values) {
            addCriterion("orderliststatus in", values, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusNotIn(List<String> values) {
            addCriterion("orderliststatus not in", values, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusBetween(String value1, String value2) {
            addCriterion("orderliststatus between", value1, value2, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andOrderliststatusNotBetween(String value1, String value2) {
            addCriterion("orderliststatus not between", value1, value2, "orderliststatus");
            return (Criteria) this;
        }

        public Criteria andStartstationidIsNull() {
            addCriterion("startstationid is null");
            return (Criteria) this;
        }

        public Criteria andStartstationidIsNotNull() {
            addCriterion("startstationid is not null");
            return (Criteria) this;
        }

        public Criteria andStartstationidEqualTo(String value) {
            addCriterion("startstationid =", value, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidNotEqualTo(String value) {
            addCriterion("startstationid <>", value, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidGreaterThan(String value) {
            addCriterion("startstationid >", value, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidGreaterThanOrEqualTo(String value) {
            addCriterion("startstationid >=", value, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidLessThan(String value) {
            addCriterion("startstationid <", value, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidLessThanOrEqualTo(String value) {
            addCriterion("startstationid <=", value, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidLike(String value) {
            addCriterion("startstationid like", value, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidNotLike(String value) {
            addCriterion("startstationid not like", value, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidIn(List<String> values) {
            addCriterion("startstationid in", values, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidNotIn(List<String> values) {
            addCriterion("startstationid not in", values, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidBetween(String value1, String value2) {
            addCriterion("startstationid between", value1, value2, "startstationid");
            return (Criteria) this;
        }

        public Criteria andStartstationidNotBetween(String value1, String value2) {
            addCriterion("startstationid not between", value1, value2, "startstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidIsNull() {
            addCriterion("endstationid is null");
            return (Criteria) this;
        }

        public Criteria andEndstationidIsNotNull() {
            addCriterion("endstationid is not null");
            return (Criteria) this;
        }

        public Criteria andEndstationidEqualTo(String value) {
            addCriterion("endstationid =", value, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidNotEqualTo(String value) {
            addCriterion("endstationid <>", value, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidGreaterThan(String value) {
            addCriterion("endstationid >", value, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidGreaterThanOrEqualTo(String value) {
            addCriterion("endstationid >=", value, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidLessThan(String value) {
            addCriterion("endstationid <", value, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidLessThanOrEqualTo(String value) {
            addCriterion("endstationid <=", value, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidLike(String value) {
            addCriterion("endstationid like", value, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidNotLike(String value) {
            addCriterion("endstationid not like", value, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidIn(List<String> values) {
            addCriterion("endstationid in", values, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidNotIn(List<String> values) {
            addCriterion("endstationid not in", values, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidBetween(String value1, String value2) {
            addCriterion("endstationid between", value1, value2, "endstationid");
            return (Criteria) this;
        }

        public Criteria andEndstationidNotBetween(String value1, String value2) {
            addCriterion("endstationid not between", value1, value2, "endstationid");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightIsNull() {
            addCriterion("orderlistweight is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightIsNotNull() {
            addCriterion("orderlistweight is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightEqualTo(Float value) {
            addCriterion("orderlistweight =", value, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightNotEqualTo(Float value) {
            addCriterion("orderlistweight <>", value, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightGreaterThan(Float value) {
            addCriterion("orderlistweight >", value, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightGreaterThanOrEqualTo(Float value) {
            addCriterion("orderlistweight >=", value, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightLessThan(Float value) {
            addCriterion("orderlistweight <", value, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightLessThanOrEqualTo(Float value) {
            addCriterion("orderlistweight <=", value, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightIn(List<Float> values) {
            addCriterion("orderlistweight in", values, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightNotIn(List<Float> values) {
            addCriterion("orderlistweight not in", values, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightBetween(Float value1, Float value2) {
            addCriterion("orderlistweight between", value1, value2, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistweightNotBetween(Float value1, Float value2) {
            addCriterion("orderlistweight not between", value1, value2, "orderlistweight");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeIsNull() {
            addCriterion("orderlistvolume is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeIsNotNull() {
            addCriterion("orderlistvolume is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeEqualTo(Float value) {
            addCriterion("orderlistvolume =", value, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeNotEqualTo(Float value) {
            addCriterion("orderlistvolume <>", value, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeGreaterThan(Float value) {
            addCriterion("orderlistvolume >", value, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("orderlistvolume >=", value, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeLessThan(Float value) {
            addCriterion("orderlistvolume <", value, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeLessThanOrEqualTo(Float value) {
            addCriterion("orderlistvolume <=", value, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeIn(List<Float> values) {
            addCriterion("orderlistvolume in", values, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeNotIn(List<Float> values) {
            addCriterion("orderlistvolume not in", values, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeBetween(Float value1, Float value2) {
            addCriterion("orderlistvolume between", value1, value2, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistvolumeNotBetween(Float value1, Float value2) {
            addCriterion("orderlistvolume not between", value1, value2, "orderlistvolume");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceIsNull() {
            addCriterion("orderlistdeliverprice is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceIsNotNull() {
            addCriterion("orderlistdeliverprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceEqualTo(Float value) {
            addCriterion("orderlistdeliverprice =", value, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceNotEqualTo(Float value) {
            addCriterion("orderlistdeliverprice <>", value, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceGreaterThan(Float value) {
            addCriterion("orderlistdeliverprice >", value, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("orderlistdeliverprice >=", value, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceLessThan(Float value) {
            addCriterion("orderlistdeliverprice <", value, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceLessThanOrEqualTo(Float value) {
            addCriterion("orderlistdeliverprice <=", value, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceIn(List<Float> values) {
            addCriterion("orderlistdeliverprice in", values, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceNotIn(List<Float> values) {
            addCriterion("orderlistdeliverprice not in", values, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceBetween(Float value1, Float value2) {
            addCriterion("orderlistdeliverprice between", value1, value2, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdeliverpriceNotBetween(Float value1, Float value2) {
            addCriterion("orderlistdeliverprice not between", value1, value2, "orderlistdeliverprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceIsNull() {
            addCriterion("orderlistdispatchprice is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceIsNotNull() {
            addCriterion("orderlistdispatchprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceEqualTo(Float value) {
            addCriterion("orderlistdispatchprice =", value, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceNotEqualTo(Float value) {
            addCriterion("orderlistdispatchprice <>", value, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceGreaterThan(Float value) {
            addCriterion("orderlistdispatchprice >", value, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("orderlistdispatchprice >=", value, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceLessThan(Float value) {
            addCriterion("orderlistdispatchprice <", value, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceLessThanOrEqualTo(Float value) {
            addCriterion("orderlistdispatchprice <=", value, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceIn(List<Float> values) {
            addCriterion("orderlistdispatchprice in", values, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceNotIn(List<Float> values) {
            addCriterion("orderlistdispatchprice not in", values, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceBetween(Float value1, Float value2) {
            addCriterion("orderlistdispatchprice between", value1, value2, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdispatchpriceNotBetween(Float value1, Float value2) {
            addCriterion("orderlistdispatchprice not between", value1, value2, "orderlistdispatchprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceIsNull() {
            addCriterion("orderlistassuretprice is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceIsNotNull() {
            addCriterion("orderlistassuretprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceEqualTo(Float value) {
            addCriterion("orderlistassuretprice =", value, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceNotEqualTo(Float value) {
            addCriterion("orderlistassuretprice <>", value, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceGreaterThan(Float value) {
            addCriterion("orderlistassuretprice >", value, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("orderlistassuretprice >=", value, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceLessThan(Float value) {
            addCriterion("orderlistassuretprice <", value, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceLessThanOrEqualTo(Float value) {
            addCriterion("orderlistassuretprice <=", value, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceIn(List<Float> values) {
            addCriterion("orderlistassuretprice in", values, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceNotIn(List<Float> values) {
            addCriterion("orderlistassuretprice not in", values, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceBetween(Float value1, Float value2) {
            addCriterion("orderlistassuretprice between", value1, value2, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassuretpriceNotBetween(Float value1, Float value2) {
            addCriterion("orderlistassuretprice not between", value1, value2, "orderlistassuretprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueIsNull() {
            addCriterion("OrderlistAssureValue is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueIsNotNull() {
            addCriterion("OrderlistAssureValue is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueEqualTo(Float value) {
            addCriterion("OrderlistAssureValue =", value, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueNotEqualTo(Float value) {
            addCriterion("OrderlistAssureValue <>", value, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueGreaterThan(Float value) {
            addCriterion("OrderlistAssureValue >", value, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueGreaterThanOrEqualTo(Float value) {
            addCriterion("OrderlistAssureValue >=", value, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueLessThan(Float value) {
            addCriterion("OrderlistAssureValue <", value, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueLessThanOrEqualTo(Float value) {
            addCriterion("OrderlistAssureValue <=", value, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueIn(List<Float> values) {
            addCriterion("OrderlistAssureValue in", values, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueNotIn(List<Float> values) {
            addCriterion("OrderlistAssureValue not in", values, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueBetween(Float value1, Float value2) {
            addCriterion("OrderlistAssureValue between", value1, value2, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurevalueNotBetween(Float value1, Float value2) {
            addCriterion("OrderlistAssureValue not between", value1, value2, "orderlistassurevalue");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceIsNull() {
            addCriterion("OrderlistAssurePrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceIsNotNull() {
            addCriterion("OrderlistAssurePrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceEqualTo(Float value) {
            addCriterion("OrderlistAssurePrice =", value, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceNotEqualTo(Float value) {
            addCriterion("OrderlistAssurePrice <>", value, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceGreaterThan(Float value) {
            addCriterion("OrderlistAssurePrice >", value, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("OrderlistAssurePrice >=", value, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceLessThan(Float value) {
            addCriterion("OrderlistAssurePrice <", value, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceLessThanOrEqualTo(Float value) {
            addCriterion("OrderlistAssurePrice <=", value, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceIn(List<Float> values) {
            addCriterion("OrderlistAssurePrice in", values, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceNotIn(List<Float> values) {
            addCriterion("OrderlistAssurePrice not in", values, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceBetween(Float value1, Float value2) {
            addCriterion("OrderlistAssurePrice between", value1, value2, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistassurepriceNotBetween(Float value1, Float value2) {
            addCriterion("OrderlistAssurePrice not between", value1, value2, "orderlistassureprice");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateIsNull() {
            addCriterion("OrderlistDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateIsNotNull() {
            addCriterion("OrderlistDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateEqualTo(Date value) {
            addCriterionForJDBCDate("OrderlistDate =", value, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OrderlistDate <>", value, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OrderlistDate >", value, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OrderlistDate >=", value, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateLessThan(Date value) {
            addCriterionForJDBCDate("OrderlistDate <", value, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OrderlistDate <=", value, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateIn(List<Date> values) {
            addCriterionForJDBCDate("OrderlistDate in", values, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OrderlistDate not in", values, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OrderlistDate between", value1, value2, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OrderlistDate not between", value1, value2, "orderlistdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameIsNull() {
            addCriterion("OrderlistReceiverName is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameIsNotNull() {
            addCriterion("OrderlistReceiverName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameEqualTo(String value) {
            addCriterion("OrderlistReceiverName =", value, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameNotEqualTo(String value) {
            addCriterion("OrderlistReceiverName <>", value, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameGreaterThan(String value) {
            addCriterion("OrderlistReceiverName >", value, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverName >=", value, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameLessThan(String value) {
            addCriterion("OrderlistReceiverName <", value, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameLessThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverName <=", value, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameLike(String value) {
            addCriterion("OrderlistReceiverName like", value, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameNotLike(String value) {
            addCriterion("OrderlistReceiverName not like", value, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameIn(List<String> values) {
            addCriterion("OrderlistReceiverName in", values, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameNotIn(List<String> values) {
            addCriterion("OrderlistReceiverName not in", values, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverName between", value1, value2, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivernameNotBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverName not between", value1, value2, "orderlistreceivername");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneIsNull() {
            addCriterion("OrderlistReceiverPhone is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneIsNotNull() {
            addCriterion("OrderlistReceiverPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneEqualTo(String value) {
            addCriterion("OrderlistReceiverPhone =", value, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneNotEqualTo(String value) {
            addCriterion("OrderlistReceiverPhone <>", value, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneGreaterThan(String value) {
            addCriterion("OrderlistReceiverPhone >", value, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverPhone >=", value, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneLessThan(String value) {
            addCriterion("OrderlistReceiverPhone <", value, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneLessThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverPhone <=", value, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneLike(String value) {
            addCriterion("OrderlistReceiverPhone like", value, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneNotLike(String value) {
            addCriterion("OrderlistReceiverPhone not like", value, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneIn(List<String> values) {
            addCriterion("OrderlistReceiverPhone in", values, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneNotIn(List<String> values) {
            addCriterion("OrderlistReceiverPhone not in", values, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverPhone between", value1, value2, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverphoneNotBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverPhone not between", value1, value2, "orderlistreceiverphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilIsNull() {
            addCriterion("OrderlistReceiverMobil is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilIsNotNull() {
            addCriterion("OrderlistReceiverMobil is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilEqualTo(String value) {
            addCriterion("OrderlistReceiverMobil =", value, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilNotEqualTo(String value) {
            addCriterion("OrderlistReceiverMobil <>", value, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilGreaterThan(String value) {
            addCriterion("OrderlistReceiverMobil >", value, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverMobil >=", value, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilLessThan(String value) {
            addCriterion("OrderlistReceiverMobil <", value, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilLessThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverMobil <=", value, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilLike(String value) {
            addCriterion("OrderlistReceiverMobil like", value, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilNotLike(String value) {
            addCriterion("OrderlistReceiverMobil not like", value, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilIn(List<String> values) {
            addCriterion("OrderlistReceiverMobil in", values, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilNotIn(List<String> values) {
            addCriterion("OrderlistReceiverMobil not in", values, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverMobil between", value1, value2, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceivermobilNotBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverMobil not between", value1, value2, "orderlistreceivermobil");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressIsNull() {
            addCriterion("OrderlistReceiverAddress is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressIsNotNull() {
            addCriterion("OrderlistReceiverAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressEqualTo(String value) {
            addCriterion("OrderlistReceiverAddress =", value, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressNotEqualTo(String value) {
            addCriterion("OrderlistReceiverAddress <>", value, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressGreaterThan(String value) {
            addCriterion("OrderlistReceiverAddress >", value, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverAddress >=", value, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressLessThan(String value) {
            addCriterion("OrderlistReceiverAddress <", value, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressLessThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverAddress <=", value, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressLike(String value) {
            addCriterion("OrderlistReceiverAddress like", value, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressNotLike(String value) {
            addCriterion("OrderlistReceiverAddress not like", value, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressIn(List<String> values) {
            addCriterion("OrderlistReceiverAddress in", values, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressNotIn(List<String> values) {
            addCriterion("OrderlistReceiverAddress not in", values, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverAddress between", value1, value2, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiveraddressNotBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverAddress not between", value1, value2, "orderlistreceiveraddress");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcIsNull() {
            addCriterion("OrderlistReceiverPostC is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcIsNotNull() {
            addCriterion("OrderlistReceiverPostC is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcEqualTo(String value) {
            addCriterion("OrderlistReceiverPostC =", value, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcNotEqualTo(String value) {
            addCriterion("OrderlistReceiverPostC <>", value, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcGreaterThan(String value) {
            addCriterion("OrderlistReceiverPostC >", value, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverPostC >=", value, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcLessThan(String value) {
            addCriterion("OrderlistReceiverPostC <", value, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcLessThanOrEqualTo(String value) {
            addCriterion("OrderlistReceiverPostC <=", value, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcLike(String value) {
            addCriterion("OrderlistReceiverPostC like", value, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcNotLike(String value) {
            addCriterion("OrderlistReceiverPostC not like", value, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcIn(List<String> values) {
            addCriterion("OrderlistReceiverPostC in", values, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcNotIn(List<String> values) {
            addCriterion("OrderlistReceiverPostC not in", values, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverPostC between", value1, value2, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistreceiverpostcNotBetween(String value1, String value2) {
            addCriterion("OrderlistReceiverPostC not between", value1, value2, "orderlistreceiverpostc");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameIsNull() {
            addCriterion("OrderlistSenderName is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameIsNotNull() {
            addCriterion("OrderlistSenderName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameEqualTo(String value) {
            addCriterion("OrderlistSenderName =", value, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameNotEqualTo(String value) {
            addCriterion("OrderlistSenderName <>", value, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameGreaterThan(String value) {
            addCriterion("OrderlistSenderName >", value, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderName >=", value, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameLessThan(String value) {
            addCriterion("OrderlistSenderName <", value, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameLessThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderName <=", value, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameLike(String value) {
            addCriterion("OrderlistSenderName like", value, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameNotLike(String value) {
            addCriterion("OrderlistSenderName not like", value, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameIn(List<String> values) {
            addCriterion("OrderlistSenderName in", values, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameNotIn(List<String> values) {
            addCriterion("OrderlistSenderName not in", values, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameBetween(String value1, String value2) {
            addCriterion("OrderlistSenderName between", value1, value2, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsendernameNotBetween(String value1, String value2) {
            addCriterion("OrderlistSenderName not between", value1, value2, "orderlistsendername");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxIsNull() {
            addCriterion("OrderlistSenderFax is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxIsNotNull() {
            addCriterion("OrderlistSenderFax is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxEqualTo(String value) {
            addCriterion("OrderlistSenderFax =", value, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxNotEqualTo(String value) {
            addCriterion("OrderlistSenderFax <>", value, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxGreaterThan(String value) {
            addCriterion("OrderlistSenderFax >", value, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderFax >=", value, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxLessThan(String value) {
            addCriterion("OrderlistSenderFax <", value, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxLessThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderFax <=", value, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxLike(String value) {
            addCriterion("OrderlistSenderFax like", value, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxNotLike(String value) {
            addCriterion("OrderlistSenderFax not like", value, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxIn(List<String> values) {
            addCriterion("OrderlistSenderFax in", values, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxNotIn(List<String> values) {
            addCriterion("OrderlistSenderFax not in", values, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxBetween(String value1, String value2) {
            addCriterion("OrderlistSenderFax between", value1, value2, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderfaxNotBetween(String value1, String value2) {
            addCriterion("OrderlistSenderFax not between", value1, value2, "orderlistsenderfax");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeIsNull() {
            addCriterion("OrderlistSenderPostCode is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeIsNotNull() {
            addCriterion("OrderlistSenderPostCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeEqualTo(String value) {
            addCriterion("OrderlistSenderPostCode =", value, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeNotEqualTo(String value) {
            addCriterion("OrderlistSenderPostCode <>", value, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeGreaterThan(String value) {
            addCriterion("OrderlistSenderPostCode >", value, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderPostCode >=", value, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeLessThan(String value) {
            addCriterion("OrderlistSenderPostCode <", value, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeLessThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderPostCode <=", value, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeLike(String value) {
            addCriterion("OrderlistSenderPostCode like", value, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeNotLike(String value) {
            addCriterion("OrderlistSenderPostCode not like", value, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeIn(List<String> values) {
            addCriterion("OrderlistSenderPostCode in", values, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeNotIn(List<String> values) {
            addCriterion("OrderlistSenderPostCode not in", values, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeBetween(String value1, String value2) {
            addCriterion("OrderlistSenderPostCode between", value1, value2, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderpostcodeNotBetween(String value1, String value2) {
            addCriterion("OrderlistSenderPostCode not between", value1, value2, "orderlistsenderpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneIsNull() {
            addCriterion("OrderlistSenderPhone is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneIsNotNull() {
            addCriterion("OrderlistSenderPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneEqualTo(String value) {
            addCriterion("OrderlistSenderPhone =", value, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneNotEqualTo(String value) {
            addCriterion("OrderlistSenderPhone <>", value, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneGreaterThan(String value) {
            addCriterion("OrderlistSenderPhone >", value, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderPhone >=", value, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneLessThan(String value) {
            addCriterion("OrderlistSenderPhone <", value, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneLessThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderPhone <=", value, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneLike(String value) {
            addCriterion("OrderlistSenderPhone like", value, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneNotLike(String value) {
            addCriterion("OrderlistSenderPhone not like", value, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneIn(List<String> values) {
            addCriterion("OrderlistSenderPhone in", values, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneNotIn(List<String> values) {
            addCriterion("OrderlistSenderPhone not in", values, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneBetween(String value1, String value2) {
            addCriterion("OrderlistSenderPhone between", value1, value2, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderphoneNotBetween(String value1, String value2) {
            addCriterion("OrderlistSenderPhone not between", value1, value2, "orderlistsenderphone");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailIsNull() {
            addCriterion("OrderlistSenderEmail is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailIsNotNull() {
            addCriterion("OrderlistSenderEmail is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailEqualTo(String value) {
            addCriterion("OrderlistSenderEmail =", value, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailNotEqualTo(String value) {
            addCriterion("OrderlistSenderEmail <>", value, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailGreaterThan(String value) {
            addCriterion("OrderlistSenderEmail >", value, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderEmail >=", value, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailLessThan(String value) {
            addCriterion("OrderlistSenderEmail <", value, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailLessThanOrEqualTo(String value) {
            addCriterion("OrderlistSenderEmail <=", value, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailLike(String value) {
            addCriterion("OrderlistSenderEmail like", value, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailNotLike(String value) {
            addCriterion("OrderlistSenderEmail not like", value, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailIn(List<String> values) {
            addCriterion("OrderlistSenderEmail in", values, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailNotIn(List<String> values) {
            addCriterion("OrderlistSenderEmail not in", values, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailBetween(String value1, String value2) {
            addCriterion("OrderlistSenderEmail between", value1, value2, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderlistsenderemailNotBetween(String value1, String value2) {
            addCriterion("OrderlistSenderEmail not between", value1, value2, "orderlistsenderemail");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateIsNull() {
            addCriterion("OrderRequestDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateIsNotNull() {
            addCriterion("OrderRequestDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateEqualTo(Date value) {
            addCriterionForJDBCDate("OrderRequestDate =", value, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OrderRequestDate <>", value, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OrderRequestDate >", value, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OrderRequestDate >=", value, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateLessThan(Date value) {
            addCriterionForJDBCDate("OrderRequestDate <", value, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OrderRequestDate <=", value, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateIn(List<Date> values) {
            addCriterionForJDBCDate("OrderRequestDate in", values, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OrderRequestDate not in", values, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OrderRequestDate between", value1, value2, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderrequestdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OrderRequestDate not between", value1, value2, "orderrequestdate");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkIsNull() {
            addCriterion("OrderlistRemark is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkIsNotNull() {
            addCriterion("OrderlistRemark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkEqualTo(String value) {
            addCriterion("OrderlistRemark =", value, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkNotEqualTo(String value) {
            addCriterion("OrderlistRemark <>", value, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkGreaterThan(String value) {
            addCriterion("OrderlistRemark >", value, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkGreaterThanOrEqualTo(String value) {
            addCriterion("OrderlistRemark >=", value, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkLessThan(String value) {
            addCriterion("OrderlistRemark <", value, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkLessThanOrEqualTo(String value) {
            addCriterion("OrderlistRemark <=", value, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkLike(String value) {
            addCriterion("OrderlistRemark like", value, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkNotLike(String value) {
            addCriterion("OrderlistRemark not like", value, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkIn(List<String> values) {
            addCriterion("OrderlistRemark in", values, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkNotIn(List<String> values) {
            addCriterion("OrderlistRemark not in", values, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkBetween(String value1, String value2) {
            addCriterion("OrderlistRemark between", value1, value2, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistremarkNotBetween(String value1, String value2) {
            addCriterion("OrderlistRemark not between", value1, value2, "orderlistremark");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeIsNull() {
            addCriterion("OrderlistIdentifyCode is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeIsNotNull() {
            addCriterion("OrderlistIdentifyCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeEqualTo(Integer value) {
            addCriterion("OrderlistIdentifyCode =", value, "orderlistidentifycode");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeNotEqualTo(Integer value) {
            addCriterion("OrderlistIdentifyCode <>", value, "orderlistidentifycode");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeGreaterThan(Integer value) {
            addCriterion("OrderlistIdentifyCode >", value, "orderlistidentifycode");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderlistIdentifyCode >=", value, "orderlistidentifycode");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeLessThan(Integer value) {
            addCriterion("OrderlistIdentifyCode <", value, "orderlistidentifycode");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeLessThanOrEqualTo(Integer value) {
            addCriterion("OrderlistIdentifyCode <=", value, "orderlistidentifycode");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeIn(List<Integer> values) {
            addCriterion("OrderlistIdentifyCode in", values, "orderlistidentifycode");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeNotIn(List<Integer> values) {
            addCriterion("OrderlistIdentifyCode not in", values, "orderlistidentifycode");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeBetween(Integer value1, Integer value2) {
            addCriterion("OrderlistIdentifyCode between", value1, value2, "orderlistidentifycode");
            return (Criteria) this;
        }

        public Criteria andOrderlistidentifycodeNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderlistIdentifyCode not between", value1, value2, "orderlistidentifycode");
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