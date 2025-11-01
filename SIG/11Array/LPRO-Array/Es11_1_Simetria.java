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

public class Es11_1_Simetria {

    private static void stampaMatrice(int[][] matrice) {

        for(int i = 0; i < matrice.length; i++) {

            for(int j = 0; j < matrice[i].length; j++) {

                System.out.print(matrice[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        
        // matrice di partenza
        int[][] matrice =  {
                                {1,0,0,0},
                                {2,1,0,0},
                                {3,2,1,0},
                                {4,3,2,1}
                           };
    
        System.out.println("Stampa matrice prima della modifica:");
        stampaMatrice(matrice);
        
        System.out.println("");

        //--------

        // matrice temporanea
        int[][] tmpMatrice = new int[matrice.length][matrice[0].length];

        // inversione di matrice salvata nella matrice temporanea
        for(int i = 0; i < matrice.length; i++) {

            for(int j = 0; j < matrice[i].length; j++) {

                tmpMatrice[j][i] = matrice[i][j];
            }
        }

        // sostituzione della matrice
        matrice = tmpMatrice;

        System.out.println("Stampa matrice dopo la modifica:");
        stampaMatrice(matrice);

        /*
        
        Stampa matrice prima della modifica:
        1 0 0 0 
        2 1 0 0
        3 2 1 0
        4 3 2 1

        Stampa matrice dopo la modifica:
        1 2 3 4
        0 1 2 3
        0 0 1 2
        0 0 0 1

        */

    }
    
}
