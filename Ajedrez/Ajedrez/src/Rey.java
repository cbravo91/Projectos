public class Rey extends Pieza implements JuegaPieza{

    public Rey(String color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comportamiento() {
      
        System.out.println("Muevo Rey");
    }
    
}
