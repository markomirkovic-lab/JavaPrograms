/**
 * Programma con due funzioni per il calcolo di sin(x) e cos(x) utilizzando le serie
 * trigonometriche. Confronta il risultato delle serie con quello ottenuto utilizzando le funzioni
 * messe a disposizione dalla classe Math.
 */
public class SerieTrigonometriche {

    /**
     * Calcola e restituisce un singolo termine della serie trigonometrica
     *
     * @param x   valore di x
     * @param den valore del termine a denominatore
     * @return il valore del termine della serie
     */
    private static double calcolaTermine(double x, int den) {
        double term = 1.;
        for (int i = den; i > 0; i--)
            term *= x / i;
        return term;
    }

    /**
     * Calcola e restituisce il valore di sin(x) utilizzando la serie trigonometrica con il numero
     * di termini specificato
     *
     * @param x       valore di x
     * @param numTerm numero di termini della serie
     * @return il valore di sin(x) calcolato con la serie trigonometrica di lunghezza desiderata
     */
    private static double sin(double x, int numTerm) {
        double sin = 0.;
        int sign = 1;
        for (int i = 0; i < numTerm; i++) {
            sin += sign * calcolaTermine(x, i * 2 + 1);
            sign *= -1;
        }
        return sin;
    }

    /**
     * Calcola e restituisce il valore di cos(x) utilizzando la serie trigonometrica con il numero
     * di termini specificato
     *
     * @param x       valore di x
     * @param numTerm numero di termini della serie
     * @return il valore di cos(x) calcolato con la serie trigonometrica di lunghezza desiderata
     */
    private static double cos(double x, int numTerm) {
        double cos = 0.;
        int sign = 1;
        for (int i = 0; i < numTerm; i++) {
            cos += sign * calcolaTermine(x, i * 2);
            sign *= -1;
        }
        return cos;
    }

    /**
     * Procedura main - parte principale del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        // Valori di x (in radianti) utilizzati per il confronto dei valori calcolati
        double[] xx = {0., Math.PI / 6., Math.PI / 4., Math.PI / 3., Math.PI / 2.};

        // Calcola e mostra il confronto per i valori di x specificati, con un numero di termini da
        // 1 a 10
        for (double x : xx) {
            System.out.println("Math.sin(" + x + ") = " + Math.sin(x));
            for (int i = 1; i <= 10; i++)
                System.out.println("sin(" + x + ", " + i + ") = " + sin(x, i));
            System.out.println("\nMath.cos(" + x + ") = " + Math.cos(x));
            for (int i = 1; i <= 10; i++)
                System.out.println("cos(" + x + ", " + i + ") = " + cos(x, i));
            System.out.println();
        }
    }
}
