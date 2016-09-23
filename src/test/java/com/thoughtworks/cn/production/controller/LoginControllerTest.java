package com.thoughtworks.cn.production.controller;

import com.thoughtworks.cn.production.domain.ResponseEntity;
import com.thoughtworks.cn.production.domain.StatusCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginControllerTest {
    @Test
    public void should_not_login_when_username_not_provided() throws Exception {
        LoginController loginController = new LoginController();

        ResponseEntity result = loginController.login("", "");

        assertEquals(result.getStatusCode(), StatusCode.HTTP_OK);
        assertEquals(result.getMessage(), "user name cannot be null/empty");
    }

}