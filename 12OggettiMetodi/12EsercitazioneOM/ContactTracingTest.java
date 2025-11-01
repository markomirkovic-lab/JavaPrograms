import java.time.LocalDateTime;
import java.time.Month;

class Indirizzo {
    String via;
    String citta;

    Indirizzo(String via, String citta) {
        this.via = via;
        this.citta = citta;
    }

    boolean confronta(Indirizzo indirizzo) {
        if (indirizzo == null)
            return false;
        if (this == indirizzo)
            // Referenza allo stesso oggetto
            return true;
        if (via == null) {
            if (indirizzo.via != null)
                return false;
        } else if (!via.equals(indirizzo.via))
            return false;
        if (citta == null) {
            if (indirizzo.citta != null)
                return false;
        } else if (!citta.equals(indirizzo.citta))
            return false;
        return true;
    }

    void mostra() {
        System.out.print(via + " - " + citta);
    }
}

class Cliente {
    String nome;
    String cognome;
    Indirizzo indirizzo;
    String numeroTelefono;
    boolean contattato;

    Cliente(String nome, String cognome, Indirizzo indirizzo, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numeroTelefono = numeroTelefono;
    }

    boolean confronta(Cliente cliente) {
        if (cliente == null)
            return false;
        if (this == cliente)
            // Referenza allo stesso oggetto
            return true;

        if (nome == null) {
            if (cliente.nome != null)
                return false;
        } else if (!nome.equals(cliente.nome))
            return false;
        if (cognome == null) {
            if (cliente.cognome != null)
                return false;
        } else if (!cognome.equals(cliente.cognome))
            return false;
        if (indirizzo == null) {
            if (cliente.indirizzo != null)
                return false;
        } else if (!indirizzo.confronta(cliente.indirizzo))
            return false;
        if (numeroTelefono == null) {
            if (cliente.numeroTelefono != null)
                return false;
        } else if (!numeroTelefono.equals(cliente.numeroTelefono))
            return false;
        return true;
    }

    void segnalaPossibileContagio() {
        contattato = true;
    }

    void mostra() {
        System.out.print(nome + " " + cognome + ", " + numeroTelefono + ", ");
        if (indirizzo != null)
            indirizzo.mostra();
        System.out.println();
    }
}

class Gruppo {
    Cliente[] clienti;
    int numeroTavolo;
    LocalDateTime arrivo;
    LocalDateTime partenza;

    Gruppo(int numeroPartecipanti, int numeroTavolo, LocalDateTime arrivo) {
        clienti = new Cliente[numeroPartecipanti <= 0 ? (int) (Math.random() * 15 + 5) : numeroPartecipanti];
        this.numeroTavolo = numeroTavolo <= 0 ? (int) (Math.random() * 10 + 1) : numeroTavolo;
        this.arrivo = arrivo;
    }

    Gruppo(int numeroPartecipanti, int numeroTavolo) {
        this(numeroPartecipanti, numeroTavolo, LocalDateTime.now());
    }

    Gruppo(Cliente[] clienti, int numeroTavolo, LocalDateTime arrivo) {
        int numeroPartecipanti = clienti == null ? (int) (Math.random() * 15 + 5) : clienti.length;

        // Non posso chiamare this(numeroPartecipanti, numeroTavolo, arrivo)!! Dovrebbe
        // essere la prima istruzione del costruttore!! Devo duplicare il codice
        this.clienti = new Cliente[numeroPartecipanti];
        this.numeroTavolo = numeroTavolo <= 0 ? (int) (Math.random() * 10 + 1) : numeroTavolo;
        this.arrivo = arrivo;
        if (clienti != null) {
            for (int i = 0; i < clienti.length; i++)
                this.clienti[i] = clienti[i];
        }
    }

    Gruppo(Cliente[] clienti, int numeroTavolo) {
        this(clienti, numeroTavolo, LocalDateTime.now());
    }

