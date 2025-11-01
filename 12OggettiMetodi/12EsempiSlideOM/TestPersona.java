class Persona {
    String nome;
    String cognome;
    int eta;

    Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
}

public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Giada", "Bianchi", 22);
    }
}
