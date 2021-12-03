package com.frontend.hotelfront.models;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Reserva {

    private int idReserva;
    private Date checkIn;
    private Date checkOut;
    private int id_room;
    private int id_cliente;
}