package ejercicio4;

import java.util.*;


/**
 * Representa un vehículo genérico.
 *
 * @version 01.00.00 2022-02-22
 * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
 * @since 01.00.00
 */
public class Vehicle {
    // Atributos
    /**
     * Representa la cantidad de vehículos instanciados.
     */
    private static int vehicleCount;

    /**
     * Representa la cantidad de pasajeros a bordo.
     */
    private int passengerCount;

    /**
     * Representa si la tripulación está a bordo.
     */
    private boolean crew;

    /**
     * Representa la cantidad de ruedas
     */
    private int wheelsCount;

    /**
     * Representa el año de matriculación del vehículo.
     */
    private int matYear;

    /**
     * Representa el medio a través del cuál transita (terrestre, aéreo, marítimo)
     */
    private String environment;


    //Getters and Setters.
    /**
     * Devuelve la cantidad de pasajeros a bordo.
     */
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * Define la cantidad de pasajeros a bordo.
     */
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    /**
     * Devuelve si la tripulación está a bordo.
     */
    public boolean isCrew() {
        return crew;
    }

    /**
     * Define si la tripulación está a bordo.
     */
    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    /**
     * Devuelve la cantidad de ruedas
     */
    public int getWheelsCount() {
        return wheelsCount;
    }

    /**
     * Define la cantidad de ruedas
     */
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    /**
     * Devuelve el año de matriculación del vehículo.
     */
    public int getMatYear() {
        return matYear;
    }

    /**
     * Define el año de matriculación del vehículo.
     */
    public void setMatYear(int matYear) {
        this.matYear = matYear;
    }

    /**
     * Devuelve el medio a través del cual se transporta (terrestre, aéreo, marítimo)
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Define el medio a través del cual se transporta (terrestre, aéreo, marítimo)
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    //Constructor

    /**
     * Constructor de Vehículo.
     * Se inicia con 0 pasajeros y sin la tripulación a bordo.
     *
     * @param wheelsCount Se debe indicar la cantidad de ruedas (int).
     * @param matYear Se debe indicar el año de matriculación (int).
     * @param environment Se debe indicar el medio a través del cual se transporta,
     *                    si es terrestre, aéreo, marítimo, etcétera (String).
     *
     * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
     * @since 01.00.00
     */
    public Vehicle(int wheelsCount, int matYear, String environment) {
        this.passengerCount = 0;
        this.crew = false;
        this.wheelsCount = wheelsCount;
        this.matYear = matYear;
        this.environment = environment;
        vehicleCount++;
    }


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
            System.out.println("1. Dar de alta un vehículo.");
            System.out.println("2. Consultar los vehículos cargados.");
            System.out.println("3. Salir.");
            System.out.println();
            System.out.println("Introducir el número de opción elegida:");
            System.out.println();

            // Comprueba que el usuario ingrese un número y llama a los métodos correspondientes.
            try {
                option = scan.nextInt();
                switch (option) {
                    case 1 -> new Vehicle(4, 2022, "terrestre");
                    case 2 -> System.out.println("Actualmente hay " + vehicleCount + " vehículos creados.");
                    case 3 -> exit();
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
