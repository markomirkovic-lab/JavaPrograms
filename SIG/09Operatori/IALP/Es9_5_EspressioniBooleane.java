/*
9.5 Espressioni booleane
Qual’è il valore delle seguenti espressioni booleane con x=5, y=10 e z=15?
*/
import java.util.Scanner;

public class Es9_5_EspressioniBooleane {

    public static void main(String[] args) {
        
        int  x=5, y=10, z=15;

        System.out.println(x<5 && y>x);
        System.out.println(x<5 || y>x);
        System.out.println(x>3 || y<10 && z==15);
        System.out.println(!(x>3) && x!=z || x+y==z);


        /*
        False
        True
        True
        True
        */

    }
    
}
