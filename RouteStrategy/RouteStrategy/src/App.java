import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Navigator navegador= new Navigator();
        Transport apie= new Apie();
        Trip viaje = new Trip(apie);
        
        navegador.realizarViaje(viaje);

        
      /*
      RouteStrategy -> Road, PublicTransport, Walking. Navigator
       */
    }
}
