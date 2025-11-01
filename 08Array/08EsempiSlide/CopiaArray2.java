import java.util.Arrays;

public class CopiaArray2 {
    public static void main(String[] args) {
        int[] v = { 3, 72, 4, 1 };

        // Istanzia un nuovo array con la stessa taglia dell'originale
        int[] w = new int[v.length];

        // Copia l'intero array
        // metodo: System.arraycopy(sourceArray, indexStart, destinationArray, indexStart, sourceArrayLength)
        System.arraycopy(v, 0, w, 0, v.length);

        System.out.print("Originale: \t");
        for (int value : v)
            System.out.print(value + " ");
        System.out.print("\nCopia: \t\t");
        for (int value : w)
            System.out.print(value + " ");

        System.out.println("\n");
        //System.out.println("");

        int[] w2 = new int[v.length];

        // metodo: Arrays.copyOf(sourceArray, sourceArrayLength)
        w2 = Arrays.copyOf(v, v.length);

        System.out.print("Originale: \t");
        for (int value : v)
            System.out.print(value + " ");
        System.out.print("\nCopia: \t\t");
        for (int value : w2)
            System.out.print(value + " ");

    }
}