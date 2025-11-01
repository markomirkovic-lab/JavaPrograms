package labolprogennaioresto;

import java.util.Scanner;

public class Variante_2_Calcolo_Resto_Int
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        int importo;
        
        do
        {
            System.out.print("Inserisci l'importo: ");
            while(!in.hasNextDouble())
            {
                in.nextLine();
                System.out.print("Devi inserire un numerico. Inserisci l'importo: ");                
            }
            importo= (int)(in.nextDouble()*100);    //Da qui in avanti ragioni in centesimi
            in.nextLine();
            
                        
            int monete=0;
            int resto= importo;
            if(resto>=200)
            {
                monete= (int)(resto/200);
                resto= resto%200;
                System.out.println(monete + " pezzi da 2fr");
            }
            
            if(resto>=100)
            {
                monete= (int)(resto/100);
                resto= resto%100;
                System.out.println(monete + " pezzi da 1fr");
            }
            
            if(resto>=50)
            {
                monete= (int)(resto/50);
                resto= resto%50;
                System.out.println(monete + " pezzi da 0.5fr");
            }
            
            if(resto>=20)
            {
                monete= (int)(resto/20);
                resto= resto%20;
                System.out.println(monete + " pezzi da 0.2fr");
            }
            
            if(resto>=10)
            {
                monete= (int)(resto/10);
                resto= resto%10;
                System.out.println(monete + " pezzi da 0.1fr");
            }
            
            if(resto>=5)
            {
                monete= (int)(resto/5);
                resto= resto%5;
                System.out.println(monete + " pezzi da 0.05fr");
            }
            
            if(resto!=0) System.out.println("Restano " + resto + " centesimi");   
            System.out.println("\n\n\n");
        }while(importo!=0);
    }
    
}
