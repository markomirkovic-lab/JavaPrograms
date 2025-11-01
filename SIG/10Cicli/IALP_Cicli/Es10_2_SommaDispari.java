/*
10.2 Somma dispari
Scrivete un programma che calcoli la somma dei primi n interi dispari.
n è immesso dall’utente. Se inserirà 3 il programma dovrà calcolare 1+3+5.
*/
import java.util.Scanner;

public class Es10_2_SommaDispari {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserici un numero intero: ");
        int numero = input.nextInt();

        int sommaTemp = 1;
        int somma = 0;

        for(int i = 0; i < numero; i++) {

            if(i > 0) {
                sommaTemp += 2;
            }
              
            somma += sommaTemp;  
            
            //System.out.println("Somma temp: " + sommaTemp);
        }

        System.out.println("Somma dei primi " + numero + " numeri dispari e': " + somma);

    }
    
}
