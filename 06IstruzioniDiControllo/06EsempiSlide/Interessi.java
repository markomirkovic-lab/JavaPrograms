import java.util.Scanner;

public class Interessi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero di anni: ");
        int anni = scanner.nextInt();
        System.out.print("Saldo iniziale: ");
        double saldo = scanner.nextDouble();
        System.out.print("Tasso d'interesse: ");
        double tassoInteresse = scanner.nextDouble();
        
        scanner.close();

        for (int i = 0; i < anni; i++) {
            saldo += saldo * tassoInteresse;
            System.out.print("Anno: " + (i + 1));
            System.out.println(" -> Saldo: " + saldo);
        }
    }
}