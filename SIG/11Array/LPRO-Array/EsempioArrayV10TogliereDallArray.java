import java.util.Arrays;

public class EsempioArrayV10TogliereDallArray {

    public static void main(String[] args) {
        
        // Si tratta di eliminare una cella, questo algoritmo e' generico e funziona per qualsiasi cella.

        //            0   1   2   3   4   5
        int[] dati = {9, 18, 27, 36, 45, 54};
        System.out.println("Array prima della modifica: \t" + Arrays.toString(dati));
        
        // 1. Creare un array temporaneo, tmpArray, piu' piccolo di una cella [dati.length-1]
        int[] tmpArray = new int[dati.length-1];

        // indice della cella da eliminare
        int indice = 3;

        // Fino alla posizione da eliminare (segnata da indice) copiare le celle dell'array dati nel nuovo array
        //   1. Si salta la cella da eliminare
        //   2. Dalla cella seguente, l'indice di destinazione sara decrementato di 1
        for(int i = 0; i < dati.length; i++) {
            //   1. Si salta la cella da eliminare
            if(i < indice) {
                tmpArray[i] = dati[i];
            } 
            //   2. Dalla cella seguente, l'indice di destinazione sara decrementato di 1
            else if (i > indice) {
                tmpArray[i-1] = dati[i];
            }
        }

        // 3. Assegnare l'array tmp alla variable dati sostitutendo cosi' l'array originale
        dati = tmpArray;
        System.out.println("Array dopo la modifica: \t" + Arrays.toString(dati));

        /*
        Array prima della modifica:     [9, 18, 27, 36, 45, 54]
        Array dopo la modifica:         [9, 18, 27, 45, 54]
        */
    }
    
}
