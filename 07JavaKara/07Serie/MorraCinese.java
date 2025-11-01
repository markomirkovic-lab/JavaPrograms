import java.util.Scanner;

/**
 * Enumerativo per i segni della morra cinese
 */
enum SegnoMorraCinese {
    CARTA, FORBICE, SASSO
}

/**
 * Programma che permette di giocare alla morra cinese contro il computer.
 */
public class MorraCinese {

    /**
     * Procedura main - parte principale del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Richiedi e controlla il numero di partite da effettuare
        System.out.print("Numero di partite: ");
        int nrPartite = input.nextInt();
        while (nrPartite <= 0) {
            System.out.print("Immissione errata! Numero di partite: ");
            nrPartite = input.nextInt();
        }
        // Svuota il buffer
        input.nextLine();

        boolean[] vittoriePC = new boolean[nrPartite];
        SegnoMorraCinese[] segniMorra = SegnoMorraCinese.values();

        // Inizia il gioco ...
        for (int i = 0; i < nrPartite; ) {
            System.out.println("\nPartita " + (i + 1));
            // Richiedi la scelta al giocatore (controllando il valore immesso)
            boolean segnoValido = false;
            String scelta;
            do {
                System.out.print("Scelta giocatore (");
                for (int j = 0; j < segniMorra.length; j++) {
                    System.out.print(("" + segniMorra[j]).toLowerCase());
                    if (j < segniMorra.length - 1)
                        System.out.print(", ");
                }
                System.out.print("): ");
                scelta = input.nextLine();
                segnoValido = false;
                for (SegnoMorraCinese segno : segniMorra)
                    if (scelta.equalsIgnoreCase("" + segno)) {
                        segnoValido = true;
                        break;
                    }
            } while (!segnoValido);
            SegnoMorraCinese segnoGiocatore = SegnoMorraCinese.valueOf(scelta.toUpperCase());

            // Calcola il segno del PC (in maniera casuale)
            SegnoMorraCinese segnoPC = segniMorra[(int) (Math.random() * 30) % segniMorra.length];

            System.out.println("Giocatore: " + segnoGiocatore);
            System.out.println("PC: " + segnoPC);

            if (segnoGiocatore == segnoPC) {
                // Partita pari; viene ripetuta
                System.out.println("Nessun vincitore, la partita viene ripetuta!");
            } else {
                // Stabilisci e mostra un vincitore, aggiorna l'array delle vittorie
                switch (segnoGiocatore) {
                    case CARTA:
                        vittoriePC[i] = segnoPC == SegnoMorraCinese.FORBICE;
                        break;
                    case FORBICE:
                        vittoriePC[i] = segnoPC == SegnoMorraCinese.SASSO;
                        break;
                    case SASSO:
                        vittoriePC[i] = segnoPC == SegnoMorraCinese.CARTA;
                        break;
                }
                System.out.println("Vincitore: " + (vittoriePC[i] ? "PC" : "Giocatore"));
                i++;
            }
        }
        input.close();

        // Calcola e mostra le statistiche
        System.out.println("\nStatistiche:");
        System.out.println("Numero di partite: " + nrPartite);

        int partiteVinteGiocatore = 0;
        for (boolean vittoriaPC : vittoriePC)
            if (!vittoriaPC)
                partiteVinteGiocatore++;

        System.out.println("Vittorie giocatore: " + partiteVinteGiocatore + " ("
                + (partiteVinteGiocatore * 100. / nrPartite) + "%)");
        System.out.println("Vittorie PC: " + (nrPartite - partiteVinteGiocatore) + " ("
                + ((nrPartite - partiteVinteGiocatore) * 100. / nrPartite) + "%)");
    }
}
