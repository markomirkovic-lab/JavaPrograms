/**
 * Programma che risolve il problema delle otto regine su di una scacchiera 8x8. Cerca, ricorsivamente, e mostra tutte
 * le soluzioni possibili del problema.
 */
public class OttoRegine {

	/**
	 * Controlla se la posizione è valida.
	 * 
	 * @param regine
	 *            array contenente la posizione di ogni regina. L'indice dell'array corrisponde al numero della riga, il
	 *            valore nell'array rappresenta il numero della colonna nella quale si trova la regina
	 * @param pos
	 *            valore della riga da controllare
	 * @return true se la posizione è valida (nessuna regina nella stessa colonna e nelle due diagonali), false
	 *         altrimenti
	 */
	private static boolean controllaPosizione(int[] regine, int pos) {
		for (int i = 0; i < pos; i++) {
			if (regine[i] == regine[pos])
				// Due regine nella stessa colonna
				return false;
			if ((regine[i] - regine[pos]) == (pos - i))
				// Due regine nella stessa diagonale principale (da alto-sinistra a basso-destra)
				return false;
			if ((regine[pos] - regine[i]) == (pos - i))
				// Due regine nella stessa diagonale secondaria (da alto-destra a basso-sinistra)
				return false;
		}
		// Posizione ok
		return true;
	}

	/**
	 * Risolve il problema delle n regine (n uguale a dimensioneScacchiera). Cerca e mostra tutte le soluzioni possibili
	 * 
	 * @param dimensioneScacchiera
	 *            la dimensione della scacchiera
	 */
	private static void risolvi(int dimensioneScacchiera) {
		// Inizia a posizionare la regina sulla prima riga
		risolvi(new int[dimensioneScacchiera], 0);
	}

	/**
	 * Risolve, ricorsivamente, il problema delle n regine
	 * 
	 * @param regine
	 *            array contenente la posizione di ogni regina. L'indice dell'array corrisponde al numero della riga, il
	 *            valore nell'array rappresenta il numero della colonna nella quale si trova la regina
	 * @param pos
	 *            valore della riga attuale
	 */
	private static void risolvi(int[] regine, int pos) {
		int N = regine.length;
		if (pos == N)
			// L'ultima regina è stata posizionata, mostra la soluzione
			stampaPosizioni(regine);
		else {
			// Prova tutte le posizioni sulla riga corrente
			for (int i = 0; i < N; i++) {
				regine[pos] = i;
				if (controllaPosizione(regine, pos))
					// La posizione attuale è ok, prova a posizionare la regina nella riga successiva
					risolvi(regine, pos + 1);
			}
		}
	}

	/**
	 * Mostra a schermo la posizione delle regine sulla scacchiera
	 * 
	 * @param regine
	 *            array contenente la posizione di ogni regina. L'indice dell'array corrisponde al numero della riga, il
	 *            valore nell'array rappresenta il numero della colonna nella quale si trova la regina
	 */
	private static void stampaPosizioni(int[] regine) {
		int N = regine.length;
		for (int riga = 0; riga < N; riga++) {
			for (int colonna = 0; colonna < N; colonna++) {
				if (regine[riga] == colonna)
					System.out.print("Q ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Cerca e mostra tutte le soluzioni possibili del problema per una scacchiera di dimensione 8x8
		risolvi(8);
	}
}
