public class Casilla {
    private String posicion;
    private String color;

    public Casilla(String posicion, String color)
    {
        this.posicion=posicion;
        this.color= color;    }

        public String getColor() {
            return color;
        }
        public String getPosicion() {
            return posicion;
        }

        public void setPosicion(String posicion) {
            this.posicion = posicion;
        }
        public void setColor(String color) {
            this.color = color;
        }
}
