/*
https://gitalb.github.io/eserciziario2.0/array/2017/03/21/minmax.html
MinMax Mar 21, 2017 array Livello 10 

Scrivi il programma MinMax che:

Crea una matrice di interi di dimensioni 8 x 8
Riempie la matrice con 64 valori casuali compresi nell’intervallo [0; 100]
Stampa il contenuto della matrice
Trova il valore massimo contenuto nella matrice
Trova il valore minimo contenuto nella matrice
Stampa a terminale il massimo e minimo
Esempio:

14	29	59	88	21	27	14	26	
19	49	54	76	43	36	76	79	
92	71	12	63	8	85	64	43	
18	9	53	95	68	55	7	8	
97	11	37	8	5	43	2	96	
43	76	63	90	94	42	76	98	
82	91	3	81	9	48	66	32	
56	54	62	35	7	75	12	19	

Min: 2
Max: 98
*/

public class MinMax {

    public static void main(String[] args) {


        int righe = 8;
        int colonne = 8;
        int min;
        int max;
  
        // Creazione array
        int[][] matrice = new int[righe][colonne];

        

        // Riempimento matrice
        for (int r = 0; r < righe; r++) {
            for (int c = 0; c < colonne; c++) {
                matrice[r][c] = (int) (Math.random() * 101);//[0;100]

                // matrice[r][c] = (int) (Math.random() * 100) + 1;

                /*
                Math.random() genera un numero double tra 0.0 (incluso) e 1.0 (escluso).
                Moltiplicando per 101, otteniamo un numero tra 0.0 (incluso) e 101.0 (escluso).
                Il casting a int tronca la parte decimale, ottenendo un numero intero tra 0 e 100 (inclusi).

                Differenze tra (Math.random() * 100) + 1 e (Math.random() * 101)
                
                (Math.random() * 100) + 1:
                Math.random() genera un numero tra 0.0 (incluso) e 1.0 (escluso).
                Moltiplicando per 100, otteniamo un numero tra 0.0 (incluso) e 100.0 (escluso).
                Aggiungendo 1, otteniamo un numero tra 1.0 (incluso) e 101.0 (escluso).
                Se facciamo il casting a int, otteniamo un numero intero tra 1 e 100 (inclusi).

                (Math.random() * 101):
                Math.random() genera un numero tra 0.0 (incluso) e 1.0 (escluso).
                Moltiplicando per 101, otteniamo un numero tra 0.0 (incluso) e 101.0 (escluso).
                Se facciamo il casting a int, otteniamo un numero intero tra 0 e 100 (inclusi).
                */
            }
        }

        min = matrice[0][0];
        max = matrice[0][0];

        // Calcolo min/max
        for (int r = 0; r < righe; r++) {
            for (int c = 0; c < colonne; c++) {

                if(max < matrice[r][c]) {
                    max = matrice[r][c];
                }

                if(min > matrice[r][c]) {
                    min = matrice[r][c];
                }
            
            }
        }

        // Stampa array scacchiera
        System.out.println("Matrice con numero righe " + righe + " e numero colonne " + colonne + ":");
        for (int r = 0; r < righe; r++) {
            for (int c = 0; c < colonne; c++) {
                System.out.print(matrice[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        /*
        Matrice con numero righe 8 e numero colonne 8:
        25 11 18 84 70 11 75 52 
        25 30 83 65 77 77 62 96
        78 25 56 53 46 93 7 83
        95 22 18 31 54 94 87 5
        47 45 28 54 28 78 2 65
        30 92 60 6 90 100 48 92
        94 38 72 28 86 11 31 97
        90 75 12 0 64 79 1 80

        Min: 0
        Max: 100
        */

    }
}
