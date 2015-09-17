package com.booksales.model;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private Integer credit;

    private String email;

    private String isroot;

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