import javakara.JavaKaraProgram;

/**
 * Programma che permette a Kara di trovare l'unico fungo presente all'interno del bosco. Il
 * labirinto è risolto utilizzando una funzione ricorsiva che permette a Kara di raggiungere il
 * fungo, percorrendo tutte le strade possibili. Strada facendo, Kara deposita dei quadrifogli lungo
 * la strada.
 */
public class FindMushroom extends JavaKaraProgram {

	/**
	 * Procedura che permette a Kara di tornare indietro di un passo
	 */
	private void getBack() {
		kara.turnRight();
		kara.turnRight();
		kara.move();
		kara.turnRight();
		kara.turnRight();
		if (kara.onLeaf())
			kara.removeLeaf();
	}

	/**
	 * Procedura che permette a Kara di avanzare di un passo
	 */
	private void step() {
		if (!kara.onLeaf())
			kara.putLeaf();
		kara.move();
	}

	/**
	 * Controlla se Kara si trova davanti ad un fungo
	 * 
	 * @return
	 */
	private boolean checkMushroom() {
		if (kara.mushroomFront()) {
			if (!kara.onLeaf())
				kara.putLeaf();
			return true;
		}
		return false;
	}

	public boolean findMushroom() {
		if (checkMushroom())
			// Termina se Kara è davanti ad un fungo
			return true;

		if (kara.treeLeft() && kara.treeRight() && kara.treeFront())
			// Kara si trova alla fine di un vicolo cieco
			return false;

		if (!kara.treeFront()) {
			// Avanza di un passo
			step();
			if (findMushroom())
				return true;
			// La strada percorsa è sbagliata, indietreggia di un passo
			getBack();
		}
		if (!kara.treeLeft()) {
			// Gira a sinistra e avanza di un passo
			kara.turnLeft();
			if (!checkMushroom())
				step();
			if (findMushroom())
				return true;
			// La strada percorsa è sbagliata, indietreggia di un passo
			getBack();
			kara.turnRight();
		}
		if (!kara.treeRight()) {
			// Gira a destra e avanza di un passo
			kara.turnRight();
			if (!checkMushroom())
				step();
			if (findMushroom())
				return true;
			// La strada percorsa è sbagliata, indietreggia di un passo
			getBack();
			kara.turnLeft();
		}

		return false;
	}

	public void myProgram() {
		findMushroom();
	}
}
