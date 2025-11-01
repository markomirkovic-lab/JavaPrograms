import java.util.Scanner;

/**
 * Programma che stampa a schermo tutti i numeri pari fra 0 e un valore massimo specificato
 * dall'utilizzatore del programma.
 */
public class NumeriPari {

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

		// Stampa numeri pari
		System.out.print("Numeri pari: ");
		int i = 0;
		while (i <= numeroMax) {
			if (i % 2 == 0)
				System.out.print(i + " ");
			i++;
		}

		// Finalizza lo scanner
		input.close();
	}
}
