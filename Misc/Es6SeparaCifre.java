/**
Esercitazione - Primi programmi
Esercizio 6 - Separa cifre

Scrivete un programma che richieda l’immissione di un numero intero di 5 cifre.
Successivamente, il programma dovrà dividere le singole cifre che compongono il
numero. Le singole cifre dovranno essere visualizzate separate da tre spazi.
Assicuratevi che il numero inserito contenga effettivamente 5 cifre. In caso contrario,
visualizzate un messaggio di errore.

Esempio di output:
Inserisci un numero intero di 5 cifre: 12345
Singole cifre: 1 2 3 4 5
*/
import java.util.Scanner;

public class Es6SeparaCifre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        input.close();

        // Extract digits by dividing and using modulo
        int digitAtIndex4 = number % 10;           // 12345 / 10 = 1234.5 -> % 10 = 5
        int digitAtIndex3 = (number / 10) % 10;    // 12345 / 10 = 1234.5 / 10 = 123.45 -> % 10 = 4
        int digitAtIndex2 = (number / 100) % 10;   // 123.45 / 10 = 12.345 / 10 = 1. 2345 = 3
        int digitAtIndex1 = (number / 1000) % 10;  // 2
        int digitAtIndex0 = (number / 10000) % 10; // 1

        System.out.print(digitAtIndex0 + " " + digitAtIndex1 + " " + digitAtIndex2 +
        " " + digitAtIndex3 + " " + digitAtIndex4);

    }
    
}
