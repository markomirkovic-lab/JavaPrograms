package labolprogennaioresto;

import java.util.Scanner;

public class Variante_3_Calcolo_Resto_Array
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        int importo;
        
        int[] cent=         {200  , 100  , 50     , 20     , 10     , 5     };
        String[] centFrase= {"2fr", "1fr", "50cts", "20cts", "10cts", "5cts"};
        
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
            
            
            //Ok, ora so di aver un double
            int monete=0;
            int resto= importo;
            
            for(int i=0; i<cent.length; i++)
            {
                if(resto>=cent[i])
                {
                    monete= (int)(resto/cent[i]);
                    resto= resto%cent[i];
                    System.out.println(monete + " pezzi da " + centFrase[i]);
                }
            }
            
            if(resto!=0) System.out.println("Restano " + resto + " centesimi");   
            System.out.println("\n\n\n");
        }while(importo!=0);
    }
    
}
