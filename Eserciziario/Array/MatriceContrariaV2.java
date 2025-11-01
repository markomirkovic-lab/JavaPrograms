//      https://gitalb.github.io/eserciziario2.0/array/2017/03/21/matricerldt.html
//      24	23	22	21	20	
//      19	18	17	16	15	
//      14	13	12	11	10	
//      9	8	7	6	5	
//      4	3	2	1	0	
/*
l programma deve funzionare correttamente anche per matrici rettangolari. Esempio (7 x 2):
13	12	
11	10	
9	8	
7	6	
5	4	
3	2	
1	0
*/

import java.util.Scanner;

public class MatriceContrariaV2 {   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire le dimensioni della matrice
        System.out.print("Inserisci il numero di righe: ");
        int righe = scanner.nextInt();
        System.out.print("Inserisci il numero di colonne: ");
        int colonne = scanner.nextInt();

        // Crea la matrice
        int[][] matrice = new int[righe][colonne];

        // Riempie la matrice con valori decrescenti da sinistra a destra, dall'alto verso basso
        int valore = 0;

        for(int r = righe-1; r >= 0; r--) {

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
