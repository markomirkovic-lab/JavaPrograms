
public class ArraysSortDesCicloForV4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrInvertito = new int[arr.length];

        // Riempie arrInvertito con gli elementi di arr in ordine inverso
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {

            arrInvertito[i] = arr[j];
        }

        /*
        Spiegazione del ciclo for
        Inizializzazione:

        int i = 0, j = arr.length - 1;
        i è l'indice che parte dall'inizio dell'array arrInvertito (indice 0).

        j è l'indice che parte dalla fine dell'array originale arr 
        (indice arr.length - 1).

        Ad esempio, se arr = {1, 2, 3, 4, 5, 6}, allora:

        i inizia da 0.

        j inizia da 5 (perché arr.length = 6, quindi arr.length - 1 = 5).

        Condizione di continuazione:

        i < arr.length;
        Il ciclo continua finché i è minore della lunghezza dell'array (arr.length).

        Questo garantisce che tutti gli elementi di arr vengano copiati in arrInvertito.

        Incremento/decremento:

        i++, j--
        Ad ogni iterazione:

        i viene incrementato di 1 (per spostarsi avanti in arrInvertito).

        j viene decrementato di 1 (per spostarsi indietro in arr).

        Corpo del ciclo:

        arrInvertito[i] = arr[j];
        Copia l'elemento in posizione j di arr nella posizione i di arrInvertito.

        In altre parole, prende l'elemento dalla fine di arr e lo mette all'inizio 
        di arrInvertito.

        Esempio passo-passo
        Supponiamo di avere:

        java
        Copy
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrInvertito = new int[arr.length];
        Ecco come funziona il ciclo:

        Iterazione	i	j	arr[j]	arrInvertito[i] = arr[j]	Stato di arrInvertito
        1	        0	5	6	    arrInvertito[0] = 6         [6, 0, 0, 0, 0, 0]
        2	        1	4	5	    arrInvertito[1] = 5         [6, 5, 0, 0, 0, 0]
        3	        2	3	4	    arrInvertito[2] = 4         [6, 5, 4, 0, 0, 0]
        4	        3	2	3	    arrInvertito[3] = 3         [6, 5, 4, 3, 0, 0]
        5	        4	1	2	    arrInvertito[4] = 2         [6, 5, 4, 3, 2, 0]
        6	        5	0	1	    arrInvertito[5] = 1         [6, 5, 4, 3, 2, 1]

        Alla fine del ciclo, arrInvertito sarà [6, 5, 4, 3, 2, 1].

        Risposta alla tua domanda: j > o < di qualcosa?
        j non è confrontato direttamente con una condizione nel ciclo for.

        Tuttavia, j parte da arr.length - 1 (l'ultimo indice) e viene decrementato 
        (j--) a ogni iterazione.

        Poiché i parte da 0 e viene incrementato (i++), e il ciclo continua finché 
        i < arr.length, j raggiunge automaticamente 0 quando i raggiunge arr.length - 1.

        In altre parole:

        All'inizio: j = arr.length - 1 (ultimo elemento di arr).

        Alla fine: j = 0 (primo elemento di arr).

        Perché funziona?
        i avanza dall'inizio alla fine di arrInvertito.

        j retrocede dalla fine all'inizio di arr.

        Questo garantisce che gli elementi di arr vengano copiati in arrInvertito 
        in ordine inverso.

        */

        // Stampa l'array invertito
        for (int i : arrInvertito) {
            System.out.print(i + " ");  // Output: 6 5 4 3 2 1
        }
    }
}
