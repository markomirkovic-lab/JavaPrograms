import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */

/**
 * Programma che permette a Kara di seguire una traccia di quadrifogli (raccogliendoli) e di
 * fermarsi quando incontra un tronco.
 */
public class TracciaQuadrifogli extends JavaKaraProgram {

	public void myProgram() {
		// Raccogli il quadrifoglio
		kara.removeLeaf();
		while (!kara.treeFront()) {
			// Fai un passo avanti
			kara.move();
			if (kara.onLeaf())
				// Raccogli il quadrifoglio (se c'è)
				kara.removeLeaf();
			else {
				// Cerca il prossimo quadrifoglio (in una delle tre posizioni rimanenti)
				kara.turnLeft();
				kara.turnLeft();
				kara.move();
				kara.turnRight();
			}
		}
	}
}
