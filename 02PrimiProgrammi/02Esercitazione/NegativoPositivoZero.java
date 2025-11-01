import java.util.Scanner;

public class NegativoPositivoZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int zeri = 0;
		int positivi = 0;
		int negativi = 0;

		int cnt = 0;
		while (cnt < 10) {
			System.out.print("Numero: ");
			int numero = input.nextInt();
			cnt++;

			if (numero > 0) {
				positivi++;
			} else if (numero < 0) {
				negativi++;
			} else {
				zeri++;
			}
		}
		input.close();

		System.out.println("Zeri: " + zeri);
		System.out.println("Numeri positivi: " + positivi);
		System.out.println("Numeri negativi: " + negativi);
	}
}
