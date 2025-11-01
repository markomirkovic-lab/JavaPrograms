import javakara.JavaKaraProgram;

public class PushMushroom extends JavaKaraProgram {

	public void myProgram() {
		boolean mushroomFound = false;
		boolean putLeaf = false;

		while (!kara.treeFront()) {
			kara.move();
			if (putLeaf) {
				kara.putLeaf();
				putLeaf = false;
			} else if (kara.onLeaf()) {
				kara.turnRight();
				kara.move();
				kara.turnLeft();
			}
			if (!mushroomFound && kara.mushroomFront()) {
				mushroomFound = true;
				putLeaf = true;
			}
		}
	}
}
