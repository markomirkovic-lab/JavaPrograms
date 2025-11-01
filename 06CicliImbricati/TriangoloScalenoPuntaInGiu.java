
/*

*****
 *  *
  * *
   **
    *

*/
import java.util.Scanner;

public class TriangoloScalenoPuntaInGiu
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int righe;
        int colonne;

        // Lati (in teoria basterebbe un solo lato)

        System.out.print("Inserici il numero di righe (numero intero): ");
        righe = input.nextInt();
        input.nextLine();

        System.out.print("Inserici il numero di colonne (numero intero): ");
        colonne = input.nextInt();
        input.nextLine();
        
        for (int r = 0; r < righe; r++)
        {
            for (int c = 0; c < colonne; c++) 
            {

                if(r <= righe) {
                    if (r == 0 || r == c || c == colonne-1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                
            }
            System.out.println("");
        }

        input.close();
    }
    
}

