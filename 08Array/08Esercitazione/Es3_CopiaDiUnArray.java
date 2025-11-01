/*
Esercizio 3 - Copia di un array
Scrivete un programma che richieda all’utilizzatore l’immissione di 10 parole e che le
memorizzi in un array. Il programma dovrà copiare l’array in un nuovo array ma con il
contenuto alla rovescia: l’ultima parola dell’array di partenza sarà la prima parola del
nuovo array, la penultima parola dell’array di partenza sarà la seconda parola del
nuovo array e così via. Una volta copiato, visualizzate il contenuto del nuovo array.
Importante: la copia dell’array dovrà essere realizzata utilizzando un ciclo.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Es3_CopiaDiUnArray {

    static final int LENGTH = 10;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] arrayString = new String[LENGTH];
        String[] newArrayString = new String[LENGTH];

        for(int i = 0; i < arrayString.length; i++) {

            System.out.print("Inserisci una parola: ");
            arrayString[i] = input.next();
        }

        for(int i = 0, j = arrayString.length-1; i < arrayString.length; i++, j--) {

            newArrayString[i] = arrayString[j];

        }

        System.out.println(Arrays.toString(arrayString));
        System.out.println(Arrays.toString(newArrayString));


        input.close();

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\08Array\08Esercitazione> java Es3_CopiaDiUnArray      
        Inserisci una parola: boh 
        Inserisci una parola: mah
        Inserisci una parola: hoi 
        Inserisci una parola: oii
        Inserisci una parola: aii
        Inserisci una parola: bee
        Inserisci una parola: moo
        Inserisci una parola: momo
        Inserisci una parola: mai 
        Inserisci una parola: mia
        [boh, mah, hoi, oii, aii, bee, moo, momo, mai, mia]
        [mia, mai, momo, moo, bee, aii, oii, hoi, mah, boh]
        */
    }
    
}
