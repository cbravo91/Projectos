package com.api.hotelapi.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Reserva {

    @Id
    @GeneratedValue
    private int idReserva;
    private Date checkIn;
    private Date checkOut;
    private int id_room;
    private int id_cliente;
}