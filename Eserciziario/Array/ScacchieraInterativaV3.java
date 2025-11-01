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

public class ScacchieraInterativaV3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int righe = 0, colonne = 0;

        // Ciclo per verificare l'input delle righe
        while (true) {
            System.out.print("Inserire numero di righe: ");
            if (input.hasNextInt()) { // Verifica se l'input è un intero
                righe = input.nextInt();
                if (righe > 0) { // Verifica che il numero sia positivo
                    break; // Input corretto, esci dal ciclo
                } else {
                    System.out.println("Errore. Il numero di righe deve essere positivo.");
                }
            } else {
                System.out.println("Errore. Inserire un numero intero valido per le righe.");
                input.next(); // Pulisce l'input non valido
            }
        }

        // Ciclo per verificare l'input delle colonne
        while (true) {
            System.out.print("Inserire numero di colonne: ");
            if (input.hasNextInt()) { // Verifica se l'input è un intero
                colonne = input.nextInt();
                if (colonne > 0) { // Verifica che il numero sia positivo
                    break; // Input corretto, esci dal ciclo
                } else {
                    System.out.println("Errore. Il numero di colonne deve essere positivo.");
                }
            } else {
                System.out.println("Errore. Inserire un numero intero valido per le colonne.");
                input.next(); // Pulisce l'input non valido
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