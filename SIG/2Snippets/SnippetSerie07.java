import java.util.Scanner;                                           //Notare l'import della libreria Scanner cntenuta nel package java.util

public class SnippetSerie07
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);                         //Dichiaro e inizializza una variabile Scanner, che si aggancia alla tastiera (rappresentata da System.in)
        
        
        int i;
        double d;
        String s;
        char c;
        String sl;
        
        
        //Tecnica di lettura di un dato inserito dall'utente
        
        //Leggiamo un intero
        System.out.print("Inserisci un valore intero: ");           //1. Si stampa un testo di richiesta. Notate che NON si usa il println
        i= in.nextInt();                                            //2. Si legge il valore inserito dall'utente
        in.nextLine();                                              //3. Si esegue una lettura "a vuoto" di qualsiasi cosa supplementare che l'utente ha inserito, per errore, dopo il valore richiesto.
        

        //Leggiamo un double
        System.out.print("Inserisci un valore double: ");           //1. Si stampa un testo di richiesta. Notate che NON si usa il println
        d= in.nextDouble();                                         //2. Si legge il valore inserito dall'utente
        in.nextLine();                                              //3. Si esegue una lettura "a vuoto" di qualsiasi cosa supplementare che l'utente ha inserito, per errore, dopo il valore richiesto.
        

        //Leggiamo una parola (UNA singola parola). Leggerà solo fino al primo spazio o tabulatore.
        System.out.print("Inserisci una parola: ");                 //1. Si stampa un testo di richiesta. Notate che NON si usa il println
        s= in.next().trim();                                        //2. Si legge il valore inserito dall'utente. Quando si legge una String occorre sempre effettuare un trim() per togliere gli spazi prima e dopo la parola
        in.nextLine();                                              //3. Si esegue una lettura "a vuoto" di qualsiasi cosa supplementare che l'utente ha inserito, per errore, dopo il valore richiesto.
        
        
        //Leggiamo un char
        System.out.print("Inserisci un char: ");                    //1. Si stampa un testo di richiesta. Notate che NON si usa il println
        c= in.next().trim().charAt(0);                              //2. Si legge il valore inserito dall'utente. Prelevo il primo carattere della stringa inserita, dopo averla "trimmata"
        in.nextLine();                                              //3. Si esegue una lettura "a vuoto" di qualsiasi cosa supplementare che l'utente ha inserito, per errore, dopo il valore richiesto.
        
        
        //Leggiamo una frase (PIÙ parole)
        System.out.print("Inserisci più parole: ");                 //1. Si stampa un testo di richiesta. Notate che NON si usa il println
        sl= in.nextLine().trim();                                   //2. Si legge il valore inserito dall'utente
        //Dopo una nextLine NON è necessario eseguire una nextLine() a vuoto.
        
        
        //Quando si leggono Stirng e char è SEMPRE consigliabile effettuare un trim(), 
        //per togliere eventuali spazi inseriti per errore dall'utente prima e dopo i dati che vorrete leggere!
        
        
        System.out.println("Hai inserito: ");
        System.out.println("\tun intero: [" + i + "]");
        System.out.println("\tun double: [" + d + "]");
        System.out.println("\tuna stringa di una sola parola: [" + s + "]");
        System.out.println("\tun char: [" + c + "]");
        System.out.println("\tuna stringa di più parole: [" + sl + "]");
    }
    
}
