import java.util.Scanner;

public class TriangoloRettangolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        double base = input.nextDouble();
        System.out.print("Altezza: ");
        double altezza = input.nextDouble();
        double area = base * altezza * .5;
        System.out.println("Area: " + area);
        input.close();
    }
}
