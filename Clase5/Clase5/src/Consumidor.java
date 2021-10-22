import java.util.Date;
import java.util.Scanner;
public class Consumidor extends Usuario implements IRenovarDatos{
    private Date fechaRenovacion;
    public Consumidor(String nombre, String apellido, int edad, Date fechaAlta,String cuil,String pass, Date renovacion) {
        super(nombre, apellido, edad, fechaAlta, cuil,pass);
        this.fechaRenovacion=renovacion;

    }



  
        public int iniciarTramite(Sustancia sustancia, int cantidad, Productor productor){

            Tramite tramite = new Tramite(cantidad, sustancia,productor);
    
            solicitarSustancias(tramite);
            return tramite.getNumeroTramite();
        }
        
    
    private void solicitarSustancias(Tramite tramite){

        

    }
  
    public void cerrarTramite(int nTramite){

    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }
public void setFechaRenovacion(Date fecha) {
    this.fechaRenovacion = fecha;
}
    
    public Tramite altaTramite(Date fechaInicio, Sustancia sustanciaSolicitada, int cantidadSolicitada, Productor productor){

return new Tramite(cantidadSolicitada, sustanciaSolicitada, productor);
    }

    @Override
    public void renovarDatos() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void renovarDatos(String dni) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void renovarFecha() {
        // TODO Auto-generated method stub
        
    }
}
