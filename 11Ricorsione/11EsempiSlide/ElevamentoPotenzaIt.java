public class ElevamentoPotenzaIt {
    private static long elevamentoPotenza(int base, int esponente) {
        long risultato = 1;
        for (int i = 0; i < esponente; i++)
            risultato *= base;// a^n = a * a^n-1, 1*3 = 3, 3*3 = 9, 9*3 = 27, 27 * 3 = 81 
        return risultato;
    }

    public static void main(String[] args) {
        int base = 3;
        int esponente = 4;
        System.out.println(base + "^" + esponente + " = " + elevamentoPotenza(base, esponente));// 3^4 = 81
    }
}