/*
https://gitalb.github.io/eserciziario2.0/search/array/2017/04/25/searchlast.html
SearchLast Apr 25, 2017 search array Livello 12 

Scrivi la classe SearchLast che applica una ricerca sequenziale per trovare 
l’ultima ricorrenza di args[0] in args[1;N] e ne stampa l’indice (partendo da 0). 
Ad esempio:

$ java SearchLast 3 1 7 5 9 67 4 7 3 7 9
7Oppure:

$ java SearchLast 1 1 2 1 3 1 4 
4

Se il valore cercato non è presente il programma stampa il messaggio 
"Valore non trovato".

+++

Spiegazione del codice:
Input: Il programma prende gli argomenti da riga di comando (args).

args[0] è il valore da cercare.

args[1] fino a args[N-1] sono gli elementi in cui cercare.

Verifica degli argomenti: Se non ci sono almeno due argomenti, 
il programma termina con un messaggio di errore.

Ricerca sequenziale:

Itera sugli elementi da args[1] a args[N-1].

Se trova una corrispondenza con args[0], aggiorna l'indice 
dell'ultima ricorrenza trovata (ultimoIndice).

Stampa del risultato:

Se è stata trovata almeno una corrispondenza, stampa 
l'indice dell'ultima ricorrenza.

Altrimenti, stampa "Valore non trovato".

Esempi di esecuzione:
Esempio 1:
Input:

Copy
$ java SearchLast 3 1 7 5 9 67 4 7 3 7 9
Output:

Copy
7
Spiegazione: L'ultima ricorrenza di 3 è all'indice 7 (partendo da 0).

Esempio 2:
Input:

Copy
$ java SearchLast 1 1 2 1 3 1 4
*/
public class SearchLastV2 {
    public static void main(String[] args) {
        // Verifica che ci siano almeno due argomenti (valore da cercare e almeno un elemento in cui cercare)
        if (args.length < 2) {
            System.out.println("Errore: sono necessari almeno due argomenti.");
            return;
        }

        String valoreDaCercare = args[0]; // Il valore da cercare è il primo argomento
        int ultimoIndice = -1; // Inizializza l'indice dell'ultima ricorrenza trovata

        System.out.println("valoreDaCercare: " + valoreDaCercare);
        System.out.println("args ultimo indice: " + args[ultimoIndice]);

        // Itera sugli argomenti a partire da args[1]
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals(valoreDaCercare)) {
                ultimoIndice = i - 1; // Aggiorna l'indice dell'ultima ricorrenza trovata
            }
        }

        // Stampa il risultato
        if (ultimoIndice != -1) {
            System.out.println(ultimoIndice);
        } else {
            System.out.println("Valore non trovato");
        }
    }
}