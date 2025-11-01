import java.util.Scanner;

/**
 * Esercizio 2 - Azienda
 * Scrivete due classi: la prima per immagazzinare i dati concernenti un impiegato
 * (nome, cognome, età, funzione e salario), la seconda per rappresentare un’azienda
 * (direttore e dipendenti). In seguito, sviluppate un programma che, utilizzando le classi
 * create in precedenza, permetta di definire un’azienda specificandone il direttore e i
 * suoi collaboratori. Inoltre, il programma dovrà permettere l’aggiunta o la rimozione di
 * uno o più dipendenti, così come la stampa a schermo dell’intera azienda
 */

/**
 * Enumerative che permette di definire un’azienda specificandone il direttore e i 
 * suoi collaboratori.
 */
enum Funzione {
    DIRETTORE, CAPOREPARTO, SEGRETARIO, CONTABILE
}

/**
 * Classe Impiegato che rappresenta i dati: nome, cognome, età, funzione e salario
 */
class Impiegato {
    String nome;
    String cognome;
    int eta;
    Funzione funzione;
    double salario;

    Impiegato(String nome, String cognome, int eta, Funzione funzione, double salario) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta == 0 ? (int) (Math.random() * 46 + 20) : Math.abs(eta);//20-65
        this.funzione = funzione;
        this.salario = salario == 0 ? Math.random() * 250000 + 30000 : Math.abs(salario);//30.000-280.0000
    }
}

/**
 * Classe Azienda che rappresenta direttore e dipendenti
 */
class Azienda {
    Impiegato direttore;
    Impiegato[] impiegati = new Impiegato[10];
    int cntImpiegati;
}

public class Es2Azienda {
    // Inizializza lo scanner
    private static Scanner input = new Scanner(System.in);


    private static void aggiungiImpiegato(Azienda azienda, Impiegato impiegato) {
        // Controlla se il numero di impiegati massimi e' stato raggunto
        if(impiegato.funzione != Funzione.DIRETTORE && azienda.cntImpiegati == azienda.impiegati.length) {
            System.out.println("Posti di lavoro esauriti");
            return;
        }

        // Controlla se l'impiegato che si vuole aggiungere e' il direttore
        if(impiegato.funzione == Funzione.DIRETTORE) {
            azienda.direttore = impiegato;
            return;
        }

        //L'impiegato non e' il direttore, aggiungilo ai vari impiegati
        for(int i = 0; i < azienda.impiegati.length; i++) {
            if(azienda.impiegati[i] == null) {
                azienda.impiegati[i] = impiegato;
                break;
            }
        }
        // Incrementa il numero di impiegati dell'azienda
        azienda.cntImpiegati++;
    }

    private static void rimuoviImpiegato(Azienda azienda, String nome, String cognome) {
        // Controlla se l'azienda ha dei dipendenti
        if(azienda.cntImpiegati == 0 && azienda.direttore == null) {
            System.out.println("Nessun dipendente");
            return;
        }

        // Controlla se l'impiegato da rimuovere e' il direttore
        if(azienda.direttore != null) {
            Impiegato impiegato = azienda.direttore;
            if(impiegato.nome.equals(nome) && impiegato.cognome.equals(cognome)) {
                azienda.direttore = null;
                return;
            }
        }

        // Cerca e rimuovi l'impiegato desiderato
        boolean trovato = false;
        for(int i = 0; i < azienda.impiegati.length; i++) {
            Impiegato impiegato = azienda.impiegati[i];
            if(impiegato == null) {
                continue;
            }
            if(impiegato.nome.equals(nome) && impiegato.cognome.equals(cognome)) {
                azienda.impiegati[i] = null;
                trovato = true;
                azienda.cntImpiegati--;
                break;
            }
        }
        if(!trovato) {
            System.out.println("Impiegato non trovato");
        }
    }

