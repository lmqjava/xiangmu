package com.wuliu.pojo;

import java.util.ArrayList;
import java.util.List;

public class PersonnelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelExample() {
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

        public Criteria andPersonnelusernameIsNull() {
            addCriterion("personnelusername is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameIsNotNull() {
            addCriterion("personnelusername is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameEqualTo(String value) {
            addCriterion("personnelusername =", value, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameNotEqualTo(String value) {
            addCriterion("personnelusername <>", value, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameGreaterThan(String value) {
            addCriterion("personnelusername >", value, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameGreaterThanOrEqualTo(String value) {
            addCriterion("personnelusername >=", value, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameLessThan(String value) {
            addCriterion("personnelusername <", value, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameLessThanOrEqualTo(String value) {
            addCriterion("personnelusername <=", value, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameLike(String value) {
            addCriterion("personnelusername like", value, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameNotLike(String value) {
            addCriterion("personnelusername not like", value, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameIn(List<String> values) {
            addCriterion("personnelusername in", values, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameNotIn(List<String> values) {
            addCriterion("personnelusername not in", values, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameBetween(String value1, String value2) {
            addCriterion("personnelusername between", value1, value2, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelusernameNotBetween(String value1, String value2) {
            addCriterion("personnelusername not between", value1, value2, "personnelusername");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameIsNull() {
            addCriterion("personnelname is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameIsNotNull() {
            addCriterion("personnelname is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameEqualTo(String value) {
            addCriterion("personnelname =", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameNotEqualTo(String value) {
            addCriterion("personnelname <>", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameGreaterThan(String value) {
            addCriterion("personnelname >", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameGreaterThanOrEqualTo(String value) {
            addCriterion("personnelname >=", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameLessThan(String value) {
            addCriterion("personnelname <", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameLessThanOrEqualTo(String value) {
            addCriterion("personnelname <=", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameLike(String value) {
            addCriterion("personnelname like", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameNotLike(String value) {
            addCriterion("personnelname not like", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameIn(List<String> values) {
            addCriterion("personnelname in", values, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameNotIn(List<String> values) {
            addCriterion("personnelname not in", values, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameBetween(String value1, String value2) {
            addCriterion("personnelname between", value1, value2, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameNotBetween(String value1, String value2) {
            addCriterion("personnelname not between", value1, value2, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderIsNull() {
            addCriterion("personnelgender is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderIsNotNull() {
            addCriterion("personnelgender is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderEqualTo(String value) {
            addCriterion("personnelgender =", value, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderNotEqualTo(String value) {
            addCriterion("personnelgender <>", value, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderGreaterThan(String value) {
            addCriterion("personnelgender >", value, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderGreaterThanOrEqualTo(String value) {
            addCriterion("personnelgender >=", value, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderLessThan(String value) {
            addCriterion("personnelgender <", value, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderLessThanOrEqualTo(String value) {
            addCriterion("personnelgender <=", value, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderLike(String value) {
            addCriterion("personnelgender like", value, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderNotLike(String value) {
            addCriterion("personnelgender not like", value, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderIn(List<String> values) {
            addCriterion("personnelgender in", values, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderNotIn(List<String> values) {
            addCriterion("personnelgender not in", values, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderBetween(String value1, String value2) {
            addCriterion("personnelgender between", value1, value2, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelgenderNotBetween(String value1, String value2) {
            addCriterion("personnelgender not between", value1, value2, "personnelgender");
            return (Criteria) this;
        }

        public Criteria andPersonnelageIsNull() {
            addCriterion("personnelage is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelageIsNotNull() {
            addCriterion("personnelage is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelageEqualTo(Integer value) {
            addCriterion("personnelage =", value, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonnelageNotEqualTo(Integer value) {
            addCriterion("personnelage <>", value, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonnelageGreaterThan(Integer value) {
            addCriterion("personnelage >", value, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonnelageGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnelage >=", value, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonnelageLessThan(Integer value) {
            addCriterion("personnelage <", value, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonnelageLessThanOrEqualTo(Integer value) {
            addCriterion("personnelage <=", value, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonnelageIn(List<Integer> values) {
            addCriterion("personnelage in", values, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonnelageNotIn(List<Integer> values) {
            addCriterion("personnelage not in", values, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonnelageBetween(Integer value1, Integer value2) {
            addCriterion("personnelage between", value1, value2, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonnelageNotBetween(Integer value1, Integer value2) {
            addCriterion("personnelage not between", value1, value2, "personnelage");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressIsNull() {
            addCriterion("personneladdress is null");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressIsNotNull() {
            addCriterion("personneladdress is not null");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressEqualTo(String value) {
            addCriterion("personneladdress =", value, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressNotEqualTo(String value) {
            addCriterion("personneladdress <>", value, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressGreaterThan(String value) {
            addCriterion("personneladdress >", value, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressGreaterThanOrEqualTo(String value) {
            addCriterion("personneladdress >=", value, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressLessThan(String value) {
            addCriterion("personneladdress <", value, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressLessThanOrEqualTo(String value) {
            addCriterion("personneladdress <=", value, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressLike(String value) {
            addCriterion("personneladdress like", value, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressNotLike(String value) {
            addCriterion("personneladdress not like", value, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressIn(List<String> values) {
            addCriterion("personneladdress in", values, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressNotIn(List<String> values) {
            addCriterion("personneladdress not in", values, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressBetween(String value1, String value2) {
            addCriterion("personneladdress between", value1, value2, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonneladdressNotBetween(String value1, String value2) {
            addCriterion("personneladdress not between", value1, value2, "personneladdress");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneIsNull() {
            addCriterion("personnelphone is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneIsNotNull() {
            addCriterion("personnelphone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneEqualTo(String value) {
            addCriterion("personnelphone =", value, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneNotEqualTo(String value) {
            addCriterion("personnelphone <>", value, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneGreaterThan(String value) {
            addCriterion("personnelphone >", value, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("personnelphone >=", value, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneLessThan(String value) {
            addCriterion("personnelphone <", value, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneLessThanOrEqualTo(String value) {
            addCriterion("personnelphone <=", value, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneLike(String value) {
            addCriterion("personnelphone like", value, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneNotLike(String value) {
            addCriterion("personnelphone not like", value, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneIn(List<String> values) {
            addCriterion("personnelphone in", values, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneNotIn(List<String> values) {
            addCriterion("personnelphone not in", values, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneBetween(String value1, String value2) {
            addCriterion("personnelphone between", value1, value2, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelphoneNotBetween(String value1, String value2) {
            addCriterion("personnelphone not between", value1, value2, "personnelphone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneIsNull() {
            addCriterion("personnelmobilephone is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneIsNotNull() {
            addCriterion("personnelmobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneEqualTo(String value) {
            addCriterion("personnelmobilephone =", value, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneNotEqualTo(String value) {
            addCriterion("personnelmobilephone <>", value, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneGreaterThan(String value) {
            addCriterion("personnelmobilephone >", value, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("personnelmobilephone >=", value, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneLessThan(String value) {
            addCriterion("personnelmobilephone <", value, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneLessThanOrEqualTo(String value) {
            addCriterion("personnelmobilephone <=", value, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneLike(String value) {
            addCriterion("personnelmobilephone like", value, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneNotLike(String value) {
            addCriterion("personnelmobilephone not like", value, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneIn(List<String> values) {
            addCriterion("personnelmobilephone in", values, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneNotIn(List<String> values) {
            addCriterion("personnelmobilephone not in", values, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneBetween(String value1, String value2) {
            addCriterion("personnelmobilephone between", value1, value2, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelmobilephoneNotBetween(String value1, String value2) {
            addCriterion("personnelmobilephone not between", value1, value2, "personnelmobilephone");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailIsNull() {
            addCriterion("personnelemail is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailIsNotNull() {
            addCriterion("personnelemail is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailEqualTo(String value) {
            addCriterion("personnelemail =", value, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailNotEqualTo(String value) {
            addCriterion("personnelemail <>", value, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailGreaterThan(String value) {
            addCriterion("personnelemail >", value, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailGreaterThanOrEqualTo(String value) {
            addCriterion("personnelemail >=", value, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailLessThan(String value) {
            addCriterion("personnelemail <", value, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailLessThanOrEqualTo(String value) {
            addCriterion("personnelemail <=", value, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailLike(String value) {
            addCriterion("personnelemail like", value, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailNotLike(String value) {
            addCriterion("personnelemail not like", value, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailIn(List<String> values) {
            addCriterion("personnelemail in", values, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailNotIn(List<String> values) {
            addCriterion("personnelemail not in", values, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailBetween(String value1, String value2) {
            addCriterion("personnelemail between", value1, value2, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelemailNotBetween(String value1, String value2) {
            addCriterion("personnelemail not between", value1, value2, "personnelemail");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsIsNull() {
            addCriterion("personnelpolitics is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsIsNotNull() {
            addCriterion("personnelpolitics is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsEqualTo(String value) {
            addCriterion("personnelpolitics =", value, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsNotEqualTo(String value) {
            addCriterion("personnelpolitics <>", value, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsGreaterThan(String value) {
            addCriterion("personnelpolitics >", value, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsGreaterThanOrEqualTo(String value) {
            addCriterion("personnelpolitics >=", value, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsLessThan(String value) {
            addCriterion("personnelpolitics <", value, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsLessThanOrEqualTo(String value) {
            addCriterion("personnelpolitics <=", value, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsLike(String value) {
            addCriterion("personnelpolitics like", value, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsNotLike(String value) {
            addCriterion("personnelpolitics not like", value, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsIn(List<String> values) {
            addCriterion("personnelpolitics in", values, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsNotIn(List<String> values) {
            addCriterion("personnelpolitics not in", values, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsBetween(String value1, String value2) {
            addCriterion("personnelpolitics between", value1, value2, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonnelpoliticsNotBetween(String value1, String value2) {
            addCriterion("personnelpolitics not between", value1, value2, "personnelpolitics");
            return (Criteria) this;
        }

        public Criteria andPersonneljobIsNull() {
            addCriterion("personneljob is null");
            return (Criteria) this;
        }

        public Criteria andPersonneljobIsNotNull() {
            addCriterion("personneljob is not null");
            return (Criteria) this;
        }

        public Criteria andPersonneljobEqualTo(String value) {
            addCriterion("personneljob =", value, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobNotEqualTo(String value) {
            addCriterion("personneljob <>", value, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobGreaterThan(String value) {
            addCriterion("personneljob >", value, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobGreaterThanOrEqualTo(String value) {
            addCriterion("personneljob >=", value, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobLessThan(String value) {
            addCriterion("personneljob <", value, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobLessThanOrEqualTo(String value) {
            addCriterion("personneljob <=", value, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobLike(String value) {
            addCriterion("personneljob like", value, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobNotLike(String value) {
            addCriterion("personneljob not like", value, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobIn(List<String> values) {
            addCriterion("personneljob in", values, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobNotIn(List<String> values) {
            addCriterion("personneljob not in", values, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobBetween(String value1, String value2) {
            addCriterion("personneljob between", value1, value2, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneljobNotBetween(String value1, String value2) {
            addCriterion("personneljob not between", value1, value2, "personneljob");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentIsNull() {
            addCriterion("personneldepartment is null");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentIsNotNull() {
            addCriterion("personneldepartment is not null");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentEqualTo(String value) {
            addCriterion("personneldepartment =", value, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentNotEqualTo(String value) {
            addCriterion("personneldepartment <>", value, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentGreaterThan(String value) {
            addCriterion("personneldepartment >", value, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("personneldepartment >=", value, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentLessThan(String value) {
            addCriterion("personneldepartment <", value, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentLessThanOrEqualTo(String value) {
            addCriterion("personneldepartment <=", value, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentLike(String value) {
            addCriterion("personneldepartment like", value, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentNotLike(String value) {
            addCriterion("personneldepartment not like", value, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentIn(List<String> values) {
            addCriterion("personneldepartment in", values, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentNotIn(List<String> values) {
            addCriterion("personneldepartment not in", values, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentBetween(String value1, String value2) {
            addCriterion("personneldepartment between", value1, value2, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonneldepartmentNotBetween(String value1, String value2) {
            addCriterion("personneldepartment not between", value1, value2, "personneldepartment");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateIsNull() {
            addCriterion("personnelentrydate is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateIsNotNull() {
            addCriterion("personnelentrydate is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateEqualTo(String value) {
            addCriterion("personnelentrydate =", value, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateNotEqualTo(String value) {
            addCriterion("personnelentrydate <>", value, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateGreaterThan(String value) {
            addCriterion("personnelentrydate >", value, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateGreaterThanOrEqualTo(String value) {
            addCriterion("personnelentrydate >=", value, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateLessThan(String value) {
            addCriterion("personnelentrydate <", value, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateLessThanOrEqualTo(String value) {
            addCriterion("personnelentrydate <=", value, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateLike(String value) {
            addCriterion("personnelentrydate like", value, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateNotLike(String value) {
            addCriterion("personnelentrydate not like", value, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateIn(List<String> values) {
            addCriterion("personnelentrydate in", values, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateNotIn(List<String> values) {
            addCriterion("personnelentrydate not in", values, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateBetween(String value1, String value2) {
            addCriterion("personnelentrydate between", value1, value2, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelentrydateNotBetween(String value1, String value2) {
            addCriterion("personnelentrydate not between", value1, value2, "personnelentrydate");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryIsNull() {
            addCriterion("personnelsalary is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryIsNotNull() {
            addCriterion("personnelsalary is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryEqualTo(Integer value) {
            addCriterion("personnelsalary =", value, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryNotEqualTo(Integer value) {
            addCriterion("personnelsalary <>", value, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryGreaterThan(Integer value) {
            addCriterion("personnelsalary >", value, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnelsalary >=", value, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryLessThan(Integer value) {
            addCriterion("personnelsalary <", value, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryLessThanOrEqualTo(Integer value) {
            addCriterion("personnelsalary <=", value, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryIn(List<Integer> values) {
            addCriterion("personnelsalary in", values, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryNotIn(List<Integer> values) {
            addCriterion("personnelsalary not in", values, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryBetween(Integer value1, Integer value2) {
            addCriterion("personnelsalary between", value1, value2, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelsalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("personnelsalary not between", value1, value2, "personnelsalary");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusIsNull() {
            addCriterion("personnelstatus is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusIsNotNull() {
            addCriterion("personnelstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusEqualTo(String value) {
            addCriterion("personnelstatus =", value, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusNotEqualTo(String value) {
            addCriterion("personnelstatus <>", value, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusGreaterThan(String value) {
            addCriterion("personnelstatus >", value, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusGreaterThanOrEqualTo(String value) {
            addCriterion("personnelstatus >=", value, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusLessThan(String value) {
            addCriterion("personnelstatus <", value, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusLessThanOrEqualTo(String value) {
            addCriterion("personnelstatus <=", value, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusLike(String value) {
            addCriterion("personnelstatus like", value, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusNotLike(String value) {
            addCriterion("personnelstatus not like", value, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusIn(List<String> values) {
            addCriterion("personnelstatus in", values, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusNotIn(List<String> values) {
            addCriterion("personnelstatus not in", values, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusBetween(String value1, String value2) {
            addCriterion("personnelstatus between", value1, value2, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelstatusNotBetween(String value1, String value2) {
            addCriterion("personnelstatus not between", value1, value2, "personnelstatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordIsNull() {
            addCriterion("personnelpassword is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordIsNotNull() {
            addCriterion("personnelpassword is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordEqualTo(String value) {
            addCriterion("personnelpassword =", value, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordNotEqualTo(String value) {
            addCriterion("personnelpassword <>", value, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordGreaterThan(String value) {
            addCriterion("personnelpassword >", value, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("personnelpassword >=", value, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordLessThan(String value) {
            addCriterion("personnelpassword <", value, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordLessThanOrEqualTo(String value) {
            addCriterion("personnelpassword <=", value, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordLike(String value) {
            addCriterion("personnelpassword like", value, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordNotLike(String value) {
            addCriterion("personnelpassword not like", value, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordIn(List<String> values) {
            addCriterion("personnelpassword in", values, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordNotIn(List<String> values) {
            addCriterion("personnelpassword not in", values, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordBetween(String value1, String value2) {
            addCriterion("personnelpassword between", value1, value2, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordNotBetween(String value1, String value2) {
            addCriterion("personnelpassword not between", value1, value2, "personnelpassword");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionIsNull() {
            addCriterion("personnelpasswordquestion is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionIsNotNull() {
            addCriterion("personnelpasswordquestion is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionEqualTo(String value) {
            addCriterion("personnelpasswordquestion =", value, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionNotEqualTo(String value) {
            addCriterion("personnelpasswordquestion <>", value, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionGreaterThan(String value) {
            addCriterion("personnelpasswordquestion >", value, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionGreaterThanOrEqualTo(String value) {
            addCriterion("personnelpasswordquestion >=", value, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionLessThan(String value) {
            addCriterion("personnelpasswordquestion <", value, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionLessThanOrEqualTo(String value) {
            addCriterion("personnelpasswordquestion <=", value, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionLike(String value) {
            addCriterion("personnelpasswordquestion like", value, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionNotLike(String value) {
            addCriterion("personnelpasswordquestion not like", value, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionIn(List<String> values) {
            addCriterion("personnelpasswordquestion in", values, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionNotIn(List<String> values) {
            addCriterion("personnelpasswordquestion not in", values, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionBetween(String value1, String value2) {
            addCriterion("personnelpasswordquestion between", value1, value2, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordquestionNotBetween(String value1, String value2) {
            addCriterion("personnelpasswordquestion not between", value1, value2, "personnelpasswordquestion");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerIsNull() {
            addCriterion("personnelpasswordanswer is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerIsNotNull() {
            addCriterion("personnelpasswordanswer is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerEqualTo(String value) {
            addCriterion("personnelpasswordanswer =", value, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerNotEqualTo(String value) {
            addCriterion("personnelpasswordanswer <>", value, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerGreaterThan(String value) {
            addCriterion("personnelpasswordanswer >", value, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerGreaterThanOrEqualTo(String value) {
            addCriterion("personnelpasswordanswer >=", value, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerLessThan(String value) {
            addCriterion("personnelpasswordanswer <", value, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerLessThanOrEqualTo(String value) {
            addCriterion("personnelpasswordanswer <=", value, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerLike(String value) {
            addCriterion("personnelpasswordanswer like", value, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerNotLike(String value) {
            addCriterion("personnelpasswordanswer not like", value, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerIn(List<String> values) {
            addCriterion("personnelpasswordanswer in", values, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerNotIn(List<String> values) {
            addCriterion("personnelpasswordanswer not in", values, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerBetween(String value1, String value2) {
            addCriterion("personnelpasswordanswer between", value1, value2, "personnelpasswordanswer");
            return (Criteria) this;
        }

        public Criteria andPersonnelpasswordanswerNotBetween(String value1, String value2) {
            addCriterion("personnelpasswordanswer not between", value1, value2, "personnelpasswordanswer");
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