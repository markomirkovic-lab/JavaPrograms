/**
 * Classe che rappresenta una Frazione (numeratore e denominatore). Versione
 * dell'esercizio 1 della serie 10 modificata in modo da sfruttare i metodi
 * d'istanza
 */
class Frazione {
    long numeratore;
    long denominatore;

    /**
     * Costruttore. Fa in modo che il denominatore sia sempre positivo e che la
     * frazione sia ridotta ai minimi termini.
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

        // Riduci la frazione ai minimi termini
        if (numeratore != 0)
            riduci();
    }

    /**
     * Calcola e restituisce la somma delle due frazioni
     * 
     * @param frazione secondo addendo
     * @return una nuova frazione, ridotta ai minimi termini, contenente la somma
     *         delle due frazioni
     */
    Frazione somma(Frazione frazione) {
        long numeratore = this.numeratore * frazione.denominatore + frazione.numeratore * this.denominatore;
        long denominatore = this.denominatore * frazione.denominatore;
        return new Frazione(numeratore, denominatore);
    }

    /**
     * Calcola e restituisce il prodotto delle due frazioni
     * 
     * @param frazione secondo moltiplicando
     * @return una nuova frazione, ridotta ai minimi termini, contenente il prodotto
     *         delle due frazioni
     */
    Frazione moltiplica(Frazione frazione) {
        long numeratore = this.numeratore * frazione.numeratore;
        long denominatore = this.denominatore * frazione.denominatore;
        return new Frazione(numeratore, denominatore);
    }

    /**
     * Calcola e restituisce l'opposto della frazione
     * 
     * @return una nuova frazione che rappresenta l'opposto della frazione
     */
    Frazione opposto() {
        return new Frazione(numeratore * -1, denominatore);
    }

    /**
     * Calcola e restituisce l'inverso della frazione
     * 
     * @return una nuova frazione che rappresenta l'inverso della frazione
     */
    Frazione inverso() {
        return new Frazione(denominatore, numeratore);
    }

    /**
     * Stampa a schermo la frazione
     */
    void stampa() {
        System.out.println(numeratore + "/" + denominatore);
    }

    /**
     * Riduce la frazione ai minimi termini
     */
    void riduci() {
        long mcd = 0;

        long numeratore = Math.abs(this.numeratore);
        long denominatore = Math.abs(this.denominatore);

        if (numeratore > denominatore)
            mcd = MCD(numeratore, denominatore);
        else if (numeratore < denominatore)
            mcd = MCD(denominatore, numeratore);
        else
            // Se sono uguali, non serve calcolare il MCD
            mcd = numeratore;

        if (mcd != 0) {
            this.numeratore /= mcd;
            this.denominatore /= mcd;
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
    private long MCD(long a, long b) {
        return b == 0 ? a : MCD(b, a % b);
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
     * Procedura main - parte principale del programma
     * 
     * @param args
     */
    public static void main(String[] args) {
        Frazione[] frazioni = new Frazione[8];

        for (int i = 0; i < frazioni.length; i++) {
            long num = (long) (Math.random() * 150) + 1;
            long den = (long) (Math.random() * 200) + 1;
            frazioni[i] = new Frazione(num, den);
        }

        for (int i = 0; i < frazioni.length; i++) {
            System.out.print("Frazione " + (i + 1) + " = ");
            frazioni[i].stampa();
        }

        // Esegue alcune operazioni sulle frazioni
        System.out.print("fr1 + fr2 = ");
        frazioni[0].somma(frazioni[1]).stampa();
        System.out.print("fr3 * fr4 = ");
        frazioni[2].moltiplica(frazioni[3]).stampa();
        System.out.print("-fr5 = ");
        frazioni[4].opposto().stampa();
        System.out.print("1 / fr6 = ");
        frazioni[5].inverso().stampa();
        System.out.print("fr7 * fr8 = ");
        frazioni[6].moltiplica(frazioni[7]).stampa();
    }
}
