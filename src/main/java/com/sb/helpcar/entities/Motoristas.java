package com.sb.helpcar.entities;


import com.sb.helpcar.request.MotoristasRequestDTO;
import com.sb.helpcar.response.MotoristasResponseDTO;
import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Motoristas {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Long cpf;
    @OneToOne
    private Usuarios usuario;

    public Motoristas(MotoristasResponseDTO data){
        this.cpf = data.cpf();
        this.usuario = data.usuario();
    }

    public Motoristas(MotoristasRequestDTO data, Usuarios u) {
        this.cpf = data.cpf();
        this.usuario = u;
    }
}
