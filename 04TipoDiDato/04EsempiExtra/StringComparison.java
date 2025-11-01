import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = scanner.nextLine();

        scanner.close();

        System.out.println();
        System.out.print("Confronto usando '==': ");
        if (stringa1 == stringa2) { // controlla se le due variabili si riferiscono alla stessa zona di memoria
            System.out.println("Le stringhe sono UGUALI.");
        } else {
            System.out.println("Le stringhe sono DIVERSE.");
        }

        System.out.println();
        System.out.print("Confronto usando '.equals()': ");
        if (stringa1.equals(stringa2)) { // controlla le due stringhe basandosi sul contenuto della stringa
            System.out.println("Le stringhe sono UGUALI.");
        } else {
            System.out.println("Le stringhe sono DIVERSE.");
        }
    }
}