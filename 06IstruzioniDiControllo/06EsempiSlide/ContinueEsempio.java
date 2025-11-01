import java.util.Scanner;

public class ContinueEsempio {
    public static void main(String[] args) {
        double numero, somma = 0.0;
        int cnt = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i) {
            System.out.print("Inserire un numero: ");
            numero = input.nextDouble();
            if (numero == 0.0)
                continue;

            somma += numero;
            cnt++;
        }
        if (cnt != 0)
            System.out.println("Media = " + somma / cnt);

        input.close();
    }
}
