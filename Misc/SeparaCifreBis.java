/**
Programma  richieda l’immissione di un numero intero di 5 cifre.
Successivamente, il programma dovrà dividere le singole cifre che compongono il
numero. Le singole cifre dovranno essere visualizzate separate da tre spazi.
Assicuratevi che il numero inserito contenga effettivamente 5 cifre. In caso contrario,
visualizzate un messaggio di errore.
*/

import java.util.Scanner;

public class SeparaCifreBis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        /*
        int moduloCifre10000 = numero % 10000;  //2345
        int moduloCifre1000 = numero % 1000;    //345
        int moduloCifre100 = numero % 100;      //45
        int moduloCifre10 = numero % 10;        //5
        int moduloCifre1  = numero % 1;         //0
        */

        //System.out.print(moduloCifre10000 + " " + moduloCifre1000 + " " + moduloCifre100 + " " + moduloCifre10 + " " + moduloCifre1);
        //System.out.println("");
        //System.out.println("---");

        int cifre10000 = (numero / 10000) % 10;    //1
        int cifre1000 = (numero / 1000) % 10;           //2
        int cifre100 = ((numero / 100) % 100) % 10;        //3
        int cifre10 = (((numero / 10) % 1000) % 100) % 10;      //4
        int cifre1 = ((((numero / 1) % 10000) % 1000) % 100) % 10;     //5

        System.out.print(cifre10000 + " " + cifre1000 + " " + cifre100 + " " + cifre10 + " " + cifre1);

        //inverse thinking - starting with number index 4 (pos 5) and moving to 0 (pos 1)

        System.out.println("");
        System.out.println("-----");

        int number = numero;

        
        // Extract digits by dividing and using modulo
        int digitAtIndex4 = number % 10;           // 12345 / 10 = 1234.5 -> % 10 = 5
        int digitAtIndex3 = (number / 10) % 10;    // 12345 / 10 = 1234.5 / 10 = 123.45 -> % 10 = 4
        int digitAtIndex2 = (number / 100) % 10;   // 123.45 / 10 = 12.345 / 10 = 1. 2345 = 3
        int digitAtIndex1 = (number / 1000) % 10;  // 2
        int digitAtIndex0 = (number / 10000) % 10; // 1

        System.out.println(number % 10);
        System.out.println(number / 10 + " " + (number / 10) % 10);
        System.out.println(number / 100 + " " + (number / 100) % 10);
        System.out.println(number / 1000 + " " + (number / 1000) % 10);
        System.out.println(number / 10000 + " " + (number / 10000) % 10);
        System.out.println("-----");

        System.out.println(12.345 % 10);

        System.out.println("-----");

        System.out.println("Digit at index 0: " + digitAtIndex0);  // Outputs: 1
        System.out.println("Digit at index 1: " + digitAtIndex1);  // Outputs: 2
        System.out.println("Digit at index 2: " + digitAtIndex2);  // Outputs: 3
        System.out.println("Digit at index 3: " + digitAtIndex3);  // Outputs: 4
        System.out.println("Digit at index 4: " + digitAtIndex4);  // Outputs: 5
        
        System.out.println("-----");

        System.out.print(digitAtIndex0 + " " + digitAtIndex1 + " " + digitAtIndex2 +
        " " + digitAtIndex3 + " " + digitAtIndex4);
    }
}
