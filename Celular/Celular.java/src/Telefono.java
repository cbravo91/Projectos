import java.util.Stack;

public class Telefono {
    private Stack<Registro> llamadas;
    private Agenda agenda;

    public Telefono(){
        this.llamadas= new Stack<Registro>();
        this.agenda= new Agenda();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public int realizarLlamada(String numero){
        
        int minutos=123;
        System.out.println("Llamando a ..."+ numero);
        llamadas.push(new Registro(numero, minutos));
        System.out.println("Minutos totales "+minutosTotales());
        return (minutos+minutosTotales());
        
    }

    public int minutosTotales(){
         int minutos=0;
         for (Registro registro : llamadas) {
             minutos+= registro.getMinutos();
         }   
        
      return minutos;
    }
    public void mostrarLlamadas(){
        for (Registro registro : llamadas) {
            System.out.println("Llamada a: "+registro.getNumero()+" Minutos: "+ registro.getMinutos());  
        }
        
    }
}
