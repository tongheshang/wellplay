package com.wellplay.first.auth.service;/*
 * Copyright ©2011-2016 hsb
 */

import com.wellplay.first.base.entity.User;

public interface AuthService {

    void insertUser(User user) throws Exception;

    void addRoleToUser(String role_user, User user) throws Exception;
}
