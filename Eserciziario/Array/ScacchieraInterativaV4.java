/*
https://gitalb.github.io/eserciziario2.0/array/interactive/2017/03/21/scacchiera.html
Scacchiera (interattivo) Mar 21, 2017 array interactive Livello 10 

Scrivi il programma Scacchiera che:

Chiede all’utente di introdurre il numero di righe e il numero di colonne di una matrice
Crea una matrice con le dimensioni definite dall’utente
Riempie la matrice disponendo i valori 1 e 0 altrenati come su una scacchiera.
Esempio, per una matrice 5 x 5:

Inserire numero di righe: 5
Inserire numero di colonne: 5

0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0
Il programma deve funzionare correttamente anche per matrici rettangolari. Esempio:

Inserire numero di righe: 6
Inserire numero di colonne: 8

0 1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 
0 1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 
0 1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0
*/
import java.util.Scanner;

public class ScacchieraInterativaV4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int righe = 0, colonne = 0;
        boolean righeInserite = false; // Stato per verificare se le righe sono state inserite correttamente

        /*
        Variabile di stato (righeInserite):
        Una variabile booleana (righeInserite) tiene traccia se l'input per le righe è stato inserito correttamente.
        Se righeInserite è false, il ciclo si concentra sull'inserimento delle righe.
        Se righeInserite è true, il ciclo si concentra sull'inserimento delle colonne.
        Ciclo unico:
        Il ciclo while gestisce entrambe le fasi (righe e colonne) in base allo stato corrente.
        Se l'utente sbaglia l'input per le colonne, il ciclo continua a chiedere solo le colonne senza ripetere l'inserimento delle righe.
        Logica di controllo invariata:
        Viene utilizzato hasNextInt() per verificare che l'input sia un intero.
        Viene controllato che i numeri siano positivi.
        */

        // Ciclo unico per gestire sia righe che colonne
        while (true) {
            if (!righeInserite) {
                // Fase di inserimento delle righe
                System.out.print("Inserire numero di righe: ");
                if (input.hasNextInt()) {
                    righe = input.nextInt();
                    if (righe > 0) {
                        righeInserite = true; // Le righe sono state inserite correttamente
                    } else {
                        System.out.println("Errore. Il numero di righe deve essere positivo.");
                    }
                } else {
                    System.out.println("Errore. Inserire un numero intero valido per le righe.");
                    input.next(); // Pulisce l'input non valido
                }
            // entra nel ciclo else quando righeInserite e' true, altrimenti continua a richiedere le righe
            } else {
                // Fase di inserimento delle colonne
                System.out.print("Inserire numero di colonne: ");
                if (input.hasNextInt()) {
                    colonne = input.nextInt();
                    if (colonne > 0) {
                        break; // Tutto è corretto, esci dal ciclo
                    } else {
                        System.out.println("Errore. Il numero di colonne deve essere positivo.");
                    }
                } else {
                    System.out.println("Errore. Inserire un numero intero valido per le colonne.");
                    input.next(); // Pulisce l'input non valido
                }
            }
        }

        // Creazione array
        int[][] arrayScacchiera = new int[righe][colonne];

        // Riempimento array scacchiera
        for (int r = 0; r < righe; r++) {
            for (int c = 0; c < colonne; c++) {
                arrayScacchiera[r][c] = (r + c) % 2;
            }
        }

        // Stampa array scacchiera
        System.out.println("Scacchiera con numero righe " + righe + " e numero colonne " + colonne + ":");
        for (int r = 0; r < righe; r++) {
            for (int c = 0; c < colonne; c++) {
                System.out.print(arrayScacchiera[r][c] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
