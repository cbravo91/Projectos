package com.api.hotelapi.repositories.Cliente;

import com.api.hotelapi.models.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositoryA extends CrudRepository<Cliente, Integer>{
    
}
