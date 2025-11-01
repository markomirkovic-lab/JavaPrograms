public class OperazioniArray {
    private static void mostra(double[] numeri, int inizio, int fine) {
        if (numeri == null || fine < inizio || inizio < 0 || fine < 0 || inizio >= numeri.length || fine >= numeri.length) {
            System.out.println("Indice non valido");
            return;
        }
        for (int i = inizio; i <= fine; i++)
            System.out.print(numeri[i] + "\t");
        System.out.println();
    }

    private static void mostra(double[] numeri) {
        mostra(numeri, 0, numeri.length - 1);
    }

    private static double[] clona(double[] numeri) {
        double[] clone = new double[numeri.length];
        for (int i = 0; i < numeri.length; i++)
            clone[i] = numeri[i];
        return clone;

        // return Arrays.copyOf(numeri, numeri.length);
    }

    private static int cercaIndiceMax(double[] array) {
        double max = array[0];
        int indice = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indice = i;
            }
        }
        return indice;
    }

    private static void aggiungi(double[] numeri, double cst) {
        for (int i = 0; i < numeri.length; i++)
            numeri[i] += cst;
    }

    public static void main(String[] args) {
        double[] numeri = { -1.22, -3.44, -6.43, -7.21, -0.12, -5.44 };
        mostra(numeri, 1, numeri.length - 2);

        double[] clone = clona(numeri);
        mostra(clone);

        int indice = cercaIndiceMax(numeri);
        System.out.println("Indice: " + indice);

        aggiungi(clone, 6.66);
        mostra(numeri);
        mostra(clone);
    }
}