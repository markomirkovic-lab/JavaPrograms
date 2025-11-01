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

public class ArrayComparatorV0 {

    public static boolean isLonger(char[] a, char[] b) {

        int lengthArrayA = a.length;
        int lengthArrayB = b.length;

        if(lengthArrayA > lengthArrayB) {
            //System.out.print("Array A is longer ");
        } else {
            //System.out.print("Array B is longer ");
        }

        return lengthArrayA > lengthArrayB;
    }


    public static char[] append(char c, char[] a) {

        char tmp[] = new char[a.length+1];

        for(int i = 0; i < a.length; i++) {
            tmp[i] = a[i];
        }

        tmp[tmp.length-1] = c;

        //System.out.println(Arrays.toString(tmp));

        a = tmp;

        //System.out.println(Arrays.toString(a));

        tmp = null;

        return a;
    }

    public static boolean onlyContainsVowels(char[] a){

        boolean onlyVowels = false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == 'a' ||
               a[i] == 'e' ||
               a[i] == 'i' ||
               a[i] == 'o' ||
               a[i] == 'u' ||
               a[i] == 'A' ||
               a[i] == 'E' ||
               a[i] == 'I' ||
               a[i] == 'O' ||
               a[i] == 'U'
            ) {
                onlyVowels = true;
            } else {
                onlyVowels = false;
            }

        }

        return onlyVowels;
    }

    public static char[] compare(char[] a, char[] b) {

        char[] arrayTemp1;
        int length1;
        int length2;

        if(isLonger(a, b)) {
            arrayTemp1 = new char[a.length];
            length1 = a.length;
        } else {
            arrayTemp1 = new char[b.length];
            length1 = b.length;
        }
        
        int cntr = 0;
        for(int i = 0; i < a.length && i < b.length; i++) {
            if(a[i] == b[i]) {
                arrayTemp1[i] = a[i];
                cntr++;
            }
        }
 
        length2 = cntr;

        char[] arrayTemp2 = new char[length2];

        for(int i = 0; i < arrayTemp2.length; i++) {
            arrayTemp2[i] = arrayTemp1[i];
        }

        System.out.println(Arrays.toString(arrayTemp2));
        System.out.println(new String(arrayTemp2));

        //--

        try {
            onlyContainsVowels(a);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Array a non valido: " + e.getMessage());
        }

        try {
            onlyContainsVowels(b);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Array b non valido: "  + e.getMessage());
        }

        try {
            isLonger(a, b);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Array b troppo piccolo: "  + e.getMessage());
        }

        return arrayTemp2;
    }
    

    public static void main(String[] args) {

        char[] arrayA = {'i', 'u', 'A'};

        char[] arrayB = {'i', 'a', 'a', 'u'};

        System.out.println(Arrays.toString(arrayA));//[i, u, A]
        System.out.println(Arrays.toString(arrayB));//[i, a, a, u]
        System.out.println();

        isLonger(arrayA, arrayB);//Array B is longer
        System.out.println("isLonger(arrayA, arrayB): " + isLonger(arrayA, arrayB));
        //isLonger(arrayA, arrayB): false
        System.out.println();

        char[] resultArray = append('o', arrayB);
        System.out.println(Arrays.toString(resultArray));//[i, a, a, u, o]

        System.out.println(onlyContainsVowels(arrayA));//true
        System.out.println(onlyContainsVowels(arrayB));//true
        System.out.println(onlyContainsVowels(resultArray));//true

        System.out.print("compare(arrayA, arrayB): ");
        compare(arrayA, arrayB);
        //[i]
        //i
    }
    
}
