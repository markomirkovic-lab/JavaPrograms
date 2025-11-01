import java.util.Scanner;

public class Es10_8_NumeriDiArmstrongV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabili
        int max;
        int numero, tmp, somma;
        int divisore, cifre = 0, cifra, esponente;

        System.out.print("Scrivi un numero intero massimo: ");
        max = input.nextInt();

        System.out.println("Numeri di\nArmstrong:\n---------- ");

        for (numero = 1; numero <= max; numero++) {
            somma = 0;

            // Determino quante cifre compongono il numero
            divisore = 1;
            cifre = 0;
            do {
                divisore *= 10;
                cifre++;
            } while (numero / divisore > 0);

            // Somma degli esponenti delle cifre che compongono il numero
            tmp = numero;
            StringBuilder formula = new StringBuilder(); // Per costruire la rappresentazione
            do {
                // Trovo il numero meno significativo, con 153 ottengo 3
                cifra = tmp % 10;
                // Preparo la variabile per il prossimo giro, 153 diventa 15
                tmp /= 10;

                // Calcolo l'esponente
                esponente = 1;
                for (int i = 0; i < cifre; i++) {
                    esponente *= cifra;
                }

                // Aggiungo l'esponente alla somma
                somma += esponente;

                // Costruisco la formula di rappresentazione
                if (formula.length() > 0) {
                    formula.insert(0, " + ");
                }
                formula.insert(0, cifra + "^" + cifre);

            } while (tmp != 0);

            
            // Se somma è uguale al numero, è un numero di Armstrong
            if (somma == numero) {
                System.out.printf("%10d  |  Numero cifre = %d : %d = %s\n", 
                numero, cifre, numero, formula.toString());
            }
        }

        input.close();
    }
}
