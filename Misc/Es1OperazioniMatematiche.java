/**
Esercitazione - Primi programmi
Esercizio 1 - Operazioni matematiche

Sviluppate un programma in grado di richiedere all’utente l’immissione di due numeri
interi e di calcolare e mostrare a schermo la somma, il prodotto, la differenza e il
quoziente di tali numeri.
*/
import java.util.Scanner;

public class Es1OperazioniMatematiche {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci due numeri interi: ");

        while(!input.hasNextInt() ) {
            System.out.print("Input non valido. Inserisci due numeri interi: ");
            input.nextLine(); // Scarta l'input non valido (svuotamento buffer)
        }

        // Una volta ottenuto un intero, lo memorizziamo e lo stampiamo
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        System.out.println("Hai inserito i numeri: " + numero1 + " " + numero2);

        input.close();

        int somma = numero1 + numero2;
        int differenza = numero1 - numero2;
        int prodotto = numero1 * numero2;
        double divisione = (double) numero1 / (double) numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + somma);
        System.out.println(numero1 + " - " + numero2 + " = " + differenza);
        System.out.println(numero1 + " * " + numero2 + " = " + prodotto);
        System.out.println(numero1 + " / " + numero2 + " = " + divisione);
        
    }
    
}
