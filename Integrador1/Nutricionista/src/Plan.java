import java.util.ArrayList;
public class Plan {
    private int edad;
   private String observaciones;
   private Calificacion calificacion;
   private int pesoActual;
   private float cinturaActual;
   private ArrayList<String> colacionesYbebidas;
   private Duracion duracion;
   private ArrayList<String> objetivos;
   private Rutina rutinas[];
  
   public enum Duracion{ 
       SEMANAL(7), QUINCENAL(14), MENSUAL(21);
       private int dias;
       private Duracion(int dias)
       {
           this.dias=dias;
       }
       public int getDias() {
           return dias;
       }
   }

   public enum Calificacion{

       EXCELENTE("excelente",3), BUENA("buena",2), REGULAR("regular",1);
       private String calificacion;
       private int numeral;
       private Calificacion (String c, int n){
        this.calificacion = c;
        this.numeral=n;
    }
    public String getCalificacion() {
        return this.calificacion;
    }
    public int getNumeral() {
        return this.numeral;
    }
   }

    public Plan(int edad,int peso, float cintura,int duracion){
        this.edad= edad;
        this.pesoActual=peso;
        this.cinturaActual= cintura;
        this.inicializar(duracion);
    }
public void agregarRutina(Rutina rutina){
for (int i=0; i<rutinas.length;i++) {
    if (rutinas[i]==null)
    rutinas[i]=rutina;
    break;
}

}

    private void inicializar(int duracion){
        this.rutinas= new Rutina[duracion];
        this.objetivos= new ArrayList<String>();
        this.colacionesYbebidas= new ArrayList<String>();
        switch(duracion){
            case 7:
                this.duracion= Duracion.SEMANAL;
                break;
            case 14:
                this.duracion= Duracion.QUINCENAL;
            case 30:
                this.duracion=Duracion.MENSUAL;
        }
    }

    public void calificar (String calificacion)
    {
        calificacion= calificacion.trim().toLowerCase();
        switch(calificacion)
        {
            case "excelente":
            this.calificacion= Calificacion.EXCELENTE;
            break;
            case "buena":
            this.calificacion= Calificacion.BUENA;
            break;
            case "regular":
            this.calificacion= Calificacion.REGULAR;
            break;
        }
    }
    public void agregarColacion(String colacion){
        this.colacionesYbebidas.add(colacion);
    }
    public void agregarBebida(String bebida){
        this.colacionesYbebidas.add(bebida);
    }
    public Calificacion getCalificacion() {
        return calificacion;
    }

    public Rutina[] getRutinas() {
        return rutinas;
    }
    public void establecerObjetivo(String objetivo){
        this.objetivos.add(objetivo);
    }
    public void estabecerObjetivos(ArrayList<String> objetivos)
    {
        this.objetivos.addAll(objetivos);
    }

    public void realizarObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    public ArrayList<String> getObjetivos() {
        return objetivos;
    }
public void setCalificacion(Calificacion calificacion) {
    this.calificacion = calificacion;
}
}
