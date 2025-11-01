
public class ArraysSortDesCicloForV2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrInvertito = new int[arr.length];

        // Riempie arrInvertito con gli elementi di arr in ordine inverso
        for (int i = 0; i < arr.length; i++) {
            arrInvertito[i] = arr[arr.length - 1 - i];
        }

        // Stampa l'array invertito
        for (int i : arrInvertito) {
            System.out.print(i + " ");  // Output: 6 5 4 3 2 1
        }
    }
}
