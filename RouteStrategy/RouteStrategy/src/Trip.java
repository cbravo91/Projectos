public class Trip {
    Transport transporte;
    public Trip(Transport trans){
        this.transporte= trans;
    }

    public Transport getTransporte() {
        return transporte;
    }
    public void setTransporte(Transport transport){
        this.transporte=transport;
    }
    public void empiezaViaje(){
        this.transporte.empezarViaje();
    }

 
    public void adelante() {
      this.transporte.avanzar();
    }

    public void detenerse() {
        this.transporte.frenar();
        
    }

    
    public void izquierda() {
      this.transporte.doblarAIzquierda();
        
    }

    
    public void derecha() {
       this.transporte.doblarADerecha();
        
    }
    public void finalizarViaje(){
        this.transporte.terminarViaje();
    }
}
