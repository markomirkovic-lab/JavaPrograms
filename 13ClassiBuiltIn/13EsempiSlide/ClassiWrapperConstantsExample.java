public class ClassiWrapperConstantsExample {
    public static void main(String[] args) {

        /*
        Use of:

        Integer.MIN_VALUE;
        Integer.MAX_VALUE;
        Double.POSITIVE_INFINITY;
        Double.NEGATIVE_INFINITY;
        Double.NaN;
        */


        // Integer MIN_VALUE and MAX_VALUE
        int minInt = Integer.MIN_VALUE; // Smallest value an int can hold
        int maxInt = Integer.MAX_VALUE; // Largest value an int can hold
        
        System.out.println("Integer.MIN_VALUE: " + minInt);
        //Integer.MIN_VALUE: -2147483648
        System.out.println("Integer.MAX_VALUE: " + maxInt);
        //Integer.MAX_VALUE: 2147483647

        // Double POSITIVE_INFINITY and NEGATIVE_INFINITY
        double positiveInf = Double.POSITIVE_INFINITY;
        double negativeInf = Double.NEGATIVE_INFINITY;

        System.out.println("Double.POSITIVE_INFINITY: " + positiveInf);
        //Double.POSITIVE_INFINITY: Infinity
        System.out.println("Double.NEGATIVE_INFINITY: " + negativeInf);
        //Double.NEGATIVE_INFINITY: -Infinity

        // Double.NaN (Not a Number)
        double nanValue = Double.NaN;
        double invalidOperation = 0.0 / 0.0; // Produces NaN

        //int invalidOperation2 = 0 / 0;

        double divisionByZero = 1.0 / 0.0; // Produces POSITIVE_INFINITY

        System.out.println("Double.NaN: " + nanValue);
        //Double.NaN: NaN
        System.out.println("Result of 0.0 / 0.0: " + invalidOperation);
        //Result of 0.0 / 0.0: Infinity

        //System.out.println("Result of 1 / 0: " + invalidOperation2);
        //Exception in thread "main" java.lang.ArithmeticException: / by zero

        System.out.println("Result of 1.0 / 0.0: " + divisionByZero);
        //Result of 1.0 / 0.0: Infinity

        // Checking if a value is NaN or Infinite
        System.out.println("Is NaN (0.0 / 0.0): " + Double.isNaN(invalidOperation));
        //Is NaN (0.0 / 0.0): true
        System.out.println("Is Infinite (1.0 / 0.0): " + Double.isInfinite(divisionByZero));
        //Is Infinite (1.0 / 0.0): true

        System.out.println();


        //--


        Integer risposta = 42;//boxing
        
        //Equal, two ways of writing the syntax (DEPRECIATED - not to be used)
        //Integer risposta2 = new Integer(42);//boxing
        //ClassiWrapperConstantsExample.java:66: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
        //        Integer risposta2 = new Integer(42);//boxing

        int risposta3 = risposta;//unboxing

        System.out.println(risposta);
        //System.out.println(risposta2);
        System.out.println(risposta3);

        //42
        //42



    }
}
