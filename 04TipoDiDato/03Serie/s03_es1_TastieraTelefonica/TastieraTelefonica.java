import java.util.Scanner;

/**
 * Programma che richiede all'utente una parola e che la converte in una sequenza di cifre da
 * premere sulla tastiera del telefono per comporre la parola desiderata.
 */
public class TastieraTelefonica {

	/**
	 * Procedura main - parte principale del programma
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiedi la parola e convertila con solo lettere minuscole
		System.out.print("Inserisci una parola (stringa vuota per terminare): ");
		String parola = input.nextLine().toLowerCase();
		// Interrompi il programma se la parola immessa è una stringa vuota
		while (!parola.equals("")) {
			// Visualizza il codice corrispondente confrontando carattere per carattere
			System.out.print("Codice: ");
			int i = 0;
			while (i < parola.length()) {
				// Confronta carattere per carattere
				char ch = parola.charAt(i);
				if (ch == 'a' || ch == 'b' || ch == 'c') {
					System.out.print(2);
				} else if (ch == 'd' || ch == 'e' || ch == 'f') {
					System.out.print(3);
				} else if (ch == 'g' || ch == 'h' || ch == 'i') {
					System.out.print(4);
				} else if (ch == 'j' || ch == 'k' || ch == 'l') {
					System.out.print(5);
				} else if (ch == 'm' || ch == 'n' || ch == 'o') {
					System.out.print(6);
				} else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
					System.out.print(7);
				} else if (ch == 't' || ch == 'u' || ch == 'v') {
					System.out.print(8);
				} else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
					System.out.print(9);
				} else if (ch == ' ') {
					System.out.print(0);
				} else {
					System.out.print('*');
				}

				// Passa al prossimo carattere
				i++;
			}

			// Richiedi una nuova parola
			System.out.print("\nInserisci una parola (stringa vuota per terminare): ");
			parola = input.nextLine().toLowerCase();
		}
		// Finalizza lo scanner
		input.close();
	}
}
