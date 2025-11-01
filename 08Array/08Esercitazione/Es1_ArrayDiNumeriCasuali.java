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

public class Es1_ArrayDiNumeriCasuali {

    static final int MIN = 5;
    static final int MAX = 15;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        boolean correct = false;
        int arrayLength = 0;

        System.out.println(MIN);
        System.out.println(MAX);


        System.out.print("Immettere un la dimensione dell'array (numero intero compreso tra 5 e 15): ");

        while (!correct) {

            if(input.hasNextInt()) {

                arrayLength = input.nextInt();

                if(arrayLength >= MIN && arrayLength <= MAX) {

                    correct = true;
                    break;

                } else {

                    System.out.print("A Errore (5 < numero > 15), riprova!: ");
                    input.nextLine();
                    correct = false;
                }
                
            } else {

                System.out.print("Errore (numero non intero), riprova!: ");
                input.nextLine();
                correct = false;
            }

        }

        // array creation with user input length
        int[] array = new int[arrayLength];

        // array popolation with values
        for(int i = 0; i < array.length; i++) {

            //                              
            array[i] = (int) (Math.random() * 50 + 1) - 25;

        }

        // sum of array values
        int sum = 0;
        
        int firstPositiveNumber = array[0];
        int firstNegativeNumber = array[0];
        int indexPositiveNumber = -1;
        int indexNegativeNumber = -1;
        

        /*
        int firstPositiveNumber;
        int firstNegativeNumber;
        int indexPositiveNumber = 0;
        int indexNegativeNumber = 0;
        */

        
        // primo numero positivo
        for(int i = 0; i < array.length; i++) {

            /*
            if( firstPositiveNumber > 0){
                indexPositiveNumber = 0;
                break;
            } else 
            */    

            if(array[i] > 0) {
                firstPositiveNumber = array[i];
                System.out.println(firstPositiveNumber);
                indexPositiveNumber = i;
                System.out.println(indexPositiveNumber);
                break;
            }
        }
        

        // primo numero negativo
        for(int i = 0; i < array.length; i++) {

            /*
            if( firstNegativeNumber < 0){
                indexNegativeNumber = 0;
                break;
            } else 
            */ 
            if(array[i] < 0) {
                firstNegativeNumber = array[i];
                System.out.println(firstNegativeNumber);
                indexNegativeNumber = i;
                System.out.println(indexNegativeNumber);
                break;
            }
        }

        for(int i = 0; i < array.length; i++) {

            sum += array[i];
        }

        // array print
        for( int element : array) {
            System.out.print(element + " ");

            /*
            if(array[element] < array.length - 1) {
                System.out.print(", ");
            }
            */
        }

        System.out.println();
        System.out.println("Array length: " + arrayLength);
        System.out.println("Sum of array values: " + sum);

        if(indexPositiveNumber == -1) {
            System.out.println("Nessun numero positivo trovato");
        } else {
            System.out.println("First positive number: " + array[indexPositiveNumber] + ", at the index: " + (indexPositiveNumber));
            //System.out.println("First positive number: " + firstPositiveNumber + ", at the index: " + (indexPositiveNumber));
        }

        if(indexNegativeNumber == -1) {
            System.out.println("Nessun numero negativo trovato");
        } else {
            System.out.println("First negative number: " + array[indexNegativeNumber] + ", at the index: " + (indexNegativeNumber));
            //System.out.println("First negative number: " + firstNegativeNumber + ", at the index: " + (indexNegativeNumber)); 
        }
        
        input.close();
        
    }
    
}
