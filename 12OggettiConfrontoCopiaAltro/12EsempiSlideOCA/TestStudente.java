import java.util.Objects;

class Studente {
    String nome;
    int annoIscrizione;
    long nrMatricola;
    double mediaGenerale;

    Studente(String nome, double mediaGenerale) {
        this.nome = nome;
        this.mediaGenerale = mediaGenerale;
    }

    Studente(String nome, int annoIscrizione, long nrMatricola, double mediaGenerale) {
        this(nome, mediaGenerale);
        this.annoIscrizione = annoIscrizione;
        this.nrMatricola = nrMatricola;
    }

    // class NullCheckUtil {
    //     public static boolean isNull(Object obj) {
    //         return obj == null;
    //     }
    // }

    void stampa() {

        // if (NullCheckUtil.isNull(null)) {
        //     System.out.println("The object is null.");
        // } else {

            System.out.println("Nome: " + nome);
            System.out.println("Anno di iscrizine: " + annoIscrizione);
            System.out.println("Numero di matricola: " + nrMatricola);
            System.out.println("Media generale: " + mediaGenerale);
            System.out.println("\n");
       
        
    }


}



public class TestStudente {
    public static void main(String[] args) {
        Studente stud1, stud2, stud3, stud4 = null;

        stud1 = new Studente("Alberto", 2015, 98765, 2.5);
        stud2 = new Studente("Marta", 4.75);

        stud3 = stud2;



        stud1.stampa();
        stud2.stampa();
        stud3.stampa();
        //stud4.stampa();

    }
}
