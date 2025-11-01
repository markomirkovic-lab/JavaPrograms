package labolproresto;

import java.util.Scanner;

public class Variante_0_Base
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        //In questa prima parte scrivo la struttura che permette di leggere un valore numerico double
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
        }while(importo!=0);
    }
    
}
