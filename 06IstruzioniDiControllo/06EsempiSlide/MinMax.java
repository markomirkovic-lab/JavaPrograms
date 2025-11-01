import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci due interi: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int min, max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}