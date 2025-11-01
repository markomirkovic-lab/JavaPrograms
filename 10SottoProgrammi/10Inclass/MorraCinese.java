import java.util.Scanner;

enum SegnoMorraCinese {
    CARTA, FORBICE, SASSO
}

enum Risultato {
    PAREGGIO, VITTORIA_PC, VITTORIA_GIOCATORE
}

public class MorraCinese {

    /**
     * Funzione per leggere un intero. Verifica che l'input sia di tipo intero e nel
     * range [min, max]
     * 
     * @param scanner   scanner
     * @param messaggio messaggio da visualizzare prima della richiesta di
     *                  immissione
     * @param min       valore
     * @param max
     * @return
     */
    private static int leggiValoreIntero(Scanner scanner, String messaggio, int min, int max) {
        int numero = 0;
        boolean inputValido = false;
        do {
            System.out.print(messaggio);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= min && numero <= max) {
                    inputValido = true;
                } else {
                    System.out.println("Errore: inserire un numero tra " + min + " e " + max);
                }
            } else {
                System.out.println("Errore: inserire un numero intero valido");
            }
            scanner.nextLine(); // Pulisce il buffer
        } while (!inputValido);
        return numero;
    }

    private static void mostraMenuOpzioni(SegnoMorraCinese[] segniMorra) {
        System.out.print("Scelta giocatore (");
        for (int j = 0; j < segniMorra.length; j++) {
            System.out.print(("" + segniMorra[j]).toLowerCase());
            if (j < segniMorra.length - 1)
                System.out.print(", ");
        }
        System.out.print("): ");
    }

    private static SegnoMorraCinese leggiSceltaGiocatore(Scanner scanner, SegnoMorraCinese[] segniMorra) {
        boolean segnoValido;
        String scelta;
        do {
            scelta = scanner.nextLine();
            segnoValido = false;
            for (SegnoMorraCinese segno : segniMorra) {
                if (scelta.equalsIgnoreCase("" + segno)) {
                    segnoValido = true;
                    break;
                }
            }
            if (!segnoValido) {
                System.out.println("Valore immesso non valido");
                System.out.print("Inserisci nuovamente il valore scelto: ");
            }
        } while (!segnoValido);

        return SegnoMorraCinese.valueOf(scelta.toUpperCase());
    }

    private static Risultato vincitore(SegnoMorraCinese segnoGiocatore, SegnoMorraCinese segnoPC) {
        if (segnoGiocatore == segnoPC) {
            return Risultato.PAREGGIO;
        }

        Risultato risultato = switch (segnoGiocatore) {
            case CARTA -> segnoPC == SegnoMorraCinese.FORBICE ? Risultato.VITTORIA_PC : Risultato.VITTORIA_GIOCATORE;
            case FORBICE -> segnoPC == SegnoMorraCinese.SASSO ? Risultato.VITTORIA_PC : Risultato.VITTORIA_GIOCATORE;
            case SASSO -> segnoPC == SegnoMorraCinese.CARTA ? Risultato.VITTORIA_PC : Risultato.VITTORIA_GIOCATORE;
        };

        return risultato;
    }

    private static boolean gestisciVincitore(boolean[] vittoriePC, int nrPartita, SegnoMorraCinese segnoGiocatore,
            SegnoMorraCinese segnoPC) {
        Risultato vittoria = vincitore(segnoGiocatore, segnoPC);

        if (vittoria == Risultato.PAREGGIO) {
            System.out.println("Nessun vincitore, la partita viene ripetuta!");
            return false;
        } else {
            vittoriePC[nrPartita] = (vittoria == Risultato.VITTORIA_PC);
            System.out.println("Vincitore: " + (vittoriePC[nrPartita] ? "PC" : "Giocatore"));
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente quante partite si vuole giocare
        int numeroPartite = leggiValoreIntero(input, "Inserisci il numero di partite: ", 1, Integer.MAX_VALUE);

        // Dichiarare array per salvarsi i risultati delle singole partite
        boolean[] vittoriePC = new boolean[numeroPartite];

        // Array contenente tutti i possibili segni della morra cinese
        SegnoMorraCinese[] segniMorra = SegnoMorraCinese.values();

        // Ciclo sulle partite
        int partiteConVincitore = 0;
        while (partiteConVincitore < numeroPartite) {
            // Visualizzare i valori possibili per l'input utente
            mostraMenuOpzioni(segniMorra);

            // Leggere la scelta/input fatta dall'utente
            SegnoMorraCinese segnoGiocatore = leggiSceltaGiocatore(input, segniMorra);

            // Generare la scelta del computer
            int indiceCasuale = (int) (Math.random() * 30) % segniMorra.length;
            SegnoMorraCinese segnoPC = segniMorra[indiceCasuale];

            // Mostrare i due segni
            System.out.println("Giocatore: " + segnoGiocatore);
            System.out.println("PC: " + segnoPC);

            // Decidere chi ha vinto e salvare il vincitore
            if (gestisciVincitore(vittoriePC, partiteConVincitore, segnoGiocatore, segnoPC)) {
                partiteConVincitore++;
            }

            System.out.println();
        }

        // Calcolare e mostrare le statistiche e chi ha vinto
        System.out.println("\nStatistiche:");
        System.out.println("Numero di partite: " + numeroPartite);

        int partiteVinteGiocatore = 0;

        for (boolean vittoriaPC : vittoriePC) {
            if (!vittoriaPC) {
                partiteVinteGiocatore++;
            }
        }

        System.out.println("Vittorie giocatore: " + partiteVinteGiocatore + " ("
                + (partiteVinteGiocatore * 100. / numeroPartite) + "%)");
        System.out.println("Vittorie PC: " + (numeroPartite - partiteVinteGiocatore) + " ("
                + ((numeroPartite - partiteVinteGiocatore) * 100. / numeroPartite) + "%)");

        input.close();

    }
}
