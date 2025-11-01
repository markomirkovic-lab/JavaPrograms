/*
Tabelline margine
Scrivete un software che sia in grado di memorizzare in una tabella le tabelline (ovvero il 
prodotto della riga e della colonna, partendo da 1).
Il programma chiede all’utente di inserire un numero e crea, valorizza e stampa la matrice.
Es: se l’utente inserisce 4 otterremo la seguente matrice stampando anche i margini:
  1 2  3  4
1 1 2  3  4
2 2 4  6  8
3 3 6  9 12
4 4 8 12 16
*/

import java.util.Scanner;

public class Es11_5_TabellineMargine {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero che sara' la dimensione della matrice: ");
        int numero = input.nextInt();
        numero++;

        int[][] matrice = new int[numero][numero];

        for(int riga = 0; riga < matrice.length; riga++) {

            for(int colonna = 0; colonna < matrice[riga].length; colonna++) {

                if(riga == 0 && colonna == 0) {         // bordo in cima a sinistra vuoto
                    continue;
                } else if(riga == 0 && colonna != 0) {  // bordo righe
                    matrice[riga][colonna] = colonna; 
                } else if(riga != 0 && colonna == 0) {  // bordo colonne
                    matrice[riga][colonna] = riga; 
                } else if(riga != 0 && colonna != 0) {  // riempo le altre righe e colonne
                    matrice[riga][colonna] = (riga)*(colonna);
                }

            }
        }


        for(int riga = 0; riga < matrice.length; riga++) {

            for(int colonna = 0; colonna < matrice[riga].length; colonna++) {

                System.out.print("[" + matrice[riga][colonna] + "]" + "\t");
            }
            System.out.println("");
        }
     
        /*
        Inserisci un numero che sara' la dimensione della matrice: 4

        [0]     [1]     [2]     [3]     [4]
        [1]     [1]     [2]     [3]     [4]
        [2]     [2]     [4]     [6]     [8]
        [3]     [3]     [6]     [9]     [12]
        [4]     [4]     [8]     [12]    [16]

        */

    }

    
}
