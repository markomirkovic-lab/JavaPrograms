// classe fuori dalla classa principale
// si e' vincolati all'interno del file

import javax.sql.RowSetListener;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

class Libro {
    // campi della classe
    // concetto di libro per java come sever a noi
    // tipo di dato usato per gestire e nome;
    String titolo;
    String nomeAutore;
    String cognomeAutore;
    int numeroPagine;
    // lo stato del libro e dato dai valori (titolo, nomeAutore, etc.)

    // definizione di un nuovo di tipo di dato = classe
    // classe e' il progetto(*)

    // Costrutore va fatto dentro la classe dopo i campi
    // costruisce il libro (L'OGGETTO) e assegna i campi
    // specie di sotto-programma particolare che costruisce oggetti
    // NomeClasse(argomenti,...) {}
    // Ordine conta (i parametri si passano nell'ordine definito sopra)
    Libro(String titolo, String nomeAutore, String cognomeAutore, int nrPagine) {//int numeroPagine*

    /**

        // specificare quali sono i valori che assegno ai campi
        // settare i valori dei campi

        // il titolo di questo oggetti gli assegni il valore del campo titolo
        // stesso nome dei campi delle classi si usa per convenzione
        // this.nomeCampo ci si riferisce al campo
        //            // ci si rifersice al valore del parametro
        this.titolo = titolo;
        this.nomeAutore = nomeAutore;
        this.cognomeAutore = cognomeAutore;
        // *
        // this.numeroPagine = numeroPagine;//si puo' usare un diverso parametro es. nrPagine
        // this.numeroPagine = nrPagine;
        // imparare a controllare i parametri piu' evidenti
        /*
        if(nrPagine <= 0) {
            numeroPagine = 10;// assegnazione valore di default
        } else {
            numeroPagine = nrPagine;
        }
        */
        numeroPagine = nrPagine < 0 ? 10 : nrPagine;
        

        // se il campo e il parametro del costrutore si puo' omettere "this."
        // se il nome del campo e' uguale al nome parametro non si puo' omettere "this"

        // METTERE SEMPRE IL THIS
    }


    // Si possono definire piu' costruttori con meno parametri
    Libro(String titolo, String nomeAutore, String cognomeAutore){
        this.titolo = titolo;
        this.nomeAutore = nomeAutore;
        this.cognomeAutore =cognomeAutore;
    }

    // **
    // al intero di un costrutture si puo' richiamare un altro costruttore
    // Libro(String titolo, String nomeAutore, String cognomeAutore, int nrPagine){
    //     //this sa che deve cercare un altro costrure con lo stesso tipo e numero di parametri
    //     this(titolo, nomeAutore, cognomeAutore);
    //     numeroPagine = nrPagine < 0 ? 10: nrPagine;
    // }


}


public class BibliotecaTest0 {

    private static void stampaLibro(Libro libro) {
        System.out.println("Libro: ");
        System.out.println("Titolo: " + libro.titolo);
        System.out.println("Autore: " + libro.nomeAutore + " " + libro.cognomeAutore);
        System.err.println("Pagine: " + libro.numeroPagine);
    }


    public static void main(String[] args) {
        
        // variable di tipo libro inizializzata ad un nuovo libro
        // creazione oggetto con il new NomeClasse()
        //Libro libro1 = new Libro();// avendo definito il costrure ora questo non funziona

        // informazioni da dare al libro1
        // settare i valori ai vari cammpi del libro: nomeVariable.nomeCampo = tipoDiVariabile
        /*
        libro1.titolo = "Viaggio intorno al mondo";
        libro1.cognomeAutore = "Pippo";
        libro1.nomeAutore = "Pluto";
        libro1.numeroPagine = 2;
        */

        Libro libro1 = new Libro("Viaggio intorno al mondo", "Pippo", "Pluto", 2);

        // e' importante che i parametri dei campi sono sensati
        // i valori ai campi sensati = stato consistente
        // controllare i valori dei parametri nel costruttore (es. numero di pagine = -7 e' inconsistente)

        // nuova istanza = oggetto di classe libro
        // informazioni libro2
        // * oggeto e' l'istanza completa
        /*
        Libro libro2 = new Libro();
        libro2.titolo = "Bla";
        libro2.cognomeAutore = "Rossi";
        libro2.nomeAutore = "Mario";
        libro2.numeroPagine = 10;
        */
        
        Libro libro2 = new Libro("Bla", "Rossi", "Mario", 10);

        // se non si assegna nessun valore al campo di un oggetto
        // l'oggetto avra' il valore di default del tipo di dato
        // esempio int sara' 0, String sara' null, boolean sara' false

        System.out.println("Libro: ");
        System.out.println("Titolo: " + libro1.titolo);
        System.out.println("Autore: " + libro1.nomeAutore + " " + libro1.cognomeAutore);
        System.err.println("Pagine: " + libro1.numeroPagine);

        System.out.println("");

        // per stampare usare un sotto-programma
        stampaLibro(libro1);
        stampaLibro(libro2);

    }
   
}
