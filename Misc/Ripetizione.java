/**
Programma stampa "Pippo" tante volte quante definite dall'utente
*/

import  java.util.Scanner;

public class Ripetizione {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valore = input.nextInt();

        // se l'utente mette una stringa il programma da errore

        // numeri negativi e zero non vanno bene
        // se l'utente mette un numero negativo richiediamo
        // di rimette il numero
        while(valore < 0) {
            System.out.println("Hai inserito un numero negativo!");
            System.out.print("Inserisci un valore positivo: ");
            valore = input.nextInt();
        }

        // cicla fintanto che la condizione e' vera
        while(valore >= 1) {
            System.out.println("pippo");
            valore = valore-1;
        }

        input.close();

        System.out.println("Fine programma");
    }
    
}
