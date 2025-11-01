class Studente {
    String nome;
    String cognome;
    double[] note;
    int cntNote;

    Studente(String nome, String cognome, int nrNote) {
    this.nome = nome;
    this.cognome = cognome;
    note = new double[nrNote <= 0 ? 5 : nrNote];
    }

    boolean aggiungiNota(double nota) {
        if (nota < 1 || nota > 6)
        return false;
        if (cntNote == note.length)
        return false;
        note[cntNote++] = nota;
        return true; 
    }

    void mostra() {
        System.out.println(nome + " " + cognome);
        System.out.print("Note: ");
        if (cntNote == 0)
        System.out.print("Nessuna");
        else
        for (int i = 0; i < cntNote; i++)
        System.out.print(note[i] + " ");
        System.out.println();
    }
}


public class TestStudenteV2 {

    public static void main(String[] args) {
        
        Studente studente1 = new Studente("Luca","Boh",2);
        Studente studente2 = new Studente("Maria","Mah",3);
        Studente studente3 = new Studente("Gennaro","Chi",0);

        studente1.aggiungiNota(4);
        studente1.aggiungiNota(4.5 );

        studente2.aggiungiNota(4);
        studente2.aggiungiNota(6);
        studente2.aggiungiNota(3);

        studente1.mostra();
        studente2.mostra();
        studente3.mostra();

        /*
        Luca Boh
        Note: 4.0 4.5
        Maria Mah
        Note: 4.0 6.0 3.0
        Gennaro Chi
        Note: Nessuna
        */

    }
    
}
