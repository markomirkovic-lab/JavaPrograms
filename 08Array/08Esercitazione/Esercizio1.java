/*
Esercizio 1 - Array di numeri casuali
Scrivete un programma che richieda all’utente un valore compreso tra 5 e 15 (estremi
compresi). Tale numero corrisponde alla dimensione dell’array che verrà utilizzato dal
programma. Assicuratevi di gestire adeguatamente eventuali immissioni non corrette
(di tipo o di valore), richiedendo all’utente di ripetere l’immissione.
In seguito, il programma dovrà creare l’array della dimensione desiderata e lo
popolerà con dei valori interi casuali compresi tra -25 e +25 (estremi inclusi).
Successivamente il programma dovrà:
• calcolare la somma dei valori inseriti nell’array,
• identificare e memorizzare il primo numero positivo (maggiore di 0) presente
nell’array e il relativo indice,
• identificare e memorizzare l’ultimo numero negativo (minore di 0) presente
nell’array e il relativo indice.
Alla fine il programma dovrà mostrare a schermo:
• i valori presenti nell’array,
• la somma dei valori presenti nell’array,
• il primo valore positivo e il relativo indice,
• l’ultimo valore negativo e il relativo indice
*/


import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Scrivere un numero intero tra 5 e 15: ");

        // Controllo valore e ripetizione rihiesta se il valore non e' valido:
        while (!input.hasNextInt()) {
            System.out.print("Numero non valido! Inserisci un numero tra 5 e 15 ");
            input.nextLine();
        }

        int dimensioneArray = input.nextInt();

        while(dimensioneArray < 5 || dimensioneArray > 15) {
            System.out.print("Numero non valido! Inserisci un numero tra 5 e 15. Riprova: ");
            while (!input.hasNextInt()) {
                System.out.print("Inserire un numero intero. Riprova: ");
                input.nextLine();
            }
            //
            dimensioneArray = input.nextInt();
        }



        int[] numero = new int[dimensioneArray];

        // Crea e popola l'array con numeri casuali tra -25 e 25 (inclusi)
        for(int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 51) - 25;// 51 è la lunghezza dell'intervallo [-25, 25]
            /*
            Math.random(): Genera un numero decimale casuale nell'intervallo [0.0, 1.0).
            Moltiplicazione per 51: Espande l'intervallo [0.0, 1.0) a [0.0, 51.0).
            Casting a (int): Arrotonda verso il basso al numero intero più vicino, 
            ottenendo un valore intero casuale tra 0 e 50.
            Sottrazione di 25: Trasforma l'intervallo [0, 50] in [-25, 25].

            oppure:
            numeri[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            */
        }

        
        // Calcolo somma
        int somma = 0;

        for(int i = 0; i < numero.length; i++) {
            somma += numero[i];
        }

        // Identifica il primo valore positivo e il suo indice
        int primoNumeroPositivo = 0;
        int indexPrimoNumeroPositivo = 0;

        for(int i = 0; i < numero.length; i++) {
            if(numero[i] > 0) {
                primoNumeroPositivo = numero[i];
                indexPrimoNumeroPositivo = i;
                break;
            }
        }

        // Identifica il primo valore negativo e il suo indice
        int ulitmoNumeroNegativo = 0;
        int indexUlitmoNumeroNegativo = 0;
        //                              i > numero.length - 1 - i
        for(int i = numero.length - 1 ; i >= 0; i--) {
            if(numero[i] < 0) {
                ulitmoNumeroNegativo = numero[i];
                indexUlitmoNumeroNegativo = i;
                break;
            }
        }

        // Stampa valori dell'array
        int cntr = 0;

        System.out.print("Valori presenti nell'array: ");
        for(int numeri : numero) {
            System.out.print(numeri);
            cntr++;
            if(cntr < numero.length) {
                System.out.print(", ");
            }
        }

        // Stampa risultati
        System.out.println();
        System.out.println("La somma dei valori presenti nell \'array: " + somma);
        System.out.println("il primo valore positivo e il relativo indice: " + primoNumeroPositivo + ", " + indexPrimoNumeroPositivo);
        System.out.println("L\'ultimo valore negativo e il relativo indice: " + ulitmoNumeroNegativo + ", " + indexUlitmoNumeroNegativo);

        input.close();

    }
    
}
