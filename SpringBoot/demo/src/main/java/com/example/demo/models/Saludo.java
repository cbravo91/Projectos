package com.example.demo.models;

public class Saludo {
    private final long id;
    private final String contenido;

    public Saludo(long id, String c) {
        this.id = id;
        this.contenido = c;
    }

    public String getContenido() {
        return contenido;
    }

    public long getId() {
        return id;
    }
}
