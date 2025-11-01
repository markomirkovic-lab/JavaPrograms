import java.util.Scanner;

public class OperazioniAritmeticheConFunzione {

    private static int getUserIntInput(Scanner input, String message) {
        System.out.println(message);
        while (!input.hasNextInt()) {
            System.out.println("Errore: l'input non e' di tipo intero.");
            System.out.println(message);
            input.nextLine();
        }
        return input.nextInt();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, d, r = 0;

        do {

            a = getUserIntInput(input, "Inserisci il valore (intero) di a: ");
            b = getUserIntInput(input, "Inserisci il valore (intero) di b: ");
            c = getUserIntInput(input, "Inserisci il valore (intero) di c: ");
            d = getUserIntInput(input, "Inserisci il valore (intero) di d: ");
            r = getUserIntInput(input, "Inserisci il valore (intero) di r: ");

            if (a + b * d == 0 || r == -34) {
                System.out.println("Errore: con i valori attuali la formula sarebbe impossibile.");
            }
        } while (a + b * d == 0 || r == -34);

        int result = 4 / (3 * (r + 34)) - (9 * a + b * c) / 3 + (3 + d * (2 + a)) / (a + b * d);

        System.out.println("Il risultato della formula e' uguale a: " + result);

        input.close();
    }
}