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
*/
public class PacNumV1 {

    public static void step(int[][] m) {

        // controllo matrice valid
        if(m == null || m.length == 0) {
            System.out.println("Matrice non valida.");
            return;
        }

        // controllo dimensione matrice valida
        int rows = m.length;
        int columns = m[0].length;

        for(int i = 0; i < rows; i++) {

            if(m[i] == null || m[i].length != columns) {
                System.out.println("Matrice non valida");
                return;
            }

        }

        // controllo che tutti gli elementi di m tranne uno (che chiameremo X) siano pari a 0

        // Trova la posizione di X e conta i valori non zero
        int countNonZero = 0;
        int xRow = -1;
        int xColumn = -1;

        for(int i = 0; i < m.length; i++) {

            for(int j = 0; j < m[i].length; j++) {

                if(m[i][j] != 0) {
                    xRow = i;
                    xColumn = j;
                    countNonZero++;
                }
            }
        }

        // controllo che non ci siano più valori x nella matrice
        if(countNonZero != 1) {
            System.out.println("Nessun valore non zero trovato oppure piu' valori non zero trovati");
            return;
        }

        // controllo che X deve avere un valore compreso nel range [1;4]
        if(m[xRow][xColumn] < 1 || m[xRow][xColumn] > 4) {
            System.out.println("Parametro x fuori dal range [1;4]");
            return;
        }

        // asseganzione del valore x
        int xValue = m[xRow][xColumn];

        // Azzera la posizione corrente di X
        m[xRow][xColumn] = 0;

        switch (xValue) {
            case 1:
                // sposta in alto di 1
                // m[xRow-1][xColumn] = xValue;
                // se si trova nella prima riga
                //         allora ultima riga : altrimenti una sopra
                xRow = (xRow == 0) ? rows - 1 : xRow - 1;
                break;
            
            case 2:
                // sposta in basso di 1
                // m[xRow+1][xColumn] = xValue;
                // se si trova nella ultima riga: 
                //           allora prima riga :  altrimenti una sotto
                xRow = (xRow ==  rows - 1) ? 0 : xRow + 1;
                break;

            case 3:
                // sposta a sinistra di 1
                // m[xRow][xColumn-1] = xValue;
                // se si trova nella prima colonna:
                //               allora ultima colonna : altrimenti una a sinistra
                xColumn = (xColumn == 0) ? columns - 1 : xColumn - 1;
                break;

            case 4:
                // sposta a destra di 1
                // m[xRow][xColumn+1] = xValue;
                // se si trova nell'ultima colonna:
                //                allora prima colonna : altrimeni una a destra
                xColumn = (xColumn == columns - 1) ? 0 : xColumn + 1;
                break;
        
            default:
                System.out.println("Valore di x e' fuori dai parametri");
                break;
        }

        // impostazione della nuova posizione del valore x
        m[xRow][xColumn] = xValue;

    }

    public static void print(int[][] matrix) {

        // Stampa la matrice dopo l'esecuzione del metodo step
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        // Esempio di utilizzo
        int[][] matrix = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        print(matrix);
        System.out.println();

        step(matrix);

        print(matrix);
        System.out.println();

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 0 0 
        0 0 0
        0 0 0

        Nessun valore non zero trovato oppure piu' valori non zero trovati
        0 0 0
        0 0 0
        0 0 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        1 0 0 
        0 4 0
        0 0 0

        Nessun valore non zero trovato oppure piu' valori non zero trovati
        1 0 0
        0 4 0
        0 0 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 0 0 
        0 4 0
        0 0

        Matrice non valida
        0 0 0
        0 4 0
        0 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> javac PacNumV1.java
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1 
        0 0 0 
        0 1 0
        0 0 0

        0 1 0
        0 0 0
        0 0 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> javac PacNumV1.java
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 1 0 
        0 0 0
        0 0 0

        0 0 0
        0 0 0
        0 1 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> javac PacNumV1.java
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 0 0 
        0 0 0
        0 1 0

        0 0 0
        0 1 0
        0 0 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 0 0 
        0 2 0
        0 0 0

        0 0 0
        0 0 0
        0 2 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> javac PacNumV1.java
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 0 0 
        0 0 0
        0 2 0

        0 2 0
        0 0 0
        0 0 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> javac PacNumV1.java
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 0 0 
        0 3 0
        0 0 0

        0 0 0
        3 0 0
        0 0 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> javac PacNumV1.java
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 0 0 
        3 0 0
        0 0 0

        0 0 0
        0 0 3
        0 0 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> javac PacNumV1.java
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 0 0 
        0 4 0
        0 0 0

        0 0 0
        0 0 4
        0 0 0

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> javac PacNumV1.java
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java PacNumV1      
        0 0 0 
        0 0 4
        0 0 0

        0 0 0
        4 0 0
        0 0 0
        */

    }
    
}
