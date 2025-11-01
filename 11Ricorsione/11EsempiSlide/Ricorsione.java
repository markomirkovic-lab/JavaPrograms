public class Ricorsione {
    private static void ricorsiva(int contatore) {
        if (contatore == 0)
            return;
        System.out.println("Prima: " + contatore);// svolgimento: 5 4 3 2 1
        ricorsiva(--contatore);
        System.out.println("Dopo: " + contatore);// riavolgimento: 0 1 2 3 4
    }

    public static void main(final String[] args) {
        ricorsiva(5);


        /*
        Prima: 5
        Prima: 4
        Prima: 3
        Prima: 2
        Prima: 1
        Dopo: 0
        Dopo: 1
        Dopo: 2
        Dopo: 3
        Dopo: 4
        */
    }
}