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
public class Motorista {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Long cpf;
    @OneToOne
    private Usuario usuario;

    public Motorista(MotoristasResponseDTO data){
        this.cpf = data.cpf();
        this.usuario = data.usuario();
    }

    public Motorista(MotoristasRequestDTO data, Usuario u) {
        this.cpf = data.cpf();
        this.usuario = u;
    }
}
