class Persona {
    String nome;
    String cognome;
    int eta;//campo aggiunto

    Persona(String nome, String cognomeL, int eta) {
        this.nome = nome; 
        this.cognome = cognomeL; 
        this.eta = eta;
    }

    void stampa() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Eta: " + eta);
    }

    Persona deepCopia() {
        String copiaNome = this.nome == null ? null : new String (this.nome);
        Persona copiaCognome = this.cognome == null ? null : new String (this.cognome);

        return new Persona(copiaNome, copiaCognome, this.eta);
    }

    //      equals
    boolean confronta(Persona quello) {
        // controlla se il puntatore es. libro1 punta alla locazione memoria libro22
        if(this == quello) {
            return true;
        }
        // se libro22 == null, i due libri sono siccuramente diversi essendo il libro1 diverso da null
        // altrimenti null pointer exception se e' nullo
        if (quello == null){
            return false;
        }

        // Confronto tutti i campi, campo per campo
        if(autore == null) {
            if(quello.autore != null) {//controllo che in entrambi autore non sia null
                return false;
            }   
        } else if(!autore.confronta(quello.autore)) {// se i campi contengono diversi dati nel campo autore
            return false;
        }

        //or

        // if(autore == null && quello.autore != null) {
  
        //         return false;
        //     }   
        // } else if(!autore.confronta(quello.autore)) {// se i campi contengono diversi dati nel campo autore
        //     return false;
        // }


    }
}


class Libro {
    // I campi (o attributi) descrivono le caratteristiche di un libro
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

    Libro shallowCopia() {
        return new Libro(
            // puntano alla stessa memoria
            this.titolo,
            this.autore,
            this.numeroPagine
            );
    }

    // copia galvanicamente separata
    // crea i valori separati di tutti gli oggetti
    Libro deepCopia() {
        // no. di pagine essendo primitivo non devo copiare
        // titolo e autore devo copiare
        String copiaTitolo = this.titolo == null ? null : new String (this.titolo);
        Persona copiaAutore = this.autore == null ? null : this.autore.deepCopia();

        return new Libro(copiaTitolo, copiaAutore, this.numeroPagine);
    }
}


class Biblioteca {
    Persona responsabile;
    Libro[] libri = new Libro[10]; 


    int contatoreLibri;

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

    void stampa() {
        System.out.println("Biblioteca:");
        System.out.println("\nResponsabile:");


        responsabile.stampa();
        for (int i = 0; i < libri.length; i++) {
            Libro libroCorrente = libri[i];

            if (libroCorrente != null) {
                System.out.println();

                libroCorrente.stampa();
            }
        }
    }


    boolean aggiungiLibro(Libro libro) {

        if (libro == null || contatoreLibri == libri.length) {
            return false;
        }


        libri[contatoreLibri] = libro;
        contatoreLibri++;
        return true;
    }


    boolean aggiungiLibro(Libro[] nuoviLibri) {
        for (int i = 0; i < nuoviLibri.length; i++) {
            Libro libro = nuoviLibri[i];

            if (!aggiungiLibro(libro)) { 
                return false; 
            }
        }
        return true;
    }
}

public class BibliotecaTestV4bis {


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

        // copia del riferimento
        Libro libro99 = libro1;// stesso discorso degli array, ho definito una variable libro99 che
                               // referenzia in memoria libro1 (copia del riferimento o del puntatore)

        // shallow copy (se non creo nuovo autore, usera' l'autore precedente di libro1)
        Libro libro22 = libro1.shallowCopia();

        if(libro1 == libro22) {
            // punta alla locazione di memoria (puntatori) per la verifica
        }

        // 


        Persona autore2 = new Persona("Rossi", "Mario");
        Libro libro2 = new Libro("Bla bla", autore2);
        libro2.stampa();

        System.out.println("\n\n\n");

        Biblioteca biblioteca = new Biblioteca(new Persona("Luca", "Verdi", 0), 5);
    
        aggiungiLibro(biblioteca, libro1);
        aggiungiLibro(biblioteca, libro2);

        Libro[] libri = {
                new Libro("Titolo 3", new Persona("Nome 3", "Cognome 3")),
                new Libro("Titolo 4", new Persona("Nome 4", "Cognome 4"), 12)
        };

        if (biblioteca.aggiungiLibro(libri)) { 
            System.out.println("Tutti i libri sono stati aggiunti");
        } else {
            System.out.println("Qualcosa e' andato storto nell'aggiunta dei libri nell'array");
        }

        System.out.println("\n\n\n");

        biblioteca.stampa();
    }
}