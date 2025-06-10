package com.devsenior.cdiaz.user_register_demo.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRegisterRequest {
 
    @JsonProperty(value = "first_name")
    @NotBlank(message = "El nombre es un campo requerido")
    private String firstName;
    
    @JsonProperty(value = "last_name")
    @NotBlank(message = "El apellido es un campo requerido")
    private String lastName;

    @NotBlank(message = "El correo electronico es requerido")
    @Email(message = "El correo electronico no es válido")
    private String email;

    @JsonProperty(value = "phone_number")
    private String phoneNumber;
    
    private String city;

    @NotBlank(message = "El nombre de usuario es requerido")
    private String username;

    @NotBlank(message = "La contraseña es requerida")
    private String password;
}
