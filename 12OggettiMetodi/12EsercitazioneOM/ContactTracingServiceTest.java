import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Indirizzo {
    String via;
    int numeroCivico;
    int codicePostale;
    String citta;

    Indirizzo(String via, String citta, int numeroCivico, int codicePostale) {
        this.via = via;
        this.citta = citta;
        // Se il numero civico non e' valido ne viene generato uno casualmente
        this.numeroCivico = numeroCivico <= 0 ? (int) (Math.random() * 100 + 1) : numeroCivico;
        // Se il codice postale non e' valido ne viene generato uno casualmente
        this.codicePostale = codicePostale <= 0 ? (int) (Math.random() * 1000 + 1000) : codicePostale;
    }

    // Metodo che controlla se due indirizzi sono uguali (stesso oggetto oppure
    // stessi valori per tutti i campi dei due oggetti)
    boolean stessoIndirizzo(Indirizzo indirizzo) {
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
        if (numeroCivico != indirizzo.numeroCivico)
            return false;
        if (codicePostale != indirizzo.codicePostale)
            return false;
        if (citta == null) {
            if (indirizzo.citta != null)
                return false;
        } else if (!citta.equals(indirizzo.citta))
            return false;
        return true;
    }

    // Metodo che ritorna la rappresentazione dell'indirizzo sotto forma di stringa
    String getIndirizzoComeStringa() {
        return "Via " + via + " " + numeroCivico + ", " + codicePostale + " " + citta;
    }
}

class Cliente {
    String nome;
    String cognome;
    Indirizzo indirizzo;
    String numeroTelefono;

    Cliente(String nome, String cognome, Indirizzo indirizzo, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numeroTelefono = numeroTelefono;
    }

    // Metodo che controlla se due clienti sono uguali (stesso oggetto oppure stessi
    // valori per tutti i campi dei due oggetti)
    boolean stessoCliente(Cliente cliente) {
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
        } else if (!indirizzo.stessoIndirizzo(cliente.indirizzo))
            // Il controllo sull'ugualianza dell'indirizzo viene demandato al metodo della
            // classe Indirizzo
            return false;
        if (numeroTelefono == null) {
            if (cliente.numeroTelefono != null)
                return false;
        } else if (!numeroTelefono.equals(cliente.numeroTelefono))
            return false;
        return true;
    }

    // Metodo che ritorna la rappresentazione del cliente sotto forma di stringa
    String getClienteComeStringa() {
        return nome + " " + cognome + " " + indirizzo == null ? ""
                : indirizzo.getIndirizzoComeStringa() + " " + numeroTelefono;
    }
}

enum Tipo {
    BAR, RISTORANTE
}

class EsercizioPubblico {
    String nome;
    Gruppo[] gruppi;
    int nrGruppi = 0;
    Tipo tipo;

    EsercizioPubblico(String nome, int nrGruppi, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;

        // Controllo che il valore sia sensato. In caso negativo, viene settato un
        // valore di default.
        // Siccome e' senza "this." stiamo lavorando con il parametro del costruttore
        if (nrGruppi <= 0) {
            nrGruppi = 10;
        }
        gruppi = new Gruppo[nrGruppi];
    }

    boolean addGruppo(Gruppo gruppo) {
        if (gruppo == null)
            return false;

        // Controllo che vi sia ancora spazio
        if (nrGruppi < gruppi.length) {
            // Sfrutto l'operatore di post-incremento
            gruppi[nrGruppi++] = gruppo;
            return true;
        }
        return false;
    }

    // Metodo che cerca se un determinato cliente fa parte di uno dei gruppi
    // dell'esercizio pubblico. In caso affermativo viene restituito il gruppo a cui
    // appartiene, altrimenti restituisce null.
    Gruppo cercaGruppo(Cliente cliente) {
        if (cliente == null)
            return null;

        Gruppo gruppo = null;
        // Ciclo solo sui gruppi che sono stati aggiunti
        for (int i = 0; i < nrGruppi; i++) {
            if (gruppi[i].faParte(cliente)) {
                gruppo = gruppi[i];
                // Si da per scontato che un cliente possa appartenere ad un solo gruppo
                break;
            }
        }
        return gruppo;
    }

