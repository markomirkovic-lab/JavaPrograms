import javakara.JavaKaraProgram;

public class Sentinella extends JavaKaraProgram {

	public void myProgram() {
		for (;;) {
			if (!kara.treeRight())
				kara.turnRight();

			if (kara.treeFront())
				kara.turnLeft();
			else
				kara.move();
		}
	}
}
