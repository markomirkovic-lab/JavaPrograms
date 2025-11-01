public class ArrayComparatorV2 {

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
        // Trova le vocali in posizioni corrispondenti
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length && i < b.length; i++) { // Usa la lunghezza minima tra a e b
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
    }
}