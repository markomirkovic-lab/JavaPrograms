/**
 * Classe che rappresenta l'autore
 */
class Autore {
    static final String NOME_SCONOSCIUTO = "Nome sconosciuto";
    static final String COGNOME_SCONOSCIUTO = "Cognome sconosciuto";

    String nome;
    String cognome;

    /**
     * Costruttore senza parametri che imposta nome e cognome con valori di default
     */
    Autore() {
        this.nome = NOME_SCONOSCIUTO;
        this.cognome = COGNOME_SCONOSCIUTO;
    }

    /**
     * Costruttore con parametri
     * 
     * @param nome    nome dell'autore
     * @param cognome cognome dell'autore
     */
    Autore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    /**
     * Metodo per mostrare a schermo l'autore
     */
    void mostra() {
        System.out.println("Autore: " + nome + " " + cognome);
    }

    /**
     * Metodo che confronta due autori
     * 
     * @param quello autore con cui effettuare il confronto
     * @return vero se i due autori sono considerati uguali, falso altrimenti
     */
    boolean confrontaAutore(Autore quello) {
        if (this == quello) {
            return true;
        }

        if (quello == null) {
            return false;
        }

        if (nome == null) {
            if (quello.nome != null) {
                return false;
            }
        } else if (!nome.equals(quello.nome)) {
            return false;
        }

        if (cognome == null) {
            if (quello.cognome != null) {
                return false;
            }
        } else if (!cognome.equals(quello.cognome)) {
            return false;
        }
        return true;
    }

    /**
     * Metodo che effettua una copia deep dell'autore
     * 
     * @return risultato della copia deep dell'autore
     */
    Autore deepCopiaAutore() {
        String copiaNome = nome == null ? null : new String(nome);
        String copiaCognome = cognome == null ? null : new String(cognome);
        return new Autore(copiaNome, copiaCognome);
    }
}

/**
 * Classe che rappresenta il libro
 */
class Libro {
    Autore autore;
    String titolo;
    int numeroDiPagine;

    /**
     * Costruttore
     * 
     * @param autore         autore del libro
     * @param titolo         titolo del libro
     * @param numeroDiPagine numero di pagine del libro
     */
    Libro(Autore autore, String titolo, int numeroDiPagine) {
        this.numeroDiPagine = numeroDiPagine <= 0 ? 10 + (int) (Math.random() * 91) : numeroDiPagine;
        this.titolo = titolo;
        this.autore = autore == null ? new Autore() : autore;
    }

    /**
     * Metodo per mostrare a schermo il libro
     */
    void mostra() {
        System.out.println("\nLibro");
        System.out.println(titolo);
        autore.mostra();
        System.out.println("Numero di pagine: " + numeroDiPagine);
    }

    /**
     * Metodo che confronta due libri
     * 
     * @param quello libro con cui effettuare il confronto
     * @return vero se i due libri sono considerati uguali, falso altrimenti
     */
    boolean confrontaLibro(Libro quello) {
        if (this == quello) {
            return true;
        }

        if (quello == null) {
            return false;
        }

        if (autore == null) {
            if (quello.autore != null) {
                return false;
            }
        } else if (!autore.confrontaAutore(quello.autore)) {
            // Per confrontare l'autore si sfrutta l'apposito metodo
            return false;
        }

        if (titolo == null) {
            if (quello.titolo != null) {
                return false;
            }
        } else if (!titolo.equals(quello.titolo)) {
            return false;
        }
        return numeroDiPagine == quello.numeroDiPagine;
    }

    /**
     * Metodo che effettua una copia deep del libro
     * 
     * @return risultato della copia deep del libro
     */
    Libro deepCopiaLibro() {
        // Per la copia profonda dell'autore si usa l'apposito metodo
        Autore copiaAutore = autore.deepCopiaAutore();
        String copiaTitolo = titolo == null ? null : new String(titolo);
        return new Libro(copiaAutore, copiaTitolo, numeroDiPagine);
    }
}

/**
 * Classe che rappresenta la collezione di alcune utilities per lavorare con un
 * array
 */
class ArrayUtilities {
    Libro[] libri;
    // Numero di libri presenti nell'array
    int nrLibri;

    /**
     * Costruttore
     * 
     * @param capienza capienza iniziale dell'array
     */
    ArrayUtilities(int capienza) {
        libri = new Libro[capienza <= 0 ? 1 + (int) (Math.random() * 10) : capienza];
    }

    /**
     * Metodo per verificare se l'array e' vuoto
     * 
     * @return vero se l'array e' vuoto, falso altrimenti
     */
    boolean isEmpty() {
        return nrLibri == 0;
    }

