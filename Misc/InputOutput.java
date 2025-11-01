import java.util.Scanner;

/**
 * Programma di esempio per le istruzioni di input e di output
 */
public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire una stringa ed un numero: ");
        String s = input.nextLine();
        int x = input.nextInt();

        System.out.println("La stringa é " + s);
        System.out.println("Il numero é " + x);

        input.close();
    }
}
