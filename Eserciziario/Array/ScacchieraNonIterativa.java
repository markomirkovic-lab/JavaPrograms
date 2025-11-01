/*
https://gitalb.github.io/eserciziario2.0/array/loops/2018/02/22/scacchiera.html
Scacchiera (non interattivo) Feb 22, 2018 array loops Livello 10 

Scrivi il programma Scacchiera che, dati due numeri interi forniti 
come argomenti da linea di comando che rappresentano il numero di 
righe e il numero di colonne di una matrice:

Crea una matrice con le dimensioni definite dall’utente
Riempie la matrice disponendo i valori 1 e 0 altrenati come su una 
scacchiera.

Esempio, per una matrice 5 x 5:

0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0

Il programma deve funzionare correttamente anche per matrici rettangolari. 

Esempio:

0 1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 
0 1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 
0 1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0

*/

public class ScacchieraNonIterativa {

    public static void main(String[] args) {

        // Usando args, lo scanner non viene utilizzato
        
        // Verifica che ci siano argomenti passati da linea di comando
        if (args.length == 0) {
            System.out.println("Argomento (numero righe e numero colonne) non fornito!");
            return;
        }

        // Verifica che siano stati forniti esattamente due argomenti
        if (args.length != 2) {
            System.out.println("Utilizzo: java Scacchiera <righe> <colonne> (sono necessari 2 parametri).");
             return;
        } else {
            System.out.println("Scacchiera con " + args[0] + " righe e " + args[1] + " colonne: ");
        }

        int righe = Integer.parseInt(args[0]);
        int colonne = Integer.parseInt(args[1]);        

        //Creazione matrice vuota
        int[][] matriceScacchiera = new int[righe][colonne];
        /*
        [[0, 0, 0, 0, 0]
         [0, 0, 0, 0, 0]]
        */

        for(int r = 0; r < matriceScacchiera.length; r++) {

            for(int c = 0; c < matriceScacchiera[r].length; c++) {

                matriceScacchiera[r][c] = (r+c) % 2;
            }
        }

        //             r < righe
        for(int r = 0; r < matriceScacchiera.length; r++) {
        //                 c < colonne
            for(int c = 0; c < matriceScacchiera[r].length; c++) {

                System.out.print(matriceScacchiera[r][c] + " ");
            }
            System.out.println();
        }

    }
    
}
