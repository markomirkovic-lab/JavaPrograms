import java.util.Scanner;

/**
 * Versione che utilizza un ciclo while
 *
 * Importante: per semplicità, si da per scontato che il tipo di dato inserito dall'utente sia corretto.
 */
public class MinimoMassimoV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        double numero = scanner.nextDouble();

        double minimo = Double.MAX_VALUE;
        double massimo = -Double.MAX_VALUE;
        int cntNumeri = 0;

        while (numero != 0.) {
            cntNumeri++;
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > massimo) {
                massimo = numero;
            }

            System.out.print("Numero: ");
            numero = scanner.nextDouble();
        }

        if (cntNumeri > 0) {
            System.out.println("Numero minimo: " + minimo);
            System.out.println("Numero massimo: " + massimo);
        } else {
            System.out.println("Nessun valore inserito");
        }

        scanner.close();
    }
}