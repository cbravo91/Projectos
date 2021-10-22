import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Tramite {
    private static final AtomicInteger count= new AtomicInteger();
    private int cantidad, idTramite;
    private Date fecha;
    private HashMap <Sustancia,Integer> mapeo;
    private Sustancia sustancia;
    private Productor productor;

    public Tramite(int cantidad, Sustancia sustancia, Productor productor)
    {
        this.fecha = new Date();
        this.cantidad= cantidad;
        this.sustancia=sustancia;
        this.productor=productor;
        idTramite= count.incrementAndGet();
    }
    public int getNumeroTramite() {
        return idTramite;
    }
    public Date getFecha() {
        return fecha;
    }
    public Sustancia getSustancia() {
        return sustancia;
    }
    public Productor getProductor() {
        return productor;
    }
    public void verTramite(){
        System.out.println("Cantidad: "+this.cantidad+" Sustancia: "+this.sustancia+" Productor: "+this.productor);
    }

    public int getCantidad() {
        return cantidad;
    }

}
