import java.util.Arrays;

public class ConfrontoArraysEquals {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5, 6 };
        int[] a2 = { 1, 2, 3, 4, 5, 6 };
        int[] a3 = { 1, 2, 3, 4 };

        System.out.println("a1 uguale a a2? " + (Arrays.equals(a1, a2) ? "Sì" : "No"));
        System.out.println("a1 uguale a a3? " + (Arrays.equals(a1, a3) ? "Sì" : "No"));
        System.out.println("a1 uguale a a3? " + (Arrays.equals(a2, a3) ? "Sì" : "No"));

    }
}
