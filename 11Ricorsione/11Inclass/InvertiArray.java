/*
 * Scrivere un programma che utilizzando un sottoprogramma ricorsivo inverta l'ordine degli elementi di un array.
 * Esempio di esecuzione:
 * Array originale: [1, 2, 3, 4, 5]
 * Array invertito: [5, 4, 3, 2, 1]
 */
public class InvertiArray {

    // Sottoprogramma ricorsivo per invertire un array
    private static void invertiArray(int[] arr, int inizio, int fine) {
        // Caso base: se gli indici si incrociano o si incontrano, fermarsi
        if (inizio >= fine) {
            return;
        }

        // Scambia l'elemento all'inizio con l'elemento alla fine
        int temp = arr[inizio];
        arr[inizio] = arr[fine];
        arr[fine] = temp;

        // Chiamata ricorsiva con gli indici aggiornati
        invertiArray(arr, inizio + 1, fine - 1);
    }

    private static void stampaArray(int[] arr) {
        for (int valore : arr) {
            System.out.print(valore + " ");
        }
    }

    public static void main(String[] args) {
        int[] numeri = { 1, 2, 3, 4, 5 };
        System.out.print("Array originale: ");
        stampaArray(numeri);

        // Chiamata al sottoprogramma ricorsivo
        invertiArray(numeri, 0, numeri.length - 1);

        // Stampa dell'array invertito
        System.out.print("\nArray invertito: ");
        stampaArray(numeri);
        System.out.println();
    }
}
