public class Peon extends Pieza implements JuegaPieza{


    public Peon(String color){
        super(color);
    }
    @Override
    public void comportamiento() {
        System.out.println("Muevo peon");
        
    }
    

}
