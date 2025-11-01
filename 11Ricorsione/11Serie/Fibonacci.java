import java.util.Scanner;

/**
 * Programma che calcola, ricorsivamente, la successione di Fibonacci.
 */
public class Fibonacci {

	/**
	 * Funzione ricorsiva per il calcolo della successione di Fibonacci
	 * 
	 * @param indice
	 *            indice dell'elemento nella successione di Fibonacci (partendo da 0)
	 * @return il valore dell'elemento all'indice desiderato
	 */
	private static int fibonacci(int indice) {
		if (indice <= 1)
			return indice;
		return fibonacci(indice - 1) + fibonacci(indice - 2);
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Inserire l'indice dell'elemento desiderato: ");
		int indice = input.nextInt();
		while (indice < 0) {
			System.out.print("L'indice deve essere >= 0. Riprova: ");
			indice = input.nextInt();
		}

		input.close();

		for (int i = 0; i <= indice; i++)
			System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
	}
}
