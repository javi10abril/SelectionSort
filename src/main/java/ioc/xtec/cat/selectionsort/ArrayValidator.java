/**
 * Clase que valida los arrays para asegurar que no sean nulos ni estén vacíos.
 * 
 * Autor: Javier Diez Abril
 * Versión: 1.0
 */
package ioc.xtec.cat.selectionsort;

public class ArrayValidator {

    /**
     * Constructor predeterminado.
     */
    public ArrayValidator() {
        // Constructor vacío
    }

    /**
     * Valida que el array no sea nulo ni esté vacío.
     * 
     * @param arr El array que se desea validar.
     * @throws IllegalArgumentException Si el array es nulo o está vacío.
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
}