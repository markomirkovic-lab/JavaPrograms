import java.util.Scanner;

public class SnippetSerie10_cicli_richiesta_dati_utente
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);        
     
        //Lettura di un dato, verificando che il tipo inserito sia corretto e che il dato sia corretto
        //Ogni volta che dovete leggere dati dall'utente dovreste usare questo codice
        //dalla linea 14 alla linea 35        
        int numero;
        //****************************************************************************************
        do
        {
            //Pongo la richiesta all'utente
            System.out.print("Inserisci un intero fra 1 e 6: "); 
            
            //Controllo che l'utente mi inserisca il tipo di dato corretto
            while( !in.hasNextInt() )   //fintantoche non inserisce un intero
            {
                //Avviso l'utente dell'errore
                System.out.print("Devi inserire un INTERO. Inserisci un intero fra 1 e 6: ");
                
                //Scarto quello che mi ha inserito
                in.nextLine();
            }            
            
            //Se sono uscito dal while precedente, allora il tipo è corretto
            //Lo leggo
            numero= in.nextInt();
            
            //Svuoto il buffer
            in.nextLine();                        
        } while(    !(numero>=1 && numero<=6)   );      //Verifico che il dato sia corretto, in caso contrario (!) continuo nel ciclo
        //******************************************************************
        //Ora il mio dato è utilizzabile
        System.out.println("Numero inserito: " + numero);
        
        
        

        
        //---------------------------------------------------------------------------
        //Riutilizzo il codice precedente, adattandolo per leggere un double
        double val;
        
        do
        {            
            System.out.print("Inserisci un intero fra -3.14 e 3.14: ");
            
            while( !in.hasNextDouble() )    //Adatto il controllo sul tipo
            {
                System.out.print("Devi inserire in DOUBLE. Inserisci un intero fra -3.14 e 3.14: ");
                in.nextLine();
            }
            
            val= in.nextDouble();           //Adatto la lettura
            in.nextLine();
        } while(    !(val>=1 && val<=7)  ); //Adatto il controllo sul valore
        
        System.out.println("Numero inserito: " + val);        
        
        
        
        //---------------------------------------------------------------------------
        //Riutilizzo il codice precedente, adattandolo per leggere una stringa
        String parola;
        
        do
        {
            System.out.print("Inserisci una parola di 5 lettere: ");
            
            //Nel caso di stringhe, il controllo sul tipo è inutile, tutto è una stringa
            //while( !in.hasNext() )
            //{
            //    System.out.print("Devi inserire una STRINGA di 5 caratteri: ");
            //    in.nextLine();
            //}
            
            parola= in.nextLine().trim();
        } while(    !(parola.length()==5)   );
        
        System.out.println("Stringa: " + parola);          
        
        in.close();
    }
    
}
