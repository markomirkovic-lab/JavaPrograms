import java.util.Scanner;

public class Buongiorno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Come ti chiami? ");
        String nome = input.nextLine();

        System.out.println("Buongiorno " + nome + " e benvenuto al corso.");
        System.out.println();

        System.out.print("Inserisci due numeri interi: ");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        input.close();

        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
    }
}
