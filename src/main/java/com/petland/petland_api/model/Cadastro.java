package com.petland.petland_api.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "cadastro")
@Data
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE) // No one can set the id

    @Embedded
    private Integer id;

    @Embedded
    private String nome;

    //private Perfil perfil;
    //private Endereco endereco;

}
