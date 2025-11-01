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

public class MatrixMergerV2 {

    // Ritorna la larghezza (il numero di colonne) della riga row nella matrice m.
    // Se la riga specificata è vuota oppure non è valida, ritorna 0.
    public static int getRowWidth(int[][] m, int row) {
        if (m == null || row < 0 || row >= m.length || m[row] == null) {
            return 0;
        }
        return m[row].length;
    }

    // Ritorna la dimensione della riga più larga che si otterrebbe combinando ogni riga
    // di a con la rispettiva riga di b.
    public static int getMaxWidth(int[][] a, int[][] b) {
        int maxWidth = 0;

        for (int i = 0; i < Math.max(a.length, b.length); i++) {
            int widthA = getRowWidth(a, i);
            int widthB = getRowWidth(b, i);
            int combinedWidth = widthA + widthB;

            if (combinedWidth > maxWidth) {
                maxWidth = combinedWidth;
            }
        }

        return maxWidth;
    }

    // Ritorna una matrice rettangolare ottenuta combinando le matrici a e b.
    public static int[][] merge(int[][] a, int[][] b) {
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

    // Metodo main per testare il funzionamento
    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {1, 2, 3, 4},
            {1, 2, 3, 4, 5}
        };

        int[][] b = {
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

        // Test merge
        int[][] mergedMatrix = merge(a, b);
        System.out.println("Matrice combinata:");
        for (int[] row : mergedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
