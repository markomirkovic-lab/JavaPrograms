// Una classe rappresenta il "progetto" di un oggetto
// In questo caso, la classe Libro definisce come è fatto un libro
class Libro {
    // I campi (o attributi) descrivono le caratteristiche di un libro
    String titolo;
    String nomeAutore;
    String cognomeAutore;
    int numeroPagine; // se non viene assegnato esplicitamente un valore diverso, il campo avrà il
                      // valore di default: 0

    // Il costruttore è un "metodo speciale" che serve per creare nuovi libri
    // Questo costruttore accetta tutti e quattro i dati del libro
    Libro(String titolo, String nomeAutore, String cognomeAutore, int nrPagine) {
        this(titolo, nomeAutore, cognomeAutore); // richiamo il costruttore di Libro con i tre parametri

        // prima di assegnare il valore, mi devo assicurare che il valore che voglio
        // assegnare sia sensato
        numeroPagine = nrPagine < 0 ? 10 : nrPagine; // il nome del campo e' diverso dal nome del parametro => "this."
                                                     // è opzionale
    }

    // Questo e' un altro costruttore (sovraccarico il costruttore) che accetta solo
    // tre dati (il numero di pagine non viene specificato)
    Libro(String titolo, String nomeAutore, String cognomeAutore) {
        this.titolo = titolo; // il nome del campo e' uguale al nome del parametro => "this." e' obbligatorio
        this.nomeAutore = nomeAutore; // il nome del campo e' uguale al nome del parametro => "this." e' obbligatorio
        this.cognomeAutore = cognomeAutore; // il nome del campo e' uguale al nome del parametro => "this." e'
                                            // obbligatorio
    }
}

public class BibliotecaTest {

    private static void stampaLibro(Libro libro) {
        System.out.println("Libro:");
        System.out.println("Titolo: " + libro.titolo);
        System.out.println("Autore: " + libro.nomeAutore + " " + libro.cognomeAutore);
        System.out.println("Nr. pagine: " + libro.numeroPagine);
    }

    public static void main(String[] args) {
        // Creazione di un oggetto di tipo Libro
        Libro libro1 = new Libro("Viaggio intorno al mondo", "Pippo", "Pluto", 2);
        stampaLibro(libro1);
        System.out.println();

        libro1.titolo = "Topolino"; // modifico il valore del campo "titolo" dell'oggetto "libro1"
        stampaLibro(libro1);
        System.out.println();

        Libro libro2 = new Libro("Bla bla", "Rossi", "Mario");// il numero di pagine non viene specificato in questo
                                                              // costruttore => il campo "numeroPagine" del nuovo libro
                                                              // ha come valore 0 (valore di default)
        stampaLibro(libro2);
    }
}