    void aggiungiCliente(Cliente cliente) {
        if (cliente == null)
            return;

        for (int i = 0; i < clienti.length; i++)
            if (clienti[i] == null) {
                clienti[i] = cliente;
                return;
            }
    }

    void lasciaLocale() {
        lasciaLocale(LocalDateTime.now());
    }

    void lasciaLocale(LocalDateTime partenza) {
        if (partenza == null) {
            // La partenza viene generata casualmente a partire dall'orario di arrivo
            partenza = arrivo.plusMinutes((long) (Math.random() * 480 + 1));
        }

        // Se la partenza e' prima dell'arrivo, i due valori vengono invertiti
        if (partenza.isBefore(arrivo)) {
            LocalDateTime tmp = arrivo;
            arrivo = partenza;
            partenza = tmp;
        }

        this.partenza = partenza;
    }

    boolean contiene(Cliente cliente) {
        if (cliente == null)
            return false;

        for (Cliente tmp : clienti)
            if (tmp != null && tmp.confronta(cliente))
                return true;
        return false;
    }

    void mostra() {
        System.out.println("Tavolo " + numeroTavolo + ", arrivo: " + arrivo + ", partenza: " + partenza);
        for (Cliente cliente : clienti) {
            if (cliente != null)
                cliente.mostra();
        }
    }
}

class EsercizioPubblico {
    String nome;
    Indirizzo indirizzo;
    Gruppo[] gruppi = new Gruppo[25];
    int cntGruppi;

    EsercizioPubblico(String nome, Indirizzo indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    void aggiungiGruppo(Gruppo gruppo) {
        if (gruppo == null || cntGruppi == gruppi.length)
            return;
        gruppi[cntGruppi++] = gruppo;
    }

    void aggiungiCliente(Gruppo gruppo, Cliente cliente) {
        if (gruppo != null && cliente != null)
            gruppo.aggiungiCliente(cliente);
    }

    Gruppo[] cercaGruppiAppartenenza(Cliente cliente) {
        if (cliente == null)
            return null;

        Gruppo[] gruppiAppartenenza = new Gruppo[gruppi.length];
        int cnt = 0;
        for (Gruppo gruppo : gruppi) {
            if (gruppo == null)
                continue;
            if (gruppo.contiene(cliente))
                gruppiAppartenenza[cnt++] = gruppo;
        }
        return gruppiAppartenenza;
    }

    void mostra() {
        System.out.print("Esercizio pubblico: " + nome + ", ");
        if (indirizzo != null)
            indirizzo.mostra();
        System.out.println();
        for (int i = 0; i < cntGruppi; i++)
            gruppi[i].mostra();
        System.out.println();
    }
}

class ContactTracing {
    EsercizioPubblico[] eserciziPubblici = new EsercizioPubblico[50];
    int cntEserciziPubblici;

    void aggiungiEsercizioPubblico(EsercizioPubblico esercizioPubblico) {
        if (esercizioPubblico == null || cntEserciziPubblici == eserciziPubblici.length)
            return;

        eserciziPubblici[cntEserciziPubblici++] = esercizioPubblico;
    }

    void aggiungiEsercizioPubblico(EsercizioPubblico[] eserciziPubblici) {
        if (eserciziPubblici == null)
            return;

        for (EsercizioPubblico esercizioPubblico : eserciziPubblici)
            aggiungiEsercizioPubblico(esercizioPubblico);
    }

    boolean devoAvvisare(Gruppo gruppo, Gruppo gruppoContagio) {
        if (gruppo == null || gruppoContagio == null || gruppo.arrivo == null || gruppo.partenza == null
                || gruppoContagio.arrivo == null || gruppoContagio.partenza == null)
            return false;

        return !gruppo.arrivo.isAfter(gruppoContagio.partenza) && !gruppo.partenza.isBefore(gruppoContagio.arrivo);
    }

