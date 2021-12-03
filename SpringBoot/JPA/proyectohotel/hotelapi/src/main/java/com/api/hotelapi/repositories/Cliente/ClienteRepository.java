package com.api.hotelapi.repositories.Cliente;

import java.util.Optional;

import com.api.hotelapi.models.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {
    
    @Autowired
    private ClienteRepositoryA repoabstractoCliente;

    public Cliente save(Cliente cliente)
    {
        return repoabstractoCliente.save(cliente);
    }

    public Optional<Cliente> findBydni(int dni) {
        return repoabstractoCliente.findById(dni);
    }

    
    public Iterable<Cliente> findAll() {
        return repoabstractoCliente.findAll();
    }
}
