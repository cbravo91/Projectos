package com.biblioteca.practica.controllers;

import java.util.ArrayList;

import com.biblioteca.practica.models.Book;
import com.biblioteca.practica.repositories.RepositoryBook;
import com.biblioteca.practica.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/books")
public class BookController {


    //controller--> service -->model-->service-->repo-->model-->controller
    @Autowired
    private RepositoryBook repo;


        @Autowired
        private BookService service;

    @GetMapping("/findOne")
    public Book buscarLibro(@RequestParam String titulo) {
        return service.getLibro(titulo);
    }

    @GetMapping("/findAll")
    public Iterable<Book> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{username}")
    public ArrayList<Book> librosDeUsuario(@PathVariable String nombre) {
        return service.getLibros(nombre);
    }

    @PostMapping("/addBook")
    public Book agregarLibro(@RequestBody Book book) {
        return repo.saveBook(book);
    }

    @DeleteMapping("/deleteBook")
    public boolean borrarLibro(@RequestParam String titulo){
        return repo.deleteBook(titulo);
    }
    
}
