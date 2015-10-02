package com.booksales.model;

import java.util.Date;
import java.util.List;

public class OrderWapper {
	private Integer orderid;

	private Integer userid;

	private double sum;

	private Integer receiverid;

	private String orderstates;

	private String logisticsstates;

	private String payway;

	private Date ordertime;

	private List<CartWapper> cartWapperList;

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

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
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
		this.orderstates = orderstates;
	}

	public String getLogisticsstates() {
		return logisticsstates;
	}

	public void setLogisticsstates(String logisticsstates) {
		this.logisticsstates = logisticsstates;
	}

	public String getPayway() {
		return payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public List<CartWapper> getCartWapperList() {
		return cartWapperList;
	}

	public void setCartWapperList(List<CartWapper> cartWapperList) {
		this.cartWapperList = cartWapperList;
	}

}