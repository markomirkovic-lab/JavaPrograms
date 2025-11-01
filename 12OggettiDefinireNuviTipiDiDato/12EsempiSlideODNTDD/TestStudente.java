import java.util.Arrays;

class Studente {
    String nome;
    double[] tests = new double[3];

    Studente(String nome) {
        this.nome = nome;
    }

    Studente(String nome, double notaTest1) {
        this(nome);//this.nome = nome;
        tests[0] = notaTest1;
    }

    Studente(String nome, double[] tests) {
        this(nome, tests[0]);
        this.tests[1] = tests[1];
        this.tests[2] = tests[2];
    }
}

public class TestStudente {

        private static void mostraStudente(Studente studente) {
            System.out.println(studente.nome + ", " + Arrays.toString(studente.tests) + ", "
                + mediaNote(studente.tests) );
        }

        private static double mediaNote(double[] array) {

            double sum = 0;

            for( double value : array) {
                sum += value;
            }

            return (double) sum/array.length;
        }
    
    

    public static void main(String[] args) {
        Studente studente1 = new Studente("Luca");
        Studente studente2 = new Studente("Maria", 6.0);
        double[] noteTests = {4.0, 3.5, 4.5};
        Studente studente3 = new Studente("Gennaro", noteTests);

        // Default constructor does not exist!!
        // Studente studente4 = new Studente();

        // ...

        mostraStudente(studente1);
        System.out.println();
        mostraStudente(studente2);
        System.out.println();
        mostraStudente(studente3);

        /*
        Luca, [0.0, 0.0, 0.0], 0.0

        Maria, [6.0, 0.0, 0.0], 2.0

        Gennaro, [4.0, 3.5, 4.5], 4.0
        */

    }
}
