/*
https://gitalb.github.io/eserciziario2.0/search/array/2017/04/25/binarysearch.html
BinarySearch Apr 25, 2017 search array Livello 13 

Scrivi la classe BinarySearch che applica una ricerca binaria per trovare args[0] 
nell’insieme ordinato rappresentato da args[1;N] e ne stampa l’indice (partendo da 0). 

Ad esempio:

$ java BinarySearch 3 1 2 3 5 7 8 10
2

Se il valore cercato non è presente il programma stampa il messaggio "Valore non trovato".

+++

La ricerca binaria è un algoritmo efficiente per trovare un elemento in un array ordinato. 
Funziona dividendo ripetutamente l'array in due metà e confrontando l'elemento cercato con 
l'elemento centrale. Ecco una spiegazione dettagliata del suo funzionamento e della logica 
necessaria per risolvere il problema:

Condizioni per la ricerca binaria
Array ordinato: La ricerca binaria richiede che l'array sia ordinato in ordine crescente 
(o decrescente). Questo permette di determinare in quale metà dell'array continuare la 
ricerca.

Accesso casuale: L'algoritmo richiede accesso diretto agli elementi dell'array (ad esempio, 
tramite indici), tipico delle strutture come gli array.

Logica della ricerca binaria
L'idea principale è ridurre progressivamente l'area di ricerca dividendo l'array in due 
metà e scartando quella che non può contenere l'elemento cercato. Ecco i passaggi:

Inizializzazione:
Definisci due indici: left (inizio dell'array, inizialmente 0) e right (fine dell'array, 
inizialmente array.length - 1).

Ciclo di ricerca:
Calcola l'indice centrale: mid = left + (right - left) / 2.

Usiamo (right - left) / 2 invece di (left + right) / 2 per evitare overflow nel caso di 
array molto grandi.

Confronta l'elemento centrale (array[mid]) con il valore cercato (target):

Se array[mid] == target, abbiamo trovato l'elemento. Restituisci l'indice mid.

Se array[mid] < target, l'elemento cercato deve trovarsi nella metà destra dell'array. 
Aggiorna left = mid + 1.

Se array[mid] > target, l'elemento cercato deve trovarsi nella metà sinistra dell'array. 
Aggiorna right = mid - 1.

Terminazione:

Se left supera right, l'elemento non è presente nell'array. Restituisci un valore speciale 
(ad esempio, -1) per indicare che l'elemento non è stato trovato.

+++

Array di esempio
Consideriamo l'array ordinato:

[1, 2, 3, 5, 7, 8, 10]
e cerchiamo il valore 3.

Passo 1
Indici iniziali:
left = 0 (inizio dell'array).
right = 6 (fine dell'array, poiché l'array ha 7 elementi).

Calcolo di mid:
mid = left + (right - left) / 2 = 0 + (6 - 0) / 2 = 3.
Valore di array[mid]:
array[3] = 5.

Confronto:
5 > 3: il valore cercato è nella metà sinistra dell'array.

Aggiornamento:
right = mid - 1 = 2.

Passo 2
Nuovi indici:

left = 0.
right = 2.
Calcolo di mid:
mid = left + (right - left) / 2 = 0 + (2 - 0) / 2 = 1.

Valore di array[mid]:
array[1] = 2.

Confronto:
2 < 3: il valore cercato è nella metà destra dell'array.

Aggiornamento:
left = mid + 1 = 2.

Passo 3
Nuovi indici:

left = 2.
right = 2.
Calcolo di mid:
mid = left + (right - left) / 2 = 2 + (2 - 2) / 2 = 2.

Valore di array[mid]:
array[2] = 3.

Confronto:
3 == 3: abbiamo trovato il valore cercato.

Risultato:

Restituiamo l'indice 2.

+++

Riepilogo della ricerca binaria
Inizializzazione:

left = 0, right = 6.

Passo 1:
mid = 3, array[3] = 5.
Poiché 5 > 3, aggiorniamo right = 2.

Passo 2:
mid = 1, array[1] = 2.
Poiché 2 < 3, aggiorniamo left = 2.

Passo 3:
mid = 2, array[2] = 3.
Poiché 3 == 3, restituiamo l'indice 2.

Perché funziona?
La ricerca binaria funziona perché:
L'array è ordinato, quindi possiamo escludere metà dell'array ad ogni iterazione.
Il valore centrale (array[mid]) ci permette di determinare se il valore cercato 
si trova a sinistra o a destra.
La complessità è O(log n), il che la rende molto efficiente per array grandi.

*/
public class BinarySearchV3 {
    public static void main(String[] args) {
        // Verifica che ci siano almeno due argomenti (valore da cercare e almeno un elemento nell'array)
        if (args.length < 2) {
            System.out.println("Uso: java BinarySearch <valore> <elemento1> <elemento2> ... <elementoN>");
            return;
        }

        // Il valore da cercare è il primo argomento
        int target = Integer.parseInt(args[0]);

        // Crea un array di interi con i restanti argomenti
        int[] array = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            array[i - 1] = Integer.parseInt(args[i]);
        }

        // Esegui la ricerca binaria
        int result = binarySearch(array, target);

        // Stampa il risultato
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Valore non trovato");
        }
    }

    // Metodo per la ricerca binaria
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Controlla se il valore è presente al centro
            if (array[mid] == target) {
                return mid;
            }

            // Se il valore è più piccolo, ignora la metà destra
            if (array[mid] > target) {
                right = mid - 1;
            }
            // Se il valore è più grande, ignora la metà sinistra
            else {
                left = mid + 1;
            }
        }

        // Se il valore non è presente nell'array
        return -1;
    }
}