/*
Esercizio 3 - Copia di un array
Scrivete un programma che richieda all’utilizzatore l’immissione di 10 parole e che le
memorizzi in un array. Il programma dovrà copiare l’array in un nuovo array ma con il
contenuto alla rovescia: l’ultima parola dell’array di partenza sarà la prima parola del
nuovo array, la penultima parola dell’array di partenza sarà la seconda parola del
nuovo array e così via. Una volta copiato, visualizzate il contenuto del nuovo array.
Importante: la copia dell’array dovrà essere realizzata utilizzando un ciclo.
*/
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Primo array iniziale (input)
        String parole[] = new String[10];

        // Secondo array di inversione dell'ordine delle parole
        String paroleOrdineInvertito[] = new String[parole.length];

        // Ciclo del primo array
        for(int i = 0; i < parole.length; i++) {

          System.out.print("Scrivi una parola " + (i + 1) + ": ");
          parole[i] = input.next();
        }

        System.out.println("");
        System.out.print("Le parole inverite sono: ");

        // Ciclo del secondo array
        for(int j = 0; j < paroleOrdineInvertito.length; j++) {
          paroleOrdineInvertito[j] = parole[parole.length -1 -j ];
          System.out.print(paroleOrdineInvertito[j]);

          // Stampa ',' fino alla penultima parola
          if(j < paroleOrdineInvertito.length - 1){
            System.out.print(", ");
          }
        }

        /*

        String[] arrStr1 = new String[10];

        int cnt = 0;

        while(cnt < arrStr1.lenth) {
          "Inserisci parola nr " + cntr + " : "
           ...
        }

        for(int i = 0; i < arrStr1.length; i++) {
          print arrStr1[i]
        }

        //Swappo i valori
        String[] arrStr2 = new String[10];
        for(int i = 0; i < arrStr1.length; i++) {
          arrStr2[i]
        }

         */

      



        input.close();
        
    }

    
}
