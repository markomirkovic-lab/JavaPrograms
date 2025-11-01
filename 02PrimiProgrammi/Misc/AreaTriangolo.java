
/*
Scrivere un programma che calcoli l'area
di un triangolo rettangolo
Formula: Area = (base * altezza) / 2
*/

import java.util.Scanner;

public class AreaTriangolo {

    static final int FATTORE_DIVISIONE = 2; // Costante per il calcolo dell'area

    public static void main(String[] args) {

        // Creare lo scanner per leggere i dati dall'input dell'utente
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il valore per la base: ");
        double baseTriangolo = scanner.nextDouble(); // Leggere la base del triangolo dall'input dell'utente

        System.out.print("Inserisci il valore per l'altezza: ");
        double altezzaTriangolo = scanner.nextDouble(); // Leggere l'altezza del triangolo dall'input dell'utente

        // Chiudere lo scanner dopo l'input
        scanner.close();

        // La riga successiva stampa e va a capo
        System.out.println("\nValori inseriti:");
        System.out.println("Base: " + baseTriangolo);
        System.out.println("Altezza: " + altezzaTriangolo); // Anche questa riga stampa e va a capo.

        double areaTriangolo = baseTriangolo * altezzaTriangolo / FATTORE_DIVISIONE;

        System.out.println("\n\nL'area e': " + areaTriangolo);

    }
}