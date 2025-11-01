import java.util.Scanner;

/**
 * Programma che richiede 7 valori interi positivi e li memorizza in un array.
 * Ripete la richiesta se il valore inserito non è positivo. Alla fine trova e
 * mostra il valore minimo, quello massimo e la media dei valori inseriti.
 */
public class Media {

	public static void main(String[] args) {
		int[] numeri = new int[7];

		Scanner input = new Scanner(System.in);

		// Richiedi 7 valori interi positivi
		for (int i = 0; i < numeri.length; i++) {
			System.out.print("Inserisci un numero: ");
			int numero = input.nextInt();
			// Ripeti la richiesta se il valore inserito non è positivo
			while (numero < 0) {
				System.out.print("Numero non valido! Inserisci un numero: ");
				numero = input.nextInt();
			}
			numeri[i] = numero;
		}
		input.close();

		// Trova il valore minimo e quello massimo. Calcola la somma e la media dei
		// valori inseriti
		int min = numeri[0];
		int max = numeri[0];
		int somma = numeri[0];
		for (int i = 1; i < numeri.length; i++) {
			somma += numeri[i];
			if (min > numeri[i])
				min = numeri[i];

			if (max < numeri[i])
				max = numeri[i];
		}
		double media = (double) somma / numeri.length;

		System.out.println("\nNumero minimo: " + min);
		System.out.println("Numero massimo: " + max);
		System.out.println("Media valori inseriti: " + (int) media);
	}
}
