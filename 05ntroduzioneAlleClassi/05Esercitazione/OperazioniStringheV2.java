import java.util.Scanner;

public class OperazioniStringheV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Richiedi una stringa di almeno 20 caratteri. Ripeti la richiesta se la lunghezza minima
        // non viene rispettata
        System.out.print("Inserire una stringa con almeno 20 caratteri: ");
        String stringa = scanner.nextLine();
        while (stringa.length() < 20) {
            System.out.print("Stringa non valida. Riprova: ");
            stringa = scanner.nextLine();
        }
        scanner.close();

        int cntCifre = 0;
        int cntSpazi = 0;
        int cntMinuscole = 0;
        int cntMaiuscole = 0;
        int min = 10;
        int max = -1;

        // Variabile utilizzata per ricostruire la frase finale (stringa al contrario). Il carattere corrente viene sempre anteposto
        String finale = "";

        int pos = 0;
        // Percorri la stringa un carattere alla volta
        while (pos < stringa.length()) {
            // Estrai il carattere corrente
            char c = stringa.charAt(pos);

            if (c >= 'a' && c <= 'z') {
                // Il carattere corrente e' una lettera minuscola
                cntMinuscole++;
                finale = ("" + c).toUpperCase() + finale;
            } else if (c >= 'A' && c <= 'Z') {
                // Il carattere corrente e' una lettera maiuscola
                cntMaiuscole++;
                finale = ("" + c).toLowerCase() + finale;
            } else if (c >= '0' && c <= '9') {
                // Il carattere corrente e' una cifra
                cntCifre++;

                int cifra = Integer.parseInt("" + c);
                // Cerca minimo e massimo
                if (cifra < min) {
                    min = cifra;
                }
                if (cifra > max) {
                    max = cifra;
                }
                finale = (9 - cifra) + finale;
            } else if (c <= '\u0020') {
                // Il carattere corrente e' uno spazio
                cntSpazi++;
                finale = c + finale;
            } else {
                finale = c + finale;
            }
            pos++;
        }

        // Mostra i vari conteggi, il valore minimo e massimo (se sono presenti dei numeri) e la frase finale
        System.out.println("Conteggio minuscole: " + cntMinuscole);
        System.out.println("Conteggio maiuscole: " + cntMaiuscole);
        System.out.println("Conteggio cifre: " + cntCifre);
        System.out.println("Conteggio spazi: " + cntSpazi);

        if (cntCifre > 0) {
            System.out.println("Cifra minore: " + min);
            System.out.println("Cifra maggiore: " + max);
        }

        System.out.println("Stringa finale: " + finale);
    }
}