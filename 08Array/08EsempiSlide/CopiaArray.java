public class CopiaArray {
    public static void main(String[] args) {
        int[] v = { 3, 72, 4, 1 };

        // Istanzia un nuovo array con la stessa taglia dell'originale
        int[] w = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            // Copia ogni elemento da v a w
            w[i] = v[i];
        }

        System.out.print("Originale: \t");
        for (int value : v)
            System.out.print(value + " ");
        
            System.out.print("\nCopia: \t\t");
        for (int value : w)
            System.out.print(value + " ");
    }
}