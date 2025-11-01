/*
https://gitalb.github.io/eserciziario2.0/array/methods/2017/05/09/pacnum.html
PacNum May 9, 2017 array methods Livello 14 

Scrivere il programma PacNum contenente il metodo:

void step(int[][] m)
Tale metodo, data la matrice m (di qualsiasi dimensione valida):

1.
controlla che i valori contenuti nella matrice rispettino le regole seguenti 
(altrimenti termina senza fare nulla):
controlla che tutti gli elementi di m tranne uno (che chiameremo X) siano pari a 0
X deve avere un valore compreso nel range [1;4]

2.
Se la matrice rispetta le regole, ne modifica il contenuto nel modo seguente:
se X vale 1, lo sposta in alto (in su di una riga), se X si trova nella prima 
riga, lo sposta nell’ultima

se X vale 2, lo sposta in basso (in giù di una riga), se X si trova nella ultima 
riga, lo sposta nella prima

se X vale 3, lo sposta a sinistra (a sinistra di una colonna), se X si trova 
nella prima colonna, lo sposta nell’ultima

se X vale 4, lo sposta a destra (a destra di una colonna), se X si trova nella 
ultima colonna, lo sposta nella prima

Esempio:

0	0	0				    0	1	0
0	1	0 	-> diventa ->	0	0	0
0	0	0				    0	0	0

Oppure:

0	0	0				    0	0	0
0	0	3	-> diventa ->	0	3	0
0	0	0				    0	0	0

Oppure:

0	0	0				    0	0	0
3	0	0	-> diventa ->	0	0	3
0	0	0				    0	0	0

+++

Spiegazione del codice:

Controllo della validità della matrice: Il metodo step inizia controllando 
se la matrice è valida (non nulla e con dimensioni valide).

Una matrice non rettangolare potrebbe causare errori durante l'accesso agli 
elementi (ad esempio, ArrayIndexOutOfBoundsException). Pertanto, è 
fondamentale verificare che la matrice sia rettangolare prima di 
procedere con le operazioni di spostamento

Controllo di matrice rettangolare:
Dopo aver determinato il numero di colonne della prima riga (cols = m[0].length), 
il codice verifica che tutte le altre righe abbiano la stessa lunghezza.

Se una riga ha una lunghezza diversa (m[i].length != cols), il metodo termina 
senza fare nulla.

Gestione di righe nulle:

Se una riga è null, il metodo termina immediatamente, poiché una matrice con righe nulle non è valida.

Ricerca dell'elemento non zero (X): Il codice scorre la matrice per trovare 
l'elemento non zero (X) e conta quanti elementi non zero ci sono. Se ci 
sono più di un elemento non zero o se l'elemento non zero non è nel 
range [1, 4], il metodo termina senza fare nulla.

Spostamento di X: Dopo aver trovato X, il codice azzera la sua posizione 
corrente e lo sposta in base al suo valore:

Se X è 1, lo sposta in alto (se è nella prima riga, lo sposta nell'ultima).

Se X è 2, lo sposta in basso (se è nell'ultima riga, lo sposta nella prima).

Se X è 3, lo sposta a sinistra (se è nella prima colonna, lo sposta nell'ultima).

Se X è 4, lo sposta a destra (se è nell'ultima colonna, lo sposta nella prima).

Aggiornamento della matrice: 
Infine, il valore di X viene impostato nella nuova posizione.

*/
public class PacNumV2 {

    public static void main(String[] args) {
        // Esempio di utilizzo
        int[][] matrix = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        step(matrix);

        // Stampa la matrice dopo l'esecuzione del metodo step
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void step(int[][] m) {
        // Controlla se la matrice è valida
        if (m == null || m.length == 0) {
            return;
        }

        int rows = m.length;
        int cols = m[0].length;

        // Verifica che tutte le righe abbiano la stessa lunghezza (matrice rettangolare)
        for (int i = 1; i < rows; i++) {
            if (m[i] == null || m[i].length != cols) {
                return; // Matrice non rettangolare
            }
        }

        int xRow = -1, xCol = -1;
        int countNonZero = 0;

        // Trova la posizione di X e conta i valori non zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (m[i][j] != 0) {
                    xRow = i;
                    xCol = j;
                    countNonZero++;
                }
            }
        }

        // Controlla se c'è esattamente un elemento non zero e se è nel range [1, 4]
        if (countNonZero != 1 || m[xRow][xCol] < 1 || m[xRow][xCol] > 4) {
            return;
        }

        int xValue = m[xRow][xCol];

        // Azzera la posizione corrente di X
        m[xRow][xCol] = 0;

        // Muovi X in base al suo valore
        switch (xValue) {
            case 1:
                // Sposta in alto
                xRow = (xRow == 0) ? rows - 1 : xRow - 1;
                break;
            case 2:
                // Sposta in basso
                xRow = (xRow == rows - 1) ? 0 : xRow + 1;
                break;
            case 3:
                // Sposta a sinistra
                xCol = (xCol == 0) ? cols - 1 : xCol - 1;
                break;
            case 4:
                // Sposta a destra
                xCol = (xCol == cols - 1) ? 0 : xCol + 1;
                break;
        }

        // Imposta il nuovo valore di X nella nuova posizione
        m[xRow][xCol] = xValue;
    }
}