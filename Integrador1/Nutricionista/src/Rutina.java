public class Rutina {
    private AC AlmuerzoCena;
    private Colacion colacion;
    private Merienda merienda;
    private Bebida bebida;
    
    public Rutina (AC AlmuerzoCena, Colacion colacion,Merienda merienda, Bebida bebida){

        this.AlmuerzoCena=AlmuerzoCena;
        this.colacion=colacion;
        this.merienda= merienda;
        this.bebida=bebida;
    }

    public void setAlmuerzoCena(AC almuerzoCena) {
        AlmuerzoCena = almuerzoCena;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
    public void setColacion(Colacion colacion) {
        this.colacion = colacion;
    }
    public void setMerienda(Merienda merienda) {
        this.merienda = merienda;
    }
    
   
}
