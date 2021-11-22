package com.biblioteca.practica.repositories;

import java.util.ArrayList;

import com.biblioteca.practica.models.Book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryBook extends DBConnector {

    public Book getBook(String titulo) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Book libro = null;
        try {
            String sql = "SELECT id_libro,autor,nombre,paginas FROM Libros WHERE nombre = ?";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, titulo);
            rs = ps.executeQuery();
            while (rs.next()) {
                libro = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt("paginas"));

            }
            return libro;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return null;
        }
    }

    public ArrayList<Book> getLibros(int id_user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Book> libros = new ArrayList<>();
        try {
            String sql = "SELECT nombre, autor, paginas FROM Libros WHERE id_user = ?";
            ps = getConnection().prepareStatement(sql);
            ps.setInt(1, id_user);
            rs = ps.executeQuery();
            while(rs.next()) {
                libros.add(new Book (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt("paginas")));
            }
            return libros;
        } catch(Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return libros;
        }
    }
    public Book saveBook(Book libro) {
        PreparedStatement ps = null;
        try {
            String sql = "Insert into Libros (autor,nombre,paginas) values (?,?,?)";
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, libro.getAutor());
            ps.setString(2, libro.getNombre());
            ps.setInt(3, libro.getPaginas());
            ps.execute();
            return libro;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean deleteBook(String titulo) {

        PreparedStatement ps = null;

        try {
            String sql = "DELETE FROM Libros WHERE nombre = ?";
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

    private ArrayList<Book> bookRepo = new ArrayList<Book>();

    public Iterable<Book> findAll() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT id_libro,autor,nombre,paginas FROM Libros";
            ps = getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                bookRepo.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt("paginas")));

            }
            return bookRepo;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("no se pudo");
            return null;
        }
    }

}
