package com.frontend.hotelfront.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    
    private int id_room;
    private int camas;
    private boolean disponible;
}
