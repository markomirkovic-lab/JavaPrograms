/**
 * Programma che dichiara 10 arrays contenenti valori numerici casuali. Contiene una procedura per
 * scambiare i valori contenuti in un singolo array. Alla fine dello scambio, il primo valore
 * dell'array si trova all'ultima posizione, il secondo alla penultima e così via. Importante, la
 * procedura interrompe lo scambio e termina immediatamente, qualora i due dati da scambiare si
 * rivelano identici. Il programma utilizza la procedura in modo da scambiare tutti gli elementi di
 * tutti gli arrays precedentemente inizializzati.
 */
public class ScambioElementiArray {

    /**
     * Procedura che inizializza l'array con dei numeri random da 0 a 9
     *
     * @param array array da inizializzare
     */
    private static void inizializzaArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 10);
    }

    /**
     * Procedura che inverte gli elementi di un array. La procedura si interrompe se i due dati da
     * scambiare sono uguali
     *
     * @param array array da 'rovesciare'
     */
    private static void scambiaElementi(int[] array) {
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[lastIndex - i]) {
                // Interrompi la procedura visto che i due valori da scambiare sono uguali
                return;
            }
            int tmp = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = tmp;
        }
    }

    /**
     * Procedura che stampa a schermo l'array
     *
     * @param array array da stampare a schermo
     */
    private static void stampaArray(int[] array) {
        for (int numero : array)
            System.out.print(numero + " ");
        System.out.println();
    }

    /**
     * Procedura main - parte principale del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];
        int[] array4 = new int[5];
        int[] array5 = new int[5];
        int[] array6 = new int[5];
        int[] array7 = new int[5];
        int[] array8 = new int[5];
        int[] array9 = new int[5];
        int[] array10 = new int[5];

        // Array che contiene le referenze ad ogni array
        int[][] arrays = {array1, array2, array3, array4, array5, array6, array7, array8, array9,
                array10};

        // Popola i 10 arrays
        for (int[] array : arrays)
            inizializzaArray(array);

        // Processa tutti gli arrays
        for (int[] array : arrays) {
            // Stampa l'array prima dello scambio
            stampaArray(array);

            // Scambia gli elementi dell'array
            scambiaElementi(array);

            // Stampa l'array dopo lo scambio
            stampaArray(array);
            System.out.println();
        }
    }
}
