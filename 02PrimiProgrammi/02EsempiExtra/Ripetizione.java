/*
Questo programma chiede all'utente di inserire un numero intero positivo. 
Se l'utente inserisce un valore negativo, il programma richiede un numero positivo.
Una volta ottenuto un numero positivo, il programma stampa la parola "Pippo" tante volte 
quante il valore del numero inserito dall'utente.
*/

import java.util.Scanner;

public class Ripetizione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un valore: ");
        int valore = scanner.nextInt();

        // Continua a chiedere un numero finche' non viene inserito un numero positivo
        while (valore < 0) {
            System.out.println("Hai inserito un numero negativo!");
            System.out.print("Inserisci un valore positivo: ");
            valore = scanner.nextInt();
        }

        scanner.close();

        // Stampa "Pippo" tante volte quante il valore inserito
        while (valore >= 1) { // la condizione puo' essere sistituita con: "valore != 0" oppure "valore > 0"
            System.out.println("Pippo");
            valore = valore - 1;
        }

        System.out.println("Fine programma");
    }
}