package com.wellplay.first.base.entity;/*
 * Copyright ©2011-2016 hsb
 */

/**
 * Created by tongheshang on 2017/10/29.
 * weibo.com/yunshixin
 * https://github.com/tongheshang
 * email: trulyheshengbang@gmail.com
 */

public class UserVo {

    private String username;

    private String password;

    private boolean enable;

    private String email;

    public UserVo(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
