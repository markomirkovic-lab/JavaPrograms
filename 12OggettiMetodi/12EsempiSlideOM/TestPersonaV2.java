class PersonaV2 {
    String nome;
    String cognome;
    int eta;
    double numeroScarpe;

    PersonaV2(String nome, String cognome, int eta, double numeroScarpe) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.numeroScarpe = numeroScarpe;
    }

    void mostraPersona() {
        System.out.println(nome + " " + cognome + ", " + eta + " anni, " + numeroScarpe);
    }
}

public class TestPersonaV2 {
    public static void main(String[] args) {
        PersonaV2 persona1 = new PersonaV2("Mario", "Rossi", 25, 42.5);
        PersonaV2 persona2 = new PersonaV2("Francesco", "Verdi", 68, 40.5);

        persona1.mostraPersona();
        persona2.mostraPersona();
    }
}
