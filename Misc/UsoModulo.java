/**
Esempio uso del operatore modulo %
usando un numero che viene dato dall'utente.
Se il numero e' pari da risultato 0 altrimenti 1.
*/
import java.util.Scanner;

public class UsoModulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un valore numerico intero: ");
        int userValue = input.nextInt();

        input.close();

        int b = 1;
        if (userValue % 2 == 0) {
        b = 0;
        }

        System.out.println("b = " + b);
    }

}
