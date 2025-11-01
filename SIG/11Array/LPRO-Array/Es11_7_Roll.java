/*
11.7 Roll
Scrivete un programma che, dato un array di double e un intero, esegua la rotazione dei 
suoi elementi di tante celle quante specificate dall’intero.
Es:
L’array è: {1,2,3,4,5,6,7}
L’intero è: 3
L’array finale sarà: {5,6,7,1,2,3,4}
*/

import java.util.Arrays;

public class Es11_7_Roll {
    public static void main(String[] args) {
        
        int[] arrayIniziale = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Array iniziale lenght: " + arrayIniziale.length);

        System.out.println("");

        // Stampa array iniziale
        System.out.println("Array iniziale: \t" + Arrays.toString(arrayIniziale));
        
        int roll = 3;
      
        for(int i = 0; i < roll; i++) {

            // i
            // 0
            // 1
            // 2

            // Memorizzazione dell'ultima cella
            // 3 operazioni
            int tmpUltimaCella = arrayIniziale[arrayIniziale.length-1];

            // Scorre tutte le celle dall'ultima alla seconda cella tornando indietro
            //                    7-1 = 6       6 > 0   6
            //                    6-1 = 5       5 > 0   5
            //                    5-1 = 4       4 > 0   4
            //                    4-1 = 3       3 > 0   3
            //                    3-1 = 2       2 > 0   2
            //                    2-1 = 1       1 > 0   1
            //                    1-1 = 0
            for(int j = arrayIniziale.length-1; j > 0 ; j--) {
            //                  7-1 = 6                 6
            //                  6-1 = 5                 5
            //                  5-1 = 4                 4
            //                  4-1 = 3                 3
            //                  3-1 = 2                 2
            //                  2-1 = 1                 1
            //                  1-1 = 0                 0
                
                // sposta la cella piu' a sinistra
                arrayIniziale[j] = arrayIniziale[j-1];
                //   0  1  2  3  4  5  6
                //  [1, 2, 3, 4, 5, 6, 7]
                // arrayIniziale[j]
                // arrayIniziale[6] = arrayIniziale[6-1] 
                // arrayIniziale[5] = arrayIniziale[6-1] 
                // arrayIniziale[4] = arrayIniziale[6-1] 
                // arrayIniziale[3] = arrayIniziale[6-1] 
                // arrayIniziale[2] = arrayIniziale[6-1] 
                // arrayIniziale[1] = arrayIniziale[6-1] 
                // System.out.print("[" + arrayIniziale[j-1] + "]");
                // 18 operazioni (6 per ogni loop del primo ciclo for (3 loop)):
                //  0  1  2  3  4  5  6
                // [ ][1][2][3][4][5][6]
                //                      0  1  2  3  4  5  6
                //                     [ ][7][1][2][3][4][5]
                //                                          0  1  2  3  4  5  6
                //                                         [ ][6][7][1][2][3][4]
            }
            arrayIniziale[0] = tmpUltimaCella;
            // 3 operazioni (per ogni ciclo del primo for (3 cicli)):
            //  0  1  2  3  4  5  6
            // [7][1][2][3][4][5][6]
            //                      0  1  2  3  4  5  6
            //                     [6][7][1][2][3][4][5]
            //                                          0  1  2  3  4  5  6
            //                                         [5][6][7][1][2][3][4]
            //System.out.println(Arrays.toString(arrayIniziale));

            /*
            Array iniziale lenght: 7
            
            Array iniziale:         [1, 2, 3, 4, 5, 6, 7]
            Array ruotato:          [5, 6, 7, 1, 2, 3, 4]
            */

        }
        // Stampa array ruotato
        System.out.println("Array ruotato: \t\t" + Arrays.toString(arrayIniziale));

    }
    
}
