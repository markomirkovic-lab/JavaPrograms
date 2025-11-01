/*
10.3 Freccia
Scrivete un programma che chiede all’utente la dimensione della base di un triangolo.
Se la base è dispari allora disegnerà il triangolo nel modo seguente
*
**
* *
*  *
* *
**
*
Se invece la base fosse pari allora stamperebbe
*
**
* *
* *
**
*
*/

import java.util.Scanner;

public class Es10_3_FrecciaV3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Scrivi la base (numero intero): ");
        int base = input.nextInt();

        // Base dispari
        if(base % 2 != 0) {
            // Punta iniziale
            System.out.println("*");
            // Parte superiore del triangolo
            for(int riga = 1; riga <= base/2; riga++) {
                // Inizio
                System.out.print("*");
                // Spazzi
                for(int colonna = 1; colonna <= riga-1; colonna++) {
    
                    System.out.print(" ");
                }
                // Fine
                System.out.println("*");
            }
            // Parte inferiore del triangolo
            for(int riga = 1; riga < base/2; riga++) {
                // Inizio
                System.out.print("*");
                // Spazzi
                for(int colonna = 0; colonna <= (base/2)-riga; colonna++) {
    
                    System.out.print(" ");
                }
                // Fine
                System.out.println("*");
            }
            // Punta finale
            System.out.println("*");
        }

        // Base pari
        if(base % 2 == 0) {
            // Punta iniziale
            System.out.println("*");
            // Parte superiore del triangolo
            for(int riga = 1; riga <= (base/2)-1; riga++) {
                // Inizio
                System.out.print("*");
                // Spazzi
                for(int colonna = 1; colonna <= riga-1; colonna++) {
    
                    System.out.print(" ");
                }
                // Fine
                System.out.println("*");
            }
            // Parte inferiore del triangolo
            for(int riga = 1; riga < base/2 ; riga++) {
                // Inizio
                System.out.print("*");
                // Spazzi                           
                for(int colonna = 1; colonna < (base/2) - riga ; colonna++) {
    
                    System.out.print(" ");
                }
                // Fine
                System.out.println("*");
            }
            // Punta finale
            System.out.println("*");
        }
       
        input.close();
    }
}
