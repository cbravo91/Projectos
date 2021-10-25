public abstract class Pieza implements JuegaPieza{
    String color;
    
    public Pieza(String color){
        this.color=color;

    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
