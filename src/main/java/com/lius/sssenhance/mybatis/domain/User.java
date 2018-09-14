package com.lius.sssenhance.mybatis.domain;

import java.io.Serializable;


public class User implements  Serializable{

    private static final long serialVersionUID = 1L;


    private int id;
    private String passwd;
    private String username;
    private String loginIp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}
