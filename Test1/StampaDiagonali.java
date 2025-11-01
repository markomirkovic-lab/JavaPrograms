import java.util.Scanner;

public class StampaDiagonali {

    static final int NUMERO_MINIMO_CIFRE = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numeroCifre;
        int ultimaCifra;

        // Ciclo di validazione dell'input
        do {
            System.out.print(
                    "Inserisci un numero (almeno 2 cifre, prima e ultima cifra non zero, ultima cifra dispari): ");
            numero = Math.abs(scanner.nextInt()); // Non potendo leggere l'input dell'utente come stringa (vedi
                                                  // consegna), siamo
                                                  // costretti a leggerlo con `nextInt`

            // Calcolo numero di cifre
            int temp = numero;
            numeroCifre = 0;
            while (temp > 0) {
                numeroCifre++;
                temp = temp / 10;
            }

            ultimaCifra = numero % 10;

            // Avendo letto l'input utente con `nextInt` la prima cifra non sara' mai zero.
            // (Se l'utente immettesse per esempio `0123` il valore letto da `nextInt`
            // sarebbe 123).
            // Controllando se la cifra delle unita' e' dispari con l'operatore modulo,
            // verifichiamo automaticamente che non sia zero. Se fosse zero il controllo
            // `ultimaCifra % 2 == 1` restituirebbe false.

        } while (numeroCifre < NUMERO_MINIMO_CIFRE || ultimaCifra % 2 != 1);

        int numeroDiagonali = numeroCifre;

        // Stampa delle diagonali
        for (int riga = 0; riga < ultimaCifra; riga++) {
            // Stampa gli spazi iniziali della riga
            int spaziIniziali = riga;
            while (spaziIniziali > 0) {
                System.out.print(" ");
                spaziIniziali--;
            }

            // Per ogni diagonale
            int temp = numero;
            for (int diagonale = numeroDiagonali; diagonale > 0; diagonale--) {
                // Stampa la x della diagonale corrente
                System.out.print("x");

                // Se non è l'ultima diagonale, stampa gli spazi
                if (diagonale > 1) {

                    // Estrae la cifra che indica gli spazi per questa posizione
                    temp = temp / 10;
                    int spazi = temp % 10;

                    // Stampa gli spazi prima della prossima diagonale
                    for (int i = 0; i < spazi; i++) {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println(); // Vai a capo per la prossima riga
        }

        scanner.close();
    }
}