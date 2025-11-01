import java.util.Scanner;

public class Divisione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire due numeri: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a % b == 0) {
            System.out.println(a + " è divisibile per " + b);
        } else {
            System.out.println(a + " non è divisibile per " + b);
        }
        input.close();
    }
}
