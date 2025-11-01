import java.util.Scanner;

public class SequenzaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Limite massimo: ");
        int limiteMax = scanner.nextInt();
        scanner.close();

        int numero = 0;
        do {
            System.out.print(numero + " ");
            numero++;
        } while (numero <= limiteMax);
        System.out.println("\nFine");
    }
}