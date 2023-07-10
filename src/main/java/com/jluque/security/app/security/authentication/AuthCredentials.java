package com.jluque.security.app.security.authentication;

import lombok.Data;

@Data
public class AuthCredentials {
    private String email;
    private String password;
}
