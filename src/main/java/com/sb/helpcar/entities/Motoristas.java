package com.sb.helpcar.entities;


import com.sb.helpcar.request.MotoristasRequestDTO;
import com.sb.helpcar.response.MotoristasResponseDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Motoristas {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Long cpf;
    @OneToOne
    private Usuarios usuarios;

    public Motoristas(MotoristasResponseDTO data){
        this.cpf = data.cpf();
        this.usuarios = data.usuarios();
    }

    public Motoristas(MotoristasRequestDTO data) {
        this.cpf = data.cpf();
        this.usuarios = data.usuarios();
    }
}
