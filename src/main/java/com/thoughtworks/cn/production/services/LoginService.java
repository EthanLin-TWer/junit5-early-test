package com.thoughtworks.cn.production.services;

import com.thoughtworks.cn.production.domain.LoginStatus;
import com.thoughtworks.cn.production.domain.ResponseEntity;

public class LoginService {
    public ResponseEntity login(String username, String password) {
        if (username.equals("username") && password.equals("password")) {
            return new ResponseEntity(LoginStatus.LOGIN_SUCCESSFUL, "login successful");
        }
        return new ResponseEntity(LoginStatus.USERNAME_AND_PASSWORD_MISMATCH, "username and password doesn't match our record");
    }
}
