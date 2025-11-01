import java.util.Scanner;

public class IstruzioneIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire un numero minore di 1000: ");
        int x = input.nextInt();

        if (x > 1000) {
            System.out.println("Errore: il numero inserito è maggiore di 1000");
            x = 1000;
        }

        System.out.println("Il numero è: " + x);
        input.close();
    }
}
