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
public class ArrayDecoderV2 {

    /*
    Spiegazione dei metodi:

    sizeDiffer(char[] a, char[] b):
    Verifica se le dimensioni degli array a e b sono diverse. Ritorna true se le dimensioni 
    sono diverse, altrimenti false.

    indexOfUnique(char[] a, char c):
    Cerca il carattere c nell'array a. Se il carattere è presente una sola volta, ritorna 
    l'indice della sua posizione. Se il carattere è presente più di una volta o non è 
    presente, ritorna -1.

    isPermutation(char[] a, char[] b):
    Verifica se b è una permutazione valida di a. Questo significa che ogni carattere di 
    b deve essere presente esattamente una volta in a. Se le dimensioni degli array sono 
    diverse o se b non è una permutazione valida di a, ritorna false.

    decode(char[] a, char[] b):
    Ritorna un array di interi che rappresenta l'indice di ogni carattere di a in b. 
    Se le dimensioni degli array sono diverse, solleva un'eccezione IllegalArgumentException 
    con il messaggio "Lunghezze diverse". Se b non è una permutazione valida di a, 
    solleva un'eccezione IllegalArgumentException con il messaggio "Array b non valido".

    Esempio di utilizzo:
    Nel metodo main, viene testata la classe con due array a e b. Viene verificato se le 
    dimensioni degli array sono diverse, se un carattere è unico in a, se b è una 
    permutazione valida di a, e infine viene eseguita la decodifica di a rispetto a b.

    Output atteso:
    Copy
    sizeDiffer: false
    indexOfUnique 'a': 0
    isPermutation: true
    decode: 1 0 2
    */

    // Metodo per verificare se le dimensioni degli array sono diverse
    public static boolean sizeDiffer(char[] a, char[] b) {
        return a.length != b.length;
    }

    // Metodo per trovare l'indice di un carattere unico in un array
    public static int indexOfUnique(char[] a, char c) {
        int count = 0;
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == c) {
                count++;
                index = i;
            }
            if (count > 1) {
                return -1;
            }
        }
        return index;
    }

    // Metodo per verificare se b è una permutazione valida di a
    public static boolean isPermutation(char[] a, char[] b) {
        if (sizeDiffer(a, b)) {
            return false;
        }
        for (char c : b) {
            if (indexOfUnique(a, c) == -1) {
                return false;
            }
        }
        return true;
    }

    // Metodo per decodificare l'array a rispetto all'array b
    public static int[] decode(char[] a, char[] b) {
        if (sizeDiffer(a, b)) {
            throw new IllegalArgumentException("Lunghezze diverse");
        }
        if (!isPermutation(a, b)) {
            throw new IllegalArgumentException("Array b non valido");
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = indexOfUnique(b, a[i]);
        }
        return result;
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};
        char[] b = {'b', 'a', 'c'};

        System.out.println("sizeDiffer: " + sizeDiffer(a, b)); // false
        System.out.println("indexOfUnique 'a': " + indexOfUnique(a, 'a')); // 0
        System.out.println("isPermutation: " + isPermutation(a, b)); // true

        int[] decoded = decode(a, b);
        System.out.print("decode: ");
        for (int i : decoded) {
            System.out.print(i + " "); // 1 0 2
        }
    }
}