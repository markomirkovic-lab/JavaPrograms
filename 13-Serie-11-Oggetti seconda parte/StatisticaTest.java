import java.util.Scanner;

/**
 * Classe per la statistica. Offre le seguenti funzionalità: aggiunta di un
 * elemento, calcolo del
 * valore minimo e quello massimo, della somma, della media e della deviazione
 * standard
 */
class Statistica {
	int numeroElementi;
	double somma;
	double sommaElementiQuadrati;
	double max = -Double.MAX_VALUE;
	double min = Double.MAX_VALUE;

	/**
	 * Aggiunge un elemento all'insieme di numeri
	 * 
	 * @param elemento
	 *                 elemento da aggiungere all'insieme
	 */
	void aggiungiElemento(double elemento) {
		numeroElementi++;
		somma += elemento;
		sommaElementiQuadrati += elemento * elemento;
		if (elemento > max)
			max = elemento;
		if (elemento < min)
			min = elemento;
	}

	/**
	 * Ritorna il numero di elementi nell'insieme
	 * 
	 * @return il numero di elementi
	 */
	int numeroElementi() {
		return numeroElementi;
	}

	/**
	 * Ritorna la somma di tutti gli elementi nell'insieme
	 * 
	 * @return la somma di tutti gli elementi
	 */
	double somma() {
		return somma;
	}

	/**
	 * Ritorna la media di tutti gli elementi (0 se l'insieme non contiene alcun
	 * elemento)
	 * 
	 * @return media degli elementi
	 */
	double media() {
		if (numeroElementi == 0)
			return 0.;
		return somma / numeroElementi;
	}

	/**
	 * Ritorna la deviazione standard degli elementi (0 se l'insieme non contiene
	 * alcun elemento)
	 * 
	 * @return deviazione standard degli elementi
	 */
	double deviazioneStandard() {
		if (numeroElementi == 0)
			return 0.;
		double media = media();
		return Math.sqrt(sommaElementiQuadrati / numeroElementi - media * media);
	}

	/**
	 * Ritorna il valore massimo presente nell'insieme
	 * 
	 * @return valore massimo nell'insieme
	 */
	double massimo() {
		return max;
	}

	/**
	 * Ritorna il valore minimo presente nell'insieme
	 * 
	 * @return valore minimo nell'insieme
	 */
	double minimo() {
		return min;
	}
}

/**
 * Classe di test per la classe Statistica. Richiede all'utente, ripetutamente,
 * l'immissione di
 * valori numerici in virgola mobile. La richiesta termina quando l'utente
 * inserisce lo zero. Prima
 * di terminare, il programma mostra il numero di elementi inseriti, la somma di
 * tutti gli elementi,
 * il valore minimo e quello massimo, la media e la deviazione standard di tutti
 * i valori inseriti.
 */
public class StatisticaTest {

	/**
	 * Funzione che legge da tastiera un valore double e lo restituisce. Ripete la
	 * richiesta se il tipo di dato inserito non dovesse essere valido.
	 * 
	 * @param input     oggetto usato per la lettura di dati da tastiera
	 * @param messaggio il messaggio mostrato a schermo
	 * @return il valore letto da tastiera
	 */
	private static double richiediDouble(Scanner input, String messaggio) {
		System.out.print(messaggio);
		while (!input.hasNextDouble()) {
			System.out.print("Valore non valido. Riprova: ");
			input.nextLine();
		}
		double valore = input.nextDouble();
		// Svuota il buffer
		input.nextLine();
		return valore;
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Statistica statistica = new Statistica();

		Scanner input = new Scanner(System.in);

		double valore = richiediDouble(input, "Inserisci un valore (0 per terminare): ");
		while (valore != 0.) {
			statistica.aggiungiElemento(valore);
			valore = richiediDouble(input, "Inserisci un valore (0 per terminare): ");
		}
		input.close();

		System.out.println("Numero di elementi inseriti: " + statistica.numeroElementi());
		System.out.println("Somma di tutti gli elementi: " + statistica.somma());
		System.out.println("Valore minimo: " + statistica.minimo());
		System.out.println("Valore massimo: " + statistica.massimo());
		System.out.println("Media dei valori: " + statistica.media());
		System.out.println("Deviazione standard: " + statistica.deviazioneStandard());
	}
}
