
import java.util.Scanner;

public class SnippetSerie15_Classic 
{
    /**
     * In questa main andiamo a leggere tre valore:
     * - uno short
     * - un int
     * - un byte
     * 
     * Per ognuno, come vedete, ho dovuto inserire i controlli di validità
     * in un while.
     * 
     * Risultato: il codice risulta poco leggibile in quanto contiene 
     * sia la logica voluta che tutta la logica di controllo.
     * 
     * Inoltre non tutti i casi in grado di provocare un errore potrebbere 
     * essere stati contemplati.
     * 
     * 
     * @param args 
     */
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Inserisci numero1 (short): ");
        while(!in.hasNextShort()) 
        {
            System.out.println("Formato errato!");
            in.nextLine();
        }            
        short n1= in.nextShort();
        in.nextLine();

        
        
        System.out.print("Inserisci numero2 (int): ");
        while(!in.hasNextInt()) 
        {
            System.out.println("Formato errato!");
            in.nextLine();
        }            
        int n2= in.nextInt();
        in.nextLine();

        
        
        System.out.print("Inserisci numero3 (byte): ");
        while(!in.hasNextByte()) 
        {
            System.out.println("Formato errato!");
            in.nextLine();
        }
        byte n3= in.nextByte();
        in.nextLine();
    }    
}
