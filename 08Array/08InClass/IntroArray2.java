import java.util.Arrays;

public class IntroArray2 {
    public static void main(String[] args) {
        
        // Variable che si riferisce ad un array di 5 elementi
        int[] numeri1 = new int[5];

        String[] pippi = {"Pippo1", "Pippo2"};

        int[] numeri2 = {1, 2, 3, 4, 5};

        // Stampa indirizzo di memoria dove sono salvati i dati
        System.out.println(numeri1);
        System.out.println(numeri2);
        System.out.println("\n\n");

        int primoValore = numeri1[0];

        System.out.println(primoValore);
        System.out.println("numeri1[2]: " + numeri1[2]);

        numeri1[1] = 7;

        System.out.println("numeri1[1]: " + numeri1[1]);

        for(int i = 0; i < numeri2.length; i++) {
            System.out.print(numeri2[i] + " ");
        }

        System.out.println("");

        // assegno a tutte le celle dell'array il valore pari 
        // al loro indice + 1

        for(int i = 0; i <= numeri1.length - 1; i++) {
            numeri1[i] = i + 1;
            System.out.print(numeri1[i] + " ");
        }

        System.out.println("");

        System.out.println("---");

        // C'e' un metodo meno verboso per socrrere gli array
        // ma che ha delle problematiche
        // FOR EACH = for
        // si usa solo per la lettera degli array
        // scorre dalla prima all'ultima cella
        // for each (tipo di dato variabile fitizzia : array)

        for(int value : numeri2) {
            //System.out.print(value + " ");
            // con questo sistema possiamo solo leggere
            // ma non di modificare l'array
            value = 77;
        }

        System.out.println("");

        for(int value : numeri2) {
            System.out.print(value + " ");
            // con questo sistema possiamo solo leggere
            // ma non di modificare l'array
        }


        // 2 array sono uguali se:
        // hanno la stessa lunghezza
        // hanno i stessi valori nelle medesime celle (ordine)
        // non possiamo usare == come per le stringhe e double

        // import java.util.Arrays;
        System.out.println("I due array sono uguali: " + Arrays.equals(numeri1, numeri2));


        boolean[] arrayDiBolleani = new boolean[5];

        arrayDiBolleani[0] = true;

    }
    
}
