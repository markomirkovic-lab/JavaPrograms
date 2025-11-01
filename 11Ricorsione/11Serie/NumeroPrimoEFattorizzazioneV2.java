import java.util.Scanner;

/**
 * Programma che richiede all'utente, in maniera ripetuta, un numero naturale.
 * Mostra a schermo la scomposizione in fattori primi del numero.
 */
public class NumeroPrimoEFattorizzazioneV2 {

    /**
     * Funzione ricorsiva che controlla se il numero è primo
     * 
     * @param x valore da controllare
     * @param i divisore da controllare
     * @return true se il numero è primo, false se non lo è
     */
    private static boolean numeroPrimo(int x, int i) {
        if (i > Math.sqrt(x))
            return true;
        if (x % i == 0)
            return false;
        return numeroPrimo(x, i + 1);
    }

    /**
     * Funzione che controlla se il numero inserito è primo
     * 
     * @param x valore da controllare
     * @return true se il numero è primo, false se non lo è
     */
    private static boolean controllaNumeroPrimo(int x) {
        return numeroPrimo(x, 2);
    }

    /**
     * Stampa a schermo la scomposizione in fattori primi del numero desiderato
     *
     * @param numero   valore da scomporre in fattori primi
     * @param divisore valore per il quale dividere il numero
     */
    private static void stampaFattoriPrimi(int numero, int divisore) {
        if (divisore <= numero) {
            if (numero % divisore == 0 && controllaNumeroPrimo(divisore)) {
                System.out.print(divisore);
                numero /= divisore;
                if (numero > 1) {
                    System.out.print(" x ");
                }
                stampaFattoriPrimi(numero, 2);
            } else {
                stampaFattoriPrimi(numero, divisore + 1);
            }
        }
    }

    /**
     * Stampa a schermo, ricorsivamente, la scomposizione in fattori primi del
     * numero desiderato
     *
     * @param numero valore da scomporre in fattori primi
     */
    private static void stampaFattoriPrimi(int numero) {
        stampaFattoriPrimi(numero, 2);
    }

    /**
     * Stampa a schermo il messaggio e legge da tastiera il valore intero inserito.
     * Mostra un messaggio di errore e richiede di nuovo l'inserimento se il valore
     * inserito non è un intero.
     */
    private static int richiediIntero(Scanner input, String msg) {
        System.out.print(msg);
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Il numero inserito non è un intero. Riprova: ");
        }
        return input.nextInt();
    }

    /**
     * Procedura main - parte principale del programma
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = richiediIntero(input, "Numero da scomporre in fattori primi (<= 1 per terminare): ");
        while (numero > 1) {
            System.out.print(numero + " = ");
            stampaFattoriPrimi(numero);

            numero = richiediIntero(input, "\nNumero da scomporre in fattori primi (<= 1 per terminare): ");
        }

        input.close();
    }
}
