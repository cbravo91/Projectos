package com.biblioteca.practica.repositories;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;

import com.biblioteca.practica.models.Book;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Repository;

@Repository
public class BookJson extends DBConnector{

    private String archivo="../../resources/JSONS/libros.json";
    public Book getBook(String titulo){
        Book book = null;
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(archivo)){
            Object objeto = jsonParser.parse(reader);
            JSONObject librosJson = (JSONObject) objeto;

            if(librosJson.size()>0)
            {
                for(int i=0; i< librosJson.size();i++){
                    JSONObject jsonTemp = (JSONObject) librosJson.get(i);
                    if(jsonTemp.get("titulo").equals(titulo))
                    {
                         book = new Book(i, titulo, jsonTemp.get("autor").toString(), Integer.parseInt(jsonTemp.get("cantidadHojas").toString()) );
                        return book;
                    }

                }
            }


        } catch(Exception e)
        {
            e.printStackTrace();
            System.err.println("no se pudo");
        }
        return book;
    }

    
}
