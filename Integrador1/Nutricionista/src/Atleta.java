import java.util.Scanner;
public class Atleta extends Usuario{

private String disciplina;
private String sexo;
private int edad;
private int peso;
private Plan plan;
private int cintura;

    public Atleta(String nombre, String apellido,String sexo,int edad) {
        super(nombre, apellido);
        this.sexo=sexo;
        this.edad=edad;
        this.disciplina=disciplina;
        this.cintura=cintura;

    }

    public Atleta(String nombre, String apellido,String sexo,int edad, int cintura) {
        super(nombre, apellido);
        this.sexo=sexo;
        this.edad=edad;
        this.disciplina=disciplina;
        this.cintura=cintura;

    }

    public void seguirPlan(Rutina rutina){
        rutina=this.cargarRutina();
        this.plan.agregarRutina(rutina);
    }

    public Rutina cargarRutina(){
       Rutina rutina;
      
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el almuerzo/cena");
        String descripcion= (input.nextLine());
        
        return new Rutina(new AC(descripcion, 1, 0, 0), new Colacion("barra de cereal"), new Merienda("Manzana"), new Bebida("Jugo de Naranja"));
    }
    
    public int getPeso() {
        return peso;
    }
    public int getEdad() {
        return edad;
    }
    public Plan getPlan() {
        return plan;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public int getCintura() {
        return cintura;
    }
}
