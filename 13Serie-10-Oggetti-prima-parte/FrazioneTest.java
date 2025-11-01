/**
 * Classe che rappresenta una Frazione (numeratore e denominatore)
 */
class Frazione {
    long numeratore;
    long denominatore;

    /**
     * Costruttore della classe frazione
     * 
     * @param numeratore   numeratore della frazione
     * @param denominatore denominatore della frazione
     */
    Frazione(long numeratore, long denominatore) {
        this.numeratore = numeratore;

        if (denominatore == 0)
            // Evita di avere un denominatore uguale a 0
            this.denominatore = 1;
        else if (denominatore < 0) {
            // Fa in modo che il denominatore sia sempre positivo
            this.numeratore *= -1;
            this.denominatore = denominatore * -1;
        } else
            this.denominatore = denominatore;
    }
}

/**
 * Classe di test della classe Frazione. Permette di creare e immagazzinare 8
 * frazioni inizializzate con valori casuali. Tutte le frazioni memorizzate sono
 * ridotte ai minimi termini. Esegue alcune operazioni sulle frazioni
 * immagazzinate
 */
public class FrazioneTest {

    /**
     * Calcola e restituisce la somma delle due frazioni
     * 
     * @param frazione1 primo addendo
     * @param frazione2 secondo addendo
     * @return una nuova frazione, ridotta ai minimi termini, contenente la somma
     *         delle due frazioni
     */
    private static Frazione somma(Frazione frazione1, Frazione frazione2) {
        long numeratore = frazione1.numeratore * frazione2.denominatore + frazione2.numeratore * frazione1.denominatore;
        long denominatore = frazione1.denominatore * frazione2.denominatore;
        Frazione risultato = new Frazione(numeratore, denominatore);
        riduci(risultato);
        return risultato;
    }

    /**
     * Calcola e restituisce il prodotto delle due frazioni
     * 
     * @param frazione1 primo moltiplicando
     * @param frazione2 secondo moltiplicando
     * @return una nuova frazione, ridotta ai minimi termini, contenente il prodotto
     *         delle due frazioni
     */
    private static Frazione moltiplica(Frazione frazione1, Frazione frazione2) {
        long numeratore = frazione1.numeratore * frazione2.numeratore;
        long denominatore = frazione1.denominatore * frazione2.denominatore;
        Frazione risultato = new Frazione(numeratore, denominatore);
        riduci(risultato);
        return risultato;
    }

    /**
     * Calcola e restituisce l'opposto della frazione
     * 
     * @param frazione frazione di partenza
     * @return una nuova frazione che è l'opposto di quella passata come parametro
     */
    private static Frazione opposto(Frazione frazione) {
        return new Frazione(frazione.numeratore * -1, frazione.denominatore);
    }

    /**
     * Calcola e restituisce l'inverso della frazione
     * 
     * @param frazione frazione di partenza
     * @return una nuova frazione che è l'inverso di quella passata come parametro
     */
    private static Frazione inverso(Frazione frazione) {
        return new Frazione(frazione.denominatore, frazione.numeratore);
    }

    /**
     * Stampa a schermo la frazione
     * 
     * @param frazione frazione da stampare a schermo
     */
    private static void stampa(Frazione frazione) {
        System.out.println(frazione.numeratore + "/" + frazione.denominatore);
    }

    /**
     * Riduce la frazione ai minimi termini
     * 
     * @param frazione frazione da ridurre ai minimi termini
     */
    private static void riduci(Frazione frazione) {
        long mcd = 0;

        long numeratore = Math.abs(frazione.numeratore);
        long denominatore = Math.abs(frazione.denominatore);

        if (numeratore > denominatore)
            mcd = MCD(numeratore, denominatore);
        else if (numeratore < denominatore)
            mcd = MCD(denominatore, numeratore);
        else
            // Se sono uguali, non serve calcolare il MCD
            mcd = numeratore;

        if (mcd != 0) {
            frazione.numeratore /= mcd;
            frazione.denominatore /= mcd;
        }
    }

    /**
     * Calcola e restituisce il massimo comun divisore tra a e b (utilizzando
     * l'algoritmo di Euclide)
     * 
     * @param a primo valore (deve essere maggiore di b)
     * @param b secondo valore (deve essere minore di a)
     * @return il massimo comun divisore tra a e b
     */
    // Versione iterativa
    // private static long MCD(long a, long b) {
    // long r = a % b;
    // while (r != 0) {
    // a = b;
    // b = r;
    // r = a % b;
    // }
    // return b;
    // }

    // Versione ricorsiva
    private static long MCD(long a, long b) {
        return b == 0 ? a : MCD(b, a % b);
    }

    /**
     * Procedura main - parte principale del programma
     * 
     * @param args
     */
    public static void main(String[] args) {
        Frazione[] frazioni = new Frazione[8];

        for (int i = 0; i < frazioni.length; i++) {
            Frazione frazione = new Frazione((long) (Math.random() * 150) + 1, (long) (Math.random() * 200) + 1);
            riduci(frazione);
            frazioni[i] = frazione;
        }

        for (int i = 0; i < frazioni.length; i++) {
            System.out.print("Frazione " + (i + 1) + " = ");
            stampa(frazioni[i]);
        }

        // Esegue alcune operazioni sulle frazioni
        System.out.print("fr1 + fr2 = ");
        stampa(somma(frazioni[0], frazioni[1]));
        System.out.print("fr3 * fr4 = ");
        stampa(moltiplica(frazioni[2], frazioni[3]));
        System.out.print("-fr5 = ");
        stampa(opposto(frazioni[4]));
        System.out.print("1 / fr6 = ");
        stampa(inverso(frazioni[5]));
        System.out.print("fr7 * fr8 = ");
        stampa(moltiplica(frazioni[6], frazioni[7]));
    }
}
