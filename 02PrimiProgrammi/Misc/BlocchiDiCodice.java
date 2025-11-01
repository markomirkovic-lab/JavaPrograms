public class BlocchiDiCodice {
    public static void main(String[] args) {
        int valore = 0;
        {
            valore++;
            System.out.println(valore);
            {
                int nuovoValore = 2;
                nuovoValore++;
                System.out.println(nuovoValore);
            }
        }
        System.out.println("valore: " + valore);
    }
}
