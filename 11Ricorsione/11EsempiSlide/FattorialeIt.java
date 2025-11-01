public class FattorialeIt {
    private static long fattoriale(int n) {
        long fattoriale = 1;
        for (int i = 2; i <= n; i++)
            fattoriale *= i;// n! = n * (n-1)!, 1 * 2 = 2, 2 * 3 = 6
        return fattoriale;
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(num + "! = " + fattoriale(num));
    }
}