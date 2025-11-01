/*
https://gitalb.github.io/eserciziario2.0/array/methods/2019/03/08/matrixmerger.html
MatrixMerger Mar 8, 2019 array methods Livello 12 

Scrivi il programma MatrixMerger contenente i metodi utili per combinare tra loro 
due matrici di interi.

La classe MatrixMerger deve contenere i metodi seguenti:

public static int getRowWidth(int[][] m, int row)
Ritorna la larghezza (il numero di colonne) della riga row nella matrice m. Se la 
riga specificata è vuota oppure non è valida, ritorna 0.

public static int getMaxWidth(int[][] a, int[][] b)
Ritorna la dimensione della riga più larga che si otterrebbe combinando ogni riga 
di a con la rispettiva riga di b. Ossia, calcola la somma tra la dimensione di 
ogni riga della matrice a con la rispettiva riga della matrice b e ritorna il 
valore massimo.

public static int[][] merge(int[][] a, int[][] b)
Ritorna una matrice rettangolare ottenuta combinando le matrici a e b. La 
combinazione avviene concatenando ogni riga di a con la rispettiva riga di b. 
La nuova matrice avrà un numero di righe pari a quello della matrice più alta 
tra a e b ed un numero di colonne pari a quella della riga più larga prodotta 
dalla concatenazione (larghezza massima di a e b). Ad esempio:

1	2				 3	 4	 5   6					1	2	3	4	5	6
1	2	3	4	 +	 5	 6					=		1	2	3	4	5	6
                     1	 2	 3	 4	5	6           1	2	3	4	5	6

Se presenti, le celle in eccesso di ogni riga conterranno il valore 0, ad esempio:

1	1	1				5	5	5					1	1	1	5	5	5
2	2	2		+		6	6	6			=		2	2	2	6	6	6
3						7	7	7	7				3	7	7	7	7	0
4	4	4	4										4	4	4	4	0	0

main
Contiene il codice utile a verificare e dimostrare il buon funzionamento di tutti i metodi che hai scritto.
*/

import java.util.Arrays;

public class MatrixMergerV0 {


    // Ritorna la larghezza (il numero di colonne) della riga row nella matrice m. Se la 
    // riga specificata è vuota oppure non è valida, ritorna 0.
    public static int getRowWidth(int[][] m, int row) {

        int columnIndex = 0;

        if(m == null || m[row] == null || row < 0) {
            return 0;
        }

        for(int column = 0; column < m[row].length; column++) {

                columnIndex = column;
        }

        if(columnIndex > 0) {
            return columnIndex;// + 1 per avere avere il numero della colonna partendo da 1
        }

        return 0;
    }


    //public static int getColumnWidth(int[][] m, int column) {

        
    //}
    

    // Ritorna la dimensione della riga più larga che si otterrebbe combinando ogni riga 
    // di a con la rispettiva riga di b. Ossia, calcola la somma tra la dimensione di 
    // ogni riga della matrice a con la rispettiva riga della matrice b e ritorna il 
    // valore massimo.
    public static int getMaxWidth(int[][] a, int[][] b) {

        int maxWidth = 0;
        int maxWidthA = 0;
        

        for(int i = 0; i < a.length; i++) {

            maxWidth = getRowWidth(a, i);

            if(maxWidth > maxWidthA) {
                maxWidthA = maxWidth;
            }
        }

        maxWidth = 0;
        int maxWidthB = 0;

        for(int i = 0; i < b.length; i++) {

            maxWidth = getRowWidth(b, i);

            if(maxWidth > maxWidthB) {
                maxWidthB = maxWidth;
            }
        }

        int maxWidthAb = maxWidthA + maxWidthB;

        return maxWidthAb;

    }
    
    // Ritorna una matrice rettangolare ottenuta combinando le matrici a e b. La 
    // combinazione avviene concatenando ogni riga di a con la rispettiva riga di b. 
    // La nuova matrice avrà un numero di righe pari a quello della matrice più alta 
    // tra a e b ed un numero di colonne pari a quella della riga più larga prodotta 
    // dalla concatenazione (larghezza massima di a e b).
    public static int[][] merge(int[][] a, int[][] b) {

        //int [][] newIntMatix = new int[a.length + b.length][getMaxWidth(a, b)];

        int maxRows = Math.max(a.length, b.length);
        int maxWidth = getMaxWidth(a, b); // Larghezza massima delle righe combinate
        int[][] result = new int[maxRows][maxWidth];

        for (int i = 0; i < maxRows; i++) {
            int[] rowA = i < a.length ? a[i] : new int[0];
            int[] rowB = i < b.length ? b[i] : new int[0];
            int[] mergedRow = new int[maxWidth];

            // Copia elementi di a
            for (int j = 0; j < rowA.length; j++) {
                mergedRow[j] = rowA[j];
            }

            // Copia elementi di b
            for (int j = 0; j < rowB.length; j++) {
                mergedRow[rowA.length + j] = rowB[j];
            }

            // Riempi con 0 se la riga combinata è più corta di maxWidth
            for (int j = rowA.length + rowB.length; j < maxWidth; j++) {
                mergedRow[j] = 0;
            }

            result[i] = mergedRow;
        }

        return result;
    }
    



    public static void main(String[] args) {
        
        int[][] a = {
        //   0  1  2  3  4
            {1, 2},
            {1, 2, 3, 4},
            {1, 2, 3, 4, 5}
        };

        int[][] b = {
        //   0  1  2  3
            {3, 4, 5, 6},
            {5, 6},
            {}
        };


        System.out.println("getRowWidth(a, 0): " + getRowWidth(a, 0));//getRowWidth(a, 0): 1
        System.out.println("getRowWidth(a, 1): " + getRowWidth(a, 1));//getRowWidth(a, 1): 3
        System.out.println("getRowWidth(a, 2): " + getRowWidth(a, 2));//getRowWidth(a, 2): 4
        System.out.println("getRowWidth(b, 0): " + getRowWidth(b, 0));//getRowWidth(b, 0): 3
        System.out.println("getRowWidth(b, 1): " + getRowWidth(b, 1));//getRowWidth(b, 1): 1
        System.out.println("getRowWidth(b, 2): " + getRowWidth(b, 2));//getRowWidth(b, 2): 0

        System.out.println("getMaxWidth(a, b): " + getMaxWidth(a, b));//7

        System.out.println();

        int mergeIntMatrix[][] = merge(a, b);
        
        for(int i = 0; i < mergeIntMatrix.length; i++) {

            for(int j = 0; j < mergeIntMatrix[i].length; j++ ) {

                System.out.print(mergeIntMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
    
}
