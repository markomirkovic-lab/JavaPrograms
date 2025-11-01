class Persona {
    String nome;
    String cognome;
    int eta;
    double numeroScarpe;

    // Costruttuore
    // Un costruttore è come un normale sottoprogramma, ma:
    // • non ha un tipo di ritorno (nemmeno void),
    // • il suo nome è identico a quello della classe dove è definito
    Persona(String nome, String cognome, int eta, double numeroScarpe) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.numeroScarpe = numeroScarpe;
    }
}

public class TestPersona {

    private static void mostraPersona(Persona persona) {
        System.out.println(persona.nome + " " + persona.cognome + ", " + persona.eta
                + " anni, " + persona.numeroScarpe);
    }

    public static void main(String[] args) {

                           //chiamata al costruttore
        Persona persona1 = new Persona("Mario", "Rossi", 25, 42.5);
        Persona persona2 = new Persona("Francesco", "Verdi", 68, 40.5);

        mostraPersona(persona1);
        mostraPersona(persona2);

        /*
        Mario Rossi, 25 anni, 42.5
        Francesco Verdi, 68 anni, 40.5
        */
    }
}
