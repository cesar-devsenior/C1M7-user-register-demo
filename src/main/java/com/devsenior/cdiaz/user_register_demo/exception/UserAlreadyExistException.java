package com.devsenior.cdiaz.user_register_demo.exception;

public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException() {
        super("El usuario ya existe en el sistema");
    }
}
