package com.api.hotelapi.repositories.Reserva;

import java.sql.Date;

import com.api.hotelapi.models.Reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepo {
    @Autowired
    ReservationRepoA reservationRepo;
    public Reserva save(Reserva reserva) {
        return reservationRepo.save(reserva);
    }

    public Iterable<Reserva> findAll() {
        return reservationRepo.findAll();
    }

    public void deleteAll() {
        reservationRepo.deleteAll();
    }

    public Boolean rangeDate(Date checkOut, Date checkIn, int nRoom) {
        return reservationRepo.rangeDate(checkOut, checkIn, nRoom);
    } 

    public void deleteOne(Long idReservation) {
        reservationRepo.deleteById(idReservation);
    }

    public boolean exist(Long idRes) {
        return reservationRepo.existsById(idRes);
    }
}
