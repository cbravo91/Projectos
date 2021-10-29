public class AC extends Comida{

    private final int plato = 100;
    private int proteinas, carbohidratos, vegetales;

    public AC(String desc) {
        super(desc);
    }

    public AC(String desc, int prote, int carbo, int vg) {
        super(desc);
        if(verificar(prote, carbo, vg)) {
            this.proteinas = prote;
            this.carbohidratos = carbo;
            this.vegetales = vg;
        }
    }

    private boolean verificar(int a, int b, int c) {
        if((a + b + c) == this.plato) {
            return true;
        }
        return false;
    }

    public int getCarbohidratos() {
        return carbohidratos;
    }

    public int getProteinas() {
        return proteinas;
    }

    public int getVegetales() {
        return vegetales;
    }

    public void setCarbohidratos(int carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public void setVegetales(int vegetales) {
        this.vegetales = vegetales;
    }
    
}
