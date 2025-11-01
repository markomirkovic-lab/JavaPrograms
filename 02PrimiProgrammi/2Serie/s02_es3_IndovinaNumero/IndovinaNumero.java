import java.util.Scanner;

/**
 * Programma che genera un numero casuale tra 0 e 100 e che chiede ripetutamente all'utente di indovinarlo.
 */
public class IndovinaNumero {
	/**
	 * Procedura main - parte principale del programma
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Genera un numero casuale tra 0 e 100
		int numero = (int) (Math.random() * 101);

		// Richiede all'utente un numero tra 0 e 100
		System.out.print("Indovina un numero tra 0 e 100: ");
		int numeroUtente = input.nextInt();
		while (numero != numeroUtente) {
			// Controlla se il numero da indovinare è minore o maggiore di quello inserito
			if (numero < numeroUtente) {
				System.out.println("Il numero da indovinare è minore di " + numeroUtente);
			} else {
				System.out.println("Il numero da indovinare è maggiore di " + numeroUtente);
			}

			// Richiede all'utente un numero tra 0 e 100
			System.out.print("Indovina un numero tra 0 e 100: ");
			numeroUtente = input.nextInt();
		}
		System.out.println("Hai indovinato il numero segreto!!");

		// Finalizza lo scanner
		input.close();
	}
}
