import java.util.Scanner;

/**
 * Programma che richiede all'utente una parola e che la converte in una sequenza di cifre da
 * premere sulla tastiera del telefono per comporre la parola desiderata.
 * 
 * Versione che utilizza l'istruzione switch.
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
				switch (parola.charAt(i)) {
					case 'a': case 'b': case 'c':
						System.out.print(2);
						break;
					case 'd': case 'e': case 'f':
						System.out.print(3);
						break;
					case 'g': case 'h': case 'i':
						System.out.print(4);
						break;
					case 'j': case 'k': case 'l':
						System.out.print(5);
						break;
					case 'm': case 'n': case 'o':
						System.out.print(6);
						break;
					case 'p': case 'q': case 'r': case 's':
						System.out.print(7);
						break;
					case 't': case 'u': case 'v':
						System.out.print(8);
						break;
					case 'w': case 'x': case 'y': case 'z':
						System.out.print(9);
						break;
					case ' ':
						System.out.print(0);
						break;
					default:
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
