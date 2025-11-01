import java.util.Scanner;

public class ConfrontoNumeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserire due numeri con la virgola: ");
        double numero1 = input.nextDouble();
        double numero2 = input.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1 + " è maggiore");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " è maggiore");
        } else {
            System.out.println("I due numeri sono uguali");
        }

        input.close();
    }
}