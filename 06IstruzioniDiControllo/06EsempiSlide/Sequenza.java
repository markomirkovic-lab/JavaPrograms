import java.util.Scanner;

public class Sequenza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Limite massimo: ");
        int limiteMax = scanner.nextInt();
        scanner.close();

        int numero = 0;
        while (numero <= limiteMax) {
            System.out.print(numero + " ");
            numero++;
        }
        System.out.println("\nFine");
    }
}