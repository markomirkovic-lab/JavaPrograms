import java.util.Scanner;

public class DoWhileB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int userInput = scanner.nextInt();
        scanner.close();

        int numero = 0;
        
        if (numero <= userInput) {
            do {
                System.out.println(numero + " ");
                numero++;
            } while (numero <= userInput);
        }

    }
}
