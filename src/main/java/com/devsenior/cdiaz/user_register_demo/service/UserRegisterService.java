package com.devsenior.cdiaz.user_register_demo.service;

import com.devsenior.cdiaz.user_register_demo.model.dto.UserRegisterRequest;

public interface UserRegisterService {
    void register(UserRegisterRequest user);
}
