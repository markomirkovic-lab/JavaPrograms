
import java.util.InputMismatchException;
import java.util.Scanner;

public class SnippetSerie15_Try 
{
    
    /**
     * Questa soluzione invece riduce la logica al minimo.
     * Il codice risulta più pulito e i controlli sono assenti.
     * 
     * Se, nella parte di codice rachciusa dal try, dovesse verificarsi 
     * un'eccezione, il codice verrebbe interrotto e procederebbe
     * nel catch, nel quale inserire la logica di gestione dell'eccezione.
     * 
     * I catch possono essere più di uno, si differenziano dal tipo di 
     * eccezione gestita.
     * 
     * Di solito, l'ultimo catch racchiude una semplice Exception per poter
     * intercettare QUALSIASI eccezione.
     * 
     * Questo sistema consente di intercettare TUTTE le eccezioni possibili.
     * 
     * Il blocco finally, non necessario, chiude il giro, viene eseguito sempre, 
     * sia che tutto funzioni a dovere, sia che qualcosa sia andato storto
     * 
     * @param args 
     */
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        boolean formatoCorretto=false;
        
        do
        {
            try
            {
                System.out.print("Inserisci numero1 (short): ");
                short n1= in.nextShort();
                in.nextLine();



                System.out.print("Inserisci numero2 (int): ");
                int n2= in.nextInt();
                in.nextLine();



                System.out.print("Inserisci numero3 (byte): ");
                byte n3= in.nextByte();
                in.nextLine();
                
                formatoCorretto= true;
            }
            catch (InputMismatchException ime)      //Se è un'eccezione di tipo InputMismatchException, eseguirà questo bocco catch 
            {
                System.out.println("Hai inserito un formato dati errato! Ecco il dettaglio:");
                for (int i = 0; i < ime.getStackTrace().length; i++) 
                {
                    System.out.println("\t" + ime.getStackTrace()[i]);
                }
                in.nextLine();
            }
            catch (Exception e)                     //Altri tipi di eccezione verranno intercettati qui
            {
                System.out.println("Altro tipo di errore [" + e.getCause() + "]\n\n");
                in.nextLine();
            }
            finally
            {
                System.out.println("Continuiamo\n\n");
            }
        } while(!formatoCorretto);
    }
}
