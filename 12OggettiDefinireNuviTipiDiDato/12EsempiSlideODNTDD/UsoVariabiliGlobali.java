//Uso di variabili globali: esempio

public class UsoVariabiliGlobali {
    
    private static int x = 0;

    private static void sottrai10() {
        System.out.println("x = " + x);// (3) x = 1
        x -= 10;// -9
        System.out.println("x = " + x);// (4) x = -9
    }
 public static void main(String[] args) {
    System.out.println("x = " + x);// (1) x = 0
    x++;// 1
    System.out.println("x = " + x);// (2) x = 1
    sottrai10();
    System.out.println("x = " + x);// (5) x = - 9
    x++;
    System.out.println("x = " + x);// (6) x = -8

    /*
    x = 0
    x = 1
    x = 1
    x = -9
    x = -9
    x = -8
    */
 }

}
