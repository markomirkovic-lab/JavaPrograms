/*
https://gitalb.github.io/eserciziario2.0/search/array/2017/04/25/binarysearch.html
BinarySearch Apr 25, 2017 search array Livello 13 

Scrivi la classe BinarySearch che applica una ricerca binaria per trovare args[0] 
nell’insieme ordinato rappresentato da args[1;N] e ne stampa l’indice (partendo da 0). 

Ad esempio:

$ java BinarySearch 3 1 2 3 5 7 8 10
2

Se il valore cercato non è presente il programma stampa il messaggio "Valore non trovato".
*/

import java.util.Arrays;

public class BinarySearchV2 {

    // Crea un array di interi con i restanti argomenti
    public static int[] createArray(String[] args) {

        // Crea un array di interi con i restanti argomenti
        // (meno l'elemento di args[0])
        int[] array = new int[args.length-1];

        for(int i = 1; i < args.length; i++) {

            array[i - 1] = Integer.parseInt(args[i]);
        }

        return array;
    }

    // Ritorna true se l'array a è ordinato (crescente), false altrimenti
    public static boolean isSorted(int[] a) {

        for(int i = 0; i < a.length - 1; i++) {

            if(a[i] > a[i+1]) {

                return false;
            }
        }

        return true;
    }

    // se esistenti, scambia i valori dei due elementi di a 
    // che si trovano in i e j.
    public static void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Ordina gli elementi di a in modo crescente applicando l'algoritmo selection sort
    public static void selectionSort(int[] a) {
        
        int n = a.length;

        for(int i = 0; i < n; i++) {

            int minIndex = i;

            for(int j = i + 1; j < n; j++) {

                if(a[j] < a[minIndex]) {

                    minIndex = j;
                }
            }

            if(minIndex != i) {

                swap(a, i, minIndex);
            }

        }
    }

    // Metodo per la ricerca binaria con il passaggio del target
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length-1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            // Controlla se il valore è presente al centro
            if(array[mid] == target) {
                
                return mid;
            }

            // left....mid....right
            // Se il valore è più piccolo, ignora la metà destra
            if(array[mid] > target) {

                right = mid - 1;
            } 
            // Se il valore è più grande, ignora la metà sinistra
            else {

                left = mid + 1;
            }

        }
         
        return -1;
    }

    // Metodo per la ricerca binaria senza il passaggio del target
    public static int binarySearch(String[] args, int[] array) {

        // Il valore da cercare è il primo argomento
        int target = Integer.parseInt(args[0]);

        int left = 0;
        int right = array.length-1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            // Controlla se il valore è presente al centro
            if(array[mid] == target) {
                
                return mid;
            }

            // left....mid....right
            // Se il valore è più piccolo, ignora la metà destra
            if(array[mid] > target) {

                right = mid - 1;
            } 
            // Se il valore è più grande, ignora la metà sinistra
            else {

                left = mid + 1;
            }

        }
         
        return -1;
    }


    public static void main(String[] args) {
        

        // Verifica che ci siano almeno due argomenti (valore da cercare e almeno un 
        // elemento nell'array)
        if(args.length < 2) {
            System.out.println("Uso: java BinarySearch <valore> <elemento1> <elemento2> ... <elementoN>");
            System.out.println("Inserire almeno due elementi");
            return;
        }

        System.out.println("Arrays.toString(args): "  + Arrays.toString(args));
        System.out.println();

        // Il valore da cercare è il primo argomento
        int target = Integer.parseInt(args[0]);
        System.out.println("target: " + target);
        System.out.println();

        // Creazione array
        int[] array = createArray(args);
        System.out.println(Arrays.toString(array));
        System.out.println();

        // isSorted?
        System.out.println("isSorted(array):" + isSorted(array));

        if(!isSorted(array)) {
            selectionSort(array);
            System.out.println(Arrays.toString(array));
            System.out.println("isSorted(array):" + isSorted(array));
            System.out.println();
        }

        // Esegui la ricerca binaria
        int resultIndex = binarySearch(args, array);
        int resultIndex2 = binarySearch(array, target);

        if(resultIndex != -1) {
            System.out.println("resultIndex: " + resultIndex);
        } else {
            System.out.println("Valore non trovato");
        }
        System.out.println();

        if(resultIndex2 != -1) {
            System.out.println("resultIndex2: " + resultIndex2);
        } else {
            System.out.println("Valore non trovato");
        }
        System.out.println();

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java BinarySearchV2
        Uso: java BinarySearch <valore> <elemento1> <elemento2> ... <elementoN>
        Inserire almeno due elementi
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java BinarySearchV2 3 1 2 3 5 7 8 10
        Arrays.toString(args): [3, 1, 2, 3, 5, 7, 8, 10]

        target: 3

        [1, 2, 3, 5, 7, 8, 10]
        isSorted(array):true

        resultIndex: 2

        resultIndex2: 2

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java BinarySearchV2 8 1 2 3 5 7 8 10
        Arrays.toString(args): [8, 1, 2, 3, 5, 7, 8, 10]

        target: 8

        [1, 2, 3, 5, 7, 8, 10]
        isSorted(array):true

        resultIndex: 5

        resultIndex2: 5

        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java BinarySearchV2 8 1 2 3 10 8 7 9 5         
        Arrays.toString(args): [8, 1, 2, 3, 10, 8, 7, 9, 5]

        target: 8

        [1, 2, 3, 10, 8, 7, 9, 5]
        isSorted(array):false

        [1, 2, 3, 5, 7, 8, 9, 10]
        isSorted(array):true

        resultIndex: 5

        resultIndex2: 5
        */


    }
    
}
