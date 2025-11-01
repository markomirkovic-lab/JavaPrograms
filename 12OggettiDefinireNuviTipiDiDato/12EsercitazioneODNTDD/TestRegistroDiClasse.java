import java.util.Scanner;

/**
 * Esercitazione - Registro di classe
 * <p>
 * Classe che rappresenta un registro di classe
 */
class RegistroDiClasse {
    String nomeClasse;
    int numeroAula;
    Studente[] studenti = new Studente[20];
    int cntStudenti;

    RegistroDiClasse(String nomeClasse, int numeroAula) {
        this.nomeClasse = nomeClasse;
        this.numeroAula = numeroAula;
    }
}

/**
 * Classe che rappresenta uno studente
 */
class Studente {
    String nome;
    String cognome;
    String matricola;

    Studente(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }
}

/**
 * Classe di test per le classi RegistroDiClasse e Studente
 */
public class TestRegistroDiClasse {
    // Inizializza lo scanner per leggere dati da tastiera
    private static Scanner input = new Scanner(System.in);

    /**
     * Aggiungi uno studente ad un registro di classe
     *
     * @param registroDiClasse registro di classe dove aggiungere lo studente
     * @param studente         studente da aggiungere al registro di classe
     */
    private static void aggiungiStudente(RegistroDiClasse registroDiClasse,
            Studente studente) {
        // Controlla se il registro di classe e' pieno
        if (registroDiClasse.cntStudenti == registroDiClasse.studenti.length) {
            System.out.println("Registro completo");
            return;
        }
        // Aggiungi lo studente al registro di classe
        registroDiClasse.studenti[registroDiClasse.cntStudenti++] = studente;
    }

    /**
     * Cerca un registro di classe in base al nome della classe
     *
     * @param registriDiClasse collezione di rgistri di classe all'interno della
     *                         quale cercare il registro desiderato
     * @param nomeClasse       nomde della classe per la quale cercare il registro
     * @return il registro di classe desiderato oppure null se la classe con quel
     *         nome non esiste
     */
    private static RegistroDiClasse cercaRegistro(RegistroDiClasse[] registriDiClasse,
            String nomeClasse) {
        for (RegistroDiClasse registroDiClasse : registriDiClasse) {
            if (registroDiClasse == null)
                continue;
            if (registroDiClasse.nomeClasse.equals(nomeClasse))
                return registroDiClasse;
        }
        return null;
    }

    /**
     * Cerca uno studente in un registro di classe in base al nome e al cognome
     *
     * @param registroDiClasse registro di classe dove cercare lo studente
     * @param cognome          cognome dello studente da cercare
     * @param nome             nome dello studente da cercare
     * @return studente cercato oppure null se lo studente non e' presente nel
     *         registro
     */
    private static Studente cercaStudente(RegistroDiClasse registroDiClasse,
            String cognome, String nome) {
        if (registroDiClasse == null)
            return null;

        for (Studente studente : registroDiClasse.studenti) {
            if (studente == null)
                continue;
            if (studente.nome.equals(nome) && studente.cognome.equals(cognome))
                return studente;
        }
        return null;
    }

    /**
     * Mostra il contenuto del registro di classe
     *
     * @param registroDiClasse registro di classe da visualizzare
     */
    private static void mostraRegistro(RegistroDiClasse registroDiClasse) {
        // Controlla se il registro di classe esiste
        if (registroDiClasse == null) {
            System.out.println("Registro non presente");
            return;
        }
        // Mostra le informazioni del registro di classe
        System.out.println("Nome classe: " + registroDiClasse.nomeClasse
                + ", numero aula: " + registroDiClasse.numeroAula);
        // Mostra gli studenti presenti nel registro di classe (se ce ne sono)
        if (registroDiClasse.cntStudenti == 0) {
            System.out.println("Nessun studente presente");
            return;
        }
        System.out.println("Studenti:");
        for (int i = 0; i < registroDiClasse.cntStudenti; i++)
            mostraStudente(registroDiClasse.studenti[i]);
    }

