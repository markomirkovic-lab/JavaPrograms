/*
 * Scrivi un programma che stampa un quadrato di numeri in base all'input dell'utente
 * Esempio:
 * Input utente 4:
 * 1234
 * 1234
 * 1234
 * 1244
 */
import java.util.Scanner;

public class StampaQuadratoNumeri {

    static final int NR_ELEMENTI = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi un numero intero: ");

        int numero = scanner.nextInt();

        scanner.close();

        /* 1 for
        x
        x
        x
        x
        2 for
        xxxxxx */

        // quante righe devo fare
        for(int i = 1; i <= numero; i++){
            // componenti singola riga
            for(int j = 1; j <= numero; j++){
                System.out.print(i + " ");
            }
            System.out.println("");           
            
            

        }
        
        

      

  
        
    }
}
