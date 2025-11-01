package secondolavoroscritto;

import java.util.Scanner;

public class Titolatrice
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Inserisci un stringa qualsiasi: ");
        String s= in.nextLine().trim();
        
        int n;
        do
        {
            System.out.print("Inserisci un numero positivo maggiore di 0: ");
            while(!in.hasNextInt())
            {
                System.out.println("Valore non valido");
                in.nextLine();
            }
            n= in.nextInt();
            in.nextLine();
        } while(n<=0 || n>s.length());
        
        
        
        String out= "";
        for (int i = 0; i < n; i++)
        {
            out+= "<";
        }
        out+= s;
        for (int i = 0; i < n; i++)
        {
            out+= ">";
        }
        
        
        System.out.println(out);        
    }
    
}
