package labolprocentrascritta;

import java.util.Scanner;

public class ScrittaRotante 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Inserisci la scritta: ");
        String s= in.nextLine().trim();
        
        System.out.print("La voi centrare in quanti caratteri? ");
        int larghezza= in.nextInt();

        
        
        //Preparo la scritta iniziale
        String display= s;
        for(int c=0; c<larghezza-s.length(); c++)
            display+="-";
        
        System.out.println(display);
        
        
                
        while(true)
        {
            String output= "" + display.charAt(display.length()-1);
            for(int i=0; i<display.length()-1; i++)
                output+= display.charAt(i);
            
            for(int i=0; i<25;i++)
                System.out.println("");
            System.out.println(output);
            Thread.sleep(500);
            
            display=output;
        }
        
    }
}
