public class Tortuga extends Animal{
    private String habitat;

public Tortuga(String nutricion, int edad, String sexo, String habitat) {
        super(nutricion, edad, sexo);
        this.habitat=habitat;
        
    }


    @Override
    public void respirar() {
        
    }

    @Override
    public void comer() {
       System.out.println("La mesa está servida");
        
    }

    @Override
    public void hacerRuido() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void caminar() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void consumir() {
        
    }
    
}
