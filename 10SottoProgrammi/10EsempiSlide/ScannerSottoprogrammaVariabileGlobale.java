import java.util.Scanner;

public class ScannerSottoprogrammaVariabileGlobale {

    private static Scanner scanner = new Scanner(System.in);

    private static int richiediLeggiIntInIntervallo(int estremoInferiore, int estremoSuperiore) {
        String messaggioRichiesta = "Inserisci un numero intero nell'intervallo [" + estremoInferiore + ", "
                + estremoSuperiore + "]";
        System.out.println(messaggioRichiesta);
        int userInput = scanner.nextInt();
        while (userInput < estremoInferiore || estremoSuperiore < userInput) {
            System.out.println("Il valore inserito e' fuori dall'intervallo.");
            System.out.println(messaggioRichiesta);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public static void main(String[] args) {

        int valore = richiediLeggiIntInIntervallo(0, 10);
        System.out.println("Il valore letto e': " + valore);
        scanner.close();
    }
}
