import javakara.JavaKaraProgram;

public class Pattern extends JavaKaraProgram {

	private void drawPlus() {
		kara.move();
		kara.putLeaf();
		kara.move();
		kara.turnRight();
		kara.move();
		kara.turnRight();
		kara.putLeaf();
		kara.move();
		kara.putLeaf();
		kara.move();
		kara.putLeaf();
		kara.turnLeft();
		kara.move();
		kara.turnLeft();
		kara.move();
		kara.putLeaf();
		kara.move();
	}

	private void changePosition() {
		kara.move();
		kara.move();
		kara.turnLeft();
		kara.move();
		kara.move();
		kara.turnRight();
	}

	private void nextLine() {
		kara.move();
		kara.move();
		kara.move();
		kara.turnRight();
		kara.move();
		kara.move();
		kara.turnLeft();
	}

	public void myProgram() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0 && (i == 1 || i == 2)) {
					nextLine();
				} else if (j == 1 || j == 2) {
					changePosition();
				}
				drawPlus();
			}
		}
	}
}
