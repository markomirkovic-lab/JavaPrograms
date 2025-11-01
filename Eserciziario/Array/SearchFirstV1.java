/*
https://gitalb.github.io/eserciziario2.0/search/array/2017/04/25/searchfirst.html
SearchFirst Apr 25, 2017 search array Livello 12 

Scrivi la classe SearchFirst che applica una ricerca sequenziale per trovare la 
prima ricorrenza di args[0] in args[1;N] e ne stampa l’indice (partendo da 0). 
Ad esempio:

$ java SearchFirst 3 1 7 5 9 67 4 7 3 7 9
7
Oppure:

$ java SearchFirst 1 1 2 1 3 1 4 
1
Se il valore cercato non è presente il programma stampa il messaggio 
"Valore non trovato".
*/
public class SearchFirstV1 {
    public static void main(String[] args) {
        // Verifica che ci siano almeno due argomenti (valore da cercare e almeno un elemento nell'array)
        if (args.length < 2) {
            System.out.println("Uso: java SearchFirst <valore> <elemento1> <elemento2> ... <elementoN>");
            return;
        }

        // Il valore da cercare è il primo argomento
        String target = args[0];

        // Itera sugli argomenti successivi per trovare la prima occorrenza
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals(target)) {
                // Stampa l'indice (partendo da 0) e termina il programma
                System.out.println(i); // Sottraiamo 1 perché l'array parte da 0
                return;
            }
        }

        // Se il valore non è stato trovato, stampa il messaggio
        System.out.println("Valore non trovato");

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchFirstV1 3 3 1 4 3 4 4
        1
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchFirstV1 1 3 1 4 3 4 4
        2
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchFirstV1 1 3 4 4 3 4 4
        Valore non trovato
        */
    }
}
