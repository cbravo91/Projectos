package Clase3.Clase3.src;

import java.util.Vector;

public class Mesa {
    private final int capacidad;
    private int personasSentadas;
    private double cuenta;
    private Vector<Comidas> pedidos = new Vector<Comidas>();

    public Mesa(int capacidad) {
        this.capacidad = capacidad;
        this.pedidos = new Vector<Comidas>();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Vector<Comidas> getPedidos() {
        return pedidos;
    }

    public double getCuenta() {
        return cuenta;
    }

    public int getPersonasSentadas() {
        return personasSentadas;
    }

    public void pedirComida() {

        System.out.println("¿Que desea pedir?");
        System.out.println("1) Cafe,  2) Empanada,  3) Flan, 4) Mousse de chocolate, 5) Panqueque, 6) Papas Fritas, 7) Hamburguesa");
        int opcion = Integer.parseInt(input.nextLine());
        switch (opcion) {
            case 1:
                Cafe cafe = new Cafe();
                this.cuenta += cafe.getPrecio();
                pedidos.add(cafe);
                break;
            case 2:
                Empanada empanada = new Empanada();
                this.cuenta += empanada.getPrecio();
                pedidos.add(empanada);
                break;
            case 3:
                Flan flan = new Flan();
                this.cuenta += flan.getPrecio();
                pedidos.add(flan);
                break;
            case 4:
                MousseChocolate mousse = new MousseChocolate();
                this.cuenta += mousse.getPrecio();
                pedidos.add(mousse);
                break;
            case 5:
                Panqueque = new Panqueque();
                this.cuenta += panqueque.getPrecio();
                pedidos.add(panqueque);
                break;
            case 6:
                PapasFritas papas = new PapasFritas();
                this.cuenta += papas.getPrecio();
                pedidos.add(papas);
                break;
            case 7:
                Hamburguesa hamburguesa = new Hamburguesa();
                this.cuenta += hamburguesa.getPrecio();
                pedidos.add(hamburguesa);
                break;
            default:
                System.out.println("Ingrese una opción válida");
                break;
        }

    }

    public void setPersonasSentadas(int personasSentadas) {
        this.personasSentadas = personasSentadas;
    }

    public void pedirCuenta() {
        System.out.println("El total de la cuenta a pagar es: " + cuenta);
        this.cuenta = 0;
    }

    @Override
    public String toString() {
       
        return getPersonasSentadas();
    }
}
