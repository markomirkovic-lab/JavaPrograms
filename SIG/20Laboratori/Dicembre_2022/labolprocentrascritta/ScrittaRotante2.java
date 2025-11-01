package labolprocentrascritta;

import java.util.Scanner;

public class ScrittaRotante2 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Scanner in= new Scanner(System.in);
        
        
        String s= "SSSE";
        int larghezza=13;

        //Preparo la scritta iniziale
        String display= s;
        for(int c=0; c<larghezza-s.length(); c++)
            display+="-";
        
        System.out.println(display);
        
        
                
        while(true)
        {
            display= display.charAt(display.length()-1) + display.substring(0,display.length()-1);


            for(int i=0; i<25;i++)
                System.out.println("");

            System.out.println(display);
            Thread.sleep(500);
        }
        
    }
}
