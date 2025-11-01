/**
 * Disegna 4 triangoli di asterischi, separatamente uno sotto l'altro.
 */
public class Triangoli {
	// Costante per il numero di righe / colonne
	private final static int MAX = 10;

	/*
	 * Procedura main - inizio del programma
	 */
	public static void main(String[] args) {
		// Primo triangolo
		for (int i = 0; i <= MAX; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			// Cambia riga
			System.out.println();
		}

		System.out.println();
		// Secondo triangolo
		for (int i = 0; i <= MAX; i++) {
			for (int j = 0; j <= MAX - i; j++) {
				System.out.print('*');
			}
			// Cambia riga
			System.out.println();
		}

		System.out.println();
		// Terzo triangolo
		for (int i = 0; i <= MAX; i++) {
			// Mostra gli spazi ad inizio riga
			int j = 0;
			for (; j < i; j++) {
				System.out.print(' ');
			}
			// Mostra gli asterischi
			for (; j <= MAX; j++) {
				System.out.print('*');
			}
			// Cambia riga
			System.out.println();
		}

		System.out.println();
		// Quarto triangolo
		for (int i = 0; i <= MAX; i++) {
			// Mostra gli spazi ad inizio riga
			int j = 0;
			for (; j <= MAX - i - 1; j++) {
				System.out.print(' ');
			}
			// Mostra gli asterischi
			for (; j <= MAX; j++) {
				System.out.print('*');
			}
			// Cambia riga
			System.out.println();
		}
	}
}
