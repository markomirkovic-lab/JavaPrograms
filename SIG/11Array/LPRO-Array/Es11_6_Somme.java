/*
11.6 Somme
Scrivete un programma che partendo da due array dati, ne crei un terzo grande quanto il 
primo e inserisca in ogni cella la somma delle celle dei primi due.
Attenzione: il programma si deve adattare alle dimensioni degli array
Es: 
Primo array {2,3,4,5}
Secondo array {1,5,-2,7}
Verrà creato il terzo array che dovrà contenere
{3,8,2,12}

*/

import java.util.Arrays;

public class Es11_6_Somme {

    public static void main(String[] args) {
        
        int[] primoArray = {2, 3, 4, 5};
        int[] secondoArray = {1, 5, -2, 7};

        int[] sommaArray = new int[primoArray.length];

        // esecuzione della somma
        for(int riga = 0; riga < sommaArray.length; riga++) {
            
            sommaArray[riga] = primoArray[riga]+secondoArray[riga];
            
        }

        // stampa versione 1
        for(int riga = 0; riga < sommaArray.length; riga++) {
            
            System.out.print("[" + sommaArray[riga] + "]");
            }
            System.out.println("");

        // stampa versione 2
        System.out.println(Arrays.toString(sommaArray));

        /*
        [3][8][2][12]
        [3, 8, 2, 12]
        */
    }
    
}
