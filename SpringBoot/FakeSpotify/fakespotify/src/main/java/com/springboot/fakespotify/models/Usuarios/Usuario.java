package com.springboot.fakespotify.models.Usuarios;

import java.util.ArrayList;

import com.springboot.fakespotify.interfaces.IReproducible;
import com.springboot.fakespotify.models.Cancion;
import com.springboot.fakespotify.models.Playlist;

public class Usuario {

    private String nombre;
    private String password;
    private ArrayList<Playlist> listas;

    private IReproducible reproducible;

    public Usuario(IReproducible tipoUsuario, String nombre, String password) {
        this.reproducible = tipoUsuario;
        this.nombre = nombre;
        this.password = password;
        this.listas = new ArrayList<Playlist>();
    }

    public IReproducible getReproducible() {
        return reproducible;
    }
    public void setUsuario(IReproducible usuario) {
        this.reproducible = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCancion(Cancion cancion, Playlist playlist) {
        this.reproducible.agregarCancion(cancion, playlist);

    }

    public void reproducirCancion(Cancion cancion) {
        this.reproducible.playSong(cancion);
    }

    public void playAleatorio() {
        this.reproducible.playShuffle();
    }

    public Playlist crearPlaylist(String nombre) {
        this.reproducible.crearPlaylist(nombre);

        return new Playlist(nombre);

    }
    public String getPassword() {
        return password;
    }

    public ArrayList<Playlist> agregarPlaylist(Playlist playlist) {
        this.reproducible.agregarPlaylist(playlist);
        this.listas.add(playlist);
        return listas;
    }

}
