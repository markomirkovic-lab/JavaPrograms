/*
11.7 Scacchiera
Scrivete un programma che, dopo aver letto da tastiera il numero di celle, riempia un array 
come se fosse una scacchiera, usando lo spazio e il *
Esempio se l'utente immette 5 l'array sara:

* * *
 * *
* * *
 * *
* * *

*/
import java.util.Arrays;
import java.util.Scanner;

public class Es11_7_Scacchiera {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[][] scacchiera;

        Boolean intero;

        int numero = 1;

        // Richiesta all'utente del numero per la grandazza dell'array
        do {
            System.out.print("Inserisci un numero intero per la grandeza del lato della scacchiera: ");

            if(input.hasNextInt()) {
                numero = input.nextInt();
                
                intero = true;
            } else {
                System.out.println("Input errato. Riprova inserendo un numero intero.");
                intero = false;
                input.nextLine();// Svuota il buffer per evitare un cliclo do-while infinito
            }

        } while(!intero);

        scacchiera = new String[numero][numero];

        //System.out.println(scacchiera.length);//5
        //System.out.println(scacchiera[4].length);//5

        System.out.println("Pattern richiesto per la matrice:");

        // Costruzione dell'array
        for(int riga = 0; riga < scacchiera.length; riga++) {

            for(int colonna = 0; colonna < scacchiera[riga].length; colonna++) {

                if( riga % 2 != 0 && colonna % 2 != 0) {
                    System.out.print("*");
                    scacchiera[riga][colonna] = "*";
                } else if(riga % 2 != 0 && colonna % 2 == 0) {
                    System.out.print(" ");
                    scacchiera[riga][colonna] = " ";
                }

                if(riga % 2 == 0 && colonna % 2 == 0) {
                    System.out.print("*");
                    scacchiera[riga][colonna] = "*";
                } else if(riga % 2 == 0 && colonna % 2!= 0) {
                    System.out.print(" ");
                    scacchiera[riga][colonna] = " ";
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Stampa matrice: ");
        for(int i = 0; i < scacchiera.length; i++) {
            
            System.out.println(Arrays.toString(scacchiera[i]));
        }

        System.out.println();
        System.out.println("Stampa matrice: ");
        for(int i = 0; i < scacchiera.length; i++) {
            
            for(int j = 0; j < scacchiera[i].length; j++) {

                System.out.print(scacchiera[i][j]);
            }
            System.out.println();
        }

        /*

        Pattern richiesto per la matrice:
        * * *
        * *
        * * *
        * *
        * * *

        Stampa matrice:
        [*,  , *,  , *]
        [ , *,  , *,  ]
        [*,  , *,  , *]
        [ , *,  , *,  ]
        [*,  , *,  , *]

        Stampa matrice:
        * * *
         * *
        * * *
         * *
        * * *

        */

    }
    
}
