/*
10.4 Inversione
Scrivete un programma che chiede l’immissione di un numero intero e ne stampi uno con le 
cifre invertite, non potete utlizzare la String.
Es: se immetto 123 otterrò a video 321.
 */
import java.util.Scanner;

public class Es10_4_Inversione {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Scrivi un numero intero: ");
        long numero = input.nextLong();

        long numeroInverito = 0L;

        while(numero != 0) {

            long cifra = numero % 10;// ottengo ultima cifra
            
            numeroInverito = numeroInverito * 10 + cifra;// aggiungo la cifra invertita (ultima cifra)
            
            numero /= 10;// rimuovo l'ultima cifra dal numero (divsione int non da resto --> 0)

            //System.out.println("cifra: " + cifra);
            //System.out.println("numero inverito: " + numeroInverito);
            //System.out.println("numero: " + numero);

            /*

            Es. 67
            67 % 10 = 7
            0 * 10 + 7 = 7
            67 / 10 = 6
 
            6 % 10 = 6
            7 * 10 + 6 = 76
            6 / 10 = 0

            */
        }

        /*
        // numero % # = ultime cifre di #0
        // esempio: %1 = 0, %10 = ultima cifra, %100 = ultime 2 cifre, etc.
        System.out.println(123% 1);//0
        System.out.println((1234 % 1));//0
        System.out.println("--");
        System.out.println(123% 10);//3
        System.out.println((1234 % 10));//4
        System.out.println("--");
        System.out.println(123% 100);//23
        System.out.println((1234 % 100));//34
        System.out.println("--");
        System.out.println(123% 1000);//123
        System.out.println((1234 % 1000));//234
        System.out.println("--");
        System.out.println(123% 10000);//123
        System.out.println((1234 % 10000));//1234
        System.out.println("--");
        */

        System.out.println("numero invertito: " + numeroInverito);

        input.close();
    }
}
