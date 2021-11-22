package com.biblioteca.practica.services;

import java.util.ArrayList;

import com.biblioteca.practica.models.Book;
import com.biblioteca.practica.repositories.RepositoryBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  @Autowired
  private RepositoryBook repo;


  public Book getLibro(String titulo) {
    // toda la logica del método, todo lo necesario y las comunicaciones
    // necesarias para poder funcionar
    return repo.getBook(titulo);
  }

  public ArrayList<Book> getLibros(String nombre) {
    UserService userService = new UserService();
    int id_user = userService.getUserrId(nombre);

    return repo.getLibros(id_user);
  }
}
