public abstract class Sustancia {
    private String nombre,formula;
    private float pureza;
   
    public String getFormula() {
        return formula;
    }
    public String getNombre() {
        return nombre;
    }
    public float getPureza() {
        return pureza;
    }
    public Sustancia (String nombre, String compo, float pureza)
    {
        
        this.nombre= nombre;
        this.formula=compo;
        this.pureza=pureza;
    }
    public void setFormula(String formula) {
        this.formula = formula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPureza(float pureza) {
        this.pureza = pureza;
    }


}
