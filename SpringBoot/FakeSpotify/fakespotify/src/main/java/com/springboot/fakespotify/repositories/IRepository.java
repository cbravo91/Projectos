package com.springboot.fakespotify.repositories;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.annotation.sql.DataSourceDefinition;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class IRepository {
    
    private final String url = "jdbc:mysql://localhost:3306/BD_spotify";
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

}
