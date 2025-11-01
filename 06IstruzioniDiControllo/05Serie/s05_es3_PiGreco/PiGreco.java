/**
 * Programma che calcola l'approssimazione del valore di pi greco utilizzando
 * una serie infinita
 */
public class PiGreco {

	/*
	 * Procedura main - inizio del programma
	 */
	public static void main(String[] args) {
		double piGreco = 0.0;
		int segno = 1;
		int divisore = 1;
		// Mostra intestazione
		System.out.println("Iter #\t\tpiGreco");
		// Mostra i primi 1000000 valori
		for (int i = 1; i < 1000000; i++) {
			// Calcola e mostra piGreco
			piGreco += (4.0 / divisore) * segno;
			segno *= -1;
			divisore += 2;
			System.out.println(i + "\t\t" + piGreco);
		}
	}
}
