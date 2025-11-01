// La classe Persona rappresenta una persona con nome e cognome
class Persona {
    String nome;
    String cognome;

    Persona(String nome, String cognomeL) {
        this.nome = nome; // il nome del campo e' uguale al nome del parametro => "this." obbligatorio
        this.cognome = cognomeL; // il nome del campo e' diverso dal nome del parametro => "this." opzionale
    }

    void stampa() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
    }
}

// Una classe rappresenta il "progetto" di un oggetto
// In questo caso, la classe Libro definisce come è fatto un libro
class Libro {
    // I campi (o attributi) descrivono le caratteristiche di un libro
    String titolo;
    Persona autore;
    int numeroPagine; // se non viene assegnato esplicitamente un valore diverso, il campo avrà il
                      // valore di default: 0

    // Il costruttore è un "metodo speciale" che serve per creare nuovi libri
    // Questo costruttore accetta tutti e tre i dati del libro
    Libro(String titolo, Persona autore, int nrPagine) {
        this(titolo, autore); // richiamo il costruttore di Libro con i due parametri

        // prima di assegnare il valore, mi devo assicurare che il valore che voglio
        // assegnare sia sensato
        numeroPagine = nrPagine < 0 ? 10 : nrPagine; // il nome del campo e' diverso dal nome del parametro => "this."
                                                     // è opzionale
    }

    // Questo e' un altro costruttore (sovraccarico il costruttore) che accetta solo
    // due dati (il numero di pagine non viene specificato)
    Libro(String titolo, Persona autore) {
        this.titolo = titolo; // il nome del campo e' uguale al nome del parametro => "this." e' obbligatorio

        // Controllo che il valore del parametro 'autore' non sia nullo, perche' in caso
        // lo fosse, darebbe problemi nel metodo 'stampa'.
        // L'alternativa e' gestire il caso in cui 'autore' sia 'null' nel metodo
        // 'stampa'.
        if (autore == null) {
            // Creiamo un nuovo oggetto Persona come autore di default
            autore = new Persona("Nome autore sconosciuto", "Cognome autore sconosciuto");
        }
        this.autore = autore;
    }

    void stampa() {
        System.out.println("Libro:");
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore:");
        autore.stampa(); // richiamo la stampa dell'oggetto di tipo Persona
        System.out.println("Nr. pagine: " + numeroPagine);
    }
}

class Biblioteca {
    Persona responsabile;
    Libro[] libri = new Libro[10]; // inizializzo l'array durante la dichiarazione del campo
                                   // Inizialmente, tutte le celle dell'array contengono null

    // Il contatore tiene traccia del numero di libri attualmente presenti nella
    // biblioteca
    // Questo campo ci permette di:
    // 1. Sapere sempre dove inserire il prossimo libro (alla posizione
    // contatoreLibri)
    // 2. Evitare di dover scorrere tutto l'array per trovare la prima posizione
    // libera
    // 3. Conoscere immediatamente quanti libri sono presenti nella biblioteca
    int contatoreLibri;

    Biblioteca(Persona responsabile) {

        // Controllo che il valore del parametro 'responsabile' non sia nullo, perche'
        // in caso lo fosse, darebbe problemi nel metodo 'stampa'.
        // L'alternativa e' gestire il caso in cui 'responsabile' sia 'null' nel metodo
        // 'stampa'.
        if (responsabile == null) {
            responsabile = new Persona("Nome responsabile sconosciuto", "Cognome responsabile sconosciuto");
        }
        this.responsabile = responsabile;
    }

    Biblioteca(Persona responsabile, int nrLibri) {
        this(responsabile);

        // Controllo che il valore del parametro 'nrLibri' sia sensato. Nel caso non lo
        // fosse, non faccio niente in quanto il campo 'libri' viene gia' inizializzato
        // con un array di 10 elementi (si veda la dichiarazione del campo).
        if (nrLibri > 0) {
            this.libri = new Libro[nrLibri]; // sovrascrivo il valore assegnato durante l'inizializzazione del campo con
                                             // un array la cui dimensione e' specificata dal parametro 'nrLibri'.
        }
    }

