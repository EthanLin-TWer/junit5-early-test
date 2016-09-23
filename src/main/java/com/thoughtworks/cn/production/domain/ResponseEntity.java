package com.thoughtworks.cn.production.domain;

public class ResponseEntity {
    private StatusCode statusCode;
    private String message;

    public ResponseEntity(StatusCode statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}
