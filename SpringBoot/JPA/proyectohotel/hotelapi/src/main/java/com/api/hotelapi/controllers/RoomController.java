package com.api.hotelapi.controllers;

import java.util.Optional;

import com.api.hotelapi.models.Room;
import com.api.hotelapi.services.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rooms")
public class RoomController {

    @Autowired
    RoomService serviceRoom;

    @GetMapping("/")
    public Iterable<Room> findAll() {
        return serviceRoom.findAll();
    }

    @GetMapping("/find/{nRoom}")
    public Optional<Room> findById(@PathVariable int nRoom) {
        return serviceRoom.findById(nRoom);
    }

/*     @GetMapping("/findAll/{busy}")
    public Iterable<Room> findDisponible(@PathVariable boolean busy) {
        return serviceRoom.findDisponible(busy);
    } */

    @GetMapping("/isAvailable/{nRoom}")
    public boolean isAvailable(int nRoom){
        return serviceRoom.isAvailable(nRoom);
    }
}
