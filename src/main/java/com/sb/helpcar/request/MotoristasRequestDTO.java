package com.sb.helpcar.request;

import com.sb.helpcar.entities.Usuarios;

import java.util.UUID;

public record MotoristasRequestDTO(UUID id, Long cpf, Usuarios usuarios) {
}
