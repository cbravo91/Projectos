package com.springboot.fakespotify.controllers;

import com.springboot.fakespotify.interfaces.IReproducible;
import com.springboot.fakespotify.models.Usuarios.Usuario;
import com.springboot.fakespotify.repositories.RepositoryUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//paso de estructura de url /alumnos
@RequestMapping(path = "/usuarios")
public class UserController{

    @Autowired
    private RepositoryUsuario repoUser;
   // @RequestMapping(value = "/alta",method = RequestMapping.POST)
    @PostMapping ("/alta")
    public Usuario crearUsuario(@RequestBody IReproducible tipoUsuario, String nombre, String password){
        
        Usuario usuario= new Usuario(tipoUsuario, nombre, password);
        return repoUser.saveUser(usuario);
    }

    @GetMapping("/findOne")
    public Usuario searchUser(

        @RequestParam String nombre) {
            return repoUser.findUser(nombre);
        }
    @GetMapping("/getAll")
    public Iterable<Usuario> getAll(){
        return repoUser.findAll();
    }
    
    @DeleteMapping("/deleteUser")
    public boolean eraseUser(
        @RequestParam String nombre){
            return repoUser.deleteUser(nombre);
        }
    
}