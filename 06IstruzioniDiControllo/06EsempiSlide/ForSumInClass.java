// Scrivere un programma che utilizzi un ciclo "for" per calcolare la somma
// dei numeri da 1 a 10 (compresi)

public class ForSumInClass {

    // Costanti -> soluzione elegante e ben definita
    static final int INIZIO = 1;
    static final int FINE = 10;
    public static void main(String[] args) {
        
        int somma = 0;

        for(int i = INIZIO; i <= FINE; i++) {
            somma += i;
        }

        System.out.println("La somma dei numeri da " + INIZIO + " a " + FINE + " e': " + somma);
    }
    
}
