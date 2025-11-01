/*

11.1 Simmetria
Scrivete un software che sia in grado di copiare i valori dalla diagonale inferiore alla 
diagonale superiore di una matrice.

Es: Avendo la seguente matrice:

1
2 1
3 2 1
4 3 2 1

Si dovrà ottenere questa
1 2 3 4
1 2 3
1 2
1

*/

public class Es11_1_SimetriaV2 {
 
    public static void main(String[] args) {
        
        // matrice di partenza
        int[][] matrice =  {
                            {1,0,0,0},
                            {2,1,0,0},
                            {3,2,1,0},
                            {4,3,2,1}
                           };

        // inversione di matrice

        // ciclo per tutte le righe
        for(int riga = 0; riga < matrice.length; riga++) {

            // le colonne da prendere in considerazione sono quelle fino al numero della riga
            // ovvero solo per gli elementi delle diagonale inferiore
            for(int colonna = 0; colonna <= riga; colonna++) {

                matrice[colonna][riga] = matrice[riga][colonna];

                // Dopo che l'ho spostata, azzero la cella originale
                if(riga != colonna) {
                    matrice[riga][colonna] = 0;
                }

                /*

                riga = 0

                 c  r           r  c
                [0][0] =  1  = [0][0]

                [1][0][0][0]
                [2][1][0][0]
                [3][2][1][0]
                [4][3][2][1]

                //----------

                riga = 1

                c  r           r  c
                [0][1] =  2  = [1][0]

                [1][2][0][0]
                [0][1][0][0]   if(riga!=colonna) -> matrice[riga][colonna] = 0;
                [3][2][1][0]
                [4][3][2][1]

                //----------

                riga = 2

                 c  r           r  c
                [0][2] =  3  = [2][0]

                [1][2][3][0]
                [0][1][0][0]   
                [0][2][1][0]   if(riga!=colonna) -> matrice[riga][colonna] = 0;
                [4][3][2][1]

                 c  r           r  c
                [1][2] =    = [2][1]

                [1][2][3][0]
                [0][1][2][0]   
                [0][0][1][0]   if(riga!=colonna) -> matrice[riga][colonna] = 0;
                [4][3][2][1]               

                //----------

                riga = 3
                
                 c  r           r  c
                [0][3] =  4  = [3][0]

                [1][2][3][4]
                [0][1][2][0]   
                [0][0][1][0]
                [0][3][2][1]   if(riga!=colonna) -> matrice[riga][colonna] = 0;

                 c  r           r  c
                [1][3] =  4  = [3][1]

                [1][2][3][4]
                [0][1][2][3]   
                [0][0][1][0]
                [0][0][2][1]   if(riga!=colonna) -> matrice[riga][colonna] = 0;

                 c  r           r  c
                [2][3] =  4  = [3][2]

                [1][2][3][4]
                [0][1][2][3]   
                [0][0][1][2]
                [0][0][0][1]   if(riga!=colonna) -> matrice[riga][colonna] = 0;

                 c  r           r  c
                [3][3] =  1  = [3][3]

                [1][2][3][4]
                [0][1][2][3]   
                [0][0][1][2]
                [0][0][0][1]

                */               
            }
        }

        // stampa
        for(int riga = 0; riga < matrice.length; riga++) {

            for(int colonna = 0; colonna < matrice[riga].length; colonna++) {

                System.out.print("[" + matrice[riga][colonna] + "]");
            }
            // Al termine della riga vado a capo
            System.out.println("");
        }
    

    }
}
