package com.devsenior.cdiaz.user_register_demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.cdiaz.user_register_demo.model.dto.UserRegisterRequest;
import com.devsenior.cdiaz.user_register_demo.service.UserRegisterService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserRegisterService userRegisterService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/user/register")
    public void register(@Valid @RequestBody UserRegisterRequest userData) {
        userRegisterService.register(userData);
    }
}
