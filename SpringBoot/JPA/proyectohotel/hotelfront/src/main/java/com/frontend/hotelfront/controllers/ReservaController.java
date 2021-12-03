package com.frontend.hotelfront.controllers;

import java.util.ArrayList;

import com.frontend.hotelfront.models.Reserva;
import com.frontend.hotelfront.models.Room;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

public class ReservaController {
        
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    RestTemplate rt = new RestTemplate();

    @GetMapping("/")
    public String roomPage(Model model){
        ArrayList<Room> list = rt.getForObject("http://localhost:8080/room/find", ArrayList.class);
        model.addAttribute("Rooms", list);
        model.addAttribute("Room", new Room());
        System.out.println("++++++++++++++++++++++++");
        return "Reservation";
    }

    @PostMapping("/add")
    public String addReservation(@ModelAttribute Reserva reservation){
        rt.postForObject("http://localhost:8080/reservation/add", reservation, Reserva.class);
        return "succesful";
    } 



}
