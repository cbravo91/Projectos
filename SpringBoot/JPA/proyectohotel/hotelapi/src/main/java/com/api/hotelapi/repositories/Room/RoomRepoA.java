package com.api.hotelapi.repositories.Room;

import com.api.hotelapi.models.Room;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepoA extends CrudRepository<Room, Integer> {
    
  @Query
    (value = "SELECT disponible FROM room WHERE id_room = :nRoom ",nativeQuery = true)
    boolean isAvailable(
        @Param("nRoom") int nRoom
    );

}
