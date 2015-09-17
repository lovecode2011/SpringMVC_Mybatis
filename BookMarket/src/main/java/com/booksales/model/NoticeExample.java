package com.booksales.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoticeidIsNull() {
            addCriterion("NoticeId is null");
            return (Criteria) this;
        }

        public Criteria andNoticeidIsNotNull() {
            addCriterion("NoticeId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeidEqualTo(Integer value) {
            addCriterion("NoticeId =", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotEqualTo(Integer value) {
            addCriterion("NoticeId <>", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThan(Integer value) {
            addCriterion("NoticeId >", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoticeId >=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThan(Integer value) {
            addCriterion("NoticeId <", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThanOrEqualTo(Integer value) {
            addCriterion("NoticeId <=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidIn(List<Integer> values) {
            addCriterion("NoticeId in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotIn(List<Integer> values) {
            addCriterion("NoticeId not in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidBetween(Integer value1, Integer value2) {
            addCriterion("NoticeId between", value1, value2, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotBetween(Integer value1, Integer value2) {
            addCriterion("NoticeId not between", value1, value2, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNotictitleIsNull() {
            addCriterion("NoticTitle is null");
            return (Criteria) this;
        }

        public Criteria andNotictitleIsNotNull() {
            addCriterion("NoticTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNotictitleEqualTo(String value) {
            addCriterion("NoticTitle =", value, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleNotEqualTo(String value) {
            addCriterion("NoticTitle <>", value, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleGreaterThan(String value) {
            addCriterion("NoticTitle >", value, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleGreaterThanOrEqualTo(String value) {
            addCriterion("NoticTitle >=", value, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleLessThan(String value) {
            addCriterion("NoticTitle <", value, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleLessThanOrEqualTo(String value) {
            addCriterion("NoticTitle <=", value, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleLike(String value) {
            addCriterion("NoticTitle like", value, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleNotLike(String value) {
            addCriterion("NoticTitle not like", value, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleIn(List<String> values) {
            addCriterion("NoticTitle in", values, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleNotIn(List<String> values) {
            addCriterion("NoticTitle not in", values, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleBetween(String value1, String value2) {
            addCriterion("NoticTitle between", value1, value2, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNotictitleNotBetween(String value1, String value2) {
            addCriterion("NoticTitle not between", value1, value2, "notictitle");
            return (Criteria) this;
        }

        public Criteria andNoticetimeIsNull() {
            addCriterion("NoticeTime is null");
            return (Criteria) this;
        }

        public Criteria andNoticetimeIsNotNull() {
            addCriterion("NoticeTime is not null");
            return (Criteria) this;
        }

        public Criteria andNoticetimeEqualTo(Date value) {
            addCriterion("NoticeTime =", value, "noticetime");
            return (Criteria) this;
        }

        public Criteria andNoticetimeNotEqualTo(Date value) {
            addCriterion("NoticeTime <>", value, "noticetime");
            return (Criteria) this;
        }

        public Criteria andNoticetimeGreaterThan(Date value) {
            addCriterion("NoticeTime >", value, "noticetime");
            return (Criteria) this;
        }

        public Criteria andNoticetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NoticeTime >=", value, "noticetime");
            return (Criteria) this;
        }

        public Criteria andNoticetimeLessThan(Date value) {
            addCriterion("NoticeTime <", value, "noticetime");
            return (Criteria) this;
        }

        public Criteria andNoticetimeLessThanOrEqualTo(Date value) {
            addCriterion("NoticeTime <=", value, "noticetime");
            return (Criteria) this;
        }

        public Criteria andNoticetimeIn(List<Date> values) {
            addCriterion("NoticeTime in", values, "noticetime");
            return (Criteria) this;
        }

        public Criteria andNoticetimeNotIn(List<Date> values) {
            addCriterion("NoticeTime not in", values, "noticetime");
            return (Criteria) this;
        }

        public Criteria andNoticetimeBetween(Date value1, Date value2) {
            addCriterion("NoticeTime between", value1, value2, "noticetime");
            return (Criteria) this;
        }

        public Criteria andNoticetimeNotBetween(Date value1, Date value2) {
            addCriterion("NoticeTime not between", value1, value2, "noticetime");
            return (Criteria) this;
        }

        public Criteria andBookidIsNull() {
            addCriterion("BookId is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("BookId is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("BookId =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("BookId <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("BookId >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookId >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("BookId <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("BookId <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("BookId in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("BookId not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("BookId between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("BookId not between", value1, value2, "bookid");
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