    /**
     * Mostra le informazioni relative allo studente
     *
     * @param studente studente da visualizzare
     */
    private static void mostraStudente(Studente studente) {
        if (studente == null) {
            System.out.println("Studente non presente");
            return;
        }
        System.out.println("\tNome: " + studente.nome + ", cognome: " + studente.cognome
                + ", matricola: " + studente.matricola);
    }

    /**
     * Mostra il menu e ritorna la scelta fatta dall'utente
     *
     * @return la scelta fatta dall'utente
     */
    private static int menu() {
        System.out.println("\n1. Aggiungi registro");
        System.out.println("2. Mostra registro");
        System.out.println("3. Cerca studente");
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
        // Crea un array che possa contenere 10 registri di classe
        RegistroDiClasse[] registriDiClasse = new RegistroDiClasse[10];
        int cntRegistri = 0;

        // Mostra il menu e leggi la scelta effettuata
        int scelta = menu();
        System.out.println();
        while (scelta != 0) {
            switch (scelta) {
                case 1:
                    // Controlla se � ancora possibile aggiungere un registro di classe
                    if (cntRegistri == registriDiClasse.length) {
                        System.out.println("Registri di classe esauriti");
                        break;
                    }

                    // Crea un nuovo registro di classe ed inizializza i campi con i valori
                    // inseriti dall'utente
                    System.out.print("Nome classe: ");
                    String nomeClasse = input.nextLine();
                    System.out.print("Numero aula: ");
                    int numeroAula = input.nextInt();
                    // Svuota il buffer
                    input.nextLine();

                    RegistroDiClasse registroDiClasse = new RegistroDiClasse(nomeClasse, numeroAula);

                    // Richiedi le informazioni dei singoli studenti
                    System.out.println("Studenti (nome vuoto per terminare)");
                    for (int i = 0; i < registroDiClasse.studenti.length; i++) {
                        System.out.print("Nome: ");
                        String nome = input.nextLine();
                        if (nome.equals(""))
                            break;
                        // Crea un nuovo studente ed inizializza i campi con i valori immessi
                        // dall'utente
                        System.out.print("Cognome: ");
                        String cognome = input.nextLine();
                        System.out.print("Numero matricola: ");
                        String matricola = input.nextLine();
                        Studente studente = new Studente(nome, cognome, matricola);
                        // Aggiungi lo studente al registro di classe
                        aggiungiStudente(registroDiClasse, studente);
                    }

                    // Aggiungi il registro di classe all'array
                    registriDiClasse[cntRegistri++] = registroDiClasse;
                    break;
                case 2:
                    // Controlla se esiste almeno un registro di classe
                    if (cntRegistri == 0) {
                        System.out.println("Nessun registro di classe presente");
                        break;
                    }
                    // Mostra i registri presenti
                    for (int i = 0; i < cntRegistri; i++)
                        System.out.println(i + ": classe " + registriDiClasse[i].nomeClasse);

                    // Richiedi il numero del registro di classe da visualizzare
                    System.out.print("Numero registro di classe: ");
                    int numeroRegistro = input.nextInt();
                    // Svuota il buffer
                    input.nextLine();

                    // Controlla se il registro di classe e' presente. Se lo e', mostrane il
                    // contenuto
                    if (numeroRegistro < 0 || numeroRegistro >= registriDiClasse.length
                            || registriDiClasse[numeroRegistro] == null)
                        System.out.println("Registro non presente");
                    else
                        mostraRegistro(registriDiClasse[numeroRegistro]);
                    break;
                case 3:
                    // Controlla se esiste almeno un registro di classe
                    if (cntRegistri == 0) {
                        System.out.println("Nessun registro di classe presente");
                        break;
                    }
                    // Richiedi il nome della classe all'interno della quale cercare lo
                    // studente
                    System.out.print("Nome della classe: ");
                    String nomeClasseRegistro = input.nextLine();

                    RegistroDiClasse registro = cercaRegistro(registriDiClasse, nomeClasseRegistro);
                    if (registro == null) {
                        System.out.println("Registro di classe non trovato");
                        break;
                    }

                    // Richiedi il nome e il cognome dello studente da cercare
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Cognome: ");
                    String cognome = input.nextLine();

                    // Cerca lo studente
                    Studente studente = cercaStudente(registro, cognome, nome);
                    mostraStudente(studente);
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