    /**
     * Metodo per aggiungere in coda
     * 
     * @param libro libro da aggiungere
     * @return vero se e' stato possibile aggiungere il libro, falso altrimenti
     */
    boolean aggiungiInCoda(Libro libro) {
        if (libro == null || nrLibri == libri.length) {
            return false;
        }
        // Si sfrutta il post-incremento (prima viene usato il valore, poi viene
        // incrementato)
        libri[nrLibri++] = libro;
        return true;
    }

    /**
     * Metodo per aggiungere in coda. Se non vi e' piu' spazio viene creato un nuovo
     * array (lungo il doppio) all'interno del quale vengono copiati tutti i
     * libri che erano gia' stati inseriti in precedenza.
     * 
     * @param libro libro da aggiungere
     */
    void aggiungiInCodaIngrandendoSeNecessario(Libro libro) {
        if (libro == null) {
            return;
        }

        if (nrLibri == libri.length) {
            // Crea un array più grande poiche' quello usato attualmente e' pieno
            Libro[] tmp = new Libro[libri.length * 2];
            System.arraycopy(libri, 0, tmp, 0, libri.length);
            libri = tmp;
        }

        aggiungiInCoda(libro);
    }

    /**
     * Metodo per aggiungere in testa
     * 
     * @param libro libro da aggiungere
     * @return vero se e' stato possibile aggiungere il libro, falso altrimenti
     */
    boolean aggiungiInTesta(Libro libro) {
        if (libro == null || nrLibri == libri.length) {
            return false;
        }

        // Spostamento di tutti i libri presenti nell'array in avanti di una cella
        for (int i = nrLibri - 1; i >= 0; i--) {
            libri[i + 1] = libri[i];
        }

        // Si inserisce il libro in testa
        libri[0] = libro;
        nrLibri++;
        return true;
    }

    /**
     * Metodo per rimuovere un libro dalla coda
     * 
     * @return libro rimosso
     */
    Libro rimuoviDallaCoda() {
        if (isEmpty()) {
            return null;
        }

        // Si sfrutta il pre-decremento (prima decrementato il valore, poi viene usato)
        Libro libroRimosso = libri[--nrLibri];
        // Si setta a null la cella che conteneva il libro che si vuole rimuovere
        libri[nrLibri] = null;
        return libroRimosso;
    }

    /**
     * Metodo per rimuovere un libro dalla testa
     * 
     * @return libro rimosso
     */
    Libro rimuoviDallaTesta() {
        if (isEmpty()) {
            return null;
        }

        Libro libroRimosso = libri[0];

        // Spostamento di tutti i libri presenti nell'array in dietro di una cella (per
        // non lasciare buchi)
        for (int i = 0; i + 1 < nrLibri; i++) {
            libri[i] = libri[i + 1];
        }

        // Si setta a null la cella che prima dello spostamento conteneva l'ultimo libro
        // e si decrementa il numero di libri presenti
        libri[--nrLibri] = null;
        return libroRimosso;
    }

    /**
     * Metodo per rimuovere un libro specificando l'indice del libro che si vuole
     * rimuovere.
     * 
     * @param indice indice del libro che si vuole rimuovere
     * @return libro rimosso
     */
    Libro rimuovi(int indice) {
        if (isEmpty() || indice < 0 || indice >= nrLibri) {
            return null;
        }

        if (indice == 0) {
            // Equivale a rimuovere dalla testa
            return rimuoviDallaTesta();
        }

        if (indice == nrLibri - 1) {
            // Equivale a rimuovere dalla coda
            return rimuoviDallaCoda();
        }

        Libro libroRimosso = libri[indice];
        // Spostamento in dietro di una cella dei libri presenti nell'array dopo quello
        // rimosso (per non lasciare buchi)
        for (int i = indice; i + 1 < nrLibri; i++) {
            libri[i] = libri[i + 1];
        }

        // Si setta a null la cella che prima dello spostamento conteneva l'ultimo libro
        // e si decrementa il numero di libri presenti
        libri[--nrLibri] = null;
        return libroRimosso;
    }

    /**
     * Metodo per mostrare a schermo l'array di libri
     */
    void mostra() {
        System.out.println("\n======");
        System.out.println("Libri:");
        System.out.println("======");
        for (int i = 0; i < nrLibri; i++) {
            libri[i].mostra(); // per mostrare il singolo libro si sfrutta l'apposito metodo
        }
        System.out.println("\n======");
        System.out.println("======");
    }

