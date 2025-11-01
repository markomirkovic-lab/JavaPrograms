import java.util.Scanner;

public class NumeriAmici {

    // Funzione per calcolare i divisori propri di un numero e stamparli
    public static int sommaDivisoriPropri(int n) {
        int somma = 0;
        System.out.print("Divisori propri di " + n + ": ");
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                somma += i;
            }
        }
        System.out.println(); // A capo dopo aver stampato tutti i divisori
        return somma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input del numero massimo
        System.out.print("Inserisci il numero massimo: ");
        int max = scanner.nextInt();
        System.out.println("---------------------------- - - - - - - - - - - -");

        
        for (int a = 1; a <= max; a++) {
            int b = sommaDivisoriPropri(a);

            // Verifica che b sia un numero amico di a
            if (b > a && b <= max && sommaDivisoriPropri(b) == a) {
                System.out.println();
                System.out.print("Coppie di numeri amici: ");
                System.out.println(a + " e " + b);
                System.out.println();
            }
        }

        scanner.close();
    }
}
