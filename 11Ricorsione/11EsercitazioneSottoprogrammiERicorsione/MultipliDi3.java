import java.util.Scanner;

/**
 * Programma che calcola e memorizza tutti i multipli di 3 compresi tra 1 e un valore stabilito
 * dall'utente. Come caso di test, richiede 5 valori all'utente e mostra i multipli richiesti
 */
public class MultipliDi3 {

	/**
	 * Funzione che calcola e restituisce tutti i multipli di 3 compresi tra 1 e un n passato come
	 * parametro
	 * 
	 * @param n
	 *            il valore masismo
	 * @return un array contenente tutti i multipli di 3 compresi tra 1 e n
	 */
	private static int[] multipliDi3(int n) {
		int[] multipli = new int[n / 3];
		int pos = 0;
		for (int i = 3; i <= n; i += 3)
			multipli[pos++] = i;
		return multipli;
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiede 5 valori e mostra i multipli di 3 compresi tra 1 e il numero inserito
		for (int i = 0; i < 5; i++) {
			int n;
			do {
				System.out.print("Inserire n: ");
				n = input.nextInt();
			} while (n <= 0);

			int[] multipli = multipliDi3(n);
			for (int j = 0; j < multipli.length; j++) {
				System.out.print(multipli[j] + "\t");
				if ((j + 1) % 10 == 0)
					System.out.println();
			}
			System.out.println();
		}

		// Finalizza lo scanner
		input.close();
	}
}
