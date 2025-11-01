/**
Esercitazione - Primi programmi
Esercizio 3 - Pari o dispari

Scrivete un programma che richieda l’immissione di un numero intero e che sia in
grado di determinare se tale numero è pari o dispari.
 */
import java.util.Scanner;

public class Es3PariODispari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Scrivi un numero intero: ");

        while(!input.hasNextInt()) {
            System.out.println("Input non valido. Scrivi un numero intero: ");
            input.nextLine();
        }

        int numero = input.nextInt();

        input.close();

        if(numero % 2 == 0) {
            System.out.println("Il numero " + numero + " e' pari");
        } else {
            System.out.println("Il numero " + numero + " e' dispari");
        }
    }
    
}
