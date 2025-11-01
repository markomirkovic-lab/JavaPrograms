import java.util.Scanner;

/**
 * Programma che calcola l'area di un rettangolo
 */
public class AreaRettangolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Base del rettangolo: ");
        double base = input.nextDouble();

        System.out.print("Altezza del rettangolo: ");
        double altezza = input.nextDouble();

        double area = base * altezza;

        System.out.println("L'area del rettangolo è: " + area);

        input.close();
    }
}
