import java.util.Scanner;

public class UtilizzoDiScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intero = 0;
        double virgola = 0.0;
        String stringa = "";

        if (scanner.hasNextInt()) {
            intero = scanner.nextInt();
        } else if (scanner.hasNextDouble()) {
            virgola = scanner.nextDouble();
        } else {
            stringa = scanner.nextLine();
        }
        // ...

        scanner.close();
    }
}
