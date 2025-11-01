/*
https://gitalb.github.io/eserciziario2.0/array/methods/2020/03/27/arrayencoder.html
ArrayEncoder Mar 27, 2020 array methods Livello 12 

Scrivi la classe ArrayEncoder contenente i metodi seguenti:

public static boolean sizeEquals(char[] c, int[] p)
Ritorna true se la dimensione degli array c e p equivale, false altrimenti.

public static boolean contains(int[] p, int value)
Ritorna true se l’array p contiene il valore value, false altrimenti.

public static boolean isValid(int[] p)
Ritorna true solo se l’array p contiene tutti i numeri compresi nell’intervallo [0;p.length[.

public static char[] encode(char[] c, int[] p)
Ritorna un array in cui ogni carattere di c si trova nella posizione specificata dal rispettivo valore in p. Ad esempio:

se c contiene 'a', 'b', 'c'
e p contiene 2, 0, 1
ritorna un array contenente 'b', 'c', 'a'
Se le dimensioni di c e p non sono uguali, solleva una IllegalArgumentException con il messaggio:

	"Dimensione diversa"
Se p contiene dei valori non validi, solleva una IllegalArgumentException con il messaggio:

	"Indici non validi"
*/

import java.util.Arrays;

public class ArrayEncoderV0 {

    // Ritorna true se la dimensione degli array c e p equivale, false altrimenti.
    public static boolean sizeEquals(char[] c, int[] p) {

        return c.length == p.length;
    }
    

    // Ritorna true se l’array p contiene il valore value, false altrimenti.
    public static boolean contains(int[] p, int value) {

        for(int i = 0; i < p.length; i++) {

            if(p[i] == value) {
                return true;
            }
        }

        return false;
    }
    
    // Ritorna true solo se l’array p contiene tutti i numeri compresi nell’intervallo [0;p.length].
    public static boolean isValid(int[] p) {

        int sumIndex = 0;
        int sumInt = 0;

        for(int i = 0; i < p.length; i++) {

            sumIndex += i;
            sumInt += p[i];
        }

        if(sumIndex == sumInt) {

            return true;
        } 

        return false;
    }
    

    public static char[] encode(char[] c, int[] p) {

        // Se le dimensioni di c e p non sono uguali, solleva una IllegalArgumentException con il messaggio:
        // "Dimensione diversa"
        if(!(sizeEquals(c, p))) {
            throw new IllegalArgumentException("Dimensione diversa");
        }

        // Se p contiene dei valori non validi, solleva una IllegalArgumentException con il 
        // messaggio: "Indici non validi"
        if(!(isValid(p))) {
            throw new IllegalArgumentException("Indici non validi");
        }

        // Ritorna un array in cui ogni carattere di c si trova nella posizione specificata dal 
        // rispettivo valore in p. Ad esempio:
        // se c contiene                'a', 'b', 'c'
        // se p contiene                 2,   0,   1
        // ritorna un array contenente  'b', 'c', 'a'

        char[] resultCharArray = new char[c.length];

        for(int i = 0; i < c.length; i++) {

            //resultCharArray[p[i]] = c[i];
            resultCharArray[p[i]] = c[i];       
            //                             resultCharArray[intArray[i]]  = charArray[i]
            //                             popolamento array non 0, 1, 2, ma 2, 0, 1
            //                             per resultCharArray[intArray[i]]
            //                             resultCharArray[2], resultCharArray[0], resultCharArray[1]
            //                             posizione in base al intArray = charArray[i]
            //
            // for     i   0      1       2
            // resultCharArray[p[i]] = c[i];
			
			// resultCharArray[p[0]] = c[0];
			// resultCharArray[2] = a;
			// [ , , a]

			// resultCharArray[p[1]] = c[1];
			// resultCharArray[0] = b;
			// [b, , a]

			// resultCharArray[p[2]] = c[2];
			// resultCharArray[1] = c;
			// [b, c, a]	
        }

        return resultCharArray;
    }
    
    
    public static void main(String[] args) {
        
        char[] charArray = {'a', 'b', 'c'};
        int[] intArray = {2, 0, 1};

        System.out.println("charArray: " + Arrays.toString(charArray));//charArray: [a, b, c]
        System.out.println("intArray: " + Arrays.toString(intArray));//intArray: [2, 0, 1]

        System.out.println("sizeEquals(charArray, intArray): " + sizeEquals(charArray, intArray));
        //sizeEquals(charArray, intArray): true

        System.out.println("contains(intArray, 3): " + contains(intArray, 3));//false
        System.out.println("contains(intArray, 1): " + contains(intArray, 1));//true

        System.out.println("isValid(intArray): " + isValid(intArray));//isValid(intArray): true

        char[] encoded = encode(charArray, intArray);
        System.out.println("encode(charArray, charArray): " + Arrays.toString(encoded));
        //charArray: [a, b, c]
        //intArray:  [2, 0, 1]
        //encode     [b, c, a]  charArray[index int Array]
        //encode(charArray, charArray): [c, a, b]      

        System.out.println("\nTesting:\n");

        try {
            encode(charArray, intArray);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("encode(charArray, intArray): " + e.getMessage());//
        }

        try {
            char[] charArray2 = {'a', 'b', 'c'};
            int[] intArray2 = {2, 0, 1, 4};
            encode(charArray2, intArray2);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("encode(charArray2, intArray2): " + e.getMessage());//Dimensione diversa
        }

        try {
            char[] charArray3 = {'a', 'b', 'c'};
            int[] intArray3 = {2, 0, 4};
            encode(charArray3, intArray3);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("encode(charArray3, intArray3): " + e.getMessage());//
        }

        // isValid
        char[] charArray4= {'a', 'b', 'c'};
        int[] intArray4 = {0, 3, 1};
        System.out.println("intArray4.length: " + intArray4.length);//3
        System.out.println("isValid(intArray4): " + isValid(intArray4));//
        
    }
    
}
