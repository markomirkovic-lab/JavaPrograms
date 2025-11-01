import java.util.Scanner;

public class ContinuaWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continua = true;
        
        while (continua) {
        //...
        System.out.println("Vuoi continuare? (true/false)");
        continua = scanner.nextBoolean();
        }
        scanner.close();

    }
}
