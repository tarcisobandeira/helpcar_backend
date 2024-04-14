package com.sb.helpcar.response;

import com.sb.helpcar.entities.Usuarios;

public record EmpresasResponseDTO(Integer id, String nome, String x, String y, Usuarios u) {
}
