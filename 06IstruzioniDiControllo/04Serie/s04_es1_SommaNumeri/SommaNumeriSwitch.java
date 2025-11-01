import java.util.Scanner;

/**
 * Programma che richiede l'immissione ripetuta di valori interi da parte dell'utente. Il programma:
 * termina se l'utilizzatore specifica il numero 0, somma il numero specificato a quelli
 * precedentemente specificati se il numero è più piccolo di 9, stampa a schermo la somma se il
 * numero è 10, stampa la media di tutti i numeri immessi se il numero è più grande di 10.
 * 
 * Versione con istruzione switch.
 */
public class SommaNumeriSwitch {

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);
		int somma = 0;
		int cnt = 0;

		// Richiedi un numero intero
		System.out.print("Inserisci un numero intero: ");
		int numero = input.nextInt();
		while (numero != 0) {
			switch (numero) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
					// Esegui la somma
					somma += numero;
					cnt++;
					break;
				case 10:
					// Visualizza la somma
					System.out.println("Somma: " + somma);
					break;
				default:
					// Esclude il 9 e i numeri negativi!!
					if (numero > 10 && cnt > 0)
						// Visualizza la media
						System.out.println("Media: " + ((double) somma / cnt));
					break;
			}

			// Richiedi un nuovo numero
			System.out.print("Inserisci un numero intero: ");
			numero = input.nextInt();
		}

		// Finalizza lo scanner
		input.close();
	}
}
