class Studente {
    String nome;
    double test1, test2, test3;

    Studente(String nome, double test1, double test2, double test3) {
        this.nome = nome;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    double calcolaMedia() {
        return (test1 + test2 + test3) / 3.;
    }

    void mostraRisultati() {
        System.out.println("Lo studente " + nome + " ha una media di " + calcolaMedia());
    }
}

public class TestStudente {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Luca", 4.5, 3.5, 5.0);
        Studente studente2 = new Studente("Maria", 6.0, 5.5, 4.5);
        Studente studente3 = new Studente("Gennaro", 4.0, 3.5, 4.5);

        studente1.mostraRisultati();
        studente2.mostraRisultati();
        studente3.mostraRisultati();
    }
}
