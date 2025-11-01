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
import java.util.Random;

public class SortMachineV3 {

    // Ritorna un numero intero casuale nel range [min; max]
    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    // Riempie l'array a di numeri casuali nel range [min; max]
    public static void randomize(int[] a, int min, int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = getRandomInt(min, max);
        }
    }

    // Scambia i valori dei due elementi di a che si trovano in i e j
    public static void swap(int[] a, int i, int j) {
        if (i >= 0 && i < a.length && j >= 0 && j < a.length) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    // Ritorna true se l'array a è ordinato (crescente), false altrimenti
    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Ordina gli elementi di a in modo crescente applicando l'algoritmo bubble sort
    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    swap(a, i - 1, i);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    // Ordina gli elementi di a in modo crescente applicando l'algoritmo selection sort
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(a, i, minIndex);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        randomize(array, 1, 10000);

        // Copia l'array per usarlo in entrambi i metodi di ordinamento
        int[] arrayBubble = array.clone();
        int[] arraySelection = array.clone();

        // Cronometra il tempo di esecuzione del bubble sort
        long startTime = System.nanoTime();
        bubbleSort(arrayBubble);
        long endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;
        System.out.println("Bubble Sort time: " + bubbleSortTime + " nanoseconds");

        // Cronometra il tempo di esecuzione del selection sort
        startTime = System.nanoTime();
        selectionSort(arraySelection);
        endTime = System.nanoTime();
        long selectionSortTime = endTime - startTime;
        System.out.println("Selection Sort time: " + selectionSortTime + " nanoseconds");

        // Verifica che gli array siano ordinati
        System.out.println("Is arrayBubble sorted? " + isSorted(arrayBubble));
        System.out.println("Is arraySelection sorted? " + isSorted(arraySelection));
    }
}
