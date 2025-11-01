import java.util.Scanner;
public class TestScannerHasNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserire un numero: ");
        boolean input1Intero = scanner.hasNextInt();
        int numero1 = scanner.nextInt();
        System.out.print("Inserire un numero: ");
        boolean input2Intero = scanner.hasNextInt();
        int numero2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Inserire del testo: ");
        String testo = scanner.nextLine();
        System.out.println("Numero 1: " + input1Intero + " " + numero1);
        System.out.println("Numero 2: " + input2Intero + " " + numero2);
        System.out.println("Testo: " + testo);
        scanner.close();
    }
}
