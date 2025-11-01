
/*

Area 8x8. Fiocco di neve con bordo
#.#.#.#.
.#.#.#.#
#.#.#.#.
.#.#.#.#
#.#.#.#.
.#.#.#.#
#.#.#.#.
.#.#.#.#

*/
import java.util.Scanner;

public class FiguraScacchieraCancellettiPunti {


    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int lato;
        String messaggio = "Inserici (numero intero dispari diverso da zero) la grandezza \n" + //
                           "del lato della figura simetrica (lato x lato): ";
        
        System.out.print(messaggio);
        lato = input.nextInt();
        input.nextLine();
        System.out.println("");
        
        int righe = lato;
        int colonne = lato;

        // Indici
        int prima = 0;
        int ultima = lato-1;

         
        for (int r = prima; r < righe; r++)             // Per ogni riga
        {
            for (int c = prima; c < colonne; c++)       // Per ogni colonna della riga
            {
                //        0                             // Combinazioni di r e c
                if((r % 2 == 0 && c % 2 == 0) ||        // Riga pari e Colonna pari
                   (r % 2 != 0 && c % 2 != 0)) {        // Riga dispari e Colonna dispari 

                    System.out.print("#");

                } else {
                                                        // Riga pari e Colonna dispari
                    System.out.print(".");            // Riga dispari e Colonna pari   
                } 

                 
            }
            System.out.println("");               // Terminata la riga vado a capo
        }

        System.out.println("");
        input.close();
    
    }
}

