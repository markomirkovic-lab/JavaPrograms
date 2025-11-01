import java.util.Scanner;

/*
 * Esercizio 1 - Negozio di Sci
 * 
 * Scrivete un programma e le necessarie classi di appoggio che un rivenditore di sci
 * potrà utilizzare per gestire il magazzino. Il programma dovrà permettere
 * l’immagazzinamento e la rimozione dei dati concernenti gli sci (marca, modello,
 * colore, lunghezza). Inoltre, il programma dovrà dare la possibilità di stampare a
 * schermo l’elenco di tutti gli sci presenti in magazzino.
 */

/**
 * Classe che rappresenta un paio di sci (marca, modello, colore e lunghezza)
 */
class Sci {
    int id;
    String marca;
    String modello;
    String colore;
    double lunghezza;

    Sci(int id, String marca, String modello, String colore, double lunghezza) {
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.lunghezza = lunghezza == 0 ? Math.random() * 1.5 + 1.0 : Math.abs(lunghezza);
    }
}

/**
 * Classe che rappresenta un magazzino di sci
 */
class Magazzino {
    Sci[] sci = new Sci[20];
    int cntSci;
}

/**
 * Classe NegozioDiSci per le classi Sci e Magazzino.
 * Permette l'aggiunta e rimozione dei sci dal magazzino e la visualizzazione del magazzino.
 */
public class Es1NegozioDiSci {
    // Inizializzazione scanner
    // private static
    private static Scanner input = new Scanner(System.in);

    /**
     * Aggiunge un paio di sci
     * @param magazzino magazzino dove aggiungere gli sci
     * @param sci       id del paio di sci da aggiungere al magazzino
     */
    private static void aggiungiSci(Magazzino magazzino, Sci sci) {
        // Controlla se magazzino e' pieno
        if(magazzino.cntSci == magazzino.sci.length) {
            System.out.println("Magazzino pieno");
            return;
        }

        //Cerca un posto libero dove aggiungere gli sci
        for(int i = 0; i < magazzino.sci.length; i++) {
            if(magazzino.sci[i] == null)  {
                magazzino.sci[i]=sci;
                break;
            }
        }
        // Incrementa il numero di sci presenti nel magazzino
        magazzino.cntSci++;
    }

    /**
     * Rimuove un paio di sci
     * @param magazzino magazzino dove rimuovere gli sci
     * @param id        id del paio di sci da rimuovere dal magazzino
     */
    private static void rimuoviSci(Magazzino magazzino, int id) {
        // Controlla se il magazzino e' vuoto
        if(magazzino.cntSci == 0) {
            System.out.println("Magazzino vuoto");
            return;
        }

        // Cerca il paio di sci con un determinato id
        boolean trovato = false;
        for(int i = 0; i < magazzino.sci.length; i++) {
            if(magazzino.sci[i] == null) {
                continue;
            }
            
            if(magazzino.sci[i].id == id) {
                // Rimuovi sci dal magazzino
                magazzino.sci[i] = null;
                trovato = true;
                magazzino.cntSci--;
                break;
            }
        }
        // Mostra un messaggio se gli sci con l'id dato non sono stati trovati nel magazzino
        if(!trovato){
            System.out.println("Sci non trovato");
        }


    }
    
    /**
     * Mostra il contenuto del magazzino
     * @param magazzino magazzino da visualizzare
     */
    private static void mostraMagazzino(Magazzino magazzino){
        // Controlla se magazzino e' vuoto
        if(magazzino.cntSci == 0) {
            System.out.println("Magazzino vuoto");
            return;
        }

        // Mostra tutti gli sci presenti nel magazzino
        for(Sci sci : magazzino.sci) {
            if(sci == null)
                continue;
            mostraSci(sci);
        }
    }

    /**
     * Mostra le caratteristiche degli sci
     * @param sci sci da visualizzare
     */
    private static void mostraSci(Sci sci) {
        System.out.println("ID: " + sci.id +
                           ", Marca: " + sci.marca + 
                           ", Modello: " + sci.modello +
                           ", Colore: " + sci.colore + 
                           ", Lunghezza: " + sci.lunghezza);
    }


