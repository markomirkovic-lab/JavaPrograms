class Libro {
    String titolo;
    String autore;
    int anno;

    Libro(String titolo, String autore, int anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }

    void mostraLibro() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Anno: " + anno);
        System.out.println();
    }
}

public class TestLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("La divina commedia", "Dante Alighieri", 1321);

        libro1.mostraLibro();

        Libro libro2 = new Libro("Re Lear", "William Shakespeare", 1606);

        libro2.mostraLibro();
    }
}
