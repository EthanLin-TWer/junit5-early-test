package com.thoughtworks.cn.production.controller;

import com.thoughtworks.cn.production.domain.LoginStatus;
import com.thoughtworks.cn.production.domain.ResponseEntity;
import com.thoughtworks.cn.production.services.LoginService;

public class LoginController {
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public ResponseEntity login(String username, String password) {
        if (nullOrEmpty(username))
            return new ResponseEntity(LoginStatus.USERNAME_NOT_PROVIDED, "user name cannot be null/empty");
        if (nullOrEmpty(password))
            return new ResponseEntity(LoginStatus.PASSWORD_NOT_PROVIDED, "password cannot be null/empty");

        return loginService.login(username, password);
    }

    private boolean nullOrEmpty(String field) {
        return field == null || field.trim().equals("");
    }
}
