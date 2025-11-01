public class ElevamentoPotenzaRic {
    private static long elevamentoPotenza(int base, int esponente) {
        if (esponente == 0)
            return 1;
        return base * elevamentoPotenza(base, esponente - 1);
    }

    public static void main(String[] args) {
        int base = 3;
        int esponente = 4;
        System.out.println(base + "^" + esponente + " = " + elevamentoPotenza(base, esponente));
    }
}