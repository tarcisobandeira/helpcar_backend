package com.sb.helpcar.response;

import com.sb.helpcar.entities.Usuario;

public record EmpresasResponseDTO(Integer id, String nome, String x, String y, Usuario u) {
}
