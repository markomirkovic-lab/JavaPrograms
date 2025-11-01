import java.util.Scanner;

/**
 * Importante: per semplicità, si da per scontato che il tipo di dato inserito dall'utente sia corretto.
 */
public class ProdottoNumeriDispari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valore minimo: ");
        int minimo = scanner.nextInt();
        System.out.print("Valore massimo: ");
        int massimo = scanner.nextInt();
        while (massimo < minimo) {
            System.out.print("Massimo non valido. Riprova: ");
            massimo = scanner.nextInt();
        }
        scanner.close();

        long prodotto = 1;
        for (int i = minimo; i <= massimo; i++) {
            if (Math.abs(i % 2) == 1)
                prodotto *= i;
        }

        System.out.println("Prodotto dei numeri dispari tra " + minimo + " e " + massimo + ": " + prodotto);
    }  
}