import java.util.Scanner;

/**
 * Programma che richiede: un numero tra 0 e 100, controlla la validità del valore immesso. Mostra a
 * schermo: l'intervallo nel quale é contenuto e tutti i numeri, su una sola riga e in ordine
 * decrescente, tra 0 e il valore immesso.
 * 
 * Versione con richiesta ripetuta nel caso di immissione errata.
 */
public class ContoAllaRovesciaBis {

	/**
	 * Procedura main - parte principale del programma
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiedi il numero
		System.out.print("Immetti un intero fra 0 e 100: ");
		int num = input.nextInt();

		// Controlla se é compreso nel range desiderato e richiedilo nel caso in cui non lo fosse
		while (num < 0 || num > 100) {
			System.out.print("Valore non valido! Riprova: ");
			num = input.nextInt();
		}

		// Controlla il valore immesso e mostra l'intervallo nel quale é contenuto
		if (num <= 10) {
			System.out.println("Valore compreso tra 0 e 10.");
		} else if (num <= 20) {
			System.out.println("Valore compreso tra 11 e 20.");
		} else if (num <= 30) {
			System.out.println("Valore compreso tra 21 e 30.");
		} else if (num <= 40) {
			System.out.println("Valore compreso tra 31 e 40.");
		} else if (num <= 50) {
			System.out.println("Valore compreso tra 41 e 50.");
		} else if (num <= 60) {
			System.out.println("Valore compreso tra 51 e 60.");
		} else if (num <= 70) {
			System.out.println("Valore compreso tra 61 e 70.");
		} else if (num <= 80) {
			System.out.println("Valore compreso tra 71 e 80.");
		} else if (num <= 90) {
			System.out.println("Valore compreso tra 81 e 90.");
		} else {
			System.out.println("Valore compreso tra 91 e 100.");
		}

		// Mostra su di una sola riga e in ordine decrescente i numeri compresi tra 0 e il valore immesso
		int i = num;
		while (i >= 0) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();

		// Finalizza lo scanner
		input.close();
	}
}
