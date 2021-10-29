import java.util.Scanner;



import java.util.ArrayList;
public class Profesional extends Usuario{
  private  String especialidad,matricula;
  private ArrayList<Plan> planes;
 

    public Profesional(String nombre, String apellido, String especialidad,String matricula){

        super(nombre,apellido);
        this.especialidad=especialidad;
        this.matricula=matricula;
        this.inicializar();
       
    }
    public Profesional(String nombre, String apellido, String especialidad){

        super(nombre,apellido);
        this.especialidad=especialidad;
        this.inicializar();
       
    }
    private void inicializar(){
        planes= new ArrayList<Plan>();
    }

    public Plan crearPlan(Atleta atleta){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Elija un plan 7 semana, 14 quincenal 30 mensual");
    int eligePlan=Integer.parseInt(input.nextLine());
    Plan plan = new Plan(atleta.getEdad(), atleta.getPeso(), atleta.getCintura(),eligePlan);
    planes.add(plan);
    return plan;
    }

}
