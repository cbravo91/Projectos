package com.springboot.fakespotify.models.Usuarios;

import com.springboot.fakespotify.interfaces.IReproducible;
import com.springboot.fakespotify.models.Cancion;
import com.springboot.fakespotify.models.Playlist;

public class UsuarioComun implements IReproducible {

    @Override
    public void playSong(Cancion cancion) {
        System.out.println("Pasarse a premium para reproducir esa canción. Reproduciendo de manera aleatoria");
        playShuffle();

    }

    @Override
    public void playShuffle() {

    }

    @Override
    public void agregarCancion(Cancion cancion, Playlist playlist) {
        if (playlist.getCanciones().size() <= 30) {
            playlist.agregarCancion(cancion);

            System.out.println("Se agregó: " + cancion.getNombre() + " a la lista");
        } else {
            System.out.println("Deberá pasarse a usuario premium para agregar más canciones");
        }
    }

    @Override
    public Playlist crearPlaylist(String nombre) {
        System.out.println("Debe pasarse a usuario premium para crear una lista");
        return null;
    }

    @Override
    public void agregarPlaylist(Playlist playlist) {

    }

}