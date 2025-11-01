
import java.util.Scanner;

public class TriangoloInBaseAllAltezza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente l'altezza del triangolo
        System.out.print("Inserisci l'altezza del triangolo: ");
        int altezza = scanner.nextInt();

        // Genera il triangolo
        for (int i = 1; i <= altezza; i++) {
            // Stampa gli spazi (per centrare il triangolo)
            for (int j = 0; j < altezza - i; j++) {
                System.out.print(" ");
            }

            // Stampa i simboli "*"
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Vai a capo dopo ogni riga
            System.out.println();
        }

        scanner.close();
    }
}

