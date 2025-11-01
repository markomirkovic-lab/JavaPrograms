import java.util.Scanner;

public class SnippetSerie09_if 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Inserisci un intero: ");
        if( in.hasNextInt() )       //Grazie all'if posso controllare se l'utente ha inserito un intero
        {
            int n=in.nextInt();     //Si, lo leggo
        }
        else
        {
            //No, lo informo dell'errore
            System.out.println("Ti ho detto di inserire un intero!");
            //in.nextLine();// svuoto il buffer
        }
        
        
        
        double dividendo=in.nextDouble();
        double divisore=in.nextDouble();    //Provate ad inserire 0
        if(divisore==0)
        {
            System.out.println("Divisione impossibile");
        }
        else
        {
            System.out.println(dividendo/divisore);
        }
        
        
        
        int età=34;        
        if(età>=65)
        {
            System.out.println("Paghi la metà");
        }
        else if(età>=18)        //Oppure: else if(else if(età>=18 && eta<65). Ma è inutile perchè l'if precedente filtra già i valori oltre il 65
        {
            System.out.println("Buona bevuta");
        }
        else //if(età>=0)
        {
            System.out.println("Non puoi bere");
        }
        
        
        
        boolean faFreddo=true;
        boolean piove=true;        
        if(faFreddo && piove)
        {
            System.out.println("Prendi ombrello e giacca");
        }
        else if(faFreddo && !piove)
        {
            System.out.println("Prendi il giaccone");
        }
        else if(!faFreddo && piove)
        {
            System.out.println("Prendi l'ombrello");
        }
        else
        {
            System.out.println("Prendi la pomata da sole");
        }
          
        //Oppure potete scrivere così
        if(faFreddo==true && piove==true)
        {
            System.out.println("Prendi ombrello e giacca");
        }
        else if(faFreddo==true && piove==false)
        {
            System.out.println("Prendi il giaccone");
        }
        else if(faFreddo==false && piove==true)
        {
            System.out.println("Prendi l'ombrello");
        }
        else //if(!faFreddo && !piove)
        {
            System.out.println("Prendi la pomata da sole");
        }
        
        
        
        String nome=in.nextLine();              //Leggo una stringa
        String n=nome.toLowerCase().trim();     //La porto tutta in minuscolo e gli tolgo gli spazi inutili prima e dopo   
        if( n.charAt(n.length()-1)=='a')        //Se termina con 'a'
        {
            if(n.equals("andrea"))              //Se è andrea
            {
                System.out.println("Potrebbe essere un nome Maschile o femminile");                
            }
            else
            {
                System.out.println("Probabilmente femminile");
            }
        }
    }
    
}
