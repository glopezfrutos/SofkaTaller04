package ejercicio3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Genera un array de números aleatorios y los ordena por el algoritmo de la
 * burbuja o quick sort, según elija el usuario.
 *
 * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
 * @version 01.00.00 2022-02-22
 * @since 01.00.00
 */
public class Ejercicio3 {
    /**
     * Atributo booleano, para interrumpir la ejecución del programa.
     */
    public static boolean exit = false;


    /**
     * Presenta el menú de opciones al usuario, quien debe elegir la cantidad de
     * números en el array y el algoritmo para ordenarlo.
     *
     * @param args none
     * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
     * @since 01.00.00
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        int quantity = 0;

        System.out.println();
        System.out.println("Se generará una serie de números aleatorios.");

        // Comprueba que la entrada del usuario sea un entero mayor a 0.
        do {
            try {
                System.out.println("Ingrese la cantidad de números que desea generar:");
                quantity = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor elegir un número entero mayor a 0.");
                scan.next();
            }
        } while (quantity <= 0);

        // Genera el array y lo muestra al usuario.
        int[] randomArray = generateRandomArray(quantity);
        System.out.println(Arrays.toString(randomArray));


        // Menú para que elija el algoritmo de orden.
        System.out.println();
        System.out.println("Por favor, elija una de las siguientes opciones para ordenarlos:");
        while (!exit) {
            //Opciones
            System.out.println("1. Mediante el algoritmo de la burbuja");
            System.out.println("2. Mediante quick sort");
            System.out.println("3. Salir.");
            System.out.println();
            System.out.println("Introducir el número de opción elegida:");
            System.out.println();

            // Comprueba que el usuario ingrese un número y llama a los métodos correspondientes.
            try {
                option = scan.nextInt();
                switch (option) {
                    case 1 -> {
                        bubbleSort(randomArray);
                        System.out.println(Arrays.toString(randomArray));
                        exit();
                    }
                    case 2 -> {
                        quicksort(randomArray, 0, randomArray.length - 1);
                        System.out.println(Arrays.toString(randomArray));
                        exit();
                    }
                    case 3 -> exit();
                    default -> System.out.println("Elija una opción entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor elegir un número");
                scan.next();
            }
        }
        System.out.println("El programa ha finalizado.");
    }

    /**
     * Genera un array de números aleatorios entre 0 y 100.
     *
     * @param quantity Establece la cantidad de números del array
     * @return Devuelve el array de números aleatorios entre 0 y 100.
     *
     * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
     * @since 01.00.00
     */
    public static int[] generateRandomArray(int quantity) {
        int[] randomArray = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            randomArray[i] = ((int) Math.floor(Math.random() * 100));
        }
        return randomArray;
    }

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
     * Algoritmo de burbuja: ordena los números de un array.
     *
     * @param array array de números para ordenar.
     *
     * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
     * @since 01.00.00
     */
    static void bubbleSort(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * Algoritmo Quicksort: ordena los números de un array.
     *
     * @param array array de números para ordenar.
     * @param left es igual a 0.
     * @param right es igual al length del array menos 1.
     *
     * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
     * @since 01.00.00
     */
    public static void quicksort(int[] array, int left, int right) {
        int pivot = array[left];                     // tomamos primer elemento como pivote
        int i = left;                                // i realiza la búsqueda de izquierda a derecha
        int j = right;                               // j realiza la búsqueda de derecha a izquierda
        int aux;
        while (i < j) {                              // mientras no se crucen las búsquedas
            while (array[i] <= pivot && i < j) i++;  // busca elemento mayor que pivote
            while (array[j] > pivot) j--;            // busca elemento menor que pivote
            if (i < j) {                             // si no se han cruzado
                aux = array[i];                      // los intercambia
                array[i] = array[j];
                array[j] = aux;
            }
        }
        array[left] = array[j];                      // se coloca el pivote en su lugar de forma que tendremos
        array[j] = pivot;                            // los menores a su izquierda y los mayores a su derecha
        if (left < j - 1)
            quicksort(array, left, j - 1);      // ordenamos subarray izquierdo
        if (j + 1 < right)
            quicksort(array, j + 1, right);      // ordenamos subarray derecho
    }
}
