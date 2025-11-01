import java.util.Scanner;
import java.util.Calendar;

/**
 * Programma che richiede l'immissione dei dati personali di una persona e li stampa a schermo.
 */
public class DatiPersonali {

	/**
	 * Procedura main - parte principale del programma
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiedi il nome
		System.out.print("nome: ");
		String nome = input.nextLine();

		// Richiedi il cognome
		System.out.print("cognome: ");
		String cognome = input.nextLine();

		// Richiedi l'indirizzo
		System.out.print("indirizzo: ");
		String indirizzo = input.nextLine();

		// Richiedi l'anno di nascita e calcola l'età
		System.out.print("anno di nascita: ");
		int annoDiNascita = input.nextInt();
		int eta = Calendar.getInstance().get(Calendar.YEAR) - annoDiNascita;

		// Mostra a schermo i dati richiesti
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Indirizzo: " + indirizzo);
		System.out.println("Anno di nascita: " + annoDiNascita);
		System.out.println("Anni: " + eta);

		// Finalizza lo scanner
		input.close();
	}
}
