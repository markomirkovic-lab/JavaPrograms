/*
 In classe vi ho suggerito di modificare l'esempio BibliotecaTestV4.java per:

    introdurre la copia deep ed il confronto per la classe Biblioteca
    aggiungere un campo di tipo enum alla classe Libro per gestire il tipo di 
    copertina e adattare di conseguenza il resto del codice.

Trovo che questa sia un'ottima attività per rivedere bene l'esempio sviluppato 
a fasi durante le ultime lezioni in classe. Il risultato finale è un ottimo esempio 
che comprende il 90% di quello che c'è da sapere su classi ed oggetti. Vi ho quindi 
caricato BibliotecaTestV5.java che, oltre a quanto sviluppato in classe nella versione 4, 
comprende i punti sopra.
*/


// Enum per rappresentare i tipi di copertina
enum Copertina {
    FLESSIBILE, RIGIDA, NONE;
}

// La classe Persona rappresenta una persona con nome, cognome e eta'
class Persona {
    String nome;
    String cognome;
    int eta;

    Persona(String nome, String cognomeL, int eta) {
        this.nome = nome; // il nome del campo e' uguale al nome del parametro => "this." obbligatorio
        this.cognome = cognomeL; // il nome del campo e' diverso dal nome del parametro => "this." opzionale
        this.eta = eta > 0 ? eta : 99;
    }

    void stampa() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Eta: " + eta);
    }

    Persona deepCopia() {
        String copiaNome = this.nome == null ? null : new String(this.nome);
        String copiaCognome = this.cognome == null ? null : new String(this.cognome);
        return new Persona(copiaNome, copiaCognome, this.eta);
    }

    boolean confronta(Persona quello) {
        if (this == quello)
            // Referenza allo stesso oggetto. Se due riferimenti puntano allo stesso oggetto
            // non serve controllare i singoli campi
            return true;
        if (quello == null)
            return false;

        // Confronta il contenuto degli oggetti
        if (nome == null) {
            if (quello.nome != null)
                return false;
        } else if (!nome.equals(quello.nome))
            return false;
        if (cognome == null) {
            if (quello.cognome != null)
                return false;
        } else if (!cognome.equals(quello.cognome))
            return false;
        return this.eta == quello.eta;
    }
}

// Una classe rappresenta il "progetto" di un oggetto.
// In questo caso, la classe Libro definisce come è fatto un libro.
class Libro {
    // I campi (o attributi) descrivono le caratteristiche di un libro
    String titolo;
    Persona autore;
    int numeroPagine; // se non viene assegnato esplicitamente un valore diverso, il campo avrà il
                      // valore di default: 0
    Copertina copertina;

    // Il costruttore è un "metodo speciale" che serve per creare nuovi libri.
    // Questo costruttore accetta tutti e tre i dati del libro
    Libro(String titolo, Persona autore, int nrPagine, Copertina copertina) {
        this(titolo, autore); // richiamo il costruttore di Libro con i due parametri

        // prima di assegnare il valore, mi devo assicurare che il valore che voglio
        // assegnare sia sensato
        numeroPagine = nrPagine < 0 ? 10 : nrPagine; // il nome del campo e' diverso dal nome del parametro => "this."
                                                     // è opzionale
        this.copertina = copertina != null ? copertina : Copertina.NONE;
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
            autore = new Persona("Nome autore sconosciuto", "Cognome autore sconosciuto", 27);
        }
        this.autore = autore;
        this.copertina = Copertina.NONE;
    }

    void stampa() {
        System.out.println("Libro:");
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore:");
        autore.stampa(); // richiamo la stampa dell'oggetto di tipo Persona
        System.out.println("Nr. pagine: " + numeroPagine);
        System.out.println("Tipo di copertina: " + copertina);
    }

    Libro shallowCopia() {
        // Copia superficiale: il riferimento all'autore viene condiviso
        // tra l'oggetto originale e la copia
        return new Libro(
                this.titolo,
                this.autore, // stesso riferimento all'oggetto Persona
                this.numeroPagine,
                this.copertina);
    }

    Libro deepCopia() {
        String copiaTitolo = this.titolo == null ? null : new String(this.titolo); // `new String` non è strettamente
                                                                                   // necessario
                                                                                   // perché gli oggetti di tipo String
                                                                                   // sono immutable.
        Persona copiaAutore = this.autore == null ? null : this.autore.deepCopia(); // richiamo la copia deep
                                                                                    // dell'oggetto di tipo Persona

        return new Libro(copiaTitolo, copiaAutore, this.numeroPagine, this.copertina);
    }

    boolean confronta(Libro quello) {
        if (this == quello)
            // Referenza allo stesso oggetto
            return true;
        if (quello == null)
            return false;

        // Confronta il contenuto degli oggetti
        if (autore == null) {
            if (quello.autore != null)
                return false;
        } else if (!autore.confronta(quello.autore)) // richiamo il confronto dell'oggetto di tipo Persona
            return false;

        if (titolo == null) {
            if (quello.titolo != null)
                return false;
        } else if (!titolo.equals(quello.titolo))
            return false;

        if (copertina != quello.copertina)
            return false;

        return numeroPagine == quello.numeroPagine;
    }
}

