/*
https://gitalb.github.io/eserciziario2.0/array/methods/2020/03/27/arraydecoder.html
ArrayDecoder Mar 27, 2020 array methods Livello 12 

Scrivi la classe ArrayDecoder contenente i metodi seguenti:

public static boolean sizeDiffer(char[] a, char[] b)
Ritorna true se la dimensione degli array a e b è differente, false altrimenti.

public static int indexOfUnique(char[] a, char c)
Se il carattere c è presente una sola volta nell’array a, il metodo ritorna l’indice di c in a. 
Altrimenti ritorna -1.

public static boolean isPermutation(char[] a, char[] b)
Ritorna true solo se l’array b è una permutazione valida dell’array a, ossia se ogni carattere 
di b è presente una sola volta in a (anche in posizioni diverse).

public static int[] decode(char[] a, char[] b)
Ritorna un array che contiene l’indice in cui ogni carattere di a è presente dentro a b. Ad esempio:

se a contiene 'a', 'b', 'c'
e b contiene 'b', 'a', 'c'
ritorna un array contenente 1, 0, 2
Se le dimensioni di a e b sono diverse, solleva una IllegalArgumentException con il messaggio:

	"Lunghezze diverse"
Se b non è una permutazione valida di a solleva una IllegalArgumentException con il messaggio:

	"Array b non valido"
*/

import java.util.Arrays;

public class ArrayDecoderV1 {

    // Ritorna true se la dimensione degli array a e b è differente, false altrimenti.
    public static boolean sizeDiffer(char[] a, char[] b) {

        return a.length != b.length;
    }

    // Se il carattere c è presente una sola volta nell’array a, il metodo ritorna 
    // l’indice di c in a. Altrimenti ritorna -1.
    public static int indexOfUnique(char[] a, char c) {
        
        int count = 0;
        int index = -1;

        for(int i = 0; i < a.length; i++) {

            if(a[i] == c) {
                count++;
                index = i;
            }

            if(count > 1) {
                return -1;
            }
        }

        return index;
    }

    // Ritorna true solo se l’array b è una permutazione valida dell’array a, ossia se
    // ogni carattere di b è presente una sola volta in a (anche in posizioni diverse).
    public static boolean isPermutation(char[] a, char[] b) {

        if(sizeDiffer(a, b)) {
            return false;
        }

        for(int i = 0; i < b.length; i++) {
            char c = b[i];
            if(indexOfUnique(a, c) == -1) {

                return false;
            }
        }

        return true;
    }

    // Ritorna un array che contiene l’indice in cui ogni carattere di a è presente dentro a b.
    // Ritorna eccezioni (vedi sotto)
    public static int[] decode(char[] a, char[] b) {

        // Se le dimensioni di a e b sono diverse, solleva una IllegalArgumentException con 
        // il messaggio: "Lunghezze diverse"
        if(sizeDiffer(a, b) == true) {
            throw new IllegalArgumentException("Lunghezze diverse");
        }

        // Se b non è una permutazione valida di a solleva una IllegalArgumentException con 
        // il messaggio: "Array b non valido"
        if((isPermutation(a, b)) == false) {
            throw new IllegalArgumentException("Array b non valido");
        }

        int[] indexArray = new int[a.length];
        //StringBuffer indexBuffer = new StringBuffer();

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {

                if(a[i] == b[j]) {
                    indexArray[i] = j;
                }
            }
        }
        //System.out.println("index Array: " + Arrays.toString(indexArray));

        return indexArray;
    }

    public static void main(String[] args) {

        char[] a = {'a', 'b', 'c'};//Array a: [a, b, c]
        char[] b = {'b', 'a', 'c'};//Array b: [b, a, c]

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        System.out.println();

        System.out.println("sizeDiffer(a, b): " + sizeDiffer(a, b));//sizeDiffer(a, b): false
        System.out.println();

        int index = indexOfUnique(a, 'b');
        System.out.println("indexOfUnique(a, 'b'): " + index);//indexOfUnique(a, 'b'): 1

        System.out.println("isPermutation(a, b): " + isPermutation(a, b));//isPermutation(a, b): true

        int[] indexArray = decode(a, b);
        System.out.println("indexArray: " + Arrays.toString(indexArray));//indexArray: [1, 0, 2]

        System.out.println();

        // Testing:
        System.out.println("Testing:");

        // sizeDiffer

        char[] a0 = {'a', 'b', 'c'};
        char[] b0 = {'b', 'a', 'c'};
        System.out.println("sizeDiffer(a0, b0): " + sizeDiffer(a0, b0));//false
        
        char[] a01 = {'a', 'b', 'c'};
        char[] b01 = {'b', 'a'};
        System.out.println("sizeDiffer(a01, b01): " + sizeDiffer(a01, b01));//true
        
        //--

        // isPermutation

        char[] a4 = {'a', 'b', 'c'};
        char[] b4 = {'b', 'a', 'c'};
        System.out.println("isPermutation(a4, b4): " + isPermutation(a4, b4));//true

        char[] a5 = {'a', 'b', 'c'};
        char[] b5 = {'o', 'e'};
        System.out.println("isPermutation(a5, b5): " + isPermutation(a5, b5));//false

        // decode

        try {
            char[] a2 = {'a', 'b', 'c'};
            char[] b2 = {'b', 'a', 'c'};
            decode(a2, b2);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("decode(a2, b2): " + e.getMessage());//
        }
        
        try {
            char[] a3 = {'a', 'b', 'c'};
            char[] b3 = {'b', 'a'};
            decode(a3, b3);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("decode(a3, b3): " + e.getMessage());//decode(a3, b3): Lunghezze diverse
        }

        try {
            char[] a6 = {'a', 'b', 'c'};
            char[] b6 = {'o', 'f'};
            decode(a6, b6);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("decode(a6, b6): " + e.getMessage());//decode(a6, b6): Lunghezze diverse
        }

        /*
        Array a: [a, b, c]
        Array b: [b, a, c]

        sizeDiffer(a, b): false

        indexOfUnique(a, 'b'): 1
        isPermutation(a, b): true
        indexArray: [1, 0, 2]

        Testing:
        sizeDiffer(a0, b0): false
        sizeDiffer(a01, b01): true
        isPermutation(a4, b4): true
        isPermutation(a5, b5): false
        decode(a3, b3): Lunghezze diverse
        decode(a6, b6): Lunghezze diverse
        */

    }
    
}
