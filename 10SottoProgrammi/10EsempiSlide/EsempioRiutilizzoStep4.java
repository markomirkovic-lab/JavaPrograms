public class EsempioRiutilizzoStep4 {

    private static int calcola(int p, int maxP, int iterazioniP) {
        for (int i = 0; i < iterazioniP; i++) {
            if (p < maxP) {
                p += p;
            } else {
                return p;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] valori = { 5, 4, 6 };
        int[] max = { 100, 80, 115 };
        int[] iterazioni = { 20, 15, 30 };

        int tot = 0;
        for (int i = 0; i < valori.length; i++) {
            tot += calcola(valori[i], max[i], iterazioni[i]);
        }
        System.out.println("Totale = " + tot);// 480
    }
}
