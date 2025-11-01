enum TipologiaRegalo {
    GIOCATTOLO, LIBRO, DISPOSITIVO_ELETTRONICO
}

class Bambino {
    String nome;
    String cognome;

    Bambino(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    void stampa() {
        System.out.println("Bambino: " + nome + " " + cognome);
    }

    boolean confronta(Bambino quello) {
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

class Regalo {
    TipologiaRegalo tipologia;
    double peso;
    Bambino destinatario;

    Regalo(TipologiaRegalo tipologia, double peso) {
        this.tipologia = tipologia;
        this.peso = peso > 0 ? peso : 5;
    }

    void assegnaDestinatario(Bambino bambino) {
        this.destinatario = bambino;
    }

    void stampa() {
        System.out.println("Regalo - peso: " + peso + " kg, tipologia: " + tipologia);
        if (destinatario != null) {
            destinatario.stampa();
        }
    }

    Regalo duplica() {
        return new Regalo(this.tipologia, this.peso);
    }
}

class Slitta {
    static final int MAX_REGALI = 10;
    double capacitaMassima = 20;
    double caricoAttuale;
    int nrRenne;
    Regalo[] regali = new Regalo[MAX_REGALI];
    int cntRegali;

    Slitta(int nrRenne, double capacitaMassima) {
        this(nrRenne);
        this.capacitaMassima = capacitaMassima > 0 ? capacitaMassima : 100;

    }

    Slitta(int nrRenne) {
        this.nrRenne = nrRenne > 0 ? nrRenne : 1;
    }

    void stampa() {
        System.out.println("Slitta - capacita massima: " + capacitaMassima + ", nr. renne: " + nrRenne);
        if (cntRegali != 0) {
            for (int i = 0; i < cntRegali; i++) {
                regali[i].stampa();
            }
        } else {
            System.out.println("Non ci sono regali");
        }
    }

    boolean aggiungiRegalo(Regalo regalo) {
        if (cntRegali >= MAX_REGALI) {
            return false;
        }

        if (caricoAttuale + regalo.peso > capacitaMassima) {
            return false;
        }

        regali[cntRegali++] = regalo;
        caricoAttuale += regalo.peso;

        return true;
    }

    Regalo trovaRegalo(TipologiaRegalo tipologia) {
        for (int i = 0; i < cntRegali; i++) {
            Regalo regalo = regali[i];
            if (regalo.tipologia == tipologia) {
                return regalo;
            }
        }
        return null;
    }
}

class BabboNataleGestioneConsegne {
    Slitta[] slitte = {
            new Slitta(1, 1.0), // Slitta(int nrRenne, double capacitaMassima)
            new Slitta(5, 2.5),
            new Slitta(10), // Slitta(int nrRenne)
    };

    Regalo[] regaliInMagazzino = {
            new Regalo(TipologiaRegalo.DISPOSITIVO_ELETTRONICO, 0.85),
            new Regalo(TipologiaRegalo.LIBRO, 0.75),
            new Regalo(TipologiaRegalo.GIOCATTOLO, 1),
            new Regalo(TipologiaRegalo.DISPOSITIVO_ELETTRONICO, 0.5),
    };

    Bambino[] bambini = new Bambino[100];
    int cntBambini;

    Regalo prendiRegaloDalMagazzino(TipologiaRegalo tipologia) {
        for (int i = 0; i < regaliInMagazzino.length; i++) {
            Regalo regalo = regaliInMagazzino[i];
            if (regalo != null && regalo.tipologia == tipologia) {
                regaliInMagazzino[i] = null;
                return regalo;
            }
        }
        return null;
    }

    boolean caricaRegaloSullaSlitta(Regalo regalo) {
        for (Slitta slitta : slitte) {
            if (slitta.aggiungiRegalo(regalo)) {
                return true;
            }
        }
        return false;
    }

    Regalo cercaEDuplicaRegalo(TipologiaRegalo tipologia) {
        Regalo regalo = null;
        for (Slitta slitta : slitte) {
            regalo = slitta.trovaRegalo(tipologia);
            if (regalo != null) {
                return regalo.duplica();
            }
        }
        return regalo;
    }

    boolean bambinoGiaProcessato(Bambino bambino) {
        for (int i = 0; i < cntBambini; i++) {
            if (bambini[i].confronta(bambino)) {
                return true;
            }
        }
        return false;
    }

    boolean aggiungiBambino(Bambino bambino) {
        if (cntBambini < bambini.length) {
            bambini[cntBambini++] = bambino;
            return true;
        }
        return false;
    }

    void processaRichieste(TipologiaRegalo tipoRegalo, Bambino bambino) {
        if (bambinoGiaProcessato(bambino)) {
            return;
        }

        if (!aggiungiBambino(bambino)) {
            return;
        }

        Regalo regalo = prendiRegaloDalMagazzino(tipoRegalo);
        if (regalo == null) {
            regalo = cercaEDuplicaRegalo(tipoRegalo);
        }
        regalo.assegnaDestinatario(bambino);
        caricaRegaloSullaSlitta(regalo);
    }

    void stampa() {
        System.out.println("Babbo Natale - Gestione Consegne");
        System.out.println("Slitte");
        for (Slitta slitta : slitte) {
            slitta.stampa();
            System.out.println();
        }
        System.out.println("Regali in magazzino");
        for (Regalo regalo : regaliInMagazzino) {
            if (regalo != null) {
                regalo.stampa();
            }
        }
    }
}

public class BabboNataleGestioneConsegneTest {
    public static void main(String[] args) {
        Bambino bambino1 = new Bambino("Mario", "Rossi");
        Bambino bambino2 = new Bambino("Mario", "Rossi");
        Bambino bambino3 = new Bambino("Luca", "Bianchi");
        Bambino bambino4 = new Bambino("Maria", "Vallone");

        BabboNataleGestioneConsegne gestioneConsegne = new BabboNataleGestioneConsegne();
        gestioneConsegne.processaRichieste(TipologiaRegalo.DISPOSITIVO_ELETTRONICO, bambino1);
        gestioneConsegne.processaRichieste(TipologiaRegalo.LIBRO, bambino2);
        gestioneConsegne.processaRichieste(TipologiaRegalo.LIBRO, bambino3);
        gestioneConsegne.processaRichieste(TipologiaRegalo.LIBRO, bambino4);

        gestioneConsegne.stampa();
    }
}
