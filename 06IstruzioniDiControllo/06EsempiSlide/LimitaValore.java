import java.util.Scanner;

public class LimitaValore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un intero: ");
        int valore = scanner.nextInt();
        scanner.close();

        if (valore >= 10) {
            valore = 0;
        }
        System.out.println("Valore: " + valore);
    }
}