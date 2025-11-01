import java.util.Scanner;

/**
 * Programma che richiede l'inserimento ripetuto di valori interi. La richiesta
 * termina quando l'utente inserisce il valore 0. Alla fine calcola e mostra la
 * somma e la media di tutti i valori immessi, la quantità e la percentuale di
 * valori positivi e negativi.
 */
public class SommaEMedia {

	/*
	 * Procedura main - inizio del programma
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int somma = 0;
		int cnt = 0;
		int positivi = 0;
		int negativi = 0;

		// Chiedi ripetutamente un valore. Termina se viene inserito lo 0
		System.out.print("Numero: ");
		int numero = input.nextInt();

		while (numero != 0) {
			// Aggiorna la somma, il numero di valori inseriti, il conteggio dei numeri
			// positivi e quello dei numeri negativi
			somma += numero;
			cnt++;
			if (numero > 0)
				positivi++;
			else
				negativi++;
			
			System.out.print("Numero: ");
			numero = input.nextInt();
		}
		input.close();

		if (cnt != 0) {
			System.out.println("\nSomma: " + somma);
			System.out.println("Media: " + (double) somma / cnt);
			System.out.println("Numeri positivi: " + positivi + " (" + positivi * 100. / cnt + "%)");
			System.out.println("Numeri negativi: " + negativi + " (" + negativi * 100. / cnt + "%)");
		}
	}
}
