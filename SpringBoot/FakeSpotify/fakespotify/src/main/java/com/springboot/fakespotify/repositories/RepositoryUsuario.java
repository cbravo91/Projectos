package com.springboot.fakespotify.repositories;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.springboot.fakespotify.interfaces.IReproducible;
import com.springboot.fakespotify.models.Usuarios.Usuario;
import com.springboot.fakespotify.models.Usuarios.UsuarioComun;
import com.springboot.fakespotify.models.Usuarios.UsuarioPremium;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryUsuario extends IRepository {
    public Usuario saveUser(Usuario usuario) {
        getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "Insert into Usuarios (nombre,password,premium) values (?,?,?)";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());
            if (usuario.getReproducible().getClass().getName().equals(UsuarioComun.class.getName())) {
                ps.setInt(3, 0);
            } else {
                ps.setInt(3, 1);
            }
            ps.execute();
            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Usuario findUser(String nombre){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            String sql = "SELECT id_usuario,nombre,password,premium FROM Usuarios WHERE nombre = ?";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            IReproducible tipoUsuario = null;
            while (rs.next()) {
                if (rs.getInt(4) == 0) {
                    tipoUsuario = new UsuarioComun();
                } else if (rs.getInt(4) == 1) {
                    tipoUsuario = new UsuarioPremium();
                }
                usuario = new Usuario(tipoUsuario, rs.getString(2), rs.getString(3));

            }
            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return null;
        }
    }

    public Iterable<Usuario> findAll() {
        ArrayList<Usuario> usuarioRepo = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT id_usuario, nombre,password, premium FROM Usuarios";
            ps = getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            IReproducible tipoUsuario = null;
            while (rs.next()) {
                if (rs.getInt(4) == 0) {
                    tipoUsuario = new UsuarioComun();
                } else if (rs.getInt(4) == 1) {
                    tipoUsuario = new UsuarioPremium();
                }
                Usuario usuario = new Usuario(tipoUsuario, rs.getString(2), rs.getString(3));
                usuarioRepo.add(usuario);

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
        }
        return usuarioRepo;
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
