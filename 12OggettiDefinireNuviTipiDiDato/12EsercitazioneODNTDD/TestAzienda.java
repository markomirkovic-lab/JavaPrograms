import java.util.Scanner;

/**
 * Esercitazione - Azienda
 * 
 * Enumerativo che rappresenta la funzione di un dipendente di un'azienda
 */
enum Funzione {
	DIRETTORE, CAPOREPARTO, SEGRETARIO, CONTABILE
}

/**
 * Classe che rappresenta un impiegato (nome, cognome, eta' , funzione e
 * salario)
 */
class Impiegato {
	String nome;
	String cognome;
	int eta;
	Funzione funzione;
	double salario;

	Impiegato(String nome, String cognome, int eta, Funzione funzione, double salario) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta == 0 ? (int) (Math.random() * 46 + 20) : Math.abs(eta);
		this.funzione = funzione;
		this.salario = salario == 0 ? Math.random() * 250000 + 30000 : Math.abs(salario);
	}
}

/**
 * Classe che rappresenta un'azienda con un direttore e degli impiegati
 */
class Azienda {
	Impiegato direttore;
	Impiegato[] impiegati = new Impiegato[10];
	int cntImpiegati;
}

/**
 * Classe di test per le classi Impiegato ed Azienda
 */
public class TestAzienda {
	// Inizializza lo scanner per leggere dati da tastiera
	private static Scanner input = new Scanner(System.in);

	/**
	 * Aggiunge un impiegato all'azienda
	 * 
	 * @param azienda
	 *                  azienda dove aggiungere l'impiegato
	 * @param impiegato
	 *                  impiegato da aggiungere all'azienda
	 */
	private static void aggiungiImpiegato(Azienda azienda, Impiegato impiegato) {
		// Controlla se il numero di impiegati massimo e' stato raggiunto
		if (impiegato.funzione != Funzione.DIRETTORE && azienda.cntImpiegati == azienda.impiegati.length) {
			System.out.println("Posti di lavoro esauriti");
			return;
		}

		// Controlla se l'impiegato che si vuole aggiungere e' il direttore
		if (impiegato.funzione == Funzione.DIRETTORE) {
			azienda.direttore = impiegato;
			return;
		}

		// L'impiegato non e' il direttore, aggiungilo ai vari impiegati
		for (int i = 0; i < azienda.impiegati.length; i++)
			if (azienda.impiegati[i] == null) {
				azienda.impiegati[i] = impiegato;
				break;
			}
		// Incrementa il numero di impiegati dell'azienda
		azienda.cntImpiegati++;
	}

	/**
	 * Rimuove un impiegato dall'azienda
	 * 
	 * @param azienda
	 *                azienda dalla quale rimuovere un impiegato
	 * @param nome
	 *                nome dell'impiegato da rimuovere
	 * @param cognome
	 *                cognome dell'impiegato da rimuovere
	 */
	private static void rimuoviImpiegato(Azienda azienda, String nome, String cognome) {
		// Controlla se l'azienda ha dei dipendenti
		if (azienda.cntImpiegati == 0 && azienda.direttore == null) {
			System.out.println("Nessun dipendente");
			return;
		}

		// Controlla se l'impiegato da rimuovere � il direttore
		if (azienda.direttore != null) {
			Impiegato impiegato = azienda.direttore;
			if (impiegato.nome.equals(nome) && impiegato.cognome.equals(cognome)) {
				azienda.direttore = null;
				return;
			}
		}

		// Cerca e rimuovi l'impiegato desiderato
		boolean trovato = false;
		for (int i = 0; i < azienda.impiegati.length; i++) {
			Impiegato impiegato = azienda.impiegati[i];
			if (impiegato == null)
				continue;
			if (impiegato.nome.equals(nome) && impiegato.cognome.equals(cognome)) {
				// Rimuovi l'impiegato dall'azienda
				azienda.impiegati[i] = null;
				trovato = true;
				azienda.cntImpiegati--;
				break;
			}
		}
		// Mostra un messaggio se l'impiegato non e' stato trovato
		if (!trovato)
			System.out.println("Impiegato non trovato!");
	}

