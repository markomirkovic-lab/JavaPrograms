import java.util.Scanner;

/**
 * Programma che richiede l'immissione, per 20 volte di fila, di una parola e un valore numerico
 * intero. Al termine, il programma mostra un'unica stringa composta dalla sequenza di parole
 * separate da una virgola e la somma totale di tutti i valori inseriti.
 */
public class ConcatenazioneStringhe {

	/**
	 * Procedura main - parte principale del programma
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);
		String sequenza = "";
		int somma = 0;
		int i = 0;
		while (i < 20) {
			// Richiedi una parola e aggiungila alla sequenza finale
			System.out.print("Inserisci una parola: ");
			sequenza += input.nextLine();
			// Non aggiungere la virgola all'ultimo dato
			if (i < 19) {
				sequenza += ", ";
			}

			// Richiedi un numero e aggiungilo alla somma
			System.out.print("Inserisci un numero: ");
			somma += input.nextInt();
			// Svuota il buffer
			input.nextLine();
			i++;
		}

		// Mostra la sequenza finale
		System.out.println("Sequenza finale: " + sequenza);
		// Mostra la somma totale
		System.out.println("Somma totale: " + somma);

		// Finalizza lo scanner
		input.close();
	}
}
