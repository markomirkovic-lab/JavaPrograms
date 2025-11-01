import java.util.Scanner;

public class TrovaMinimoStep3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserire sei valori: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        int n6 = input.nextInt();
        input.close();

        int min = n1;
        if (n2 < min)
            min = n2;
        if (n3 < min)
            min = n3;
        if (n4 < min)
            min = n4;
        if (n5 < min)
            min = n5;
        if (n6 < min)
            min = n6;
        System.out.println("Min: " + min);
    }
}
