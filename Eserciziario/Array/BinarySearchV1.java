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

public class BinarySearchV1 {

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

        int[] array = createArray(args);
        System.out.println(Arrays.toString(array));
        System.out.println();

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



    }
    
}
