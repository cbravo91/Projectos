import java.util.Stack;

public class Registro {
   private String numero;
   private double minutos; 


public Registro(String numero, double minutos)
{
    this.numero= numero;
    this.minutos= minutos;
}

public String getNumero() {
    return numero;
}
public double getMinutos() {
    return minutos;
}

}
