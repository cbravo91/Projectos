package com.biblioteca.practica.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private int id_libro;
    private String nombre;
    private String autor;
    private int paginas;

}