/**
 * Clase que implementa el algoritmo de ordenación por selección.
 * También contiene un método para buscar un valor en el array.
 * 
 * Autor: Javier Diez Abril
 * Versión: 1.0
 */
package ioc.xtec.cat.selectionsort;

public class SelectionSort {

    /**
     * Constructor predeterminado.
     */
    public SelectionSort() {
        // Constructor vacío
    }

    /**
     * Ordena un array utilizando el algoritmo de ordenación por selección.
     * 
     * @param arr El array a ordenar.
     */
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Verifica si un array contiene un valor específico.
     * 
     * @param arr El array donde buscar.
     * @param value El valor a buscar.
     * @return True si el valor existe en el array, false en caso contrario.
     * @throws IllegalArgumentException Si el array es nulo.
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
