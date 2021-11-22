package com.biblioteca.practica.controllers;

import com.biblioteca.practica.models.Usuario;
import com.biblioteca.practica.repositories.RepositoryUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")   
public class UserController {
 
    @Autowired
    private RepositoryUser repoUser;

    @GetMapping("/findOne")
    public Usuario buscarUsuario(@RequestParam String nombre){
        return repoUser.getUser(nombre);
    }

    @GetMapping("/findAll")
    public Iterable<Usuario> getAll(){
        return repoUser.findAll();
    }

    @PostMapping("/addUser")
    public Usuario agregarUsuario(@RequestBody Usuario usuario){
        return repoUser.saveUser(usuario);
    }

}
