package com.booksales.model;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBooknameIsNull() {
            addCriterion("BookName is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("BookName is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("BookName =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("BookName <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("BookName >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("BookName >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("BookName <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("BookName <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("BookName like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("BookName not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("BookName in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("BookName not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("BookName between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("BookName not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("Author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("Author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("Author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("Author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("Author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("Author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("Author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("Author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("Author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("Author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("Author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("Author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("Author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("Author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPublishIsNull() {
            addCriterion("Publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("Publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(String value) {
            addCriterion("Publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(String value) {
            addCriterion("Publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(String value) {
            addCriterion("Publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(String value) {
            addCriterion("Publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(String value) {
            addCriterion("Publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(String value) {
            addCriterion("Publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLike(String value) {
            addCriterion("Publish like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotLike(String value) {
            addCriterion("Publish not like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<String> values) {
            addCriterion("Publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<String> values) {
            addCriterion("Publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(String value1, String value2) {
            addCriterion("Publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(String value1, String value2) {
            addCriterion("Publish not between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("ISBN is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("ISBN is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("ISBN =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("ISBN <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("ISBN >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("ISBN >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("ISBN <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("ISBN <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("ISBN like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("ISBN not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("ISBN in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("ISBN not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("ISBN between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("ISBN not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("PublishDate is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("PublishDate is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(String value) {
            addCriterion("PublishDate =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(String value) {
            addCriterion("PublishDate <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(String value) {
            addCriterion("PublishDate >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(String value) {
            addCriterion("PublishDate >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(String value) {
            addCriterion("PublishDate <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(String value) {
            addCriterion("PublishDate <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLike(String value) {
            addCriterion("PublishDate like", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotLike(String value) {
            addCriterion("PublishDate not like", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<String> values) {
            addCriterion("PublishDate in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<String> values) {
            addCriterion("PublishDate not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(String value1, String value2) {
            addCriterion("PublishDate between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(String value1, String value2) {
            addCriterion("PublishDate not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("Picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("Picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("Picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("Picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("Picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("Picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("Picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("Picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("Picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("Picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("Picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("Picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("Picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("Picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andRepertoryIsNull() {
            addCriterion("Repertory is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryIsNotNull() {
            addCriterion("Repertory is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryEqualTo(String value) {
            addCriterion("Repertory =", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotEqualTo(String value) {
            addCriterion("Repertory <>", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryGreaterThan(String value) {
            addCriterion("Repertory >", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryGreaterThanOrEqualTo(String value) {
            addCriterion("Repertory >=", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryLessThan(String value) {
            addCriterion("Repertory <", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryLessThanOrEqualTo(String value) {
            addCriterion("Repertory <=", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryLike(String value) {
            addCriterion("Repertory like", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotLike(String value) {
            addCriterion("Repertory not like", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryIn(List<String> values) {
            addCriterion("Repertory in", values, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotIn(List<String> values) {
            addCriterion("Repertory not in", values, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryBetween(String value1, String value2) {
            addCriterion("Repertory between", value1, value2, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotBetween(String value1, String value2) {
            addCriterion("Repertory not between", value1, value2, "repertory");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("Stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("Stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("Stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("Stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("Stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("Stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("Stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("Stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("Stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("Stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("Stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("Sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("Sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("Sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("Sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("Sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("Sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("Sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("Sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("Sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("Sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("Sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andBookclassidIsNull() {
            addCriterion("BookClassId is null");
            return (Criteria) this;
        }

        public Criteria andBookclassidIsNotNull() {
            addCriterion("BookClassId is not null");
            return (Criteria) this;
        }

        public Criteria andBookclassidEqualTo(Integer value) {
            addCriterion("BookClassId =", value, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andBookclassidNotEqualTo(Integer value) {
            addCriterion("BookClassId <>", value, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andBookclassidGreaterThan(Integer value) {
            addCriterion("BookClassId >", value, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andBookclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookClassId >=", value, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andBookclassidLessThan(Integer value) {
            addCriterion("BookClassId <", value, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andBookclassidLessThanOrEqualTo(Integer value) {
            addCriterion("BookClassId <=", value, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andBookclassidIn(List<Integer> values) {
            addCriterion("BookClassId in", values, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andBookclassidNotIn(List<Integer> values) {
            addCriterion("BookClassId not in", values, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andBookclassidBetween(Integer value1, Integer value2) {
            addCriterion("BookClassId between", value1, value2, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andBookclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("BookClassId not between", value1, value2, "bookclassid");
            return (Criteria) this;
        }

        public Criteria andIsrecommendIsNull() {
            addCriterion("IsRecommend is null");
            return (Criteria) this;
        }

        public Criteria andIsrecommendIsNotNull() {
            addCriterion("IsRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecommendEqualTo(String value) {
            addCriterion("IsRecommend =", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotEqualTo(String value) {
            addCriterion("IsRecommend <>", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendGreaterThan(String value) {
            addCriterion("IsRecommend >", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendGreaterThanOrEqualTo(String value) {
            addCriterion("IsRecommend >=", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendLessThan(String value) {
            addCriterion("IsRecommend <", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendLessThanOrEqualTo(String value) {
            addCriterion("IsRecommend <=", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendLike(String value) {
            addCriterion("IsRecommend like", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotLike(String value) {
            addCriterion("IsRecommend not like", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendIn(List<String> values) {
            addCriterion("IsRecommend in", values, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotIn(List<String> values) {
            addCriterion("IsRecommend not in", values, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendBetween(String value1, String value2) {
            addCriterion("IsRecommend between", value1, value2, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotBetween(String value1, String value2) {
            addCriterion("IsRecommend not between", value1, value2, "isrecommend");
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