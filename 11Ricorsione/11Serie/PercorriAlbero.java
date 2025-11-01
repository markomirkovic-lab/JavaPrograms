import javakara.JavaKaraProgram;

/**
 * Programma che permette a Kara di raggiungere, ricorsivamente, la cima di ogni ramo di un albero
 * fatto di quadrifogli e di prelevarli al ritorno.
 */
public class PercorriAlbero extends JavaKaraProgram {

	/**
	 * Sposta Kara a sinistra di una posizione
	 */
	private void moveToTheLeft() {
		kara.turnLeft();
		kara.move();
		kara.turnRight();
	}

	/**
	 * Sposta Kara a destra di una posizione
	 */
	private void moveToTheRight() {
		kara.turnRight();
		kara.move();
		kara.turnLeft();
	}

	/**
	 * Percorre l'albero ricorsivamente fino a raggiungere la cima di ogni ramo. Al ritorno, preleva
	 * i quadrifogli
	 */
	private void percorriAlbero() {
		// Se Kara si trova su di un quadrifoglio, continua ad andare avanti
		if (kara.onLeaf()) {
			kara.move();
			percorriAlbero();

			// Al ritorno, preleva il quadrifoglio. Rimetti sempre Kara rivolta verso l'alto.
			kara.turnRight();
			kara.turnRight();
			kara.move();
			kara.removeLeaf();
			kara.turnRight();
			kara.turnRight();
		} else {
			// Prova a percorrere il ramo a sinistra (se c'è un quadrifoglio)
			moveToTheLeft();
			if (kara.onLeaf())
				percorriAlbero();
			moveToTheRight();

			// Prova a percorrere il ramo a destra (se c'è un quadrifoglio)
			moveToTheRight();
			if (kara.onLeaf())
				percorriAlbero();
			moveToTheLeft();
		}
	}

	public void myProgram() {
		percorriAlbero();
	}
}
