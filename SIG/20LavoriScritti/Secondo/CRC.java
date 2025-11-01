package secondolavoroscritto;

import java.util.Scanner;

public class CRC 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Inserire una stringa: ");
        String s= in.nextLine().trim();
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)<'0' || s.charAt(i)>'9')
            {                
                System.out.println("Il formato del codice è errato");
                break;
            }
        }

        
        int somma=0;
        for(int i=0; i<s.length()-1; i++)
        {
            somma+= s.charAt(i)-'0';
        }
        
        if(somma%10==(s.charAt(s.length()-1)-'0'))
        {
            System.out.println("Codice corretto");
        }
        else
        {
            System.out.println("Codice errato");
        }

    }
}
