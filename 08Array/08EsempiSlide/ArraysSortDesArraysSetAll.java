
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysSortDesArraysSetAll {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrInvertito = new int[arr.length];

        /*
        void java.util.Arrays.setAll(int[] array, IntUnaryOperator generator)
        Set all elements of the specified array, using the provided generator function to compute each element.
        If the generator function throws an exception, it is relayed to the caller and the array is left in an indeterminate state.

        Parameters:
        array array to be initialized
        generator a function accepting an index and producing the desired value for that position

        Throws:
        NullPointerException - if the generator is null

        Since:
        1.8

        API Note:
        Setting a subrange of an array, using a generator function to compute each element, can be written as follows:
        IntStream.range(startInclusive, endExclusive)
          .forEach(i -> array[i] = generator.applyAsInt(i));

        */
        Arrays.setAll(arrInvertito, i -> arr[arr.length - 1 - i]);
        /*
        Arrays.setAll(arrInvertito, i -> arr[arr.length - 1 - i]);
        è un modo conciso e funzionale per riempire un nuovo array (arrInvertito) con gli elementi 
        dell'array originale (arr) in ordine inverso. Analizziamo come funziona passo dopo passo:

        1. Arrays.setAll()
        Arrays.setAll è un metodo introdotto in Java 8 che permette di riempire un array utilizzando 
        una funzione (un'espressione lambda). La sintassi è:

        Arrays.setAll(array, generatorFunction);
        array: L'array da riempire.

        generatorFunction: Una funzione che prende l'indice i e restituisce il valore da inserire 
        in quella posizione dell'array.

        2. arrInvertito
        arrInvertito è un nuovo array della stessa lunghezza di arr, creato per memorizzare gli 
        elementi invertiti.

        3. i -> arr[arr.length - 1 - i]
        Questa è un'espressione lambda che definisce la funzione generatrice. Ecco come funziona:

        i: È l'indice corrente dell'array arrInvertito (parte da 0 e arriva fino a arr.length - 1).

        arr.length - 1 - i: Calcola l'indice corrispondente nell'array originale arr per ottenere 
        l'elemento in ordine inverso.

        Se i = 0, allora arr.length - 1 - i è arr.length - 1, che corrisponde all'ultimo elemento 
        di arr.

        Se i = 1, allora arr.length - 1 - i è arr.length - 2, che corrisponde al penultimo elemento 
        di arr.

        E così via, fino a i = arr.length - 1, dove arr.length - 1 - i è 0, che corrisponde al primo 
        elemento di arr.

        4. Esempio pratico
        Supponiamo di avere l'array originale:

        int[] arr = {1, 2, 3, 4, 5, 6};
        La lunghezza di arr è 6.

        Creiamo un nuovo array arrInvertito della stessa lunghezza:

        int[] arrInvertito = new int[arr.length];
        Ora, applichiamo Arrays.setAll:

        Arrays.setAll(arrInvertito, i -> arr[arr.length - 1 - i]);
        Ecco come vengono calcolati i valori:

        i (indice di arrInvertito)	arr.length - 1 - i (indice di arr)	Valore di arr[arr.length - 1 - i]
        0	                        5	                                6
        1	                        4	                                5
        2	                        3	                                4
        3	                        2	                                3
        4	                        1	                                2
        5	                        0	                                1
        
        Alla fine, arrInvertito conterrà:
        {6, 5, 4, 3, 2, 1}

        5. Vantaggi di questo approccio
        Conciso: Una sola linea di codice per invertire l'array.
        Leggibile: L'espressione lambda rende chiaro il processo di inversione.
        Funzionale: Sfrutta le funzionalità introdotte in Java 8 per una programmazione più moderna.
        */

        // Stampa l'array invertito
        for (int i : arrInvertito) {
            System.out.print(i + " ");  // Output: 6 5 4 3 2 1
        }

    }
}