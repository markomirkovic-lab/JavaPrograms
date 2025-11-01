package serie12;

import java.util.Scanner;

public class SnippetSerie12_Wrapper_Metodi
{
    public static void main(String[] args)
    {
        //-------------------------------------------------
        //  TIPI WRAPPER
        //-------------------------------------------------
        
        //dichiaro un tipo primitivo
        double d= 3.14;
        
        //Dichiaro un tipo wrapper
        Double dw= 3.14;
        dw= new Double(3.14);       //Questa sarebbe la dichiarazione corretta. Ma Java vista la diffusione dei wrapper, ha deciso di renderla implicita (vedi capitolo boxing/unboxing)
        

        //Posso assegnare valori primitiva ai wrapper e viceversa
        d= dw;
        dw= d;
        
        
        //Non devo passare necessariamente dall'equals
        if(d==dw) System.out.println("uguali");
        
        
        //Costanti utili nelle classi wrapper, posso usare delle costanti per rilevare le divisioni per 0
        if(  7.3/0.0 == Double.POSITIVE_INFINITY ) System.out.println("Infinito+");       
        if( -7.3/0.0 == Double.NEGATIVE_INFINITY ) System.out.println("Infinito-");       
        
        //Esiste inoltre una costante per definire un Non numero
        if( Double.isNaN(0.0/0.0)) System.out.println(Double.NaN);
        if( Double.isNaN(Math.sqrt(-1))) System.out.println(Double.NaN);
        //Non potete usare Double.NaN in un test di uguaglianza
        
        
        
        
        
        
        //Convertire una stringa in un numero
        double dn= Double.parseDouble("3.14");
        System.out.println(dn);
        
        int in= Integer.parseInt("12");
        System.out.println(in);

        in= Integer.parseInt("12", 16);     //Convertire un numero usando una base diversa, in questo esempio 12 è da considerare in base 16, quindi 18 in base 10
        System.out.println(in);
        
        in= Integer.parseInt("12", 7);     //Convertire un numero usando una base diversa, in questo esempio 12 è da considerare in base 7, quindi 9 in base 10
        System.out.println(in);
        
        
        
        
        
        
        
        //-------------------------------------------------
        //  METODI
        //-------------------------------------------------
        
        //Due metodi esemplicificativi
        int righe= readInt(1,5);            //Richiede all'utente un intero tra 1 e 5
        int colonne= readInt(1,5);          //Richiede all'utente un intero tra 1 e 5
        int defaultValue= readInt(1,1000);  //Richiede all'utente un intero tra 1 e 1000
        
        
        int[][] matrice= buildMatrix(righe, colonne, defaultValue);   //Genera una matrice delle dimensioni volute
        
        printMatrix(matrice);               //Stampa la matrice
    }
    
    
    /**
     * Restituisce un intero letto da tastiera.
     * 
     * @param min   Valore minimo tollerato
     * @param max   Valore massimo tollerato
     * @return      Valore inserito dall'utente
     */
    public static int readInt(int min, int max)
    {
        Scanner in= new Scanner(System.in);
        
        int readed;
        do
        {
            System.out.print("Inserisci un intero [" + min + ";" + max + "]: ");
            
            while(!in.hasNextInt())
            {
                System.out.print("Tipo errato! Inserisci un intero [" + min + ";" + max + "]: ");
                in.nextLine();
            }
            readed= in.nextInt();
        }while(readed<min || readed>max);
        
        return readed;
    }
    
    
    
    /**
     * Crea una matrice di interi con le dimensioni volute.
     * In ogni cella verrà inserito il valore di default.
     * 
     * @param rows
     * @param cols
     * @param defaultValue
     * @return 
     */
    public static int[][] buildMatrix(int rows, int cols, int defaultValue)
    {
        int[][] ret= new int[rows][cols];       //Genero la matrice delle dimensioni volute
        
        //Inserisco il valore iniziale voluto in tutte le celle
        for(int r=0; r<rows; r++)
            for(int c=0; c<cols; c++)
                ret[r][c]= defaultValue;
        
        //restituisco la matrice generata
        return ret;
    }
    
    
    public static void printMatrix(int[][] m)
    {        
        System.out.println("{");
        for(int r=0; r<m.length; r++)           //Notare che il for si adatta al numero di righe della matrice
        {
            System.out.print("   {");
            for(int c=0; c<m[r].length; c++)    //Notare che il for si adatta al anumero di colonne della matrice
                System.out.print(m[r][c] + (c==m[r].length-1 ? "" : ", "));
            System.out.println("}" + (r==m.length-1 ? "" : ","));
        }        
        System.out.println("}");
    }
    
}
