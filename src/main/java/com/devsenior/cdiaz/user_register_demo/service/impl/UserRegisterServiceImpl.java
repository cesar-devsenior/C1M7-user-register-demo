package com.devsenior.cdiaz.user_register_demo.service.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.devsenior.cdiaz.user_register_demo.exception.UserAlreadyExistException;
import com.devsenior.cdiaz.user_register_demo.mapper.UserMapper;
import com.devsenior.cdiaz.user_register_demo.model.dto.UserRegisterRequest;
import com.devsenior.cdiaz.user_register_demo.repository.UserRepository;
import com.devsenior.cdiaz.user_register_demo.service.UserRegisterService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserRegisterServiceImpl implements UserRegisterService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    
    @Override
    public void register(UserRegisterRequest user) {
        var oldUser = userRepository.findById(user.getUsername());
        if(oldUser.isPresent()){
            throw new UserAlreadyExistException();
        }

        if(userRepository.existsByEmail(user.getEmail())){

        }

        var entity = userMapper.userRegisterRequestToUser(user);
        entity.setHireDate(LocalDateTime.now());

        userRepository.save(entity);
        
    }
}
