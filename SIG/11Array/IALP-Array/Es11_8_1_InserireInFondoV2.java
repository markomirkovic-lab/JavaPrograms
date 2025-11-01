import java.util.Arrays;
import java.util.Scanner;

public class Es11_8_1_InserireInFondoV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] modello = {0, 11, 22, 33, 44, 55};//  array di riferimento
        int[] tmp;                              //  array temporaneo di appoggio
        int[] array;                            //  array da usare ogni volta per copiare l'originale

        int origine;
        int destinazione;

        System.out.print("Nuovo valore: ");
        int valore = input.nextInt();           // leggiamo il valore fornito dall'utente
        input.nextLine();                       // svuottiamo il buffer

        System.out.print("Indice della cella (da 0 a " + (modello.length) + ") : ");
        int cella = input.nextInt();            // leggiamo un indice fornito dall'utente
        input.nextLine();                       // svuottiamo il buffer

        array = Arrays.copyOf(modello, modello.length); // copiamo l'array modello

        tmp = new int[array.length+1];                  // nuovo array, piu' grande di una cella

        for(origine = 0; origine < array.length; origine++) {   // scorriamo tutti gli elementi dell'array di origine
                                                                // usiamo la variable originale per memorizzare l'indice
                                                                // di partenza
            
            destinazione = origine;                             // siccome l'array di destinazione e' piu' grande di una
                                                                // cella, tutti gli elementi manteranno la posizione
                                                                // mentre l'ultima cella sara' vuota

            tmp[destinazione] = array[origine];                 // copiamo l'elemento con gli indici giusti
        }

        destinazione = tmp.length-1;                            // calcoliamo la posizione della prima cella
        //destinazione = cella;
        tmp[destinazione] = valore;                             // inseriamo il nuovo valore (input utente) nella
                                                                // prima posizione
        
        System.out.println("Prima: \t" + Arrays.toString(array));  // stampiamo il nuovo array

        array = tmp;                                            // sovrascriviamo l'array iniziale con il nuovo array
                                                                // temporaneo
        
        System.out.println("Dopo: \t" + Arrays.toString(array));  // stampiamo il nuovo array sovrascritto
       
    }
    
}
