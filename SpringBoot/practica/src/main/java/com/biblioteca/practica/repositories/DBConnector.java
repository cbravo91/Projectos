package com.biblioteca.practica.repositories;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;

import com.biblioteca.practica.models.Book;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class DBConnector {

    private final String url = "jdbc:mysql://localhost:3306/biblioteca";
    private final String user = "root";
    private final String pass = "";
    protected Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(getUrl(), getUser(), getPass());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public Book getBook(String titulo)throws FileNotFoundException{
        getConnection();
    }

    //DBConnector --> MySQLHandlerRepository --> BookRepository
}
