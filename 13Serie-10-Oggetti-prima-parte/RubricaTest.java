import java.util.Scanner;

/**
 * Mini rubrica telefonica di al massimo 10 persone
 */
class Rubrica {
	Contatto contatti[] = new Contatto[10];
	int numContatti;
}

/**
 * Classe che rappresenta un contatto. Permette l'immagazzinamento dei dati anagrafici della persona
 * (nome, cognome, indirizzo) e il rispettivo numero di telefono
 */
class Contatto {
	String nome;
	String cognome;
	String indirizzo;
	String numeroTelefono;

	/**
	 * Costruttore classe contatto
	 * @param nome nome del contatto
	 * @param cognome cognome del contatto
	 * @param indirizzo indirizzo del contatto
	 * @param numeroTelefono numero di telefono del contatto
	 */
	Contatto(String nome, String cognome, String indirizzo, String numeroTelefono){
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.numeroTelefono = numeroTelefono;
	}
}

/**
 * Programma per il test della classe Rubrica. Permette l'aggiunta di nuovi contatti alla rubrica
 * così come la stampa a schermo dell'intera rubrica
 */
public class RubricaTest {

	private static Scanner input;

	/**
	 * Procedura per l'aggiunta di un nuovo contatto alla rubrica. Mostra un messaggio d'errore se
	 * la rubrica è piena
	 * 
	 * @param rubrica
	 *            la rubrica alla quale aggiungere il nuovo contatto
	 */
	private static void aggiungiContatto(Rubrica rubrica) {
		if (rubrica.numContatti >= 10) {
			System.out.println("La rubrica è piena!");
			return;
		}
		rubrica.contatti[rubrica.numContatti++] = creaContatto();
	}

	/**
	 * Funzione per la creazione di un nuovo contatto
	 * 
	 * @return un nuovo contatto inizializzato correttamente
	 */
	private static Contatto creaContatto() {
		System.out.print("Nome: ");
		String nome = input.nextLine();
		System.out.print("Cognome: ");
		String cognome = input.nextLine();
		System.out.print("Indirizzo: ");
		String indirizzo = input.nextLine();
		System.out.print("Telefono: ");
		String numeroTelefono = input.nextLine();
		return new Contatto(nome, cognome,indirizzo,numeroTelefono);
	}

	/**
	 * Procedura per la stampa di un contatto
	 * 
	 * @param contatto
	 *            il contatto da stampare a schermo
	 */
	private static void stampaContatto(Contatto contatto) {
		System.out.println(contatto.nome + " " + contatto.cognome);
		System.out.println(contatto.indirizzo);
		System.out.println(contatto.numeroTelefono);
		System.out.println();
	}

	/**
	 * Procedura per la stampa dell'intera rubrica
	 * 
	 * @param rubrica
	 *            la rubrica da stampare a schermo
	 */
	private static void stampaRubrica(Rubrica rubrica) {
		if (rubrica.numContatti == 0) {
			System.out.println("La rubrica è vuota!");
			return;
		}
		for (int i = 0; i < rubrica.numContatti; i++)
			stampaContatto(rubrica.contatti[i]);
	}

	/**
	 * Funzione che mostra il menu e restituisce la scelta effettuata dall'utente
	 * 
	 * @return la scelta effettuata dall'utente
	 */
	private static int menu() {
		System.out.println("1. Aggiungi contatto");
		System.out.println("2. Stampa contatti");
		System.out.println("3. Esci");
		return input.nextInt();
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
				case 1 -> {
					// Svuota il buffer
					input.nextLine();
					aggiungiContatto(rubrica);
				}
				case 2 -> stampaRubrica(rubrica);
				default -> System.out.println("Scelta non valida!");
			}
			System.out.println();
			scelta = menu();
		}
		input.close();
	}
}
