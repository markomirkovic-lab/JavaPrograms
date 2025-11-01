import java.util.Scanner;

/**
 * Esercitazione - Negozio di Sci
 * 
 * Classe che rappresenta un paio di sci (marca, modello, colore e lunghezza)
 */
class Sci {
    int id;
    String marca;
    String modello;
    String colore;
    double lunghezza;

    Sci(int id, String marca, String modello, String colore, double lunghezza) {
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.lunghezza = lunghezza == 0 ? Math.random() * 1.5 + 1.0 : Math.abs(lunghezza);
    }
}

/**
 * Classe che rappresenta un magazzino di un negozio di sci
 */
class Magazzino {
    Sci[] sci = new Sci[20];
    int cntSci;
}

/**
 * Classe di test per le classe Sci e Magazzino. Permette l'aggiunta e la
 * rimozione di sci da un magazzino. Permette
 * inoltre la visualizzazione del contenuto del magazzino
 */
public class TestNegozioDiSci {
    // Inizializza lo scanner per leggere dati da tastiera
    private static Scanner input = new Scanner(System.in);

    /**
     * Aggiunge il paio di sci al magazzino
     *
     * @param magazzino magazzino dove aggiungere gli sci
     * @param sci       il paio di sci da aggiungere al magazzino
     */
    private static void aggiungiSci(Magazzino magazzino, Sci sci) {
        // Controlla se il magazzino e' pieno
        if (magazzino.cntSci == magazzino.sci.length) {
            System.out.println("Magazzino pieno");
            return;
        }

        // Cerca un posto libero dove aggiungere gli sci
        for (int i = 0; i < magazzino.sci.length; i++)
            if (magazzino.sci[i] == null) {
                magazzino.sci[i] = sci;
                break;
            }
        // Incrementa il numero di sci presenti nel magazzino
        magazzino.cntSci++;
    }

    /**
     * Rimuove gli sci con un determinato identificatore dal magazzino
     *
     * @param magazzino magazzino dal quale rimuovere gli sci
     * @param id        identificatore degli sci da rimuovere
     */
    private static void rimuoviSci(Magazzino magazzino, int id) {
        // Controlla se il magazzino e' vuoto
        if (magazzino.cntSci == 0) {
            System.out.println("Magazzino vuoto");
            return;
        }

        // Cerca il paio di sci con un determinato identificatore
        boolean trovato = false;
        for (int i = 0; i < magazzino.sci.length; i++) {
            if (magazzino.sci[i] == null)
                continue;
            if (magazzino.sci[i].id == id) {
                // Rimuovi gli sci dal magazzino
                magazzino.sci[i] = null;
                trovato = true;
                magazzino.cntSci--;
                break;
            }
        }
        // Mostra un messaggio se gli sci desiderati non sono stati trovati nel
        // magazzino
        if (!trovato)
            System.out.println("Sci non trovato!");
    }

    /**
     * Mostra il contenuto del magazzino
     *
     * @param magazzino magazzino da visualizzare
     */
    private static void mostraMagazzino(Magazzino magazzino) {
        // Controlla se il magazzino e' vuoto
        if (magazzino.cntSci == 0) {
            System.out.println("Magazzino vuoto");
            return;
        }

        // Mostra tutti gli sci presenti nel magazzino
        for (Sci sci : magazzino.sci) {
            if (sci == null)
                continue;
            mostraSci(sci);
        }
    }

    /**
     * Mostra le caratteristiche degli sci
     *
     * @param sci sci da visualizzare
     */
    private static void mostraSci(Sci sci) {
        System.out.println("ID: " + sci.id + ", Marca: " + sci.marca + ", Modello: " + sci.modello + ", Colore: "
                + sci.colore + ", Lunghezza: " + sci.lunghezza);
    }

    /**
     * Mostra il menu e ritorna la scelta fatta dall'utente
     *
     * @return la scelta fatta dall'utente
     */
    private static int menu() {
        System.out.println("\n1. Aggiungi sci");
        System.out.println("2. Rimuovi sci");
        System.out.println("3. Mostra magazzino");
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
        // Crea un nuovo magazzino
        Magazzino magazzino = new Magazzino();

        // Mostra il menu e leggi la scelta effettuata
        int scelta = menu();
        System.out.println();
        while (scelta != 0) {
            switch (scelta) {
                case 1:
                    // Controlla se puo' essere aggiunto un nuovo paio di sci
                    if (magazzino.cntSci == magazzino.sci.length) {
                        System.out.println("Magazzino pieno");
                        break;
                    }

                    // Crea gli sci ed inizializza i campi con i valori inseriti dall'utente
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Marca: ");
                    String marca = input.nextLine();
                    System.out.print("Modello: ");
                    String modello = input.nextLine();
                    System.out.print("Colore: ");
                    String colore = input.nextLine();
                    System.out.print("Lunghezza: ");
                    double lunghezza = input.nextDouble();

                    // Svuota il buffer
                    input.nextLine();

                    Sci sci = new Sci(id, marca, modello, colore, lunghezza);

                    // Aggiungi gli sci al magazzino
                    aggiungiSci(magazzino, sci);
                    break;
                case 2:
                    // Controlla se il magazzino e' vuoto
                    if (magazzino.cntSci == 0) {
                        System.out.println("Magazzino vuoto");
                        break;
                    }

                    // Richiedi l'identificatore degli sci da rimuovere
                    System.out.print("ID sci: ");
                    int idSci = input.nextInt();
                    // Svuota il buffer
                    input.nextLine();

                    // Rimuovi gli sci dal magazzino
                    rimuoviSci(magazzino, idSci);
                    break;
                case 3:
                    // Visualizza il contenuto del magazzino
                    mostraMagazzino(magazzino);
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
