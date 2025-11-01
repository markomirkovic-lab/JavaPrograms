import java.util.Scanner;

/**
 * Programma che permette di specificare un importo di un conto bancario, un tasso d'interesse, un
 * periodo di tempo (in anni) e che visualizza il valore del conto alla fine del periodo
 * specificato.
 */
public class Interessi {

	/**
	 * Procedura main - parte principale del programma
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiedi importo iniziale
		System.out.print("Importo iniziale: ");
		double importoIniziale = input.nextDouble();
		while (importoIniziale <= 0) {
			System.out.print("Importo non valido. Riprova: ");
			importoIniziale = input.nextDouble();
		}

		// Richiedi tasso d'interesso
		System.out.print("Tasso d'interesse (%): ");
		double tasso = input.nextDouble();
		while (tasso <= 0) {
			System.out.print("Tasso d'interesse non valido. Riprova: ");
			tasso = input.nextDouble();
		}

		// Richiedi anni con controllo sul tipo immesso
		input.nextLine();
		int anni = 0;
		while (anni <= 0) {
			System.out.print("Durata in anni: ");
			while(!input.hasNextInt()){
				input.nextLine();
				System.out.print("Durata non valida. Riprova: ");
			}
			anni = input.nextInt();
			input.nextLine();
		}

		// Calcola l'importo finale del conto
		double importoFinale = importoIniziale;
		int i = 0;
		while (i < anni) {
			importoFinale += importoFinale * tasso / 100.0;
			i++;
		}

		// Mostra l'importo finale del conto
		System.out.println("Ammontare dopo " + anni + " anni: " + importoFinale);

		// Finalizza lo scanner
		input.close();
	}
}
