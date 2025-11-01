import java.util.Scanner;

public class Cerchio {

	static final double PI = 3.1415926;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Inserire raggio: ");
		double raggio = input.nextDouble();
		// Controlla se il raggio è positivo. Se non lo è richiedi un nuovo valore
		while (raggio <= 0.) {
			System.out.print("Valore non valido. Riprova: ");
			raggio = input.nextDouble();
		}

		input.close();

		System.out.println("Diametro = " + 2 * raggio);
		System.out.println("Circonferenza = " + 2 * raggio * PI);
		System.out.println("Area = " + raggio * raggio * PI);
	}
}
