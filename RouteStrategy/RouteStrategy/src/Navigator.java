public class Navigator {
    
    public void realizarViaje(Trip viaje){
        double distancia=Math.random()*(Math.random()*100);
        
      System.out.println("La distancia es de: "+distancia+" km");
        if (distancia<=1)
            System.out.println("Deberá caminar ");
        else if(distancia>1 && distancia <20)
        {
            System.out.println("Puede tomarse el colectivo");
            viaje.setTransporte(new PublicTransport("Colectivo"));
        }else if(distancia>20)
        {   System.out.println("Vamos en auto");
            viaje.setTransporte(new Auto());
        }
        viaje.empiezaViaje();
        viaje.adelante();
        viaje.derecha();
        viaje.izquierda();
        viaje.detenerse();
        viaje.adelante();
        viaje.finalizarViaje();
        
        
    }
}
