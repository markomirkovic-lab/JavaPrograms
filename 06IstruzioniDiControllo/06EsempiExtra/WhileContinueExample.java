import java.util.Scanner;

public class WhileContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero positivo: ");
        int userInput = scanner.nextInt();
        scanner.close();

        int j = userInput + 1;
        while (j > 0) {
            j--;
            if (j == 4) {
                continue;
            }

            System.out.print(j);
            if (j != 0) {
                System.out.print(", ");
            }
        }

        System.out.println("\nFine");
    }
}
