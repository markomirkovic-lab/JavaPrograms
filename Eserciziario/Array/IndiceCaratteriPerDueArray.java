/*
Per implementare un metodo in Java che restituisce un array contenente gli indici 
in cui ogni carattere di a è presente all'interno di b, puoi seguire questi passaggi:

Creare un array di interi per memorizzare gli indici.
Iterare attraverso ogni carattere di a.
Per ogni carattere di a, trovare l'indice corrispondente in b.
Memorizzare l'indice trovato nell'array di risultati.
Restituire l'array di risultati.

Spiegazione:
trovaIndici: Questo metodo prende due array di caratteri a e b come input e 
restituisce un array di interi contenente gli indici dei caratteri di a in b.
Ciclo for esterno: Itera attraverso ogni carattere di a.
Ciclo for interno: Itera attraverso ogni carattere di b per trovare l'indice 
del carattere corrente di a.

indici[i] = j: Quando trova una corrispondenza, memorizza l'indice j nell'array indici.
break: Una volta trovata una corrispondenza, esce dal ciclo interno per passare al 
       prossimo carattere di a.

Se esegui il codice con a = {'a', 'b', 'c'} e b = {'b', 'a', 'c'}, l'output sarà:

Copy
1 0 2 
Questo significa che:
'a' è presente all'indice 1 in b.
'b' è presente all'indice 0 in b.
'c' è presente all'indice 2 in b.

Nota:
Se un carattere di a non è presente in b, il metodo restituirà 0 per quell'indice 
(poiché l'array di interi è inizializzato con 0). Se vuoi gestire questo caso 
in modo diverso (ad esempio, restituendo -1 per indicare che il carattere non è 
presente), puoi modificare il codice di conseguenza.
*/

public class IndiceCaratteriPerDueArray {

    public static int[] trovaIndici(char[] a, char[] b) {
        int[] indici = new int[a.length];  // Array per memorizzare gli indici
        StringBuffer indiciString = new StringBuffer();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    indici[i] = j;  // Memorizza l'indice trovato
                    indiciString.append(b[j] + " ");
                    break;  // Esci dal ciclo interno una volta trovato l'indice
                } else {
                    indici[i] = -1;
                }
            }
        }

        System.out.println("Lettere uguali in a e b: "  + new String(indiciString));

        return indici;  // Restituisce l'array di indici
    }

    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};
        //char[] a = {'e', 'f', 'g'};
        char[] b = {'b', 'a', 'c'};

        int[] indici = trovaIndici(a, b);

        // Stampa l'array di indici
        for (int indice : indici) {
            System.out.print(indice + " ");
        }

    }
}
