package com.thoughtworks.cn.production.controller;

import com.thoughtworks.cn.condition.Disabled;
import com.thoughtworks.cn.production.domain.LoginStatus;
import com.thoughtworks.cn.production.domain.ResponseEntity;
import com.thoughtworks.cn.production.mockito.MockitoExtension;
import com.thoughtworks.cn.production.services.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class LoginControllerTest {

    private LoginController loginController;
    @Mock LoginService loginService;

    @BeforeEach
    public void setUp() throws Exception {
        loginController = new LoginController(loginService);
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

    @Test
    public void should_return_login_success_when_call_login_service_and_username_and_password_are_matched() throws Exception {
        String password = "password";
        String username = "username";
        given(loginService.login(username, password)).willReturn(new ResponseEntity(LoginStatus.LOGIN_SUCCESSFUL, "login successful"));

        ResponseEntity result = loginController.login(username, password);

        verify(loginService).login(username, password);
        assertEquals(result.getLoginStatus(), LoginStatus.LOGIN_SUCCESSFUL);
        assertEquals(result.getMessage(), "login successful");
    }
}