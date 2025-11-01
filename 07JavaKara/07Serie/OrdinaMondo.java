import javakara.JavaKaraProgram;
import java.util.Arrays;

/**
 * Enumerativo per la direzione di spostamento
 */
enum Direzione {
	SU, GIU
}

/**
 * Programma che aiuta Kara a riordinare il mondo nel quale vive. Riordina le righe dalla più corta
 * alla più lunga.
 */
public class OrdinaMondo extends JavaKaraProgram {

	/**
	 * Conta e restituisce il numero di quadrifogli presenti sulla riga
	 * 
	 * @return il numero di quadrifogli presenti sulla riga
	 */
	private int leggiRiga() {
		int cnt = 0;
		while (kara.onLeaf()) {
			cnt++;
			if (kara.treeFront())
				break;
			kara.move();
		}
		return cnt;
	}

	/**
	 * Sposta Kara all'inizio della riga desiderata (nella direzione richiesta)
	 * 
	 * @param dir
	 *            direzione dello spostamento
	 * @param offset
	 *            indica di quanto spostarsi rispetto alla riga attuale
	 */
	private void cambiaRiga(Direzione dir, int offset) {
		// Sposta Kara all'inizio della riga attuale
		kara.turnRight();
		kara.turnRight();
		while (!kara.treeFront())
			kara.move();
		if (offset == 0) {
			// Non serve cambiare riga
			kara.turnRight();
			kara.turnRight();
			return;
		}

		// Sposta Kara alla riga desiderata (controllando di non oltrepassare
		// l'inizio / fine del mondo)
		if (dir == Direzione.GIU)
			kara.turnLeft();
		else
			kara.turnRight();

		int cnt = 0;
		while (!kara.treeFront() && cnt < offset) {
			kara.move();
			cnt++;
		}

		if (dir == Direzione.GIU)
			kara.turnLeft();
		else
			kara.turnRight();
	}

	/**
	 * Deposita sulla riga attuale, se non già presenti, il numero di quadrifogli desiderato
	 * (assicurandosi di rimuovere tutti quelli in eccesso)
	 * 
	 * @param cnt
	 *            numero di quadrifogli da depositare sulla riga
	 */
	private void scriviRiga(int cnt) {
		// Deposita i quadrifogli desiderati (se non già presenti)
		for (int i = 0; i < cnt; i++) {
			if (!kara.onLeaf())
				kara.putLeaf();
			if (kara.treeFront())
				return;
			kara.move();
		}
		// Rimuove gli eventuali quadrifogli in eccesso
		while (kara.onLeaf()) {
			kara.removeLeaf();
			if (kara.treeFront())
				return;
			kara.move();
		}
	}

	public void myProgram() {
		int[] lunghezzaRighe = new int[world.getSizeY() - 2];

		// Percorri l'intero mondo e memorizza il numero di quadrifogli presenti in ogni riga
		for (int y = 0; y < lunghezzaRighe.length; y++) {
			lunghezzaRighe[y] = leggiRiga();
			if (y < lunghezzaRighe.length - 1)
				cambiaRiga(Direzione.GIU, 1);
		}

		// Riporta Kara all'inizio del mondo
		cambiaRiga(Direzione.SU, lunghezzaRighe.length);

		// Ordina l'array in ordine crescente
		Arrays.sort(lunghezzaRighe);

		// Ripercorri il mondo riordinandolo
		for (int y = 0; y < lunghezzaRighe.length; y++) {
			scriviRiga(lunghezzaRighe[y]);
			if (y < lunghezzaRighe.length - 1)
				cambiaRiga(Direzione.GIU, 1);
		}
	}
}
