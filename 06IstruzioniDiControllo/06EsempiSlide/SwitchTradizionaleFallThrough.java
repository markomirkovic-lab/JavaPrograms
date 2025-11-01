import java.util.Scanner;

public class SwitchTradizionaleFallThrough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserire un valore: ");
        int c = scanner.nextInt();
        scanner.close();
        switch (c) {
            case 1:
                System.out.print("1 ");

            case 2:
                System.out.print("2 ");
                break;
            case 3:
                System.out.print("3 ");

            case 4:
                System.out.print("4 ");

            default:
                System.out.print("4+ ");
        }
    }
}