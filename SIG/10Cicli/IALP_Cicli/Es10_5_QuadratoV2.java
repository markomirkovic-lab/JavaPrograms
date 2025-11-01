/*
10.5 Quadrato
Scrivete un programma che chiede all’utente di immettere un numero e poi stampi a 
schermo un quadrato con la dimensione specificata. Es: se il numero è 5 sullo schermo 
apparirà
*****
*   *
*   *
*   *
*****

*/
import java.util.Scanner;

public class Es10_5_QuadratoV2 {

    public static void main(String[] args) {
              
        Scanner input = new Scanner(System.in);

        System.out.print("Immetti la dimensione del quadrato: ");
        int lato = input.nextInt();

        // Stampa prima riga che e' completa
        for(int colonna = 1; colonna <= lato; colonna++) {
            System.out.print("*");
        }
        System.out.println();// A capo
        /*
        *****


        */

        // Le righe in mezzo (dalla 2 a lato-1) non sono complete
        for(int riga = 2; riga <= lato-1; riga++) {

            for(int colonna = 1; colonna <= lato; colonna++) {

                if(colonna == 1 || colonna == lato) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();// A capo dopo ogni riga
        }
        /*

        *   *
        *   *
        *   *

        */

        // Stampa l'ultima riga che e' completa
        if(lato > 1) {
            for(int colonna = 1; colonna <= lato; colonna++) {
                System.out.print("*");
            }
            System.out.println();// A capo
        }
        /*


        
        *****
        */


        /*
        Immetti la dimensione del quadrato: 5
        *****
        *   *
        *   *
        *   *
        *****
        */

    }
    
}
