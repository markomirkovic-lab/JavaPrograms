
/**
 * Scrivere un programma che:
 * - chieda all'utente 10 numeri interi, minori di 100
 * - li salvi in un array
 * - stampi i valori che sono in una cella dell'array con indice dispari
 * - stampi il valore massimo contenuto nell'array
 */

import java.util.Scanner;

public class EsercizioArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeri = new int[10];

        System.out.println("Per favore, inserisci 10 numeri interi minori di 100:");

        int count = 0;
        while (count < numeri.length) {
            System.out.print("Inserisci il numero " + (count + 1) + ": ");
            if (input.hasNextInt()) {
                int numero = input.nextInt();
                input.nextLine(); // pulisce l'input ("rimuovendo l'enter")
                if (numero < 100) {
                    numeri[count] = numero;
                    count++;
                } else {
                    System.out.println("Per favore, inserisci un numero intero minore di 100.");
                }
            } else {
                System.out.println("Hai inserito un valore non valido. Per favore, inserisci un numero intero.");
                input.nextLine(); // pulisce l'input errato
            }
        }

        input.close();

        System.out.println("I numeri inseriti nelle celle con indice dispari sono:");
        for (int i = 1; i < numeri.length; i += 2) {
            System.out.println(numeri[i]);
        }

        int max = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }
        System.out.println("Il valore massimo inserito è: " + max);
    }
}
