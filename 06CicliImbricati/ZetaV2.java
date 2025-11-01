
import java.util.Scanner;

public class ZetaV2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int righe;
        int colonne;

        System.out.print("Inserici il numero di righe (numero intero): ");
        righe = input.nextInt();
        input.nextLine();

        System.out.print("Inserici il numero di colonne (numero intero): ");
        colonne = input.nextInt();
        input.nextLine();

        int cnt = 0;

        for (int r = 0; r < righe; r++)
        {
            for (int c = 0; c < colonne; c++) 
            {
                if (r == 0 || c == colonne-r-1 || r == righe-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }

        input.close();
    }
    
}

