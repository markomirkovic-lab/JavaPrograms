package labolpronovembreimpiccato;

import java.util.Scanner;

public class Variante_2_Disegno 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Inserisci la parola da indovinare: ");
        String parola= in.nextLine().trim().toUpperCase();
        
        //Stampo delle righe a vuoto per "cancellare lo schermo"
        for(int i=0; i<25; i++)
        {
            System.out.println("");
        }
        System.out.println("=================================================");
        
        
        
        //Variabili del gioco
        int lunghezza= parola.length();      //Memorizza quanto è lunga la frase da indovinare
        String lettereTrovate= "";           //Memorizzerà le lettere indovinate
        String lettereSbagliate= "";         //Memorizzerà le lettere errate        
        int restanti= lunghezza;             //Conta quante lettere non abbiamo ancora indovinato
        
                
        do
        {
            //Chiedo all'utente una lettera            
            System.out.print("Inserisci una lettera: ");
            char l= in.nextLine().trim().toUpperCase().charAt(0);
            
            
            //È una lettera già immessa?
            if( lettereTrovate.indexOf(l)==-1 && lettereSbagliate.indexOf(l)==-1 )
            {
                //Scorro la parola e verifico se la lettera esiste
                boolean trovata= false;
                for(int i=0; i<parola.length(); i++)
                {
                    if( parola.charAt(i)==l)        //La lettera c'è?
                    {
                        restanti--;                 //Ne dovrò trovare una in meno                    
                        trovata= true;
                    }
                }

                //Se la lettera è stata trovata, aggiorno la lista delle lettere trovate
                if( trovata )
                {
                    lettereTrovate= lettereTrovate + l;
                }
                else    //Altirmenti quella delle lettere sbagliate
                {
                    lettereSbagliate= lettereSbagliate + l;
                }
            }
            
            System.out.println("\n\n");
            System.out.println("Lunghezza parola: " + parola.length());
            System.out.println("Trovate         : " + lettereTrovate);
            System.out.println("Sbagliate       : " + lettereSbagliate); 
            
            //ggg! Disegno
            switch(lettereSbagliate.length())
            {
                case 0:
                    System.out.println(""            + "\n" +
                                       ""            + "\n" +
                                       ""            + "\n" +
                                       ""            + "\n" +
                                       ""            + "\n" +
                                       "_____________");
                    break;
                case 1:
                    System.out.println("   +"        + "\n" +
                                       "   |"        + "\n" +
                                       "   |"        + "\n" +
                                       "   |"        + "\n" +
                                       "   |"        + "\n" +
                                       "___|_________");                    
                    break;
                case 2:
                    System.out.println("   +_____"   + "\n" +
                                       "   |"        + "\n" +
                                       "   |"        + "\n" +
                                       "   |"        + "\n" +
                                       "   |"        + "\n" +
                                       "___|_________");                    
                    break;
                case 3:
                    System.out.println("   +_____"   + "\n" +
                                       "   | /"      + "\n" +
                                       "   |/"       + "\n" +
                                       "   |"        + "\n" +
                                       "   |"        + "\n" +
                                       "___|_________");                    
                    break;
                case 4:
                    System.out.println("   +_____"   + "\n" +
                                       "   | /  |"   + "\n" +
                                       "   |/"       + "\n" +
                                       "   |"        + "\n" +
                                       "   |"        + "\n" +
                                       "___|_________");                    
                    break;                
                default:
                    System.out.println("   +_____"   + "\n" +
                                       "   | /  |"   + "\n" +
                                       "   |/   O"   + "\n" +
                                       "   |   /#\\" + "\n" +
                                       "   |   / \\" + "\n" +
                                       "___|_________");
                    break;
            }
            
        } while(restanti>0 && lettereSbagliate.length()<5);   


        //ggg! Verifico se è uscito dal ciclo con una vittoria e no
        System.out.println("=================================================");
        if( lettereSbagliate.length()==5 )
        {
            System.out.println("\nPeccato!");
        }
        else
        {
            System.out.println("\nHai trovato tutte le lettere!");
        }
    }
}
