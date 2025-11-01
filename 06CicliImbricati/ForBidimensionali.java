/*

 # # # # -
-
 # # # # -
-         
 # # # # -
-
 # # # # -
-
 # # # # -
-

*/


import java.util.Scanner;

public class ForBidimensionali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lato;

        System.out.print("Inserici (numero intero) la grandezza del lato della figura simetrica (lato x lato): ");
        lato = input.nextInt();
        input.nextLine();
        System.out.println("");

        int righe = lato;
        int colonne = lato;

        if (lato % 2 == 0) {
            // colonne = lato + 1;
        }

        // Indici
        int prima = 0;
        int ultima = lato - 1;

        for (int r = prima; r < righe; r++) // Per ogni riga
        {
            for (int c = prima; c < colonne; c++) // Per ogni colonna della riga
            {
                // Combinazioni di r e c

                if(r % 2 == 0) {

                    if(c % 2 != 0 && c != ultima) {

                        System.out.print("#");
                    } else if (c % 2 != 0 && c == ultima) {
                        
                        System.out.print("-");

                    } else {

                        System.out.print(" ");
                    }
                } else {

                    if(c == prima) {
                        System.out.print("-");
                    } else {

                        System.out.print(" ");
                    }
                }

            }
            System.out.println(""); // Terminata la riga vado a capo
        }

        System.out.println("");
        input.close();
    }

}
