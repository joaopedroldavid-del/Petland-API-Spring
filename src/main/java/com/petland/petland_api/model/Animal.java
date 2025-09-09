package com.petland.petland_api.model;

import lombok.Data;

import java.util.Date;

@Data
public class Animal {
    private Integer id;
    private String nome;
    private Date aniversario;
}
