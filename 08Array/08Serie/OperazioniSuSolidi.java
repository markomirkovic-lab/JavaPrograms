import java.util.Scanner;

/**
 * Classe che contiene procedure e funzioni per eseguire delle operazioni su dei solidi geometrici.
 */
public class OperazioniSuSolidi {

    /**
     * Richiedi i valori desiderati all'utente e restituisce tali valori memorizzati in un array.
     * Ripete la richiesta se il valore inserito è minore o uguale a 0.
     *
     * @param domande array contenente le domande da porre all'utilizzatore
     * @param input   Scanner utilizzato per leggere i dati da tastiera
     * @return restituisce un array di double contenente i valori immessi dall'utente
     */
    private static double[] chiediValori(String[] domande, Scanner input) {
        double[] valori = new double[domande.length];

        for (int i = 0; i < domande.length; i++) {
            String domanda = domande[i];
            System.out.print(domanda + ": ");
            double valore = input.nextDouble();
            while (valore <= 0) {
                System.out.print("ERRORE - " + domanda + ": ");
                valore = input.nextDouble();
            }
            valori[i] = valore;
        }
        return valori;
    }

    /**
     * Mostra a schermo il lato maggiore del parallelepipedo
     *
     * @param lati lati del parallelepipedo
     */
    private static void mostra(double[] lati) {
        double max = 0.0;
        for (double lato : lati)
            if (lato > max)
                max = lato;

        mostra("Il lato maggiore del parallelepipedo misura", max);
    }

    /**
     * Mostra a schermo la frase e il valore passati come parametro
     *
     * @param frase  frase descrittiva da mostrare a schermo
     * @param valore valore da mostrare a schermo
     */
    private static void mostra(String frase, double valore) {
        System.out.println(frase + ": " + valore);
    }

    /**
     * Calcola e restiruisce l'area della sfera.
     *
     * @param raggio raggio della sfera
     * @return restituisce l'area della sfera
     */
    private static double calcolaArea(double raggio) {
        return 4 * Math.PI * Math.pow(raggio, 2.);
    }

    /**
     * Calcola e restituisce l'area del cono.
     *
     * @param raggio  raggio del cono
     * @param altezza altezza del cono
     * @return restituisce l'area del cono
     */
    private static double calcolaArea(double raggio, double altezza) {
        double areaBase = Math.PI * Math.pow(raggio, 2.);
        double apotema = Math.sqrt(Math.pow(raggio, 2.) + Math.pow(altezza, 2.));
        double areaLaterale = Math.PI * raggio * apotema;
        return areaBase + areaLaterale;
    }

    /**
     * Calcola e restituisce l'area del parallelepipedo.
     *
     * @param lato1 primo lato del parallelepipedo
     * @param lato2 secondo lato del parallelepipedo
     * @param lato3 terzo lato del parallelepipedo
     * @return restituisce l'area del parallelepipedo
     */
    private static double calcolaArea(double lato1, double lato2, double lato3) {
        return 2. * lato1 * lato2 + 2. * lato1 * lato3 + 2. * lato2 * lato3;
    }

    /**
     * Calcola e restiruisce il volume della sfera.
     *
     * @param raggio raggio della sfera
     * @return restituisce il volume della sfera
     */
    private static double calcolaVolume(double raggio) {
        return 4. / 3. * Math.PI * Math.pow(raggio, 3.);
    }

    /**
     * Calcola e restituisce il volume del cono.
     *
     * @param raggio  raggio del cono
     * @param altezza altezza del cono
     * @return restituisce il volume del cono
     */
    private static double calcolaVolume(double raggio, double altezza) {
        return 1. / 3. * Math.PI * Math.pow(raggio, 2.) * altezza;
    }

    /**
     * Calcola e restituisce il volume del parallelepipedo.
     *
     * @param lato1 primo lato del parallelepipedo
     * @param lato2 secondo lato del parallelepipedo
     * @param lato3 terzo lato del parallelepipedo
     * @return restituisce il volume del parallelepipedo
     */
    private static double calcolaVolume(double lato1, double lato2, double lato3) {
        return lato1 * lato2 * lato3;
    }

    /**
     * Procedura main - parte principale del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Richiedi i valori di ogni solido all'utente
        double[] datiSfera = chiediValori(new String[]{"Raggio sfera"}, input);
        double[] datiCono = chiediValori(new String[]{"Raggio cono", "Altezza cono"}, input);
        double[] datiParallelepipedo = chiediValori(new String[]{"Lato1 parallelepipedo",
                "Lato2 parallelepipedo", "Lato3 parallelepipedo"}, input);

        input.close();

        // Calcola e mostra i risultati per i solidi desiderati
        System.out.println();

        System.out.println("Sfera -- raggio: " + datiSfera[0]);
        mostra("Il raggio della sfera misura", datiSfera[0]);
        System.out.println("Area: " + calcolaArea(datiSfera[0]));
        System.out.println("Volume: " + calcolaVolume(datiSfera[0]));

        System.out.println();

        System.out.println("Cono -- raggio: " + datiCono[0] + ", altezza: " + datiCono[1]);
        mostra("L'altezza del cono misura", datiCono[1]);
        System.out.println("Area: " + calcolaArea(datiCono[0], datiCono[1]));
        System.out.println("Volume: " + calcolaVolume(datiCono[0], datiCono[1]));

        System.out.println();

        System.out.println("Parallelepipedo -- lato1: " + datiParallelepipedo[0] + ", lato2: "
                + datiParallelepipedo[1] + ", lato3: " + datiParallelepipedo[2]);
        mostra(datiParallelepipedo);
        System.out.println("Area: "
                + calcolaArea(datiParallelepipedo[0], datiParallelepipedo[1], datiParallelepipedo[2]));
        System.out.println("Volume: "
                + calcolaVolume(datiParallelepipedo[0], datiParallelepipedo[1], datiParallelepipedo[2]));
    }
}
