import javakara.JavaKaraProgram;

public class SpiraleConSottoProgramma extends JavaKaraProgram {

	private void drawSide(int lato){
		for (int j = 0; j <= lato; j++) {
			kara.putLeaf();
			kara.move();
		}
	}

	public void myProgram() {
		int lati = tools.intInput("Lati");
		for (int lato = 0; lato < lati; lato++) {
			drawSide(lato);
			kara.turnRight();
		}
	}
}