    void mostra() {
        System.out.println("---------------------------------");
        System.out.println("Locale: " + nome + ", tipo: " + tipo);
        System.out.println("---------------------------------");
        System.out.println("Numero di gruppi: " + nrGruppi);
        // Ciclo solo sui gruppi che sono stati aggiunti
        for (int i = 0; i < nrGruppi; i++) {
            gruppi[i].mostra();
        }
        System.out.println();
        System.out.println();
    }
}

class Gruppo {
    Cliente[] clienti;
    int numeroTavolo;
    LocalDateTime arrivo;
    LocalDateTime partenza;
    int nrClienti = 0;

    Gruppo(int maxClienti, int nrTavolo, LocalDateTime arrivo, LocalDateTime partenza) {
        // Controllo che il valore sia sensato. In caso negativo, viene settato un
        // valore di default.
        if (maxClienti <= 0) {
            maxClienti = 10;
        }
        clienti = new Cliente[maxClienti];
        this.numeroTavolo = nrTavolo <= 0 ? (int) (Math.random() * 100 + 1) : nrTavolo;

        if (arrivo == null) {
            // L'arrivo viene generato con data e ora correnti
            arrivo = LocalDateTime.now();
        }

        if (partenza == null) {
            // La partenza viene generata casualmente a partire dall'orario di arrivo
            partenza = arrivo.plusMinutes((long) (Math.random() * 480 + 1));
        }

        // Se la partenza e' prima dell'arrivo, i due valori vengono invertiti
        LocalDateTime tmp = arrivo;
        if (partenza.isBefore(arrivo)) {
            arrivo = partenza;
            partenza = tmp;
        }

        this.arrivo = arrivo;
        this.partenza = partenza;
    }

    void mostra() {
        System.out.println("Gruppo:");
        System.out.println("-------");
        System.out.println("Numero del tavolo: " + numeroTavolo);
        System.out.println("Numero di clienti: " + nrClienti);
        System.out.println("Orario d'arrivo: " + arrivo);
        System.out.println("Orario di partenza: " + partenza);
        // Ciclo solo sui clienti che sono stati aggiunti
        for (int i = 0; i < nrClienti; i++) {
            System.out.println(clienti[i].getClienteComeStringa());
        }
        System.out.println();
    }

    // Metodo che verifica se un dato cliente fa parte del gruppo.
    boolean faParte(Cliente cliente) {
        if (cliente == null)
            return false;

        // Ciclo solo sui clienti che sono stati aggiunti
        for (int i = 0; i < nrClienti; i++) {
            if (clienti[i].stessoCliente(cliente)) {
                return true;
            }
        }
        return false;
    }

    boolean addCliente(Cliente cliente) {
        if (cliente == null)
            return false;

        // Controllo che vi sia ancora spazio
        if (nrClienti < clienti.length) {
            // Sfrutto l'operatore di post-incremento
            clienti[nrClienti++] = cliente;
            return true;
        }

        return false;
    }

    // Metodo che segnala un possibile contagio dei membri del gruppo
    void segnalaPossibileContagio(Cliente clienteInfettato) {
        if (clienteInfettato == null)
            return;

        System.out.println("Gruppo al tavolo " + numeroTavolo + ": possibile contagio.");
        System.out.println("Possibili persone contagiate:");
        for (int i = 0; i < nrClienti; i++) {
            // Non segnaliamo il possibile contagio del cliente testato positivamente
            if (clienti[i].stessoCliente(clienteInfettato)) {
                continue;
            }
            System.out.println(clienti[i].getClienteComeStringa());
        }
    }

    // Metodo che controlla se fra i due gruppi vi e' una sovrapposizione d'orario
    // (ossia se i due gruppi si sono incrociati all'interno dell'esercizio
    // pubblico)
    boolean sovrapposizioneOrario(Gruppo gruppo) {
        if (gruppo == null)
            return false;

        return (arrivo.isAfter(gruppo.arrivo) || arrivo.isEqual(gruppo.arrivo))
                && (arrivo.isBefore(gruppo.partenza) || arrivo.isEqual(gruppo.partenza))
                || (arrivo.isBefore(gruppo.arrivo) || arrivo.isEqual(gruppo.arrivo))
                        && (partenza.isAfter(gruppo.arrivo) || partenza.isEqual(gruppo.arrivo));
    }
}

class ContactTracing {
    EsercizioPubblico[] eserciziPubblici;
    int nrEserciziPubblici = 0;

    ContactTracing(int maxEserciziPubblici) {
        // Controllo che il valore sia sensato. In caso negativo, viene settato un
        // valore di default.
        if (maxEserciziPubblici <= 0) {
            maxEserciziPubblici = 10;
        }
        eserciziPubblici = new EsercizioPubblico[maxEserciziPubblici];
    }

