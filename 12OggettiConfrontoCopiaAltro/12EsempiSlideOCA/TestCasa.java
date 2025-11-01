
class Casa {
    int annoCostruzione;
    double nrLocali;
    double superficie;
    String tipo;

    Casa(int annoCostruzione, double nrLocali, double superficie) {
    this.annoCostruzione = annoCostruzione;
    this.nrLocali = nrLocali;
    this.superficie = superficie;
    }

    Casa(int annoCostruzione, double nrLocali, double superficie, String tipo) {
        this(annoCostruzione, nrLocali, superficie);
        this.tipo = tipo;
    }

    

    void stampa() {
        System.out.println("Anno di costruzione: " + annoCostruzione);
        System.out.println("Numero locali: " + nrLocali);
        System.out.println("Superficie: " + superficie + " metri quadri");
        System.out.println("Tipo: " + tipo);
    }
}

public class TestCasa {

    public static void main(String[] args) {

        Casa villa = null;

        villa = new Casa(2015, 12.5, 350);

        //villa = null;

        villa.stampa();

        System.out.println("\n\n\n");

        villa = new Casa(2015, 12.5, 350, "villa");

        villa.stampa();
      

    }
    
}
