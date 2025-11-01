import java.util.Scanner;

public class OperazioniMatematiche {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci 2 numeri: ");
        int x = input.nextInt();
        int y = input.nextInt();
        while (y == 0) {
            // Controlla per evitare delle divisioni per 0
            System.out.print("Riprova: ");
            y = input.nextInt();
        }

        System.out.println("Somma: " + (x + y));
        System.out.println("Differenza: " + (x - y));
        System.out.println("Prodotto: " + x * y);
        System.out.println("Quoziente: " + x * 1.0 / y);

        input.close();
    }
}