    /**
     * Mostra il menu e ritorna la scelta fatta dall'utente
     * @return la scelta fatta dall'utente
     */
    private static int menu() {
        System.out.println("\n1. Aggiungi sci");
        System.out.println("2. Rimuovi sci");
        System.out.println("3. Mostra magazzino");
        System.out.println("0. Esci");
        
        // Leggi la scelta effettuata assicurandosi che sia compresa tra 0 e 3
        int scelta;
        do {
            System.out.print("Scelta: ");
            scelta = input.nextInt();
        } while(scelta < 0 || scelta > 3);
        // Svuota il buffer
        input.nextLine();
        return scelta;
    }


    /**
     * Procedura main - programma principale
     * @param args
     */
    public static void main(String[] args) {
 
        // Creazione nuovo magazzino
        Magazzino magazzino = new Magazzino();

        // Mostra il menu e leggi la scelta effettuata
        int scelta = menu();
        System.out.println();

        while (scelta !=0) {
            switch (scelta) {

                // Aggiungi sci
                case 1:
                    // Controlla se puo' essere aggiunto un nuovo paio di sci
                    if(magazzino.cntSci == magazzino.sci.length) {
                        System.out.println("Magazzino pieno");
                        break;
                    }

                    // Crea gli sci ed inizializza i campi con i valori inseriti dall'utente
                    System.out.println("ID: ");
                    int id = input.nextInt();
                    input.nextLine();// Pulitura buffer per le stringe
                    System.out.print("Marca: ");
                    String marca = input.nextLine();
                    System.out.print("Modello: ");
                    String modello = input.nextLine();
                    System.out.print("Colore: ");
                    String colore = input.nextLine();
                    System.out.print("Lunghezza: ");
                    double lunghezza = input.nextDouble();

                    // Svuota il buffer
                    input.nextLine();

                    Sci sci = new Sci(id, marca, modello, colore, lunghezza);

                    // Aggungi gli sci al magazzino
                    aggiungiSci(magazzino, sci);
                    break;

                // Rimuovi sci
                case 2:
                    // Controlla se il magazzino e' vuoto
                    if(magazzino.cntSci == 0) {
                        System.out.println("Magazzino vuoto");
                        break;
                    }

                    // Richiedi l'identificatore degli sci da rimuovere
                    System.out.print("ID sci: ");
                    int idSci = input.nextInt();
                    
                    // Svuota il buffer
                    input.nextLine();

                    // Rimuovi gli sci dal magazzino
                    rimuoviSci(magazzino, idSci);
                    break;

                // Mostra magazzino
                case 3:
                    // Visualizza il contenuto del magazzino
                    mostraMagazzino(magazzino);
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


        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\12OggettiDefinireNuviTipiDiDato\12EsercitazioneODNTDD> java Es1NegozioDiSci

        1. Aggiungi sci
        2. Rimuovi sci
        3. Mostra magazzino
        0. Esci
        Scelta: 1

        ID: 
        0001
        Marca: Volant
        Modello: Xf
        Colore: Bianco
        Lunghezza: 1.75

        1. Aggiungi sci
        2. Rimuovi sci
        3. Mostra magazzino
        0. Esci
        Scelta: 1

        ID:
        0002
        Marca: Volant
        Modello: f2
        Colore: silver
        Lunghezza: 
        0

        1. Aggiungi sci
        2. Rimuovi sci
        3. Mostra magazzino
        0. Esci
        Scelta: 3

        ID: 1, Marca: Volant, Modello: Xf, Colore: Bianco, Lunghezza: 1.75
        ID: 2, Marca: Volant, Modello: f2, Colore: silver, Lunghezza: 1.6968790180214788

        1. Aggiungi sci
        2. Rimuovi sci
        3. Mostra magazzino
        0. Esci
        Scelta: 2

        ID sci: 2

        1. Aggiungi sci
        2. Rimuovi sci
        3. Mostra magazzino
        0. Esci
        Scelta: 3

        ID: 1, Marca: Volant, Modello: Xf, Colore: Bianco, Lunghezza: 1.75

        1. Aggiungi sci
        2. Rimuovi sci
        3. Mostra magazzino
        0. Esci
        Scelta: 0

        */

    }
    
}
