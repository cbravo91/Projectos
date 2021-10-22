import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;


public class Productor extends Usuario implements IRenovarDatos{
    private Date fechaRenovacion;
    private HashMap<Sustancia,Integer> sustancias;
    Scanner input= new Scanner(System.in);

    public Productor(String nombre, Date fechaAlta,String cuil,String pass) {
        super(nombre,fechaAlta,cuil,pass);
      this.fechaRenovacion= new Date();
      this.sustancias= new HashMap<Sustancia,Integer>();
    }

    public Productor(String nombre,String apellido, Date fechaAlta,String cuil,String pass) {
        super(nombre,fechaAlta,cuil,pass);
      this.fechaRenovacion= new Date();
      this.sustancias= new HashMap<Sustancia,Integer>();
    }




    public void crearSustancia(Sustancia sustancia,Integer cantidad){
        this.sustancias.put(sustancia, cantidad);
System.out.println("Se creó sustancia "+ sustancia.getNombre());
    }

    public void aceptarTramite(int nTramite){

// que haya stock de las sustancias, y que el productor tenga dicha sustancia.
    }

    public void administrarTramite(Tramite tramite)
    {
        // verificar que la misma sustancia la tenga el productor en el hash y ver que su cantidad esté disponible
        //si está todo ok devolver aceptarTramite, else rechazarTramite
        System.out.println("Ingrese la sustancia a cargar");
        String nombreSustancia=  input.nextLine();
        System.out.println("Ingrese la cantidad a cargar");
        int cantidad = input.nextInt();
        Sustancia sustancia= new Simple(nombreSustancia,"sustanciaX",24.4f,"rosa"); 
            
            if(this.sustancias.containsKey(sustancia.getNombre())&& (cantidad< tramite.getCantidad())){
                 aceptarTramite(tramite.getNumeroTramite()); 
                 System.out.println("Se aceptó el trámite");
             }    
             else {rechazarTramite(tramite.getNumeroTramite());
                System.out.println("Se rechazó el trámite");
            }

        }
            
        
    
    public String rechazarTramite(int nTramite){
        
        System.out.println("Indique el motivo de rechazo");
        String motivo= input.nextLine();
        return ("Se rechazó el tramite "+nTramite+" debido a "+motivo);
    }

    @Override
    public void renovarDatos(String dni) {
        String [] splitted = this.getCuil().split("-");
        if (!splitted[1].equals(dni))
        this.setCuil(splitted[0]+"-"+dni+"-"+splitted[2]);
        this.renovarFecha();
    
        
    }
 @Override
    public void renovarFecha()
    {
        this.fechaRenovacion= Calendar.getInstance().getTime();
    }
@Override
public void renovarDatos() {

}

}
    
    

