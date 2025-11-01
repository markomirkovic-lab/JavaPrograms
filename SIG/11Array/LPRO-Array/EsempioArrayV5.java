/*
Matrice (insieme di array)
righe x colonne
indice: viene indicato con prima righe poi colonne per convenzione
*/

import java.util.Arrays;

public class EsempioArrayV5 {
    
    public static void main(String[] args) {

        // matrice = array di array
        double[][] matrice = {
                                {2.78, 12.58, -23.5, 98.76},// prima riga
                                {12.34, 0.02, 7.81, -5.78}, // seconda riga
                                {-3.76, 7.34, 44.44, 1.23}  // terza riga
                             };
        
        System.out.print("[");                     
        System.out.println(Arrays.toString(matrice[0]));
        System.out.println(Arrays.toString(matrice[1]));
        System.out.print(Arrays.toString(matrice[2]));
        System.out.println("]");

        /*
              1      2      3      4
        1  [[2.78, 12.58, -23.5, 98.76]
        2  [12.34, 0.02, 7.81, -5.78]
        3  [-3.76, 7.34, 44.44, 1.23]]

        lungzezza
        in righe
        = 3

            lughezza di ogni riga = 4


        indici:

              0      1      2      3
        0  [[2.78, 12.58, -23.5, 98.76]
        1  [12.34, 0.02, 7.81, -5.78]
        2  [-3.76, 7.34, 44.44, 1.23]]
        
        
        for(int riga = 0; riga < matrice.length; riga++) {
        
        

            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
        
        
        
            System.out.print(matrice[riga][colonna] + "\t");



            }

        */                     

        System.out.println("");

        // ciclo for che scorre tutte le righe
        // FA PASSARE LE RIGHE
        //                       lunghezza in righe = 3
        for(int riga = 0; riga < matrice.length; riga++) {
            // ciclo for che scorre tutte le colonne
            // FA PASSARE LE COLONNE
            //                              lungezza di ogni riga = 4
            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
            
            // indice for riga:
            // 1 -> indice for colonna: 1, 2, 3, 4
            // 2 -> indice for colonna: 1, 2, 3, 4
            // 3 -> indice for colonna: 1, 2, 3, 4

                // stampa (print()) contenuto matriche di ogni [riga][colonna]
                // matrice[0][0] = 2.78
                // matrice[0][1] = 12.58
                // matrice[0][2] = -23.5
                // matrice[0][3] = 98.76
                // println("")
                // matrice[1][0] = 12.34
                // matrice[1][1] = 0.02
                // matrice[1][2] = 78.11
                // matrice[1][3] = -5.78
                // println("")
                // matrice[2][0] = -3.76
                // matrice[2][1] = 7.34
                // matrice[2][2] = 44.44
                // matrice[2][3] = 1.23
                // println("")
                System.out.print(matrice[riga][colonna] + "\t");// viene eseguito riga * colonna = 3 * 4 = 12 volte
            }
            System.out.println("");
        }

        /*
        2.78    12.58   -23.5   98.76
        12.34   0.02    7.81    -5.78
        -3.76   7.34    44.44   1.23
        */

        /*
        FAQ

        Posso cambiare la dimensione di un array una volta istanziato?
            No, dobbiamo crearne uno piu' grande o piu' piccolo, e copiarci i valori.
            Fatto questo assegnamo il nuovo array alla vecchia variable

        Fino a che dimensione posso creare array?
            Fino a quando c'e' memoria RAM: int[][][][][][][] ipercubo;
            Rappresentare array con piu' di tre dimensioni risulta difficile per gli esseri umani.
            (Esempio fatto in classe: vendite prodotto per filiale, nazione, etc.)
        
        Cosa succede se provo ad accedere ad una locazione inessistente?
            Java sollevera' un'eccezione
                Exception in thread "main" java.lang.ArrayIndexOutOfBondsException:
        
        Posso creare array con celle di tipo diverso?
            No, gli array hanno le celle tutte dello stesso tipo.
            C'e' la possibilitä di aggirare il limite tramite gli oggetti.
        */

    }
}
