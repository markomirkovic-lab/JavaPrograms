/*
10.2 Somma dispari
Scrivete un programma che calcoli la somma dei primi n interi dispari.
n è immesso dall’utente. Se inserirà 3 il programma dovrà calcolare 1+3+5.
*/
import java.util.Scanner;

public class Es10_2_SommaDispariV2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserici un numero intero: ");
        int numero = input.nextInt();

        int dispari = 1;
        int somma = 0;
        int volte = 0;

        for(volte = numero; volte > 0; volte--) {

            somma += dispari;
            dispari += 2;

        }
        System.out.println("Somma dei primi " + numero + " numeri dispari e': " + somma);

    }
    
}