    void avvisaGruppo(Gruppo gruppo) {
        if (gruppo == null || gruppo.clienti == null)
            return;

        for (Cliente cliente : gruppo.clienti) {
            if (cliente == null || cliente.contattato)
                continue;
            cliente.segnalaPossibileContagio();
            System.out.print("Possibile contagio, fai il test ==> ");
            cliente.mostra();
        }
    }

    void segnalaContagio(Cliente cliente) {
        if (cliente == null)
            return;

        for (EsercizioPubblico esercizioPubblico : eserciziPubblici) {
            if (esercizioPubblico == null)
                continue;

            Gruppo[] gruppiAppartenenzaContagio = esercizioPubblico.cercaGruppiAppartenenza(cliente);
            if (gruppiAppartenenzaContagio == null)
                continue;

            for (Gruppo gruppoAppartenenzaContagio : gruppiAppartenenzaContagio) {
                if (gruppoAppartenenzaContagio == null)
                    break;
                for (Gruppo tmp : esercizioPubblico.gruppi) {
                    if (tmp == null)
                        break;
                    if (devoAvvisare(tmp, gruppoAppartenenzaContagio))
                        avvisaGruppo(tmp);
                }
            }
        }
    }

    void mostra() {
        for (int i = 0; i < cntEserciziPubblici; i++)
            eserciziPubblici[i].mostra();
    }
}

public class ContactTracingTest {
    private static int generaNumeroInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    private static String creaNumeroTelefono() {
        return "091" + generaNumeroInRange(100, 999) + generaNumeroInRange(10, 99) + generaNumeroInRange(10, 99);
    }

    private static Indirizzo creaIndirizzo(String[] vie, String[] citta) {
        return new Indirizzo(vie[generaNumeroInRange(0, vie.length - 1)] + " " + generaNumeroInRange(1, 50),
                citta[generaNumeroInRange(0, citta.length - 1)]);
    }

    private static Cliente creaCliente(String[] nomi, String[] cognomi, String[] vie, String[] citta) {
        return new Cliente(nomi[generaNumeroInRange(0, nomi.length - 1)],
                cognomi[generaNumeroInRange(0, cognomi.length - 1)], creaIndirizzo(vie, citta), creaNumeroTelefono());
    }

    private static boolean clienteUnivoco(Cliente cliente, Cliente[] clienti) {
        for (int i = 0; i < clienti.length; i++)
            if (clienti[i] != null && clienti[i].confronta(cliente))
                return false;
        return true;
    }

    private static Cliente[] selezionaClientiUnivoci(int nrClienti, Cliente[] clienti) {
        Cliente[] selezione = new Cliente[nrClienti];
        for (int i = 0; i < selezione.length; i++) {
            Cliente tmp = clienti[generaNumeroInRange(0, clienti.length - 1)];
            while (!clienteUnivoco(tmp, selezione))
                tmp = clienti[generaNumeroInRange(0, clienti.length - 1)];
            selezione[i] = tmp;
        }
        return selezione;
    }

    private static Gruppo creaGruppo(int nrClienti, Cliente[] clienti, LocalDateTime arrivo, LocalDateTime partenza) {
        Gruppo gruppo = new Gruppo(selezionaClientiUnivoci(nrClienti, clienti), generaNumeroInRange(10, 50), arrivo);
        gruppo.lasciaLocale(partenza);
        return gruppo;
    }

    private static Cliente selezionaClienteRandom(EsercizioPubblico[] eserciziPubblici) {
        EsercizioPubblico esercizioPubblicoRandom = eserciziPubblici[generaNumeroInRange(0,
                eserciziPubblici.length - 1)];
        Gruppo gruppoRandom = esercizioPubblicoRandom.gruppi[generaNumeroInRange(0,
                esercizioPubblicoRandom.cntGruppi - 1)];
        return gruppoRandom.clienti[generaNumeroInRange(0, gruppoRandom.clienti.length - 1)];
    }

