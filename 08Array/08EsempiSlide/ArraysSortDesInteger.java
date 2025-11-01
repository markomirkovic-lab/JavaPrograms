
import java.util.Arrays;
import java.util.Collections;

public class ArraysSortDesInteger {
    public static void main(String[] args) {

        // Lavorando con un array di oggetti (ad esempio Integer[]), si puo' convertire
        // l'array in una lista e utilizzare il metodo Collections.reverse():

        Integer[] arr = {1, 2, 3, 4, 5, 6};  // Nota: usiamo Integer invece di int
        Collections.reverse(Arrays.asList(arr));

        // Stampa l'array invertito
        for (int i : arr) {
            System.out.print(i + " ");  // Output: 6 5 4 3 2 1
        }

        System.out.println();

        Integer[] arr2 = {3, 2, 1, 6, 5, 4};  // Nota: usiamo Integer invece di int
        Collections.reverse(Arrays.asList(arr2));

        // Stampa l'array invertito
        for (int i : arr2) {
            System.out.print(i + " ");  // Output: 4 5 6 1 2 3
        }

    }
}