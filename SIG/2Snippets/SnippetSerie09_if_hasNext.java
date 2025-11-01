import java.util.Scanner;

public class SnippetSerie09_if_hasNext
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        //-------------------------------------------------------------
        //In generale, dopo ogni chiamata a nextXXX, tranne nextLine(),
        //dovete chiamare a vuoto, senza memorizzare il risultato, nextLine()
        //Per svuotare il buffer fino al ritorno a capo
        System.out.print("Inserire il lato: ");
        double lato= in.nextDouble();
        in.nextLine();      //!!!!! Ricordatevi sempre di svuotare il buffer
        
        
        
        //-------------------------------------------------------------
        //Lettura da tastiera con controllo del tipo inserito
        System.out.println("Inserisci un int: ");
        int nro;
        if( in.hasNextInt() )
        {
            nro= in.nextInt();
            in.nextLine();      //!!!!! Ricordatevi sempre di svuotare il buffer
            System.out.println("Bravo, hai inserito: " + nro);
        }
        else
        {            
            in.nextLine();      //!!!!! Ricordatevi sempre di svuotare il buffer
            System.out.println("Ti avevo chiesto un int");
        }



        //-------------------------------------------------------------
        //Lettura da tastiera con controllo del tipo inserito, per due immissioni
        System.out.print("Inserisci un int: ");
        int nroInt;
        double nroDouble;
        if( in.hasNextInt() )
        {
            nroInt= in.nextInt();
            in.nextLine();      //!!!!! Ricordatevi sempre di svuotare il buffer
            System.out.println("Bravo, hai inserito: " + nroInt);
            
            
            //Qui rifaccio lo stesso codice della riga 43
            System.out.print("Inserisci un double: ");
            if( in.hasNextDouble() )
            {
                nroDouble= in.nextDouble();
                in.nextLine();      //!!!!! Ricordatevi sempre di svuotare il buffer
                System.out.println("Bravo, hai inserito: " + nroDouble);                
            }
            else
            {
                in.nextLine();      //!!!!! Ricordatevi sempre di svuotare il buffer
                System.out.println("Ti avevo chiesto un double");                
            }            
        }
        else
        {            
            in.nextLine();      //!!!!! Ricordatevi sempre di svuotare il buffer
            System.out.println("Ti avevo chiesto un int");
        }

        
        
        //-------------------------------------------------------------
        //Se dovete leggere un char vedrete che manca il metodo nextChar()
        //Però possiamo prendere una stringa e di quella prelevare il primo carattere
        System.out.println("Inserisci una frase, leggerò solo la prima lettera");
        char t= in.nextLine().charAt(0);
        System.out.println(t);
        

        //Assicuratevi di "trimmare" la stringa per eliminare gli spazi prima e dopo
        System.out.println("Inserisci una frase, leggerò solo la prima lettera");
        char tt= in.nextLine().trim().charAt(0);
        System.out.println(tt);
        
    }
    
}
