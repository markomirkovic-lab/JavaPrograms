/*

#####
..#..
..#..
..#..
..#..

*/
import java.util.Scanner;

public class FiguraLetteraTCancellettiPunti
{
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
                //        0
                if(r == prima || c == colonne/2) {      // Combinazioni di r e c

                    System.out.print("#");

                } else {
                    System.out.print(".");            
                }

            }
            System.out.println("");               // Terminata la riga vado a capo
        }

        System.out.println("");
        input.close();
    }
    
}