    private static void mostraAzienda(Azienda azienda) {
        // Controlla se l'azienda ha dei dipendenti
        if(azienda.cntImpiegati == 0 && azienda.direttore == null) {
            System.out.println("Nessun dipendente");
            return;
        }

        // Mostra il direttore (se presente)
        if(azienda.direttore == null) {
            System.out.println("Direttore non presente");
        } else {
            System.out.println("Direttore: ");
            mostraImpiegato(azienda.direttore);
        }

        // Mostra i vari impiegati
        for(Impiegato impiegato : azienda.impiegati) {
                if(impiegato == null) {
                    continue;
                }
            mostraImpiegato(impiegato);
        }
    }

    private static void mostraImpiegato(Impiegato impiegato) {
        System.out.println("Nome: " + impiegato.nome + ", Cognome: " + impiegato.cognome +
        ", Eta': " + impiegato.eta + ", Funzione: " + impiegato.funzione + 
        ", Salario: " + impiegato.salario);
    }

    private static int menu() {
        System.out.println("\n1. Aggiungi dipendente");
		System.out.println("2. Rimuovi dipendente");
		System.out.println("3. Mostra azienda");
		System.out.println("0. Esci");

        // Leggi la scelta effettuata ed assicurati che sia compresa tra 0 e 3
        int scelta;
        do {
            System.out.print("Scelta: ");
            scelta = input.nextInt();
        } while(scelta < 0 || scelta > 3);
        // Svuota il buffer
        input.nextLine();
        return scelta;
    }


    public static void main(String[] args) {
        
        // Crea una nuova azienda
        Azienda azienda = new Azienda();

        // Mostra il menu e leggi la scelta effettuata
        int scelta = menu();
        System.out.println();

        while(scelta != 0) {
            switch (scelta) {
                // Aggungi dipendente
                case 1:
                    // Controlla se ci sono ancora posti liberi
                    if(azienda.cntImpiegati == azienda.impiegati.length && azienda.direttore != null) {
                        System.out.println("Posti di lavoro esauriti");
                        break;
                    }
                    // Crea un nuovo impiegato ed inizializza i campi con le informazioni inserite
                    // dall'utente

                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Cognome: ");
                    String cognome = input.nextLine();
                    System.out.print("Eta': ");
                    int eta = input.nextInt();
                    // Svuolta il buffer
                    input.nextLine();
                    System.out.print("Funzione (DIRETTORE, CAPOREPARTO, SEGRETARIO, CONTABILE): ");
                    Funzione funzione = Funzione.valueOf(input.nextLine().toUpperCase());
                    System.out.print("Salario: ");
                    double salario = input.nextDouble();
                    // Svuolta il buffer
                    input.nextLine();

                    Impiegato impiegato = new Impiegato(nome, cognome, eta, funzione, salario);

                    // Aggiungi l'impiegato all'azienda
                    aggiungiImpiegato(azienda, impiegato);
                    break;

                // Rimuovi dipendente
                case 2:
                    // Controlla se l'azienda ha degli impiegati
                    if(azienda.cntImpiegati == 0 && azienda.direttore == null) {
                        System.out.println("Nessun dipendente");
                        break;
                    }

                    // Richiedi il nome e il cognome dell'impiegato da rimuovere
                    System.out.print("Nome: ");
                    String nomeDipendente = input.nextLine();
                    System.out.print("Cognome: ");
                    String cognomeDipendente = input.nextLine();

                    // Rimuovi l'impiegato dall'azienda
                    rimuoviImpiegato(azienda, nomeDipendente, cognomeDipendente);
                    break;
                
                // Mostra azienda
                case 3:
                    // Mostra dipendenti dell'azienda
                    mostraAzienda(azienda);
                    break;
            
                //default:
                //    break;
            }
            // Mostra il menu e leggi la scelta effettuata
            scelta = menu();
            System.out.println();

        }
        // Chiusura scanner
        input.close();
    }
    
}
