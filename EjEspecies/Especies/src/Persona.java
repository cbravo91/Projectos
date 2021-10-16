import java.util.Vector;

public class Persona implements IServivo{
private String nombre;
private String edad;
private Vector<IComida> alimento= new Vector<IComida>();

public Persona(String nombre, String edad){
    this.nombre=nombre;
    this.edad=edad;
}
    @Override
    public void respirar() {
  
    }

    @Override
    public void comer() {
  
    }

    @Override
    public void hacerRuido() {

    }

    @Override
    public void caminar() {
        
    }
    public String getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
}
