package com.thoughtworks.cn.production.controller;

import com.thoughtworks.cn.production.domain.ResponseEntity;
import com.thoughtworks.cn.production.domain.LoginStatus;

public class LoginController {
    public ResponseEntity login(String username, String password) {
        if (username == null || username.trim().equals(""))
            return new ResponseEntity(LoginStatus.USERNAME_NOT_PROVIDED, "user name cannot be null/empty");
        if (password == null || password.trim().equals(""))
            return new ResponseEntity(LoginStatus.PASSWORD_NOT_PROVIDED, "password cannot be null/empty");
        return null;
    }
}
