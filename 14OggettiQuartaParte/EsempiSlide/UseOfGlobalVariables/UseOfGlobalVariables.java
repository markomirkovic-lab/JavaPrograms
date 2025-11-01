public class UseOfGlobalVariables {
    static int x = 0;

    static void subtract10() {
        System.out.println("x = " + x);
        x -= 10;
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        System.out.println("x = " + x);
        x++;
        System.out.println("x = " + x);
        subtract10();
        System.out.println("x = " + x);
        x++;
        System.out.println("x = " + x);
    }
}
