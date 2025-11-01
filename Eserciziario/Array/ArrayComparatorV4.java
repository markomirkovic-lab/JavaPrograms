/*
https://gitalb.github.io/eserciziario2.0/array/methods/2020/03/27/arraycomparator.html
ArrayComparator Mar 27, 2020 array methods Livello 12 

Scrivi la classe ArrayComparator contenente i metodi seguenti:

public static boolean isLonger(char[] a, char[] b)
Ritorna true se la dimensione dell’ array a è superiore a quella di b, false altrimenti.

public static char[] append(char c, char[] a)
Aggiunge il carattere c in coda ad a e ritorna l’array risultante.

public static boolean onlyContainsVowels(char[] a)
Ritorna true se l’array a contiene esclusivamente vocali, altrimenti ritorna false.

public static char[] compare(char[] a, char[] b)
Ritorna un array contenente l’elenco di vocali di a che si trovano nella stessa posizione dentro a b:

se a contiene 'i', 'u', 'A'
e b contiene 'i', 'a', 'a', 'u'
ritorna un array contenente 'i', 'A'

Se a contiene caratteri non validi, solleva una IllegalArgumentException con il messaggio:

	"Array a non valido"

Se b contiene caratteri non validi, solleva una IllegalArgumentException con il messaggio:

	"Array b non valido"

Se b è più piccolo di a, solleva una IllegalArgumentException con il messaggio:

	"Array b troppo piccolo"	

*/
public class ArrayComparatorV4 {

    /*
    Spiegazione dei metodi:
    isLonger(char[] a, char[] b):
    Confronta le lunghezze degli array a e b.
    Restituisce true se a è più lungo di b, altrimenti false.

    append(char c, char[] a):
    Crea un nuovo array con una dimensione maggiore di 1 rispetto ad a.
    Copia tutti gli elementi di a nel nuovo array e aggiunge c in coda.
    Restituisce il nuovo array.

    onlyContainsVowels(char[] a):
    Verifica se tutti i caratteri nell'array a sono vocali.
    Restituisce true se tutti i caratteri sono vocali, altrimenti false.

    compare(char[] a, char[] b):
    Confronta le vocali in posizioni corrispondenti tra a e b.
    Restituisce un array contenente le vocali di a che si trovano nella stessa posizione in b.
    Lancia eccezioni se a o b contengono caratteri non validi o se b è più piccolo di a.

    Metodi di supporto:
    isVowel(char c): Verifica se un carattere è una vocale.
    isValidCharacter(char c): Verifica se un carattere è una lettera valida.
    */

    // Metodo per verificare se l'array a è più lungo di b
    public static boolean isLonger(char[] a, char[] b) {
        return a.length > b.length;
    }

    // Metodo per aggiungere un carattere in coda all'array a
    public static char[] append(char c, char[] a) {
        char[] result = new char[a.length + 1]; // Crea un nuovo array con dimensione aumentata di 1
        //     arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        System.arraycopy(a, 0, result, 0, a.length); // Copia l'array originale nel nuovo array
        result[a.length] = c; // Aggiunge il carattere in coda
        return result;
    }

    // Metodo per verificare se l'array contiene solo vocali
    public static boolean onlyContainsVowels(char[] a) {
        for (char c : a) {
            if (!isVowel(c)) { // Se un carattere non è una vocale, ritorna false
                return false;
            }
        }
        return true; // Tutti i caratteri sono vocali
    }
    /*
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1; // Controlla se il carattere è una vocale
    }
    */

    // Metodo per confrontare le vocali in posizioni corrispondenti tra a e b
    public static char[] compare(char[] a, char[] b) {
        // Controlla se a contiene caratteri non validi
        for (char c : a) {
            if (!isValidCharacter(c)) {
                throw new IllegalArgumentException("Array a non valido");
            }
        }

        // Controlla se b contiene caratteri non validi
        for (char c : b) {
            if (!isValidCharacter(c)) {
                throw new IllegalArgumentException("Array b non valido");
            }
        }
        /*
        private static boolean isValidCharacter(char c) {
        return Character.isLetter(c); // Controlla se il carattere è una lettera
        }

        Character.class
        Character.isLetter()
        Determines if the specified character is a letter.
        A character is considered to be a letter if its general category type, provided by Character.getType(ch)
        */

        // Controlla se b è più piccolo di a
        if (b.length < a.length) {
            throw new IllegalArgumentException("Array b troppo piccolo");
        }

        // Trova le vocali in posizioni corrispondenti
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (isVowel(a[i]) && a[i] == b[i]) { // Se è una vocale e corrisponde in a e b
                result.append(a[i]); // Aggiungi la vocale al risultato
            }
        }

        // Converti il risultato in un array di char
        return result.toString().toCharArray();
        // String java.lang.StringBuilder.toString()
        // Returns a string containing the characters in this sequence in the same order as
        // this sequence. The length of the string will be the length of this sequence.
        // char[] java.lang.String.toCharArray()
        // Converts this string to a new character array.
        // Returns:
        // a newly allocated character array whose length is the length of this string and whose 
        // contents are initialized to contain the character sequence represented by this string.
    }

    // Metodo per verificare se un carattere è una vocale
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1; // Controlla se il carattere è una vocale
    }

    // Metodo per verificare se un carattere è valido (lettera o vocale)
    private static boolean isValidCharacter(char c) {
        return Character.isLetter(c); // Controlla se il carattere è una lettera
    }
    /*
    Character.class
    Character.isLetter()
    Determines if the specified character is a letter.
    A character is considered to be a letter if its general category type, provided by Character.getType(ch)
    */

    // Metodo di test
    public static void main(String[] args) {
        // Test isLonger
        char[] a = {'a', 'b', 'c'};
        char[] b = {'d', 'e'};
        System.out.println("isLonger(a, b): " + isLonger(a, b)); // true

        // Test append
        char[] appended = append('x', a);
        System.out.println("append('x', a): " + new String(appended)); // "abcx"

        // Test onlyContainsVowels
        char[] vowels = {'a', 'e', 'i'};
        char[] nonVowels = {'a', 'b', 'c'};
        System.out.println("onlyContainsVowels(vowels): " + onlyContainsVowels(vowels)); // true
        System.out.println("onlyContainsVowels(nonVowels): " + onlyContainsVowels(nonVowels)); // false

        // Test compare
        char[] a1 = {'i', 'u', 'A'};
        char[] b1 = {'i', 'a', 'a', 'u'};
        char[] result = compare(a1, b1);
        System.out.println("compare(a1, b1): " + new String(result)); // "iA"

        // Test eccezioni
        try {
            char[] invalidA = {'1', 'u', 'A'};
            compare(invalidA, b1); // Dovrebbe lanciare IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // "Array a non valido"
        }

        try {
            char[] invalidB = {'i', 'a', '1', 'u'};
            compare(a1, invalidB); // Dovrebbe lanciare IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // "Array b non valido"
        }

        try {
            char[] smallB = {'i', 'a'};
            compare(a1, smallB); // Dovrebbe lanciare IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // "Array b troppo piccolo"
        }

        /*
        isLonger(a, b): true
        append('x', a): abcx
        onlyContainsVowels(vowels): true
        onlyContainsVowels(nonVowels): false
        compare(a1, b1): i
        Array a non valido
        Array b non valido
        Array b troppo piccolo
        */
    }
}
