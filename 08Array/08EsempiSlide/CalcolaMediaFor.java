public class CalcolaMediaFor {
    public static void main(String[] args) {
        double[] valori = { 1.11, 7.77, 2.32, 99.1, 1.75, -8.22 };
        double somma = 0.;

        for (int i = 0; i < valori.length; i++) {
            double valore = valori[i];
            somma += valore;
        }

        System.out.println("Media: " + (somma / valori.length));
    }
}
