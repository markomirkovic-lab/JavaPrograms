
/*
Esercizio 10.4 - Archivio indirizzi web
Sviluppate un programma e le relative classi di appoggio per un archivio di indirizzi
web. Ogni voce nell’archivio sarà composta dal nome del sito, dall’indirizzo web e da
una breve descrizione. Il programma dovrà permettere la visualizzazione dell’intero
archivio così come l’aggiunta o la rimozione di una voce. Dovrà inoltre essere
possibile eseguire una ricerca all’interno dell’archivio in base al nome del sito o ad
una parola chiave contenuta nella descrizione.
*/

import java.util.Scanner;

/**
 * Clase che rappresenta una voce dell'archivio
 * (nome, indirizzo e descrizione del sito)
 */
class VoceArchivio {
    String nomeSito;
    String indirizzo;
    String descrizione;

    /**
     * Costruttore della classe VoceArchivio
     * @param nomeSito nome del sito
     * @param indirizzo indirizzo del sito
     * @param descrizione descrizione del sito
     */
    VoceArchivio(String nomeSito, String indirizzo, String descrizione) {
        this.nomeSito = nomeSito;
        this.indirizzo = indirizzo;
        this.descrizione = descrizione;
    }
}

/**
 * Classe che rappresenta l'archio d'indirizzi web (massimo 10 voci)
 */
class ArchivioWeb {
    // Numero massimo di voci nell'archivio
    static final int VOCI_MAX = 10;
    VoceArchivio[] voci = new VoceArchivio[VOCI_MAX];
    int vociCnt = 0;// counter
}


/**
 * Classe per la classe ArchivioWeb e le relative classi di appoggio.
 * Il programma dovrà permettere la visualizzazione dell’intero
 * archivio così come l’aggiunta o la rimozione di una voce. Dovrà inoltre essere 
 * possibile eseguire una ricerca all’interno dell’archivio in base al nome del 
 * sito o ad una parola chiave contenuta nella descrizione.
 */
public class Es10_4_ArchivioIndirizziWeb {

    // Scanner
    private static Scanner input;


    // Menu

    /**
     * Metodo che mostra il menu 
     * @return
     */
    private static int menu() {
        System.out.println();
        System.out.println("1. Aggiungi indirizzo");
        System.out.println("2. Rimuovi indirizzo");
        System.out.println("3. Visualizza archivio");
        System.out.println("4. Ricerca nome sito");
        System.out.println("5. Ricerca parola chiave");
        System.out.println("6. Esci");
        System.out.print("Scelta: ");
        int scelta = input.nextInt();
        // Svuota il buffer
        input.nextLine();
        return scelta;
    }

    // Aggiungi voce



    // Rimuovi voce



    // Ricerca voce (in base al nome del sito o 
    // ad una parola chiave contenuta nella descrizione del sito)






    // Visualizzo voci dell'archivio
    private static void visualilzzaArchivio(VoceArchivio voce) {
        System.out.println("Nome: " + voce.nomeSito);
        System.out.println("Indirizzo: " + voce.indirizzo);
        System.out.println("Descrizione: " + voce.descrizione);
    }

    
    public static void main(String[] args) {

        // Scanner
        input = new Scanner(System.in);

        // Creazione oggetto ArchioWeb
        ArchivioWeb archivio = new ArchivioWeb();

        // Visualizza menu
        int scelta = menu();

        // While/Switch
        while(scelta != 6) {
            switch (scelta) {
                case 1 -> aggiungiVoce(archivio);
                case 2 -> rimuoviVoce(archivio);
                case 3 -> visualilzzaArchivio(archivio);
                case 4 -> ricercaSito(archivio);
                case 5 -> ricercaParolaChiave(archivio);
                default -> System.out.println("Scelta non valida. Riprova: ");
              }
            scelta = menu();
        }






        // Scanner chiusura
        input.close();
        
    }
}
