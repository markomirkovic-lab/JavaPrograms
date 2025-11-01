import java.util.Scanner;

/**
 * Programma che calcola e mostra la somma e il prodotto dei primi n numeri. Come caso di test
 * richiede all'utente l'immissione di 5 valori e mostra le somme e i prodotti richiesti.
 */
public class SommaEProdotto {
	/**
	 * Calcola e restituisce la somma dei numeri da 1 a n
	 * 
	 * @param n
	 *            il valore massimo
	 * @return la somma dei numeri da 1 a n
	 */
	private static long somma(int n) {
		long somma = 0;
		for (int i = 1; i <= n; i++)
			somma += i;
		return somma;
	}

	/**
	 * Calcola e restituisce il prodotto dei numeri da 1 a n
	 * 
	 * @param n
	 *            il valore massimo
	 * @return il prodotto dei numeri da 1 a n
	 */
	private static long prodotto(int n) {
		long prodotto = 1;
		for (int i = 1; i <= n; i++)
			prodotto *= i;
		return prodotto;
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiede l'immissione di 5 valori e mostra la somma e il prodotto dei numeri da 1 al
		// massimo inserito
		for (int i = 0; i < 5; i++) {
			int n;
			do {
				System.out.print("Inserire n: ");
				n = input.nextInt();
			} while (n <= 0);
			System.out.println("La somma dei numeri da 1 a " + n + " é " + somma(n) + ".");
			System.out.println("Il prodotto dei numeri da 1 a " + n + " é " + prodotto(n) + ".\n");
		}

		// Finalizza lo scanner
		input.close();
	}
}
