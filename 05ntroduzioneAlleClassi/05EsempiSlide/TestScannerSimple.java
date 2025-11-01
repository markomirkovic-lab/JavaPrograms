import java.util.Scanner;
public class TestScannerSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserire un numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Inserire del testo: ");
        String testo = scanner.nextLine();
        System.out.println("Numero : " + " " + numero + " Testo: " + testo);
        scanner.close();
    }
}