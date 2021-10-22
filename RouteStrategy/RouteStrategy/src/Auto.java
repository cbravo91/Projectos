public class Auto implements Transport{

    @Override
    public void empezarViaje() {
        System.out.println("Voy en auto");
    }

    @Override
    public void avanzar() {
        System.out.println("Acelerando...");
        
    }

    @Override
    public void frenar() {
        System.out.println("frenando...");
        
    }

    @Override
    public void doblarAIzquierda() {
        System.out.println("doblo a la izquierda");
        
    }

    @Override
    public void doblarADerecha() {
        System.out.println("doblo a la derecha");
        
    }

    @Override
    public void terminarViaje() {
        System.out.println("Llegué!");
        
    }
    
}
