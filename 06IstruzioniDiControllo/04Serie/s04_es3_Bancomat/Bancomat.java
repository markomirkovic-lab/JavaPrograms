import java.util.Scanner;

/**
 * Programma che simula il funzionamento di un bancomat.
 */
public class Bancomat {

	// Costante per il PIN
	private static final int PIN = 1234;

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Saldo del conto
		double saldoConto = 1000.;

		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Attende l'inserimento della tessera
		System.out.println("Inserire la tessera ... (0 per terminare, 1 per continuare)");
		int annulla = input.nextInt();

		while (annulla != 0) {
			// Richiede il PIN
			System.out.print("Inserire PIN: ");
			int pin = input.nextInt();
			int cnt = 1;
			// Controlla il PIN e lo richiede al massimo altre due volte se è errato
			while (pin != PIN && cnt < 3) {
				System.out.println("PIN errato!!");
				System.out.print("Inserire PIN: ");
				pin = input.nextInt();
				cnt++;
			}

			if (cnt >= 3) {
				// Informa l'utente che il numero di tentativi è esaurito
				System.out.println("Tentativi esauriti!!");
			} else {
				int scelta;
				do {
					// Mostra il menu principale
					System.out.println("1. Visualizza saldo");
					System.out.println("2. Esegui prelievo");
					System.out.println("3. Termina");
					scelta = input.nextInt();

					switch (scelta) {
						case 1:
							// Visualizza il saldo del conto
							System.out.println("Saldo conto: " + saldoConto);
							break;
						case 2:
							// Richiede l'importo da prelevare
							System.out.print("Importo da prelevare: ");
							double importo = input.nextDouble();
							// Controlla se l'importo è disponibile
							if (saldoConto < importo)
								System.out.println("Importo non disponibile!!");
							else {
								saldoConto -= importo;
								System.out.println("Ritirale i soldi!!");
							}
							break;
						case 3:
							// Conclude le operazioni
							System.out.println("Termino ...");
							break;
						default:
							// Informa che la scelta effettuata non è valida
							System.out.println("Scelta non valida ... riprova");
							break;
					}
				} while (scelta != 3);
			}
			// Restituisce la tessera
			System.out.println("Ritirare la tessera. Arrivederci\n\n");

			// Attende il prossimo cliente
			System.out.println("Inserire la tessera ... (0 per terminare, 1 per continuare)");
			annulla = input.nextInt();
		}

		// Finalizza lo scanner
		input.close();
	}
}
