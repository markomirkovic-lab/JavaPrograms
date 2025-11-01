
class Persona {
    String nome;
    String cognome;

    Persona(String nome, String cognomeL) {
        this.nome = nome; 
        this.cognome = cognomeL; 
    }
}


class Libro {

    String titolo;
    Persona autore;
    int numeroPagine; 


    Libro(String titolo, Persona autore, int nrPagine) {
        this(titolo, autore);


        numeroPagine = nrPagine < 0 ? 10 : nrPagine; 
    }

  
    Libro(String titolo, Persona autore) {
        this.titolo = titolo;
        if (autore == null) { 
            autore = new Persona("Nome autore sconosciuto", "Cognome autore sconosciuto");
        }
        this.autore = autore;
    }
}

class Biblioteca {
    Persona responsabile;
    Libro[] libri = new Libro[10];

    Biblioteca(Persona responsabile) {

        if (responsabile == null) { 
            responsabile = new Persona("Nome responsabile sconosciuto", "Cognome responsabile sconosciuto");
        }
        this.responsabile = responsabile;
    }

    Biblioteca(Persona responsabile, int nrLibri) {
        this(responsabile);


        if (nrLibri > 0) {
            this.libri = new Libro[nrLibri];
        }
    }
}

public class BibliotecaTestV2bis {

    private static void stampaPersona(Persona persona) {
        System.out.println("Nome: " + persona.nome);
        System.out.println("Cognome: " + persona.cognome);
    }

    private static void stampaLibro(Libro libro) {
        System.out.println("Libro:");
        System.out.println("Titolo: " + libro.titolo);
        System.out.println("Autore:");
        stampaPersona(libro.autore); 
        System.out.println("Nr. pagine: " + libro.numeroPagine);
    }

    private static void stampaBiblioteca(Biblioteca biblioteca) {
        System.out.println("Biblioteca:");
        System.out.println("\nResponsabile:");
        stampaPersona(biblioteca.responsabile);
        for (int i = 0; i < biblioteca.libri.length; i++) {
            Libro libroCorrente = biblioteca.libri[i];
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

        libro1.titolo = "Topolino"; 
        stampaLibro(libro1);
        System.out.println();

        Persona autore2 = new Persona("Rossi", "Mario");
        Libro libro2 = new Libro("Bla bla", autore2);
        stampaLibro(libro2);

        System.out.println("\n\n\n");

        Biblioteca biblioteca = new Biblioteca(new Persona("Luca", "Verdi"), 5);
  
        biblioteca.libri[0] = libro1;
        biblioteca.libri[1] = libro2;
   

        stampaBiblioteca(biblioteca);
    }
}
