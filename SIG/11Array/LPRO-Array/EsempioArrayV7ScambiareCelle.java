/*
OPERAZIONI CON ARRAY
*/

import java.util.Arrays;

public class EsempioArrayV7ScambiareCelle {

    public static void main(String[] args) {
        
        //            0   1   2   3   4   5
        int[] dati = {9, 18, 27, 36, 45, 54};

        System.out.println("Array iniziale: \t\t" + Arrays.toString(dati));

        //System.out.println("");

        // SCAMBIARE CELLE
        // Scambiare due celle dell'array comporta l'uso di una variable di appoggio
        // nella quale memomrizzare temporamente il valore di una cella.

        // scambio 18 (indice 1) con 45 (indice 4)

        int tmp = dati[1];  // 1. copio la prima cella in una variable temporanea
        dati[1] = dati[4];  // 2. sovrascrivo il valore della prima cella con quello cella seconda
        dati[4] = tmp;      // 3. sovrascrivo il valore della seconda cella con quello della prima
                            //    (che e' stato memorizzato nella variable temporanea)

        System.out.println("Array dopo la modifica: \t" + Arrays.toString(dati));

        System.out.println("");

        /*
        Array iniziale:                 [9, 18, 27, 36, 45, 54]
        Array dopo la modifica:         [9, 45, 27, 36, 18, 54]
        */

    }
    
}
