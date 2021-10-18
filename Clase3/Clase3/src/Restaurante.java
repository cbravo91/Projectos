package Clase3.Clase3.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Restaurante {
    private double caja;
    private final Vector<Mesa> mesas;
   private ArrayList<Integer> mesasDisponibles = new ArrayList<Integer>();
   

   Scanner input = new Scanner(System.in);
    public Restaurante() {

        this.mesas = new Vector<Mesa>(3, 1);

        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                this.mesas.add(new Mesa(4));

            } else {
                this.mesas.add(new Mesa(2));
            }
        }
    }

    public Mesa getMesa() {
        return mesas;
    }

    public void mostrarMesas() {
        for (int i = 0; i < mesas.size(); i++) {
            System.out.print("Capacidad: " + mesas.get(i).getCapacidad() + " " + "Pedidos: "
                    + mesas.get(i).getPedidos() + "Cuenta: " + mesas.get(i).getCuenta()+ "Personas :"+mesas.get(i).getPersonasSentadas());
        }

    }

    public void mostrarClientes() {
         int  totalClientes=0;
         mesas.forEach(System.out::println);
        //this.mesas.stream().forEach(mesa-> totalClientes+= mesa.getPersonasSentadas());
       for (Mesa mesa : mesas) {
           totalClientes+= mesa.getPersonasSentadas();
       }

       System.out.println("Cantidad de comensales: " + totalClientes);
       
    }

    public void elegirMesa(int cantSentados) {

        for (int i = 0; i< this.mesas.size(); i++) {
            if (this.mesas.get(i).getCapacidad() >= cantSentados && this.mesas.get(i).getPersonasSentadas() == 0)
                mesasDisponibles.add(i);
                
        }
        System.out.println("Las mesas disponibles son: " + mesasDisponibles.toString());
        System.out.println("¿Que mesa elije?");
        int indiceMesa= Integer.parseInt(input.nextLine());
         sentarse(cantSentados, this.mesas.get(indiceMesa));
    }

    public void sentarse(int personasSentadas, Mesa mesa) {

          mesa.setPersonasSentadas(personasSentadas);
    }

    public void gananciaporDia() {
        for (Mesa mesa : mesas) {
            caja += mesa.getCuenta();
        }
    }

}



