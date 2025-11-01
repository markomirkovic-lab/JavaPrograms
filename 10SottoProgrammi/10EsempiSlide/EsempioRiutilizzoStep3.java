public class EsempioRiutilizzoStep3 {

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
        int x = 5;
        int maxX = 100;
        int iterazioniX = 20;
        x = calcola(x, maxX, iterazioniX);

        int y = 4;
        int maxY = 80;
        int iterazioniY = 15;
        y = calcola(y, maxY, iterazioniY);

        int z = 6;
        int maxZ = 115;
        int iterazioniZ = 30;
        z = calcola(z, maxZ, iterazioniZ);

        System.out.println("Totale = " + (x + y + z));// 480
    }
}
