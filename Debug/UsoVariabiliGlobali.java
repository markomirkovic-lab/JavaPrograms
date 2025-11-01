//Uso di variabili globali: esempio

public class UsoVariabiliGlobali {
    private static int x = 0;
    private static void sottrai10() {
        System.out.println("x = " + x);
        x -= 10;
        System.out.println("x = " + x);
    }
 public static void main(String[] args) {
    System.out.println("x = " + x);
    x++;
    System.out.println("x = " + x);
    sottrai10();
    System.out.println("x = " + x);
    x++;
    System.out.println("x = " + x);
 }

}
