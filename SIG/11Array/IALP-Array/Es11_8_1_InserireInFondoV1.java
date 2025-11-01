/*
11.8.1 Inserire in cima e in fondo all’array
Scrivete il codice che generi l’array b con una cella in più, alla posizione 0.
Alla cella 0 verrà inserito il valore -1 e tutte le altre celle sono riprese dall’array a.
(vedi pdf)
Variante, la cella da aggiungere sarà all’ultima posizione
(vedi pdf)
*/
import java.util.Arrays;

public class Es11_8_1_InserireInFondoV1 {

    public static void main(String[] args) {
        
        // Variante 2

        int[] arrayA = {4, 8, 15, 16, 23, 42};
        int[] arrayB;

        arrayB = new int[arrayA.length+1];

        arrayB[arrayA.length] = -1;

        for(int riga = 0; riga < arrayA.length; riga++) {

            arrayB[riga] = arrayA[riga];
        }

        System.out.println();
        System.out.println("ArrayA: ");
        System.out.println(Arrays.toString(arrayA));
        System.out.println();
        System.out.println("Array B: ");
        System.out.println(Arrays.toString(arrayB));
        System.out.println();

        System.out.println("Effettuo arrayA = arrayB");
        arrayA = arrayB;
        System.out.println("ArrayA: ");
        System.out.println(Arrays.toString(arrayA));
        System.out.println();
        
 
    }
    
}
