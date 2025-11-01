public class RotateBinaryTest {

    public static void main(String[] args) {
        

        byte byteIniziale = (byte) (0b10100000);

        /*
            // compemento a 2
                    0b10100000 (segno -)
                      01011111
            +                1
            =         01100000 = (-) 96
            << 1
            =         11000000 = (-) 192
        
        */

        System.out.println(byteIniziale);
        System.out.println(byteIniziale << 1);
        System.out.println((int) byteIniziale);
        System.out.println((int) byteIniziale << 1);

        /*
        -96
        -192
        -96
        -192
        */
    }
    
}
