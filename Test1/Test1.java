public class Test1 {
    public static void main(String[] args) {

        int x = 5;
        int cntr = 0;
        
        do {
            cntr++;
            System.out.println("x = " + x);
            if (x % 2 == 0) {
            continue;
            //break;
            }
            System.out.println(x);
        } while (x++ < 8);

        System.out.println("x: " + x);
        System.out.println("cntr: " + cntr);

        /*
          example with continue:                        example with break:
          interrups the present loop                    terminates the do while loop
          and continues with next do while one           
                        1   2           3   4           1   2       3   4   5
                        x   x           x   x           x   x       x   x   x
         * do           5   6           7   8           5   6
         *     if       -   continue   --   continue    -   break
         * print        5               7               5
         * while        6   7           8   9           6
         */

        /*
            Se inizializzassimo x a  9, il ciclo non verrebbe mai eseguito.
            L'ultimo valore che viene stampato è 8. 
            Se cambiassimo il post-incremento (x++) con un pre-incremento (++x), otterremmo lo stesso risultato.
          x Il primo valore che viene stampato è 5.
          x Il ciclo viene eseguito esattamente 4 volte.

         */
    }
}
