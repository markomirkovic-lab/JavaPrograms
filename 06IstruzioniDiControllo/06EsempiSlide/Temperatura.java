import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la temperatura: ");
        int temperatura = scanner.nextInt();
        scanner.close();

        if (temperatura < 18) {
            System.out.println("Fa freddo!");
        } else if (temperatura < 25) {
            System.out.println("Si sta bene.");
        } else {
            System.out.println("Fa caldo!");
        }
    }
}