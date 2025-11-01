import javakara.JavaKaraProgram;

public class InvertiECapovolgi extends JavaKaraProgram {

	private void readLine(boolean[] line) {
		for (int i = 0; i < line.length; i++) {
			if (kara.onLeaf()) {
				kara.removeLeaf();
				line[i] = true;
			} else
				line[i] = false;
			kara.move();
		}
	}

	private void writeMirroredAndInversedLine(boolean[] line) {
		for (int i = line.length - 1; i >= 0; i--) {
			if (!line[i])
				kara.putLeaf();
			kara.move();
		}		
	}

	private void goToNextLine() {
		kara.turnRight();
		kara.move();
		kara.turnLeft();
	}

	public void myProgram() {
		int x = world.getSizeX();
		int y = world.getSizeY();
		boolean[][] leafs = new boolean[y][x];
		
		for (int i = 0; i < y; i++) {
			readLine(leafs[i]);
			goToNextLine();
		}

		for (int i = 0; i < y; i++) {
			writeMirroredAndInversedLine(leafs[i]);
			goToNextLine();
		}
	}
}
