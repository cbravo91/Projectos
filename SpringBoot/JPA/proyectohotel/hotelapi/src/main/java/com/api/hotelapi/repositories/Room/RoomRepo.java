package com.api.hotelapi.repositories.Room;

import java.util.Optional;

import com.api.hotelapi.models.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepo  {

    @Autowired
    RoomRepoA roomRepo;

    public Iterable<Room> findAll() {
        return roomRepo.findAll();
    }

    public Optional<Room> findById(int nRoom) {
        return roomRepo.findById(nRoom);
    }


    public boolean isAvailable(int nRoom) {
        return roomRepo.isAvailable(nRoom);
    }
    public boolean exist(int nRoom){
        return roomRepo.existsById(nRoom);
    }


}
