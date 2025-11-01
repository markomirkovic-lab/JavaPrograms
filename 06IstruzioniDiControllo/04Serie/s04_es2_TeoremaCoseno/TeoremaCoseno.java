import java.util.Scanner;

/**
 * Programma che, utilizzando il teorema del coseno, calcola la lunghezza di un lato di un triangolo
 * qualsiasi avendo, come punto di partenza, due lati e l'angolo tra essi contenuto.
 */
public class TeoremaCoseno {

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiedi i due lati e l'angolo, controllando la validita dei dati inseriti
		System.out.print("Primo lato: ");
		double lato1 = input.nextDouble();
		while (lato1 <= 0) {
			System.out.print("Lato non valido. Riprova: ");
			lato1 = input.nextDouble();
		}
		System.out.print("Secondo lato: ");
		double lato2 = input.nextDouble();
		while (lato2 <= 0) {
			System.out.print("Lato non valido. Riprova: ");
			lato2 = input.nextDouble();
		}
		System.out.print("Angolo contenuto tra i due lati (in gradi): ");
		double angolo = input.nextDouble();
		while (angolo <= 0 || angolo >= 180) {
			System.out.print("Angolo non valido. Riprova: ");
			angolo = input.nextDouble();
		}
		// Converti l'angolo da gradi a radianti
		angolo = Math.toRadians(angolo);

		// Calcola e mostra il terzo lato
		System.out.println("Terzo lato: " + Math.sqrt(
				Math.pow(lato1, 2.) + Math.pow(lato2, 2.) - 2 * lato1 * lato2 * Math.cos(angolo)));

		// Finalizza lo scanner
		input.close();
	}
}
