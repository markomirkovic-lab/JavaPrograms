import java.util.Scanner;

/**
 * Esercizio 3 - Registro di classe
 * Scrivete un programma e le necessarie classi di appoggio che permettano di creare
 * uno o più registri di classe. Ogni registro dovrà contenere il nome della classe, il
 * numero dell’aula e l’elenco degli studenti. Per ogni studente dovrà essere possibile
 * inserire il nome, il cognome e il numero di matricola. Inoltre, il programma dovrà
 * fornire la possibilità di visualizzare l’intero registro di classe e di ricercare un
 * determinato studente, in base al cognome, all’interno del registro.
*/

// Classe registro di classe
class RegistroDiClasse {
    String nomeClasse;
    int numeroAula;
    Studente[] studenti = new Studente[30];
    int cntStudenti;

    RegistroDiClasse(String nomeClasse, int numeroAula) {
        this.nomeClasse = nomeClasse;
        this.numeroAula = numeroAula;
    }
}

// Classe studente
class Studente {
    String nome;
    String cognome;
    String matricola;

    Studente(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }
}


public class Es3RegistroDiClasse {
    
    // Inizializza lo scanner per leggere input utente
    private static Scanner input = new Scanner(System.in);


    private static void aggiungiStudente(RegistroDiClasse registroDiClasse, Studente studente) {
        if(registroDiClasse.cntStudenti == registroDiClasse.studenti.length) {
            System.out.println("Registro completo");
            return;
        }
        // aggiungi studente
        registroDiClasse.studenti[registroDiClasse.cntStudenti++] = studente;
    }

    //                                                                     i plurale
    private static RegistroDiClasse cercaRegistro(RegistroDiClasse[] registriDiClasse, String nomeClasse) {
        for(RegistroDiClasse registroDiClasse : registriDiClasse) {
            if(registroDiClasse == null) {
                continue;
            }
            if(registroDiClasse.nomeClasse.equals(nomeClasse)){
                return registroDiClasse;
            }
        }

        return null;
    }

    private static Studente cercaStudente(RegistroDiClasse registroDiClasse, String cognome, String nome) {
        if(registroDiClasse == null) {
            return null;
        }
        for(Studente studente : registroDiClasse.studenti) {
            if(studente == null) {
                continue;
            }
            if(studente.nome.equals(nome) && studente.cognome.equals(cognome)) {
                return studente;
            }
        }

        return null;
    }

    private static void mostraRegistro(RegistroDiClasse registroDiClasse) {
        if(registroDiClasse == null) {
            System.out.println("Registro non esiste");
            return;
        }
        // Mostra le informazioni del registro di classe
        System.out.println("Nome Classe: " + registroDiClasse.nomeClasse + 
        ", Numero aula: " + registroDiClasse.numeroAula);

        //--

        if(registroDiClasse.cntStudenti == 0) {
            System.out.println("Nessun studente presente");
            return;
        }
        System.out.println("Studenti: ");
        // Mostra studenti presenti nel registro di classe
        for(int i = 0; i < registroDiClasse.cntStudenti; i++) {
            //mostra studente
            mostraStudente(registroDiClasse.studenti[i]);
        }
    }

    private static void mostraStudente(Studente studente) {
        if(studente == null) {
            System.out.println("Studente non presente");
            return;
        }
        System.out.println("\nNome: " + studente.nome + ", Cognome: " + studente.cognome +
        ", matricola: " + studente.matricola);
    }

