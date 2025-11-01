/*
10.8 Numeri di Armstrong (difficile)
Un numero viene detto di Armstrong se la somma delle cifre che lo compongono, elevati alla 
potenza data dal numero di cifre, è il numero stesso.
Scrivete un programma che calcoli tutti i numeri di Armstrong da 1 ad un massimo inserito 
da tastiera.
Es: 
numero cifre = 3 : 153 = 1^3 + 5^3 + 3^3
numero cifre = 4 : 1634 = 1^4 + 6^4 + 3^4 + 4^4
numero cifre = 5 : 54748 = 5^5 + 4^5 + 7^5 + 4^5 + 8^5
*/
import java.util.Scanner;;

public class Es10_8_NumeriDiArmstrong {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variabili
        int max;
        int numero, tmp, somma;
        int divisore, cifre = 0, cifra, esponente;

        System.out.print("Scrivi un numero intero massimo: ");
        max = input.nextInt();

        for(numero = 1; numero <= max; numero++) {

            somma = 0;

            // Determino quante cifre compongono il numero
            divisore = 1;
            cifre = 0;
            do {
                // Ogni volta divido per un numeor 10 volte piu' grande
                divisore *= 10;
                cifre++;// Es. per 1000, cifre = 4
            } while (numero/divisore > 0);
            // divisone tra interi

            // Somma degli esponenti delle cifre che compongono il numero
            tmp = numero;
            do {
                // Numero meno significativo (ultima cifra a destra)
                cifra = tmp % 10;// 1%10=1, 2%10=2, 10%10=0,...,max%10

                // Preparo la variabile per il prossimo giro
                tmp /= 10;//tmp = tmp /10

                // Calcolo l'esponente
                esponente = 1;
                for(int i = 0; i < cifre; i++) {
                    esponente *= cifra;//esponente=esponente*cifra
                }

                // Somma dell'esponente
                somma += esponente;

            } while(tmp != 0);

            // Se somma e' uguale al numero, i numeri di Armstrong sono stati trovati
            if(somma == numero) {
                System.out.printf("%10d %s", numero, " e' un numero di Armstrong.\n");
            }

        }

        //System.out.println(cifre);
         
    }
    
}
