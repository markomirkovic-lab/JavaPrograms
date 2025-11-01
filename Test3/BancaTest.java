import java.time.LocalDate;
import java.util.Random;

class Cliente {
    static final int ANNO_NASCITA_DEFAULT = 1925;

    String nome;
    String email;
    int annoDiNascita;

    Cliente(String nome, String email, int annoDiNascita) {
        this.nome = nome;
        this.email = email;
        this.annoDiNascita = annoDiNascita < 1925 ? ANNO_NASCITA_DEFAULT : annoDiNascita;
    }

    void mostra() {
        System.out.println("Cliente: " + nome + ", Email: " + email + ", Anno: " + annoDiNascita);
    }

    int calcolaEta() {
        return LocalDate.now().getYear() - annoDiNascita;
    }

    boolean confronta(Cliente quello) {
        if (this == quello) {
            return true;
        }
        if (quello == null) {
            return false;
        }
        if (email == null) {
            if (quello.email != null) {
                return false;
            }
        } else if (!email.equals(quello.email)) {
            return false;
        }
        return annoDiNascita == quello.annoDiNascita;
    }
}

class Prestito {
    static final int DURATA_DEFAULT = 10;
    static final int AMMONTARE_DEFAULT = 1000;

    Cliente cliente;
    int ammontare;
    int durata;

    Prestito(Cliente cliente, int ammontare, int durata) {
        this.cliente = cliente == null ? new Cliente("nome sconosciuto", "mail sconosciuta", 1925) : cliente;
        this.ammontare = ammontare <= 0 ? AMMONTARE_DEFAULT : ammontare;
        this.durata = durata <= 0 ? DURATA_DEFAULT : durata;
    }

    Prestito(Cliente cliente, int ammontare) {
        this(cliente, ammontare, DURATA_DEFAULT);
    }

    boolean confronta(Prestito quello) {
        if (this == quello) {
            return true;
        }
        if (quello == null) {
            return false;
        }
        if (cliente == null) {
            if (quello.cliente != null) {
                return false;
            }
        } else if (!cliente.confronta(quello.cliente)) {
            return false;
        }
        return ammontare == quello.ammontare && durata == quello.durata;
    }

    void mostra() {
        System.out.println("Prestito a " + cliente.nome + " di " + ammontare + " CHF per " + durata + " anni");
    }
}

class Banca {
    static final int MAX_CLIENTI = 100;
    static final int MAX_PRESTITI = 50;
    static final int AMMONTARE_TOTALE_PRESTABILE_DEFAULT = 100000;
    static final int DURATA_DEFAULT = 10;

    String nome;
    Cliente[] clienti;
    Prestito[] prestiti;
    int ammontareTotalePrestabile;
    int ammontareMaxPerCliente;
    int numClienti;
    int numPrestiti;
    int totalePrestiti;

    Banca(String nome, int ammontareTotalePrestabile, int ammontareMaxPerCliente) {
        this.nome = nome;
        this.ammontareTotalePrestabile = ammontareTotalePrestabile <= 0 ? AMMONTARE_TOTALE_PRESTABILE_DEFAULT
                : ammontareTotalePrestabile;
        this.ammontareMaxPerCliente = ammontareMaxPerCliente <= 0 ? (int) (this.ammontareTotalePrestabile * 0.1)
                : ammontareMaxPerCliente;
        this.clienti = new Cliente[MAX_CLIENTI];
        this.prestiti = new Prestito[MAX_PRESTITI];
    }

    Banca(String nome, int ammontareTotalePrestabile) {
        this(nome, ammontareTotalePrestabile, (int) (ammontareTotalePrestabile * 0.1));
    }

    boolean aggiungiCliente(Cliente cliente) {
        if (cliente == null || numClienti >= clienti.length || isClienteEsistente(cliente))
            return false;

        clienti[numClienti++] = cliente;
        return true;
    }

    boolean isClienteEsistente(Cliente cliente) {
        for (int i = 0; i < numClienti; i++) {
            if (clienti[i].confronta(cliente))
                return true;
        }
        return false;
    }

    int getTotalePrestiti(Cliente cliente) {
        int totale = 0;
        for (int i = 0; i < numPrestiti; i++) {
            if (prestiti[i].cliente.confronta(cliente)) {
                totale += prestiti[i].ammontare;
            }
        }
        return totale;
    }

    boolean aggiungiPrestito(Cliente cliente, int ammontare, int durata) {
        if (numPrestiti >= prestiti.length || cliente == null || !isClienteEsistente(cliente)
                || cliente.calcolaEta() < 18) {
            return false;
        }

        int totaleClienteDopoNuovoPrestito = getTotalePrestiti(cliente) + ammontare;
        if (totaleClienteDopoNuovoPrestito > ammontareMaxPerCliente)
            return false;

        if (totalePrestiti + ammontare > ammontareTotalePrestabile)
            return false;

        prestiti[numPrestiti++] = new Prestito(cliente, ammontare, durata);
        totalePrestiti += ammontare;
        return true;
    }

