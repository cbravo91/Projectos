public class App {
    public static void main(String[] args) throws Exception {
       Administrador admin= Administrador.getAdmin();
       Profesional pro= new Profesional("Pablo", "Rentería", "Nutricionista");
       Atleta cliente= new Atleta("Jorge", "Lobos", "Masculino", 24, 130);
       Rutina rutina=cliente.cargarRutina();
       pro.crearPlan(cliente).agregarRutina(rutina);


       
    }
}