    void mostra() {
        System.out.println("Contact tracing:");
        System.out.println("Numero di esercizi pubblici: " + nrEserciziPubblici);
        // Ciclo solo sugli esercizi pubblici che sono stati aggiunti
        for (int i = 0; i < nrEserciziPubblici; i++) {
            eserciziPubblici[i].mostra();
        }
        System.out.println();
        System.out.println();
    }

    boolean addEsercizioPubblico(EsercizioPubblico esercizioPubblico) {
        if (esercizioPubblico == null)
            return false;

        // Controllo che vi sia ancora spazio
        if (nrEserciziPubblici < eserciziPubblici.length) {
            // Sfrutto l'operatore di post-incremento
            eserciziPubblici[nrEserciziPubblici++] = esercizioPubblico;
            return true;
        }

        return false;
    }

    // Metodo che dato un cliente testato positivamente, cerca e segnala i possibili
    // contagi
    void segnalaContagio(Cliente clientePositivo) {
        if (clientePositivo == null)
            return;

        Gruppo gruppo;
        // Ciclo solo sugli esercizi pubblici che sono stati aggiunti
        for (int i = 0; i < nrEserciziPubblici; i++) {
            // Cerco se il cliente positivo fa parte di uno dei gruppi di un dato esercizio
            gruppo = eserciziPubblici[i].cercaGruppo(clientePositivo);
            // Se vero "gruppo" rappresenta il gruppo a cui apparteneva il cliente testato
            // positivo
            if (gruppo != null) {
                System.out.println();
                System.out.println(
                        "Il cliente positivo ha frequentato l'esercizio pubblico: " + eserciziPubblici[i].nome);
                Gruppo[] gruppi = eserciziPubblici[i].gruppi;
                // Ciclo sui gruppi dell'esercizio pubblico frequentato dal cliente positivo
                for (int j = 0; j < eserciziPubblici[i].nrGruppi; j++) {
                    if (gruppi[j].sovrapposizioneOrario(gruppo)) {
                        gruppi[j].segnalaPossibileContagio(clientePositivo);
                        System.out.println();
                        System.out.println();
                    }
                }
                continue;
            }
            System.out.println("Esercizio pubblico " + eserciziPubblici[i].nome + ": nessuna segnalazione");
            System.out.println();
        }
    }
}

public class ContactTracingServiceTest {

    private static int generateRandomNumberInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // Metodo di utilita' per creare un gruppo
    private static Gruppo creaGruppo(int maxClienti, int nrTavolo, LocalDateTime arrivo, LocalDateTime partenza,
            int nrClienti, String nomeEsercizioPubblico) {
        Gruppo gruppo = new Gruppo(maxClienti, nrTavolo, arrivo, partenza);
        for (int i = 0; i < nrClienti; i++) {
            Indirizzo indirizzo = new Indirizzo("via" + i + nrTavolo, "citta" + i + nrTavolo, +i + nrTavolo,
                    i + nrTavolo);
            Cliente cliente = new Cliente(nomeEsercizioPubblico + i + nrTavolo, "cognome" + i + nrTavolo, indirizzo,
                    "numeroTelefono" + i + nrTavolo);
            if (!gruppo.addCliente(cliente)) {
                System.out.println("Non si possono aggiungere altri clienti a questo gruppo");
                break;
            }

        }
        return gruppo;
    }

    // Metodo di utilita' per creare un esercizio pubblico
    private static EsercizioPubblico creaEsercizioPubblico(String nome, Tipo tipo, int maxNrGruppi, int nrGruppi,
            LocalDateTime[] arrivi, LocalDateTime[] partenze) {
        EsercizioPubblico esercizioPubblico = new EsercizioPubblico(nome, maxNrGruppi, tipo);
        for (int i = 0; i < nrGruppi; i++) {
            Gruppo gruppo = creaGruppo(generateRandomNumberInRange(1, 11), i, arrivi[i], partenze[i],
                    generateRandomNumberInRange(1, 11), nome);
            if (!esercizioPubblico.addGruppo(gruppo)) {
                System.out.println("Non si possono aggiungere altri gruppi a questo esercizio pubblico");
                break;
            }
        }

        return esercizioPubblico;
    }

