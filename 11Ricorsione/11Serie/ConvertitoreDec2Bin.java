import java.util.Scanner;

/**
 * Programma che permette la conversione da decimale a binaria di un numero inserito dall'utente.
 * Termina all'immissione di un valore negativo.
 */
public class ConvertitoreDec2Bin {

	/**
	 * Converte il numero desiderato da decimale a binario.
	 * 
	 * @param numero
	 *            numero in base 10 da convertire in base 2
	 * @return una stringa con la rappresentazione del numero in base 2
	 */
	private static String dec2Bin(int numero) {
		if (numero < 2)
			return "" + numero;
		return dec2Bin(numero / 2) + (numero % 2);
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Numero (-1 per terminare): ");
		int numero = input.nextInt();
		while (numero >= 0) {
			System.out.println("Binario: " + dec2Bin(numero));
			System.out.print("\nNumero (-1 per terminare): ");
			numero = input.nextInt();
		}

		input.close();
	}
}
