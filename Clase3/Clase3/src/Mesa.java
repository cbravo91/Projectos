package Clase3.Clase3.src;
import java.util.Scanner;
import java.util.Vector;

public class Mesa {
    private final int capacidad;
    private int personasSentadas;
    private double cuenta;
    private Vector<Comidas> pedidos = new Vector<Comidas>();
    Scanner input = new Scanner(System.in);

    public Mesa(int capacidad) {
        this.capacidad = capacidad;
        this.pedidos = new Vector<Comidas>();
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public Vector<Comidas> getPedidos() {
        return this.pedidos;
    }

    public double getCuenta() {
        return this.cuenta;
    }

    public int getPersonasSentadas() {
        return this.personasSentadas;
    }

    public void pedirComida() {
        
        System.out.println("¿Que desea pedir?");
        System.out.println("1) Cafe,  2) Empanada,  3) Flan, 4) Mousse de chocolate, 5) Panqueque, 6) Papas Fritas, 7) Hamburguesa");
        int opcion = Integer.parseInt(input.nextLine());
       switch (opcion) {
            case 1:
               Cafe cafe = new Cafe(180,true,"cafe");
                this.cuenta += cafe.getPrecio();
                pedidos.add(cafe);
                break;
            case 2:
                Empanada empanada = new Empanada(120,60,"carne");
                this.cuenta += empanada.getPrecio();
                pedidos.add(empanada);
                break;
            case 3:
                Flan flan = new Flan(230,true,"flan con crema");
                this.cuenta += flan.getPrecio();
                pedidos.add(flan);
                break;
            case 4:
                MousseChocolate mousse = new MousseChocolate(300,true,"Mousse de chocolate");
                this.cuenta += mousse.getPrecio();
                pedidos.add(mousse);
                break;
            case 5:
                Panqueque panqueque = new Panqueque(570,true,"Panqueques con dulce de leche");
                this.cuenta += panqueque.getPrecio();
                pedidos.add(panqueque);
                break;
            case 6:
                PapasFritas papas = new PapasFritas(250,30,"Papas Fritas");
                this.cuenta += papas.getPrecio();
                pedidos.add(papas);
                break;
            case 7:
                Hamburguesa hamburguesa = new Hamburguesa(650,50,"Hamburguesa con cheddar");
                this.cuenta += hamburguesa.getPrecio();
                pedidos.add(hamburguesa);
                break;
            default:
                System.out.println("Ingrese una opción válida");
                break;
        }

    }

    public void setPersonasSentadas(int personas) {
        this.personasSentadas = personas;
    }

    public void sentarse(int personas){
        this.personasSentadas+=personas;
    }


    public void pedirCuenta() {
        System.out.println("El total de la cuenta a pagar es: " + cuenta);
        this.cuenta = 0;
    }

}
