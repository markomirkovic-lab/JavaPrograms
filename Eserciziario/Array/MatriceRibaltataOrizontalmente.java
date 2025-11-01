/*
MatriceRLTD Mar 21, 2017 array Livello 13 

Ora proviamo a ribaltare orizzontalmente la disposizione dei valori rispetto a quanto fatto nell’esercizio MatriceLRTD. Scrivi un programma che:

Crea una matrice con le dimensioni definite dall’utente
Riempie la matrice disponendo dei valori crescenti da destra a sinistra, dall’alto verso il basso.
Stampa lo stato della matrice
Esempio, per una matrice di 5 x 5:

4	3	2	1	0	
9	8	7	6	5	
14	13	12	11	10	
19	18	17	16	15	
24	23	22	21	20	
Il programma deve funzionare correttamente anche per matrici rettangolari. Esempio (7 x 2):

1	0	
3	2	
5	4	
7	6	
9	8	
11	10	
13	12
*/

import java.util.Scanner;

public class MatriceRibaltataOrizontalmente {   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire le dimensioni della matrice
        System.out.print("Inserisci il numero di righe: ");
        int righe = scanner.nextInt();
        System.out.print("Inserisci il numero di colonne: ");
        int colonne = scanner.nextInt();

        // Crea la matrice
        int[][] matrice = new int[righe][colonne];

        // Riempie la matrice con valori crescenti da sinistra a destra, dal basso verso l'alto
        int valore = 0;

        for(int r = 0; r < righe; r++) {

            for(int c = colonne-1; c >= 0; c--) {

                matrice[r][c] = valore++;
            }
        }
        

        // Stampa la matrice
        System.out.println("Matrice ribaltata verticalmente:");
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
