import java.util.Scanner;

public class TrovaMinimoStep1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Inserire due valori: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        input.close();

        int min;
        if (n1 < n2)
            min = n1;
        else
            min = n2;
        System.out.println("Min: " + min);
    }
}
