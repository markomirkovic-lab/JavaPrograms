/**
Programma  richieda l’immissione di un numero intero di 5 cifre.
Successivamente, il programma dovrà dividere le singole cifre che compongono il
numero. Le singole cifre dovranno essere visualizzate separate da tre spazi.
Assicuratevi che il numero inserito contenga effettivamente 5 cifre. In caso contrario,
visualizzate un messaggio di errore.
*/

import java.util.Scanner;

public class SeparaCifre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        String numeroString = numero + "";

        //System.out.print(numeroString);
        //System.out.print(numeroString.length());

        while( (numeroString.charAt(0) == '-' || numeroString.charAt(0) == '0') ||
            (numeroString.length() < 5 || numeroString.length() > 5) ) {
            System.out.print("Scrivere un numero intero positivo a 5 cifre: ");
            numero = input.nextInt();
            numeroString = numero + "";
        }

        System.out.print("Singole cifre: " +
            numeroString.charAt(0) + " " +
            numeroString.charAt(1) + " " +
            numeroString.charAt(2) + " " +
            numeroString.charAt(3) + " " +
            numeroString.charAt(4));
    }
    
}
