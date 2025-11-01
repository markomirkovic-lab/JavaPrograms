import java.util.Scanner;

public class IstrCondConOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la durata: ");
        int anni = scanner.nextInt();
        System.out.print("Inserisci il valore: ");
        double valore = scanner.nextDouble();
        scanner.close();
        
        // Eseguito in ogni caso
        System.out.print("Il valore dell'investimento dopo ");
        if (anni == 0 || anni > 1) {
        System.out.print(anni + " anni");
        } else {
        // Gestisce il caso per 1 anno
        System.out.print("1 anno");
        }
        // Eseguito in ogni caso
        System.out.println(" è di " + valore + " CHF.");
    }
}