	/**
	 * Mostra i dipendenti dell'azienda
	 * 
	 * @param azienda
	 *                azienda da visualizzare
	 */
	private static void mostraAzienda(Azienda azienda) {
		// Controlla se l'azienda ha dei dipendenti
		if (azienda.cntImpiegati == 0 && azienda.direttore == null) {
			System.out.println("Nessun dipendente");
			return;
		}

		// Mostra il direttore (se presente)
		if (azienda.direttore == null) {
			System.out.println("Direttore non presente");
		} else {
			System.out.println("Direttore");
			mostraImpiegato(azienda.direttore);
		}

		// Mostra i vari impiegati
		for (Impiegato impiegato : azienda.impiegati) {
			if (impiegato == null)
				continue;
			mostraImpiegato(impiegato);
		}
	}

	/**
	 * Mostra le informazioni dell'impiegato
	 * 
	 * @param impiegato
	 *                  impiegato da visualizzare
	 */
	private static void mostraImpiegato(Impiegato impiegato) {
		System.out.println("Nome: " + impiegato.nome + ", Cognome: " + impiegato.cognome + ", Eta': " + impiegato.eta
				+ ", Funzione: " + impiegato.funzione + ", Salario: " + impiegato.salario);
	}

	/**
	 * Mostra il menu e ritorna la scelta fatta dall'utente
	 * 
	 * @return la scelta fatta dall'utente
	 */
	private static int menu() {
		System.out.println("\n1. Aggiungi dipendente");
		System.out.println("2. Rimuovi dipendente");
		System.out.println("3. Mostra azienda");
		System.out.println("0. Esci");

		// Leggi la scelta effettuata ed assicurati che sia compresa tra 0 e 3.
		int scelta;
		do {
			System.out.print("Scelta: ");
			scelta = input.nextInt();
		} while (scelta < 0 || scelta > 3);
		// Svuota il buffer
		input.nextLine();
		return scelta;
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Crea una nuova azienda
		Azienda azienda = new Azienda();

		// Mostra il menu e leggi la scelta effettuata
		int scelta = menu();
		System.out.println();
		while (scelta != 0) {
			switch (scelta) {
				case 1:
					// Controlla se ci sono ancora dei posti liberi
					if (azienda.cntImpiegati == azienda.impiegati.length && azienda.direttore != null) {
						System.out.println("Posti di lavoro esauriti");
						break;
					}

					// Crea un nuovo impiegato ed inizializza i campi con le informazioni inserite
					// dall'utente

					System.out.print("Nome: ");
					String nome = input.nextLine();
					System.out.print("Cognome: ");
					String cognome = input.nextLine();
					System.out.print("Eta': ");
					int eta = input.nextInt();
					// Svuota il buffer
					input.nextLine();
					System.out.print("Funzione: ");
					Funzione funzione = Funzione.valueOf(input.nextLine().toUpperCase());
					System.out.print("Salario: ");
					double salario = input.nextDouble();
					// Svuota il buffer
					input.nextLine();

					Impiegato impiegato = new Impiegato(nome, cognome, eta, funzione, salario);

					// Aggiungi l'impiegato all'azienda
					aggiungiImpiegato(azienda, impiegato);
					break;
				case 2:
					// Controlla se l'azienda ha degli impiegati
					if (azienda.cntImpiegati == 0 && azienda.direttore == null) {
						System.out.println("Nessun dipendente");
						break;
					}

					// Richiedi il nome ed il cognome dell'impiegato da rimuovere
					System.out.print("Nome: ");
					String nomeDipendente = input.nextLine();
					System.out.print("Cognome: ");
					String cognomeDipendente = input.nextLine();

					// Rimuovi l'impiegato dall'azienda
					rimuoviImpiegato(azienda, nomeDipendente, cognomeDipendente);
					break;
				case 3:
					// Mostra i dipendenti dell'azienda
					mostraAzienda(azienda);
					break;
			}

			// Mostra il menu e leggi la scelta effettuata
			scelta = menu();
			System.out.println();
		}

		// Finalizza lo scanner
		input.close();
	}
}
