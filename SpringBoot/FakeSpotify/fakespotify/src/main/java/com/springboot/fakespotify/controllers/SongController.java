package com.springboot.fakespotify.controllers;
import java.util.concurrent.atomic.AtomicLong;

import com.springboot.fakespotify.models.Cancion;
import com.springboot.fakespotify.repositories.RepositoryCancion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/canciones")
public class SongController {
        //NO NECESITO CONSTRUCTOR
    //@GetMapping es la anotación que se asegura que hay un Request HTTP GET

    // EN ESTE CASO llamamos a [llamada a la api]/saludo, ej: example.com.demo/saludo
    // llamada a la api = URL base de API
    @Autowired
    private RepositoryCancion repoSong;

    @GetMapping("/cancion")
    public Cancion getCancion(
        //@RequestParam es la anotación para requerimiento de un parametro en la Request.
        /**
         * enlaza el valor de un parametro entrante de la query, en uno que yo tengo
         * dentro de mi modelo, y puedo tener un valor Default por si no me ponen nada.
         */
       
        @RequestParam String nombre) {
            return repoSong.getSong(nombre);
        }

     @GetMapping("/findAll")
     public Iterable<Cancion> getAll(){
         return repoSong.findAll();
     }   
    @PostMapping("/post")
        public Cancion postSong(@RequestBody Cancion cancion){
            return repoSong.saveSong(cancion);
        }

    
    @DeleteMapping("/deleteSong")
    public boolean eraseSong(@RequestParam String titulo){
        return repoSong.deleteSong(titulo);
    }
    /*public @ResponseBody ResponseEntity<String> delete() {
        
    return new ResponseEntity<String>("DELETE Response", HttpStatus.OK);
        }*/
        }
        
    

        // ./mvnw spring-boot:run -> en terminal para correr

        // sino: ./mvnw clean package
        // java -jar o -war target/saludo-rest-service-0.1.0.jar

        //http://localhost:8080/saludo?nombre=User
        //http://localhost:8080/saludo?nombre="Nico"

    // para POSTS: postMapping
    // RequestMapping(method = GET)


