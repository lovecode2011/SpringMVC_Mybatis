package com.booksales.model;

import java.util.Date;

public class Order {
    private Integer orderid;

    private Integer userid;

    private Long totalamount;

    private Integer receiverid;

    private String orderstates;

    private String logisticsstates;

    private String payment;

    private Date ordertime;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Long totalamount) {
        this.totalamount = totalamount;
    }

    public Integer getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(Integer receiverid) {
        this.receiverid = receiverid;
    }

    public String getOrderstates() {
        return orderstates;
    }

    public void setOrderstates(String orderstates) {
        this.orderstates = orderstates == null ? null : orderstates.trim();
    }

    public String getLogisticsstates() {
        return logisticsstates;
    }

    public void setLogisticsstates(String logisticsstates) {
        this.logisticsstates = logisticsstates == null ? null : logisticsstates.trim();
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }
}