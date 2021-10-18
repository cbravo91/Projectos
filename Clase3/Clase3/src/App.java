package Clase3.Clase3.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // mostrarMesas(), sentarse(), pedirComida(), pagarCuenta()


        // gsananciaDelDia()
        
  /*Hacer un menu que me deje ver las mesas, sentarme en una mesa indicar numero de personas,pedir comida, pedir la cuenta
después de pedir la cuenta liberar mesa
*/
        boolean abierto = true;
        Scanner input = new Scanner(System.in);
        while (abierto == true) {
            imprimir("¿Que desea realizar?");
            imprimir("1) Ver las mesas disponibles");
            imprimir("2) Sentarse en una mesa");
            imprimir("3) Ver la cantidad de clientes");
            imprimir("4) Pedir comida");
            imprimir("5) Pedir la cuenta");
            imprimir("6) Cerrar restaurante");
            int opcion = Integer.parseInt(input.nextLine());

            Restaurante restaurante = new Restaurante();
            switch (opcion) {

                case 1:
                    restaurante.mostrarMesas();
                    break;
                case 2:
                    imprimir("¿Cuantas personas van a estar sentadas?");
                    int cantSentados = Integer.parseInt(input.nextLine());
                    Mesa mesa= restaurante.elegirMesa(cantSentados);
                    restaurante.sentarse(cantSentados, mesa);
                    
                    break;
                case 3:
                    restaurante.mostrarClientes();
                    break;
                case 4:
                  //  restaurante.pedirComida();
                    break;
                case 5:
                    restaurante.getMesa().pedirCuenta();
                    break;
                case 6:
                    abierto = false;
                    break;
                default:
                    System.out.println("Elija una opción válida");
                    break;
            }
        }

    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
