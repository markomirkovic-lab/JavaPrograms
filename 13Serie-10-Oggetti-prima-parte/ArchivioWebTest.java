import java.util.Scanner;

/**
 * Classe che rappresenta una voce dell'archivio (con il nome del sito, l'indirizzo web e una breve
 * descrizione)
 */
class VoceArchivio {
    String nomeSito;
    String indirizzo;
    String descrizione;

    /**
     * Costruttore della classe VoceArchivio
     *
     * @param nomeSito    nome del sito
     * @param indirizzo   indirizzo web
     * @param descrizione breve descrizione
     */
    VoceArchivio(String nomeSito, String indirizzo, String descrizione) {
        this.nomeSito = nomeSito;
        this.indirizzo = indirizzo;
        this.descrizione = descrizione;
    }
}

/**
 * Classe che rappresenta un archivio d'indirizzi web (con al massimo 10 voci)
 */
class ArchivioWeb {
    // Numero massimo di voci nell'archivio
    static final int VOCI_MAX = 10;

    VoceArchivio[] voci = new VoceArchivio[VOCI_MAX];
    int vociCnt = 0;
}

/**
 * Classe di test per la classe ArchivioWeb e le relative classi di appoggio. Il programma permette
 * l'aggiunta di una o più voci all'archivio, la rimozione di una o più voci dall'archivio e la
 * visualizzazione dell'intero archivio. Permette inoltre di ricercare all'interno dell'archivio in
 * base al nome del sito o a una parola chiave
 */
public class ArchivioWebTest {

    private static Scanner input;

    /**
     * Mostra il menu e restituisce la scelta fatta dall'utente
     *
     * @return la scelta fatta dall'utente
     */
    private static int menu() {
        System.out.println();
        System.out.println("1. Aggiungi indirizzo");
        System.out.println("2. Rimuovi indirizzo");
        System.out.println("3. Visualizza archivio");
        System.out.println("4. Ricerca nome sito");
        System.out.println("5. Ricerca parola chiave");
        System.out.println("6. Esci");
        System.out.print("Scelta: ");
        int scelta = input.nextInt();
        // Svuota il buffer
        input.nextLine();
        return scelta;
    }

    /**
     * Aggiunge una voce all'archivio
     *
     * @param archivio archivio al quale aggiungere una voce
     */
    private static void aggiungiVoce(ArchivioWeb archivio) {
        if (archivio.vociCnt == ArchivioWeb.VOCI_MAX) {
            System.out.println("L'archivio è pieno");
            return;
        }

        System.out.print("Nome sito: ");
        String nomeSito = input.nextLine();
        System.out.print("Indirizzo sito: ");
        String indirizzo = input.nextLine();
        System.out.print("Descrizione: ");
        String descrizione = input.nextLine();

        archivio.voci[archivio.vociCnt++] = new VoceArchivio(nomeSito, indirizzo, descrizione);
    }

    /**
     * Rimuove una voce dall'archivio
     *
     * @param archivio archivio dal quale rimuovere la voce
     */
    private static void rimuoviVoce(ArchivioWeb archivio) {
        if (archivio.vociCnt == 0) {
            System.out.println("Archivio vuoto");
            return;
        }

        System.out.print("Nome sito: ");
        String nomeSito = input.nextLine();
        int i;
        boolean trovato = false;

        // Cerca la voce da rimuovere dall'archivio
        for (i = 0; i < archivio.vociCnt; i++)
            if (archivio.voci[i].nomeSito.equalsIgnoreCase(nomeSito)) {
                trovato = true;
                break;
            }
        if (!trovato) {
            // La voce non è stata trovata nell'archivio
            System.out.println("Voce non trovata.");
            return;
        }
        // Rimuovi la voce desiderata dall'archivio (se trovata)
        for (; i < archivio.vociCnt - 1; i++)
            archivio.voci[i] = archivio.voci[i + 1];
        archivio.voci[i] = null;
        archivio.vociCnt--;
    }

    /**
     * Stampa a schermo la voce dell'archivio
     *
     * @param voce voce da visualizzare
     */
    private static void visualizzaVoceArchivio(VoceArchivio voce) {
        System.out.println(voce.nomeSito + " (" + voce.indirizzo + "): " + voce.descrizione);
    }

    /**
     * Visualizza il contenuto dell'intero archivio
     *
     * @param archivio archivio da visualizzare
     */
    private static void visualizzaArchivio(ArchivioWeb archivio) {
        for (int i = 0; i < archivio.vociCnt; i++)
            visualizzaVoceArchivio(archivio.voci[i]);
    }

    /**
     * Cerca una voce nell'archivio eseguendo una ricerca con il nome del sito
     *
     * @param archivio archivio nel quale eseguire la ricerca
     */
    private static void ricercaSito(ArchivioWeb archivio) {
        if (archivio.vociCnt == 0) {
            System.out.println("Archivio vuoto");
            return;
        }

        boolean trovato = false;
        System.out.print("Nome del sito: ");
        String nomeSito = input.nextLine();

        for (int i = 0; i < archivio.vociCnt; i++) {
            if (archivio.voci[i].nomeSito.equalsIgnoreCase(nomeSito)) {
                visualizzaVoceArchivio(archivio.voci[i]);
                trovato = true;
            }
        }
        if (!trovato)
            System.out.println("Voce non trovata");
    }

    /**
     * Cerca una voce nell'archivio eseguendo una ricerca con una parola chiave all'interno della
     * descrizione
     *
     * @param archivio archivio nel quale eseguire la ricerca
     */
    private static void ricercaParolaChiave(ArchivioWeb archivio) {
        if (archivio.vociCnt == 0) {
            System.out.println("Archivio vuoto");
            return;
        }

        boolean trovato = false;
        System.out.print("Parola chiave: ");
        String parolaChiave = input.nextLine().toLowerCase();

        for (int i = 0; i < archivio.vociCnt; i++) {
            if (archivio.voci[i].descrizione.toLowerCase().contains(parolaChiave)) {
                visualizzaVoceArchivio(archivio.voci[i]);
                trovato = true;
            }
        }
        if (!trovato)
            System.out.println("Voce non trovata");
    }

    /**
     * Procedura main - parte principale del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        input = new Scanner(System.in);
        ArchivioWeb archivio = new ArchivioWeb();

        int scelta = menu();
        while (scelta != 6) {
            switch (scelta) {
                case 1 -> aggiungiVoce(archivio);
                case 2 -> rimuoviVoce(archivio);
                case 3 -> visualizzaArchivio(archivio);
                case 4 -> ricercaSito(archivio);
                case 5 -> ricercaParolaChiave(archivio);
                default -> System.out.println("Scelta non valida. Riprova.");
            }
            scelta = menu();
        }
        input.close();
    }
}
