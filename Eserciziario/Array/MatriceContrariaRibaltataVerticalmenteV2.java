/*
MatriceLRDT Mar 21, 2017 array Livello 13 

Ora proviamo a ribaltare verticalmente la disposizione dei valori rispetto a quanto fatto nell’esercizio MatriceLRTD. Scrivi un programma che:

Crea una matrice con le dimensioni definite dall’utente
Riempie la matrice disponendo dei valori crescenti da sinistra a destra, dal basso verso l’alto
Stampa lo stato della matrice
Esempio, per una matrice di 5 x 5:

20	21	22	23	24	
15	16	17	18	19	
10	11	12	13	14	
5	6	7	8	9	
0	1	2	3	4	
Il programma deve funzionare correttamente anche per matrici rettangolari. Esempio (7 x 2):

12	13	
10	11	
8	9	
6	7	
4	5	
2	3	
0	1
*/

import java.util.Scanner;

public class MatriceContrariaRibaltataVerticalmenteV2 {   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire le dimensioni della matrice
        System.out.print("Inserisci il numero di righe: ");
        int righe = scanner.nextInt();
        System.out.print("Inserisci il numero di colonne: ");
        int colonne = scanner.nextInt();

        // Crea la matrice
        int[][] matrice = new int[righe][colonne];

        // Riempie la matrice con valori crescenti da sinistra a destra, e decrescenti dal alto verso basso
        int valore = 0;

        for(int r = righe-1; r >= 0; r--) {

            for(int c = 0; c < colonne; c++) {

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
