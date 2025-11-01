/**
 * Serie 2 - Primi programmi
 * Esercizio 2.1 - Conto alla rovescia
 * 
 * Sviluppate un programma che richieda l’immissione di un numero intero compreso 
 * tra 0 e 100. Visualizzate un messaggio d’errore nel caso in cui il valore immesso non
 * sia compreso all’interno dell’intervallo. In seguito, il programma dovrà mostrare
 * a schermo se il numero è compreso tra 0 e 10, tra 11 e 20, …fino al 100. Alla fine
 * stampate a schermo, su una sola riga e in ordine decrescente, tutti i numeri compresi
 * tra 0 e il valore immesso.
 * 
 */
import java.util.Scanner;

public class Es2_1_ContoAllaRovescia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Scrivi un numero intero compreso da 0 e 100: ");

        int numero = 0;

        int minimo = 0;
        int massimo = 100;

        while (!input.hasNextInt()) {
            System.out.println("Scrivi un numero intero compreso da 0 e 100: ");
            input.nextLine();
            //numero = input.nextInt();
            while (numero < minimo || numero > massimo) {
                System.out.println("Scrivi un numero intero compreso da 0 e 100: ");
                input.nextLine();
                //numero = input.nextInt();
            }
        }

        //int numero = input.nextInt();
        
        //numero = input.nextInt();

        numero = input.nextInt();

        input.close();

        if(numero <= 10) {
            System.out.println("Il numero è compreso tra 0 e 10.");
        } else if (numero <= 20) {
            System.out.println("Il numero è compreso tra 11 e 20.");
        } else if (numero <= 30) {
            System.out.println("Il numero è compreso tra 21 e 30.");
        } else if (numero <= 40) {
            System.out.println("Il numero è compreso tra 31 e 40.");
        } else if (numero <= 50) {
            System.out.println("Il numero è compreso tra 41 e 50.");
        } else if (numero <= 60) {
            System.out.println("Il numero è compreso tra 51 e 60.");
        } else if (numero <= 70) {
            System.out.println("Il numero è compreso tra 61 e 70.");
        } else if (numero <= 80) {
            System.out.println("Il numero è compreso tra 71 e 80.");
        } else if (numero <= 90) {
            System.out.println("Il numero è compreso tra 81 e 90.");
        } else if (numero <= 100) {
            System.out.println("Il numero è compreso tra 91 e 100.");
        }

        int deltaNumeri = massimo - numero;

        int numeroDecrescente = numero;

        int counter = 0;

        while (counter++ <= numero) {
            System.out.println(numeroDecrescente--);
        }


        
    }
}
