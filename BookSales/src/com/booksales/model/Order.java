package com.booksales.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
	//订单id
    private Integer orderid;
    //用户id
    private Integer userid;
    //该订单总共金额（打折后）
    private Long totalamount;
    //收货地址id
    private Integer receiverid;
    //订单状态（枚举值 订单状态（0=未付款，1=已付款但没有发货，2=已付款和已发货，3=订单成功））
    private String orderstates;
    //物流状态（枚举值 物流信息（0=未出仓库，1=已出仓库，2=已发货，3=已到货，4=已签收））
    private String logisticsstates;
    //支付方式（枚举值 支付方式（0=货到付款，1=支付宝，2=微信，3=银联））
    private String payment;
    //订单时间
    private Date ordertime;
    
    public Order() {
		super();
	}

	public Order(Integer orderid, Integer userid, Long totalamount,
			Integer receiverid, String orderstates, String logisticsstates,
			String payment, Date ordertime) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.totalamount = totalamount;
		this.receiverid = receiverid;
		this.orderstates = orderstates;
		this.logisticsstates = logisticsstates;
		this.payment = payment;
		this.ordertime = ordertime;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", userid=" + userid
				+ ", totalamount=" + totalamount + ", receiverid=" + receiverid
				+ ", orderstates=" + orderstates + ", logisticsstates="
				+ logisticsstates + ", payment=" + payment + ", ordertime="
				+ ordertime + "]";
	}

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