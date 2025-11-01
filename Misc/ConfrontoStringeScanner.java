/**
Programma confronta due stringe e verifica se sono uguali
 */
import java.util.Scanner;

public class ConfrontoStringeScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa");
        String primaStringa = input.next();

        System.out.println("Inserisci la seconda stringa");
        String secondaStringa = input.nextLine();

        // Confronto indirizzi di memoria (NON DA USARE)
        if(primaStringa == secondaStringa) {
            System.out.print("Le stringe sono uguali");
        } else {
            System.out.print("Le stringe sono DIVERSE");
        }

        System.out.println("");

        // Confronto di stringe (USARE)
        if(primaStringa.equals(secondaStringa)) {
            System.out.print("Le stringe sono uguali");
        } else {
            System.out.print("Le stringe sono DIVERSE");
        }

    }
}
