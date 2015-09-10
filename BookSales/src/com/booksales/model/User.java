package com.booksales.model;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class User implements Serializable {
	//用户id
    private Integer userid;
    //用户名称
    private String username;
    //用户密码
    private String password;
    //用户积分
    private Integer credit;
    //用户邮箱
    private String email;
    //用户是否是管理员
    private String isroot;
    
    public User() {
		super();
	}

	public User(Integer userid, String username, String password,
			Integer credit, String email, String isroot) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.credit = credit;
		this.email = email;
		this.isroot = isroot;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username
				+ ", password=" + password + ", credit=" + credit + ", email="
				+ email + ", isroot=" + isroot + "]";
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIsroot() {
        return isroot;
    }

    public void setIsroot(String isroot) {
        this.isroot = isroot == null ? null : isroot.trim();
    }
}