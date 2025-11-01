class PersonaV1 {
    String nome;
    String cognome;
    int eta;
    double numeroScarpe;

    PersonaV1(String nome, String cognome, int eta, double numeroScarpe) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.numeroScarpe = numeroScarpe;
    }
}

public class TestPersonaV1 {
    private static void mostraPersona(PersonaV1 persona) {
        System.out
                .println(persona.nome + " " + persona.cognome + ", " + persona.eta + " anni, " + persona.numeroScarpe);
    }

    public static void main(String[] args) {
        PersonaV1 persona1 = new PersonaV1("Mario", "Rossi", 25, 42.5);
        PersonaV1 persona2 = new PersonaV1("Francesco", "Verdi", 68, 40.5);

        mostraPersona(persona1);
        mostraPersona(persona2);
    }
}
