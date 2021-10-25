public class Alfil extends Pieza implements JuegaPieza {


    public Alfil(String color){
        super(color);
    }
    @Override
    public void comportamiento() {
        System.out.println("Muevo alfil");
        
    }
    
}
