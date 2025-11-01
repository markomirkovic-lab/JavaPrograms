import java.util.Scanner;

public class TriangoloRettangolo {

    private static double pitagora(double c1, double c2) {
        if (c1 <= 0 || c2 <= 0)
            return -1; 
         return Math.sqrt(c1 * c1 + c2 * c2);
    }

    private static double perimetro(double c1, double c2, double i) {
        return c1 + c2 + i;
    }

    private static double area(double b, double h) {
        return b * h / 2.;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserire i due cateti: ");
        double cat1 = input.nextDouble();
        double cat2 = input.nextDouble();
        input.close();

        double ipotenusa = pitagora(cat1, cat2);
        if (ipotenusa == -1) {
           System.out.println("Triangolo non valido!");
            return;
        }

        System.out.println("Ipotenusa: " + ipotenusa);
        System.out.println("Perimetro: " + perimetro(cat1, cat2, ipotenusa));
        System.out.println("Area: " + area(cat1, cat2));
    }
}
