import java.util.Scanner;

public class CiaoAmico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lettura del nome
        System.out.print("Ciao! Come ti chiami? ");
        String nome = input.nextLine();
        System.out.println("Ciao " + nome);

        // Lettura dell'età
        System.out.print("E quanti anni hai? ");
        int eta = input.nextInt();

        System.out.println("Ah, hai già " + eta + " anni!");
        input.close();
    }
}
