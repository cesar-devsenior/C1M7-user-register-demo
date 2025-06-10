package com.devsenior.cdiaz.user_register_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenior.cdiaz.user_register_demo.model.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    boolean existsByEmail(String email);
}
