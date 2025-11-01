package labolprocentrascritta;

import java.util.Scanner;

public class CentraScritta 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Inserisci la scritta: ");
        String s= in.nextLine().trim();
        
        System.out.print("La voi centrare in quanti caratteri? ");
        int larghezza= in.nextInt();
        
        
        
        //Centrata 1
        for(int c=0; c<larghezza; c++)
        {
            if(c==(larghezza-s.length())/2)
            {
                System.out.print(s);
                c=c+s.length()-1;
            }
            else
                System.out.print("-");
        }
        System.out.println("");
        
        
        //Centrata 2
        for(int c=0; c<(larghezza-s.length())/2; c++)
        {
            System.out.print("-");
        }
        System.out.print(s);
        for(int c=(larghezza-s.length())/2+s.length(); c<larghezza; c++)
        {
            System.out.print("-");
        }        
        System.out.println("");        
        
        
        //Sinistra 1        
        for(int c=0; c<larghezza; c++)
        {
            if(c==0)
            {
                System.out.print(s);
                c=c+s.length()-1;
            }
            else
                System.out.print("-");
        } 
        System.out.println("");
        
        
        //Sinistra 2
        System.out.print(s);
        for(int c=0; c<larghezza-s.length(); c++)
        {
            System.out.print("-");
        }  
        System.out.println("");
        
        
        
        //Destra 1        
        for(int c=0; c<larghezza; c++)
        {
            if(c==larghezza-s.length())
            {
                System.out.print(s);
                c=c+s.length()-1;
            }
            else
                System.out.print("-");
        } 
        System.out.println("");
        
        
        //Destra 2        
        for(int c=0; c<larghezza-s.length(); c++)
        {
            System.out.print("-");
        }  
        System.out.print(s); 
        System.out.println("");
        
    }
}
