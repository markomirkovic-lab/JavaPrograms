class Oggetto {
    int valore;
    String nome;

    Oggetto(int valore, String nome) {
        this.valore = valore;
        this.nome = nome;
    }

    void mostra() {
        System.out.println("Oggetto: " + nome + ", " + valore);
    }
}

public class PassaggioParametri {
    private static void eseguiLavoro(int val, Oggetto ogg) {
        val += 22;// non modifica il numero
        ogg.valore += 55;// modifica il valore
        ogg.nome += " Severina";// modifica il nome
    }

    public static void main(String[] args) {
        Oggetto oggetto = new Oggetto(44, "Genoveffa");

        int numero = 666;

        System.out.println("Numero: " + numero);//Numero: 666
        oggetto.mostra();//Oggetto: Genoveffa, 44

        eseguiLavoro(numero, oggetto);

        System.out.println("Numero: " + numero);//Numero: 666
        oggetto.mostra();//Oggetto: Genoveffa Severina, 99
    }
}
