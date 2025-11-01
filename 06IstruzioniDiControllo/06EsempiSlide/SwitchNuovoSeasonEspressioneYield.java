import java.util.Scanner;

public class SwitchNuovoSeasonEspressioneYield {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = input.nextInt();
        input.close();

        // Con la “notazione freccia”, la keyword yield può essere usata solo
        // all’interno di blocchi di codice.
        // String season = switch (month) {
        // case 12, 1, 2 -> yield "winter";
        // case 3, 4, 5 -> yield "spring";
        // case 6, 7, 8 -> yield "summer";
        // case 9, 10, 11 -> yield "autumn";
        // default -> yield "not identifiable";
        // };

        // Versione funzionante in quanto yield è usata all’interno di blocchi di
        // codice.
        String season = switch (month) {
            case 12, 1, 2 -> {
                yield "winter";
            }
            case 3, 4, 5 -> {
                yield "spring";
            }
            case 6, 7, 8 -> {
                yield "summer";
            }
            case 9, 10, 11 -> {
                yield "autumn";
            }
            default -> {
                System.out.println("Provided number is not a valid month!");
                yield "not identifiable";// yield must be stated!
            }
        };

        System.out.println("The season is " + season + ".");
    }
}
