public class PublicTransport implements Transport{
private String nombre;

public  PublicTransport(String nombre){
this.nombre=nombre;
}

public String getNombre() {
    return nombre;
}
    @Override
    public void empezarViaje() {
        System.out.println("Me subí al colectivo");
        
    }

    @Override
    public void avanzar() {
        System.out.println("avanza el colectivo");
        
    }

    @Override
    public void frenar() {
        System.out.println("se detuvo el colectivo");
        
    }

    @Override
    public void doblarAIzquierda() {
        System.out.println("dobla a la izquierda");
        
    }

    @Override
    public void doblarADerecha() {
        System.out.println("dobla a la izquierda");
        
    }

    @Override
    public void terminarViaje() {
        System.out.println("acá me bajo");
        
    }
    
}