    // Metodo che restituisce in modo random un cliente (che viene poi usato come
    // "cliente testato positivamente")
    private static Cliente selezionaRandomClientePositivo(ContactTracing contactTracing) {
        System.out.println("Selezione random del cliente positivo:");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        int indexEsercizioPubblico = generateRandomNumberInRange(0, contactTracing.nrEserciziPubblici);
        EsercizioPubblico esercizioPubblico = contactTracing.eserciziPubblici[indexEsercizioPubblico];
        System.out.println("Il cliente positivo ha frequentato il locale " + esercizioPubblico.nome);

        int indexGruppo = generateRandomNumberInRange(0, esercizioPubblico.nrGruppi);
        Gruppo gruppo = esercizioPubblico.gruppi[indexGruppo];
        System.out.println("Il cliente positivo era nel gruppo al tavolo numero " + gruppo.numeroTavolo);

        int indexCliente = generateRandomNumberInRange(0, gruppo.nrClienti);
        Cliente clientePositivo = gruppo.clienti[indexCliente];
        System.out.println("Il cliente positivo e' " + clientePositivo.getClienteComeStringa());
        return clientePositivo;
    }

    public static void main(String[] args) {

        // Necessario per gestire la formattazione degli oggetti di tipo LocalDateTime.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // Creo alcuni oggetti di tipo LocalDateTime che inserisco i due arrays (orari
        // di arrivo e orari di partenza)
        LocalDateTime[] arrivi1 = new LocalDateTime[3];
        LocalDateTime[] partenze1 = new LocalDateTime[3];

        arrivi1[0] = LocalDateTime.parse("2020-01-03 11:30", formatter);
        partenze1[0] = LocalDateTime.parse("2020-01-03 12:30", formatter);

        arrivi1[1] = LocalDateTime.parse("2020-01-03 12:00", formatter);
        partenze1[1] = LocalDateTime.parse("2020-01-03 13:30", formatter);

        arrivi1[2] = LocalDateTime.parse("2020-01-03 13:00", formatter);
        partenze1[2] = LocalDateTime.parse("2020-01-03 14:00", formatter);

        LocalDateTime[] arrivi2 = new LocalDateTime[4];
        LocalDateTime[] partenze2 = new LocalDateTime[4];

        arrivi2[0] = LocalDateTime.parse("2020-01-03 21:30", formatter);
        partenze2[0] = LocalDateTime.parse("2020-01-03 22:30", formatter);

        arrivi2[1] = LocalDateTime.parse("2020-01-03 22:00", formatter);
        partenze2[1] = LocalDateTime.parse("2020-01-03 23:30", formatter);

        arrivi2[2] = LocalDateTime.parse("2020-01-03 23:00", formatter);
        partenze2[2] = LocalDateTime.parse("2020-01-03 24:00", formatter);

        arrivi2[3] = LocalDateTime.parse("2020-01-03 20:00", formatter);
        partenze2[3] = LocalDateTime.parse("2020-01-03 21:00", formatter);

        // Creo alcuni esercizi pubblici
        EsercizioPubblico[] eserciziPubblici = new EsercizioPubblico[3];
        eserciziPubblici[0] = creaEsercizioPubblico("Bar liceo", Tipo.BAR, 4, 3, arrivi1, partenze1);
        eserciziPubblici[1] = creaEsercizioPubblico("Pizzeria da Mario", Tipo.RISTORANTE, 4, 4, arrivi2, partenze2);
        // Per comodita' usiamo gli stessi orari del primo esercizio pubblico.
        eserciziPubblici[2] = creaEsercizioPubblico("Antico ateneo del vino", Tipo.RISTORANTE, 10, 3, arrivi1,
                partenze1);

        // Creo un oggetto di tipo "ContactTracing" e aggiungo gli esercizi pubblici
        // creati in precedenza
        ContactTracing contactTracing = new ContactTracing(10);
        for (EsercizioPubblico esercizioPubblico : eserciziPubblici) {
            if (!contactTracing.addEsercizioPubblico(esercizioPubblico)) {
                System.out.println("Non si possono aggiungere altri esercizi pubblici a questo contact tracing");
                break;
            }
        }

        contactTracing.mostra();
        System.out.println();
        System.out.println();
        System.out.println();

        Cliente clientePositivo = selezionaRandomClientePositivo(contactTracing);
        System.out.println();
        System.out.println();
        System.out.println();

        contactTracing.segnalaContagio(clientePositivo);
    }
}