class Biblioteca {
    Persona responsabile;
    Libro[] libri = new Libro[10]; // inizializzo l'array durante la dichiarazione del campo
    // Inizialmente, tutte le celle dell'array contengono null

    // Il contatore tiene traccia del numero di libri attualmente presenti nella
    // biblioteca.
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
            responsabile = new Persona("Nome responsabile sconosciuto", "Cognome responsabile sconosciuto", 58);
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

    Biblioteca deepCopia() {
        Persona responsabileCopia = this.responsabile == null ? null : this.responsabile.deepCopia();
        Biblioteca copiaBiblioteca = new Biblioteca(responsabileCopia, libri.length);
        // Si effettua la copia deep di ogni libro, sfruttando l'apposito metodo e li si
        // aggiunge alla biblioteca
        for (int i = 0; i < contatoreLibri; i++) {
            copiaBiblioteca.aggiungiLibro(libri[i].deepCopia());
        }
        return copiaBiblioteca;
    }

    boolean confronta(Biblioteca quello) {
        if (this == quello) {
            return true;
        }

        if (quello == null) {
            return false;
        }

        // Confronta il contenuto degli oggetti
        if (responsabile == null) {
            if (quello.responsabile != null)
                return false;
        } else if (!responsabile.confronta(quello.responsabile))
            return false;

        if (contatoreLibri != quello.contatoreLibri) {
            return false;
        }

        if (libri == null) {
            if (quello.libri != null) {
                return false;
            }
        } else {
            if (quello.libri == null) {
                return false;
            }
            if (libri.length != quello.libri.length) {
                return false;
            }

            // Si confrontano tutti i libri uno per uno, sfruttando l'apposito metodo
            for (int i = 0; i < libri.length; i++) {
                if (libri[i] == null) {
                    if (quello.libri[i] != null) {
                        return false;
                    }
                } else if (!libri[i].confronta(quello.libri[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}

public class BibliotecaTestV5 {

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

        Persona autore1 = new Persona("Pippo", "Pluto", 99);
        Libro libro1 = new Libro("Viaggio intorno al mondo", autore1, 2, Copertina.FLESSIBILE);
        libro1.stampa();
        System.out.println();

        Persona autore2 = new Persona("Rossi", "Mario", 52);
        Libro libro2 = new Libro("Bla bla", autore2); // il numero di pagine non viene specificato in questo
                                                      // costruttore => il campo "numeroPagine" del nuovo libro
                                                      // ha come valore 0 (valore di default)
        libro2.stampa();
        System.out.println();

        Libro libro3 = new Libro("Titolo 3", new Persona("Nome 3", "Nome 3", 21), 5, Copertina.RIGIDA);
        libro3.stampa();
        System.out.println();

        // Dimostriamo la differenza tra copia del riferimento, shallow e deep copy
        System.out.println("--- Test delle copie ---");

        // Libro 1
        Libro riferimentoLibro1 = libro1; // copia del riferimento - modifica uno, modifica entrambi
        Libro shallowLibro1 = libro1.shallowCopia(); // copia superficiale - l'autore è condiviso
        Libro deepLibro1 = libro1.deepCopia(); // copia profonda - tutto è indipendente

        // Libro 2
        Libro riferimentoLibro2 = libro2;
        Libro shallowLibro2 = libro2.shallowCopia();
        Libro deepLibro2 = libro2.deepCopia();

        // Libro 3
        Libro riferimentoLibro3 = libro3;
        Libro shallowLibro3 = libro3.shallowCopia();
        Libro deepLibro3 = libro3.deepCopia();

        // Facciamo delle modifiche attraverso la copia del riferimento
        riferimentoLibro1.autore.cognome = "COGNOME MODIFICATO";
        riferimentoLibro1.titolo = "TITOLO MODIFICATO";
        riferimentoLibro1.numeroPagine = 123456;
        System.out.println("Dopo la modifica attraverso la copia del riferimento:");
        System.out.println("\nOriginale:");
        libro1.stampa();
        System.out.println("\nCopia del riferimento:");
        riferimentoLibro1.stampa();
        System.out.println("\nShallow copy:");
        shallowLibro1.stampa();
        System.out.println("\nDeep copy:");
        deepLibro1.stampa();
        System.out.println("\n");

        // Facciamo delle modifiche attraverso la copia superficiale
        shallowLibro2.autore.cognome = "COGNOME MODIFICATO";
        shallowLibro2.titolo = "TITOLO MODIFICATO";
        shallowLibro2.numeroPagine = 123456;
        System.out.println("Dopo la modifica attraverso la copia superficiale:");
        System.out.println("\nOriginale:");
        libro2.stampa();
        System.out.println("\nCopia del riferimento:");
        riferimentoLibro2.stampa();
        System.out.println("\nShallow copy:");
        shallowLibro2.stampa();
        System.out.println("\nDeep copy:");
        deepLibro2.stampa();
        System.out.println("\n");

        // Facciamo delle modifiche attraverso la copia profonda
        deepLibro3.autore.cognome = "COGNOME MODIFICATO";
        deepLibro3.titolo = "TITOLO MODIFICATO";
        deepLibro3.numeroPagine = 123456;
        System.out.println("Dopo la modifica attraverso la copia profonda:");
        System.out.println("\nOriginale:");
        libro3.stampa();
        System.out.println("\nCopia del riferimento:");
        riferimentoLibro3.stampa();
        System.out.println("\nShallow copy:");
        shallowLibro3.stampa();
        System.out.println("\nDeep copy:");
        deepLibro3.stampa();
        System.out.println("\n");

        // Confronto fra libri
        if (libro1.confronta(riferimentoLibro1)) {
            System.out.println("I libri sono uguali");
        } else {
            System.out.println("I libri NON sono uguali");
        }

        if (libro2.confronta(deepLibro2)) {
            System.out.println("I libri sono uguali");
        } else {
            System.out.println("I libri NON sono uguali");
        }

        if (libro3.confronta(shallowLibro3)) {
            System.out.println("I libri sono uguali");
        } else {
            System.out.println("I libri NON sono uguali");
        }
        System.out.println("\n\n\n");

        Biblioteca biblioteca = new Biblioteca(new Persona("Luca", "Verdi", 22), 7);
        // Sfrutto il metodo 'aggiungiLibro' di 'Biblioteca' per aggiungere alcuni libri
        aggiungiLibro(biblioteca, libro1);
        aggiungiLibro(biblioteca, libro2);

        Libro[] libri = {
                new Libro("Titolo 4", new Persona("Nome 4", "Cognome 4", 23)),
                new Libro("Titolo 5", new Persona("Nome 5", "Cognome 5", 44), 12, Copertina.RIGIDA)
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

        System.out.println("\n");

        Biblioteca biblioteca2 = biblioteca.deepCopia();
        if (biblioteca2.confronta(biblioteca)) {
            System.out.println("Le biblioteche sono uguali");
        } else {
            System.out.println("Le biblioteche NON sono uguali");
        }
    }
}