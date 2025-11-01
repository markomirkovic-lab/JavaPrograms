import java.util.Arrays;

class ISBN {
    int[] codice = new int[5];

    boolean confrontaISBN(ISBN quello) {
        if (this == quello)
            // Referenza allo stesso oggetto
            return true;
        if (quello == null)
            return false;
        // Confronta il contenuto degli oggetti
        return Arrays.equals(codice, quello.codice);
    }

    ISBN copiaISBN() {
        ISBN copia = new ISBN();
        if (this.codice != null) {
            for (int i = 0; i < this.codice.length; i++)
                copia.codice[i] = this.codice[i];
        }
        return copia;
    }

}

class Autore {
    String nome;
    String cognome;

    boolean confrontaAutore(Autore quello) {
        if (this == quello)
            // Referenza allo stesso oggetto
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
        return true;
    }

    Autore copiaAutore() {
        Autore copia = new Autore();
        copia.nome = this.nome == null ? null : new String(this.nome);
        copia.cognome = this.cognome == null ? null : new String(this.cognome);
        return copia;
    }
}

class Libro {
    ISBN isbn;
    Autore autore;
    String titolo;
    int numeroPagine = -1;

    boolean confrontaLibro(Libro quello) {
        if (this == quello)
            // Referenza allo stesso oggetto
            return true;
        if (quello == null)
            return false;
        // Confronta il contenuto degli oggetti
        if (isbn == null) {
            if (quello.isbn != null)
                return false;
        } else if (!isbn.confrontaISBN(quello.isbn))
            return false;

        if (autore == null) {
            if (quello.autore != null)
                return false;
        } else if (!autore.confrontaAutore(quello.autore))
            return false;

        if (titolo == null) {
            if (quello.titolo != null)
                return false;
        } else if (!titolo.equals(quello.titolo))
            return false;

        return numeroPagine == quello.numeroPagine;
    }

    Libro copiaLibro() {
        Libro copia = new Libro();
        copia.isbn = this.isbn == null ? null : this.isbn.copiaISBN();
        copia.autore = this.autore == null ? null : this.autore.copiaAutore();
        copia.titolo = this.titolo == null ? null : new String(this.titolo);
        copia.numeroPagine = this.numeroPagine;
        return copia;
    }
}

public class Libreria {
    private static Libro creaNuovoLibro() {
        Libro nuovoLibro = new Libro();
        ISBN nuovoIsbn = new ISBN();
        nuovoLibro.isbn = nuovoIsbn;
        nuovoLibro.autore = new Autore();
        return nuovoLibro;
    }

    public static void main(String[] args) {
        Libro[] libri = new Libro[100];
        Libro libro = creaNuovoLibro();
        libro.autore.nome = "Alexandre";
        libro.autore.cognome = "Dumas";
        libro.titolo = "Il conte di Montecristo";
        libro.isbn.codice[0] = 971;
        libro.isbn.codice[1] = 881;
        libro.isbn.codice[2] = 137;
        libro.isbn.codice[3] = 96;
        libro.isbn.codice[4] = 76;
        libro.numeroPagine = 1538;
        libri[0] = libro;
        // ...
        libri[1] = libro.copiaLibro();

        // ...
        System.out.println("I due libri sono uguali? " + libri[0].confrontaLibro(libri[1]));
        System.out.println("I due libri referenziano lo stesso oggetto? " + (libri[0] == libri[1]));
    }
}
