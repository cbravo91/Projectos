package com.biblioteca.practica.services;

import com.biblioteca.practica.repositories.RepositoryUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class UserService {
    @Autowired
    private RepositoryUser uRepo;

    public int getUserrId(String nombre){
    return  uRepo.getUser(nombre).getId_user();
    }
}
