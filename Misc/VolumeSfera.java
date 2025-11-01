import java.util.Scanner;

public class VolumeSfera {
    public static void main(String[] args) {
        System.out.print("Inserire il raggio della sfera: ");
        Scanner input = new Scanner(System.in);
        double raggio = input.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raggio, 3.0);

        System.out.println("Il volume della sfera è: " + volume);

        input.close();
    }
}
