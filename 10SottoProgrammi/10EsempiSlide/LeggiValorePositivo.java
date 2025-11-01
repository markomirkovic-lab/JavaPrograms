import java.util.Scanner;

public class LeggiValorePositivo {

    private static int leggiValorePositivo(Scanner scanner) {
        System.out.print("Inserisci un valore positivo: ");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Valore negativo!");
            return 0;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorePositivo = leggiValorePositivo(scanner);
        System.out.println("Valore letto: " + valorePositivo);

        scanner.close();
    }
}
