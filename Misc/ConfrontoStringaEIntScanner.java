/**
Programma confronta se int e stringa e verifica se sono uguali
 */
import java.util.Scanner;

public class ConfrontoStringaEIntScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");
        int numero = input.nextInt();

        //Svuotamento buffer
        input.nextLine();

        System.out.println("Inserisci la seconda stringa");
        String stringa = input.nextLine();

        input.close();

        System.out.println("Numero inserito: " + numero);
        System.out.println("Stringa inserita: " + stringa);

        /*

        // Confronto indirizzi di memoria (NON DA USARE)
        if(numero == stringa) {
            System.out.print("Le stringe sono uguali");
        } else {
            System.out.print("Le stringe sono DIVERSE");
        }

        System.out.println("");

        // Confronto di stringe (USARE)
        if(numero.equals(stringa)) {
            System.out.print("Le stringe sono uguali");
        } else {
            System.out.print("Le stringe sono DIVERSE");
        }

        */

    }
}
