import java.util.Scanner;

public class LetturaNumeroStringa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Richiedi all'utente un numero e memorizzalo come stringa
        System.out.println("Inserisci un numero intero");
        String stringa = input.nextLine();

        // Converti la stringa in un numero intero
        int numero = Integer.parseInt(stringa); // Integer.valueOf(stringa)

        // Controlla se < o > 10 e stampa a schermo il risultato
        if (numero < 10) {
            System.out.println("Il numero immesso e' minore di 10");
        } else if (numero > 10) {
            System.out.println("Il numero immesso e' maggiore di 10");
        } else { // Questo blocco non era esplicitamente richiesto dal testo dell'esercizio
            System.out.println("Il numero immesso e' 10");
        }

        input.close();
    }
}