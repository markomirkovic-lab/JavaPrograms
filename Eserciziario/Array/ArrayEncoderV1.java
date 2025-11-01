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

se c contiene 				'a', 'b', 'c'
e p contiene 				 2,   0,   1
ritorna un array contenente 'b', 'c', 'a'
Se le dimensioni di c e p non sono uguali, solleva una IllegalArgumentException con il messaggio:

	"Dimensione diversa"
Se p contiene dei valori non validi, solleva una IllegalArgumentException con il messaggio:

	"Indici non validi"
*/

import java.util.Arrays;

public class ArrayEncoderV1 {

	// Ritorna true se la dimensione degli array c e p è uguale, false altrimenti
    public static boolean sizeEquals(char[] c, int[] p) {
        return c.length == p.length;
    }

    // Ritorna true se l'array p contiene il valore value, false altrimenti
    public static boolean contains(int[] p, int value) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == value) {
                return true;
            }
        }
        return false;
    }

	// Ritorna true solo se l’array p contiene tutti i numeri compresi nell’intervallo [0;p.length].
    public static boolean isValid(int[] p) {

		for(int i = 0; i < p.length; i++) {
			
			boolean found = false;// reset a false per ogni ciclo
			
			for(int j = 0; j < p.length; j++) {

				if(p[j] == i) {
					/*
                    p[j] == i
                    p[0] == 0   p[0] == 1   p[0] == 2	...
                    p[1] == 0   p[1] == 1   p[1] == 2	...
                    p[2] == 0   p[2] == 1   p[2] == 2	...
                    */
					found = true;
					break;
				}
			}
			if(!found) {
				return false;
			}
		}

		return true;
	}

	// Solleva eccezione se le dimensioni degli array non sono uguali
	// Solleva eccezione se p contiene valori non validi
	// Ritorna un array in cui ogni carattere di c si trova nella posizione specificata dal rispettivo valore in p
	public static char[] encode(char[] c, int[] p) {

		// Se le dimensioni di c e p non sono uguali, solleva una IllegalArgumentException con il messaggio:
        // "Dimensione diversa"
		if(!sizeEquals(c, p)) {

			throw new IllegalArgumentException("Dimensione diversa");
		}

		// Se p contiene dei valori non validi, solleva una IllegalArgumentException con il messaggio:
        // "Indici non validi"
		if(!isValid(p)) {

			throw new IllegalArgumentException("Indici non validi");
		}

		// Crea un nuovo array per il risultato
		char[] risultato = new char[c.length];

		// Ritorna un array in cui ogni carattere di c si trova nella posizione specificata dal rispettivo valore in p
		// Popola l'array encodedArray in base alle posizioni specificate in p
		for(int i = 0; i < p.length && i < c.length; i++) {

			//charArray: [a, b, c]
			//intArray:  [2, 0, 1]
			//encode     [b, c, a]  charArray[index int Array]
			//encode(charArray, charArray): [c, a, b]   

			risultato[p[i]] = c[i];
			// risultato[p[i]] = c[i];
			
			// risultato[p[0]] = c[0];
			// risultato[2] = a;
			// [ , , a]

			// risultato[p[1]] = c[1];
			// risultato[0] = b;
			// [b, , a]

			// risultato[p[2]] = c[2];
			// risultato[1] = c;
			// [b, c, a]		   

		}

		return risultato;
	}

		



	public static void main(String[] args) {
		
		char[] c = {'a', 'b', 'c'};
		char[] d = {'f', 'g'};
        int[] p = {2, 0, 1};
		int[] r = {2, 7, 1};

		System.out.println("sizeEquals(c, p): " + sizeEquals(c, p));//true
		System.out.println("sizeEquals(d, p): " + sizeEquals(d, p));//false
		System.out.println("contains(p, 1): " + contains(p, 1));//true
		System.out.println("contains(p, 7): " + contains(p, 7));//false
		System.out.println("isValid(p): " + isValid(p));//true
		System.out.println("isValid(r): " + isValid(r));//false

		char[] result = encode(c, p);
		System.out.println("result: " + Arrays.toString(result));//result: [b, c, a]





	}
    
}
