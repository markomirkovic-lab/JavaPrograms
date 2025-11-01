//package SimulazioneTest;

/*
Scrivete un programma che richieda all'utente l'immissione di alcuni valori che possono essere degli interi, dei numeri in virgola mobile o delle stringhe.

La quantità di valori da inserire viene richiesta all'utente. Questa deve essere compresa tra 5 e 12. Se non lo è il programma mostra un messaggio di errore e termina.

Se invece la quantità inserita è valida, l'utente ha la possibilità di inserire i valori desiderati che possono essere degli interi, dei numeri in virgola mobile o delle parole.

Il programma deve:


calcolare e mostrare la somma e la media dei valori interi inseriti
calcolare e mostrare la somma dei valori in virgola mobile inseriti
creare e visualizzare una stringa composta dalle prime tre lettere di ogni parola inserita, separando ogni stringa con il carattere '-'
Importante: 


l'output prodotto dal programma dovrà essere simile a quello mostrato più sotto (in grassetto l'inserimento fatto dall'utente),
fate in modo che il vostro programma sia il più robusto possibile, ad esempio verificando il tipo di dato inserito.
Esempio di output 1:

Quanti valori vuoi inserire? ciao
Serve un intero. Riprova: -5
Il numero di valori inserito non e' valido. Il programma termina!
Esempio di output 2:

Quanti valori vuoi inserire? 7
Valore 1: 1.22
Valore 2: 3
Valore 3: fondamenti
Valore 4: di
Valore 5: 4
Valore 6: 5.55
Valore 7: informatica

Stringa finale: fon-di-inf
Somma interi: 7
Media interi: 3.5
Somma double: 6.77

*/
import java.util.Scanner;

public class ValoriMisti {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        scanner.close();
    }
}
