import java.util.Scanner;

/**
 * Programma che stampa a schermo tutti i numeri dispari fra 0 e un valore massimo specificato
 * dall'utilizzatore del programma.
 */
public class NumeriDispari {

	/**
	 * Procedura main - parte principale del programma
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiedi il numero massimo e controlla che sia maggiore di 0. Ripeti la richiesta
		// nel caso in cui non lo fosse.
		System.out.print("Inserisci il numero massimo (> 0): ");
		int numeroMax = input.nextInt();
		while (numeroMax <= 0) {
			System.out.print("Il valore deve essere > 0. Riprova: ");
			numeroMax = input.nextInt();
		}

		// Stampa numeri dispari
		System.out.print("Numeri dispari: ");
		int i = 1;
		while (i <= numeroMax) {
			System.out.print(i + " ");
			i = i + 2;
		}

		// Finalizza lo scanner
		input.close();
	}
}
