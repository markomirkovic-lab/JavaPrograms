
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

public class ScacchieraInterativaV0 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int righe;
        int colonne;
        boolean inputValido = false;


        // Verifica input utente
        do{
            System.out.print("Inserire numero di righe: ");

            if (!input.hasNextInt()) {
                System.out.println("Errore. Inserire un numero intero di righe (es. 1 o 2 o 3,...)");
                input.nextLine();
            } else {
                inputValido = true;
            }
        } while(!inputValido);

        righe = input.nextInt();

        if(righe <= 0) {
            System.out.println("Errore. Inserire un numero intero maggiore di 0 (es. 1 o 2 o 3,...)");
            input.close();
            return;

        }

        inputValido = false;

        do{
            System.out.print("Inserire numero di colonne: ");

            if (!input.hasNextInt()) {
                System.out.println("Errore. Inserire un numero intero di colonne (es. 1 o 2 o 3,...)");
                input.nextLine();
            } else {
                inputValido = true;
            }   
        } while(!inputValido);

        colonne = input.nextInt();

        if(colonne <= 0) {
            System.out.println("Errore. Inserire un numero intero maggiore di 0 (es. 1 o 2 o 3,...)");
            input.close();
            return;

        }

        /*
        System.out.print("Inserire numero di righe: ");
        righe = input.nextInt();

        System.out.print("Inserire numero di colonne: ");
        colonne = input.nextInt();
        */

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
