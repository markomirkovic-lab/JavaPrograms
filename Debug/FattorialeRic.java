public class FattorialeRic {
    private static long fattoriale(int n) {
        if (n <= 1)
            return 1;
        return n * fattoriale(n - 1);
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(num + "! = " + fattoriale(num));
    }
}