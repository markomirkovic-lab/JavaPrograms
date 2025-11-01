package labolpronumero;

import java.util.Scanner;

public class Variante_3_Tentativi
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        
        //ggg!
        //Variante 3:
        //Contatore dei tentativi
        
        
        
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


        //Determino il 5% e il 10%
        double scarto5= ((max-min)+1)/100.0*5.0;
        double scarto10= ((max-min)+1)/100.0*10.0;


        int tentativi=0;    //ggg! Userò questa variabile per contare i tentativi
        
        int inserito;       //Qui metterò il numero inserito dall'utente
        do
        {
            tentativi++;
            
            //Leggo un numero inserito dall'utente
            System.out.print("Tentativo nro: " + tentativi + ". Inserisci un numero fra " + min + " e " + max + ": ");
            inserito= in.nextInt();
            in.nextLine();
            
            //Bene ora determiniamo di quanto siamo distanti dal numero scelto dal PC
            int differenza= nro-inserito;

            if( differenza==0)
            {
                System.out.println("Bravo. Indovinato!");
            }
            else if( differenza>=-scarto5 && differenza<=scarto5 )
            {
                System.out.println("Fuoco");
            }
            else if( differenza>=-scarto10 && differenza<=scarto10 )
            {
                System.out.println("Fuochino");
            }
            else
            {
                System.out.println("Acqua");
            }
        } while(nro!=inserito);      //Il ciclo va ripetuto se il numero inserito è diverso da quello scelto dal PC
    }    
}
