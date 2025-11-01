import java.util.Arrays;

public class EsempioArrayV9InserireInCoda {
    
    public static void main(String[] args) {
        
    
        // INSERIRE IN CIMA
        // si tratta di inserire una nuova cella alla posizione 0 dell'array, facendo slittare 
        // a destra tutte le altre celle

        int[] dati = {9, 18, 27, 36, 45, 54};

        System.out.println("Array prima della modifica: \t" + Arrays.toString(dati));

        // 1. Creare un array temporaneo, tmpArray, piu' grande di una cella [dati.length+1]
        int[] tmpArray = new int[dati.length+1];

        // 2. Copiare tutte le celle dell'array dati nel nuovo array
        //    1. L'indice di destinazione sara' uguale alla sorgente
        for(int i = 0; i < dati.length; i++) {
            tmpArray[i] = dati[i];
        }

        // 3. Inserire in tmpArray in fondo (ultima cella con indice [tmpArray.length-1]) come ultimo numero dell'array
        tmpArray[tmpArray.length-1] = 99;

        // 4. Assegnare l'array tmp alla variable dati sostitutendo cosi' l'array originale
        dati = tmpArray;

        System.out.println("Array dopo la modifica: \t" + Arrays.toString(dati));

        /*
        Array prima della modifica:     [9, 18, 27, 36, 45, 54]
        Array dopo la modifica:         [9, 18, 27, 36, 45, 54, 99]
        */

    }    


}
