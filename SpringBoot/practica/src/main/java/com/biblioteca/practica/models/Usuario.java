package com.biblioteca.practica.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {
    private int id_user;
    private String nombre;
    private String pass;
    private int edad;
    


    public void comprar(){}
}
