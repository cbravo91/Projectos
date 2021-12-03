
package com.api.hotelapi.repositories.Reserva;

import java.sql.Date;

import com.api.hotelapi.models.Reserva;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepoA extends CrudRepository<Reserva, Long> {

     @Query(value = "SELECT CASE WHEN COUNT(id_room) > 0 THEN 'false' ELSE 'true' END FROM reserva r WHERE (checkIn <= :check_out AND checkOut >= :check_in) AND id_room = :nRoom", nativeQuery = true)
    Boolean rangeDate(
            @Param("check_out") Date checkOut,
            @Param("check_in") Date checkIn,
            @Param("nRoom") int nRoom); 
}