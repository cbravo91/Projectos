package com.biblioteca.practica.models;

public class Comparador<T> implements Comparable<T>{
    public <T> T getMenor (T[] listaT){
        if( listaT != null && listaT.length != 0)
        {
            T menorTemp = listaT[0];
            for (T uno: listaT){
                if(uno.compareTo(uno)>0){

                }
            }
        }
    }

    @Override
    public int compareTo(T arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
}