    /**
     * Metodo che confronta due oggetti di tipo ArrayUtilities
     * 
     * @param quello oggetto con cui effettuare il confronto
     * @return vero se i due oggetti sono considerati uguali, falso altrimenti
     */
    boolean confrontaArrayUtilities(ArrayUtilities quello) {
        if (this == quello) {
            return true;
        }

        if (quello == null) {
            return false;
        }

        if (nrLibri != quello.nrLibri) {
            return false;
        }

        if (libri == null) {
            if (quello.libri != null) {
                return false;
            }
        } else {
            // Si confrontano tutti i libri uno per uno, sfruttando l'apposito metodo
            for (int i = 0; i < nrLibri; i++) {
                if (!libri[i].confrontaLibro(quello.libri[i])) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Metodo che effettua una copia deep
     * 
     * @return risultato della copia deep
     */
    ArrayUtilities deepCopiaArrayUtilities() {
        ArrayUtilities copia = new ArrayUtilities(libri.length);
        // Si effettua la copia deep di ogni libro, sfruttando l'apposito metodo e li si
        // aggiunge al nuovo oggetto (copia)
        for (int i = 0; i < nrLibri; i++) {
            copia.aggiungiInCoda(libri[i].deepCopiaLibro());
        }

        return copia;
    }
}

/**
 * Classe di test con alcuni sottoprogrammi/funzioni implementati per praticita'
 * cosi' da facilitare i tests.
 */
public class ArrayUtilitiesTest {

    /**
     * Metodo che richiama il metodo per aggiungere in coda e stampa a schermo il
     * risultato dell'operazione
     * 
     * @param arrayUtilities oggetto a cui aggiungere il libro
     * @param libro          libro da aggiungere
     */
    private static void aggiungiInCoda(ArrayUtilities arrayUtilities, Libro libro) {
        System.out.println("\nAggiungo il libro " + (libro == null ? "" : libro.titolo + " ") + "in coda");
        if (arrayUtilities.aggiungiInCoda(libro)) {
            System.out.println(libro.titolo + " aggiunto in coda");
            return;
        }
        System.out.println("\nNON e' stato possibile aggiungere il libro in coda");

    }

    /**
     * Metodo che richiama il metodo per aggiungere in coda, ingrandendo l'array nel
     * caso non ci fosse spazio. Il metodo stampa a schermo alcune informazioni di
     * comodo.
     * 
     * @param arrayUtilities oggetto a cui aggiungere il libro
     * @param libro          libro da aggiungere
     */
    private static void aggiungiInCodaIngrandendoSeNecessario(ArrayUtilities arrayUtilities, Libro libro) {
        System.out.println("\nAggiungo il libro " + (libro == null ? "" : libro.titolo + " ") + "in coda");
        arrayUtilities.aggiungiInCodaIngrandendoSeNecessario(libro);
        System.out.println(libro.titolo + " aggiunto in coda");
    }

    /**
     * Metodo che richiama il metodo per aggiungere in testa e stampa a schermo il
     * risultato dell'operazione
     * 
     * @param arrayUtilities oggetto a cui aggiungere il libro
     * @param libro          libro da aggiungere
     */
    private static void aggiungiInTesta(ArrayUtilities arrayUtilities, Libro libro) {
        System.out.println("\nAggiungo il libro " + (libro == null ? "" : libro.titolo + " ") + "in testa");
        if (arrayUtilities.aggiungiInTesta(libro)) {
            System.out.println(libro.titolo + " aggiunto in testa");
            return;
        }
        System.out.println("\nNON e' stato possibile aggiungere il libro in testa");

    }

    /**
     * Metodo che richiama il metodo per rimuovere dalla coda e stampa a schermo le
     * informazioni del libro rimosso
     * 
     * @param arrayUtilities oggetto a cui rimuovere il libro
     */
    private static void rimuoviDallaCoda(ArrayUtilities arrayUtilities) {
        Libro libroRimosso = arrayUtilities.rimuoviDallaCoda();

        if (libroRimosso != null) {
            System.out.println("\nRimosso il libro " + libroRimosso.titolo + " dalla coda");
            return;
        }

        System.out.println("\nNON e' stato possibile rimuovere il libro dalla coda");
    }

    /**
     * Metodo che richiama il metodo per rimuovere dalla testa e stampa a schermo le
     * informazioni del libro rimosso
     * 
     * @param arrayUtilities oggetto a cui rimuovere il libro
     */
    private static void rimuoviDallaTesta(ArrayUtilities arrayUtilities) {
        Libro libroRimosso = arrayUtilities.rimuoviDallaTesta();

        if (libroRimosso != null) {
            System.out.println("\nRimosso il libro " + libroRimosso.titolo + " dalla testa");
            return;
        }

        System.out.println("\nNON e' stato possibile rimuovere il libro dalla testa");
    }

    /**
     * Metodo che rimuove il libro all'indice indicato e stampa a schermo le
     * informazioni del libro rimosso
     * 
     * @param arrayUtilities oggetto a cui rimuovere il libro
     * @param indice         indice del libro da rimuovere
     */
    private static void rimuovi(ArrayUtilities arrayUtilities, int indice) {
        Libro libroRimosso = arrayUtilities.rimuovi(indice);

        if (libroRimosso != null) {
            System.out.println("\nRimosso il libro " + libroRimosso.titolo + " dall'indice " + indice);
            return;
        }

        System.out.println("\nNON e' stato possibile rimuovere il libro dall'indice " + indice);
    }

    /**
     * Metodo che richiama il metodo per confrontare due oggetti di tipo
     * ArrayUtilities e stampa il risultato dell'operazione
     * 
     * @param arrayUtilities1 primo oggetto da confrontare
     * @param arrayUtilities2 secondo oggetto da confrontare
     */
    private static void confrontaArrayUtilities(ArrayUtilities arrayUtilities1, ArrayUtilities arrayUtilities2) {
        System.out.println("\nConfronto due oggetti di tipo ArrayUtilities");

        String message = "I due oggetti sono "
                + (arrayUtilities1.confrontaArrayUtilities(arrayUtilities2) ? "uguali." : "diversi.");
        System.out.println(message);
    }

    public static void main(String[] args) {
        Libro[] libri = {
                new Libro(new Autore("Nome Autore 1", "Cognome Autore 1"), "Titolo libro 1", 100),
                new Libro(new Autore("Nome Autore 2", "Cognome Autore 2"), "Titolo libro 2", 200),
                new Libro(new Autore("Nome Autore 3", "Cognome Autore 3"), "Titolo libro 3", 300),
                new Libro(new Autore("Nome Autore 4", "Cognome Autore 4"), "Titolo libro 4", 400),
                new Libro(new Autore("Nome Autore 5", "Cognome Autore 5"), "Titolo libro 5", 500),
                new Libro(new Autore("Nome Autore 6", "Cognome Autore 6"), "Titolo libro 6", 600),
                new Libro(new Autore("Nome Autore 7", "Cognome Autore 7"), "Titolo libro 7", 700),
                new Libro(new Autore("Nome Autore 8", "Cognome Autore 8"), "Titolo libro 8", 800),
                new Libro(new Autore("Nome Autore 9", "Cognome Autore 9"), "Titolo libro 9", 900),
                new Libro(new Autore("Nome Autore 10", "Cognome Autore 10"), "Titolo libro 10", 1000),
        };

        ArrayUtilities arrayUtilities1 = new ArrayUtilities(4);

        aggiungiInCoda(arrayUtilities1, libri[0]);
        aggiungiInCoda(arrayUtilities1, libri[1]);

        arrayUtilities1.mostra();
        aggiungiInCoda(arrayUtilities1, libri[2]);
        arrayUtilities1.mostra();

        rimuoviDallaCoda(arrayUtilities1);
        arrayUtilities1.mostra();

        aggiungiInTesta(arrayUtilities1, libri[2]);
        arrayUtilities1.mostra();

        rimuoviDallaTesta(arrayUtilities1);
        arrayUtilities1.mostra();

        aggiungiInCoda(arrayUtilities1, libri[2]);
        arrayUtilities1.mostra();
        rimuovi(arrayUtilities1, 1);
        arrayUtilities1.mostra();

        ArrayUtilities arrayUtilities2 = new ArrayUtilities(4);
        aggiungiInCodaIngrandendoSeNecessario(arrayUtilities2, libri[0]);
        aggiungiInCodaIngrandendoSeNecessario(arrayUtilities2, libri[1]);
        aggiungiInCodaIngrandendoSeNecessario(arrayUtilities2, libri[2]);
        aggiungiInCodaIngrandendoSeNecessario(arrayUtilities2, libri[3]);
        arrayUtilities2.mostra();

        aggiungiInCodaIngrandendoSeNecessario(arrayUtilities2, libri[4]);
        arrayUtilities2.mostra();

        confrontaArrayUtilities(arrayUtilities1, arrayUtilities2);

        System.out.println("\nCreo una copia deep di un oggetto di tipo ArrayUtilities");
        ArrayUtilities arrayUtilities3 = arrayUtilities2.deepCopiaArrayUtilities();
        System.out.println(
                "\nVerifico che i due oggetti contengano gli stessi libri, ossia libri i cui campi contengano gli stessi valori, nello stesso ordine");
        confrontaArrayUtilities(arrayUtilities3, arrayUtilities2);

        System.out.println(
                "\nVerifico che i due oggetti siano effettivamente una copia deep: modifico il nome dell'autore dell'ultimo libro nell'oggetto risultante dalla copia deep e confronto i due oggetti.");
        arrayUtilities3.libri[arrayUtilities3.nrLibri - 1].autore.nome = "NUOVO NOME";

        confrontaArrayUtilities(arrayUtilities3, arrayUtilities2);

        arrayUtilities3.mostra();
        arrayUtilities2.mostra();
    }
}