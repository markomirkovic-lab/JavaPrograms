public class NumeriCasuali {
    public static void main(String[] args) {
        // Numero casuale compreso tra 0.0 (incluso) e 1.0 (escluso)
        double numeroCasuale = Math.random();
        System.out.println(numeroCasuale);

        // Numero casuale compreso tra 0 (incluso) e 100 (escluso)
        int intCasuale = (int) (100 * numeroCasuale);
        System.out.println(intCasuale);

        // Numero casuale compreso tra 10 (incluso) e 50 (escluso)
        int intCasuale2 = (int) (40 * numeroCasuale + 10);
        System.out.println(intCasuale2);
    }
}
