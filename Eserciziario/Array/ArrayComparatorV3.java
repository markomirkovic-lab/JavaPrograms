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
public class ArrayComparatorV3 {

    // Metodo per verificare se l'array a è più lungo di b
    public static boolean isLonger(char[] a, char[] b) {
        return a.length > b.length;
    }

    // Metodo per aggiungere un carattere in coda all'array a
    public static char[] append(char c, char[] a) {
        char[] result = new char[a.length + 1]; // Crea un nuovo array con dimensione aumentata di 1
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i]; // Copia manualmente gli elementi di a in result
        }
        result[a.length] = c; // Aggiunge il carattere in coda
        return result;
    }

    // Metodo per verificare se l'array contiene solo vocali
    public static boolean onlyContainsVowels(char[] a) {
        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            // Controlla se il carattere non è una vocale
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                  c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                return false; // Se trova un carattere non vocale, ritorna false
            }
        }
        return true; // Tutti i caratteri sono vocali
    }

    // Metodo per confrontare le vocali in posizioni corrispondenti tra a e b
    public static char[] compare(char[] a, char[] b) {
        
        // Controlla se a contiene caratteri non validi (non lettere)
        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                throw new IllegalArgumentException("Array a non valido");
            }
        }

        // Controlla se b contiene caratteri non validi (non lettere)
        for (int i = 0; i < b.length; i++) {
            char c = b[i];
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                throw new IllegalArgumentException("Array b non valido");
            }
        }

        // Controlla se b è più piccolo di a
        if (b.length < a.length) {
            throw new IllegalArgumentException("Array b troppo piccolo");
        }

        // Trova le vocali in posizioni corrispondenti
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            char charA = a[i];
            char charB = b[i];
            // Verifica se il carattere in a è una vocale e se corrisponde in b
            if ((charA == 'a' || charA == 'e' || charA == 'i' || charA == 'o' || charA == 'u' ||
                 charA == 'A' || charA == 'E' || charA == 'I' || charA == 'O' || charA == 'U') &&
                charA == charB) {
                result.append(charA); // Aggiungi la vocale al risultato
            }
        }

        // Converti il risultato in un array di char
        char[] resultArray = new char[result.length()];
        for (int i = 0; i < result.length(); i++) {
            resultArray[i] = result.charAt(i);
        }
        return resultArray;
    }

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