import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        int a, b;

        a = 54;
        b = 23;

        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);

        if (a < b) {
            System.out.println(a + " minore di " + b);
        } else if (a > b) {
            System.out.println(a + " maggiore di " + b);
        } else {
            System.out.println(a + " uguale a " + b);
        }

        // Usando la classe BigInteger
        BigInteger bigA, bigB;

        bigA = BigInteger.valueOf(a);
        bigB = BigInteger.valueOf(b);

        BigInteger bigC = bigA.add(bigB);
        System.out.println(bigA + " + " + bigB + " = " + bigC);

        if (bigA.compareTo(bigB) < 0) {
            System.out.println(bigA + " minore di " + bigB);
        } else if (bigA.compareTo(bigB) > 0) {
            System.out.println(bigA + " maggiore di " + bigB);
        } else {
            System.out.println(bigA + " uguale a " + bigB);
        }

        // Se serve ...
        BigInteger w = new BigInteger("42");
        int x = bigA.intValue();
        long y = bigA.longValue();
        String z = bigA.toString();
    }
}