package labolpronovembrenumero;

import java.util.Scanner;

public class Variante_0_Base
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        
        //Scelgo un numero a caso fra 1 e 100
        int nro= (int)(Math.random() * (100)) + 1;
        //Per barare un po', possiamo stamparlo, così lo vediamo. Attenti però a togliere queste due righe quando si gioca davvero.
        //System.out.println(nro);
        
        int inserito;       //Qui metterò il numero inserito dall'utente
        do
        {
            //Leggo un numero inserito dall'utente
            System.out.print("Inserisci un numero fra 1 e 100: ");
            inserito= in.nextInt();
            in.nextLine();
            
            
            //Faccio la magia
            if( inserito<nro )
            {
                System.out.println("Troppo basso!");
            }
            else if( inserito>nro )
            {
                System.out.println("Troppo alto!");
            }
            else //if(inserito==nro)
            {
                System.out.println("Bravo. Indovinato!");
            }            
        }while(nro!=inserito);      //Il ciclo va ripetuto se il numero inserito è diverso da quello scelto dal PC
    }
    
}
