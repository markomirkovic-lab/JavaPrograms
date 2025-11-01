
public class ArraysSortDesRecursive {

    public static void invertiArrayRicorsivo(int[] arr, int inizio, int fine) {
        if (inizio >= fine) {
            return;  // Caso base: l'array è stato completamente invertito
        }

        // Scambia gli elementi
        int temp = arr[inizio];
        arr[inizio] = arr[fine];
        arr[fine] = temp;

        // Richiama ricorsivamente la funzione per il resto dell'array
        invertiArrayRicorsivo(arr, inizio + 1, fine - 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        invertiArrayRicorsivo(arr, 0, arr.length - 1);

        // Stampa l'array invertito
        for (int i : arr) {
            System.out.print(i + " ");  // Output: 6 5 4 3 2 1
        }
    }

    
}