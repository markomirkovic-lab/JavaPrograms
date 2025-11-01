/*
Esercizio 10.3 - Rubrica
Scrivete un programma e le necessarie classi di appoggio per una mini rubrica
telefonica contenente al massimo 10 persone. Il programma dovrà permettere
l’immagazzinamento dei dati anagrafici della persona (nome, cognome, indirizzo) e il
rispettivo numero di telefono. Inoltre, il programma dovrà permettere la stampa a
schermo di tutti i dati contenuti nella rubrica.
*/

import java.util.Scanner;

/**
 * Classe che rappresenta una mini rubrica telefonica di al massimo 10 persone
 */
class Rubrica {
    Contatto[] contatti = new Contatto[10];
    int numContatti;// counter
}

/**
 * Classe che rappresenta un contatto. Permette di visualizzare i dati anagrafici della persona
 * (nome, cognome, indirizzo, numero di telefono)
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
    Contatto(String nome, String cognome, String indirizzo, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numeroTelefono = numeroTelefono;
    }
}


public class Es10_3_Rubrica {

    // Scanner
    private static Scanner input;

    // Aggiungi contatto nella rubrica
    private static void aggiungiContatto(Rubrica rubrica) {
        // Verifica se la rubrica e' piena (massimo 10 contatti - limite dello spazio dell'array)
        if(rubrica.numContatti >= 10) {
            System.out.println("La rubrica e' piena");
            return;
        } 
        rubrica.contatti[rubrica.numContatti++] = creaContatto();
    }

    // Crea contatto
    private static Contatto creaContatto() {
        // Creazione contatto base input utente
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Cognome: ");
        String cognome = input.nextLine();
        System.out.print("Indirizzo: ");
        String indirizzo = input.nextLine();
        System.out.print("Numero di telefono: ");
        String numeroTelefono = input.nextLine();

        System.out.println("Contatto creato.");

        return new Contatto(nome, cognome, indirizzo, numeroTelefono);
    }
    
    // Stampa contatto
    private static void stampaContatto(Contatto contatto) {
        System.out.println();
        System.out.println(contatto.nome + contatto.cognome);
        System.out.println(contatto.indirizzo);
        System.out.println(contatto.numeroTelefono);
        System.out.println();
    }

    // Stampa rubrica
    private static void stampaRubrica(Rubrica rubrica) {
        if(rubrica.numContatti == 0) {
            System.out.println("La rubrica e' vuota");
            return;
        }
        for(int i = 0; i < rubrica.numContatti; i++) {
            stampaContatto(rubrica.contatti[i]);
        }
    }

    // Menu
    private static int menu() {
        System.out.println("1. Aggiungi contatto");
        System.out.println("2. Stampa contatti");
        System.out.println("3. Esci");
        return input.nextInt();
    }

    public static void main(String[] args) {

        // Scanner
        input = new Scanner(System.in);

        // Creazione nuova rubrica
        Rubrica rubrica = new Rubrica();

        // Menu e switch
        int scelta = menu();
        while(scelta !=3) {
            switch (scelta) {
                // Aggungi contatto
                case 1:
                    input.nextLine();// Svuota il buffer
                    aggiungiContatto(rubrica);
                    break;

                // Stampa rubrica
                case 2:
                    input.nextLine();// Svuota il buffer
                    System.out.println("Stampa rubrica telefonica:");
                    System.out.println("--------------------------");
                    stampaRubrica(rubrica);
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }

            /*
            Switch nuovo:
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
            */

            System.out.println();
            scelta = menu();
        }

        input.close();
    }
    
}
