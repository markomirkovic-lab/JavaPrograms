import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumeriAmiciConPrint {

    // Funzione per calcolare i divisori propri di un numero
    public static String divisoriPropri(int n) {
        StringBuilder divisori = new StringBuilder("Divisori propri di " + n + ": ");
        int somma = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisori.append(i).append(" ");
                somma += i;
            }
        }
        divisori.append("(Somma = ").append(somma).append(")");
        return divisori.toString();
    }

    public static int sommaDivisoriPropri(int n) {
        int somma = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                somma += i;
            }
        }
        return somma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero massimo: ");
        int max = scanner.nextInt();

        try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
            writer.println("Coppie di numeri amici:");
            System.out.println("Coppie di numeri amici:");

            for (int a = 1; a <= max; a++) {
                int b = sommaDivisoriPropri(a);

                // Scrivere divisori nel file
                writer.println(divisoriPropri(a));

                // Verifica che b sia un numero amico di a
                if (b > a && b <= max && sommaDivisoriPropri(b) == a) {
                    writer.println("Amici trovati: " + a + " e " + b);
                    System.out.println("Amici trovati: " + a + " e " + b);
                }
            }

            System.out.println("Risultati salvati in 'output.txt'!");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }

        scanner.close();
    }
}
