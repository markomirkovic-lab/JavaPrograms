
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

public class ScacchieraInterativaV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int righe = 0;
        int colonne = 0;
        boolean inputValido = false;


        // Verifica input utente
        do{
            System.out.print("Inserire numero di righe: ");

            // Verifica se l'input righe e' un intero
            if (input.hasNextInt()) {
                // Assegna il valore del'0input utente alle righe
                righe = input.nextInt();
                // Verifica che il numero sia positivo
                if(righe > 0) {

                    System.out.print("Inserire numero di colonne: ");

                    // Verifica se l'input colonne e' un intero
                    if(input.hasNextInt()) {
                        // Assegna il valore dell'input utente alle colonne
                        colonne = input.nextInt();
                        // Verifica che il numero sia positivo
                        if(colonne > 0) {
                            // Confermo che tutti i parametri sono accettabili (-> uscita dal ciclo do/while)
                            inputValido = true;
                        } else {

                            System.out.println("Errore. Il numero di colonne deve essere positivo (> 0)");
                        }
                    } else {
                        System.out.println("Errore. Inserire un numero intero valido per le righe.");
                        input.next(); // Pulisce l'input non valido
                    }
                } else {

                    System.out.println("Errore. Il numero di righe deve essere positivo (> 0)");
                }
            } else {
                System.out.println("Errore. Inserire un numero intero valido per le righe.");
                input.next(); // Pulisce l'input non valido
            }

        } while(!inputValido);

        

        // Creazione array
        int[][] arrayScacchiera = new int[righe][colonne];

        // Riempimento array scacchiera
        for(int r = 0; r < righe; r++) {

            for(int c = 0; c < colonne; c++) {

                arrayScacchiera[r][c] = (r + c) % 2;
            }
        }

        // Stampa array scacchiera
        System.out.println("Scacchiera con numero righe " + righe + " e numero colonne " + colonne + ":");
        for(int r = 0; r < righe; r++) {

            for(int c = 0; c < colonne; c++) {

                System.out.print(arrayScacchiera[r][c] + " ");
            }
            System.out.println();
        }

        input.close();
    }
    
}
