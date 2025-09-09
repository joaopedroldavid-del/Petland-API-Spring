package com.petland.petland_api.model;

import lombok.Data;

@Data
public class ProdutoServico {
    private Integer id;
    private String nome;
    private Double valor;
    private boolean servico;
}
