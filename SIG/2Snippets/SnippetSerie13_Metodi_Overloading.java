import java.util.Scanner;

public class SnippetSerie13_Metodi_Overloading 
{    
    //Variante A.
    //Il più generico, legge numeri interi in qualsiasi range, 
    //necessita dello Scanner
    public static int askInteger(Scanner in, int min, int max) {
        int numero;
        do {    
            System.out.print("Inserisci un intero fra " +min+ " e " +max+ ": "); 
            
            while( !in.hasNextInt() ) {
                System.out.print("Devi inserire un INTERO fra "
                                 +min+" e "+max+": ");                
                in.nextLine();
            }            
            
            numero= in.nextInt();
            
            in.nextLine();                        
        } while(    !(numero>=min && numero<=max)   );        
        
        return numero;
    }    

    //Variante B.
    //Prepara uno Scanner al suo interno
    public static int askInteger(int min, int max) {
        Scanner in= new Scanner(System.in);
        
        return askInteger(in, min, max);
    }    
    
    //Variante C
    //Vuoto, legge numeri da 1 a 6, lo Scanner gli deve essere fornito
    public static int askInteger(Scanner in) {
        return askInteger(in, 1, 6);
    }    
    
    //Variante D
    //Vuoto, legge numeri da 1 a 6, usa l'askInteger che prepara lo Scanner
    public static int askInteger() {
        return askInteger(1, 6);
    }
    
    
    
    
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);                
                        
        int primoNumero;
        primoNumero= askInteger();              //Variante D
        primoNumero= askInteger(in);            //Variante C
        primoNumero= askInteger(23, 44);        //Variante B
        primoNumero= askInteger(in, 54, 78);    //Variante A
        
    }
    
}
