package com.booksales.model;

import java.io.Serializable;

public class Receiver implements Serializable{
	//收货地址表id
    private Integer receiverid;
    //用户id
    private Integer userid;
    //收货人名称
    private String receivername;
    //收货人电话
    private String receivertel;
    //收货人地址
    private String receiveraddress;

    public Receiver() {
		super();
	}

	public Receiver(Integer receiverid, Integer userid, String receivername,
			String receivertel, String receiveraddress) {
		super();
		this.receiverid = receiverid;
		this.userid = userid;
		this.receivername = receivername;
		this.receivertel = receivertel;
		this.receiveraddress = receiveraddress;
	}

	@Override
	public String toString() {
		return "Receiver [receiverid=" + receiverid + ", userid=" + userid
				+ ", receivername=" + receivername + ", receivertel="
				+ receivertel + ", receiveraddress=" + receiveraddress + "]";
	}

	public Integer getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(Integer receiverid) {
        this.receiverid = receiverid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername == null ? null : receivername.trim();
    }

    public String getReceivertel() {
        return receivertel;
    }

    public void setReceivertel(String receivertel) {
        this.receivertel = receivertel == null ? null : receivertel.trim();
    }

    public String getReceiveraddress() {
        return receiveraddress;
    }

    public void setReceiveraddress(String receiveraddress) {
        this.receiveraddress = receiveraddress == null ? null : receiveraddress.trim();
    }
}