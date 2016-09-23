package com.thoughtworks.cn.production.domain;

public class ResponseEntity {
    private LoginStatus loginStatus;
    private String message;

    public ResponseEntity(LoginStatus loginStatus, String message) {
        this.loginStatus = loginStatus;
        this.message = message;
    }

    public LoginStatus getLoginStatus() {
        return loginStatus;
    }

    public String getMessage() {
        return message;
    }
}
