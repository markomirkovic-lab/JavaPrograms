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

class Registro {
    String nomeClasse;
    Studente[] studenti;
    int cntStudenti;
    
    Registro(String nomeClasse, int nrStudenti) {
        this.nomeClasse = nomeClasse;
        studenti = new Studente[nrStudenti <= 0 ? 15 : nrStudenti];
    }
    
    boolean aggiungiStudente(Studente studente) {
        if (studente == null)
            return false;
        
        if (cntStudenti == studenti.length)
            return false;
        
        studenti[cntStudenti++] = studente;
        return true;
    }
    
    boolean aggiungiNota(String nome, String cognome, double nota) {
        if (nome == null || cognome == null)
            return false;
        
        for (int i = 0; i < cntStudenti; i++) {
            Studente studente = studenti[i];
            if (nome.equals(studente.nome) && cognome.equals(studente.cognome))
                return studente.aggiungiNota(nota);//boolean Studente.aggiungiNota(double nota)
        }
        return false;
    }
    
    void mostra() {
        System.out.println("\nClasse: " + nomeClasse);
        if (cntStudenti == 0)
            System.out.println("Nessun studente");
        else
            for (int i = 0; i < cntStudenti; i++)
                studenti[i].mostra();//void Studente.mostra()
        System.out.println();
    }
}

public class TestRegistro {
    public static void main(String[] args) {
        Registro registro = new Registro("I1", 28);
        
        if (!registro.aggiungiStudente(new Studente("Mario", "Rossi", 10)))
            System.out.println("Impossibile aggiungere Mario Rossi");
        if (!registro.aggiungiStudente(new Studente("Flavia", "Bianchi", -5)))
            System.out.println("Impossibile aggiungere Flavia Bianci");
        if (!registro.aggiungiStudente(null))
            System.out.println("Impossibile aggiungere lo studente");
        
        registro.mostra();
        
        if (!registro.aggiungiNota("Mario", "Rossi", 3.5))
            System.out.println("Impossibile aggiungere la nota 3.5 a Mario Rossi");
        if (!registro.aggiungiNota("Flavia", "Bianchi", 5.75))
            System.out.println("Impossibile aggiungere la nota 5.75 a Flavia Bianchi");
        if (!registro.aggiungiNota("Mario", "Rossi", 4.25))
            System.out.println("Impossibile aggiungere la nota 4.25 a Mario Rossi");
        if (!registro.aggiungiNota("Flavia", "Rossi", -1.5))
            System.out.println("Impossibile aggiungere la nota -1.5 a Flavia Rossi");
        if (!registro.aggiungiNota("Flavia", null, 1.75))
            System.out.println("Impossibile aggiungere la nota 1.75 a Flavia");
        
        registro.mostra();

        /*
        Impossibile aggiungere lo studente

        Classe: I1
        Mario Rossi
        Note: Nessuna
        Flavia Bianchi
        Note: Nessuna

        Impossibile aggiungere la nota -1.5 a Flavia Rossi
        Impossibile aggiungere la nota 1.75 a Flavia

        Classe: I1
        Mario Rossi
        Note: 3.5 4.25
        Flavia Bianchi
        Note: 5.75
        */
    }
}
