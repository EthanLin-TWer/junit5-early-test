package com.thoughtworks.cn.production.services;

import com.thoughtworks.cn.production.domain.LoginStatus;
import com.thoughtworks.cn.production.domain.ResponseEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginServiceTest {
    @Test
    public void should_return_login_successful_when_username_and_password_matches() {
        LoginService loginService = new LoginService();

        ResponseEntity result = loginService.login("username", "password");

        assertEquals(result.getLoginStatus(), LoginStatus.LOGIN_SUCCESSFUL);
        assertEquals(result.getMessage(), "login successful");
    }

    @Test
    public void should_return_login_failed_when_username_and_password_mismatch() throws Exception {
        LoginService loginService = new LoginService();

        ResponseEntity result = loginService.login("username", "dummydata");

        assertEquals(result.getLoginStatus(), LoginStatus.USERNAME_AND_PASSWORD_MISMATCH);
        assertEquals(result.getMessage(), "username and password doesn't match our record");
    }
}