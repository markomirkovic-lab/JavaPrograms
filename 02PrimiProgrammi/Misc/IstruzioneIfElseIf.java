import java.util.Scanner;

public class IstruzioneIfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        int x = input.nextInt();

        if (x < 10) {
            System.out.print("Il numero è minore di 10");
        } else if (x < 20) {
            System.out.print("Il numero è minore di 20");
        } else if (x < 30) {
            System.out.print("Il numero è minore di 30");
        } else {
            System.out.print("Il numero è maggiore di 30");
        }
        input.close();
    }
}
