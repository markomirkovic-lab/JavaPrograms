import java.util.Scanner;

/**
 * Programma che legge un valore esadecimale dalla tastiera e che stampa a schermo la sequenza
 * binaria corrispondente.
 */
public class ConvertitoreHex2Bin_v2 {

	public static void main(String[] args) {
		// Tavola di conversione da esadecimale a binario (per le singole cifre esadecimali)
		String[] hex2Bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000",
				"1001", "1010", "1011", "1100", "1101", "1110", "1111" };

		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);
		boolean valoreValido;
		String valoreBinario;

		do {
			// Richiedi il valore esadecimale
			System.out.print("Valore esadecimale da convertire in binario: ");
			String valore = input.nextLine().toLowerCase();
			valoreValido = true;
			valoreBinario = "";
			// Analizza una cifra alla volta e cerca il corrispettivo in binario
			for (char ch : valore.toCharArray()) {
			    int pos = Character.digit(ch, 16);			    
				if (pos == -1) {
					// Il valore immesso contiene delle cifre che non sono dei
					// valori esadecimali. Ripeti la richiesta
					valoreValido = false;
					System.out.println("Valore non valido. Riprova.");
					break;
				}
				// Aggiungi il codice binario di questa cifra al risultato
				// finale
				valoreBinario += hex2Bin[pos] + " ";
			}
		} while (!valoreValido);
		// Stampa il valore binario
		System.out.print("Valore binario: " + valoreBinario);

		// Finalizza lo scanner
		input.close();
	}
}
