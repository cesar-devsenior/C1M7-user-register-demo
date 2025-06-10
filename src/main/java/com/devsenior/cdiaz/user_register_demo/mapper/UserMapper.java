package com.devsenior.cdiaz.user_register_demo.mapper;

import org.springframework.stereotype.Component;

import com.devsenior.cdiaz.user_register_demo.model.dto.UserRegisterRequest;
import com.devsenior.cdiaz.user_register_demo.model.entity.User;

@Component
public class UserMapper {
    
    public User userRegisterRequestToUser(UserRegisterRequest user){
        var response = new User();
        response.setUsername(user.getUsername());
        response.setPassword(user.getPassword());
        response.setFirstName(user.getFirstName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhoneNumber(user.getPhoneNumber());
        response.setCity(user.getCity());
        return response;
    }
}
