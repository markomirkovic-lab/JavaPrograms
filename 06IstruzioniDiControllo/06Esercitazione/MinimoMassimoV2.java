import java.util.Scanner;

/**
 * Versione che utilizza un ciclo do ... while
 *
 * Importante: per semplicità, si da per scontato che il tipo di dato inserito dall'utente sia corretto.
 */
public class MinimoMassimoV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double minimo = Double.MAX_VALUE;
        double massimo = -Double.MAX_VALUE;
        int cntNumeri = 0;

        do {
            System.out.print("Numero: ");
            numero = scanner.nextDouble();

            if (numero != 0) {
                cntNumeri++;
                if (numero < minimo) {
                    minimo = numero;
                }
                if (numero > massimo) {
                    massimo = numero;
                }
            }
        } while (numero != 0.);

        if (cntNumeri > 0) {
            System.out.println("Numero minimo: " + minimo);
            System.out.println("Numero massimo: " + massimo);
        } else {
            System.out.println("Nessun valore inserito");
        }

        scanner.close();
    }
}