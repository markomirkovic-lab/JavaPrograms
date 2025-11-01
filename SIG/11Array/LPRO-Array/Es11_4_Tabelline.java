/*
11.4 Tabelline
Scrivete un software che sia in grado di memorizzare in una tabella le tabelline (ovvero il 
prodotto della riga e della colonna, partendo da 1).
Il programma chiede all’utente di inserire un numero e crea, valorizza e stampa la matrice.
Es: se l’utente inserisce 4 otterremo la seguente matrice
1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16
*/

import java.util.Scanner;

public class Es11_4_Tabelline {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero che sara' la dimensione della matrice: ");
        int numero = input.nextInt();

        int[][] matrice = new int[numero][numero];

        for(int riga = 0; riga < matrice.length; riga++) {

            for(int colonna = 0; colonna < matrice[riga].length; colonna++) {

                matrice[riga][colonna] = (riga + 1)*(colonna + 1);

            }
        }

        // numero   = 4
        // riga     = 0 1 2 3
        // colonna  = 0 1 2 3
        // colonna          1                2              3              4
        //           [0+1 * 0+1 = 1] [0+1 * 1+1 = 2] [0+1 * 2+1 = 3] [0+1 * 3+1 = 4]    riga 0
        //           [1+1 * 0+1 = 2] [1+1 * 1+1 = 4] [1+1 * 2+1 = 6] [1+1 * 3+1 = 8]    riga 1
        //           [2+1 * 0+1 = 3] [2+1 * 1+1 = 6] [2+1 * 2+1 = 9] [2+1 * 3+1 = 12]   riga 2
        //           [3+1 * 0+1 = 4] [3+1 * 1+1 = 8] [3+1 * 2+1 = 12] [3+1 * 3+1 = 16]  riga 3

        for(int riga = 0; riga < matrice.length; riga++) {

            for(int colonna = 0; colonna < matrice[riga].length; colonna++) {

                System.out.print("[" + matrice[riga][colonna] + "]" + "\t");
            }
            System.out.println("");
        }
     
        /*
        Inserisci un numero che sara' la dimensione della matrice: 4
        [1]     [2]     [3]     [4]
        [2]     [4]     [6]     [8]
        [3]     [6]     [9]     [12]
        [4]     [8]     [12]    [16]
        */

    }
    
}
