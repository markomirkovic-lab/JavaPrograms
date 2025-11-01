/*
 * Questo programma verifica se un numero positivo è pari o dispari usando la ricorsione.
 * Invece di usare l'operatore modulo (%), sottrae ripetutamente 2 dal numero:
 * se si arriva a 0 il numero è pari, se si arriva a 1 è dispari.
 */
public class PariDispari {

    // Sottoprogramma ricorsivo per verificare se un numero positivo è pari
    private static boolean isPari(int n) {
        // Caso base: 0 è pari
        if (n == 0) {
            return true;
        }
        // Caso base: 1 è dispari
        if (n == 1) {
            return false;
        }
        // Chiamata ricorsiva
        return isPari(n - 2);
    }

    public static void main(String[] args) {
        int numero = 9;

        // Chiamata al sottoprogramma ricorsivo
        boolean isPari = isPari(numero);

        if (isPari) {
            System.out.println("Il numero " + numero + " è pari.");
        } else {
            System.out.println("Il numero " + numero + " è dispari.");
        }
    }
}