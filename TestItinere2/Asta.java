public class Asta {
    // Costanti predefinite
    static final int NUM_PERSONE = 4; // Numero di partecipanti
    static final int NUM_PRODOTTI = 3; // Numero di prodotti
    static final int VALORE_MINIMO = 100; // Valore minimo offerta
    static final int VALORE_MASSIMO = 999; // Valore massimo offerta

    public static void main(String[] args) {
        int[][] offerte = new int[NUM_PERSONE][NUM_PRODOTTI];

        // Popolazione dell'array con valori casuali utilizzando Math.random()
        for (int i = 0; i < offerte.length; i++) { // Iterazione sulle righe (persone)
            for (int j = 0; j < offerte[0].length; j++) { // Iterazione sulle colonne (prodotti)
                int offerta;
                boolean isDuplicato;
                do {
                    offerta = (int) (Math.random() * (VALORE_MASSIMO - VALORE_MINIMO + 1)) + VALORE_MINIMO;
                    isDuplicato = false;

                    // Verifica che non ci siano duplicati nella colonna `j`
                    for (int k = 0; k < i; k++) {
                        if (offerte[k][j] == offerta) {
                            isDuplicato = true;
                            break;
                        }
                    }
                } while (isDuplicato);

                offerte[i][j] = offerta;
            }
        }

        // 1. Stampa dell'array delle offerte
        System.out.println("Array delle offerte:");
        for (int i = 0; i < offerte.length; i++) {
            for (int j = 0; j < offerte[0].length; j++) {
                System.out.print(offerte[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // 2. Calcolo dell'offerta più bassa nell'intero array
        int offertaMinima = VALORE_MASSIMO + 1;
        int indiceMinPersona = -1;
        int indiceMinProdotto = -1;
        for (int i = 0; i < offerte.length; i++) {
            for (int j = 0; j < offerte[0].length; j++) {
                if (offerte[i][j] < offertaMinima) {
                    offertaMinima = offerte[i][j];
                    indiceMinPersona = i;
                    indiceMinProdotto = j;
                }
            }
        }
        System.out.println("Offerta più bassa: " + offertaMinima + ", Persona = " + indiceMinPersona + ", Prodotto = "
                + indiceMinProdotto);
        System.out.println();

        // 3. Partecipante che ha offerto di più in totale
        int sommaTotaleMax = 0;
        int indiceMaxPersona = -1;
        for (int i = 0; i < offerte.length; i++) {
            int sommaTotale = 0;
            for (int j = 0; j < offerte[0].length; j++) {
                sommaTotale += offerte[i][j];
            }
            if (sommaTotale > sommaTotaleMax) {
                sommaTotaleMax = sommaTotale;
                indiceMaxPersona = i;
            }
        }
        System.out.println("Partecipante che ha offerto di più in totale: Persona " + indiceMaxPersona + ", Totale = "
                + sommaTotaleMax);
        System.out.println();

        // 4. Calcolo del vincitore e dell'offerta massima per ogni prodotto
        int[] vincitori = new int[NUM_PRODOTTI];
        int[] offerteMassime = new int[NUM_PRODOTTI];
        for (int j = 0; j < offerte[0].length; j++) {
            int maxOfferta = VALORE_MINIMO - 1;
            int vincitore = -1;
            for (int i = 0; i < offerte.length; i++) {
                if (offerte[i][j] > maxOfferta) {
                    maxOfferta = offerte[i][j];
                    vincitore = i;
                }
            }
            vincitori[j] = vincitore;
            offerteMassime[j] = maxOfferta;

            System.out.println("Prodotto " + j + ": Vincitore = Persona " + vincitore + ", Offerta = " + maxOfferta);
        }
        System.out.println();

        // 5. Calcolo dell'incasso totale della casa d'aste
        int incassoTotale = 0;
        for (int j = 0; j < offerteMassime.length; j++) {
            incassoTotale += offerteMassime[j];
        }
        System.out.println("Incasso totale della casa d'aste: " + incassoTotale);
        System.out.println();

        // 6. Partecipante che ha vinto il maggior numero di aste
        int[] asteVintePerPersona = new int[NUM_PERSONE];
        for (int j = 0; j < vincitori.length; j++) {
            asteVintePerPersona[vincitori[j]]++;
        }
        int massimoAsteVinte = 0;
        int personaConPiuVittorie = -1;
        for (int i = 0; i < asteVintePerPersona.length; i++) {
            if (asteVintePerPersona[i] > massimoAsteVinte) {
                massimoAsteVinte = asteVintePerPersona[i];
                personaConPiuVittorie = i;
            }
        }
        System.out.println("Partecipante che ha vinto il maggior numero di aste: Persona " + personaConPiuVittorie
                + " con " + massimoAsteVinte + " aste vinte.");
    }
}