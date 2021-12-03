package com.frontend.hotelfront.models;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private int dni;
    private String nombre;
    private String apellido;
  
}