import java.util.Scanner;

/**
 * Programma che legge un valore esadecimale dalla tastiera e che stampa a schermo la sequenza
 * binaria corrispondente.
 */

 /*
La riga di codice int pos = Character.digit(ch, 16); è un modo elegante e 
conciso per convertire un carattere esadecimale (ad esempio '0', 'A', 'f') 
nel suo corrispondente valore numerico (ad esempio 0, 10, 15). Analizziamo 
nel dettaglio come funziona e perché è utile.

Cosa fa Character.digit(ch, 16)?
Il metodo Character.digit è un metodo statico della classe Character in Java. 
Serve a convertire un carattere (char) nel suo valore numerico corrispondente, 
in base a una specifica radice (base numerica).

Parametri:

ch: Il carattere da convertire (ad esempio 'A', '7', 'f').

16: La radice (base) del sistema numerico. Nel caso degli esadecimali, la base 
è 16.

Valore di ritorno:

Restituisce il valore numerico corrispondente al carattere nella base specificata.

Se il carattere non è valido per la base specificata (ad esempio 'G' in base 16), 
restituisce -1.

Esempi di utilizzo:
Carattere (ch)	Character.digit(ch, 16)	Spiegazione
'0'	0	'0' in esadecimale corrisponde a 0.
'9'	9	'9' in esadecimale corrisponde a 9.
'A'	10	'A' in esadecimale corrisponde a 10.
'F'	15	'F' in esadecimale corrisponde a 15.
'a'	10	'a' (minuscolo) corrisponde a 10.
'f'	15	'f' (minuscolo) corrisponde a 15.
'G'	-1	'G' non è un carattere esadecimale valido.
Perché è utile?
Compattezza del codice:

Invece di scrivere manualmente una logica per convertire i caratteri esadecimali 
in numeri (ad esempio, usando if-else o una mappa), puoi usare Character.digit 
per ottenere lo stesso risultato in una sola riga.

Gestione automatica di maiuscole/minuscole:

Character.digit gestisce automaticamente sia i caratteri maiuscoli ('A'-'F') 
che quelli minuscoli ('a'-'f'), semplificando il codice.

Rilevamento di caratteri non validi:

Se il carattere non è valido per la base specificata (ad esempio 'G' in base 16), 
il metodo restituisce -1. Questo ti permette di gestire facilmente input non validi.
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
				// int java.lang.Character.digit(char ch, int radix)
			    // Returns the numeric value of the character ch in the specified radix.
				// If the radix is not in the range MIN_RADIX ≤ radix ≤ MAX_RADIX or if the value 
				// of ch is not a valid digit in the specified radix, -1 is returned.
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
