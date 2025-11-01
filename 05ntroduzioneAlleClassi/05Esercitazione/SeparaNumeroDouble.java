import java.util.Scanner;

public class SeparaNumeroDouble {

	static final double EPSILON = 1e-8;

	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiedi il numero decimale
		System.out.print("Inserisci un numero con la virgola: ");
		double numero = input.nextDouble();

		// Finalizza lo scanner
		input.close();

		// Estrai la parte intera
		int interoNum = (int) numero;
		
		// Estrai la parte decimale
		double decimale = numero - interoNum;
		long decimaleNum = 0;

		double tmp = decimale;
		while (Math.abs(tmp - decimaleNum) > EPSILON) {
			tmp = tmp * 10;
			decimaleNum = (long) tmp;
		}	

		// Mostra la parte intera, quella decimale, la somma delle due e il confronto
		System.out.println("Parte intera: " + interoNum);
		System.out.println("Parte decimale: " + decimaleNum);
		System.out.println("Somma delle due parti: " + (interoNum + decimaleNum));

		String tmpStr = "";
		if (decimaleNum > interoNum) {
			tmpStr = "maggiore";
		} else {
			tmpStr = "minore";
		}
		System.out.println("La parte decimale e' " + tmpStr + " di quella intera");
	}
}
