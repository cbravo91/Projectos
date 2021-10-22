import java.text.SimpleDateFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*
        Escalabilidad: La capacidad de una solución tecnológica
        de crecer o aumentar sus recursos.
        - Horizontal: Añadir componentes que aumentan recursos.
        - Vertical: Aumentar componentes ya existentes, que hacen a los recursos más grandes.

        ANALISIS
        Clases principales:
        - Sustancia
        - Usuario
        - Tramite

        - Simple
        - Compuesta
        - Productor
        - Auditor
        - Consumidor
         */
        
        SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/yyyy"); 
        Auditor auditor= new Auditor("Jorge", "Rapallini", 43,dateformat.parse("24/05/2018"), "20-25647890-4", "1234Abc");
        Productor productor= new Productor("Sebastian","Ramirez",dateformat.parse("12/10/2013"),"34-27323455-5","DQsggwQ");
        Consumidor consumidor = new Consumidor("Rafael", "Savino", 38, dateformat.parse("02/09/2019"), "20-30234523-4", "apcC1234", dateformat.parse("15/11/2020"));
     
        Simple  sustancia = new Simple("NaCl","Cloruro de Sodio", 55.5f,"azul");
        auditor.crearSustancia(sustancia);

        Compuesta compuesta = new Compuesta("CO2","Dioxido de carbono",34.8f);
        auditor.crearSustancia(compuesta);

        System.out.println("Ingrese la sustancia a eliminar");
        Scanner input= new Scanner(System.in);
        String sustanciaABorrar= input.nextLine(); 
        auditor.borrarSustancia(sustanciaABorrar);
      auditor.informaraUsuarios();
      
            Sustancia sustancia2= new Compuesta("O2", "oxigeno", 98.0f);

                    productor.crearSustancia(sustancia2, 300);
                    int cantidad=400;
                    Tramite  tramite = new Tramite(cantidad, sustancia, productor);
                    productor.administrarTramite(tramite);

                int nTramite=0;
                Sustancia compuesta2= new Compuesta("CO2", "dioxido de carbono", 30);
                 nTramite= consumidor.iniciarTramite(compuesta2,32,productor);

                consumidor.cerrarTramite(nTramite);
    
    }
    public static void print(String mensaje){
        System.out.print(mensaje);
    }
    public static void println(String mensaje){
        System.out.println(mensaje);
    }
}
