import java.util.Scanner;

public class CortoCircuito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un valore intero per x: ");
        int x = scanner.nextInt();

        System.out.println("Inserisci un valore intero per y: ");
        int y = scanner.nextInt();

        scanner.close();

        if (x != 0 && y / x > 1) { // short-circuit evaluation to avoid division by zero
            System.out.println("Divisione INTERA y / x > 1");
        } else {
            System.out.println("x e' uguale a zero, oppure la divisione INTERA y / x <= 1");
        }
    }
}
