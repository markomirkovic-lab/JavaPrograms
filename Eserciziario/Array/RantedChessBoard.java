
/*
https://gitalb.github.io/eserciziario2.0/args/array/loops/2024/09/13/rantedchessboard.html

RantedChessBoard Sep 13, 2024 args array loops Livello 6 

Scrivi il programma RantedChessBoard che riceve N interi come argomenti da linea di comando 
e crea una matrice ranted contenente N righe. Ogni riga possiede la lunghezza definita dal 
rispettivo argomento. La matrice va poi riempita a scacchiera, ossia con un’alternanza di 0 e 1.

Ad esempio gli argomenti "1 3 2" producono una matrice di 3 righe in cui la prima ha dimensione 
1, la seconda 3 e la terza 2:

0 
1 0 1 
0 1 

Per "7 5 4 3 2 8" si ottiene invece:

0 1 0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 
1 0 1 
0 1 
1 0 1 0 1 0 1 0 

E per "1 2 3 4 5 6 7 2 2 2":

0 
1 0 
0 1 0 
1 0 1 0 
0 1 0 1 0 
1 0 1 0 1 0 
0 1 0 1 0 1 0 
1 0 
0 1 
1 0

*/
import java.util.Arrays;
import java.util.Scanner;

public class RantedChessBoard {   
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Verifica che ci siano argomenti passati da linea di comando
        if (args.length == 0) {
            System.out.println("Nessun argomento fornito.");
            scanner.close();
            return;
        }
       

        // Crea la matrice ranted con il numero righe uguale alla 
        // lunghezza (3), all'inizio ranted e' vuoto:
        // ranted = [null, null, null]
        int[][] ranted = new int[args.length][];
        System.out.println("args.length: " + args.length);
        // input linea di comando:
        // args = ["1", "3", "2"]
        // per java RantedChessBoard 1 3 2, args.length = 3
        // int[][] ranted = new int[args.length][];
        // int[][] ranted = new int[3][]; che equivale a: ranted: [null, null, null]
        System.out.println("ranted: " + Arrays.toString(ranted));
        //ranted: [null, null, null]
        System.out.println("");


        // Riempie la matrice a scacchiera
        // i indice riga
        for (int i = 0; i < args.length; i++) {
            // trasformo args in int
            int length = Integer.parseInt(args[i]);//1 3 2 (int)
            
            // Ogni elemento di ranted (cioè ranted[i]) è a sua volta un array di interi (int[]).
            // La lunghezza di ciascuna riga della matrice è determinata dagli argomenti passati da linea di comando.
            // new int[length] crea un nuovo array di interi (int[]) con una lunghezza specificata dal valore di length.
            ranted[i] = new int[length];
            // ranted[0] = new int[1]  [[0]
            // ranted[1] = new int[3]   [0,0,0]
            // ranted[2] = new int[2]   [0,0]]
            /*
            Come funziona ranted[i] = new int[length];
            ranted è un array di array (int[][]), ma inizialmente è vuoto.
            ranted[i] rappresenta la riga i-esima della matrice.
            new int[length] crea un nuovo array di interi con la lunghezza 
            specificata (length).
            Assegnando ranted[i] = new int[length];, stai dicendo a Java: 
            "Crea una nuova riga per la matrice, con una lunghezza specifica, e 
            assegnamela alla posizione i
            */

            // j indice colonna
            for (int j = 0; j < length; j++) {
                // Alterna 0 e 1 in base alla posizione (i + j)
                ranted[i][j] = (i + j) % 2;
                // 0 + 0 % 2 = 0 % 2 = 0        0       ranted[0] = [0]
                // 1 + 0 % 2 = 1 % 2 = 1        1
                // 1 + 1 % 2 = 2 % 2 = 0          0
                // 1 + 2 % 2 = 3 % 2 = 1            1   ranted[1] = [1, 0, 1]
                // 2 + 0 % 2 = 2 % 2 = 0        0
                // 2 + 1 % 2 = 3 % 2 = 1          1     ranted[2] = [0, 1]

                /*
                Passo	Operazione	                    Stato della matrice ranted
                1	    Inizializzazione	            [null, null, null]
                2	    Allocazione riga 0 (length=1)	[[0], null, null]
                3	    Allocazione riga 1 (length=3)	[[0], [0, 0, 0], null]
                4	    Allocazione riga 2 (length=2)	[[0], [0, 0, 0], [0, 0]]
                5	    Riempimento riga 0	            [[0], [0, 0, 0], [0, 0]]
                6	    Riempimento riga 1	            [[0], [1, 0, 1], [0, 0]]
                7	    Riempimento riga 2	            [[0], [1, 0, 1], [0, 1]]
                8	    Stampa	0 \n 1 0 1 \n 0 1
                */
            }
        }
        
        // Stampa la matrice
        for (int[] row : ranted) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println(Arrays.toString(ranted[0]));
        System.out.println(Arrays.toString(ranted[1]));
        System.out.println(Arrays.toString(ranted[2]));
        System.out.println("");
        
        
        // Stampa la matrice
        System.out.println("Matrice:");
        for (int i = 0; i < ranted.length; i++) {
            for (int j = 0; j < ranted[i].length; j++) {
                System.out.print(ranted[i][j] + "\t");
            }
            System.out.println();
        }

        /*
        Matrice:
        0
        1       0       1
        0       1
        */
        

        scanner.close();
    }
}


