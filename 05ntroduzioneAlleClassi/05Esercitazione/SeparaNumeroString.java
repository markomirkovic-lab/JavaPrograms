import java.util.Scanner;

public class SeparaNumeroString {

	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiedi il numero decimale
		System.out.print("Inserisci un numero con la virgola: ");
		String numero = input.nextLine();

		// Finalizza lo scanner
		input.close();

		// Cerca la posizione del '.' per spezzare la parte intera da quella decimale
		int virgola = numero.indexOf('.');

		String intero = "";
		String decimale = "";

		if (virgola == -1) {
			// Il numero contiene solo la parte intera
			intero = numero;
		} else  {
			// Estrai la parte intera
			intero = numero.substring(0, virgola);
			// Estrai la parte decimale
			decimale = numero.substring(virgola + 1, numero.length());	
		}

		// Converti in numero la parte intera e quella decimale
		int interoNum = 0;
		if (intero.length() > 0) {
			interoNum = Integer.parseInt(intero);
		}
		int decimaleNum = 0;
		if (decimale.length() > 0) {
			decimaleNum = Integer.parseInt(decimale);
		}

		// Mostra la parte intera, quella decimale, la somma delle due e il confronto
		System.out.println("Parte intera: " + interoNum);
		System.out.println("Parte decimale: " + decimaleNum);
		System.out.println("Somma delle due parti: " + (interoNum + decimaleNum));

		String tmp = "";
		if (decimaleNum > interoNum) {
			tmp = "maggiore";
		} else {
			tmp = "minore";
		}
		System.out.println("La parte decimale e' " + tmp + " di quella intera");
	}
}
