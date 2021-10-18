package Clase3.Clase3.src;

public abstract class Salada extends Comidas {
    private final int cantidadSal;

    public int getCantidadSal() {
        return cantidadSal;
    }

    public Salada(double precio, int cantidadSal, String plato) {
        super(precio, plato);
        this.cantidadSal = cantidadSal;
    }

    public Salada(Comidas comida, int cantidadSal) {
        super(comida.getPrecio(), comida.getPlato());
        this.cantidadSal = cantidadSal;
    }

}
