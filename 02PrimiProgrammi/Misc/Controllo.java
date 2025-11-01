/*
Programma che legge un valore dall'utente e:
- se il valore e' 9 o 10, stampa "Primo caso" va a capo e stampa su una nuova riga "Pippo"
- se il valore e' 11, stampa "Secondo caso" va a capo e stampa su una nuova riga "Pluto"
- se il valore e' diverso da 9 o 10 e il valore e' diverso da 11, stampa "Terzo caso" va a capo e stampa su una nuova riga il valore inserito dall'utente.
*/

import java.util.Scanner;

public class Controllo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un valore: ");
        int valoreInseritoDallUtente = input.nextInt();

        input.close();

        // Controlla i vari casi in base al valore inserito
        if (valoreInseritoDallUtente == 9 || valoreInseritoDallUtente == 10) {
            System.out.println("Primo caso");
            System.out.println("Pippo");
        } else if (valoreInseritoDallUtente == 11) {
            System.out.println("Secondo caso");
            System.out.println("Pluto");
        } else {
            System.out.println("Terzo caso");
            System.out.println(valoreInseritoDallUtente);
        }

        System.out.println("Fine programma");

    }
}