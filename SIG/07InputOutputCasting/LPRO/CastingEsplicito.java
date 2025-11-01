public class CastingEsplicito {

    public static void main(String[] args) {
        
        System.out.println("Casting esplicito");
        System.out.println();

        float a;
        double b = 5.871235478;
        short c = 5;

        // a = b / c; Type mismatch: cannot convert from double to floatJava(16777233)

        // a = (double) b / c; Type mismatch: cannot convert from double to floatJava(16777233)

        a = (float) b / c;//ok
        // a = (float) b / c;
        // a = (float) (5.871235478 / 5)
        // a = (float) (5.871235478 / 5.0)  ! Casting implicito da short a double
        // a = (float) (1.742470956)
        // a = 1.174247F                   ! Casting esplicito da double a float
        //                                  Notare la perdita di precisione
        System.out.println("a: " + a);//a: 1.174247

        a = (float) (b / c);//ok
        
        System.out.println("a: " + a);//a: 1.1742471

        System.out.println();

        char lettera = 'a', le2 = 'b';

        System.out.println(lettera);//a
        System.out.println(le2);//b

        System.out.println((int) lettera);//97
        System.out.println((int) lettera + 1);//98
        System.out.println(lettera + le2);//195
        System.out.println((int) lettera + (int) (le2));//195
        System.out.println((char) 100);//d

        /*
        a: 1.174247

        a
        b
        97
        98
        195
        195
        d
        */

    }
    
}
