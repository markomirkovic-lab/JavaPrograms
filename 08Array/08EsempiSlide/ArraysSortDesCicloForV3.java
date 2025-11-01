
public class ArraysSortDesCicloForV3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrInvertito = new int[arr.length];

        // Riempie arrInvertito con gli elementi di arr in ordine inverso
        //for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
        //    arrInvertito[i] = arr[j];
        //}

        int j = arr.length - 1; // Inizializzo j all'ultimo indice di arr

        // Ciclo per i (avanza dall'inizio alla fine di arrInvertito)
        for (int i = 0; i < arr.length; i++) {

            arrInvertito[i] = arr[j]; // Copia l'elemento da arr[j] a arrInvertito[i]
            j--; // Decrementa j per spostarsi indietro in arr

        }

        /*
        
        Iterazione	i	j	arr[j]	arrInvertito[i] = arr[j]	Stato di arrInvertito
        1	        0	5	6	    arrInvertito[0] = 6	        [6, 0, 0, 0, 0, 0]
        2	        1	4	5	    arrInvertito[1] = 5	        [6, 5, 0, 0, 0, 0]
        3	        2	3	4	    arrInvertito[2] = 4	        [6, 5, 4, 0, 0, 0]
        4	        3	2	3	    arrInvertito[3] = 3	        [6, 5, 4, 3, 0, 0]
        5	        4	1	2	    arrInvertito[4] = 2	        [6, 5, 4, 3, 2, 0]
        6	        5	0	1	    arrInvertito[5] = 1	        [6, 5, 4, 3, 2, 1]
        */

        // Stampa l'array invertito
        for (int i : arrInvertito) {
            System.out.print(i + " ");  // Output: 6 5 4 3 2 1
        }
    }
}