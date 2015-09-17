package com.booksales.model;

import java.util.ArrayList;
import java.util.List;

public class ReceiverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiverExample() {
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

        public Criteria andReceiveridIsNull() {
            addCriterion("ReceiverId is null");
            return (Criteria) this;
        }

        public Criteria andReceiveridIsNotNull() {
            addCriterion("ReceiverId is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveridEqualTo(Integer value) {
            addCriterion("ReceiverId =", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotEqualTo(Integer value) {
            addCriterion("ReceiverId <>", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridGreaterThan(Integer value) {
            addCriterion("ReceiverId >", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceiverId >=", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridLessThan(Integer value) {
            addCriterion("ReceiverId <", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridLessThanOrEqualTo(Integer value) {
            addCriterion("ReceiverId <=", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridIn(List<Integer> values) {
            addCriterion("ReceiverId in", values, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotIn(List<Integer> values) {
            addCriterion("ReceiverId not in", values, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridBetween(Integer value1, Integer value2) {
            addCriterion("ReceiverId between", value1, value2, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceiverId not between", value1, value2, "receiverid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNull() {
            addCriterion("ReceiverName is null");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNotNull() {
            addCriterion("ReceiverName is not null");
            return (Criteria) this;
        }

        public Criteria andReceivernameEqualTo(String value) {
            addCriterion("ReceiverName =", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotEqualTo(String value) {
            addCriterion("ReceiverName <>", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThan(String value) {
            addCriterion("ReceiverName >", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverName >=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThan(String value) {
            addCriterion("ReceiverName <", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThanOrEqualTo(String value) {
            addCriterion("ReceiverName <=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLike(String value) {
            addCriterion("ReceiverName like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotLike(String value) {
            addCriterion("ReceiverName not like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameIn(List<String> values) {
            addCriterion("ReceiverName in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotIn(List<String> values) {
            addCriterion("ReceiverName not in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameBetween(String value1, String value2) {
            addCriterion("ReceiverName between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotBetween(String value1, String value2) {
            addCriterion("ReceiverName not between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivertelIsNull() {
            addCriterion("ReceiverTel is null");
            return (Criteria) this;
        }

        public Criteria andReceivertelIsNotNull() {
            addCriterion("ReceiverTel is not null");
            return (Criteria) this;
        }

        public Criteria andReceivertelEqualTo(String value) {
            addCriterion("ReceiverTel =", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelNotEqualTo(String value) {
            addCriterion("ReceiverTel <>", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelGreaterThan(String value) {
            addCriterion("ReceiverTel >", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverTel >=", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelLessThan(String value) {
            addCriterion("ReceiverTel <", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelLessThanOrEqualTo(String value) {
            addCriterion("ReceiverTel <=", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelLike(String value) {
            addCriterion("ReceiverTel like", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelNotLike(String value) {
            addCriterion("ReceiverTel not like", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelIn(List<String> values) {
            addCriterion("ReceiverTel in", values, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelNotIn(List<String> values) {
            addCriterion("ReceiverTel not in", values, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelBetween(String value1, String value2) {
            addCriterion("ReceiverTel between", value1, value2, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelNotBetween(String value1, String value2) {
            addCriterion("ReceiverTel not between", value1, value2, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressIsNull() {
            addCriterion("ReceiverAddress is null");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressIsNotNull() {
            addCriterion("ReceiverAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressEqualTo(String value) {
            addCriterion("ReceiverAddress =", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressNotEqualTo(String value) {
            addCriterion("ReceiverAddress <>", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressGreaterThan(String value) {
            addCriterion("ReceiverAddress >", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverAddress >=", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressLessThan(String value) {
            addCriterion("ReceiverAddress <", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressLessThanOrEqualTo(String value) {
            addCriterion("ReceiverAddress <=", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressLike(String value) {
            addCriterion("ReceiverAddress like", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressNotLike(String value) {
            addCriterion("ReceiverAddress not like", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressIn(List<String> values) {
            addCriterion("ReceiverAddress in", values, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressNotIn(List<String> values) {
            addCriterion("ReceiverAddress not in", values, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressBetween(String value1, String value2) {
            addCriterion("ReceiverAddress between", value1, value2, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressNotBetween(String value1, String value2) {
            addCriterion("ReceiverAddress not between", value1, value2, "receiveraddress");
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