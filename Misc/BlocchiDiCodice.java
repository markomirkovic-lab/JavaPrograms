/**
Esempio blocchi di codice
*/
public class BlocchiDiCodice {
    public static void main(String[] args) {

        // valore iniziale
        int valore = 0;
        {
            valore++;
            System.out.println(valore);// 0 -> 1
                {
                int nuovoValore = 2;// 2
                nuovoValore++;// 2 + 1 = 3
                System.out.println(nuovoValore);// 3
                }
        }
        System.out.println("valore: " + valore);// 1
    }
}
