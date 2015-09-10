package com.booksales.model;

import java.io.Serializable;

public class Cart implements Serializable {
	//购物车id
    private Integer cartid;
    //用户id
    private Integer userid;
    //用户名称（当检索用户名称时，显示该用户购物车中的所有商品）
    private String username;
    //图书id
    private Integer bookid;
    //图书名称
    private String bookname;
    //购买该图书的本数
    private Integer booknum;
    //小计（打完折之后的小计）
    private Long amount;
    //订单id。当该商品没有加入订单时，订单id为空，当加入订单时，检索订单id，显示的就是该订单购买的商品细节
    private Integer orderid;
    
    public Cart() {
		super();
	}

	public Cart(Integer cartid, Integer userid, String username,
			Integer bookid, String bookname, Integer booknum, Long amount,
			Integer orderid) {
		super();
		this.cartid = cartid;
		this.userid = userid;
		this.username = username;
		this.bookid = bookid;
		this.bookname = bookname;
		this.booknum = booknum;
		this.amount = amount;
		this.orderid = orderid;
	}
	
	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", userid=" + userid + ", username="
				+ username + ", bookid=" + bookid + ", bookname=" + bookname
				+ ", booknum=" + booknum + ", amount=" + amount + ", orderid="
				+ orderid + "]";
	}

	public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public Integer getBooknum() {
        return booknum;
    }

    public void setBooknum(Integer booknum) {
        this.booknum = booknum;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}