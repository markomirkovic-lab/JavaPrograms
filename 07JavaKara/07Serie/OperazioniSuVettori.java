/**
 * Funzioni/procedure che permettono di eseguire operazioni elementari su vettori nello spazio
 * tridimensionale.
 */
public class OperazioniSuVettori {

    /**
     * Funzione che crea e restituisce un nuovo vettore
     *
     * @return un nuovo vettore 3D
     */
    private static int[] creaVettore() {
        return new int[3];
    }

    /**
     * Procedura che inizializza un vettore con dei numeri casuali compresi tra min e max
     *
     * @param vettore vettore da inizializzare
     * @param min     valore minimo permesso nell'array
     * @param max     valore massimo permesso nell'array (non compreso)
     */
    private static void inizializzaVettore(int[] vettore, int min, int max) {
        for (int i = 0; i < vettore.length; i++)
            vettore[i] = (int) (Math.random() * (max - min) + min);
    }

    /**
     * Procedura che mostra a schermo un vettore
     *
     * @param vettore vettore da stampare
     */
    private static void stampaVettore(int[] vettore) {
        System.out.println("(" + vettore[0] + ", " + vettore[1] + ", " + vettore[2] + ")");
    }

    /**
     * Funzione che calcola e restituisce la somma di due vettori
     *
     * @param vettore1 primo addendo
     * @param vettore2 secondo addendo
     * @return un nuovo vettore contenente il risultato della somma
     */
    private static int[] sommaVettori(int[] vettore1, int[] vettore2) {
        int[] risultato = creaVettore();
        for (int i = 0; i < risultato.length; i++)
            risultato[i] = vettore1[i] + vettore2[i];
        return risultato;
    }

    /**
     * Funzione che esegue il prodotto di una costante con un vettore
     *
     * @param costante costante da moltiplicare al vettore
     * @param vettore  vettore da moltiplicare alla costante
     * @return un nuovo vettore contenente il risultato del prodotto
     */
    private static int[] prodotto(int costante, int[] vettore) {
        int[] risultato = creaVettore();
        for (int i = 0; i < vettore.length; i++)
            risultato[i] = costante * vettore[i];
        return risultato;
    }

    /**
     * Funzione che calcola e restituisce il prodotto vettoriale di due vettori
     *
     * @param vettore1 primo vettore per il prodotto vettoriale
     * @param vettore2 secondo vettore per il prodotto vettoriale
     * @return un nuovo vettore contenente il risultato del prodotto vettoriale
     */
    private static int[] prodottoVettoriale(int[] vettore1, int[] vettore2) {
        int[] risultato = creaVettore();
        risultato[0] = vettore1[1] * vettore2[2] - vettore1[2] * vettore2[1];
        risultato[1] = vettore1[2] * vettore2[0] - vettore1[0] * vettore2[2];
        risultato[2] = vettore1[0] * vettore2[1] - vettore1[1] * vettore2[0];
        return risultato;
    }

    /**
     * Procedura main - parte principale del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] vettore1 = creaVettore();
        int[] vettore2 = creaVettore();
        int[] vettore3 = creaVettore();
        int[] vettore4 = creaVettore();

        inizializzaVettore(vettore1, 5, 15);
        inizializzaVettore(vettore2, -5, 5);
        inizializzaVettore(vettore3, -1, 10);
        inizializzaVettore(vettore4, 7, 25);

        System.out.print("v1 = ");
        stampaVettore(vettore1);
        System.out.print("v2 = ");
        stampaVettore(vettore2);
        System.out.print("v3 = ");
        stampaVettore(vettore3);
        System.out.print("v4 = ");
        stampaVettore(vettore4);

        // Esegue alcune operazioni sui vettori e mostra a schermo il risultato
        System.out.print("v1 + v2 = ");
        stampaVettore(sommaVettori(vettore1, vettore2));

        System.out.print("k * v1 = ");
        stampaVettore(prodotto((int) (Math.random() * 10), vettore1));

        System.out.print("v3 x v4 = ");
        stampaVettore(prodottoVettoriale(vettore3, vettore4));
    }
}
