package com.example.login_demo.service;

import com.example.login_demo.entity.Login;

public interface LoginService {

    Login createUser(String pass, Login login);

    String isUser(String pass);
}
