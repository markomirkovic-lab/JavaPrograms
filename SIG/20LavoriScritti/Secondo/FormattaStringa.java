package secondolavoroscritto;

import java.util.Scanner;

public class FormattaStringa
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Inserisci un stringa qualsiasi: ");
        String s= in.nextLine().trim();
        
        char c;
        do
        {
            System.out.print("Scegli fra uno dei seguenti caratteri \'-\', \'.\', \'+\': ");
            c= in.nextLine().trim().charAt(0);
            
            if(c!='-' && c!='.' && c!='+')
                System.out.println("Carattere non valido");
        } while(c!='-' && c!='.' && c!='+');
        
        
        String out= "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++)
        {
            if(c=='.')
                out+= "" + c ;
            else if(c=='-')
                out+= "" + c + c;
            else if(c=='+')
                out+= "" + c + c + c;
            out+= "" + s.charAt(i);
        }
        
        System.out.println(out);        
    }
    
}
