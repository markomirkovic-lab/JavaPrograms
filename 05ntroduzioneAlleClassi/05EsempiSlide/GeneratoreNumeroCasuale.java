/*
Scrivere un programma che permetta all'utente di inserire due numeri interi che 
rappresentano gli estremi di un intervallo. 
Il programma deve essere in grado di gestire eventuali errori di inserimento 
(per esempio il caso in cui l'utente inserisca un valore non numerico).
Una volta ottenuti i due estremi corretti, il programma deve generare e 
visualizzare un numero casuale compreso tra i due valori inseriti, 
inclusi entrambi gli estremi. 
 */

import java.util.Scanner;

public class GeneratoreNumeroCasuale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 0;

        // Lettura del limite inferiore
        System.out.print("Inserisci il limite INFERIORE dell'intervallo: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Errore: inserisci un numero intero valido.");
            System.out.print("Inserisci il limite INFERIORE dell'intervallo: ");
            scanner.nextLine(); // Pulisce l'input non valido
        }
        min = scanner.nextInt();
        scanner.nextLine(); // Pulisce il buffer

        // Lettura del limite superiore: versione con un unico while
        boolean inputValido = false;
        while (!inputValido) {
            System.out.print("Inserisci il limite SUPERIORE dell'intervallo: ");
            if (scanner.hasNextInt()) {
                max = scanner.nextInt();
                if (max > min) {
                    inputValido = true;
                } else {
                    System.out.println("Errore: il limite SUPERIORE deve essere maggiore al limite inferiore.");
                }
            } else {
                System.out.println("Errore: inserisci un numero intero valido.");
            }
            scanner.nextLine(); // Pulisce il buffer
        }

        // Lettura del limite superiore: versione con piu' while (anche innestati)
        // // Lettura del limite superiore
        // System.out.print("Inserisci il limite SUPERIORE dell'intervallo: ");
        // while (!scanner.hasNextInt()) {
        //     System.out.println("Errore: inserisci un numero intero valido.");
        //     System.out.print("Inserisci il limite SUPERIORE dell'intervallo: ");
        //     scanner.next(); // Pulisce l'input non valido
        // }
        // max = scanner.nextInt();

        // // Verifica che il limite superiore sia maggiore al limite inferiore
        // while (max <= min) {
        //     System.out.println("Errore: il limite SUPERIORE deve essere maggiore al limite inferiore.");
        //     System.out.print("Inserisci nuovamente il limite SUPERIORE dell'intervallo:");
        //     while (!scanner.hasNextInt()) {
        //         System.out.println("Errore: inserisci un numero intero valido.");
        //         System.out.print("Inserisci il limite SUPERIORE dell'intervallo: ");
        //         scanner.next(); // Pulisce l'input non valido
        //     }
        //     max = scanner.nextInt();
        // }

        scanner.close();

        // Generazione del numero casuale
        int numeroCasuale = (int) (Math.random() * (max - min + 1)) + min;

        // Visualizzazione del risultato
        System.out.println("Il numero casuale generato è: " + numeroCasuale);
    }
}