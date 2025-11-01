/**
Il programma legge un valore dell'utente e
- se il valore e' 9 o 10, stampa "Prima condizione" e "Pippo"
- se il valore e' 11, stampa "Seconda condizione" e Pluto"
- se il valore e' diverso da 10 o 11, stampa "Terza condizione" e
  il valore inserito dall'utente
 */
import java.util.Scanner;

public class Controllo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserici un valore numerico (numero intero): ");
        int valoreInseritoDalUtente = input.nextInt();

        input.close();

        // Logic

        if(valoreInseritoDalUtente == 10 || valoreInseritoDalUtente == 9) {// boolean: true or false
            System.out.println("Prima condizione");
            System.out.println("Pippo");
        } else if(valoreInseritoDalUtente == 11) {// boolean: true or false
            System.out.println("Seconda condizione");
            System.out.println("Pluto");
        } else {// all other cases
            System.out.println("Terza condizione");
            System.out.println(valoreInseritoDalUtente);
        }

        System.out.println("Fine programma");
    }
  
}
