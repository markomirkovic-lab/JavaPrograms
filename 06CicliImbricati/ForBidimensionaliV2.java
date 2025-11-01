
/*
Esempio (r x c) 10 x 5

   0 1 2 3 4
0  #   #   # -
1 -
2  #   #   # 
3 -
4  #   #   # -
5 -
6  #   #   # -
7 -
8  #   #   # -
9 -


 # # #-
-
 # # #-
-
 # # #-
-
 # # #-
-
 # # #-
-

*/
import java.util.Scanner;

public class ForBidimensionaliV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lato;

        System.out.print("Inserici (numero intero) la grandezza del lato della figura simetrica (lato x lato): ");
        lato = input.nextInt();
        input.nextLine();
        System.out.println("");

        int righe = lato;
        int colonne = lato/2;

        if (lato % 2 == 0) {
            // colonne = lato + 1;
        }

        // Indici
        int prima = 0;
        int ultima = lato - 1;

        for (int r = prima; r < righe; r++) // Per ogni riga
        {
            // Il codice che inserirete qui sarà eseguito PRIMA
            // di iniziare a elaborare le cella di una riga 

            if(r % 2 == 0) {
                System.out.print(" ");// Se pari stampo uno spazio
            } else {
                System.out.print("-");// Se dispari stampo un -
            }

            for (int c = prima; c < colonne; c++) // Per ogni colonna della riga
            {
                // Combinazioni di r e c

                // Questo codice verrà eseguito
                // per ogni cella della matrice a due dimensioni

                if(r % 2 == 0 && c % 2 ==0) {
                    System.out.print("#");// Se pari stampo un cancelletto
                } else {
                    System.out.print(" ");// Se dispari stampo uno spazio
                }

            }

            // Il codice che inserirete qui sarà eseguito
            // DOPO aver trattato una riga completa della
            // matrice a due dimensioni

            if(r % 2 == 0) {
                System.out.print("-");// Se pari stampo un -
            } else {
                System.out.print(" ");
            }

            System.out.println(""); // Terminata la riga vado a capo
        }

        System.out.println("");
        input.close();
    }

}
