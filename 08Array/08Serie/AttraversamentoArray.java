/**
 * Programma che dichiara un array tridimensionale di dimensioni 3x4x2. Inizializza l'array con
 * numeri random con la virgola compresi fra 0.0 e 10.0. In seguito, il programma percorre tutto
 * l'array e stampa a schermo ogni valore contenuto nell'array. Infine, il programma stampa il
 * totale della somma di tutti i numeri contenuti nell'array.
 */
public class AttraversamentoArray {

	public static void main(String[] args) {
		// Dichiara e crea l'array
		double[][][] array = new double[3][4][2];

		// Inizializza l'array con numeri random
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				for (int k = 0; k < array[i][j].length; k++)
					array[i][j][k] = Math.random() * 10.;

		// Stampa array e calcola la somma
		double somma = 0.;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					double valore = array[i][j][k];
					somma += valore;
					System.out.print(valore + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		// Stampa la somma
		System.out.println("Somma: " + somma);
	}
}
