import java.util.Scanner;

public class FrecciaTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero dispari per la base del triangolo: ");
        int base = scanner.nextInt();

        // Controllo per base dispari
        while (base % 2 == 0) {
            System.out.print("La base deve essere un numero dispari. Riprova: ");
            base = scanner.nextInt();
        }

        // Punta iniziale
        System.out.println("*");

        // Parte superiore del triangolo
        for (int riga = 1; riga <= base / 2; riga++) {
            // Inizio
            System.out.print("*");

            // Spazi interni
            for (int colonna = 1; colonna <= riga - 1; colonna++) {
                System.out.print(" ");
            }

            // Fine
            System.out.println("*");
        }

        // Parte inferiore del triangolo
        for (int riga = base / 2 - 1; riga >= 1; riga--) {
            // Inizio
            System.out.print("*");

            // Spazi interni
            for (int colonna = 1; colonna <= riga - 1; colonna++) {
                System.out.print(" ");
            }

            // Fine
            System.out.println("*");
        }

        // Punta finale
        System.out.println("*");

        scanner.close();
    }
    
}
