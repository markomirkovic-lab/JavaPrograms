package labolprogennaioresto;

import java.util.Scanner;

public class Variante_1_Calcolo_Resto
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        double importo;
        
        do
        {
            System.out.print("Inserisci l'importo: ");
            while(!in.hasNextDouble())
            {
                in.nextLine();
                System.out.print("Devi inserire un numerico. Inserisci l'importo: ");                
            }
            importo= in.nextDouble();
            in.nextLine();
            
            
            //Ok, ora so di aver un double
            int monete=0;
            double resto= importo;
            if(resto>=2)
            {
                monete= (int)(resto/2);
                resto= resto%2;
                System.out.println(monete + " pezzi da 2fr");
            }
            
            if(resto>=1)
            {
                monete= (int)(resto/1);
                resto= resto%1;
                System.out.println(monete + " pezzi da 1fr");
            }
            
            if(resto>=0.5)
            {
                monete= (int)(resto/0.5);
                resto= resto%0.50;
                System.out.println(monete + " pezzi da 0.5fr");
            }
            
            if(resto>=0.2)
            {
                monete= (int)(resto/0.2);
                resto= resto%0.20;
                System.out.println(monete + " pezzi da 0.2fr");
            }
            
            if(resto>=0.1)
            {
                monete= (int)(resto/0.1);
                resto= resto%0.10;
                System.out.println(monete + " pezzi da 0.1fr");
            }
            
            if(resto>=0.05)
            {
                monete= (int)(resto/0.05);
                resto= resto%0.05;
                System.out.println(monete + " pezzi da 0.05fr");
            }
            
            if(resto<=-0.000001 || resto>=0.000001) System.out.println("Restano " + resto);     //Gestisco le differenze nella rappresentazione dei double
            System.out.println("\n\n\n");
        }while(importo!=0);
    }
    
}
