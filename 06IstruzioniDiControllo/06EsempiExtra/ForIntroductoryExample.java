// Scrivere un programma che esegua le seguenti operazioni:
// - Chiedere all'utente di inserire un numero intero positivo.
// - Stampare a schermo tutti i numeri da quello inserito fino a 0 in ordine decrescente, separati da virgole. 
// L'ultimo numero, lo 0, non deve essere seguito da una virgola.
// Esempio di output se l'utente inserisce 4: 4, 3, 2, 1, 0


import java.util.Scanner;

public class ForIntroductoryExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero positivo: ");
        int userInput = scanner.nextInt();
        scanner.close();

        System.out.println("Con \"while\"");
        int j = userInput;
        while (j >= 0) {
            System.out.print(j);
            if (j != 0) {
                System.out.print(", ");
            }
            j--;
        }

        System.out.println("\nCon \"for\"");

        // for (inizializzazione; condizione; aggiornamento)
        for (int i = userInput; i >= 0; i--) {
            System.out.print(i);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println("\nFine");
    }
}
