package com.api.hotelapi.services;

import java.util.Optional;

import com.api.hotelapi.models.Cliente;
import com.api.hotelapi.repositories.Cliente.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepo;

    public Cliente save(Cliente cliente)
    {
        return clienteRepo.save(cliente);
    }

    public Optional<Cliente> findBydni(int dni) {
        return clienteRepo.findBydni(dni);
    }

    public Iterable<Cliente> findAll(){
        return clienteRepo.findAll();
    }
}
