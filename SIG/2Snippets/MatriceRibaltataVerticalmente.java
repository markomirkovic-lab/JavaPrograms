/*
MatriceTDLR Mar 21, 2017 array Livello 13 

Ora prova riempire una matrice colonna per colonna. Scrivi un programma che:

Crea una matrice con le dimensioni definite dall’utente
Riempie la matrice disponendo dei valori crescenti dall’alto verso il basso, da sinistra a destra
Stampa lo stato della matrice
Esempio, per una matrice di 5 x 5:

0	5	10	15	20	
1	6	11	16	21	
2	7	12	17	22	
3	8	13	18	23	
4	9	14	19	24	
Il programma deve funzionare correttamente anche per matrici rettangolari. Esempio per 7 x 2:

0	7	
1	8	
2	9	
3	10	
4	11	
5	12	
6	13	
*/
import java.util.Scanner;

public class MatriceRibaltataVerticalmente {   
    
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

        /*
        Ordine invertito: Garantisce che la matrice sia riempita nel modo richiesto (colonna per colonna).
        Se non avessimo invertito i cicli, avremmo riempito la matrice riga per riga, che non è quello 
        che volevamo. L'inversione dei cicli è quindi essenziale per rispettare la logica di riempimento 
        richiesta.
        */

        // Ciclo esterno sulle colonne: Ci permette di gestire una colonna alla volta.
        for(int c = 0; c < colonne; c++) {

            // Ciclo interno sulle righe: Riempie la colonna corrente dall'alto verso il basso.
            for(int r = 0; r < righe; r++) {

                matrice[r][c] = valore++;
            }
        }

        /*

        Spiegazione del processo
        
        Ciclo esterno sulle colonne: Il programma gestisce una colonna alla volta.

        Prima colonna (col = 0): riempita con valori da 0 a 6.

        Seconda colonna (col = 1): riempita con valori da 7 a 13.

        Ciclo interno sulle righe: Per ogni colonna, il programma riempie le celle dall'alto verso il basso.

        Contatore valore: Parte da 0 e viene incrementato a ogni iterazione, garantendo che i valori siano crescenti.

        Strutura iniziale vuota:
        [0][0] | [0][1]
        [1][0] | [1][1]
        [2][0] | [2][1]
        [3][0] | [3][1]
        [4][0] | [4][1]
        [5][0] | [5][1]
        [6][0] | [6][1]

        Passo 1: Riempimento della prima colonna (colonna 0)
        Ciclo interno sulle righe (rig va da 0 a 6):
        matrice[0][0] = 0 (valore = 0)
        matrice[1][0] = 1 (valore = 1)
        matrice[2][0] = 2 (valore = 2)
        matrice[3][0] = 3 (valore = 3)
        matrice[4][0] = 4 (valore = 4)
        matrice[5][0] = 5 (valore = 5)
        matrice[6][0] = 6 (valore = 6)

        Stato della matrice dopo il riempimento della prima colonna:
        0 | [0][1]
        1 | [1][1]
        2 | [2][1]
        3 | [3][1]
        4 | [4][1]
        5 | [5][1]
        6 | [6][1]

        Passo 2: Riempimento della seconda colonna (colonna 1)
        Ciclo interno sulle righe (rig va da 0 a 6):
        matrice[0][1] = 7 (valore = 7)
        matrice[1][1] = 8 (valore = 8)
        matrice[2][1] = 9 (valore = 9)
        matrice[3][1] = 10 (valore = 10)
        matrice[4][1] = 11 (valore = 11)
        matrice[5][1] = 12 (valore = 12)
        matrice[6][1] = 13 (valore = 13)

        Stato della matrice dopo il riempimento della seconda colonna:
        0 | 7
        1 | 8
        2 | 9
        3 | 10
        4 | 11
        5 | 12
        6 | 13

        */
        

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
