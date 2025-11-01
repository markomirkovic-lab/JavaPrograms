// La classe Persona rappresenta una persona con nome e cognome
class Persona {
    String nome;
    String cognome;

    Persona(String nome, String cognomeL) {
        this.nome = nome; // il nome del campo e' uguale al nome del parametro => "this." obbligatorio
        this.cognome = cognomeL; // il nome del campo e' diverso dal nome del parametro => "this." opzionale
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

        if (autore == null) { // Gestione del caso in cui non viene fornito un autore valido
            // Creiamo un nuovo oggetto Persona come autore di default
            autore = new Persona("Nome autore sconosciuto", "Cognome autore sconosciuto");
        }
        this.autore = autore;
    }
}

class Biblioteca {
    Persona responsabile;
    Libro[] libri = new Libro[10]; // inizializzo l'array durante la dichiarazione del campo
                                   // Inizialmente, tutte le celle dell'array contengono null

    Biblioteca(Persona responsabile) {

        if (responsabile == null) { // Gestione del caso in cui non viene fornito un responsabile valido
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
}

public class BibliotecaTestV2 {

    private static void stampaPersona(Persona persona) {
        System.out.println("Nome: " + persona.nome);
        System.out.println("Cognome: " + persona.cognome);
    }

    private static void stampaLibro(Libro libro) {
        System.out.println("Libro:");
        System.out.println("Titolo: " + libro.titolo);
        System.out.println("Autore:");
        stampaPersona(libro.autore); // Sfruttiamo il metodo stampaPersona per stampare i dati dell'autore
        System.out.println("Nr. pagine: " + libro.numeroPagine);
    }

    private static void stampaBiblioteca(Biblioteca biblioteca) {
        System.out.println("Biblioteca:");
        System.out.println("\nResponsabile:");
        stampaPersona(biblioteca.responsabile);
        for (int i = 0; i < biblioteca.libri.length; i++) {
            Libro libroCorrente = biblioteca.libri[i];
            // devo controllare che il libro nella cella corrente non sia null,
            // altrimenti quando in "stampaLibro" cerco di accedere ad uno dei campi del
            // libro, il programma va in errore
            if (libroCorrente != null) {
                System.out.println();
                stampaLibro(libroCorrente);
            }
        }
    }

    public static void main(String[] args) {

        Persona autore1 = new Persona("Pippo", "Pluto");
        // Creazione di un oggetto di tipo Libro
        Libro libro1 = new Libro("Viaggio intorno al mondo", autore1, 2);
        stampaLibro(libro1);
        System.out.println();

        libro1.titolo = "Topolino"; // modifico il valore del campo "titolo" dell'oggetto "libro1"
        stampaLibro(libro1);
        System.out.println();

        Persona autore2 = new Persona("Rossi", "Mario");
        Libro libro2 = new Libro("Bla bla", autore2);// il numero di pagine non viene specificato in questo
                                                     // costruttore => il campo "numeroPagine" del nuovo libro
                                                     // ha come valore 0 (valore di default)
        stampaLibro(libro2);

        System.out.println("\n\n\n");

        Biblioteca biblioteca = new Biblioteca(new Persona("Luca", "Verdi"), 5);
        // Aggiungiamo i libri creati in precedenza nella biblioteca
        biblioteca.libri[0] = libro1;
        biblioteca.libri[1] = libro2;
        // Le altre posizioni (2,3,4) rimangono null

        stampaBiblioteca(biblioteca);
    }
}
