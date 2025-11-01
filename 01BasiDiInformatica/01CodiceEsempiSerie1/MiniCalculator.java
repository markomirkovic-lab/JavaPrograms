import java.util.Scanner;

/**
 * MiniCalolarice in grado di eseguire delle semplici operazioni (+, -, *, /)
 */
public class MiniCalculator {

	/**
	 * Procedura main, viene eseguita al lancio del programma
	 */
	public static void main(String[] args) {
		System.out.println("Mini Calcolatrice");
		System.out.println("-----------------");

		int scelta = 5;
		// Inizializza lo Scanner per la lettura di dati dalla tastiera
		Scanner input = new Scanner(System.in);
		do {
			// Mostra il menu e legge la scelta fatta
			System.out.println("1. Somma");
			System.out.println("2. Sottrai");
			System.out.println("3. Moltiplica");
			System.out.println("4. Dividi");
			System.out.println("5. Esci");
			System.out.print("Scelta: ");
			scelta = input.nextInt();

			// Elabora la scelta fatta richiedendo due valori ed eseguendo
			// l'operazione desiderata
			double num1, num2;
			switch (scelta) {
			case 1:
				System.out.print("Inserisci i due numeri da sommare: ");
				num1 = input.nextDouble();
				num2 = input.nextDouble();
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case 2:
				System.out.print("Inserisci i due numeri da sottrarre: ");
				num1 = input.nextDouble();
				num2 = input.nextDouble();
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case 3:
				System.out.print("Inserisci i due numeri da moltiplicare: ");
				num1 = input.nextDouble();
				num2 = input.nextDouble();
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case 4:
				System.out.print("Inserisci i due numeri da dividere: ");
				num1 = input.nextDouble();
				num2 = input.nextDouble();
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case 5:
				System.out.println("Programma terminato");
				break;
			default:
				System.out.println("Scelta non valida. Riprova.");
				break;
			}
		} while (scelta != 5);
		// Finalizza lo Scanner
		input.close();
	}
}
