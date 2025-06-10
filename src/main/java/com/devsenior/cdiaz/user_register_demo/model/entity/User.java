package com.devsenior.cdiaz.user_register_demo.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @Column(length = 20)
    private String username;

    @Column(nullable = false, length = 32)
    private String password;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(name = "phone", length = 15)
    private String phoneNumber;

    @Column(length = 100)
    private String city;

    @Column(name = "hire_date", nullable = false)
    private LocalDateTime hireDate;

}
