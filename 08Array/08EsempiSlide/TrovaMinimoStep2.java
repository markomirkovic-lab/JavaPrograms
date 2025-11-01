import java.util.Scanner;

public class TrovaMinimoStep2 {
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

        int min;
        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5 && n1 < n6)
            min = n1;
        else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5 && n2 < n6)
            min = n2;
        else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5 && n3 < n6)
            min = n3;
        else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5 && n4 < n6)
            min = n4;
        else if (n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4 && n5 < n6)
            min = n5;
        else
            min = n6;
        System.out.println("Min: " + min);
    }
}
