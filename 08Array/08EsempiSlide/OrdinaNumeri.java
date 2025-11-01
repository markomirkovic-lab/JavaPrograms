import java.util.Arrays;

public class OrdinaNumeri {
    public static void main(String[] args) {
        int[] numeri = { 13, 19, 5, 99, 71 };

        // Copia l'array originale
        int[] numeriOrdinati = Arrays.copyOf(numeri, numeri.length);
        // Ordina la copia
        Arrays.sort(numeriOrdinati);

        // Copia dell'array copia
        int[] numeriOrdinati2 = Arrays.copyOf(numeriOrdinati, numeriOrdinati.length);

        // Mostra l'array originale e quello ordinato
        System.out.println("Non ordinati: " + Arrays.toString(numeri));
        System.out.println("Ordinati: " + Arrays.toString(numeriOrdinati));

        // Confronta i due arrays
        System.out.println("Sono uguali? " + Arrays.equals(numeri, numeriOrdinati));

        String sonoUguali = Arrays.equals(numeri, numeriOrdinati) ? "Si" : "No";
        System.out.println("Sono uguali? " + sonoUguali );

        System.out.println("---");

        System.out.println("Ordinati: " + Arrays.toString(numeriOrdinati2));
        String sonoUguali2 = Arrays.equals(numeriOrdinati, numeriOrdinati2) ? "Si" : "No";
        System.out.println("Sono uguali2? " + sonoUguali2 );

        /*
        on ordinati: [13, 19, 5, 99, 71]
        Ordinati: [5, 13, 19, 71, 99]
        Sono uguali? false
        Sono uguali? No
        ---
        Ordinati: [5, 13, 19, 71, 99]
        Sono uguali2? Si
        */

    }
}
