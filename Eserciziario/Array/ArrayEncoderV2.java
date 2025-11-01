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

public class ArrayEncoderV2 {

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

    // Ritorna true solo se l'array p contiene tutti i numeri compresi nell'intervallo [0; p.length[
    public static boolean isValid(int[] p) {
        for (int i = 0; i < p.length; i++) {
            boolean found = false;
            for (int j = 0; j < p.length; j++) {
                if (p[j] == i) {
                    /*
                    p[j] == i
                    p[0] == 0   p[0] == 1   p[0] == 2
                    p[1] == 0   p[1] == 1   p[1] == 2
                    p[2] == 0   p[2] == 1   p[2] == 2
                    */
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    // Ritorna un array in cui ogni carattere di c si trova nella posizione specificata dal rispettivo valore in p
    public static char[] encode(char[] c, int[] p) {
        // Se le dimensioni di c e p non sono uguali, solleva un'eccezione
        if (!sizeEquals(c, p)) {
            throw new IllegalArgumentException("Dimensione diversa");
        }

        // Se p contiene valori non validi, solleva un'eccezione
        if (!isValid(p)) {
            throw new IllegalArgumentException("Indici non validi");
        }

        // Crea un nuovo array per il risultato
        char[] encodedArray = new char[c.length];

        // Popola l'array encodedArray in base alle posizioni specificate in p
        for (int i = 0; i < p.length; i++) {
            encodedArray[p[i]] = c[i];
        }

        return encodedArray;
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        char[] c = {'a', 'b', 'c'};
		char[] d = {'f', 'g'};
        int[] p = {2, 0, 1};
		int[] r = {2, 7, 1};

        System.out.println("sizeEquals(c, p): " + sizeEquals(c, p)); // true
        System.out.println("contains(p, 1): " + contains(p, 1)); // true
        System.out.println("isValid(p): " + isValid(p)); // true

        char[] encoded = encode(c, p);
        System.out.println("encode(c, p): " + Arrays.toString(encoded)); // [b, c, a]

        // Test eccezioni
        try {
            char[] c2 = {'a', 'b'};
            int[] p2 = {1, 0, 2};
            encode(c2, p2);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage()); // Dimensione diversa
        }

        try {
            char[] c3 = {'a', 'b', 'c'};
            int[] p3 = {1, 2, 3}; // Valore 3 non è valido
            encode(c3, p3);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage()); // Indici non validi
        }
    }
}