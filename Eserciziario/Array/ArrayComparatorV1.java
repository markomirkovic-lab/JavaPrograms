
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

import java.util.Arrays;

public class ArrayComparatorV1 {

    // Metodo per verificare se l'array a è più lungo di b
    public static boolean isLonger(char[] a, char[] b) {

        return a.length > b.length;

    }

    // Metodo per verificare se l'array a è lungo come b
    public static boolean isEqual(char[] a, char[] b) {

        return a.length == b.length;

    }

    // Metodo per aggiungere un carattere in coda all'array a
    public static char[] append(char c, char[] a) {

        // Crea un nuovo array con dimensione aumentata di 1
        char[] result = new char[a.length+1];

        // Copia manualmente gli elementi di a in result
        for(int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        result[result.length-1] = c;

        return result;
    }

    
    
    // Metodo per verificare se l'array contiene solo vocali (a, e, i, o, u)
    public static boolean onlyContainsVowels(char[] a){

        for(int i = 0; i < a.length; i++) {

            char c = a[i];

            // Controlla se il carattere non è una vocale
            if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                 c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                    //// Se trova un carattere non vocale, ritorna false
                    return false;
            }
        }
        // Se tutti i caratteri sono vocali
        return true; 
    }

    // Metodo per confrontare le vocali in posizioni corrispondenti tra a e b
    public static char[] compare(char[] a, char[] b) {

        // Ritorna un array contenente l’elenco di vocali di a che si trovano nella stessa posizione dentro a b:
        // se a contiene 'i', 'u', 'A'
        // e b contiene 'i', 'a', 'a', 'u'
        // ritorna un array contenente 'i', 'A'

        if(!onlyContainsVowels(a)){
            System.out.println("Array a non valido");
        }

        if(!onlyContainsVowels(b)) {
            System.out.println("Array b non valido");
        }

        if(isLonger(a, b)) {
            System.out.println("Array b troppo piccolo");
        }

        //--

        // Trova le vocali in posizioni corrispondenti
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < a.length && i < b.length; i++) {

            char charA = a[i];
            char charB = b[i];

            // Verifica se il carattere in a è una vocale e se corrisponde in b
            if((charA == 'a' || charA == 'e' || charA == 'i' || charA == 'o' || charA == 'u' ||
                charA == 'A' || charA == 'E' || charA == 'I' || charA == 'O' || charA == 'U') &&
                charA == charB) {
                    // Aggunge la vocale al risultato
                    result.append(charA);
                }
        }

        // Conversione dell'array in un array di char
        char[] resultArray = new char[result.length()];

        for(int i = 0; i < resultArray.length; i++) {

            resultArray[i] = result.charAt(i);
        }

        return resultArray;
    }


    public static void main(String[] args) {

        char[] arrayA = {'i', 'u', 'A'};
        char[] arrayB = {'i', 'a', 'a', 'u'};

        //--

        System.out.println(Arrays.toString(arrayA));// [i, u, A]
        System.out.println(Arrays.toString(arrayB));// [i, a, a, u]
        System.out.println();

        // Test isLonger
        System.out.println("isLonger (a, b): " + isLonger(arrayA, arrayB));//isLonger (a, b): false
        System.out.println();

        // Test isEqual
        System.out.println("isEqual (a, b): " + isEqual(arrayA, arrayB));//isEqual (a, b): false
        System.out.println();

        // Test both
        if(!isLonger(arrayA, arrayB) && !isEqual(arrayA, arrayB)) {
            System.out.println("Array B is bigger than array A");//Array B is bigger than array A
        }
        System.out.println();

        // Test append
        char[] appendedArray = append('e', arrayB);
        System.out.println("append('x', arrayB): " + Arrays.toString(appendedArray));//append('x', arrayB): [i, a, a, u, e]
        System.out.println();

        System.out.println("append('x', arrayB): " + new String(appendedArray));//append('x', arrayB): iaaue
        System.out.println();

        // Test onlyContainsVowels
        System.out.println("onlyContainsVowels ArrayA: " + onlyContainsVowels(arrayA));//onlyContainsVowels ArrayA: true
        System.out.println("onlyContainsVowels ArrayB: " + onlyContainsVowels(arrayB));//onlyContainsVowels ArrayB: true
        System.out.println();

        // Test compare
        char[] resultArray = compare(arrayA, arrayB);
        System.out.println("compare(arrayA, arrayB): " + Arrays.toString(resultArray));//compare(arrayA, arrayB): [i]
        System.out.println("compare(arrayA, arrayB): " + new String(resultArray));//compare(arrayA, arrayB): i
        System.out.println();
        
        //--

        /*
        [i, u, A]
        [i, a, a, u]

        isLonger (a, b): false

        isEqual (a, b): false

        Array B is bigger than array A

        append('x', arrayB): [i, a, a, u, e]

        append('x', arrayB): iaaue

        onlyContainsVowels ArrayA: true
        onlyContainsVowels ArrayB: true

        compare(arrayA, arrayB): [i]

        compare(arrayA, arrayB): i
        */
    }
    
}