    void stampa() {
        System.out.println("Biblioteca:");
        System.out.println("\nResponsabile:");

        // La biblioteca delega la stampa del responsabile all'oggetto Persona.
        // Questo è un esempio di delega: ogni oggetto è responsabile di stampare i
        // propri dati.
        responsabile.stampa();
        for (int i = 0; i < libri.length; i++) {
            Libro libroCorrente = libri[i];
            // Devo controllare che il libro nella cella corrente non sia 'null',
            // altrimenti quando cerco di stampare il libro, il programma va in errore,
            // perche' cerca di accedere ai campi del libro
            if (libroCorrente != null) {
                System.out.println();
                // Anche qui, la biblioteca delega la stampa del libro all'oggetto Libro
                // Il libro a sua volta delegherà la stampa dell'autore all'oggetto Persona
                libroCorrente.stampa();
            }
        }
    }

    // Metodo che aggiunge un singolo libro alla biblioteca.
    // Restituisce true se il libro è stato aggiunto, false altrimenti.
    boolean aggiungiLibro(Libro libro) {
        // Prima di aggiungere un nuovo libro controllo che ci sia ancora spazio
        // nell'array e che il libro non sia 'null'
        if (libro == null || contatoreLibri == libri.length) {
            return false;
        }

        // Inserisco il libro nella prima posizione libera (indicata da contatoreLibri)
        // e incremento il contatore per il prossimo inserimento.
        libri[contatoreLibri] = libro;
        contatoreLibri++;
        return true;
    }

    // Questo metodo mostra il concetto di sovraccarico: stesso nome ma parametri
    // diversi.
    // In questo caso, il metodo accetta un array di libri invece di un singolo
    // libro.
    boolean aggiungiLibro(Libro[] nuoviLibri) {
        for (int i = 0; i < nuoviLibri.length; i++) {
            Libro libro = nuoviLibri[i];

            if (!aggiungiLibro(libro)) { // Sfruttiamo il metodo che aggiunge un singolo libro
                return false; // Al primo libro che non si riesce ad aggiungere, o perche' il libro e' 'null'
                              // o perche' non c'e' piu' spazio nell'array 'libri', restituisco 'false' senza
                              // provare ad aggiungere gli eventuali altri libri.
            }
        }
        return true;
    }
}

public class BibliotecaTestV3 {

    // Sottoprogramma d'appoggio usato per evitare la duplicazione di codice ogni
    // volta che si vuole aggiungere un libro e sapere se è stato aggiunto.
    private static void aggiungiLibro(Biblioteca biblioteca, Libro libro) {
        if (biblioteca.aggiungiLibro(libro)) {
            System.out.println("Libro aggiunto.");
        } else {
            System.out.println("Libro non aggiunto. Biblioteca piena.");
        }
    }

    public static void main(String[] args) {

        Persona autore1 = new Persona("Pippo", "Pluto");
        // Creazione di un oggetto di tipo Libro
        Libro libro1 = new Libro("Viaggio intorno al mondo", autore1, 2);
        libro1.stampa();
        System.out.println();

        libro1.titolo = "Topolino"; // modifico il valore del campo "titolo" dell'oggetto "libro1"
        libro1.stampa();
        System.out.println();

        Persona autore2 = new Persona("Rossi", "Mario");
        Libro libro2 = new Libro("Bla bla", autore2);// il numero di pagine non viene specificato in questo
                                                     // costruttore => il campo "numeroPagine" del nuovo libro
                                                     // ha come valore 0 (valore di default)
        libro2.stampa();

        System.out.println("\n\n\n");

        Biblioteca biblioteca = new Biblioteca(new Persona("Luca", "Verdi"), 5);
        // Sfrutto il metodo 'aggiungiLibro' di 'Biblioteca' per aggiungere alcuni libri
        aggiungiLibro(biblioteca, libro1);
        aggiungiLibro(biblioteca, libro2);

        Libro[] libri = {
                new Libro("Titolo 3", new Persona("Nome 3", "Cognome 3")),
                new Libro("Titolo 4", new Persona("Nome 4", "Cognome 4"), 12)
        };

        if (biblioteca.aggiungiLibro(libri)) { // Sfrutto il metodo 'aggiungiLibro' sovraccaricato di
                                               // 'Biblioteca' che prende un array di libri come parametro
                                               // per aggiungere alcuni libri
            System.out.println("Tutti i libri sono stati aggiunti");
        } else {
            System.out.println("Qualcosa e' andato storto nell'aggiunta dei libri nell'array");
        }

        System.out.println("\n\n\n");

        biblioteca.stampa();
    }
}