    private static int menu() {
        System.out.println("\n1. Aggiungi registro");
        System.out.println("2. Mostra registro");
        System.out.println("3. Cerca studente");
        System.out.println("0. Esci");

        // Leggi la scelta effettuata ed assicurati che sia compresa tra 
        int scelta;

        do {
            System.out.print("Scelta: ");
            scelta = input.nextInt();
        } while(scelta < 0 || scelta > 3);
        // Svuota buffer
        input.nextLine();

        return scelta;
    }

    
    public static void main(String[] args) {

        // Crea array che possa contenere 10 registri di classe
        //                        i plurale
        RegistroDiClasse[] registriDiClasse= new RegistroDiClasse[10];
        int cntRegistri = 0;

        // Mostra il menu e leggi la scelta effettuata
        int scelta = menu();
        System.out.println();

        while(scelta != 0) {
            switch (scelta) {
                // Aggiungi registro
                case 1:
                    if(cntRegistri == registriDiClasse.length) {
                        System.out.println("Registri di classe esauriti");
                        break;
                    }       

                    // Crea un nuovo registro di classe ed inizializza i campi con i valori
                    // inseriti dall'utente
                    System.out.print("Nome classe: ");
                    String nomeClasse = input.nextLine();
                    System.out.print("Numero aula: ");
                    int numeroAula = input.nextInt();
                    // Svuota il buffer
                    input.nextLine();

                    RegistroDiClasse registroDiClasse = new RegistroDiClasse(nomeClasse, numeroAula);

                    // Richiedi le informazioni dei singoli studenti
                    System.out.println("Studenti (nome voto per terminare)");
                    for(int i = 0; i < registroDiClasse.studenti.length; i++) {
                        System.out.print("Nome: ");
                        String nome = input.nextLine();
                        if(nome.equals("")) {
                            break;
                        }
                        // Crea un nuovo studente ed inizializza i campi con i valori immessi
                        // dall'utente
                        System.out.print("Cognome: ");
                        String cognome = input.nextLine();
                        System.out.print("Numero matricola: ");
                        String matricola = input.nextLine();
                        Studente studente = new Studente(nome, cognome, matricola);
                        // Aggiungi lo studente al registro di classe
                        //                      o singolare
                        aggiungiStudente(registroDiClasse, studente);
                    }
                    // Aggiungi il registro di classe all'array
                    //     i plurale                         o singolare: RegistroDiClasse registroDiClasse = new RegistroDiClasse(nomeClasse, numeroAula);
                    registriDiClasse[cntRegistri++] = registroDiClasse;
                    break;

                // Mostra registro
                case 2:
                    if(cntRegistri == 0) {
                        System.out.println("Nessun registro di classe presente");
                        break;
                    }
                    // Mostra i registri presenti
                    for(int i = 0; i < cntRegistri; i++) {//        i plurale: RegistroDiClasse[] registriDiClasse= new RegistroDiClasse[10];
                        System.out.println(i + ": classe " + registriDiClasse[i].nomeClasse);
                    }

                    // Richiedi il numero del registro di classe da visualizzare
                    System.out.print("Numero registro di classe: ");
                    int numeroRegistro = input.nextInt();
                    // Svuota il buffer
                    input.nextLine();

                    // Controlla se il registro di classe e' presente. Se lo e', mostrane il
                    // contenuto
                    if(numeroRegistro < 0 || numeroRegistro >= registriDiClasse.length
                        || registriDiClasse[numeroRegistro] == null) {
                        System.out.println("Registro non presente");
                    } else {//                i plurale: RegistroDiClasse[] registriDiClasse= new RegistroDiClasse[10];
                        mostraRegistro(registriDiClasse[numeroRegistro]);
                    }
                    break;

                // Cerca studente
                case 3:
                    if(cntRegistri == 0) {
                        System.out.println("Nessun registro di classe presente");
                        break;
                    }
                    // Richiedi il nome della classe all'interno della quale cercare lo
                    // studente
                    System.out.print("Nome della classe: ");
                    String nomeClasseRegistro = input.nextLine();
                    //                                               i plurale: RegistroDiClasse[] registriDiClasse= new RegistroDiClasse[10];
                    RegistroDiClasse registro = cercaRegistro(registriDiClasse, nomeClasseRegistro);
                    if(registro == null) {
                        System.out.println("Registro di classe non trovato");
                        break;
                    }

                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Cognome: ");
                    String cogonome = input.nextLine();

                    // Cerca lo studente
                    Studente studente = cercaStudente(registro, cogonome, nome);
                    mostraStudente(studente);

                    break;
            
                //default:
                //    break;
            }

            // Mostra il menu e leggi la scelta effettuata
            scelta = menu();
            System.out.println();
        }
        // Chiudi scanner
        input.close();
    }
}
