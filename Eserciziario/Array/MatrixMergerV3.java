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
public class MatrixMergerV3 {


    /*
    Spiegazione del codice:

    Questo codice dimostra il funzionamento dei metodi e come possono essere 
    utilizzati per combinare due matrici di interi.

    getRowWidth: 
    Questo metodo restituisce la larghezza di una riga specifica in una matrice. 
    Se la riga non esiste o è vuota, restituisce 0.

    getMaxWidth: 
    Questo metodo calcola la larghezza massima che si otterrebbe combinando ogni 
    riga di a con la rispettiva riga di b. Utilizza getRowWidth per ottenere la 
    larghezza di ogni riga e poi somma le larghezze corrispondenti.

    merge: 
    Questo metodo combina le due matrici a e b concatenando le righe corrispondenti. 
    La matrice risultante avrà un numero di righe pari alla matrice più alta e un 
    numero di colonne pari alla larghezza massima calcolata con getMaxWidth. 
    Le celle in eccesso vengono riempite con 0.

    main: 
    Il metodo main contiene un esempio di utilizzo dei metodi. Vengono create due 
    matrici a e b, combinate con merge, e poi stampate. Vengono anche testati i 
    metodi getRowWidth e getMaxWidth.

    Output atteso:
    Matrice combinata:
    1 2 3 4 5 6 
    1 2 3 4 5 6 
    1 2 3 4 5 6 
    Larghezza della riga 1 di a: 4
    Larghezza della riga 2 di b: 0
    Larghezza massima combinata: 6

    */

    // Metodo per ottenere la larghezza di una riga specifica in una matrice
    public static int getRowWidth(int[][] m, int row) {
        if (m == null || row < 0 || row >= m.length || m[row] == null) {
            return 0;
        }
        return m[row].length;
    }

    // Metodo per ottenere la larghezza massima delle righe combinate di due matrici
    public static int getMaxWidth(int[][] a, int[][] b) {
        int maxWidth = 0;
        int maxRows = Math.max(a.length, b.length);

        for (int i = 0; i < maxRows; i++) {
            int widthA = getRowWidth(a, i);
            int widthB = getRowWidth(b, i);
            maxWidth = Math.max(maxWidth, widthA + widthB);
        }

        return maxWidth;
    }

    // Metodo per combinare due matrici concatenando le righe corrispondenti
    public static int[][] merge(int[][] a, int[][] b) {
        int maxRows = Math.max(a.length, b.length);
        int maxWidth = getMaxWidth(a, b);
        int[][] result = new int[maxRows][maxWidth];

        for (int i = 0; i < maxRows; i++) {
            int[] rowA = i < a.length ? a[i] : new int[0];
            int[] rowB = i < b.length ? b[i] : new int[0];
            int[] mergedRow = new int[maxWidth];

            // Copia gli elementi della riga di a
            for (int j = 0; j < rowA.length; j++) {
                mergedRow[j] = rowA[j];
            }

            // Copia gli elementi della riga di b
            for (int j = 0; j < rowB.length; j++) {
                mergedRow[rowA.length + j] = rowB[j];
            }

            // Se la riga combinata è più corta di maxWidth, riempi con 0
            for (int j = rowA.length + rowB.length; j < maxWidth; j++) {
                mergedRow[j] = 0;
            }

            result[i] = mergedRow;
        }

        return result;
    }

    // Metodo main per testare i metodi
    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {1, 2, 3, 4},
            {1, 2, 3, 4, 5, 6}
        };

        int[][] b = {
            {3, 4, 5, 6},
            {5, 6},
            {}
        };

        int[][] mergedMatrix = merge(a, b);

        System.out.println("Matrice combinata:");
        for (int[] row : mergedMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Test getRowWidth
        System.out.println("Larghezza della riga 1 di a: " + getRowWidth(a, 1)); // Dovrebbe stampare 4
        System.out.println("Larghezza della riga 2 di b: " + getRowWidth(b, 2)); // Dovrebbe stampare 0

        // Test getMaxWidth
        System.out.println("Larghezza massima combinata: " + getMaxWidth(a, b)); // Dovrebbe stampare 6
    }
}