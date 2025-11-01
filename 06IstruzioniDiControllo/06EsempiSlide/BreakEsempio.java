import java.util.Scanner;

public class BreakEsempio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Genera un numero casuale tra 1 e 50
        int numeroCasuale = (int) (Math.random() * 50) + 1;
        // Ciclo infinito
        while (true) {
            System.out.print("Indovina un numero tra 1 e 50: ");
            int numero = scanner.nextInt();
            if (numero == numeroCasuale) {
                break;
            } else if (numero < numeroCasuale) {
                System.out.println("Troppo piccolo!");
            } else {
                System.out.println("Troppo grande!");
            }
        }
        System.out.println("Complimenti, hai indovinato!");
        scanner.close();
    }
}
