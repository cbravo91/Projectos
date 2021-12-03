package com.api.hotelapi.services;

import java.util.Optional;

import com.api.hotelapi.models.Room;
import com.api.hotelapi.repositories.Room.RoomRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    RoomRepo roomRepo;
    
    public Iterable<Room> findAll() {
        return roomRepo.findAll();
    }

    public Optional<Room> findById(int nRoom) {
        return roomRepo.findById(nRoom);
    }


    public boolean exist(int nRoom){
        return roomRepo.exist(nRoom);
    }

    public boolean isAvailable(int nRoom) {
        return roomRepo.isAvailable(nRoom);
    }
    
}
