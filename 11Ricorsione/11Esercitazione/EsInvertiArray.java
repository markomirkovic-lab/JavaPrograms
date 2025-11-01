/*
Sottoprogramma ricorsivo per invertire l'ordine degli elementi di un array.
Esempio di esecuzione:
Array originale: [1, 2, 3, 4, 5]
Array invertito: [5, 4, 3, 2, 1]
*/

public class EsInvertiArray {

    private static void invertiArray(int[] array, int indiceInizio, int indiceFine) {

        // Condizione base: se indici si incrociano
        if(indiceInizio >= indiceFine) {
            return;
        }

        // Inversione array
        // Scambia l'elemento all'inizio con l'elemento alla fine
        int tmp = array[indiceInizio];
        array[indiceInizio] = array[indiceFine];
        array[indiceFine] = tmp;

        // Chiamata ricorsiva con gli indici aggiornati
        invertiArray(array, indiceInizio + 1, indiceFine - 1);
    }


    private static void stampaArray(int[] array) {

        for(int valore : array) {
            System.out.print(valore + " ");
            // int cntr = 1;
            // cntr++;
            // if(cntr < array.length-1) {
            //     System.out.print(", ");
            // }
            // System.out.println(array.length);           
        }
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.print("Array originale: ");
        stampaArray(array);

        invertiArray(array, 0, array.length-1);

        System.out.print("Array invertito: ");
        stampaArray(array);
        System.out.println();
        
    }
}
