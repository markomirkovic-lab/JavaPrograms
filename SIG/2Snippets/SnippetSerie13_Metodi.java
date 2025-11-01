import java.util.Scanner;

public class SnippetSerie13_Metodi
{
    //Partendo da un codice funzionante nella main,
    //ecco come farlo diventare un codice di un metodo:
    //  1° decidere il nome del metodo, consiglio di includere un verbo nel nome
    //  2° spostare il codice che funzione nel metodo
    //  3° valore restituito e inseriamo i return
    //  4° generalizzare il più possibile
    
    
    //Terminologia
//  +-------------------------------------------+       Prototipo del metodo
//                +-+                                   Valore di ritorno
//                              +--------------+        Argomenti    
    public static int askNumber(int min, int max)
    {                                               //  Corpo del metodo
        Scanner in= new Scanner(System.in);        
        
        int numero;
        do
        {
            System.out.print("Inserire un numero intero fra " + min + " e " + max + ": "); 
            
            while( !in.hasNextInt() )   
            {
                System.out.print("Ti ho detto un intero fra " + min + " e " + max + "! ");                
                in.nextLine();
            }            
            
            numero= in.nextInt();            
            in.nextLine();                        
        } while(    !(numero>=min && numero<=max)   ); 
        
        return(numero);
    }
    
    
    //Overloading di un metodo
    //Se nel 90% dei casi il metodo askNumber viene usato 
    //con gli stessi valori negli argomenti, allore potete
    //scrivere un metodo con lo stesso nome, senza argomenti,
    //che al suo intenro chiama il metodo generale usando i valori di default
    //
    //Java riconosce i metodi dal nome e dal numero e tipo degli argomenti!
    public static int askNumber()             
    {
        return( askNumber(1,6) );
    }
    
    
    //Questo metodo NON modifica il valore che gli avete fornito in agomento
    public static void m1(int a)       //L'argomento a è locale al metodo!
    {
        ++a;                                            
    }
    
    //Questo metodo incrementa la variabile fornita in argomento
    //restituisce il suo valore.
    //Chi lo chiamo può memorizzarlo oppure no
    public static int m2(int a)                        
    {
        return(++a);    
    }    
    
    
    public static void main(String[] args) 
    {
        int z= 33;                                      
        m1(z);
        System.out.println( z );        //z non cambia, il metodo lavora su una copia
        
        m2(z);
        System.out.println( z );        
        
        z= m2(z);
        System.out.println( z );        
        

        
        int valore= askNumber(1, 6);
        int valore2= askNumber();
        
        
        System.out.println("Numero inserito: " + valore);
    }
    
}
