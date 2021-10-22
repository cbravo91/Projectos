import java.util.Vector;

public class Compuesta extends Sustancia {
private Vector<Simple>  composicion;
    public Compuesta(String nombre, String compo, float pureza) {
        super(nombre, compo, pureza);
        this.composicion= new Vector<Simple>();
    }
    public Compuesta(String nombre, String compo, float pureza, Vector<Simple> composicion) {
        super(nombre, compo, pureza);
        this.composicion= composicion;
    }

    public void compooner (Simple simple){
        this.composicion.add(simple);
    }
    public Vector <Simple> descomponer(){
        Vector<Simple> temp= this.composicion;
        composicion.clear();
        return temp;
    }
    public void descomponer(Simple simple){
        for (Simple temporal : this.composicion) {
            if(temporal.getFormula().equals(simple.getFormula()))
            this.composicion.remove(temporal);
        }
            
    }
    public void descomponer(Vector <Simple> simples)
    {
        for (Simple simple : simples) {
            this.descomponer(simple);
        }
    }
    
}
