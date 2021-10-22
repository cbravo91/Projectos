public class Apie implements Transport{

    @Override
    public void empezarViaje() {
       System.out.println("Empiezo a caminar...");
        
    }

    @Override
    public void avanzar() {
        System.out.println("Vamos a caminar...");
        
    }

    @Override
    public void frenar() {
        System.out.println("Me detengo");
        
    }

    @Override
    public void doblarAIzquierda() {
        System.out.println("Voy a la izquierda");
        
    }

    @Override
    public void doblarADerecha() {
        System.out.println("Voy a la derecha");        
    }

    @Override
    public void terminarViaje() {
        System.out.println("Llegué!!");
        
    }
    
}
