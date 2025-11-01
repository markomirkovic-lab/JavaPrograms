import java.util.Scanner;

/**
 * Programma che richiede all'utente una parola e che la converte in una sequenza di cifre da
 * premere sulla tastiera del telefono per comporre la parola desiderata.
 * 
 * Variante che utilizza la funzione contains della classe String
 */
public class TastieraTelefonicaV2 {

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
				if ("abc".contains("" + ch)) {
					System.out.print(2);
				} else if ("def".contains("" + ch)) {
					System.out.print(3);
				} else if ("ghi".contains("" + ch)) {
					System.out.print(4);
				} else if ("jkl".contains("" + ch)) {
					System.out.print(5);
				} else if ("mno".contains("" + ch)) {
					System.out.print(6);
				} else if ("pqrs".contains("" + ch)) {
					System.out.print(7);
				} else if ("tuv".contains("" + ch)) {
					System.out.print(8);
				} else if ("wxyz".contains("" + ch)) {
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
