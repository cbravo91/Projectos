public class Mover {
    private JuegaPieza pieza;
    
    public Mover(JuegaPieza pieza){
        this.pieza=pieza;
    }


    public void setPieza(JuegaPieza pieza) {
        this.pieza = pieza;
    }

    public void moverPieza(){
        this.pieza.comportamiento();
    }
}
