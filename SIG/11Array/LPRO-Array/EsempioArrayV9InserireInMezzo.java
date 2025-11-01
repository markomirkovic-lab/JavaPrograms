import java.util.Arrays;

public class EsempioArrayV9InserireInMezzo {

    
    public static void main(String[] args) {
        
    
        // INSERIRE IN MEZZO
        // si tratta di inserire una nuova cella, questo algoritmo integra i due precedenti e funziona
        // per qualsiasi cella

        int[] dati = {9, 18, 27, 36, 45, 54};
        System.out.println("Array prima della modifica: \t" + Arrays.toString(dati));
        
        // 1. Creare un array temporaneo, tmpArray, piu' grande di una cella [dati.length+1]
        int[] tmpArray = new int[dati.length+1];

        // creare e dichiarare l'indice di inserimento
        int indice = 3;
            // 2. Fino alla posizione nuova (segnata da indice) copiare tutte le celle dell'array
        //    dati nel nuovo array
        //    1. Si salta la nuova cella
        //    2. Dalla cella seguente, l'indice di destinazione sara' incremento di 1 rispetto
        //       alla sorgente
        for(int i = 0; i < dati.length; i++) {
            // Fino alla posizione nuova
            if(i < indice) {
                tmpArray[i] = dati[i];
            // si salta la nuova cella (dove andra' finire il dato)

            } else if (i >= indice) {
                // Dalla cella seguente, l'indice di destinazione sara' incremento di 1 rispetto
                // alla sorgente
                tmpArray[i+1] = dati[i];
            }
            
        }
        // 3. Inserire in tmpArray il nuovo valore in base all'indice [indice])
        tmpArray[indice] = 99;
        // 4. Assegnare l'array tmp alla variable dati sostitutendo cosi' l'array originale
        dati = tmpArray;
        System.out.println("Array dopo la modifica: \t" + Arrays.toString(dati));
        /*
        Array prima della modifica:     [9, 18, 27, 36, 45, 54]
        Array dopo la modifica:         [9, 18, 27, 99, 36, 45, 54]
        */
    }    
}
