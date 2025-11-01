
/*

+-----+
|     |
| ... |
| ... |
| ... |
|     |
+-----+

*/
import java.util.Scanner;

public class Figura_Esercizio_Blog_Bis {
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

                if (r == prima && (c == prima || c == ultima) ||
                        r == ultima && (c == prima || c == ultima)) {

                    System.out.print("+");

                } else if (r == prima && (c != prima || c != ultima) ||
                        r == ultima && (c != prima || c != ultima)) {

                    System.out.print("-");

                } else if (r != prima && (c == prima || c == ultima) ||
                        r != ultima && (c == prima || c == ultima)) {

                    System.out.print("|");

                } else if ((r > prima + 1 && r < ultima - 1) &&
                        (c > prima + 1 && c < ultima - 1)) {

                    System.out.print(".");

                } else {

                    System.out.print(" ");
                }

            }
            System.out.println(""); // Terminata la riga vado a capo
        }

        System.out.println("");
        input.close();
    }

}
