package com.springboot.fakespotify.interfaces;

import com.springboot.fakespotify.models.Cancion;
import com.springboot.fakespotify.models.Playlist;

public interface IReproducible {
    public void playSong (Cancion cancion);
    public void agregarCancion(Cancion cancion, Playlist playlist);
    public void playShuffle();
    public Playlist crearPlaylist(String nombre);
    public void agregarPlaylist(Playlist playlist);
    }
