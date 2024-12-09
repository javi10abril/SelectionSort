/**
 * Clase principal para demostrar el uso de SelectionSort y ArrayValidator.
 * Este programa acepta entrada del usuario para crear un array, ordenarlo y buscar un valor.
 * 
 * Autor: Javier Diez Abril
 * Versión: 1.0
 */
package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

/**
 * Constructor predeterminado de la clase Main.
 */
public class Main {

    /**
     * Constructor predeterminado.
     */
    public Main() {
        // Constructor vacío
    }

    /**
     * Método principal para ejecutar el programa.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Javier Diez Abril: ¡He aprendido mucho haciendo el módulo 8 de DAW aunque ha sido difícil!");

        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();

        try {
            validator.validateArray(array);

            System.out.print("Array original:");
            printArray(array);

            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt();

            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            sorter.sort(array);

            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    /**
     * Método de utilidad para imprimir el contenido de un array.
     * 
     * @param arr El array que se desea imprimir.
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}