    boolean aggiungiPrestito(Cliente cliente, int ammontare) {
        return aggiungiPrestito(cliente, ammontare, DURATA_DEFAULT);
    }

    boolean contienePrestito(Prestito prestito) {
        for (int i = 0; i < numPrestiti; i++) {
            if (prestiti[i].confronta(prestito)) {
                return true;
            }
        }
        return false;
    }

    void stampaReport() {
        System.out.println("\n=== REPORT BANCA " + nome + " ===");
        System.out.println("Ammontare totale prestabile: " + ammontareTotalePrestabile + " CHF");
        System.out.println("Ammontare massimo per cliente: " + ammontareMaxPerCliente + " CHF");
        System.out.println("Numero clienti: " + numClienti);
        System.out.println("Numero prestiti: " + numPrestiti);
        System.out.println("Totale prestiti erogati: " + totalePrestiti + " CHF");

        System.out.println("\nElenco Clienti:");
        for (int i = 0; i < numClienti; i++) {
            clienti[i].mostra();
        }

        System.out.println("\nElenco Prestiti:");
        for (int i = 0; i < numPrestiti; i++) {
            prestiti[i].mostra();
        }
    }
}

public class BancaTest {
    static int generaAmmontareRandom() {
        // Genera tra 1'000 e 50'000 CHF (estremi inclusi)

        Random random = new Random();
        return random.nextInt(50000 - 1000 + 1) + 1000;
    }

    static void tentaAggiungiCliente(Banca banca, Cliente cliente) {
        if (banca.aggiungiCliente(cliente)) {
            System.out.println("Cliente " + cliente.nome + " aggiunto con successo");
        } else {
            System.out.println("Impossibile aggiungere il cliente " + cliente.nome);
        }
    }

    static void tentaAggiungiPrestito(Banca banca, Cliente cliente, int ammontare, int durata) {
        if (banca.aggiungiPrestito(cliente, ammontare, durata)) {
            System.out.println("Prestito di " + ammontare + " CHF a " + cliente.nome + " approvato");
        } else {
            System.out.println("Prestito di " + ammontare + " CHF a " + cliente.nome + " rifiutato");
        }
    }

    static void tentaAggiungiPrestito(Banca banca, Cliente cliente, int ammontare) {
        if (banca.aggiungiPrestito(cliente, ammontare)) {
            System.out.println("Prestito di " + ammontare + " CHF a " + cliente.nome + " approvato");
        } else {
            System.out.println("Prestito di " + ammontare + " CHF a " + cliente.nome + " rifiutato");
        }
    }

    public static void main(String[] args) {
        // Banca(String nome, int ammontareTotalePrestabile)
        Banca banca1 = new Banca("BancaTest1", 2000000);

        Cliente mario = new Cliente("Mario Rossi", "mario@email.com", 1980);
        Cliente luigi = new Cliente("Luigi Verdi", "luigi@email.com", 1990);
        Cliente giovane = new Cliente("Pietro Bianchi", "pietro@email.com", 2010);
        Cliente marioClone = new Cliente("Mario Rossi", "mario@email.com", 1980);

        System.out.println("=== Test BancaTest1 (limite cliente automatico) ===");
        tentaAggiungiCliente(banca1, mario); // OK
        tentaAggiungiCliente(banca1, luigi); // OK
        tentaAggiungiCliente(banca1, giovane); // OK
        tentaAggiungiCliente(banca1, marioClone); // Fallisce (duplicato)

        // Test prestiti
        int prestito1 = generaAmmontareRandom();
        tentaAggiungiPrestito(banca1, mario, prestito1, 5); // OK
        tentaAggiungiPrestito(banca1, mario, generaAmmontareRandom()); // OK (durata default)
        tentaAggiungiPrestito(banca1, mario, 900000000, 15); // Fallisce (limite cliente)
        tentaAggiungiPrestito(banca1, luigi, generaAmmontareRandom(), 7); // OK
        tentaAggiungiPrestito(banca1, giovane, generaAmmontareRandom(), 5); // Fallisce (età)

        // Test ricerca prestito
        Prestito prestitoCercato = new Prestito(mario, prestito1, 5);
        System.out.println("\nRicerca prestito:");
        System.out.println((banca1.contienePrestito(prestitoCercato) ? "trovato" : "non trovato"));

        // Stampa report finale
        banca1.stampaReport();

        System.out.println("\n=== Test BancaTest2 (limite cliente specificato) ===");
        // Banca(String nome, int ammontareTotalePrestabile, int ammontareMaxPerCliente)
        Banca banca2 = new Banca("BancaTest2", 1000000, 50000);
        tentaAggiungiCliente(banca2, mario);
        tentaAggiungiPrestito(banca2, mario, 45000, 5); // OK perché sotto il limite di 50000
        tentaAggiungiPrestito(banca2, mario, 10000); // Fallisce (limite cliente)
        banca2.stampaReport();
    }
}