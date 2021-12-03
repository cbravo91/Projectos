package com.frontend.hotelfront.controllers;

import com.frontend.hotelfront.models.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RoomController {
    
    @Autowired
    RestTemplate restT;

    public void getRooms() {
        ResponseEntity<Room> exchange = restT.exchange("http://localhost:8081/rooms/",
                HttpMethod.GET, null, Room.class);
        Room room = exchange.getBody();
        System.out.println(room.getId_room());

    }
}