    public static void main(String[] args) {
        String[] nomi = { "Nicola", "Amelia", "Stefano", "Carlo", "Alberto", "Daria", "Bruno", "Rosa", "Maria" };
        String[] cognomi = { "Lupo", "Argento", "Orso", "Amato", "Bianchi", "Rossi", "Pomodoro", "Verdi", "Galli" };
        String[] vie = { "via dei Peri", "via dei Ciclamini", "via delle Rose", "via Cimitero", "via alle Scuole",
                "via Borromini", "via Leopoldo", "via alla Chiesa", "via Ticino" };
        String[] citta = { "6900 Lugano", "6500 Bellinzona", "6631 Corippo", "6647 Mergoscia", "6746 Lavorgo",
                "6600 Locarno", "6612 Ascona", "6814 Lamone", "6618 Arcegno" };

        Cliente[] clienti = new Cliente[8];
        for (int i = 0; i < clienti.length; i++)
            clienti[i] = creaCliente(nomi, cognomi, vie, citta);

        EsercizioPubblico[] eserciziPubblici = {
                new EsercizioPubblico("The Trinity Irish Pub", new Indirizzo("via Canonica 19", "6900 Lugano")),
                new EsercizioPubblico("Folk", new Indirizzo("via Ludovico il Moro 7", "6500 Bellinzona")),
                new EsercizioPubblico("Grotto Pojana", new Indirizzo("via Poiana 63", "6826 Riva San Vitale")) };

        int[] nrPartecipantiPerGruppo = { 2, 1, 3, 4, 2, 1, 5, 3, 2, 1, 2, 5 };

        LocalDateTime[] arrivi = { LocalDateTime.of(2010, Month.DECEMBER, 19, 19, 20),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 18, 20), LocalDateTime.of(2010, Month.DECEMBER, 19, 19, 45),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 18, 30), LocalDateTime.of(2010, Month.DECEMBER, 19, 17, 0),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 20, 15), LocalDateTime.of(2010, Month.DECEMBER, 19, 20, 0),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 19, 00), LocalDateTime.of(2010, Month.DECEMBER, 19, 17, 15),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 21, 0), LocalDateTime.of(2010, Month.DECEMBER, 19, 16, 0),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 19, 25) };

        LocalDateTime[] partenze = { LocalDateTime.of(2010, Month.DECEMBER, 19, 22, 20),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 19, 15), LocalDateTime.of(2010, Month.DECEMBER, 19, 21, 45),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 20, 20), LocalDateTime.of(2010, Month.DECEMBER, 19, 18, 30),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 23, 45), LocalDateTime.of(2010, Month.DECEMBER, 19, 21, 30),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 19, 30), LocalDateTime.of(2010, Month.DECEMBER, 19, 19, 15),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 23, 45), LocalDateTime.of(2010, Month.DECEMBER, 19, 18, 0),
                LocalDateTime.of(2010, Month.DECEMBER, 19, 22, 50) };

        int[] gruppiPerEsercizioPubblico = { 3, 5, 4 };

        int cnt = 0;
        for (int i = 0; i < eserciziPubblici.length; i++) {
            EsercizioPubblico esercizioPubblico = eserciziPubblici[i];
            for (int j = 0; j < gruppiPerEsercizioPubblico[i]; j++) {
                esercizioPubblico
                        .aggiungiGruppo(creaGruppo(nrPartecipantiPerGruppo[cnt], clienti, arrivi[cnt], partenze[cnt]));
                cnt++;
            }
        }

        ContactTracing contactTracing = new ContactTracing();
        contactTracing.aggiungiEsercizioPubblico(eserciziPubblici);

        contactTracing.mostra();

        System.out.println();

        Cliente clienteContagiato = selezionaClienteRandom(eserciziPubblici);
        System.out.print("Contagiato: ");
        clienteContagiato.mostra();
        contactTracing.segnalaContagio(clienteContagiato);
    }
}