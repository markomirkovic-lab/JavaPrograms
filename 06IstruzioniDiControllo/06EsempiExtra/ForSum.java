// Scrivere un programma che utilizzi un ciclo "for" per calcolare la somma dei 
// numeri da 1 a 10 (compresi). 

public class ForSum {
    // Definire gli estremi come costanti
    static final int INIZIO = 1;
    static final int FINE = 10;

    public static void main(String[] args) {
        int somma = 0;

        // Ciclo "for" per calcolare la somma
        for (int i = INIZIO; i <= FINE; i++) {
            somma += i;
        }

        // Stampare il risultato
        System.out.println("La somma dei numeri da " + INIZIO + " a " + FINE + " è: " + somma);
    }
}
