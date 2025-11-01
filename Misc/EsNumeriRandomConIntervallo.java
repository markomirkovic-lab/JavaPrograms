/**
Esercizio: generazione numeri random in un intervallo
Scrivere un programma che permetta all'utente di inserire due numeri
interi che rappresentano gli estremi di un intervallo. 

Il programma deve essere in grado di gestire eventuali errori di
inserimento (per esempio il caso in cui l'utente inserisca un
valore non numerico).

Una volta ottenuti i due estremi corretti, il programma deve
generare e visualizzare un numero casuale compreso tra i due 
valori inseriti, inclusi entrambi gli estremi.
*/
import java.util.Scanner;

public class EsNumeriRandomConIntervallo {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Scrivi due numeri interi separati da uno spazio (minimo e massimo) che " +
        "rappresentano gli estermi di un intervallo minimo e massimo di numeri causali: ");

        while(!input.hasNextInt()) {
            System.out.print("Input non valido. Scrivi due numeri interi separati da uno spazio " +
            " che rappresentano gli estermi di un intervallo di numeri causali: ");
            input.nextLine();
        }

        int min = input.nextInt();
        int max = input.nextInt();

        // Problemi:
        // 1. se inserisco un numero e poi una stringa da errore
        // 2. manca il controllo tra minimo e massimo
        
        input.close();

        //min = 2
        //max = 5
        //                                             0....0.99 * 4
        //                                             (int) 0 - 3.99
        //                                             0...3          + 2
        //                      0 - 0.999999...        [0              5]                               
        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);// Numero massimo e' incluso
        
        System.out.print("");
        System.out.println("Il numero casuale tra " + min + " e " + max + " = " + random);
    }
   
}
