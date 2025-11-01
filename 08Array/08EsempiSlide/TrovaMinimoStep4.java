import java.util.Scanner;

public class TrovaMinimoStep4 {
    public static void main(String[] args) {

        int[] n = new int[6];
        Scanner input = new Scanner(System.in);
        System.out.print("Inserire sei valori: ");

        for (int i = 0; i < n.length; i++)
            n[i] = input.nextInt();

        input.close();

        int min = n[0];
        for (int i = 1; i < n.length; i++)
            if (n[i] < min)
                min = n[i];
                
        System.out.println("Min: " + min);
    }
}
