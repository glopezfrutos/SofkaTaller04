package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio6 {
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
     * Presenta el menú de opciones al usuario,
     *
     * @param args none
     * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
     * @since 01.00.00
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;

        // Menú
        while (!exit) {
            //Opciones
            System.out.println();
            System.out.println("Menú de opciones:");
            System.out.println("1. Introducir números.");
            System.out.println("2. Salir.");
            System.out.println();
            System.out.println("Introducir el número de opción elegida:");

            // Comprueba que el usuario ingrese un número y llama a los métodos correspondientes.
            try {
                option = scan.nextInt();
                switch (option) {
                    case 1 -> intro();
                    case 2 -> exit();
                    default -> System.out.println("Elija una opción entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, elija una de las siguientes opciones:");
                scan.next();
            }
        }
        System.out.println("El programa ha finalizado.");
    }

    /**
     * Crea el vector con los datos introducidos por el usuario.
     * Chequea que ingrese solo números enteros.
     *
     * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
     * @since 01.00.00
     */
    public static void intro() {
        Scanner scan = new Scanner(System.in);
        Vector v1 = new Vector();

        System.out.println();
        System.out.println("Tocar enter después de ingresar cada número:");

        int i = 0;
        boolean hasToRetry;

        // Toma el primer número
        do {
            try {
                v1.insertElementAt(scan.nextInt(), i);
                i++;
                hasToRetry = false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese sólo números enteros.");
                hasToRetry = true;
                scan.next();
            }
        } while (hasToRetry);

        // Toma los números siguientes
        do {
            do {
                try {
                    v1.insertElementAt(scan.nextInt(), i);
                    i++;
                    hasToRetry = false;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese sólo números enteros.");
                    hasToRetry = true;
                    scan.next();
                }
            } while (hasToRetry);
        } while (v1.get(i - 1) != v1.get(i - 2));

        System.out.println();
        System.out.println("Los números ingresados son:");
        System.out.println(v1);
        System.out.println();
    }
}
