import java.util.Scanner;

public class IstruzioneWhileEIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        int x = input.nextInt();
        int y = 1;
        while (y < 10) {
            x = x * y;
            if (x > 1000) {
                System.out.println("Il risultato parziale è > 1000");
                x = 1;
            }
            y++;
        }
        System.out.println("Risultato: " + x);
        input.close();
    }
}
