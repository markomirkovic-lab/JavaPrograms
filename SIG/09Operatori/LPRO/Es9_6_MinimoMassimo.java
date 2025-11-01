/*
9.6 Massimo
Scrivete un programma che consente all’utente di inserire 3 numeri, stampando poi a video
il massimo fra i tre.
*/
import java.util.Scanner;

public class Es9_6_MinimoMassimo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int cnt = 0;
        int numero1;
        int numero2;
        int numero3;
        int massimo;
        int minimo;

        do {
            System.out.print("Inserisci un numero: ");
            numero1 = input.nextInt();
            input.nextLine();

            System.out.print("Inserisci un numero: ");
            numero2 = input.nextInt();
            input.nextLine();

            System.out.println("Inserisci un numero: ");
            numero3 = input.nextInt();
            input.nextLine();

            cnt++;

        } while(cnt < 1);

        massimo = numero1;
        minimo = numero1;

        if(massimo < numero2) {
            massimo = numero2;
        }
        if (massimo < numero3) {
            massimo = numero3;
        }

        if(minimo > numero2) {
            minimo = numero2;
        }
        if (minimo > numero3) {
            minimo = numero3;
        }

        System.out.println("I numeri sono: " + numero1 + " " + numero2 + " " + numero3);
        System.out.println("Il massimo e' " + massimo);
        System.out.println("Il minimo e' "+ minimo);
        
    }
    
}
