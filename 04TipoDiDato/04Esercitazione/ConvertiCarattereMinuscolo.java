import java.util.Scanner;

public class ConvertiCarattereMinuscolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un carattere tra 'A' e 'Z': ");
        char ch = scanner.nextLine().charAt(0);
        while (ch < 'A' || ch > 'Z') {
            System.out.print("Carattere non valido. Riprova: ");
            ch = scanner.nextLine().charAt(0);
        }
        scanner.close();

        char minuscolo = (char) (ch + ('a' - 'A'));
        System.out.println(ch + " --> " + minuscolo);
    }
}