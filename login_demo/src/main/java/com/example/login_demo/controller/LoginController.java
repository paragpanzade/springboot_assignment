package com.example.login_demo.controller;

import com.example.login_demo.entity.Login;
import com.example.login_demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("create/{pass}")
    public ResponseEntity<Login> createUser(@PathVariable("pass") String pass, @RequestBody Login login){
        return ResponseEntity.ok().body(this.loginService.createUser(pass,login));
    }

    @GetMapping("get/{pass}")
    public String isUser(@PathVariable("pass") String pass){
        return loginService.isUser(pass);
    }

}
