import java.util.Scanner;

/**
 * Programma che stampa a schermo il valore medio di tutti i numeri fra 0 e un valore massimo
 * specificato dall'utilizzatore del programma.
 */
public class NumeriMedia {

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

		// Calcolo e stampo la media
		System.out.print("Media: ");
		int tot = 0;
		int i = 0;
		while (i <= numeroMax) {
			tot = tot + i;
			i++;
		}
		// Lo 0 é compreso nella somma => il numero di valori considerato é numeroMax + 1
		System.out.println((double) tot / (numeroMax + 1));

		// Finalizza lo scanner
		input.close();
	}
}
