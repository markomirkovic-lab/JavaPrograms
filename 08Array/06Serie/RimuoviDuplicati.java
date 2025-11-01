import java.util.Scanner;

/**
 * Programma che legge da tastiera 5 valori compresi tra 10 e 100 e che li
 * memorizza in un array solamente se non sono dei duplicati.
 */
public class RimuoviDuplicati {

    public static void main(String[] args) {
        int[] numeri = new int[5];
        int numeriCnt = 0;

        // Inizializza lo scanner per leggere dati da tastiera
        Scanner input = new Scanner(System.in);

        // Richiedi i 5 valori
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Inserire un valore compreso tra 10 e 100: ");
            int numero = input.nextInt();

            // Controlla la validita' del valore inserito richiedendolo se non lo e'
            while (numero < 10 || numero > 100) {
                System.out.print("Valore non valido. Riprova: ");
                numero = input.nextInt();
            }

            // Controlla se il valore appena inserito e' un duplicato
            boolean duplicato = false;
            for (int j = 0; j < numeriCnt; j++)
                if (numero == numeri[j]) {
                    duplicato = true;
                    break;
                }

            // Memorizza il valore inserito solo se non e' un duplicato
            if (!duplicato)
                numeri[numeriCnt++] = numero;
        }
        // Finalizza lo scanner
        input.close();

        // Visualizza i valori unici memorizzati
        System.out.print("Valori unici: ");
        for (int i = 0; i < numeriCnt; i++)
            System.out.print(numeri[i] + " ");
    }
}
