package com.thoughtworks.cn.production.controller;

import com.thoughtworks.cn.production.domain.ResponseEntity;
import com.thoughtworks.cn.production.domain.LoginStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginControllerTest {

    private LoginController loginController;

    @BeforeEach
    public void setUp() throws Exception {
        loginController = new LoginController();
    }

    @Test
    public void should_not_login_when_username_is_null_or_empty() throws Exception {
        ResponseEntity result = loginController.login("", "");

        assertEquals(result.getLoginStatus(), LoginStatus.USERNAME_NOT_PROVIDED);
        assertEquals(result.getMessage(), "user name cannot be null/empty");
    }

    @Test
    public void should_not_login_when_password_is_null_or_empty() throws Exception {
        ResponseEntity result = loginController.login("linesh", "");

        assertEquals(result.getLoginStatus(), LoginStatus.PASSWORD_NOT_PROVIDED);
        assertEquals(result.getMessage(), "password cannot be null/empty");
    }
}