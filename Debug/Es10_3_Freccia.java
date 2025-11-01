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

public class Es10_3_Freccia {

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

                /*
                   if                                              "*"                  *
                                                1 for      2 for 
                   r    c  base riga <= base/2  colonna <= riga-1  inizio        fine
                   1       7    1       3                          "*"           "*"    **
                        1                       1       <= 1-1=0       
                   ------------------------------------------------------------------
                   2      7    2       3                           "*"           "*"
                        1                       1       <= 2-1=1      " "               * *
                        2                       2       <= 2-1=1      
                        
                   ------------------------------------------------------------------

                   3    3  7    3       3                          "*"           "*"
                        1                       1       <= 3-1=2      " "         
                        2                       2       <= 3-1=2         " "            *  *
                        3                       3
                   ------------------------------------------------------------------
                */
            }

            
            // Parte inferiore del triangolo
            for(int riga = 1; riga < base/2; riga++) {

                // Inizio
                System.out.print("*");
    
                // Spazzi
                for(int colonna = 1; colonna <= (base/2)-riga-1; colonna++) {
    
                    System.out.print(" ");
    
                }

                // Fine
                System.out.print("*");
            }



            // Punta finale
        }

        // Base pari
        if(base % 2 == 0) {

        }

        



    }
    
}
