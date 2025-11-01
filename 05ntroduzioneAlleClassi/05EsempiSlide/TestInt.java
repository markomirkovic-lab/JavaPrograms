import java.util.Scanner;

public class TestInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserire un intero: ");
        // Attendi l'immissione del valore da parte dell'utente e
        // verifica se può essere convertito in valore di tipo int
        while (!scanner.hasNextInt()) {
            System.out.print("Inserire un intero!! Riprova: ");
            // Ignora il valore inserito dall'utente visto che non
            // é del tipo desiderato (int)
            scanner.nextLine();
        }
        // Converti il valore inserito dall'utente in un valore
        // intero e assegnalo alla variabile numero.
        int numero = scanner.nextInt();

        System.out.println("Numero: " + numero);

        scanner.close();
    }
}