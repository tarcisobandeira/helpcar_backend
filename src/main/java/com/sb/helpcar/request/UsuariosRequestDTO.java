package com.sb.helpcar.request;

import jakarta.security.auth.message.callback.SecretKeyCallback;

import javax.crypto.SecretKey;

public record UsuariosRequestDTO(String firstname, String lastname, String email, String password) {

}
