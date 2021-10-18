package Clase3.Clase3.src;

public abstract class Dulce extends Comidas {
    private final boolean azucar;

    public Dulce(double precio, boolean azucar, String plato) {
        super(precio, plato);
        this.azucar = azucar;
    }

    public boolean isAzucar() {
        return azucar;
    }
}
