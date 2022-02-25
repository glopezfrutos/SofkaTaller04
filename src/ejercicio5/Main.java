package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ejercicio5.Bike.getBikeCount;
import static ejercicio5.Boat.getBoatCount;
import static ejercicio5.Car.getCarCount;
import static ejercicio5.Motorcycle.getMotorcycleId;
import static ejercicio5.Truck.getTruckCount;
import static ejercicio5.Vehicle.getVehicleCount;

public class Main {
        /**
         * Atributo booleano, para interrumpir la ejecución del programa.
         */
        public static boolean exit = false;

        /**
         * Interrumpe la ejecución del programa
         *
         * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
         * @since 01.00.00
         */
        public static void exit() {
            System.out.println("Saliendo...");
            exit = true;
        }

        /**
         * Presenta el menú de opciones al usuario, para crear Vehículos y listar
         * la cantidad creada.
         *
         * @param args none
         * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
         * @since 01.00.00
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int option;

            // Menú
            System.out.println();
            System.out.println("Por favor, elija una de las siguientes opciones:");
            while (!exit) {
                //Opciones
                System.out.println("1. Dar de alta una moto.");
                System.out.println("2. Dar de alta un camión.");
                System.out.println("3. Dar de alta una bicicleta.");
                System.out.println("4. Dar de alta un bote.");
                System.out.println("5. Dar de alta un auto.");
                System.out.println("6. Consultar los vehículos cargados.");
                System.out.println("7. Salir.");
                System.out.println();
                System.out.println("Introducir el número de opción elegida:");
                System.out.println();

                // Comprueba que el usuario ingrese un número y llama a los métodos correspondientes.
                try {
                    option = scan.nextInt();
                    switch (option) {
                        case 1 -> new Motorcycle();
                        case 2 -> new Truck();
                        case 3 -> new Bike();
                        case 4 -> new Boat();
                        case 5 -> new Car();
                        case 6 -> System.out.println("Actualmente hay " + getVehicleCount() + " vehículos creados, de los cuales\n"
                                + getMotorcycleId() + " son motos,\n"
                                + getTruckCount() + " son camiones,\n"
                                + getBikeCount() + " son bicicletas,\n"
                                + getBoatCount() + " son botes,\ny "
                                + getCarCount() + " son autos.\n");
                        case 7 -> exit();
                        default -> System.out.println("Elija una opción entre 1 y 3");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, elija una de las siguientes opciones:");
                    scan.next();
                }
            }
            System.out.println("El programa ha finalizado.");
        }



    }