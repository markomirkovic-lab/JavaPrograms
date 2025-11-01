/*

*   
 *
  *
   *
  *
 *
*

*/


import java.util.Scanner;

public class PuntaDiFreccia
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

                // Dispari

                if(righe % 2 != 0) {

                    if(r < righe && c <= colonne/2) 
                    {
                        if (r == c || c + r == righe-1)
                        {
                            System.out.print("*");

                        } else if(r == righe/2 && c == colonne/2) {

                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                }

                // Pari

                if(righe % 2 == 0) {

                    if(r <= righe && c<colonne/2) 
                    {
                        if (r == c || c + r == righe-1)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                }

                
                
            }
            System.out.println("");
        }

        input.close();
    }
    
}

