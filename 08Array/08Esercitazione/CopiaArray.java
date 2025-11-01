import java.util.Scanner;

/**
 * Programma che richiede l'inserimento di 10 parole e che le memorizza in un
 * array. In seguito copia l'array in un nuovo array ma con le parole in ordine
 * inverso.
 */
public class CopiaArray {

	public static void main(String[] args) {
		String[] parole = new String[10];
		String[] paroleCopia = new String[parole.length];

		Scanner input = new Scanner(System.in);

		// Richiedi dieci parole e memorizzale in un array
		System.out.println("Inserisci dieci parole.");
		for (int i = 0; i < parole.length; i++) {
			System.out.print("Parola " + (i + 1) + ": ");
			parole[i] = input.nextLine();
		}
		input.close();

		// Copia l'array in ordine inverso
		int ultimoIndice = parole.length - 1;
		for (int i = 0; i < parole.length; i++)
			paroleCopia[ultimoIndice - i] = parole[i];

		System.out.println("\nArray copia: ");
		for (int i = 0; i < paroleCopia.length; i++)
			System.out.println("\tParola " + (i + 1) + ": " + paroleCopia[i]);
	}
}
