package labolprocentrascritta;

import java.util.Scanner;

public class Bordatura 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Inserisci la scritta: ");
        String s= in.nextLine().trim();
        
        System.out.print("Quanto bordo vuoi? ");
        int bordo= in.nextInt();

        
        //--------------------------------------------------------------------
        //Variante 1.
        //La dimensione del rettangolo contenitore
        int dimensione= bordo + s.length() + bordo;
        
        for(int r=0; r<dimensione; r++)
        {
            for(int c=0; c<dimensione; c++)
            {
                if(r==0 || r==dimensione-1 || 
                   c==0 || c==dimensione-1)
                {
                    System.out.print("#");
                }
                else if(r==dimensione/2 && c==bordo)
                {
                    System.out.print(s);
                    c=c+s.length()-1;
                }                
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        
        
        //--------------------------------------------------------------------
        //Variante 2
        System.out.println("\n\n\n\n");
        
        int righe= bordo + 1 + bordo;
        int colonne= bordo + s.length() + bordo;
        for(int r=0; r<righe; r++)
        {
            for(int c=0; c<dimensione; c++)
            {
                if(r==0 || r==righe-1 || 
                   c==0 || c==colonne-1)
                {
                    System.out.print("#");
                }
                else if(r==righe/2 && c==bordo)
                {
                    System.out.print(s);
                    c=c+s.length()-1;
                }                
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }        
        
    }
}
