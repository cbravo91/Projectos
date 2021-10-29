import java.util.Scanner;



import java.util.ArrayList;
public class Profesional extends Usuario{
  private  String especialidad,matricula;
  private ArrayList<Plan> planes;
  Scanner input = new Scanner(System.in);
 

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
    
    
    System.out.println("Elija un plan 7 semana, 14 quincenal 30 mensual");
    int eligePlan=Integer.parseInt(input.nextLine());
    Plan plan = new Plan(atleta.getEdad(), atleta.getPeso(), atleta.getCintura(),eligePlan);
    planes.add(plan);
    return plan;
    }

    public void verificarAlmuerzoCena(Plan plan)
    { int rutinaOk= 0;
        System.out.println("¿ 1 Aumentar masa muscular, o 2 quemar grasa?");
        int tipo_rutina= input.nextInt();
        Rutina [] rutinas= plan.getRutinas();
        for (Rutina rutina : rutinas) {
            switch(tipo_rutina)
            {   
                case 1:
                {
               if(rutina.getAlmuerzoCena().getProteinas()== 30 && 
               rutina.getAlmuerzoCena().getCarbohidratos()== 20 && rutina.getAlmuerzoCena().getVegetales() == 50)
               rutinaOk++;

                break;
                }

            case 2:
            {
               if(rutina.getAlmuerzoCena().getProteinas()== 30 && 
               rutina.getAlmuerzoCena().getCarbohidratos()== 0 && rutina.getAlmuerzoCena().getVegetales() == 70)
               rutinaOk++;
                break;
            }
            default:
            {System.out.println("Ingrese una opcion válida");
            break;}
        }
    }
System.out.println("Comidas en regla: "+ rutinaOk+'/'+rutinas.length);

}

public void ponerCalificacion(Plan plan){

    plan.setCalificacion(Plan.Calificacion.EXCELENTE);
}
}
