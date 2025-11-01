public class ForCalcoloFattoriale {
    public static void main(String[] args) {
        int fattoriale = 1;
        for (int i = 1; i < 10; i++) {
            fattoriale *= i;// fattoriale = fattoriale * i
            System.out.println(i + "! = " + fattoriale);
        }

        /*
                        fattoriale      i         fattoriale'
                        ------------------------------------
        1! = 1               1      *   1       =     1 
             1 * 1
        2! = 2               1      *   2       =     2
             2 * 1
        3! = 6               2      *   3       =     6
             3 * 2 * 1
        4! = 24              6      *   4       =    24
             4 * 3 * 2 * 1
        5! = 120            24      *   5       =   120
             5 * 4 * 3 * 2 * 1
        6! = 720           120      *   6       =   720
        7! = 5040          720      *   7       =  5040
        8! = 40320        5040      *   8       = 40320
        9! = 362880      40320      *   9       = ...
        */
    }
}
