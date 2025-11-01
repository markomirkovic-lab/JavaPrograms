/**
 * Esempio di programma con varie istruzioni
 */
public class Istruzioni {
    public static void main(String[] args) {
        int valore = 0, j = 0;
        while (j < 30) {
            if (j == 9) {
                valore++;
                System.out.println("10");
            } else if (j == 19) {
                valore++;
                System.out.println("20");
            }
            j++;
        }
        System.out.println("Valore finale: " + valore);
    }
}
