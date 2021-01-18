
package PracticaPrimerSemana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        Puerto puerto = new Puerto();
        System.out.println("******************************************");
        System.out.println(
                "Aclaraciones para su buen funcionamiento: \n Primero tiene que ingresar varios barcos para poder generar un alquiler,\n luego genera un par de alquileres \n y ahi podra usar todas las funcionalidades sin ningun tipo de problema. ");
        System.out.println("******************************************");
        do {
            System.out.println("Bienvenido al sistema del puerto de barcos");

            System.out.println(
                    "1) Mostrar Lista de Barcos \n2) Mostrar lista de alquileres \n3) Agregar un barco. \n4) Generar un Alquiler. "
                            + "\n5) Mostrar el mayor alquiler. \n6) Mostrar el menor alquiler. \n7) Mostrar el promedio de alquileres. \n0) Salir del sistema.");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(puerto.mostrarBarcos());
                    break;
                case 2:
                    System.out.println(puerto.mostrarAlquileres());

                    break;
                case 3:
                    System.out.println("Para agregar un barco primero tiene que ingresar unos datos");
                    System.out.println("*Ingrese la matricula del barco:");
                    int matricula = teclado.nextInt();
                    System.out.println("*Ingrese la eslora en metros del barco:");
                    int eslora = teclado.nextInt();
                    System.out.println("*Ingrese el anio de fabricacion del barco:");
                    int anioFabricacion = teclado.nextInt();

                    System.out.println("Para continuar debe elegir un tipo de barco: "
                            + "\n1) Velero. \n2) Deportivo a motor. \n3) Yate de lujo");
                    int opcion2 = teclado.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("*Ingrese la cantidad de numero de mastiles:");
                            int numeroMastiles = teclado.nextInt();
                            Velero velero = new Velero(matricula, eslora, anioFabricacion, numeroMastiles);
                            puerto.agregarBarco(velero);
                            break;
                        case 2:
                            System.out.println("*Ingrese la potencia en CV:");
                            int potenciaCVDeportivo = teclado.nextInt();
                            Deportivo deportivo = new Deportivo(matricula, eslora, anioFabricacion, potenciaCVDeportivo);
                            puerto.agregarBarco(deportivo);
                            break;
                        case 3:
                            System.out.println("*Ingrese la potencia en CV:");
                            int potenciaCVYate = teclado.nextInt();
                            System.out.println("*Ingrese el numero de camarotes del Yate:");
                            int numeroCamarotes = teclado.nextInt();
                            Yate yate = new Yate(matricula, eslora, anioFabricacion, potenciaCVYate, numeroCamarotes);
                            puerto.agregarBarco(yate);
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("*Ingrese el nombre del cliente:");
                    String nombreCliente = teclado.next();
                    System.out.println("*Ingrese el Dni del cliente:");
                    Long dniCliente = teclado.nextLong();
                    System.out.println("*Ingrese la fecha Incial del alquiler (en dias):");
                    int fechaInicial = teclado.nextInt();
                    System.out.println("*Ingrese la fecha Final del alquiler (en dias):");
                    int fechaFinal = teclado.nextInt();
                    System.out.println("*Ingrese la pocision de amarre:");
                    int posicionAmarre = teclado.nextInt();

                    System.out.println(
                            "A continuacion le mostraremos los barcos disponibles en la base de datos. \nPor favor ingrese el ID del barco que desea ingresar al Alquiler: ");
                    System.out.println(" \n" + puerto.mostrarBarcos() + "\n ");
                    int idBarco = teclado.nextInt();
                    puerto.generarAlquiler(nombreCliente, dniCliente, fechaInicial, fechaFinal, posicionAmarre, idBarco);
                    break;
                case 5:
                    System.out.println("El mayor alquiler: \n" + puerto.mostrarMayorAlquiler());
                    break;
                case 6:
                    System.out.println("El menor alquiler: \n" + puerto.mostrarMenorAlquiler());
                    break;
                case 7:
                    System.out.println("El promemdio mensual de alquileres es de " + puerto.promedio());
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro sistema, nos vemos la proxima!");
                    break;
                default:
                    System.out.println("Opcion incorrecta por favor ingrese de nuevo una opcion");
                    break;
            }
        } while (opcion != 0);
    }
}
