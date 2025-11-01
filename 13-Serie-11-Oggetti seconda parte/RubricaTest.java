import java.util.Scanner;

/**
 * Mini rubrica telefonica di al massimo 10 persone. Versione dell'esercizio 3
 * della serie 9 modificata in modo da sfruttare i costruttori e i metodi
 * d'istanza
 */
class Rubrica {
	static final int NUMERO_MASSIMO_CONTATTI = 10;
	Contatto contatti[] = new Contatto[NUMERO_MASSIMO_CONTATTI];
	int numContatti;

	/**
	 * Metodo per l'aggiunta di un nuovo contatto alla rubrica. Mostra un messaggio
	 * d'errore se la
	 * rubrica è piena
	 * 
	 * @param input
	 */
	void aggiungiContatto(Scanner input) {
		if (input == null)
			return;

		if (numContatti >= NUMERO_MASSIMO_CONTATTI) {
			System.out.println("La rubrica è piena!");
			return;
		}

		System.out.print("Nome: ");
		String nome = input.nextLine();
		System.out.print("Cognome: ");
		String cognome = input.nextLine();
		System.out.print("Indirizzo: ");
		String indirizzo = input.nextLine();
		System.out.print("Telefono: ");
		String numeroTelefono = input.nextLine();

		contatti[numContatti++] = new Contatto(nome, cognome, indirizzo, numeroTelefono);
	}

	/**
	 * Metodo per la stampa dell'intera rubrica
	 */
	void stampaRubrica() {
		if (numContatti == 0) {
			System.out.println("La rubrica è vuota!");
			return;
		}

		for (int i = 0; i < numContatti; i++)
			contatti[i].stampaContatto();
	}
}

/**
 * Classe che rappresenta un contatto. Permette l'immagazzinamento dei dati
 * anagrafici della persona
 * (nome, cognome, indirizzo) e il rispettivo numero di telefono
 */
class Contatto {
	String nome;
	String cognome;
	String indirizzo;
	String numeroTelefono;

	/**
	 * Costruttore. Richiede all'utente tutte le info necessarie per inizializzare
	 * correttamente
	 * l'oggetto
	 * 
	 * @param input
	 */
	Contatto(String nome, String cognome, String indirizzo, String numeroTelefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.numeroTelefono = numeroTelefono;
	}

	/**
	 * Metodo per la stampa di un contatto
	 */
	void stampaContatto() {
		System.out.println(nome + " " + cognome);
		System.out.println(indirizzo);
		System.out.println(numeroTelefono);
		System.out.println();
	}
}

/**
 * Programma per il test della classe Rubrica. Permette l'aggiunta di nuovi
 * contatti alla rubrica
 * così come la stampa a schermo dell'intera rubrica
 */
public class RubricaTest {

	private static Scanner input;

	/**
	 * Funzione che legge da tastiera un intero e lo restituisce. Ripete la
	 * richiesta se il tipo di dato inserito non dovesse essere valido.
	 * 
	 * @return il valore letto da tastiera
	 */
	private static int richiediIntero() {
		while (!input.hasNextInt()) {
			System.out.print("Valore non valido. Riprova: ");
			input.nextLine();
		}
		int valore = input.nextInt();
		// Svuota il buffer
		input.nextLine();
		return valore;
	}

	/**
	 * Funzione che mostra il menu e restituisce la scelta effettuata dall'utente
	 * 
	 * @return la scelta effettuata dall'utente
	 */
	private static int menu() {
		System.out.println("""
				1. Aggiungi contatto
				2. Stampa contatti
				3. Esci
				""");
		return richiediIntero();
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
		input = new Scanner(System.in);

		int scelta = menu();
		while (scelta != 3) {
			switch (scelta) {
				case 1:
					rubrica.aggiungiContatto(input);
					break;
				case 2:
					rubrica.stampaRubrica();
					break;
				default:
					System.out.println("Scelta non valida!");
					break;
			}
			System.out.println();
			scelta = menu();
		}
		input.close();
	}
}
