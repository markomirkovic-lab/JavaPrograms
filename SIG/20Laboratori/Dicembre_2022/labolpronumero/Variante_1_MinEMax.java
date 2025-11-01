package labolpronumero;

import java.util.Scanner;

public class Variante_1_MinEMax
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        
        //ggg!
        //Variante 1:
        //Chiedo di inserire il minimo e il massimo
        System.out.print("Numero minimo: ");
        int min= in.nextInt();
        in.nextLine();

        System.out.print("Numero massimo: ");
        int max= in.nextInt();
        in.nextLine();        
        
        //Verifico se l'utente mi ha inserito davvero un min e un max
        //in caso contrario li scambio
        if( min>max )
        {
            int tmp= min;
            min= max;
            max= tmp;
        }
        
        
        
        //Scelgo un numero a caso fra min e max
        int nro= (int)(Math.random() * (max-min+1)) + min;
        //Per barare un po', possiamo stamparlo, così lo vediamo. Attenti però a togliere queste due righe quando si gioca davvero.
        //System.out.println(nro);
        
        int inserito;       //Qui metterò il numero inserito dall'utente
        do
        {
            //Leggo un numero inserito dall'utente
            System.out.print("Inserisci un numero fra " + min + " e " + max + ": ");
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
