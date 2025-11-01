/**
 * Classe che rappresenta un numero complesso. Offre le funzionalità seguenti: somma, sottrazione,
 * prodotto e stampa a schermo.
 */
class NumeroComplesso {
	double reale;
	double immaginario;

	/**
	 * Costruttore. Inizializza i campi con i valori di default
	 */
	NumeroComplesso() {
		reale = 0.;
		immaginario = 0.;
	}

	/**
	 * Costruttore. Inizializza i campi con i valori desiderati
	 * 
	 * @param reale
	 *            parte reale
	 * @param immaginario
	 *            parte immaginaria
	 */
	NumeroComplesso(double reale, double immaginario) {
		this.reale = reale;
		this.immaginario = immaginario;
	}

	/**
	 * Calcola e ritorna la somma dei due numeri complessi
	 * 
	 * @param numero
	 *            secondo addendo
	 * @return un nuovo oggetto contenente la somma dei due numeri complessi
	 */
	NumeroComplesso somma(NumeroComplesso numero) {
		return new NumeroComplesso(reale + numero.reale, immaginario + numero.immaginario);
	}

	/**
	 * Calcola e ritorna la sottrazione dei due numeri complessi
	 * 
	 * @param numero
	 *            sottraendo
	 * @return un nuovo oggetto contenente il risultato della sottrazione
	 */
	NumeroComplesso sottrazione(NumeroComplesso numero) {
		return new NumeroComplesso(reale - numero.reale, immaginario - numero.immaginario);
	}

	/**
	 * Calcola e ritorna il prodotto dei due numeri complessi
	 * 
	 * @param numero
	 *            moltiplicatore
	 * @return un nuovo oggetto contenente il risultato della moltiplicazione
	 */
	NumeroComplesso prodotto(NumeroComplesso numero) {
		double re = reale * numero.reale - immaginario * numero.immaginario;
		double im = reale * numero.immaginario + immaginario * numero.reale;
		return new NumeroComplesso(re, im);
	}

	/**
	 * Mostra a schermo il numero reale nella forma a + bi
	 */
	void mostra() {
		System.out.println(reale + (immaginario < 0 ? " - " : " + ") + Math.abs(immaginario) + "i");
	}
}

/**
 * Classe di test per la classe NumeroComplesso
 */
public class NumeroComplessoTest {

	/**
	 * Ritorna un valore casuale tra -5. e 4.
	 * 
	 * @return un valore casuale tra -5. e 4.
	 */
	private static double random() {
		return Math.random() * 10. - 5.;
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		NumeroComplesso numero1 = new NumeroComplesso(random(), random());
		NumeroComplesso numero2 = new NumeroComplesso(random(), random());

		System.out.print("n1 = ");
		numero1.mostra();
		System.out.print("n2 = ");
		numero2.mostra();

		System.out.print("n1 + n2 = ");
		numero1.somma(numero2).mostra();
		System.out.print("n1 - n2 = ");
		numero1.sottrazione(numero2).mostra();
		System.out.print("n1 * n2 = ");
		numero1.prodotto(numero2).mostra();
	}
}
