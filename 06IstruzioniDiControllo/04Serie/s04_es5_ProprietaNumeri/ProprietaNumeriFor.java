/**
 * Programma che, per tutti i numeri da -10 a 9, stampa a schermo se il numero è
 * positivo e se è pari o dispari.
 * 
 * Versione con ciclo for.
 */
public class ProprietaNumeriFor {

    /**
     * Procedura main - parte principale del programma
     * 
     * @param args
     */
    public static void main(String[] args) {
        for (int i = -10; i < 10; i++) {
            // Stampa il numero
            System.out.print(i + ": ");
            // Controlla e stampa se il numero è positivo o negativo
            if (i < 0)
                System.out.print("negativo ");
            else
                System.out.print("positivo ");
            // Controlla e stampa se il numero è pari o dispari
            if (i % 2 == 0)
                System.out.println("pari");
            else
                System.out.println("dispari");
        }
    }
}
