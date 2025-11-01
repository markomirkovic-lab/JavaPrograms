import java.util.Arrays;

class ISBN {
    int[] codice = new int[5];

    ISBN(int[] codice) {
        this.codice = codice;
    }
}

class Autore {
    String nome;
    String cognome;
    
    Autore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
}

class Libro {
    ISBN isbn;
    Autore autore;
    String titolo;
    int numeroPagine = -1;
    
    Libro(ISBN isbn, Autore autore, String titolo, int numeroPagine) {
        this.isbn = isbn;
        this.autore = autore;
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
    }

    Libro(ISBN isbn) {
        this.isbn = isbn;
    }

    Libro() {

    }
}

public class Libreria {
    private static void mostraLibro(Libro libro) {
        
        System.out.println(libro.titolo + ", " + libro.autore.nome + " " + libro.autore.cognome);
        System.out.println("ISBN: " + Arrays.toString(libro.isbn.codice));
        System.out.println(libro.numeroPagine + " pagine");
    } 

    
    // private static Libro creaNuovoLibro() {
    //     Libro nuovoLibro = new Libro(null);
    //     ISBN nuovoIsbn = new ISBN(null);

    //     return nuovoLibro;
    // }
    
    public static void main(String[] args) {
        ISBN isbn = new ISBN(new int[] {971, 881, 137, 96, 76});
        Autore autore = new Autore("Alexandre", "Dumas");
        Libro libro = new Libro(isbn, autore, "Il conte di Montecristo", 1538);
        mostraLibro(libro);

        // Libro[] libri = new Libro[100];
        // Libro libro2 = creaNuovoLibro();
        // mostraLibro(libro2);

        /*
        Il conte di Montecristo, Alexandre Dumas
        ISBN: [971, 881, 137, 96, 76]
        1538 pagine
        */
    }
}
