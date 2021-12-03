package com.api.hotelapi.controllers;

import java.util.Optional;

import com.api.hotelapi.models.Cliente;
import com.api.hotelapi.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clients")
public class ClienteController {
    
    @Autowired
    ClienteService serviceCliente;

    @PostMapping("/add")
        public Cliente addCliente(@RequestBody Cliente cliente){
            return serviceCliente.save(cliente);
        }
    
    @GetMapping("/find/{dni}")
     public Optional<Cliente> findBydni(@PathVariable int dni)
     {
         return serviceCliente.findBydni(dni);
     }

     @GetMapping("/")
     public Iterable<Cliente> findAll()
     { return serviceCliente.findAll();}
}
