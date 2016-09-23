package com.thoughtworks.cn.production.services;

import com.thoughtworks.cn.production.domain.LoginStatus;
import com.thoughtworks.cn.production.domain.ResponseEntity;

public class LoginService {
    public ResponseEntity login(String username, String password) {
        return new ResponseEntity(LoginStatus.LOGIN_SUCCESSFUL, "login successful");
    }
}
