import java.util.Scanner;

public class NumeriAmiciBis {

    private static int sommaDivisoriPropri(int n) {

        int somma = 0;

        System.out.print("Divisori propri di " + n + ": ");
        for(int i = 1; i <= n/2; i++) {

            if(n % i == 0) {
                System.out.print(i + " ");
                somma += i;
            }
        }
        System.out.println();
        return somma;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero massimo: ");
        int max = input.nextInt();
        System.out.println();

        int a = 0;
        int b = 0;


        for(a = 1; a <= max; a++) {

            b = sommaDivisoriPropri(a);

            if( b > a && b <= max && sommaDivisoriPropri(b) == a) {
                System.out.println();
                System.out.println("I numeri " + a + " e " + b + " sono amici.");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("I numeri " + a + " e " + b + " sono amici.");
        System.out.println();

        input.close();
    }
}
