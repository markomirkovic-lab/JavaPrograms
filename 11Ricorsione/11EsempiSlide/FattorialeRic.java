public class FattorialeRic {
    private static long fattoriale(int n) {
        if (n <= 1)// condizione base (condizione di uscita)
            return 1;
        return n * fattoriale(n - 1);// 3 * 2 = 6   //    2 * 1 = 2,      1 * 0 = 0 -> 1
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(num + "! = " + fattoriale(num));
    }
}