import java.util.Arrays;

public class ArrayEncoderV3 {

    /*
    Spiegazione dei metodi:
    sizeEquals(char[] c, int[] p):
    Verifica se le dimensioni degli array c e p sono uguali. 
    Ritorna true se sono uguali, altrimenti false.

    contains(int[] p, int value):
    Verifica se l'array p contiene il valore value. 
    Ritorna true se il valore è presente, altrimenti false.

    isValid(int[] p):
    Verifica se l'array p contiene tutti i numeri compresi nell'intervallo 
    [0; p.length[. Ritorna true se è valido, altrimenti false.

    encode(char[] c, int[] p):
    Crea un nuovo array in cui ogni carattere di c viene posizionato 
    secondo l'indice specificato in p.

    Se le dimensioni di c e p non sono uguali, solleva un'eccezione 
    IllegalArgumentException con il messaggio "Dimensione diversa".

    Se p contiene valori non validi (cioè non copre l'intervallo 
    [0; p.length[), solleva un'eccezione IllegalArgumentException 
    con il messaggio "Indici non validi".

    Esempio di utilizzo:
    Nel metodo main, viene testata la classe con due array c e p. 
    Viene verificato se le dimensioni degli array sono uguali, 
    se un valore è presente in p, se p è valido e infine viene 
    eseguita la codifica di c rispetto a p.

    Output atteso:
    Copy
    sizeEquals(c, p): true
    contains(p, 1): true
    isValid(p): true
    encode(c, p): [b, c, a]
    Errore: Dimensione diversa
    Errore: Indici non validi
    
    Note:
    Il metodo encode utilizza gli indici specificati in p per 
    posizionare i caratteri di c nel nuovo array.
    Le eccezioni vengono sollevate quando le condizioni non 
    sono soddisfatte, garantendo che il metodo funzioni 
    correttamente solo con input validi.
    */

    // Ritorna true se la dimensione degli array c e p è uguale, false altrimenti
    public static boolean sizeEquals(char[] c, int[] p) {
        return c.length == p.length;
    }

    // Ritorna true se l'array p contiene il valore value, false altrimenti
    public static boolean contains(int[] p, int value) {
        for (int i : p) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    // Ritorna true solo se l'array p contiene tutti i numeri compresi nell'intervallo [0; p.length]
    public static boolean isValid(int[] p) {
        for (int i = 0; i < p.length; i++) {
            if (!contains(p, i)) {
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
        int[] p = {2, 0, 1};

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