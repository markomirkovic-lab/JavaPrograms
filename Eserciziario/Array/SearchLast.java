/*
https://gitalb.github.io/eserciziario2.0/search/array/2017/04/25/searchlast.html
SearchLast Apr 25, 2017 search array Livello 12 

Scrivi la classe SearchLast che applica una ricerca sequenziale per trovare 
il numero (char) dell’indice dell'ultima ricorrenza stampando il numero contenuto
nell'array di args sulla base dell'indice (utima ricorrenza)

n.b. args[length-1] modifcato in rispetto all'esercizio originale

Ad esempio:
                  0 1 2 3 4 5  6 7 8 9
                  1 2 3 4 5 6  7 8 9 10
$ java SearchLast 3 1 7 5 9 67 4 7 3 7
7
Oppure:
                  0 1 2 3 4 5 6
                  1 2 3 4 5 6 7
$ java SearchLast 1 1 2 1 3 1 4 
3
Se il valore cercato non è presente il programma stampa il messaggio "Valore non trovato".
*/

public class SearchLast {

    // Metodo che accetta un array di stringhe come parametro
    public static void stampaArgomenti(String[] args) {

        for (String arg : args) {
            System.out.print(arg + " ");
        }
    }

    public static int argsN(String[] args) {

        int[] sequenzaNumeri = new int[args.length];

        for(int i = 0; i < args.length; i++) {

            sequenzaNumeri[i] = Integer.parseInt(args[i]);
        }

        int lastOccurance = sequenzaNumeri[sequenzaNumeri.length-1];

        if(!(lastOccurance < args.length)) {
            System.out.print("Valore non trovato: ");
            return -1;
        }

        //System.out.println(sequenzaNumeri[lastOccurance]);

        return sequenzaNumeri[lastOccurance];
    }

    public static void main(String[] args) {
   
        // Verifica che ci siano argomenti passati da linea di comando
        if(args.length == 0) {
            System.out.println("Nessun argomento fornito.");
            return;
        }

        // Verifica che ci siano almeno due argomenti (valore da cercare e almeno un elemento in cui cercare)
        if (args.length < 2) {
            System.out.println("Errore: sono necessari almeno due argomenti.");
            return;
        }

        stampaArgomenti(args);

        System.out.println();

        System.out.println(argsN(args));

        /*
        java SearchLast 3 1 7 5 9 67 4 7 3 7 9
        7
        java SearchLast 1 1 2 1 3 1 4 
        3
        java SearchLast 1 1 2 1 3 1 40
        Valore non trovato: -1
        */

    }
    
}
