public class ConversioniEsplicite1 {
    public static void main(String[] args) {
        int k = 47;       // int
        float x, y, z, zz;// float
        double u, v, w;   // double

        //            int/int = int.0
        x = k / 3; // Divisione tra interi seguita da conversione a float
        
        //          float/float    prima viene applicato il casting
        y = (float) k / 3; // Divisione tra float

        //          float/float    
        z = (float) k / (float) 3; // Divisione tra float

        //            int/int = int.0
        zz = (float) (k / 3); // Divisione tra interi seguita da cast a float
        u = k / 3.0; // Divisione tra double
        v = k * 1. / 3; // Divisione tra double
        w = -2.0e4; // Notazione scientifica
        System.out.println("x=" + x + ", y=" + y + ", z=" + z + ", zz=" + zz);
        System.out.println("u=" + u + ", v=" + v + ", w=" + w);
    }
    
}
