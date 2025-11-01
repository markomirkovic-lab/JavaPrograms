public class Mistero5 {
    public static void main(String[] args) {
    
        int risultato = 0;
        int x = 1;

        while (x <= 10) {
            if (x % 2 == 1) {
                risultato = risultato + x;
            }
            x = x + 3;
        }
        System.out.println("Risultato: " + risultato);

        /*
        while   x           x % 2 = 1       risultato
        1       1                           1
        2       1+3 = 4
        3       4+3 = 7     7 % 2 = 1       1 + 7 = 8
        4       7+3 = 10
        5       10+3=13
        FINE (x>10)
        6       
        7       
        8
        9
        10
        */

    }
}
