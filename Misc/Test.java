import java.util.Scanner;

public class Test {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Test - Scrivi un numero: ");

    int numero = input.nextInt();

    System.out.println("il tuo numero è: " + numero);

    input.close();
    }
}
