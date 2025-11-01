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

public class MatrixMergerV1 {


    // Ritorna la larghezza (il numero di colonne) della riga row nella matrice m.
    // Se la riga specificata è vuota oppure non è valida, ritorna 0.
    public static int getRowWidth(int[][] m, int row) {

        if(m == null || row < 0 || m[row] == null) {

            return 0;
        }

        return m[row].length;
    }

    // Ritorna la dimensione della riga più larga che si otterrebbe combinando ogni riga
    // di a con la rispettiva riga di b.
    public static int getMaxWidth(int[][] a, int[][] b) {

        int maxWidth = 0;
        //int combinedWidth = 0;

        for(int i = 0; i < Math.max(a.length, b.length); i++) {
            int maxWidthA = getRowWidth(a, i);
            int maxWidthB = getRowWidth(b, i);
            int combinedWidth = maxWidthA + maxWidthB;

            if(combinedWidth > maxWidth) {
                maxWidth = combinedWidth;
            }
        }

        return maxWidth;
    }


    // Ritorna una matrice rettangolare ottenuta combinando le matrici a e b.
    public static int[][] merge(int[][] a, int[][] b) {

        // numero massimo di righe della mergedMatrix
        int maxRows = Math.max(a.length, b.length);
        // larghezza massima della mergedMatrix
        int maxWidth = getMaxWidth(a, b);          

        int[][] mergedMatrix = new int[maxRows][maxWidth];

        for(int i = 0; i < maxRows; i++) {

            // cicli di righe

            // array temporanei di righe di ogni matrice
            // riempe la riga con 0 se la riga non esiste
            /*
            i < a.length: Verifica se l'indice i è valido per la matrice a. ¨
            Se i è minore della lunghezza di a, significa che esiste una riga a[i].
            a[i]: 
            Se la condizione è vera (cioè i è un indice valido per a), assegna 
            la riga a[i] alla variabile rowA.
            new int[0]: 
            Se la condizione è falsa (cioè i non è un indice valido per a), assegna 
            un array vuoto (new int[0]) alla variabile rowA.
            Gestiscono il caso in cui le due matrici a e b hanno un numero diverso di righe. 
            Ad esempio:
            Se a ha 3 righe e b ha 2 righe, quando i = 2, b[i] non esiste. In questo caso, 
            rowB sarà un array vuoto (new int[0]).
            Questo evita errori di accesso a indici non validi (ad esempio, 
            ArrayIndexOutOfBoundsException).
            */
            int[] rowA = i < a.length ? a[i] : new int[0];
            int[] rowB = i < b.length ? b[i] : new int[0];

            // array temporaneo vuoto con lunghezza di righe combinate di matrice a e b
            int[] mergedRow = new int[maxWidth];

            // copia di elementi di a
            for(int j = 0; j < rowA.length; j++) {
                // riempito fino a rowA.length
                mergedRow[j] = rowA[j]; 
            }

            // copia di elementi di b
            for(int j = 0; j < rowB.length; j++) {

                // [rowA.length + j]: aumento l'indice di rowA.length
                mergedRow[rowA.length + j] = rowB[j]; 
            }

            // riempi con 0 se la riga combinata è più corta di maxWidth
            for(int j = rowA.length + rowB.length; j < maxWidth; j++) {
                // per le colonne tra celle riempite e maxWidth
                mergedRow[j] = 0; 
            }

            // ogni righa di mergedMatrix e' uguale a mergedRow
            // dove int[] mergedRow = new int[maxWidth]; e' un array (di righe)
            mergedMatrix[i] = mergedRow;

        }

        return mergedMatrix;
    }

    public static void main(String[] args) {
        

        int[][] a = {
        //   1  2  3  4  5   length
        //   0  1  2  3  4
            {1, 2},
            {1, 2, 3, 4},
            {1, 2, 3, 4, 5}
        };

        int[][] b = {
        //   1  2  3  4  5  6  7   length    
        //   0  1  2  3  4  5  6
            {3, 4, 5, 6, 7, 8, 9},
            {5, 6},
            {}
        };

        // Test getRowWidth
        System.out.println("getRowWidth(a, 0): " + getRowWidth(a, 0)); // 2
        System.out.println("getRowWidth(a, 1): " + getRowWidth(a, 1)); // 4
        System.out.println("getRowWidth(a, 2): " + getRowWidth(a, 2)); // 4
        System.out.println("getRowWidth(b, 0): " + getRowWidth(b, 0)); // 7
        System.out.println("getRowWidth(b, 1): " + getRowWidth(b, 1)); // 2
        System.out.println("getRowWidth(b, 2): " + getRowWidth(b, 2)); // 0

        // Test getMaxWidth
        System.out.println("getMaxWidth(a, b): " + getMaxWidth(a, b)); // 9

        // Print matrix a
        for(int i = 0; i < a.length; i++) {

            for(int j = 0; j < a[i].length; j++ ) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Print matrix b
        for(int i = 0; i < b.length; i++) {

            for(int j = 0; j < b[i].length; j++ ) {

                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Test merge
        int[][] mergedMatrix = merge(a, b);

        System.out.println("Matrice combinata:");
        for(int i = 0; i < mergedMatrix.length; i++) {

            for(int j = 0; j < mergedMatrix[i].length; j++ ) {

                System.out.print(mergedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ciclo for each
        System.out.println("Matrice combinata:");
        for (int[] row : mergedMatrix) {
            System.out.println(Arrays.toString(row));
        }
        
        System.out.println();
        
    } 
    
}
