import java.util.Scanner;

public class Piramide {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Base piramide (dispari): ");
		int base = input.nextInt();
		while (base % 2 == 0 || base < 0) {
			System.out.print("La base deve essere dispari. Riprova: ");
			base = input.nextInt();
		}
		input.close();
		
		for (int i = 0; i <= (base / 2); i++) {
			for (int j = i; j < base / 2; j++)
				System.out.print("  ");
			for (int j = 0; j < (i * 2 + 1); j++)
				System.out.print((int) (Math.random() * 10.) + " ");
			System.out.println();
		}
	}
}