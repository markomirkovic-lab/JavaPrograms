enum Dimensione {
    S, M, L
}

class Destinatario {
    String nome;
    String cognome;

    Destinatario(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    void mostra() {
        System.out.println("Destinatario: " + nome + " " + cognome);
    }

    boolean uguale(Destinatario quello) {
        if (this == quello) {
            return true;
        }
        if (quello == null) {
            return false;
        }
        if (nome == null) {
            if (quello.nome != null) {
                return false;
            }
        } else if (!nome.equals(quello.nome)) {
            return false;
        }
        if (cognome == null) {
            if (quello.cognome != null) {
                return false;
            }
        } else if (!cognome.equals(quello.cognome)) {
            return false;
        }
        return true;
    }
}

class Pacchetto {
    Dimensione dimensione;
    Destinatario destinatario;

    Pacchetto(Dimensione dimensione, Destinatario destinatario) {
        this.dimensione = dimensione == null ? Dimensione.M : dimensione;
        this.destinatario = destinatario == null ? new Destinatario("sconosciuto", "sconosciuto") : destinatario;
    }

    void mostra() {
        System.out.println("Pacchetto di dimensione: " + dimensione);
        destinatario.mostra();
    }
}

class Scompartimento {
    int identificativo;
    Pacchetto pacchetto;
    Dimensione dimensione;

    Scompartimento(Dimensione dimensione, int identificativo) {
        this.dimensione = dimensione == null ? Dimensione.M : dimensione;
        this.identificativo = identificativo;
    }

    void mostra() {
        System.out.println("Scomparto " + identificativo + " di dimensione: " + dimensione);
        if (pacchetto != null) {
            pacchetto.mostra();
        } else {
            System.out.println("vuoto");
        }
    }

    boolean inserisciPacchetto(Pacchetto pacchetto) {
        if (vuoto() && stessaDimensione(pacchetto)) {
            this.pacchetto = pacchetto;
            return true;
        }
        return false;
    }

    Pacchetto rimuoviPacchetto() {
        Pacchetto pacchetto = this.pacchetto;
        this.pacchetto = null;
        return pacchetto;
    }

    boolean stessaDimensione(Pacchetto pacchetto) {
        if (pacchetto == null) {
            return false;
        }
        return this.dimensione == pacchetto.dimensione;
    }

    boolean vuoto() {
        return pacchetto == null;
    }
}

class SistemaDiGestione {
    static final int DIMENSIONE_LISTA_ATTESA = 10;
    Scompartimento[] scompartimenti;
    Pacchetto[] pacchettiInAttesa = new Pacchetto[DIMENSIONE_LISTA_ATTESA];

    SistemaDiGestione(Scompartimento[] scompartimenti) {
        if (scompartimenti == null || scompartimenti.length == 0) {
            this.scompartimenti = new Scompartimento[] { new Scompartimento(Dimensione.S, 1) };
        } else {
            this.scompartimenti = scompartimenti;
        }
    }

    boolean inserisciPacchettoInScomparto(Pacchetto pacchetto) {
        if (pacchetto == null) {
            return false;
        }

        for (Scompartimento scompartimento : scompartimenti) {
            if (scompartimento.inserisciPacchetto(pacchetto)) {
                return true;
            }
        }
        return false;
    }

    boolean aggiungiAListaAttesa(Pacchetto pacchetto) {
        if (pacchetto == null) {
            return false;
        }

        for (int i = 0; i < pacchettiInAttesa.length; i++) {
            if (pacchettiInAttesa[i] == null) {
                pacchettiInAttesa[i] = pacchetto;
                return true;
            }
        }
        return false;
    }

    Pacchetto rimuoviDaListaAttesa(Dimensione dimensione) {
        for (int i = 0; i < pacchettiInAttesa.length; i++) {
            if (pacchettiInAttesa[i] != null && pacchettiInAttesa[i].dimensione == dimensione) {
                Pacchetto pacchetto = pacchettiInAttesa[i];
                pacchettiInAttesa[i] = null;
                return pacchetto;
            }
        }
        return null;
    }

    void gestisciNuovoPacchetto(Pacchetto pacchetto) {
        if (!inserisciPacchettoInScomparto(pacchetto)) {
            aggiungiAListaAttesa(pacchetto);
        }
    }

    void ritira(int identificativo, Destinatario destinatario) {
        for (Scompartimento scompartimento : scompartimenti) {
            if (scompartimento != null && scompartimento.identificativo == identificativo && !scompartimento.vuoto()
                    && scompartimento.pacchetto.destinatario.uguale(destinatario)) {
                scompartimento.rimuoviPacchetto();
                gestisciPacchettoInAttesa(scompartimento);
                break;
            }
        }
    }

    void gestisciPacchettoInAttesa(Scompartimento scompartimento) {
        if (scompartimento == null) {
            return;
        }

        Pacchetto pacchettoDaAggiungere = rimuoviDaListaAttesa(scompartimento.dimensione);
        if (pacchettoDaAggiungere != null) {
            scompartimento.inserisciPacchetto(pacchettoDaAggiungere);
        }
    }

    void ritira(Destinatario destinatario) {
        for (Scompartimento scompartimento : scompartimenti) {
            if (scompartimento != null && !scompartimento.vuoto()
                    && scompartimento.pacchetto.destinatario.uguale(destinatario)) {
                scompartimento.rimuoviPacchetto();
                gestisciPacchettoInAttesa(scompartimento);
            }
        }
    }

    void mostra() {
        String titolo = """
                ==========
                | Report |
                ==========
                """;
        System.out.println(titolo);
        System.out.println("Scompartimenti");
        System.out.println("==============");
        for (Scompartimento scompartimento : scompartimenti) {
            scompartimento.mostra();
            System.out.println();
        }
        System.out.println("\nLista d'attesa");
        System.out.println("==============");
        boolean vuota = true;
        for (Pacchetto pacchetto : pacchettiInAttesa) {
            if (pacchetto != null) {
                vuota = false;
                pacchetto.mostra();
            }
        }

        if (vuota) {
            System.out.println("vuota");
        }
    }
}

public class SistemaDiGestioneTest {

    public static void main(String[] args) {

        Scompartimento[] scompartimenti = {
                // Scopartimento(Dimensione dimensione, int identificativo)
                new Scompartimento(Dimensione.S, 1),
                new Scompartimento(Dimensione.M, 2),
                new Scompartimento(Dimensione.L, 3),
                new Scompartimento(Dimensione.L, 4)
        };
        SistemaDiGestione sistema = new SistemaDiGestione(scompartimenti);

        Destinatario[] destinatari = {
                new Destinatario("Mario", "Rossi"),
                new Destinatario("Luca", "Verda"),
                new Destinatario("Giovanni", "Bernasconi") };

        sistema.gestisciNuovoPacchetto(new Pacchetto(Dimensione.S, destinatari[0]));
        sistema.gestisciNuovoPacchetto(new Pacchetto(Dimensione.M, destinatari[0]));
        sistema.gestisciNuovoPacchetto(new Pacchetto(Dimensione.L, destinatari[0]));
        sistema.gestisciNuovoPacchetto(new Pacchetto(Dimensione.L, destinatari[1]));
        sistema.gestisciNuovoPacchetto(new Pacchetto(Dimensione.L, destinatari[2]));

        sistema.mostra();

        sistema.ritira(4, new Destinatario("Luca", "Verda"));
        sistema.ritira(destinatari[0]);

        System.out.println();
        sistema.mostra();
    }
}