/*
https://gitalb.github.io/eserciziario2.0/sort/array/methods/2020/03/03/sortmachine.html
SortMachine Mar 3, 2020 sort array methods Livello 13 

Scrivi la classe SortMachine contenente i metodi descritti in seguito.

public static int getRandomInt(int min, int max)
ritorna un numero intero casuale nel range [min;max].

public static void randomize(int[] a, int min, int max)
riempie l’array a di numeri casuali nel range [min;max].

public static void swap(int[] a, int i, int j)
se esistenti, scambia i valori dei due elementi di a che si trovano in i e j.

public static boolean isSorted(int[] a)
ritorna true se l’array a è ordinato (crescente), false altrimenti.

public static void bubbleSort(int[] a)
ordina gli elementi di a in modo crescente applicando l’algoritmo bubble sort.

public static void selectionSort(int[] a)
ordina gli elementi di a in modo crescente applicando l’algoritmo selection sort.
Poi verifica il buon funzionamento dei metodi e confronta le prestazioni di 
bubble e selection sort cronometrando quanto tempo impiegano per ordinare un 
array di 10000 elementi.
*/

import java.util.Arrays;

public class SortMachineV1 {

    // ritorna un numero intero casuale nel range [min;max]
    public static int getRandomInt(int min, int max) {

        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // riempie l’array a di numeri casuali nel range [min;max]
    public static void randomize(int[] a, int min, int max) {

        for(int i = 0; i < a.length; i++) {

            a[i] = getRandomInt(min, max);
        }

    }

    // se esistenti, scambia i valori dei due elementi di a 
    // che si trovano in i e j.
    public static void swap(int[] a, int i, int j) {

        if(i >= 0 && i < a.length && j >=0 && j < a.length) {

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

    }

    //ritorna true se l’array a è ordinato (crescente), false altrimenti
    public static boolean isSorted(int[] a) {

        for(int i = 0; i < a.length - 1; i++) {

            if(a[i] > a[i+1]) {

                return false;
            }
        }

        return true;
    }

    // ordina gli elementi di a in modo crescente applicando l’algoritmo bubble sort
    public static void bubbleSort(int[] array) {

        boolean scambio;
        int attuale, successivo;
        int tmp;
        
        for(int i = 0; i < array.length; i++) 
        {
            scambio = false;// torna false ad inizio di ogni ciclo
        
            //Notate che questo secondo ciclo si arresta 
            //al penultimo elemento dell'array
            for(int j = 0; j < array.length-1; j++) 
            {
                attuale=j;
                successivo=j+1;
            
                //Se l' elemento attuale è maggiore del successivo... 
                if(array[successivo]<array[attuale]) 
                {
                    //... allora scambiamoli
                    swap(array,attuale,successivo);
                    
                    //segnalo che c'è stato uno scambio
                    scambio=true; 
                }
            }
        //Qui termina il confronto fra tutti gli elementi, 
        //partendo dal primo
        //se non ci sono stati scambi significa che l'array è ordinato
        //e quindi è inutile procedere
        if(!scambio) 
        break; 

        }

    }

    // ordina gli elementi di a in modo crescente applicando 
    // l’algoritmo selection sort.
    // Poi verifica il buon funzionamento dei metodi e confronta 
    // le prestazioni di bubble e selection sort cronometrando 
    // quanto tempo impiegano per ordinare un array di 10000 elementi.
    public static void selectionSort(int[] array) {

        int minimo;

        for(int i = 0; i < array.length; i++) {
            // il minimo della prima cella
            minimo = i;

            for(int j = i+1; j < array.length; j++) {
                // se trovo un valore inferiore,
                // memorizzo la sua posizione
                // j = i+1          minimo = i
                if(array[j] < array[minimo]) {
                    minimo = j;
                }
            }
            // se trovo un minimo diverso dalla
            // attuale, allora lo scambio
            if(minimo != i) {

                swap(array, i, minimo);
            }
        }
    }


    public static void main(String[] args) {


        int min = 0;
        int max = 10000;

        System.out.println("getRandomInt(min, max): " + getRandomInt(min, max));
        System.out.println();

        int[] arrayInt = new int[max];

        
        randomize(arrayInt, min, max);
        System.out.println("Arrays.toString(arrayInt): " + Arrays.toString(arrayInt));
        System.out.println();

        swap(arrayInt, 3, 6);
        System.out.println("Arrays.toString(arrayInt): " + Arrays.toString(arrayInt));
        System.out.println();

        System.out.println("isSorted(arrayInt): " + isSorted(arrayInt));
        System.out.println();
        
        long startTime;
        long endTime;
        
        startTime = System.nanoTime();
        bubbleSort(arrayInt);
        endTime = System.nanoTime();
        System.out.println("Array bubbleSorted");
        System.out.println("Arrays.toString(arrayInt): " + Arrays.toString(arrayInt));
        System.out.println();
        long bubbleSortTime = endTime - startTime;
        System.out.println("Bubble Sort time: " + bubbleSortTime + " nanoseconds");
        System.out.println();

        System.out.println("isSorted(arrayInt): " + isSorted(arrayInt));
        System.out.println();
        

        // selectionSort e' piu' veloce di bubbleSort (5 vs 21 secondi per un array di 100'000 elementi)
        
        startTime = System.nanoTime();
        selectionSort(arrayInt);
        endTime = System.nanoTime();
        System.out.println("Array selectionSorted");
        System.out.println("Arrays.toString(arrayInt): " + Arrays.toString(arrayInt));
        System.out.println();
        long selectionSortTime = endTime - startTime;
        System.out.println("Selection Sort time Sort time: " + selectionSortTime + " nanoseconds");
        System.out.println();

        System.out.println("isSorted(arrayInt): " + isSorted(arrayInt));
        System.out.println();

        long sortTimeDifference = Math.abs(bubbleSortTime - selectionSortTime);

        System.out.printf("%-20s%20d%s", "Bubble Sort time:    ", bubbleSortTime, " nanoseconds\n");
        System.out.printf("%-20s%20d%s", "Selection Sort time: ", selectionSortTime, " nanoseconds\n");
        System.out.printf("%-20s%20d%s", "Diffrence Sort time: ", sortTimeDifference, " nanoseconds\n");

    }
    
}
