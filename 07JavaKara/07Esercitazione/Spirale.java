import javakara.JavaKaraProgram;

public class Spirale extends JavaKaraProgram {

	public void myProgram() {
		int lati = tools.intInput("Lati");
		for (int lato = 0; lato < lati; lato++) {
			for (int j = 0; j <= lato; j++) {
				kara.putLeaf();
				kara.move();
			}
			kara.turnRight();
		}
	}
}
