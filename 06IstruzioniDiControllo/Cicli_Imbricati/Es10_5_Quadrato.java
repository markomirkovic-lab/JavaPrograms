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

public class Es10_5_Quadrato {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Immetti un numero: ");
        int numero = input.nextInt();

        for(int i = 0; i < numero; i++) {

            System.out.print("*");
            /*
            
            *
            *   
            *   
            *   
            *
            
            */

            for(int j = 0; j < numero; j++) {

                if(i == 0 && j > 0) {
                    System.out.print("*");
                }

                /*
                 ****
                
                */

                if( i > 0 && i < numero-1 && j > 0 && j < numero-1) {
                    System.out.print(" ");
                }
                /*
                
                 spazi
                 spazi
                 spazi

                */

                if(i > 0 && i < numero-1 && j == numero-1) {
                    System.out.print("*");
                }
                /*

                      *
                      *
                      *

                */

                if(i == numero-1 && j > 0) {
                    System.out.print("*");
                }
                /*
                
                 ****
                */
            }
            System.out.println("");
        }

        /*

        Immetti un numero: 5
        *****
        *   *
        *   *
        *   *
        *****

        */

    }
    
}
