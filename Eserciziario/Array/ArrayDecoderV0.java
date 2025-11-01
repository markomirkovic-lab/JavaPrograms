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

public class ArrayDecoderV0 {

    // Ritorna true se la dimensione degli array a e b è differente, false altrimenti.
    public static boolean sizeDiffer(char[] a, char[] b) {

        /*
        if(!(a.length == b.length)) {
            return true;
        }

        return false;
        */
        return a.length != b.length;
    }

    // Se il carattere c è presente una sola volta nell’array a, il metodo ritorna 
    // l’indice di c in a. Altrimenti ritorna -1.
    public static int indexOfUnique(char[] a, char c) {
        
        int cntr = 0;
        for(int i = 0; i < a.length; i++) {
            
            if(a[i]==c) {
                cntr++;
            }
        }

        if(cntr == 1) {
            return cntr;
        }

        return -1;
    }

    // Ritorna true solo se l’array b è una permutazione valida dell’array a, ossia se
    // ogni carattere di b è presente una sola volta in a (anche in posizioni diverse).
    public static boolean isPermutation(char[] a, char[] b) {

        char[] arrayAB = new char[a.length+b.length];
        System.arraycopy(a, 0, arrayAB, 0, a.length);
        System.arraycopy(b, 0, arrayAB, a.length, b.length);

        StringBuffer arrayDoubleLetters = new StringBuffer();

         System.out.print("ArrayAB: ");
        for(char c : arrayAB) {
            System.out.print(c + " ");
        }
        System.out.println();

        int cntr = 0;
        for(int i = 0; i < a.length; i++) {

            char c = arrayAB[i];
            // A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
            if(c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' ||
               c == 'h' || c == 'i' || c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' ||
               c == 'o' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'u' ||
               c == 'v' || c == 'x' || c == 'y' || c == 'z' 
            ) {
                cntr++;
                arrayDoubleLetters.append(c);
            }
        }

        System.out.println("arrayDoubleLetters: " + new String (arrayDoubleLetters));

        if((arrayAB.length / cntr) == 2) {
            return true;
        }

        return false;
    }

    // Ritorna un array che contiene l’indice in cui ogni carattere di a è presente dentro a b.
    // Ritorna eccezioni (vedi sotto)
    public static int[] decode(char[] a, char[] b) {

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


      
        try {
            char[] a0 = {'a', 'b', 'c'};
            char[] b0 = {'b', 'a', 'c'};
            sizeDiffer(a0, b0);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("sizeDiffer(a0, b0): " + e.getMessage());//
        }

        try {
            char[] a01 = {'a', 'b', 'c'};
            char[] b01 = {'b', 'a'};
            sizeDiffer(a01, b01);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("sizeDiffer(a01, b01): " + e.getMessage());// Lunghezze diverse
        }

        //--

        // isPermutation

        try {
            char[] a4 = {'a', 'b', 'c'};
            char[] b4 = {'b', 'a', 'c'};
            isPermutation(a4, b4);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("isPermutation(a4, b4): " + e.getMessage());//
        }

        try {
            char[] a5 = {'a', 'b', 'c'};
            char[] b5 = {'o', 'e'};
            isPermutation(a5, b5);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("isPermutation(a5, b5): " + e.getMessage());//
        }

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
        
            




    }
    
}
