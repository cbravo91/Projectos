package com.biblioteca.practica.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.biblioteca.practica.models.Usuario;

import org.springframework.stereotype.Repository;
@Repository
public class RepositoryUser extends DBConnector{


    public Usuario getUser(String nombre) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            String sql = "SELECT id_user,nombre,pass,edad FROM Usuarios WHERE nombre = ?";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt("edad"));

            }
            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return null;
        }
    }


    public  Iterable<Usuario> findAll() {
         ArrayList<Usuario> userRepo= new ArrayList<Usuario>();
        getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT id_user,nombre,pass,edad FROM Usuarios";
            ps = getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                userRepo.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt("edad")));

            }
            return userRepo;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return null;
        }
    }
    public Usuario saveUser(Usuario usuario) {
        getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "Insert into Usuarios (nombre,pass,edad) values (?,?,?)";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPass());
            ps.setInt(3, usuario.getEdad());
            ps.execute();
            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean deleteUser(String nombre) {
        getConnection();
        PreparedStatement ps = null;

        try {
            String sql = "DELETE FROM Usuarios WHERE nombre = ?";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, nombre);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return false;
        }
        
    }


    
}
