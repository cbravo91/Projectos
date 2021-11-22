package com.springboot.fakespotify.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.springboot.fakespotify.models.Cancion;
import com.springboot.fakespotify.repositories.IRepository;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryCancion extends IRepository {

    // desde aca se debería llamara a la base de datos para guardar las canciones

    public Cancion saveSong(Cancion cancion) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "INSERT INTO Cancion (nombre,artista,album,duracion) VALUES(?,?,?,?) ";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, cancion.getNombre());
            ps.setString(2, cancion.getArtista());
            ps.setString(3, cancion.getAlbum());
            ps.setDouble(4, cancion.getDuracion());
            ps.execute();
            return cancion;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Cancion getSong(String titulo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cancion cancion = null;
        try {
            String sql = "SELECT id_Song,nombre,artista,album FROM Cancion WHERE nombre = ?";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, titulo);
            while (rs.next()) {
                cancion = new Cancion(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(1));
            }
            return cancion;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return null;
        }
    }

    public ArrayList<Cancion> findAll() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Cancion> canciones = new ArrayList<>();
        try {
            String sql = "SELECT id_Song,nombre,artista,album FROM Cancion";
            ps = getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                canciones.add(new Cancion(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(1)));
            }
            return canciones;
        } catch(Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return null;
        }
    }

    public boolean deleteSong(String titulo) {

        PreparedStatement ps = null;

        try {
            String sql = "DELETE FROM Cancion WHERE nombre = ?";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, titulo);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return false;
        }

    }
}
