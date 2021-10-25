public class App {
    public static void main(String[] args) throws Exception {
        Telefono phone= new Telefono();

        phone.realizarLlamada("1342345623");
        phone.minutosTotales();
        phone.realizarLlamada("9023467324");
        phone.getAgenda().agregarContacto("Pablo", "+541116434546");
        phone.getAgenda().mostrarContactos();
        phone.mostrarLlamadas();
    }
}
