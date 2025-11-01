
import java.util.Scanner;

public class SnippetSerie10_cicli
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        
        
        
        //---------------------------------------------------
        //  Ciclo FOR: da usare quando sappiamo prima di iniziare, 
        //             quante volte eseguire il ciclo
        //
        //Essendo un ciclo per il quale so già quante volte dovrò ripeterlo, 
        //userò un for!
        //Il ciclo for è legato a doppio filo con un contatore
        //Di solito, per tradizione dal linguaggio FORTRAN, e dalla matematica, 
        //le variabili dei cicli si chiamano i, j, k, l, m, n
        //Però, il mio consiglio è di usare un nome che ricordi lo scopo 
        //della variabile
        for(int i=5; i<=10; i++)                //Ciclo che parte dal valore 5 fino al 10, inclusi. 
        {
            System.out.println(i);
        }
        

        //---------------------------------------------------
        //  Ciclo WHILE: da usare quando non sappiamo prima di iniziare, 
        //               quante volte eseguire il ciclo. 
        //               Potrebbero essere anche 0 volte
        //
        //Stesso esercizio del precedente, ma il valore iniziale lo inserisce l'utente.
        //Dov'è la differenza? Non sappiamo quanto durerà il ciclo.
        //Non sappiamo neppure se dovrà essere eseguito una volta, 
        //in quanto l'utente potrebbe immettere
        //un numero maggiore di 10, che è corretto
        //Quindi userò un while
        System.out.print("Inserisci il numero di partenza: ");
        int start=in.nextInt();
        in.nextLine();   //Ricordate? sempre da fare per svuotare il buffer!
        while(start<=10)
        {
            System.out.println(start);
            start++;
        }
        
        
        
        //---------------------------------------------------
        //  Ciclo DO-WHILE: da usare quando non sappiamo prima di iniziare, 
        //                  quante volte eseguire il ciclo. 
        //                  Sicuramente però dovrà essere eseguito almeno 
        //                  una volta.
        //
        int valore;
        do
        {
            System.out.print("Inserisci un valore minore o uguale a 10: ");
            valore=in.nextInt();
        } while(valore>10);
        
        
        
        
        //---------------------------------------------------
        //  Attenzione: quando dovete verificare, carattere per carattere, 
        //              una stringa, deve accendersi subito la lampadina 
        //              del ciclo for!
        //
        //  Stringhe e for sono legati a doppio filo!
        //
        //Es: Verificare se una stringa contiene il carattere '@'
        
        String mail="simone.giudice@edu.ti.ch"; //Questa stringa è lunga 24 caratteri, da 0 a 23
        //           012345678901234567890123
        //           0         1         2  
        
        boolean at=false;                       //Prima di iniziare la ricerca imposto una variabile a false, per indicare che non l'ho trovato
        for(int posizione=0;                    //iniziamo dalla posizione 0
                posizione<mail.length();        //andiamo avanti fino a raggiungere l'ultima posizione della stringa
                posizione++)                    //ogni volta avanziamo di una posizione
        {
            if( mail.charAt(posizione)=='@')    //Ho trovato il carattere cercato?
            {
                at=true;                        //Ok, mi segno di averlo trovato
                break;                          //Esco dal ciclo for. così risparmio tempo e non avanzo più nella ricerca.
            }            
        }
        
        if(at)
        {
            System.out.println("Trovato @");
        }
        else
        {
            System.out.println("@ non trovato");
        }
                
        
    }
    
}
