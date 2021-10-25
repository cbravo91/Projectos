import java.util.ArrayList;
import java.util.Scanner;


public class Agenda {
    private ArrayList<Contacto> contactos;

public Agenda(){
 this.contactos= new ArrayList<Contacto>();
}

public void mostrarContactos(){
    for (Contacto contacto : contactos) {
        System.out.println("Nombre: "+contacto.getNombre()+" Numero: "+contacto.getNumero());
    }
    
}

public void agregarContacto(String nombre, String numero)
{
  this.contactos.add(new Contacto(nombre,numero));
}

public void buscarNumero(){

    Scanner input = new Scanner(System.in);
    System.out.println("ingrese el contacto a buscar");
    String nombre = input.nextLine();
    for (Contacto contacto : contactos) {

        if(contacto.getNombre().equals(nombre)){
            System.out.println("Nombre: "+contacto.getNombre() +contacto.getNumero());
        }
    }
    
}

}
