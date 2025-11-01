public class EsempioRiutilizzoStep2 {

    public static void main(String[] args) {
        int x = 5;
        int maxX = 100;
        int iterazioniX = 20;
        for (int i = 0; i < iterazioniX; i++)
            if (x < maxX)
                x += x;
            else
                break;

        int y = 4;
        int maxY = 80;
        int iterazioniY = 15;
        for (int i = 0; i < iterazioniY; i++)
            if (y < maxY)
                y += y;
            else
                break;

        int z = 6;
        int maxZ = 115;
        int iterazioniZ = 30;
        for (int i = 0; i < iterazioniZ; i++)
            if (z < maxZ)
                z += z;
            else
                break;

        System.out.println("Totale = " + (x + y + z));// 480
    }
}
