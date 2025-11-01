import java.util.Scanner;

public class ScannerSottoprogrammaParametro {

    private static int richiediLeggiIntInIntervallo(Scanner scanner, int estremoInferiore, int estremoSuperiore) {
        String messaggioRichiesta = "Inserisci un numero intero nell'intervallo [" + estremoInferiore + ", "
                + estremoSuperiore + "]";
        System.out.println(messaggioRichiesta);
        int userInput = scanner.nextInt();
        while (userInput < estremoInferiore || estremoSuperiore < userInput) {
            scanner.nextLine();
            System.out.println("Il valore inserito e' fuori dall'intervallo.");
            System.out.println(messaggioRichiesta);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valore = richiediLeggiIntInIntervallo(scanner, 0, 10);
        System.out.println("Il valore letto e': " + valore);
        scanner.close();
    }
}
