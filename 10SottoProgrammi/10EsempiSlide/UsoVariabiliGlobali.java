public class UsoVariabiliGlobali {
    private static int x = 0;

    private static void sottrai10() {
        System.out.println("x = " + x);// 1
        x -= 10;
        System.out.println("x = " + x);// -9
    }

    public static void main(String[] args) {
        System.out.println("x = " + x);// 0
        x++;
        System.out.println("x = " + x);// 1
        sottrai10();
        System.out.println("x = " + x);// -9
        x++;
        System.out.println("x = " + x);// -8

        System.out.println("x = " + x);// -8

        /*
        x = 0
        x = 1
        x = 1
        x = -9
        x = -9
        x = -8
        x = -8
        */
    }
}
