package com.thoughtworks.cn.production.controller;

import com.thoughtworks.cn.production.domain.ResponseEntity;
import com.thoughtworks.cn.production.domain.StatusCode;

public class LoginController {
    public ResponseEntity login(String username, String password) {
        if (username == null || username.trim().equals(""))
            return new ResponseEntity(StatusCode.HTTP_OK, "user name cannot be null/empty");
        return null;
    }
}
