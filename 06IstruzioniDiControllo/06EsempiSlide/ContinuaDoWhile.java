import java.util.Scanner;;

public class ContinuaDoWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean continua = true;

        do {
        //...
        System.out.println("Vuoi continuare? (true/false)");
        continua = scanner.nextBoolean();
        } while (continua);
        scanner.close();

    }
}
