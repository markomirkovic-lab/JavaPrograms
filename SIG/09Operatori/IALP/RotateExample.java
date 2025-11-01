public class RotateExample {

    /*
    public static byte rotateRight(byte bits, int shift) {
        return (byte)((bits >>> shift) | (bits << (8 - shift)));
    }

    public static byte rotateLeft(byte bits, int shift) {
        return (byte)((bits << shift) | (bits >>> (8 - shift)));
    } 
    */

    public static byte rotateRight(byte bits, int shift) {
        return (byte) (((bits & 0xff) >>> shift) | ((bits & 0xff) << (8 - shift)));
    }

    public static byte rotateLeft(byte bits, int shift) {
        return (byte) (((bits & 0xff) << shift) | ((bits & 0xff) >>> (8 - shift)));
    }

    public static void main(String[] args) {

        // test 1
        byte a = (byte)1;
        byte b = rotateRight(a,1);
        byte c = rotateLeft(a,1);
        System.out.println("\na: b: c:");
        System.out.println(a+" "+b+" "+c);

        /*
        //test 2 passed
        a = (byte)1;
        b = rotateRight(a,2);
        c = rotateLeft(b,2);
        System.out.println(a+" "+b+" "+c);

        //test 3
        a = (byte)2;
        b = rotateRight(a,2);
        c = rotateLeft(b,2);
        System.out.println(a+" "+b+" "+c);

        //test 4 passed
        a = (byte)2;
        b = rotateRight(a,3);
        c = rotateLeft(b,3);
        System.out.println(a+" "+b+" "+c);
        */

        System.out.println("\nRappresentazione binaria: ");

        // Estraggo manualmente i bit (dall'ultimo (bit meno significativo) al primo (bit piu' significativo))
        // L'ordine e' importante
        int bit0 = a % 2;// Bit meno significativo
        a /= 2;
        int bit1 = a % 2;
        a /= 2;
        int bit2 = a % 2;
        a /= 2;
        int bit3 = a % 2;//-- 1-4
        a /= 2;
        int bit4 = a % 2;
        a /= 2;
        int bit5 = a % 2;
        a /= 2;
        int bit6 = a % 2;
        a /= 2;
        int bit7 = a % 2;//-- 5-8
        a /= 2;
        int bit8 = a % 2;
        a /= 2;
        int bit9 = a % 2;
        a /= 2;
        int bit10 = a % 2;
        a /= 2;
        int bit11 = a % 2;//-- 9-12
        a /= 2;
        int bit12 = a % 2;
        a /= 2;
        int bit13 = a % 2;
        a /= 2;
        int bit14 = a % 2;
        a /= 2;
        int bit15 = a % 2;// Bit piu' significativo

        System.out.println();
        System.out.printf("%s%d%d%d%d%s%d%d%d%d%s%d%d%d%d%s%d%d%d%d","Numero binario a: ",
                          bit15, bit14, bit13, bit12, " ", bit11, bit10, bit9, bit8, " ", bit7, bit6, bit5, bit4, " ", bit3, bit2, bit1, bit0);
        System.out.println();

        //--

        bit0 = b % 2;// Bit meno significativo
        b /= 2;
        bit1 = b % 2;
        b /= 2;
        bit2 = b % 2;
        b /= 2;
        bit3 = b % 2;//-- 1-4
        b /= 2;
        bit4 = b % 2;
        b /= 2;
        bit5 = b % 2;
        b /= 2;
        bit6 = b % 2;
        b /= 2;
        bit7 = b % 2;//-- 5-8
        b /= 2;
        bit8 = b % 2;
        b /= 2;
        bit9 = b % 2;
        b /= 2;
        bit10 = b % 2;
        b /= 2;
        bit11 = b % 2;//-- 9-12
        b /= 2;
        bit12 = b % 2;
        b /= 2;
        bit13 = b % 2;
        b /= 2;
        bit14 = b % 2;
        b /= 2;
        bit15 = b % 2;// Bit piu' significativo

        System.out.println();
        System.out.printf("%s%d%d%d%d%s%d%d%d%d%s%d%d%d%d%s%d%d%d%d","Numero binario b: ",
                          bit15, bit14, bit13, bit12, " ", bit11, bit10, bit9, bit8, " ", bit7, bit6, bit5, bit4, " ", bit3, bit2, bit1, bit0);
        System.out.println();

        //--

        bit0 = c % 2;// Bit meno significativo
        c /= 2;
        bit1 = c % 2;
        c /= 2;
        bit2 = c % 2;
        c /= 2;
        bit3 = c % 2;//-- 1-4
        c /= 2;
        bit4 = c % 2;
        c /= 2;
        bit5 = c % 2;
        c /= 2;
        bit6 = c % 2;
        c /= 2;
        bit7 = c % 2;//-- 5-8
        c /= 2;
        bit8 = c % 2;
        c /= 2;
        bit9 = c % 2;
        c /= 2;
        bit10 = c % 2;
        c /= 2;
        bit11 = c % 2;//-- 9-12
        c /= 2;
        bit12 = c % 2;
        c /= 2;
        bit13 = c % 2;
        c /= 2;
        bit14 = c % 2;
        c /= 2;
        bit15 = c % 2;// Bit piu' significativo

        System.out.println();
        System.out.printf("%s%d%d%d%d%s%d%d%d%d%s%d%d%d%d%s%d%d%d%d","Numero binario c: ",
                          bit15, bit14, bit13, bit12, " ", bit11, bit10, bit9, bit8, " ", bit7, bit6, bit5, bit4, " ", bit3, bit2, bit1, bit0);
        System.out.println();

    }

}
