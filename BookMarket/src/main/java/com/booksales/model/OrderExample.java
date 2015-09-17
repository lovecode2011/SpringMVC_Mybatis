package com.booksales.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderId not between", value1, value2, "orderid");
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

        public Criteria andSumIsNull() {
            addCriterion("Sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("Sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Long value) {
            addCriterion("Sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Long value) {
            addCriterion("Sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Long value) {
            addCriterion("Sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Long value) {
            addCriterion("Sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Long value) {
            addCriterion("Sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Long value) {
            addCriterion("Sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Long> values) {
            addCriterion("Sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Long> values) {
            addCriterion("Sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Long value1, Long value2) {
            addCriterion("Sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Long value1, Long value2) {
            addCriterion("Sum not between", value1, value2, "sum");
            return (Criteria) this;
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

        public Criteria andOrderstatesIsNull() {
            addCriterion("OrderStates is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatesIsNotNull() {
            addCriterion("OrderStates is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatesEqualTo(String value) {
            addCriterion("OrderStates =", value, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesNotEqualTo(String value) {
            addCriterion("OrderStates <>", value, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesGreaterThan(String value) {
            addCriterion("OrderStates >", value, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesGreaterThanOrEqualTo(String value) {
            addCriterion("OrderStates >=", value, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesLessThan(String value) {
            addCriterion("OrderStates <", value, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesLessThanOrEqualTo(String value) {
            addCriterion("OrderStates <=", value, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesLike(String value) {
            addCriterion("OrderStates like", value, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesNotLike(String value) {
            addCriterion("OrderStates not like", value, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesIn(List<String> values) {
            addCriterion("OrderStates in", values, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesNotIn(List<String> values) {
            addCriterion("OrderStates not in", values, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesBetween(String value1, String value2) {
            addCriterion("OrderStates between", value1, value2, "orderstates");
            return (Criteria) this;
        }

        public Criteria andOrderstatesNotBetween(String value1, String value2) {
            addCriterion("OrderStates not between", value1, value2, "orderstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesIsNull() {
            addCriterion("LogisticsStates is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesIsNotNull() {
            addCriterion("LogisticsStates is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesEqualTo(String value) {
            addCriterion("LogisticsStates =", value, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesNotEqualTo(String value) {
            addCriterion("LogisticsStates <>", value, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesGreaterThan(String value) {
            addCriterion("LogisticsStates >", value, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesGreaterThanOrEqualTo(String value) {
            addCriterion("LogisticsStates >=", value, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesLessThan(String value) {
            addCriterion("LogisticsStates <", value, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesLessThanOrEqualTo(String value) {
            addCriterion("LogisticsStates <=", value, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesLike(String value) {
            addCriterion("LogisticsStates like", value, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesNotLike(String value) {
            addCriterion("LogisticsStates not like", value, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesIn(List<String> values) {
            addCriterion("LogisticsStates in", values, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesNotIn(List<String> values) {
            addCriterion("LogisticsStates not in", values, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesBetween(String value1, String value2) {
            addCriterion("LogisticsStates between", value1, value2, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andLogisticsstatesNotBetween(String value1, String value2) {
            addCriterion("LogisticsStates not between", value1, value2, "logisticsstates");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("PayWay is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("PayWay is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("PayWay =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("PayWay <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("PayWay >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PayWay >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("PayWay <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("PayWay <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("PayWay like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("PayWay not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("PayWay in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("PayWay not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("PayWay between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("PayWay not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("OrderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("OrderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("OrderTime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("OrderTime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("OrderTime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderTime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("OrderTime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("OrderTime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("OrderTime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("OrderTime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("OrderTime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("OrderTime not between", value1, value2, "ordertime");
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