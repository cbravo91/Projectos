import java.util.Date;
import java.util.Vector;
import java.util.Scanner;
public class Auditor extends Usuario{
    private Vector<Sustancia> sustancias;
    private int opcion;
    public Auditor(String nombre, String apellido, int edad, Date fechaAlta,String cuil,String pass) {
        super(nombre, apellido, edad, fechaAlta, cuil,pass);
        this.sustancias= new Vector<Sustancia>();
    }

    public void informaraUsuarios(){
      System.out.println("Se avisa al usuario");
    }

    public Vector<Sustancia> getSustancias() {
        return sustancias;
    }

    public void crearSustancia(Sustancia sustancia){
      sustancias.add(sustancia); 
      System.out.println("Se crea sustancia"+ sustancia.getNombre());
    }

    public void borrarSustancia(String sustanciaABorrar){

        for (Sustancia nodo : sustancias) {
          if(nodo.getNombre().equals(sustanciaABorrar))
         { sustancias.remove(sustanciaABorrar);
          System.out.println("Se borró la sustancia");
          break;}
          
        }
        
    }
}

 
