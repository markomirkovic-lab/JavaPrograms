/**
 * Il codice mostra un esempio di chiamate tra sottoprogrammi in Java.
 * Quando un sottoprogramma chiama un altro sottoprogramma, il controllo
 * dell'esecuzione passa al sottoprogramma chiamato. Una volta completato, il
 * controllo torna al sottoprogramma chiamante, che riprende l'esecuzione dal
 * punto in cui era stata sospesa, fino a completare il proprio codice.
 */

public class ChiamateTraSottoprogrammi {

    private static int raddoppia(int valore) {
        System.out.println("Inizio: raddoppia");
        int risultato = valore * 2;
        System.out.println("Fine: raddoppia");
        return risultato;
    }

    private static int raddoppiaESommaUno(int valore) {
        System.out.println("Inizio: raddoppiaESommaUno");
        int risultato = raddoppia(valore) + 1;
        System.out.println("Fine: raddoppiaESommaUno");
        return risultato;
    }

    public static void main(String[] args) {
        int valore = 5;
        System.out.println(raddoppiaESommaUno(valore));
        System.out.println("Fine programma");
    }
}