

public class OperatoriUniari {

    public static void main(String[] args) {
        
        int k = 3;
        int p = 3;

        System.out.println("k++ * ++p: " + (k++ * ++p));//3 * 4 = 12

        //-----------------

        k = 3;
        p = 3;

        System.out.println("k++ * --p: " + (k++ * --p));//3 * 2 = 6

        //-----------------

        k = 3;
        p = 3;

        System.out.println("k++ * --k: " + (k++ * --k));//3 * 3 = 9
        //                                  3 -> 4  4-1 = 3

        //-----------------

        int a = 8;
        int b;

        b = a++ * 2 * ++a;// 8 * 2 * 10 = 160
        //  8   * 2 * 10        a vale 10

        System.out.println(b + " " + a);//160 10

        //-----------------

        a = 8;
        b = 0;

        b = a++ * 2 * --a;
        //  8   * 2 *   8 = 128     a vale 8

        System.out.println(b + " " + a);//128 8

        //-----------------

        a = 8;
        b = 0;

        b = ++a * 2 * --a;
        //  9   * 2 *   8 = 144     a vale 8

        System.out.println(b + " " + a);//144 8


        //-----------------

        a = 8;
        b = 0;

        b = a++ * 2 * a++;
        //  8   * 2 * 9 = 144     a vale 10

        System.out.println(b + " " + a);//144 10


        //-----------------

        a = 8;
        b = 0;

        b = a++ * 2 * (a++ - ++a);
        //  8   * 2 * (9 - 11)  = -32  a vale 11

        System.out.println(b + " " + a);//-32 11

        //-----------------

        a = 8;
        int c = 3;
        b = ++a - c++ * --a;
        //                          a   b   c
        //        9 - 3   * 8       8  -15  4
        //        9 - 24
        //        -15
        System.out.println(a + " " + b + " " + c);

        //-----------------

        a = 8;
        c = 3;
        b = ++a - c++ * (--a);// le () non hanno alcun effeto sugli unari
        //                          a   b   c
        //        9 - 3   * 8       8  -15  4
        //        9 - 24
        //        -15
        System.out.println(a + " " + b + " " + c);


        //-----------------

        a = 3;
        b = 0;

        b = a - a * ++a + a;// precedenza da sinistra a destra
        //  3 - 3 * 4   + 4     a vale 4
        //  3 -  12     + 4
        //    -9        + 4
        // -5

        System.out.println(a + " " + b);//4 -5

        //-----------------

        a = 3;
        b = 0;

        b = a - ++a * a + a;// precedenza da sinistra a destra
        //  3 -   4 * 4 + 4     a vale 4
        //  3 -   16   + 4
        // -13 + 4
        //  -9 

        System.out.println(a + " " + b);//4 -9

        //-----------------

        a = 3;
        b = 0;

        b = a - a * ++a + a * ++a;// precedenza da sinistra a destra
        //  3 - 3 *   4 + 4 *   5       a vale 5
        //  3 -   12    + 20
        //  3 -   12    + 20
        //    -9        + 10
        //  11

        System.out.println(a + " " + b);//5 11

        //-----------------

        a = 3;
        b = 0;

        b = a - a * (++a + a) * ++a;// precedenza da sinistra a destra
        //  3 - 3 *  (4 + 4) *   5       a vale 5
        //  3 - 3 *     8    *   5
        //  3 -   24         *   5
        //  3 -    -120
        //  117

        System.out.println(a + " " + b);//5 117

        //---

        /*
        k++ * ++p: 12
        k++ * --p: 6
        k++ * --k: 9
        160 10
        128 8
        144 8
        144 10
        -32 11
        8 -15 4
        8 -15 4
        4 -5
        4 -9
        5 11
        5 -117
        */

    }
    
}
