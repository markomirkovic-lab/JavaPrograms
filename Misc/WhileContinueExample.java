import java.util.Scanner;

public class WhileContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
    
        scanner.close();

        int j = userInput + 1;

        while (j > 0) {
            j--;
            if(j==4){
                continue;
            }
            System.out.print(j);

            if(j <= userInput) {
                System.out.print(", ");
            }
    
        }
 
    }
}
