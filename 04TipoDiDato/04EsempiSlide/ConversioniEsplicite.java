public class ConversioniEsplicite {
    public static void main(String[] args) {
        // Conversioni esplicite
        int a;
        double xx;
        short b;
        a = 17;
        xx = a; // OK: a è convertito in un double
        // b = a; // Errore: cast implicito non possibile
        b = (short) a;
        short c = 20;

        int k = 47;
        float x, y, z, zz;
        double u, v, w;
        x = k / 3; // Divisione tra interi seguita da conversione a float
        y = (float) k / 3; // Divisione tra float
        z = (float) k / (float) 3; // Divisione tra float
        zz = (float) (k / 3); // Divisione tra interi seguita da cast a float
        u = k / 3.0; // Divisione tra double
        v = k * 1. / 3; // Divisione tra double
        w = -2.0e4; // Notazione scientifica
        System.out.println("x=" + x + ", y=" + y + ", z=" + z + ", zz=" + zz);
        System.out.println("u=" + u + ", v=" + v + ", w=" + w);

        // Wrap around
        int var1 = 32768;
        short var2 = (short) var1;
        System.out.println(var2);
    }
}
