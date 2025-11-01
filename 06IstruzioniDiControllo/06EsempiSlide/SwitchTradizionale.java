import java.util.Scanner;

public class SwitchTradizionale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserire un valore: ");
        int c = scanner.nextInt();
        scanner.close();
        switch (c) {
            case 1:
                System.out.print("1 ");
                break;
            case 2:
                System.out.print("2 ");
                break;
            case 3:
                System.out.print("3 ");
                break;
            case 4:
                System.out.print("4 ");
                break;
            default:
                System.out.print("4+ ");
        }
    }
}