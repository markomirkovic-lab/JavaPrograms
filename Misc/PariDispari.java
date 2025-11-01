import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Scrivi un numero: ");

        //double numero = input.nextDouble();
        int numero = input.nextInt();

        input.close();

        if(numero % 2 == 0) {//if numero / 2
            System.out.print("il numero " + numero + " e' pari ");
        } else {
            System.out.print("il numero " + numero + " e' dispari ");
        }
    }
}
