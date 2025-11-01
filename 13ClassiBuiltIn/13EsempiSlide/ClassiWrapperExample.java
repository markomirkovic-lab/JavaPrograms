public class ClassiWrapperExample {

    public static void main(String[] args) {
        

        Integer a = Integer.parseInt("7");
        Double b = Double.parseDouble("987.6543");

        int aa = a.intValue();
        double bb = b.doubleValue();

        String binaryString = Integer.toBinaryString(a);

        System.out.println(binaryString);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(aa+bb);


        /*
        111
        7
        987.6543
        994.6543
        7
        987.6543
        994.6543
        */

        System.out.println();

        //--

        Integer num = Integer.parseInt("125");
        int numeroInt = num.intValue();
        // oppure
        int numeroInt2 = num;
        Double num2 = Double.parseDouble("987.6543");
        double numeroDouble = num2.doubleValue();
        // oppure
        double numeroDouble2 = num2;

        System.out.println(numeroInt);
        System.out.println(numeroInt2);
        System.out.println(numeroDouble);
        System.out.println(numeroDouble2);

        System.out.println();

        /*
        125
        125
        987.6543
        987.6543
        */

        //--

        // Primitive int
        int num0 = 42;

        // Wrapping: Converting int to Integer (Autoboxing)
        Integer wrappedNum = num0;

        // Unwrapping: Converting Integer back to int (Unboxing)
        int unwrappedNum = wrappedNum;

        // Using Integer methods
        String binaryString2 = Integer.toBinaryString(num0);
        int parsedValue = Integer.parseInt("100");

        // Printing values
        System.out.println("Primitive int: " + num0);
        System.out.println("Wrapped Integer: " + wrappedNum);
        System.out.println("Unwrapped int: " + unwrappedNum);
        System.out.println("Binary representation of 42: " + binaryString2);
        System.out.println("Parsed int from '100': " + parsedValue);

        /*
        Primitive int: 42
        Wrapped Integer: 42
        Unwrapped int: 42
        Binary representation of 42: 101010
        Parsed int from '100': 100
        */


    }
    
}
